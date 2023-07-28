package JDBC;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;
import java.util.Arrays;
public class Files {

	public static void main(String[] args) {


		 
		        // File path is passed as parameter
		        File file = new File("C:\\Users\\WIN10\\Desktop\\142_DBMS2.txt");
		        
		        int count=0,counter=0;
		        ArrayList<String> gfg = new ArrayList<String>();
		        ArrayList<String> gfg1 = new ArrayList<String>();
				 
		        // Creating an object of BufferedReader class
		        BufferedReader br = null;
				try {
					br = new BufferedReader(new FileReader(file));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		 
		        // Declaring a string variable
		        String st,s1;
		        // Condition holds true till
		        // there is character in a string
		        try {
					while ((st = br.readLine()) != null)

					    // Print the string
					{  s1=st;
					System.out.println("\n Statemenet -> '"+st+"'");
						String[] words=s1.split("\\s");//splits the string based on string
				        //using java foreach loop to print elements of string array
				        for(String w:words){
				        	counter=0;
				        	gfg1.add(w);
				        	
				        	if ( gfg.contains(w)) {
				        		for(String a:gfg1) {
				        			if(a.equals(w)) {
				        				counter++;
				        			}
				        		}
				        		System.out.println("\n"+w+" is repeated "+counter+" times\n");
				        	}
				        	else
				        	{
				        		gfg.add(w);
				        	}
				        count=count+1;
				        System.out.println("'"+w+"'");}
				        // commented part->gfg.size()+"* "+count+" "+
				        // Note:  Double backquote is to avoid compiler
				        // interpret words
				        // like \test as \t (ie. as a escape sequence)
						}
					if(count==0)
					{
						System.out.println("\nFile is Null...");
					}
					else {
						System.out.println("\nTotal Number of words:"+count);
						System.out.println("\nNumber of Unique words:"+gfg.size());
					}
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		}

}


