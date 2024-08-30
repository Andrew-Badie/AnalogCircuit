/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package coe318.lab7;

/**
 *
 * @author andre
 */
//The purpose of this class is to get the nodes to be used in the other classes
public class Node {


private int num;
private static int num2 = -1;
public Node(){
num2++;
num=num2;
}

/**
     * Set the value of int
     *
     * @param int new value of int
     */
public void setNum(int num){
this.num=num;
    
}
//converts node num to string
public String toString (){
String List = ""+num;
return List;
}
//main method where one can test out the class
public static void main(String[] args) {
Node a = new Node();
Node b = new Node();
Node c = new Node();
System.out.println(""+a+" "+b+" "+c);
}

}