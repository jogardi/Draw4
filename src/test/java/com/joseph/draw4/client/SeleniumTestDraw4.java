package com.joseph.draw4.client;

import junit.framework.TestCase;

import com.thoughtworks.selenium.DefaultSelenium;

public class SeleniumTestDraw4 extends TestCase {
	protected DefaultSelenium createSeleniumClient(String url) throws Exception {
        return new DefaultSelenium("localhost", 4444, "*firefox", url);
    }
	
	public void testSomethingSimple() throws Exception {
		 DefaultSelenium selenium = createSeleniumClient("http://localhost:8080/registerPlugin.html");
		 //selenium.start();
		 
		 //selenium.stop();
	}
}
