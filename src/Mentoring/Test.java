package Mentoring;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Test {
 // We cannot call non static variables from a static method
// Why we cannot call non static variables from a static method?
//
    // Static variables or methods run first in the class
    // So when static methods or variables are instantiated non-static methods and
    // variables will be instantiated after
    int age = 1;
    public static void main(String[] args) {


        System.out.println(factorial(5));
    }
    public static long factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }}

