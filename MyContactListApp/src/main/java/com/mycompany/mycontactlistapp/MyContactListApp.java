/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mycontactlistapp;

import java.util.ArrayList;
import java.util.Scanner;

public class MyContactListApp {

  /* 
    Menu
    Create new contact
    view all contact
    search contact
    delete contact
    Exit
    Enter your Choice:
    */
    
    /////This is the main method/////
    public static void main(String[]args){
        
        //////Contcat list Object////
        ContactList contactlist = new ContactList();
        
        Scanner scanner=new Scanner(System.in); ////input newar jonno///
        int menuItemNumber=0;
       
      
       // menuItemNumber =scanner.nextInt(); ////number taa enter kora
        //System.out.println("You have selected...");
        
        do{   ///do while nilam cz nurnototo 1 bar holaw input nibe
        menuView();
        menuItemNumber =scanner.nextInt(); ////number taa enter or input number ar jonno
        //System.out.println("You have selected..." + menuItemNumber);
        
        switch(menuItemNumber){        ////menuitemNumber taa filter korar jonno only 0,1,2,3,4,5 nibe not 34, 56 something
            
            case 1:
             Contact contact = createNewContact(scanner);
             contactlist.createContact(contact);
             System.out.println("Successfully Created....");
             System.out.println("");
             break;
            
            case 2:
                showAllContacts(contactlist.getContacts());
                break;
            
            case 3:
                searchList(contactlist , scanner);
                break;
                
            case 4: 
                deleteContact(contactlist, scanner);
                break;
                        
            case 5:
              System.exit(0);
              break; 
           default:
                System.out.println("Select A Number between 1 and 5....");
                break;
         
        }
        
        }
        while(menuItemNumber != 5);
    }

    private static void menuView(){
    
        System.out.println(String.format("%5s%2s%s","1.","","Create New Contact" ));    ///% &10taa space newar jonno string.format newa//
        System.out.println(String.format("%5s%2s%s","2.","","View All Contact" ));    ///% &10taa space newar jonno string.format newa//
        System.out.println(String.format("%5s%2s%s","3.","","Search Contact" ));    ///% &10taa space newar jonno string.format newa//
        System.out.println(String.format("%5s%2s%s","4.","","Delete Contact" ));    ///% &10taa space newar jonno string.format newa//
        System.out.println(String.format("%5s%2s%s","5.","","Exit" ));    ///% &10taa space newar jonno string.format newa//
        System.out.println("----------------------------");
        System.out.println("  Enter Your Choice: ");   ///aikhane new line create hoiye space hobe naa///
    
}
    /////view menu method
    
    //get input from user and create a new contact
    
    private static Contact createNewContact(Scanner scanner){   
        String name, email,phone;
        Contact contact;
        
        scanner.nextLine(); //////int call korar por jate next line jai poroborti next a naa giye
        
        System.out.println("Fill The Below Form Correctly");
        
        System.out.print("Enter Name* : ");
        name = scanner.nextLine();
        
        System.out.print("Enter Phone No* : ");
        phone = scanner.nextLine();
        
        System.out.print("Enter Email(Type N if not Avaiable) : ");
        email = scanner.nextLine();
        
        if(email.equalsIgnoreCase("n")){
            contact = new Contact(name, phone);
        }
        else{
            contact = new Contact(name, phone, email);
        }
        
        return contact;
    }
    
    /////show all contact method////
    private static void showAllContacts(ArrayList<Contact>contacts){
        System.out.println("All Contacts.....");
        System.out.println("--------------------------");
        
        int i=0;
        for(Contact contact :contacts){
            String email =contact.getEmail(); ///email ar variable banailam
            System.out.println(String.format("%-5d%-20s%-15s%-50s",i++,contact.getName(),contact.getPhoneNo(),email == null ? "N/A": email));
                                                                                                  ////ternary operator : condition true hoi tobe N/A noyto email////
        }
        System.out.println("--------------------------");
    }
    
    ///////search list method//////
    private static void searchList(ContactList contactlist , Scanner scanner){
        scanner.nextLine();
        
        System.out.print("Enter Name to Search: ");
        String name =scanner.nextLine();   /////scanner theke name taa find korlam
        
        Contact contact = contactlist.searchContact(name);  ///name find kore check korlam contact list a
        
        if(contact != null){
             String email =contact.getEmail(); 
            System.out.println(String.format("%-20s%-15s%-50s",contact.getName(),contact.getPhoneNo(),email == null ? "N/A": email));

        }
        else{
            System.out.println("Contact not found......");
        }
    
    }
    
    //////////Delete contact method////////
    private static void deleteContact(ContactList contactlist, Scanner scanner){
        showAllContacts(contactlist.getContacts());
        System.out.println("Enter Index No: ");
        int index = scanner.nextInt();
        
        contactlist.removeContact(index);
        System.out.println("Successfully removed....");
    }
}

