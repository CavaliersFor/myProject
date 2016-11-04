package web2;

import org.core.service.TestService;

public class TestController {
	private TestService testService;
	
	public void doGet(){
		testService.testMethod();
	}
}
