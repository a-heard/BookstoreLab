import java.util.*;

public class Bookstore{

    public String Name;
    public String Address;
    public int SqFt;
    public boolean Books;
    public int Hrs;
    public int Close;
    
    

    public Bookstore(String name, String address) {
        this.Name = name;
        this.Address = address;
        this.SqFt = 2500;
        this.Books = true;
        this.Hrs = 7;
        this.Close = 9;
        
        
    }
    
    public String getName() {System.out.println("Welcome to" + " " + Name); return Name;}
    public void setName(String name) {this.Name = name;}

   
    public String getAddress() {System.out.println("We are located at" + " " + Address); return Address;} 
    public void setAddress(String address) {this.Address = address;}


    public int getSqFt() {System.out.println("Our store is" + " "  + SqFt + " " + "sqft"); return SqFt;}
    public void setSqFt(int squareFeet) {this.SqFt = squareFeet;}

    public boolean getBooks(){System.out.println("Do we sell new books? : " + Books); return Books;}
    public void setBooks(boolean newBook){this.Books = newBook;}



    public static void main(String[] args) {
        
        
        Bookstore Store = new Bookstore("Bangin' Books", "555 Sycamore Rd");

        Store.getName();

        Store.getAddress();      
        
        Store.getSqFt();

        Store.getBooks();

        // Store.getHrs(); 
        
        // Store.getClose();
        
        

       

        
    }

}