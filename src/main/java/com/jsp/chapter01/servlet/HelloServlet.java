package com.jsp.chapter01.servlet;

/*
    역할: HTTP 요청과 응답 데이터를 쉽게 처리할 수 있게 해주는 자바의 API
 */

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//WAS에게 해당 서블릿을 언제 사용할지 알려주는 코드
@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    //기본생성자

    public HelloServlet() {
        System.out.println("\n\n\n\n헬로 서블릿 객체가 생성됨!\n\n\n\n");
    }

    //실제로 개발자가 작성해야 하는 부분
    //실행시점: 클라이언트가 어떠한 요청을 했을 때 서버는 무엇을 해줄 것인가?
    @Override
    protected void service(
            HttpServletRequest req, HttpServletResponse resp
    ) throws ServletException, IOException {
        System.out.println("무슨일을 해볼깡");
    }
}
