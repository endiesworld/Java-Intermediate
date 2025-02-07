/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author endie
 */
public class Customer {
    
    private String name;
    private String size;
    private Clothing[] items;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
    public void setSize(int size) {
        switch(size){
            case 1,2,3 -> this.setSize("S") ;
            case 4,5, 6 -> this.setSize( "M");
            case 7, 8, 9 -> this.setSize("L");
            default -> this.setSize("X");
        }
    }
    
    public void addItems(Clothing[] items){
        this.items = items;
    }
    
    public Clothing[] getItems(){
        return this.items;
    }
    
    public double getTotalClothingCost(){
        double total = 0;
        for(Clothing item : this.items){
            if(item.getSize().equals(this.getSize())){
                total += item.getPrice() ;
            }
//            if(total > 15){
//                break;
//            }
                
        }
        return total;
    }
}
