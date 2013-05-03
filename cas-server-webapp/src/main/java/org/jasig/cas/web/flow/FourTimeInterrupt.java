package org.jasig.cas.web.flow;


public class FourTimeInterrupt implements InterruptHandler {
	
	static boolean next;
	static int count;

		public boolean shouldUserBeInterrupted(){
			
			if(count%4 == 0){
				
				next = true;
			
			
			}else{
					count += 1;
					next = false;
					
				}
			
			return next;

		}
		
		public String getInterruptPage(){
			
			String url = "https://huntington.edu/";
			
			return url;
			
		}
		
		
				
    
}