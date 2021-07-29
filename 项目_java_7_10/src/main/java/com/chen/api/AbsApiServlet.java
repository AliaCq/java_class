package com.chen.api;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

public abstract class AbsApiServlet extends HttpServlet {
    public final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
        req.setCharacterEncoding("utf-8");
        Object result;
        try{
            result = new Object(){
                public final boolean success = true;
                public final Object data = doGetInternal(req,resp);
            };
        }catch (ApiException exc){
            result = new Object(){
                public final boolean success = false;
                public final String reason = exc.reason;
            };
        }catch (SQLException exc){
            result = new Object(){
                public final boolean success = false;
                public final String reason = exc.getMessage();
            };
        }

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
        writer.println(json);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        Object result;
        try{
            result = new Object(){
                public final boolean success = true;
                public final Object data = doPostInternal(req,resp);
            };
        }catch (ApiException exc){
            result = new Object(){
                public final boolean success = false;
                public final String reason = exc.reason;
            };
        }catch (SQLException exc){
            result = new Object(){
                public final boolean success = false;
                public final String reason = exc.getMessage();
            };
        }

        resp.setCharacterEncoding("utf-8");
        resp.setContentType("application/json");
        PrintWriter writer = resp.getWriter();
        String json = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(result);
        writer.println(json);
    }

    protected Object doGetInternal(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ApiException, IOException, ServletException{
        throw new ApiException(405,"不支持的Http方法");
    }

    protected Object doPostInternal(HttpServletRequest req, HttpServletResponse resp) throws SQLException, ApiException, IOException, ServletException {
        throw new ApiException(405,"不支持的Http方法");
    }

}
