/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csvutil;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author kiit1
 */
public class csvRead {
    public static Object readCSV(String path)  {
        ArrayList header = new ArrayList();
        ArrayList headerValueList = new ArrayList();
        ArrayList CSVObject = new ArrayList();
        BufferedReader reader;
//        
       
//        
		try {
			reader = new BufferedReader(new FileReader(path));
			String line = reader.readLine();
                        System.out.println(line);
                        System.out.println((line.split(",")).length);
                        String headersString[] = line.split(",");
                        
                        for(String headerName:headersString){
                           // System.out.println(headerName);
                            header.add(headerName);
                        }                        
			while (line != null) {
				
				// read next line
                            try{
				line = reader.readLine();
                                ArrayList headerValue = new ArrayList();
                                String variableString[] = line.split(",");
                                for(String variableValue:variableString){
                                  //System.out.println(variableValue);
                                    if(isNumeric(variableValue)){
                                        headerValue.add(Double.parseDouble(variableValue));
                                    }
                                    else{
                                        headerValue.add(variableValue);
                                    }
                                 }
                                headerValueList.add(headerValue);
                            }catch(Exception e){
                                System.out.println("error");
                            }
			}
                        System.out.println(headerValueList.size());
			reader.close();
		} catch (IOException e) {
		}
                CSVObject.add(header);
                CSVObject.add(headerValueList);
                return CSVObject;
   }
 public static boolean isNumeric(String str)  
{  
  try  
  {  
    double d = Double.parseDouble(str);  
  }  
  catch(NumberFormatException nfe)  
  {  
    return false;  
  }  
  return true;  
}
}
