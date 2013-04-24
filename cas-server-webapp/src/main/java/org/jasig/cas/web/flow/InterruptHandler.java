package org.jasig.cas.web.flow;
import java.util.List;

public interface InterruptHandler{
	
	public boolean shouldUserBeInterrupted();
	
	public String getInterruptPage();
	
}