/*
 * Author: Terrell Blakey
 * Date: November 13, 2017
 * Purpose: Tester class for the product program
 */
package OOD_FinalProject_ShoeStore;

public class ProductTester {

    public static void main(String[] args) {
        float[] sizes = new float[8];
        for(int x = 0; x < sizes.length; x++){
            sizes[x] = 8 + x;
        }
        
        Inventory newStock = new Inventory();
        for(int x = 0; x < newStock.getNumProducts(); x++){
            System.out.println(newStock.getProduct(x));
        }
        
        System.out.println("\nSetting selected size...");
        newStock.setSelectedSize((float)10.5);
        System.out.println("\nSelected size set to: " + newStock.getSelectedSize());
        
        System.out.println("\nSetting selected quantity...");
        newStock.setSelectedQuantity(4);
        System.out.println("\nSelected quantity set to: " + newStock.getSelectedQuantity());
        
        Shoe pulledShoe = newStock.getShoe(3);
        System.out.println("\nPulled Shoe:\n" + pulledShoe);
        
        System.out.println("\nPrinting newStock(3)");
        System.out.println(newStock.getProduct(3));
    }
    
}
