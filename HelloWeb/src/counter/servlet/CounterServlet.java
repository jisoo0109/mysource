package counter.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CounterServlet extends HttpServlet{
	//사용자 방문 횟수를 저장할 instance 변수
	private int count;
	
	public void init() {
		//저장시킨 count값을 읽엉서 변수 count에 저장
	}
	
	public void destroy() {
		//변수 count값을 영구적으로 저장(파일, DB)
	}
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException{
		//1. 요청받기
		//2. 업무처리 - count를 증가
		count++;
		//3. 결과응답처리
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		out.println("<!doctype html>");
		out.println("<html><head><title>방문횟수</title></head>");
		out.println("<body>");
		out.printf("당신은 %d번째 방문자 입니다%n", count);
		out.println("</body></html>");
	
	}	
	

}
