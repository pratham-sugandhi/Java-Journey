// package java.javapractice;

public class p1 {
    public static void main(String a[]){
        
    // INHERITANCE
        // Calc obj = new Calc();
        // int s1 = obj.sum(4,6);
        // System.out.println(s1);

        // AdvCalc obj2 = new AdvCalc();
        // int s2 = obj2.sum(8,9);
        // int s3 = obj2.multi(4,6);
        // System.out.println(s2 + " "+ s3);

    // THIS, SUPER KEYWORD
        //super - call only inside constructor
        // This method- execute constructor of same class
        // Super method- execute constructor of super class
        
        // B obj1 = new B();   //default A,B
        // B obj = new B(5);   //int A,B
        // B obj = new B(5);   //default A,B | int A,B

    // OVERRIDING
        // B obj = new B();
        // obj.show();
        // obj.run();
        
    // PACKAGES
        // C obj = new C();
        // obj.run();  //default
        // obj.show(); //protected

        // obj.setnum(5);          //private
        // obj.setname("prathu");
        // System.out.println(obj.getnum());
        // System.out.println(obj.getname());

    // POLYMORPHISM
        // RUNTIME AND COMPILETIME
        // parent(superclass)-reference and child(subclass)-obj
            // A obj = new B ();
            // obj.show();

            // A obj2 = new C ();
            // obj.show();

    // TYPECASTING
        // Calc obj = new Calc();
        // int s1 = obj.sum(4,6);
        // System.out.println(s1);

        // Calc obj2 = new AdvCalc();
        // int s2 = obj2.sum(8,9);
        // // int s3 = obj2.multi(4,6);    //MULTI DOESN'T EXIST IN CALAC
        // System.out.println(s2);

    // ABSTRACT- undeclared
        // Car obj = new Car();    //can not create obj of abstract
        // obj.run();
        // obj.drive();

        // Car obj1 = new bigCar();      //undeclared-abstract
        // Car obj = new updatedCar();      //declared
        // obj.drive();

    // INTERFACE
        // X obj = new X();
        // X obj = new Y();
        // X obj = new Z();
        // obj.show();
        // obj.config();   //no if not exsist in X

        // Y obj1 = new Z();
        // obj1.show();    //parents se lenga
        // Y obj2 = new X();    //no

    // 
    
    }
}

class Calc{
    public int sum(int a, int b){
        // System.out.println(a+b);
        return a+b;
    }
}
class AdvCalc extends Calc{
    public int multi(int a, int b){
        return a*b;
    }
}


class A{
    public A(){
        super();
        System.out.println("default A");
    }
    public A(int a){
        super();
        System.out.println("default int A");
    }

    public void show(){
        System.out.println("SHoww..");
    }
    private void run(){
        System.out.println("yoo");
    }
}
class B extends A{
    public B(){
        // super();
        System.out.println("default B");
    }
    public B(int a){
        // super(a);
        this();
        System.out.println("default int B");
    }
    public void show(){
        System.out.println("Showw2..");
    }
}

class C extends A{
    protected int num;
    private String name;

    public void show(){
        System.out.println("Show");
    }
    // protected void show(){
    //     System.out.println("Show");
    // }

    void run(){
        System.out.println("run");
    }

    public int getnum(){
        return num;
    }
    public void setnum(int num){
        this.num = num;
    }

    public String getname(){
        return name;
    }
    public void setname(String n){
        this.name = n;
    }
}


abstract class Car{
    public abstract void drive();   //undeclared-abstract
    public abstract void fly();     //undeclared-abstract

    public void run(){
        System.out.println("Run");
    };
}
abstract class bigCar extends Car{      //undeclared fly-abstract
    public void drive(){
        System.out.println("Drive");
    }
}
class updatedCar extends bigCar{
    public void fly(){
        System.out.println("Fly");
    }
}


interface X{
    int p = 15;
    String name = "prathu";

    void show();
    void config();
}
interface Y extends X{
    void config();
}
class Z implements X,Y{
    public void show(){
        System.out.println("Showw...");
    }
    public void config(){
        System.out.println("Configg...");
    }
}