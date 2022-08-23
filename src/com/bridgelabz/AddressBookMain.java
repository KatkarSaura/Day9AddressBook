package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to address Book ");
        AddressBook addressBook = new AddressBook();


        addressBook.add();
//        System.out.println("_______________________________");
//        addressBook.add();
//
//        System.out.println(addressBook.contactList);
//
//           }



        System.out.println("Address Book data:");
        System.out.println(addressBook.contactList);

        System.out.println("Enter \"Y\" to edit ");
        String op = sc.nextLine();

        if(op.equals("y") || op.equals("Y")){
            addressBook.editContact();
            System.out.println("You have Entered following data");
            System.out.println(addressBook.contactList);
            System.out.println("Thank for Using Address book");
        }else {
            System.out.println("Thanks for using ");
        }
    }
}



