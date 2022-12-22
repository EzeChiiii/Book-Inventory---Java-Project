/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Items {
    
    String name = "";
    String author = "";
    double priceItem = 0;
    
   
    /// Items constructor that have arguement passed which hold certain info about a future object that will be created

    public Items(String nameItem, String authorItem, double price){
        
        name = nameItem;
        author = authorItem;
        priceItem = price;
    }

//    Items(String harry_Potter, String james_Polk, String _Rich_Or_Die_Trying, String _Cent) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
    /**
     *
     * @return 
     */
    
    //// getter method that returns a string name value
   public String getName(){
   
       return name;
       
   }
   
    //// setter method that sets a string name value
   
     public void setName(String accName ){
    
        name = accName;
    
    }
   
    //// getter method that returns a string name value for the author 
   public String getAuthor(){
   
       return author;
       
   }
   
    //// setter method that sets  a string name value for the author
   
    public void setAuthor(String accAuthor ){
    
        name = accAuthor;
    
    }
    
    /// ToString Method prints out variables 
    
    public String toString(){
        return name + " by " + author + " cost $" + priceItem;   
    }
   

  
   
  
   
   
   
   
  
   
   
   
   
   
   
   
    
   ///// Try and catch blocks methods 
    Items() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    boolean size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void indexOf() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
    
    
}
    
    
    
    
    
    

