package com.myTwitter.filters;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by Grzesiek on 2018-10-07
 */
@WebFilter(filterName = "LoginFilter", value = "/tweet/*")
public class LoginFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) req;
        HttpServletResponse httpServletResponse = (HttpServletResponse) resp;
        HttpSession httpSession = httpServletRequest.getSession();

        if (httpSession.getAttribute("login") != null) {
            chain.doFilter(req, resp);
        }
        else {
            httpServletResponse.sendRedirect("/login");
        }
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
