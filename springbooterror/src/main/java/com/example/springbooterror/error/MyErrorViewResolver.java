package com.example.springbooterror.error;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class MyErrorViewResolver implements ErrorViewResolver {
    /**
     * 自定义Error页面，默认404、500、4xx、5xx.html
     * @param request
     * @param status
     * @param model
     * @return
     */
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        ModelAndView view = new ModelAndView("errorPage");
        view.addObject("custommsg", "出错了");
        view.addAllObjects(model);
        view.setViewName("errorPage");
        return view;
    }
}
