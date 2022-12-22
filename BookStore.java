/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author user
 */

import java.util.ArrayList; 
import java.util.Scanner;



public class BookStore {
    
    //// created an arraylist inside is a Customer class object
     private ArrayList<Customer> listOfCustomers;
     
// Object
     private Inventory invent1;
     
// Variables 
     
     private int booksTotal = 50;
     private int cdsTotal = 50;
     private int dvdsTotal = 50;

     
// Get and Set Methods for Cds Dvds and Books 
     
    public int getBooksTotal() {
        return booksTotal;
    }

    public void setBooksTotal(int booksTotal) {
        this.booksTotal = booksTotal;
    }

    public int getCdsTotal() {
        return cdsTotal;
    }

    public void setCdsTotal(int cdsTotal) {
        this.cdsTotal = cdsTotal;
    }

    public int getDvdsTotal() {
        return dvdsTotal;
    }

    public void setDvdsTotal(int dvdsTotal) {
        this.dvdsTotal = dvdsTotal;
    }
     
     

     
     
    //// Bookstore constructor 
     
     public BookStore(){
         

         
         listOfCustomers = new ArrayList<Customer>();
         invent1 = new Inventory();
     
     }
     
     
    ///// created a arraylist method to return the elements inside tghe given arraylist 
     public  ArrayList <Customer> getListCustomers(){
     
        return listOfCustomers;
     
     }
     
     public void addCustomer(Customer c){
         
         listOfCustomers.add(c);

     }
     
     
     public Inventory getInventory(){

        return invent1;
     
     }
     
     public void setInventory(Inventory exampleInvent1){

         invent1 = exampleInvent1;

     }
     
     
     public void makeaBookPurchase(){
     
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("We have " + booksTotal + " amount of books");
                
        System.out.println("How many books do you want to purchase ");

            
            int userBooks = sc.nextInt();
            
            //The if statements below makes the user pick a number in between 0 and 50
            if(userBooks < 0){
                
                
                System.out.println("Error, select a correct number of books");
                
               
            }
            
            
            
              if(userBooks > booksTotal ){
                
                System.out.println("We dont have those amount of books ");
               
                return;
          
            }
              
              
             if(userBooks >= 0 && userBooks <= booksTotal){
                 
                 
                 
                        booksTotal = booksTotal - userBooks;
                        System.out.println("Thanks for buying books.");
             
             } 
            
            
            
            
            
            for (Customer c: listOfCustomers)
            {
                c.setBooksBought(userBooks);
            }
            
            
      
            
            
           
            
     }
     
     
     
            
    /**
     *
     */
    public void makeaCdsPurchase(){
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("We have " + cdsTotal + " amount of cds");
        
        System.out.println("How many cds do you want to purchase ");
        
            int userCds = sc.nextInt();
            // decreasing the inventory in the store
            if(userCds < 0){
                
                
                System.out.println("Error, select a correct number of books");
                
               
            }
            
            
            
              if(userCds > booksTotal ){
                
                System.out.println("We dont have those amount of books ");
               
                return;
          
            }
              
              
             if(userCds >= 0 && userCds <= cdsTotal){
                 
                 
                 
                        cdsTotal = cdsTotal - userCds;
                        System.out.println("Thanks for buying books.");
             
             } 
            
            
            
            
              
              
            
            // setting how many books the customer bought
            for (Customer c: listOfCustomers)
            {
                c.setCdsBought (userCds);
            }
            
       }
    
    
    public void makeaDvdsPurchase(){
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("We have " + dvdsTotal + " amount of dvds");
        
        System.out.println("How many dvds do you want to purchase ");
        
            int userDvds = sc.nextInt();
            // decreasing the inventory in the store
            
             if(userDvds < 0){
                
                
                System.out.println("Error, select a correct number of books");
                
               
            }
            
            
            
              if(userDvds > dvdsTotal ){
                
                System.out.println("We dont have those amount of books ");
               
                return;
          
            }
              
              
             if(userDvds >= 0 && userDvds <= dvdsTotal){
                 
                 
                 
                        dvdsTotal = dvdsTotal - userDvds;
                        System.out.println("Thanks for buying books.");
             
             } 
            
            
            
            
            dvdsTotal= dvdsTotal-userDvds;
            
            // setting how many books the customer bought
            for (Customer c: listOfCustomers)
            {
                c.setDvdBought(userDvds);
            }
            
            
            
       }
            
            
            
        
     
     
     
         
     
     
     
     
     }
     
     
     
     
      
      
      

 

    
     
    

