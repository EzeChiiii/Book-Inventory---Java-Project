/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*c
 *
 * @author user
 */
public class Customer {
    
    String memberName = "";
    boolean hasPremium = false;

    boolean membershipPaid = false;
    private int memberNumber;
    int booksBought;
    int cdsBought;
    int dvdsBought;

    public int getMemberNumber() {
        return memberNumber;
    }

    public void setMemberNumber(int memberNumber) {
        this.memberNumber = memberNumber;
    }
    
    
   
   /// Customer constructor passing in different characteristics of a customer
  public Customer(String customerName, boolean premiumPack, int numb){ 
      
      memberName = customerName;
      hasPremium = premiumPack;
      memberNumber = numb;

  }
  
  /// Method that is calling the amount of books being bought
  public int getBooksBought()
  {
      return booksBought;
  }
  
  /// Method that is setting the books being bought
  
  public void setBooksBought(int bookCount)
  {
      booksBought += bookCount;
  }
  
  /// incrementing books being bought 
  
  public void incrementBooksBought(){
  
  
      booksBought++;
  
  
  
  }




    
  /// Method that is calling the amount of cds being bought
  
   public int getCdsBought()
  {
      return cdsBought;
  }
   
   /// Method that is setting a value of cds being bought
   
     public void setCdsBought(int cdsCount)
  {
     cdsBought += cdsCount;
  }
     
       /// incrementing cds being bought 
     
       public void incrementCdsBought(){
  
  
      cdsBought++;
  
  
  
  }
       
    /// Method that is calling the amount of cds being bought
   
   
    public int getDvdBought()
  {
      return dvdsBought;
  }
    
     /// Method that is setting a value cds being bought
    
    
    public void setDvdBought(int dvdCount)
  {
      dvdsBought += dvdCount;
  }
       /// incrementing cds being bought
    
      public void incrementDvdBought(){
  
  
        dvdsBought++;
  
  
  
  }
      
      
      
      ////// create a profile for customer 
  
 




}
  
  
  
    

  
    
    
    
    

