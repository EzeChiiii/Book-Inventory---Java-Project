/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList; 

/**
 *
 * @author user
 */
public class Inventory {
    
    
    //// Empty constructor
    public Inventory (){
    
    
    
    
    
    
    }
   
    ///// Three different array list  that have an Item class stored in it
    private ArrayList<Items> books = new ArrayList<Items>();
    private ArrayList<Items> dvd = new ArrayList<Items>();
    private ArrayList<Items> cds = new ArrayList<Items>();
    
    
    //// Method that adds different items depending on what string is passed in.
public void addItem(Items example, String type ){
    
    //// if statements check type arguement thats being passed in is equal to the string value
    if(type.equals("books")){
    
        books.add(example);

    }
    
    else if(type.equals("dvd")){
        
        dvd.add(example);

    }
    
    else if(type.equals("cd")){

        
        cds.add(example);

}
    
    else{
    
        System.out.println("You did not choose an correct item");
    
    
    
}
    
}
    
    /**
     *
     * @param example
     * @param type
     * 
     * 
     */

  //// Method that removes different items depending on what string is passed in.
    public void removeItem(int index, String type){
        int index1;
        
        //// if statements check type arguement thats being passed in is equal to the string value
        if(type.equals("books")){
    
//        index  = books.indexOf(example);


         books.remove(index);

    }
    //// if statements check type arguement thats being passed in is equal to the string value
    else if(type.equals("dvd")){
        
//        index1 = dvd.indexOf(example);
        dvd.remove(index);

    }
    //// if statements check type arguement thats being passed in is equal to the string value
    else if(type.equals("cd")){

        
//         index = cds.indexOf(example);
          cds.remove(index);

}
    
    else{
    
        System.out.println("You did not choose an correct item");
    
    
    
}
        
        
        
        
    
    
    
    
    
    
    }
  
    
    
    
   
    
   

//// method is calling a certain number of values and returning elements from the array.
public Items getBooks(int index)
{
    return books.get(index);
}

//// method is calling a certain number of values and returning elements from the array.
public Items getDvds(int index)
{
    return dvd.get(index);
}

//// method is calling a certain number of values and returning elements from the array.

public Items getCds(int index)
{
    return cds.get(index);
}


///// size method passes in a string arguement and inside the method it compares if the argument equal to a different strings inside the multiple if statements
    public int size(String type) {
       
              if (type.equals("books"))  {
              
                   /// calls the array list and method returns number of elements in the arraylist
                  return books.size();
              
              }
              
              else  if (type.equals("cds"))  {
              
                  /// calls the array list and method returns number of elements in the arraylist
                  return cds.size();
              
              }
              
              else if (type.equals("dvds"))  {
              
                  /// calls the array list and method returns number of elements in the arraylist
                  return dvd.size();
              
              }
              
              return 0;


    }




}
   
    
    
    
    
    
    
    
     
 

