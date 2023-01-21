/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mycontactlistapp;


public class Contact {
 ////////all properties////
    private String name;
    private String PhoneNo;
    private String email;
    
    //////create constructor//////
    public Contact(String name, String PhoneNo){
        this.name=name;
        this.PhoneNo=PhoneNo;
        this.email=null;
    }
    
    public Contact( String name, String PhoneNo, String email){
        this.name=name;
        this.PhoneNo=PhoneNo;
        this.email=email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String PhoneNo) {
        this.PhoneNo = PhoneNo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //////tosting method or override method jekhan theke name,email, phone.no dekha jabe///

    @Override
    public String toString() {
        return "Contact{" + "name=" + name + ", PhoneNo=" + PhoneNo + ", email=" + email + '}';
    }
                 
   
}


