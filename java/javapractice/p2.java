
import java.util.Map;
import java.util.HashMap;

public class p2 {
    public static void main(String a[]){

        // INHERITANCE-
            // Calc obj = new Calc ();
            // int total = obj.add(5,9);
            // System.out.println(total);

            // AdvCalc obj1 = new AdvCalc();
            // int s2 = obj1.multi(4,8);
            // int s3 = obj1.add(8,9);
            // System.out.println(s2);
            // System.out.println(s3);

        // THIS, SUPER-
            // A obj = new A();
            // A obj1 = new A(5);
            // B obj2 = new B();
            // B obj3 = new B("9");

        // OVERRIDING-
            // Car obj = new Car();
            // obj.start();
            // Bike obj2 = new Bike();
            // obj2.start();

        // PACKAGES-
            // C obj = new C();
            // obj.setPrice(999);
            // System.out.println(obj.getPrice());
            // System.out.println(obj.getData());

        // POLYMORPHISM- refrence - object
            // Parent obj = new Child();
            // obj.setAge(49);
            // System.out.println(obj.getAge());

            // obj.setage(12);      //can't set/get
            // System.out.println(obj.getage());

        // ABSTRACT- 
            // Box obj = new UpdatedBox();
            // obj.square();
            // obj.rec();

        // INTERFACE-
            // Game obj = new Minigames();
            // obj.playgame();
            // obj.endgame();

            // Box obj  = new MoreBox();
            // obj.square();
            // obj.rec();

        // ENUM-
            // Laptop lap = Laptop.HP;
            // lap.setPrice(799);      // default 899
            // System.out.println(lap.getPrice());

            // for(Laptop l : Laptop.values())
            //     System.out.println(l + " : "+ l.getPrice());


            // TrafficLight light1 = TrafficLight.GREEN;
            // light1.setAction(light1 + ": GO");
            // System.out.println(light1.getAction());

            // TrafficLight light2 = TrafficLight.YELLOW;
            // light2.setAction(light2 +": READY");
            // System.out.println(light2.getAction());

            // TrafficLight light3 = TrafficLight.RED;
            // light3.setAction(light3 + ": STOP");
            // System.out.println(light3.getAction());

        // FUNCTIONAL INTERFACE, ANNONYMOUS CLASS, LAMBDA-
            // Car obj = new Veh();
            // obj.start();
            // obj.setPrice(999);
            // System.out.println(obj.getPrice());

            // Car obj = new Car(){
            //     public void start(){
            //         System.out.println("Starting");
            //     }
            // };

            // obj.start();
            // obj.setPrice(9999);
            // System.out.println(obj.getPrice());

            // Car obj = () -> {
            //         System.out.println("Starting");
            //     };
            // obj.start();
            
        // EXCEPTION HANDELING- THROW KEYWORD
            // int i = 0;
            // int j = 0;
            // try{
            //     j = 99/i;
            //     if(j == 0){
            //         // throw new ArithmeticException("i can't be zero");
            //         throw new myException("ERRor");
            //     } else 
            //         System.out.println("Hello");
            // } 
            // catch (ArithmeticException e){
            //     System.out.println("i can't be zero");
            // } 
            // finally {
            //     System.out.println("bYEE");
            // }

        // THREAD-(start/run)
                // A obj = new A();
                // B obj2 = new B();

                // obj.start();
                // obj2.start();

            // RUNNABLE-
                // Runnable obj1 = new Runnable(){
                //     public void run(){
                //         for(int i=1; i<=10; i++){
                //             System.out.println("Hii");
                //             try{
                //                 Thread.sleep(2);
                //             } catch (InterruptedException e){
                //                 System.out.println("Sorry");
                //             }
                //         }
                //     }
                // };
                // Runnable obj2 = new Runnable(){
                //     public void run(){
                //         for(int i=1; i<=10; i++){
                //             System.out.println("Hello");
                //             try{
                //                 Thread.sleep(2);
                //             } catch (InterruptedException e){
                //                 System.out.println("Sorry");
                //             }
                //         }
                //     }
                // };

                // Thread t1 = new Thread(obj1);
                // Thread t2 = new Thread(obj2);
                // t1.start();
                // t2.start();

            // RACE CODN-
                // Counter c = new Counter();
                // Runnable obj = () -> {
                //     for (int i=1; i<=10; i++){
                //         c.increment();
                //     }
                // };
                // Runnable obj2 = () -> {
                //     for (int i=1; i<=10; i++){
                //         c.increment();
                //     }
                // };

                // Thread t1 = new Thread(obj);
                // Thread t2 = new Thread(obj2);
                // t1.start();
                // t2.start();

        // MAP-
            // Map <String, Integer> map = new HashMap<>();
            // map.put("Prathu", 99);
            // map.put("jnkvf", 90);

            // System.out.println(map.size());     //no of
            // System.out.println(map.containsKey("Prathu"));      //true/false
            // System.out.println(map.get("Prathu"));

            // System.out.println(map.remove("Pru"));
            // System.out.println(map.size());

            // for(String key : map.keySet()){
            //     System.out.println("key "+key+ " value "+map.get(key));
            // }
        
        // 
    }
}

