package org.jasig.cas.web.flow;


public class TwoTimeInterrupt implements InterruptHandler {
	
	static boolean next;

		public boolean shouldUserBeInterrupted(){
			
			if(next == false){
				
				next = true;
			
			
			}else if (next == true){
					
					next = false;
					
				}
			
			return next;

		}
		
		public String getInterruptPage(){
			
			String url = "https://localhost:8443/mywebapp/test1.jsp";
			
			return url;
			
		}
		
		
				
    
}