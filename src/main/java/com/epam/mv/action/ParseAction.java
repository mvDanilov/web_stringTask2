package com.epam.mv.action;


import javax.servlet.http.HttpServletRequest ;

public class ParseAction implements Action{


    @Override
    public String execute(HttpServletRequest request) {

        return "/WEB-INF/result.jsp";
    }
}
