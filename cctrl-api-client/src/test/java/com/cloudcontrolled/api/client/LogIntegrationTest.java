/**
 * 
 */
package com.cloudcontrolled.api.client;

import org.junit.Test;

import com.cloudcontrolled.api.model.Log;
import com.cloudcontrolled.api.request.LogRequest;
import com.cloudcontrolled.api.response.LogResponse;

public class LogIntegrationTest extends AbstractIntegrationTest  {

	private String applicationName = "djenkinsn";
	
	@Test
	public void testLog(){
		LogRequest request = new LogRequest();
		request.setApplicationName(applicationName);
		
		LogResponse response = client.send(request);
		Log[] logs =response.getLogs();
		
		if(logs!=null){
			for(Log log : logs){
				System.out.println(log.getTime()+"\t"+log.getType()+"\t"+log.getMessage());
			}
		}
	}
	
	@Test
	public void testAccurateLog(){
		LogRequest request = new LogRequest();
		request.setApplicationName(applicationName);
		request.setUnixTime("1353970000");
		
		LogResponse response = client.send(request);
		Log[] logs =response.getLogs();
		
		if(logs!=null){
			for(Log log : logs){
				System.out.println(log.getTime()+"\t"+log.getType()+"\t"+log.getMessage());
			}
		}
	}
	
}
