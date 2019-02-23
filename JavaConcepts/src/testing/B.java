package testing;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class B {

	public static void main(String[] args) throws IOException {
		
	  File f = new File("E:/T24.txt");  // Connection
	  FileReader fr= new FileReader(f);
	  BufferedReader br= new BufferedReader(fr);
      String z= br.readLine();
      while(z!=null)
	  {
    	 if(z.contains("user"))
		 {
			 System.out.println(z);
		 }
		 z=br.readLine();
	  }
	 
	  
	  
	  
	}
	
	
}
