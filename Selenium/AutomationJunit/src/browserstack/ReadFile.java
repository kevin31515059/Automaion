package browserstack;

import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files


public class ReadFile {

	String userName;
	String password;
	Scanner myReader;
	
	
	
	public String readUserName(){
		try{
			File myObj_userName = new File("C:\\Users\\user\\Credentials\\userName.txt");
			myReader = new Scanner(myObj_userName);
				while (myReader.hasNextLine()) {
				userName = myReader.nextLine();
				}
				myReader.close();
		} catch(FileNotFoundException e){
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		}
		return userName;
	}
	

	public String readPassword(){
		try{
			File myObj_password = new File("C:\\Users\\user\\Credentials\\password.txt");
			myReader = new Scanner(myObj_password);
					while (myReader.hasNextLine()) {
					password = myReader.nextLine();
	
					}
					myReader.close();
			} catch (FileNotFoundException e){
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			}
		return password;
	}


}
