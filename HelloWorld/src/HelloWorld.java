
/**
 * @author Tobias
 *
 */
//use java.io to read String from console
import java.io.*;
public class HelloWorld {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Hello ASE2015 - how are you? :)");
		System.out.print("Please enter your name: ");
		try{
			HelloUser.userName = in.readLine();
		}
		catch(Exception e) {	
		}
		
		HelloUser.greetUser();
	}

}