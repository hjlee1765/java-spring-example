package examples.boot.myshop.utils;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.security.auth.login.AppConfigurationEntry;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

public class LogInterceptor extends HandlerInterceptorAdapter {

    @Override   //서블릿이 controller를 실행하기 전에 preHandle 실행.
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        //request.setAttribute("startTime", System.nanoTime());
        LogContext.time.set(System.nanoTime());
        System.out.println("prehandle : " + handler);
        return true;
    }
    @Override //서블릿이 controller를 실행한 후에 postHandle 실행.
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        long endTime = System.nanoTime();
        long startTime = LogContext.time.get();
        System.out.println("postHandle : " + handler + ": " + (endTime - startTime));
    }
}
