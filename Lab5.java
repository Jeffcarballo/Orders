/*
Jeffrey Carballo
CSMY 167-002
The program opens a list of shipment orders using concurrency 
It took me about 30-40 hours to complete this assignment.
Hardest part was trying to figure out the Synchronization.
*/
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 *
 * @author Jeff
 */
public class Lab5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Queue<Orders> orders = new LinkedList<>();
        
        orders.add(new Orders("Michael Myers", "453 Light St", 55.23));
        orders.add(new Orders("Bailey Jefferson", "634 Red St", 32));
        orders.add(new Orders("Justin Streets", "904 Blue St", 57.5));
        orders.add(new Orders("Engelica Davis", "375 Green", 12));
        orders.add(new Orders("Tim Anderson", "123 Yellow St", 44));
        orders.add(new Orders("Joseph Smith", "555 Purple St", 83));
        
        System.out.println("__Shipment Orders__\n");
        
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(new PrintOrders(orders));
        
        executorService.shutdown(); // safetly ends concurrency
        
  
    }
    
}
