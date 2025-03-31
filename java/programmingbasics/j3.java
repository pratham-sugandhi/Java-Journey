// package com.google.calculation;

// import others.tools.*;
// import tools.*;

// import tools.Calc;
// import tools.A;
// import tools.AdvCalc;

// import java.util.ArrayList;

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

// class B extends A 
// {
//     public B()
//     {
//         super();       // (5) to call int A
//         System.out.println("default B");
//     }
//     public B(int n)
//     {
//         // super(n);       //n nhi diya tho default call karega
//         this();
//         System.out.println("IN B int");
//     }
// }

// class C
// {
//     public void show()
//     {
//         System.out.println("IN C Show");
//     }
//     public void config()
//     {
//         System.out.println("IN C config");
//     }
// }

// class D extends C
// {
//     public void show()
//     {
//         System.out.println("IN B Show");
//     }
// }

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

// class C extends A
// {
//     public void abc()
//     {
//         System.out.println(marks);
//     }
// }

public class j3
{
    public static void main(String args[])
    {
// INHERITANCE-
    // Single And Multilevel(doesn't)
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
    //  private- same class
    //  public- all
    //  protected- same package, class, subspace
    //  default- same package

    //importing them
    // import classes.Calc;

    // ArrayList list = new ArrayList();

    // Calc obj1 = new Calc();
    // int r1 = obj.add(3,4);
    // System.out.println(r1);

    // AdvCalc obj = new AdvCalc();

        // P obj = new P();    //no need for public in same package
        // System.out.println(obj.marks);

        // A obj = new A();
        // System.out.println(obj.marks);
        // obj.show();

// POLYMORPHISM- 
    // RUNTIME AND COMPILETIME
    // parent(superclass)-reference and child(subclass)-obj
        // A obj = new B ();
        // obj.show();

        // A obj = new C ();
        // obj.show();

// FINAL KEYWORD- 
    // variable
        // final int num = 8;
        // num = 9;
        // System.out.println(num);

    // class- cannot inherit from final A 
        // A obj = new A();
        // obj.show();
        // obj.add(4,5);

        // B obj1 = new B();    //even though class B extends A
        // obj1.show();
        // obj1.add(4,5);

    // methods- methods cannot be overwrite
        // show() in B cannot override show() in A

// Object
        // Lap obj1 = new Lap();
        // obj1.model = "MSI";
        // obj1.price = 1000;

        // Lap obj2 = new Lap();
        // obj2.model = "MSI";
        // obj2.price = 1000;

        // boolean res = obj1 == obj2;   //false
        // boolean res = obj1.equals(obj2);

        // System.out.println(res);
        // System.out.println(obj.toString());

// TYPECASTING-
    // double d = 4.5;
    // int i = (int) d;

    //UPCASTING- refering to superclass
    // A obj = new B();
    // obj.show1();
    // obj.show2();     //cannot find symbol obj.show2();

    //DOWNCASTING- assigning to superclass
    // B obj1 = (B) obj;
    // obj1.show2();

// WRAPPER CLASSES-
    // INTEGER  
        // int num = 7;
        // Integer num1 = new Integer(7);    //boxing
        // Integer num1 = num;     //autoboxing- storing primitive type in obj
        
        // int num2 = num1.intValue();     //unboxing
        // int num2 = num1;        //auto-unboxing - taking out primitive value from obj
        
        // System.out.println(num2);

        // String str = "12";
        // int num3 = Integer.paraseInt(str);

// ABSTRACT KEYWORD-
    //to declare a method
    //cannot create obj of abstract class

    // Car obj = new Car();     //undeclared- drive 
    // Car obj = new bigCar();     //undeclared- fly

    // Car obj = new updatedCar();      //declared- drive & fly 
    // obj.drive();
    // obj.playMusic();

// INNER CLASS-

    // A obj = new A();
    // obj.show();

    // A.B obj1 = obj.new B();
    // A.B obj1 = new A.B();       //only if static
    // obj1.config();

    //anonymous behaviour- inner class
    // A obj = new A()
    // {
    //     public void show()
    //     {
    //         System.out.println("New Showw...");
    //     }
    // };
    // obj.show();

// INTERFACE- 
    // by default public abstract
    
    // A obj = new B();
    // obj.show();
    // obj.config();

    // int res = A.age;
    // A.age = 21;     //can't change- final
    // System.out.println(res);

// SUMMARY
    // class - class => extends
    // class - interace => implements
    // interface - interface => extends

        // A obj = new B();
        // obj.show();
        // obj.config();

        // X obj1 = new B();
        // obj1.run();

// 
    }
}



// class B implements A,X
// {
//     //can only gets methods
//     public void show()
//     {
//         System.out.println("Showw...");
//     }
//     public void config()
//     {
//         System.out.println("Configg...");
//     }
    // public void run()
    // {

    // }
    // public void stop()
    // {

    // }
// }

// interface Y extends X
// {
//     void stop();
// }

// interface X
// {
//     void run();
// }

// interface A 
// {
//     //variable must be final and static
//     int age = 19;
//     String name = "namee";

//     void show();
//     void config();
// }
    //OR
// abstract class A
// {
//     public abstract void show();
//     public abstract void config();
// }


// class A 
// {
//     int age;

//     public void show()
//     {
//         System.out.println("Showw...");
//     }

//     static class B 
//     {
//         public void config()
//         {
//             System.out.println("Configg...");
//         }
//     }
// }

// abstract class Car
// {
//     public abstract void drive();
//     public abstract void fly();

//     public void playMusic()
//     {
//        System.out.println("Play Music"); 
//     }
// }

// abstract class bigCar extends Car
    //abstract- bcz fly is not declare
// {
//     public void drive()      //compulsory to define abstract method here
//     {
//         System.out.println("Driving..");
//     }
// }

// class updatedCar extends bigCar     //concrete class
// {
//     public void fly()
//     {
//         System.out.println("Flying..");
//     }
// }


// class A
// {    
//     public void show1()
//     {
//         System.out.println("IN E SHOW");
//     }
// }

// class B extends A
// {
//     public void show2()
//     {
//         System.out.println("IN M SHOW");
//     }
// }

// class Lap
// {
//     String model;
//     int price;

//     public String toString()
//     {
//         return model +" : " + price;
//     }
//     public boolean equals(Lap that)
//     {
//         if(this.model.equals(that.model) && this.price == that.price)
//             return true;
//         else
//             return false;
//     }
// }


// final class A 
// {
//     public final void show()
//     {
//         System.out.println("IN A SHOW");
//     }
//     public void add(int a, int b)
//     {
//         System.out.println(a+b);
//     }
// }

// class B extends A
// {
//     public void show()
//     {
//         System.out.println("IN B SHOW");
//     }
// }