// class Counter{
//     int count;
//     public synchronized void increment(){
//         count++;
//     }
// }

// class A implements Runnable{
// class A extends Thread{
//     public void run(){
//         for(int i=1; i<=5; i++){
//             System.out.println("Hii");
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for(int i=1; i<=5; i++){
//             System.out.println("Hello");
//         }
//     }
// }

// class myException extends Exception{
//     public myException(String String){
//         super(String);
//     }
// }

// @FunctionalInterface    //-only one method  
// interface Car{
//     void start();
// }
// class Veh implements Car{
//     public void start(){
//         System.out.println("Starting");
//     }
    
//     private int price;

//     public void setPrice(int price){
//         this.price = price;
//     }
//     public int getPrice(){
//         return price;
//     }
// }

// enum TrafficLight{
//     RED, GREEN, YELLOW;

//     private String action;

//     private TrafficLight(){
//         System.out.println("Signal..");
//     }
//     private TrafficLight(String action){
//         this.action = action;
//     }

//     public void setAction(String action){
//         this.action = action;
//     }
//     public String getAction(){
//         return action;
//     }
// }
// enum Laptop{
//     MSI(599), Macbook(1999), Lenovo, HP;

//     private int price;

//     private Laptop(){
//         price = 899;
//     }
//     private Laptop(int price){
//         this.price = price;
//     }

//     public void setPrice(int price){
//         this.price = price;
//     }
//     public int getPrice(){
//         return price;
//     }
// }


// interface Game{
//     void playgame();
//     void endgame();
// }
// class Minigames implements Game{
//     public void playgame(){
//         System.out.println("Playingg");
//     }
//     public void endgame(){
//         System.out.println("Endiing");
//     }
// }

// interface Box{
//     void square();
//     void rec();
// }
// class MoreBox implements Box{
//     public void square(){
//         System.out.println("Yoo");
//     }
//     public void rec(){
//         System.out.println("Broo");
//     }
// }

// abstract class Box{
//     public abstract void square();
//     public abstract void rec();
// }
// abstract class BigBox extends Box{
//     public  BigBox(){
//         System.out.println("YOoo");
//     }
// }
// class UpdatedBox extends BigBox{
//     public void square(){
//         System.out.println("Hwlooo"); 
//     }
//     public void rec(){
//         System.out.println("Byee");
//     }
// }


// class Parent{
//     public Parent(){
//         System.out.println("Parent");
//     }

//     private int age;
//     public void setAge(int age){
//         this.age = age;
//     }
//     public int getAge(){
//         return age;
//     }
// }
// class Child extends Parent{
//     public Child(){
//         System.out.println("Childd");
//     }

//     // private int cage;
//     // public void setage(int cage){
//     //     this.cage = cage;
//     // }
//     // public int getage(){
//     //     return cage;
//     // }
// }

// class C{
//     private int price;

//     public void setPrice(int price){
//         this.price = price;
//     }
//     public int getPrice(){
//         return price;
//     }

//     private int data(){
//         return 1010;
//     }
//     public int getData(){
//         return data();
//     }
// }

// class Car{
//     public void start(){
//         System.out.println("Startiing");
//     }
// }
// class Bike extends Car{
//     public void start(){
//         System.out.println("Vroom");
//     }
// }

// class A extends Object{
//     public A(){
//         System.out.println("A called");
//     }
//     public A(int a){
//         this();
//         System.out.println(a);
//     }
// }
// class B extends A{
//     public B(){
//         super();
//         System.out.println("B called");
//     }
//     public B(String b){
//         super();
//         this();
//         System.out.println(b);
//     }
// }
    
// class Calc{
//     public int add(int a , int b){
//         return a+b;
//     }

//     public int sub(int a, int b){
//         return a-b;
//     }    
// }
// class AdvCalc extends Calc{
//     public int multi(int a, int b){
//         return a*b;
//     }

//     public int div(int a, int b){
//         return a/b;
//     }
// }