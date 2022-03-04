package com.handlinglargeobject;

import java.io.IOException;
import java.sql.SQLException;
import java.util.Scanner;

public class MainOptionMenu {
	    
	public static void main(String[] args) throws SQLException, IOException {
		Scanner in = new Scanner(System.in);

		while (true) {

			System.out.println("1\t Store Images in File");
			System.out.println("2\t Retrieve Images From file");
			System.out.println("3\t Store text in File");
			System.out.println("4\t Retrieve text From file");
			

			System.out.println("Please enter your choice:");
			// Get user's choice
			int choice = in.nextInt();
         BinaryLargeObject st = new   BinaryLargeObject();
         CharacterLargeObject s1 = new CharacterLargeObject();
			// Display the title of the chosen module
			switch (choice) {
			case 1:
				int result = st.StoreImage(getinput(in,choice));
				if (result != 0) {
					System.out.println("Store image successfully.");
				}
				break;

			case 2:
				    st.RetreiveImage(getinput(in,choice));
					System.out.println("Retrieved Image successfully.");
				
				break;
			case 3:
				int re1 = s1.StoreFile(getinput(in,choice));
				if (re1 != 0) {
					System.out.println("Store Text successfully.");
				}
				break;
			case 4:
			    s1.RetreiveFile(getinput(in,choice));
				System.out.println("Retrieved Text successfully.");
			
			break;
			default:
				System.out.println("Invalid choice");
			}// end of switch
		} // end of the main method
	}

	private static Student getinput(Scanner in, int choice) {
		   System.out.println("Enter your ID :");
		   int id = in.nextInt();
		   String name = null;
		   String image = null;
		   String form = null;
		   String Article = null;
		   if(choice==1 || choice==3)
		   {
			    System.out.println("Enter your Name :");
		        name = in.next();
		   }else if(choice==1) {
		        System.out.println("Give Your Profile Pic Name :");
			    image = in.next();
			    form = "E:\\JDBC\\StoreImgBLOB\\"+image+".png";
		   }else if(choice==2) {
			   System.out.println("Give Your Profile Pic Name :");
			    image = in.next();
				  form = "E:\\JDBC\\RetrieveImgBLOB\\"+image+".png"; 
		 } 
		   if(choice==3) {
			   System.out.println("Write your Article Name :");
			   Article = in.next();
			      form= "E:\\JDBC\\StoreFileCLOB\\"+Article+".pdf";
			   }
			   else if(choice==4) {
				   System.out.println("Write your Article Name :");
				   Article = in.next();
				  form = "E:\\JDBC\\RetrieveFileCLOB\\"+Article+".pdf"; 
			   } 
		   
		   Student s= new Student(id,name,form,Article);
		return s;
	}
	}
