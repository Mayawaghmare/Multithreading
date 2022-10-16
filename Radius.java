package com.jspiders.multithreading.client;
import java.io.*;
import java.net.*;
import java.util.Scanner;  


public class Radius 
{
	private DataOutputStream toServer;
	private DataInputStream fromServer;
	public static void main(String[] args) 
	{    
		new Radius();
	}
	public Radius() 
	{
		try
		{
      			Socket socket = new Socket("localhost", 8000);
      
			Scanner sc=new Scanner(System.in);  
			System.out.println("Please Enter radius");  
   			Double radius=sc.nextDouble();  
   			while(radius !=0)
			{
     	 			fromServer = new DataInputStream(
        			socket.getInputStream());

     	 			toServer =new DataOutputStream(socket.getOutputStream());
				toServer.writeDouble(radius);
        			toServer.flush();
				double area = fromServer.readDouble();

   				System.out.println("Please area of cirlce" + area);  
				System.out.println("Please Enter radius");  
    				radius=sc.nextDouble();
			}
	
		}
    		catch (IOException ex) 
		{
      			System.out.println(ex.toString() + '\n');
    		}
  	}
	
  
 }