package web;

import org.core.service.TestService;

public class TestServlet {
	private TestService testService;
	
	public void doGet(){
		testService.testMethod();
	}
}
