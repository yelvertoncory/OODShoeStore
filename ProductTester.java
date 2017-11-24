/*
 * Author: Terrell Blakey
 * Date: November 13, 2017
 * Purpose: Tester class for the product program
 */
package OOD_FinalProject_ShoeStore;

public class ProductTester {

    public static void main(String[] args) {
        int[] sizes = new int[8];
        for(int x = 0; x < sizes.length; x++){
            sizes[x] = 8 + x;
        }
        Product myShoe = new Product("Nike Eros", "Aqua Blue", "Running", 59.99, sizes, 15928810);
        myShoe.pullShoe(8, 1);
        
    }
    
}
