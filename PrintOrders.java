/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.Queue;

/**
 *
 * @author Jeff
 */
public class PrintOrders implements Runnable {
    private final Queue<Orders> orders;
    
    public PrintOrders(Queue<Orders> list){
        this.orders = list;
    }
    
    @Override
    public void run(){
        
        double sum = 0; //for total
        int num = 1; // for order numbers
        ShippingLabel sticker;
        ShippingService service = new ShippingService();
        
        
        while(orders.size() > 0){
            
            Orders ship = orders.poll();
            sticker = service.getShippingLabel(ship.getName(), ship.getAddress(), ship.getPounds());
            
            //output of data
            System.out.printf("Order Number: %s\n"
                    + "Recipient Name: %s\n"
                    + "Tracking Number: %s\n"
                    + "Destination: %s\n"
                    + "Weight in Pounds: %s\n"
                    + "Cost in Cents: %s\n\n", num, sticker.getRecipientName(), sticker.getTrackingNumber(),
                    sticker.getDestinationAddress(), sticker.getWeightInPounds(), sticker.getCostInCents());
            
            sum += sticker.getCostInCents(); // gets total of cost
            num++; // + 1
        }
        
        System.out.print("Total cost: " + String.format("%.2f", sum));
        System.out.println();
        
    }
}
