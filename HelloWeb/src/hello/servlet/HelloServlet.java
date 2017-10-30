package hello.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//사용자 요청을 받으면 간단한 인사말과 현재시간을 알려주는 서비스제공.
/*
 * 1. extends HttpServlet
 * 2. doGet() 메소드를 오버라이딩
 * 3. servlet 객체를 Web Container(톰켓-실행환경)에 등록
 * 	- web.xml 설정파일에 등록 ---> Deploynemt Descriptor 오른쪽 마우스 -> generate Deploynemt Descriptor stub
 * 	- Annotation을 이용해 등록
 */
public class HelloServlet extends HttpServlet{
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		String str = String.format("%tY-%<tm-%<td %<tH:%<tM:%<tS", new Date());
		
		//사용자에게 응답처리
		response.setContentType("text/html;charset=utf-8"); //응답 content-type설정 (=utf-8 띄어쓰기 X)
		PrintWriter out = response.getWriter(); //(웹브라우저 )사용자와 연결된 출력 Stream
		out.println("<!doctype html>");
		out.println("<html><head><title>인사</title></head>");
		out.println("<body>");
		out.printf("%s<br>현재일시 : %s%n", "안녕하세요.", str);
		out.println("</body></html>");
	}
}