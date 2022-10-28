package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class urinalsFunctions {


	public static String getString(BufferedReader br, String urinals) throws IOException {
		 urinals= br.readLine();
		 return urinals;
	}

	public static void getCount(String urinals) {
		int count = 0;
		boolean validNum = true;
	
	  char[] num1 = new char[urinals.length()];
	
	  for (int i = 0; i < urinals.length(); i++) {
		num1[i] = urinals.charAt(i);
	  }
		for(int i=0;i<num1.length; i++){
		if(num1[i] == '0'){
			if((i== 0 && num1[i+1] != '1') || (i>0 && i<(num1.length-1) && num1[i-1] != '1' && num1[i+1] != '1') || (i == (num1.length - 1) && num1[i-1] != '1')){
		        num1[i] = '1';
		        count++;  
		    }
				
			}else {
				if ((num1[i] == '1') && (i<(num1.length-1) && num1[i+1] == '1')){
					validNum = false;
				}
		}
	  }
		
	  StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < num1.length; i++) {
		    sb.append(num1[i]);
		    
		}
		if(validNum == false) {
			System.out.println("-1");
	
		}else {
			System.out.println(count);
		}
	     // System.out.println(sb);
	}
	
	public static BufferedReader openFile() throws FileNotFoundException {
		File file = new File("C:/Users/Arnav Raviraj/Desktop/testing/urinal.dat");

	        BufferedReader br = new BufferedReader(new FileReader(file));
		return br;
	}
	
	Boolean goodString( String str ) {
		// checks to see if valid string 
		System.out.println ("Not yet implemented"); 
		return true; 
		}

	}