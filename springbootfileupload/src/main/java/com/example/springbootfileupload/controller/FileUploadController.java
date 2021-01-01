package com.example.springbootfileupload.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class FileUploadController {

    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

    /**
     * 单文件上传
     * @param uploadFile
     * @param request
     * @return String
     */
    @PostMapping("/upload")
    public String upload(MultipartFile uploadFile, HttpServletRequest request) {
        String realPath = request.getSession().getServletContext().getRealPath("/uploadFile/");
        String date = sdf.format(new Date());
        File folder = new File(realPath + date);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String oldName = uploadFile.getOriginalFilename();
        String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());

        try {
            uploadFile.transferTo(new File(folder, newName));
            System.out.println(folder+newName);
            String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/uploadFile/" + date + newName;
            return filePath;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "上传失败";
    }

    /**
     * 多文件上传
     * @param uploadFiles
     * @param request
     * @return List
     */
    @PostMapping("/uploads")
    public List<String> uploads(@RequestParam("filename") MultipartFile[] uploadFiles, HttpServletRequest request) {
        if (uploadFiles == null) {
            return null;
        }

        List<String> paths = new ArrayList<String>();
        String realPath = request.getSession().getServletContext().getRealPath("/uploadFile/");
        String date = sdf.format(new Date());
        File folder = new File(realPath + date);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        for (MultipartFile uploadFile : uploadFiles) {
            String oldName = uploadFile.getOriginalFilename();
            String newName = UUID.randomUUID().toString() + oldName.substring(oldName.lastIndexOf("."), oldName.length());

            try {
                uploadFile.transferTo(new File(folder, newName));
                System.out.println(folder + newName);
                String filePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + "/uploadFile/" + date + newName;
                paths.add(filePath);
            } catch (IOException e) {
                e.printStackTrace();
                paths.add("上传失败");
                return paths;
            }
        }
        return paths;
    }
}
