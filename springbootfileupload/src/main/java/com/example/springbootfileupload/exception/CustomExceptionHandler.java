package com.example.springbootfileupload.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 全局异常处理
 */
@ControllerAdvice
public class CustomExceptionHandler {

    /**
     * 上传文件大小超出限制：
     * @param exception
     * @param response
     */
    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public void uploadException(MaxUploadSizeExceededException exception, HttpServletResponse response) {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = null;
        try {
            writer = response.getWriter();
            writer.write("上传文件大小超出限制");
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writer.close();
        }
    }

    /**
     * 使用页面模板Thymeleaf处理异常显示视图
     * @param exception
     * @return
     */
//    @ExceptionHandler(MaxUploadSizeExceededException.class)
//    public ModelAndView uploadException2(MaxUploadSizeExceededException exception) {
//        ModelAndView view = new ModelAndView();
//        view.addObject("msg", "上传文件大小超出限制");
//        view.setViewName("error");
//        //创建error视图文件
//        return view;
//    }


}
