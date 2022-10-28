package practice;

/*
 * @author - Arnav Raviraj
 */
import java.io.*;

public class urinals {

	public static void main(String[] args) throws Exception {


		  BufferedReader fileData = urinalsFunctions.openFile();

	        String urinals = null;

	        while ((urinals = urinalsFunctions.getString(fileData, urinals)) != null) {
	        	urinalsFunctions.getCount(urinals);
	            
	    }
}


}
