/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author user
 */
public class TestHarness {
    
    
    public static void main(String[] args) {
        
/// Inventory constructor from the Inventory classt\

       Inventory invent1 = new Inventory();
       


       
       
       // Member variable that holds value number for each member number 
       int memberNumber = 1;
       
       //// Bookstore object 
       BookStore b1 = new BookStore();
       b1.setInventory(invent1);
       
      
       Customer c1; 
       
       
      
       boolean stop = false;
       boolean loggedIn = false;
       int index;
       Scanner sc = new Scanner(System.in);
      System.out.println("Do you have an customer account with us");
      String answer = sc.next();
      
       //// while loop that will loop until it is told to quit.
       while(stop == false ){

        
       
        // Compares the scanner input 
        if (answer.equalsIgnoreCase("yes"))
        {
            
            //B1 is empty at first 
            if (b1.getListCustomers().isEmpty())
            {
                System.out.println("No customers in system. Please create an account.");
                return;
            }
            System.out.println("What is your account number: ");
            int acctn = sc.nextInt();
            for(Customer c: b1.getListCustomers()){
                if (c.getMemberNumber() == acctn)
                {
                    System.out.println("Your account is found.");
                    loggedIn = true;
                }
    
        }
            
//        ask them if they have an customer acc1 if not create a new customer and store it in the bookstore arraylist. 
///If they say they do have an account search the bookstore arraylist for it.
/// If you cant find it ask them to make a new customer and store that in the bookstore array




}
        else{
            
            //
            System.out.println("Do you want to become a member");
            
            // Boolean Scanner choice  true or false response 
            boolean choice = sc.nextBoolean();
            
            if (choice == false)
            {
            
            }
            else
            {
                
            //Ask user for optional account number numerical value 
            
            System.out.println("What do you want your account number to be ");
            int number = sc.nextInt();
            System.out.println("What is your name ");
            String name = sc.next();
        
            
            //Customer object with parameters integer strings and boolean
            c1 = new Customer(name, choice,number);
            b1.addCustomer(c1);
            }
        }
        
        
        // see what the user wants to do
        //Menu
        
        System.out.println("Please select from the following menu of options, by typing a number:");
        System.out.println("\t 1. Get books");
        System.out.println("\t 2. Get cds");
        System.out.println("\t 3. Get dvds");
        System.out.println("\t 4. Register member");
        System.out.println("\t 5. Exit");
        
        
        
        //// integer variable is being stored after user selects an option
        int num = sc.nextInt();
       
        
        
        ////// depending on which case statements integer that is inputed, that case will run the code of block then break
        switch (num) {
        case 1:
            System.out.println("Welcome here are our books");
       
            
            ///Purchasing a Book Method used in Case1 
            b1.makeaBookPurchase();

        

            
            break;
            
        case 2:
            
         ///Purchasing Cds that are available in the Cd Purchase Method used in Case 2 
               System.out.println("Welcome here are our  cds ");
               
               b1.makeaCdsPurchase();
            break;
            
        case 3:
            
           // Purchases available cds 
        
            
           System.out.println("Welcome here are our  cds ");
           
           b1.makeaDvdsPurchase();
           
           
            break;
            
            
            ///// This case registers a member 
             case 4:
                 
                 System.out.println("What is your name ? ");
                 
                 String name1 = sc.next();
                 
                 System.out.println("Do you want an membership  Y/N" );
                 
                 String answer1 = sc.next();
                 
                 // equal method  comparing with
                 if (answer1.equals("Y")){
                     memberNumber++;
                     
                     // Customer object 
                    c1 = new Customer(name1, true, memberNumber);
                    b1.getListCustomers().add(c1);
                    
                    
                    System.out.println("You are now member number " + memberNumber);
                    System.out.println("You will be billed a monthly fee of 10$ ");
                    
                    
                    
                    
                 
                 }
                 
                 
                 
                 else if  (answer1.equals("N")){
                 
                 c1 = new Customer(name1, false, memberNumber);
                 
                
                 
             

                 }
                 
                 else {
                 
                 System.out.println("You entered a wrong choice");
                 
                 }
                 
                 
                 break;
                 
                 
                 //Quits program
             case 5:
                
                 stop = true;
                 
                
                 break;
  
        //// print welcome here are our books 
         ////// displays all books in the inventory booksArrays
        /////// give every books a index 
       ////// let the user chose a book purchase
            
      /////// option to esacpe to go out 
            
      /////// if purchased then delete the book from Array 
                 
 //////  creating global arraylist that save items to it right before it removes its
/////    case 1-3 
                 
////// case 5 print line this is want you purchase. iterate throught your arraylist and print what was purchased.
                 
            
        
        }
       
       
       
       
       }
       
       

    
    }
    
}
