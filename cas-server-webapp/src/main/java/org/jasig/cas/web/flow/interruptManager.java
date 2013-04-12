import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;

/**
 *
 * @author Shawn Hott & Kendall Bates
 * @version 1.0 Alpha 3-4-13
 * @since 3.5.1
 */
 
 
public class interruptManager{

	
	public static void main(String argv[]){

				
  try {
 
	//User must specify where their deployerConfigContext.xml file sits
	File interruptManager = new File("/Users/hotts/Documents/CAS Home/cas-server-3.5.1/cas-server-webapp/src/main/webapp/WEB-INF/deployerConfigContext.xml");
	DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
	DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
	Document doc = dBuilder.parse(interruptManager);

	doc.getDocumentElement().normalize();
 
	NodeList nList = doc.getElementsByTagName("bean");
	int classIndex = 0;
	String[] classes = new String[20];
	
	
	for (int temp = 0; temp < nList.getLength(); temp++) {
					
		Node nNode = nList.item(temp);
		nNode.getChildNodes();
 		if (nNode.getNodeType() == Node.ELEMENT_NODE) {
 
			Element eElement = (Element) nNode;
			
			
			
			String x = eElement.getAttribute("class");
			x = x.toLowerCase();
			String y = "org.huntington.cas.interruptScreens.interruptManager.HandlerClass";
			y = y.toLowerCase();
			
		
			if(x.contains(y)){
				classes[classIndex] = x;
				setinterruptManager(classes[classIndex]);
								classIndex ++;
				}
 		
 		}
	}
	
		
    } catch (Exception e) {
	e.printStackTrace();
    }

  			  
 	}
	
	
	public static String getInterrupts(String x){

		x = x.substring(x.lastIndexOf('.') + 1);
		return x;
		
		}
	
	
	//From here down is some last minute testing code, trying to understand how to interact with the property of the interruptmanager bean in deployerconfig
	public interruptManager() {
		
	}

	public String getinterruptManager(String x) {
		return x;
	}

	public static String setinterruptManager(String x) {
		x = x.substring(x.lastIndexOf('.') + 1);
		return x;
	}
	
	
 
	    }
        
