/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab7;
import java.util.Scanner;

/**
 *
 * @author andre
 */
//The purpose of this class is to allow the user to input information, and the program should output depending on the previous classes and the input of the user
public class UserMain {

    /**
     * @param args the command line arguments
     */
    //The user writes the input searated by spaces, and when "spice" is written, the output should display, and when "end" is written, the program should stop
    public static void main(String[] args) {
       Circuit cir = Circuit.getInstance();
       
        Scanner scan = new Scanner(System.in);
      
        String message ="";
        String[] array = new String[4];
        array=message.split(" ");
        Node node1 = new Node();
        Node node2 = new Node();
        double resistance;
        Resistor a;
        Voltage b;
        int num, num2;
       
     

        while(!message.equalsIgnoreCase("End")){
                  
            message=scan.nextLine();
        
            if(array.length>4){
                
throw new IllegalArgumentException("Invalid Input");
}
           
 
            }
              if(message.equalsIgnoreCase("spice")){
                     System.out.println(cir.toString());
            }
         if(message.startsWith("R"))   {

num =Integer.parseInt(array[1]);
  node1.setNum(num);
             

   num2=Integer.parseInt(array[2]);
   node2.setNum(num2);
               resistance = Double.parseDouble(array[3]);
               a=new Resistor(resistance,node1, node2);
   cir.add(a);
            }

        
              
              
              
               
               
               
               
               
               
          
              
               
               
               
       
              
            else if(message.startsWith("V")){
               num=Integer.parseInt(array[1]);
                node1.setNum(num);
        
             num2 = Integer.parseInt(array[2]);
       node2.setNum(num2);
              
               resistance = Double.parseDouble(array[3]);
              b=new Voltage(resistance,node1, node2);
 cir.add1(b);
            }
          
            
                
               
        System.out.println("All Done");       
            
    }
    

 }
        
    


    

