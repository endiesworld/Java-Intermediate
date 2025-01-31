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
        double tax = 0.2; 
        double total = 0;
        int measurement = 3;
        Customer c1 =  new Customer();
        Clothing item1 = new Clothing();
        Clothing item2 = new Clothing();
        Clothing item3 = new Clothing();
        Clothing item4 = new Clothing();
        
        Clothing[] items = {item1, item2, item3, item4};
        
        item1.description = "Blue Jacket";
        item1.price = 20.9;
        item1.size = "M";
        
        item2.description = "Orange T-Shirt";
        item2.price = 10.5;
        item2.size = "S";
        
        item3.description = "Green Scarf";
        item3.price = 5;
        item3.size = "S";
        
        item3.description = "Blue T-Shirt";
        item3.price = 10.5;
        item3.size = "S";
        
        c1.name = "pinky" ;
        c1.size = "S";
        
        switch(measurement){
            case 1,2,3:
                c1.size = "S" ;
                break;
            case 4,5, 6:
                c1.size = "M";
                break;
            case 7, 8, 9:
                c1.size = "L";
                break;
            default:
                c1.size = "X";
                break;
        }
        
        System.out.println("Welcome to Duke Choice Shop customer: " + c1.name );        
        
        for(Clothing item : items){
            if(item.size.equals(c1.size)){
                total += (tax +  1)*item.price ;
            }
            if(total > 15){
                break;
            }
                
        }
        System.out.println("Total amount of items bought is: " + total);
        
        for(Clothing item : items){
            System.out.println("Item-2 details: Description: " + item.description + " price: " + item.price + " size: " + item.size);
        }
        
    }
    
}
