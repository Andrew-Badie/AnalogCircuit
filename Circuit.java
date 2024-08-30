/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab7;

/**
 *
 * @author andre
 */

import java.util.ArrayList;
/**
*
* @author andre
*/
public class Circuit {
public ArrayList<Object> circuits=new ArrayList<Object>();

private static Circuit instance =null;
public static Circuit getInstance() {
if (instance == null)
{ instance = new
Circuit();
}
return instance;
}
public void add(Resistor resistor){
circuits.add(resistor);
}
public void add1(Voltage volt){
circuits.add(volt);
}
public String toString(){
String List = "\n";
for(int i=0; i<(circuits.size());i++){
List+=circuits.get(i).toString()+"\n";

}
 
  
    return List;

}

private Circuit() {} //Yes, the constructor is PRIVATE!
public static void main(String[] args) {
    Circuit a = new Circuit();
    System.out.println(a);
}
}