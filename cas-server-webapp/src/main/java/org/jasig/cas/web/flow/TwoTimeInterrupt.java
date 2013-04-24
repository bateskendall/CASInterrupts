package org.jasig.cas.web.flow;


public class TwoTimeInterrupt implements InterruptHandler {
	
	static boolean next;
	
		public boolean shouldUserBeInterrupted(){
			
			if(next == true){
			
				next = false;
			
			}else{
					
					next = true;
				}
			
			return next;
						
		}
		
		
		public String getInterruptPage(){
			
			String url = "http://www.huntington.edu/";
			
			return url;
			
		}
		
		
				
    
}