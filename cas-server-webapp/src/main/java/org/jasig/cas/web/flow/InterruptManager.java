package org.jasig.cas.web.flow;

/**
 *
 * @author Shawn Hott & Kendall Bates
 * @version 1.0 Alpha 3-4-13
 * @since 3.5.1
 */
 

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;
 
public final class InterruptManager extends AbstractAction {


    
    private List<InterruptHandler> interruptHandlers = new ArrayList<InterruptHandler>();




    public void setInterruptHandlers(final List<InterruptHandler> interruptHandlers) {

        this.interruptHandlers = interruptHandlers;

    }


    
    protected Event doExecute(final RequestContext context){
         
         //Event e = result("");
         
         for(InterruptHandler interruptHandler : interruptHandlers){
                 
                           
                 if (interruptHandler.shouldUserBeInterrupted()){
                         
                                                 
                         context.getRequestScope().put("interruptScreenPage", interruptHandler.getInterruptPage());
                         return result("interrupt");
                         //e = result("interrupt");
                                                 
                         
                 }else{
                         
                         
                         //e = result("continue");
                       return result("continue");
                         
                 }
                         
         }
            
         //return e;
                 return result("continue");        
                 
         }
       

}