package client;

import java.util.Scanner;

public class App {

	public static void main(String[] args){
		Client client = new Client();
		
	}
	
	private void directClient(){
		Scanner sc = new Scanner(System.in);
		
		String choice="";
		while((choice = sc.next().toLowerCase())!="exit"){
			
		}
		
		sc.close();
	}
}
