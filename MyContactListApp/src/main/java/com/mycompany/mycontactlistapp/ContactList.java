/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycontactlistapp;


import java.util.ArrayList;

public class ContactList {
    
   /// Contact[] contact = new Contact[100];  /////array te limitatiom memory create kore or size bole dile hoi///
    
    ////array list hochee array r motoi data structure .....ate joto datai dewa hok implement korte or dhore rahte pare////
    
    ///create array list///
    
   private ArrayList <Contact> contacts; ///generisk angle bracket diye data type bole deya
    
    public ContactList(){ /////jokhoni contact list ar obj create hobe tokhoni contact taa create hobe
        contacts = new ArrayList<>();
    }
    
    public void createContact(Contact contact){
        contacts.add(contact);
    }

    //////koto gulo contact ache store hoye count korbe///////
    
    public int getTotalContact(){
        return contacts.size();
    }
    
    //////create delete or remove contact method////
    public void removeContact(int index){
        contacts.remove(index);
    }
    
    
    ///create search method object return korbe///
    public Contact searchContact(String name){ 
    for(Contact c: contacts){
        if(c.getName().equalsIgnoreCase(name)){
            return c;
    }
    }   
    
    return null;
    }   
    
    /////view method .....list return......Contact r arraylist//////
    
    public ArrayList<Contact> getContacts(){
        return contacts;
    }
    
    
    @Override
    public String toString() {
        return "ContactList{" + "contacts=" + contacts + '}';
    }
    
    
}
