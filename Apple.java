//Created by Pooja
//On 5 oct 2019
//The program shows the implementation of vector(dynamic array) in java.

import java.lang.*;
import java.io.*; 
import java.util.*;
class A {
public static void main(String args[]) {
Vector v = new Vector(12,1);
v.add(0,1);
v.add(1,2);
v.add(2,3);
v.add(3,4);
v.add(4,5);
v.addElement(new String("Hi"));
v.addElement(new String("World"));
v.addElement(new String("Home"));
v.addElement(new Double(8.8));
v.addElement(new Double(4.4));
v.add(10,"A");
v.add(11,"B");
boolean a=v.contains("Hi");
v.removeElementAt(4);
System.out.println("Display first and last element in vector:"+elementAt(0)+" "+lastElement());
System.out.println("List of Elements is:");
System.out.println(v);
}
}
