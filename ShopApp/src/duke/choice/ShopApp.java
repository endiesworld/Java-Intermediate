/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package duke.choice;

/**
 *
 * @author endie
 */
public class ShopApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
        double total = 0;
        int measurement = 3;
        Customer c1 =  new Customer();
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();
        
        Clothing[] items = {item1, item2, item3, item4};
        
        item1.setDescription( "Blue Jacket");
        item1.setPrice(20.9);
        item1.setSize( "M");
        
        item2.setDescription("Orange T-Shirt");
        item2.setPrice(10.5);
        item2.setSize( "S");
        
        item3.setDescription( "Green Scarf");
        item3.setPrice( 5);
        item3.setSize( "S");
        
        item4.setDescription( "Blue T-Shirt");
        item4.setPrice(10.5);
        item4.setSize( "S");
        
        c1.setName("pinky") ;
        c1.setSize(measurement);
        
        System.out.println("Welcome to Duke Choice Shop customer: " + c1.getName() );   
        
        c1.addItems(items);
        total = c1.getTotalClothingCost();
        
        System.out.println("Customer: " + c1.getName() + " with size: " + c1.getSize());
        System.out.println("Total amount of items bought is: " + total);
        
        for(Clothing item : items){
            System.out.println("Item details: Description: " + item.getDescription() + " price: " + item.getPrice() + " size: " + item.getSize());
        }
        
    }
    
}
