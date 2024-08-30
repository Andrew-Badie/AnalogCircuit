/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coe318.lab7;
/**
*
* @author andre
*/

//The Purpose of this class is to make an array of resistors with its values and to which noode it is connected to
public class Resistor {
private double resistance;
private int num1;
private static int num= 0;
private Node node1;
private Node node2;

/**
 Constructor obtains the resistance,and nodes from the user and num increases each time an object is made
 */

public Resistor(double resistance, Node node1, Node node2){
this.resistance = resistance;
this.node1 = node1;
this.node2= node2;
num++;
num1=num;


if(resistance<0){
throw new IllegalArgumentException("Resistance cannot be less than 0");
}
 if(node1==null||node2==null){
    throw new IllegalArgumentException("Node cannot be null");
}
}

/**
     * Get the value of  array of nodes
     *
     * @return the value of the array of nodes
     */
public Node [] getNodes(){
Node [] node = new Node [2] ;
node[0]=node1;
node[1]=node2;
return node ;
}

//converts the resistor objects to string
public String toString (){
String List = "R"+num1+" "+node1+" "+node2+" "+resistance;
return List;
}//main method where one can test out the class
public static void main(String[] args) {
Node a1 = new Node();
Node b= new Node();
Resistor a = new Resistor(5.2,a1, b);
a.getNodes();
System.out.println(a);
}
}