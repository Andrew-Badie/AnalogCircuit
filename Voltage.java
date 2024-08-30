
package coe318.lab7;

/**
 *
 * @author andre
 */
//The Purpose of this class is to make an array of voltages with its values and to which noode it is connected to
public class Voltage{
    
private double voltage;
private int num1;
private static int num= 0;
private Node node1;
private Node node2;

/**
 Constructor obtains the voltage,and nodes from the user and num increases each time an object is made
 */
public Voltage(double voltage, Node node1, Node node2){
this.voltage = voltage;
this.node1 = node1;
this.node2= node2;
num++;
num1=num;

if(node1==null||node2==null){
throw new IllegalArgumentException("Nodes cannot equal null");
}
if(voltage<0){
    throw new IllegalArgumentException("Type a positive voltage");
}
}

    /**
     *
     * @return
     */

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

    /**
     *
     * @return
     */
    
    //converts the resistor objects to string
    public String toString (){
String List = "V"+num1+" "+node2+" "+node1+" DC "+voltage;
return List;
}

    /**
     *
     * @param args
     */
    //main method where one can test out the class
    public static void main(String[] args) {

}
}