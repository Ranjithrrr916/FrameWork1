package GenericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains reusable methods related to actions/operations performed on Properties file
 * @author DELL
 *
 */
public class PropertiesFileUtility
{
   private Properties property;
   /**
    * This method is used to initialize Properties file
    * @param filepath
    */

public void propertyFileInitialization(String filepath )
   {
	    
	   FileInputStream fis=null;						//if we give Exception it will propagate 
	try
	  {                                                   //thats why we use try catch block not to propagate 
		 fis =new FileInputStream(filepath);
	  } 
	catch (FileNotFoundException e)
	  {	
		e.printStackTrace();
	  }
	
	    property=new Properties();
	   
	 try 
	    {
			property.load(fis);
		} 
	 catch (IOException e) 
	    {
			e.printStackTrace();
		}
   }
/**
 * This method is used to fetch the data from properties file based on key password
 * @param key
 * @return
 */
	    
	    public String fetchProperty(String key) 
	    {
	    	return property.getProperty(key);
	   }
  }

