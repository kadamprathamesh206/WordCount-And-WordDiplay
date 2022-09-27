package in.sts.sts_project.input;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;
import org.apache.log4j.Logger;


public class FileInput {
	final Logger log=Logger.getLogger(FileInput.class);              //Creating Logger Object For Displaying the log

	static Scanner  scanner=new Scanner(System.in);                  //Creating Scanner class for taking input from user
	public String performFunction() {                                //Creating performFunction method for taking which opeartion user wants to perform       
		
		System.out.println("Enter 1 for wordCount of File");        
		System.out.println("Enter 2 for wordDisplay of File");
		String Input=scanner.nextLine();
		System.out.println("");

		return Input;

	}
	public  String getWordCountInput() {                            //Creating getWordcountInput method for  wordCount Input 
		//Creating Scanner class for taking input from user
		System.out.println("Enter 1 for Read only one file in drive");
		System.out.println("Enter 2 for Read all the files in drive");
		System.out.println("Enter the operation you want tro perform");
		String operation=scanner.nextLine();
		System.out.println("");

		return operation;
	}

	public String getWordDisplayInput() {                         //Creating getWordDisplayInput for taking the worddisplay Input
		System.out.println("Enter 1 for Display word from one file");
		System.out.println("Enter 2 for Display word from all the files");
		System.out.println("Enter the operation you want to perform");
		String operation=scanner.nextLine();
		return operation;

	}



	public static String getSingleFileInput() {                   //Creating getSingleFileInput for taking the one file as Input 
		String path=null;
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the drive name");
		String Drive=scanner.nextLine();
		System.out.println("Enter the file name");
		String file=scanner.nextLine();
		path=""+Drive+":\\"+file+".txt";
		scanner.close();
		return path;
	} 

	public static String getMultipleFileInput() {                //Creating getMultipleFileInput for taking the drive from user
 
		@SuppressWarnings("resource")
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the drive name ");
		String Drive=scanner.nextLine();
		String path=""+Drive+":\\";
		scanner.close();
		return path;


	}
	
	public static void txtFileDisplay(ArrayList<String> words) {            //creating txtFileDisplay method for for storing the words into another txtfile
		try{    
			FileWriter f=new FileWriter("E:\\file.txt");
			BufferedWriter fw=new BufferedWriter(f);
			int count=1;
			
			for(String word:words) {
				fw.write("word"+count+" = "+word);
				fw.newLine();
				count++;

			}
			

			fw.close();    
		}catch(Exception e){

			System.out.println(e);

		}    
		System.out.println("Success...");    
	}    
	

	


}