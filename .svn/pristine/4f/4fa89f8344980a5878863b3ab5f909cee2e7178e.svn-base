package cn.opt.exception;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

public class CustomException implements HandlerExceptionResolver {
  public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object obj, Exception ex){
    ModelAndView modelAndView = new ModelAndView();
    if (ex instanceof MessageException) {
      MessageException me = (MessageException)ex;
      modelAndView.addObject("error", me.getMsg());
    } else {
      modelAndView.addObject("error", "哇撒，报错了");
    }
    modelAndView.setViewName("error");
    return modelAndView;
  }
}