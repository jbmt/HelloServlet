package test.servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

public class HelloServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private static Logger log = Logger.getLogger(HelloServlet.class);
	public HelloServlet() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response){
		doPost(request, response);
	}
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response){
		log.setLevel(Level.ALL);
		log.debug("remote host:" + request.getRemoteHost() + request.getRemotePort());
		log.debug("session create time:" + request.getSession().getCreationTime());
		System.out.println("remote host:" + request.getRemoteHost() + request.getRemotePort());
		System.out.println("session create time:" + request.getSession().getCreationTime());
		try {
			PrintWriter pw = response.getWriter();
			pw.write("<html><body>hello!</body></html>");
			pw.flush();
			pw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void main(String[] args) throws Exception{
		FileInputStream file = new FileInputStream("c:\\somfile.file");
		FileChannel fc = file.getChannel();
		ByteBuffer bf = ByteBuffer.allocate(100);
//		bf.f
	}
}
