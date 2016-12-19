package com.log4j;

import org.apache.log4j.Logger;

public class Log4jTest {
	
	private Logger logger=Logger.getLogger(Log4jTest.class.getName());

	public static void main(String[] args) {
		
		new Log4jTest().test();
	}
	
	public void test(){
		
		logger.info("message.....");
		
	}
}
