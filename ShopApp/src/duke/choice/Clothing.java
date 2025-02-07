/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package duke.choice;

/**
 *
 * @author endie
 */
public class Clothing {
    private String description;
    private double price;
    private String size = "M";
    private final double MIN_PRICE = 10;
    private final double TAX = 0.2;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price *(1 + this.TAX);
    }

    public void setPrice(double price) {
        this.price = (price > this.MIN_PRICE)? price : this.MIN_PRICE;
        
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    
}
