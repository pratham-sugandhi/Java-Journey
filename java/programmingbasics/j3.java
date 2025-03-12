

// package com.google.calculation;

import others.tools.*;
import tools.*;

import tools.Calc;
import tools.AdvCalc;

import java.util.ArrayList;

class A extends Object      //General
{
    public A()
    {
        super();        //Calls constructor of the Object Class
        System.out.println("default A");
    }
    public A(int a)
    {
        super();
        System.out.println("IN A int");
    }
}

class B extends A 
{
    public B()
    {
        super();       // (5) to call int A
        System.out.println("default B");
    }
    public B(int n)
    {
        // super(n);       //n nhi diya tho default call karega
        this();
        System.out.println("IN B int");
    }
}

class C
{
    public void show()
    {
        System.out.println("IN C Show");
    }
    public void config()
    {
        System.out.println("IN C config");
    }
}

class D extends C
{
    public void show()
    {
        System.out.println("IN B Show");
    }
}

// class Calc
// {
//     public int add(int n1, int n2)
//     {
//         return n1 + n2;
//     }
// }

// class AdvCalc extends Calc
// {
//     public int add(int n1, int n2)
//     {
//         return n1+n2+1;     //overriding above method
//     }
// }

public class j3
{
    public static void main(String args[])
    {
// INHERITANCE-
    // Single And Multilevel
    // java doesn't supports multiple inheritence 
        // reason - Ambiguity(selection)

        // Calc obj = new Calc();
        // AdvCalc obj = new AdvCalc();
        // int r1 = obj.add(4,5);
        // int r2 = obj.sub(6,3);
        // int r3 = obj.multi(5,4);
        // int r4 = obj.div(6,6);

        // System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4);

// THIS AND SUPER KEYWORD-
    // Every Constructor has a method - Super
    // This method- execute constructor of same class
    // Super method- execute constructor of super class
        
        // B obj = new B();        //default A, defaultB 
        // B obj = new B(5);       //int A, int B
        // B obj = new B(5);       //this- default A, default B, int B

// OVERRIDING- 

        // D obj = new  D();
        // obj.show();
        // obj.config();

        // AdvCalc obj = new AdvCalc();
        // int r1 = obj.add(3,4);
        // System.out.println(r1);

// PACKAGES-
    //importing them
    // import classes.Calc;

    // ArrayList list = new ArrayList();

    // Calc obj1 = new Calc();
    // int r1 = obj.add(3,4);
    // System.out.println(r1);

    // AdvCalc obj = new AdvCalc();

    }
}