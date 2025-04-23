// package java.javapractice;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.Comparator;
import java.util.Collections;

// abstract class Shape{
//     public abstract double calculatedArea();
// }
// class Circle extends Shape{
//     private double radOfCircle;

//     private Circle(){   
//     }
//     public double getCircle(){
//         return radOfCircle;
//     }
//     public double setcircle(double radOfCircle){
//         return this.radOfCircle = radOfCircle;
//     }

//     @Override 
//     public double calculatedArea(){
//         return Math.PI * Math.pow(radOfCircle, 2);
//     }
// }

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

        // AdvCalc obj3 = new Calc();   //child can't be refrence

    // ABSTRACT- undeclared(has to be declared)
        // Car obj = new Car();    //can not create obj of abstract
        // obj.run();
        // obj.drive();

        // Car obj1 = new bigCar();      //undeclared-abstract
        // Car obj = new updatedCar();      //declared
        // obj.drive();

        // Circle obj = new class();
        // obj.setcircle(4);
        // obj.getCircle();

    // INTERFACE- predefined abstract
        // X obj = new X();
        // X obj = new Y();
        // X obj = new Z();
        // obj.show();
        // obj.config();   //no if not exsist in X

        // Y obj1 = new Z();
        // obj1.show();    //parents se lenga
        // Y obj2 = new X();    //no

    // ENUM- constant
        // Laptop lap1 = Laptop.Macbook;
        // lap1.setPrice(599);
        // System.out.println(lap1.getPrice());

        // Laptop lap2 = Laptop.MSI;
        // System.out.println(lap2.getPrice());

        // Laptop lap3 = Laptop.Lenovo;
        // System.out.println(lap3.getPrice());

        // Laptop lap = Laptop.valueOf("Lenovo");
        // for(Laptop value : Laptop.values()){
        //     System.out.println(values);
        // }

        // trafficLight colour = trafficLight.RED;
        // color = trafficLight.GREEN;
        
    // ANNOTATIONS
        //Deprecated?
        //Override?

            // L obj = new L();    //L-L=>L, P-P=>P
            // obj.data();
            // L obj = new P();    //L-P=>P
            // obj.data();

        // Functional Interface
            // Game obj = new BigGame();
            // obj.play();

            // School sch = new School(){
            //     public void study(){
            //         System.out.println("study");
            //     }
            // };
            // sch.study();

        // LAMBDA
            // School sch = () ->
            //         System.out.println("study");
            // sch.study();

            // Calci cal = (int i, int j) -> {
            //     int m = i+j;
            //     System.out.println(m);
            // };
            // cal.sum(5,7);

            // AdvCalci ac = (i, j) -> {
            //     for( ; i<= 10; i++){
            //         int n = i+j;
            //         System.out.println(n);
            //     }
            // };
            // ac.loop(6,7);

    // TYPES OF INTERFACE
        // NORMAL-ONE OR MORE
        // FUNCTIONAL-ONE
        // MARKER-ZERO
    
    // EXCEPTION HANDELING
        // STATEMENT
            // int i = 0;
            // int j = 18/i;
            // System.out.println(j);  // exception
            // System.out.println("BYEE");     //execution stops

        // HANDELING
            // int i = 2;
            // int j=0;

            // try{
            //     j = 18/i;
            //     System.out.println(j);
            // } 
            // catch(ArithmeticException e){
            //     i = 1;
            //     System.out.println("Can't divide by zero");
            //     System.out.println("So i=1, j : "+j);
            // }
            // catch(Exception e){
            //     System.out.println("Exception");
            // }

            // System.out.println("Byee");
    
    // EXCEPTION THROW, FINALLY
        // int i = 24;
        // int j = 0;

        // try{
        //     j = 18/i;
        //     if(j==0)
        //         // throw new ArithmeticException("i can't be zero");
        //         throw new myException("minee");
        //     else
        //         System.out.println(j);
        // }
        // catch(ArithmeticException e){
        //     i = 1;
        //     System.out.println("default i, j: "+i+", "+j);
        // }
        // catch(Exception e){
        //     System.out.println("Something went wrong.."+ e);
        // }
        // finally{
        //     System.out.println("Bye");
        // }

    // THREADS- used to run two diff thing at a time or parallely
        // start & run
            // A obj1 = new A();
            // B obj2 = new B();

            // obj1.start();
            // obj2.start();

        // immplement runnable
            // Runnable obj1 = new Runnable(){
            //     public void run(){
            //         for (int i=1; i<=10; i++){
            //             System.out.println("HI");
            //             try{
            //                 Thread.sleep(2);
            //             } catch (InterruptedException e){
            //                 System.out.println("noo");
            //             }
            //         }        
            //     }
            // };
            // Runnable obj2 = () -> {
            //     for (int i=1; i<=10; i++){
            //         System.out.println("HELLO");
            //         try{
            //             Thread.sleep(2);
            //         } catch (InterruptedException e){
            //             System.out.println("noo");
            //         }
            //     }        
            // };

            // Thread t1 = new Thread(obj1);
            // Thread t2 = new Thread(obj2);
            // t1.start();
            // t2.start();

        // Race condition- 
            // Counter c = new Counter();
            // Runnable obj1 = () -> {
            //         for (int i=1; i<=10; i++){
            //             c.increment();
            //         }        
            // };
            // Runnable obj2 = () -> {
            //     for (int i=1; i<=10; i++){
            //         c.increment();
            //     }        
            // };

            // Thread t1 = new Thread(obj1);
            // Thread t2 = new Thread(obj2);
            // t1.start();
            // t2.start();

            // try{
            //     t1.join();
            // } catch (InterruptedException e){
            //     System.out.println("noo");
            // }
            // try{
            //     t2.join();
            // } catch (InterruptedException e){
            //     System.out.println("noo");
            // }

            // System.out.println(c.count);

            // synchronized- one at a time (saves from race)

    // COLLECTION LIBRARY-
        // VAR ARGUMENTS
            // System.out.println(sum(4,5));
            // System.out.println(sum(4,8,3));

        // WRAPPER- use primitive as object
            // Integer one = Integer.valueOf(77);   //or
            // Integer one = 32;       //autoboxing
            // one.byteValue();

            // int sec = one;      //autounboxing
        // COLLECTION INTERFACE-  
            // List Interface- Orderd & duplicate
                // List<String> strList = new ArrayList<>();       //<> - comile time
                // strList.add("Pratham");
                // strList.add("Sugandhi");

                // strList.add(1, "Devendra");
                // strList.remove(0);

                // if(strList.contains("Devendra")){
                //     System.out.println("Exsist at "+strList.indexOf("Devendra"));
                // } else
                //     System.out.println("Not Exist");

                // for (int i=0; i<strList.size(); i++)
                //     System.out.println(strList.get(i));

                // for(String str : strList)
                //     System.out.println(str);

            // Queue- FIFO
                // Queue<Integer> queue = new LinkedList<>();
                //  queue.add(1);
                //  queue.offer(2);

                // System.out.println(queue.peek());
                // System.out.println(queue.element());
                // System.out.println(queue.remove());

                //  for(Integer i : queue){
                //     System.out.println(i);
                //  }
                
                // System.out.println(queue.poll());       //removes with null
                // System.out.println(queue.remove());     //removes with exception

            // Set- unique and unorder
                // Set<String> names = new HashSet<>();
                // System.out.println(names.add("Prathu"));
                // System.out.println(names.add("Laxuu"));
                // System.out.println(names.add("Laxuu"));

                //  for(String str : names){
                //     System.out.println(str);
                //  }

                // System.out.println(names.add("Laxuu"));
                // System.out.println(names.remove("Laxuu"));
                // System.out.println(names.size());
                
                // for(String str : names){
                //     System.out.println(str);
                // }
    
        // COLLECTIONS CLASS-
            // List<Integer> numList = new ArrayList<>();
            // numList.add(5);
            // numList.add(8);
            // numList.add(0);
            // numList.add(5);
            // numList.add(3);

            // Collections.sort(numList);
            // for(String str : names){
            //     System.out.println(str);
            // }

            // Collections.reverse(numList);
            // for(String str : names){
            //     System.out.println(str);
            // }

            // int max = Collections.max(list);
            // int min = Collections.max(list);
            // System.out.println("Max "+max+" Min "+min);

            // List<Integer> unmodify = Collections.unmodifiableList(numList);
            // unmodify.add(5);

            // COMPARATOR
                // List<Integer> nums = new ArrayList<>();
                // nums.add(45);
                // nums.add(89);
                // nums.add(43);
                // nums.add(98);

                // Comparator<Integer> com = new Comparator<Integer>(){
                //     public int compare(Integer i, Integer j){
                //         if(i%10 > j%10)
                //             return 1;
                //         else 
                //             return -1;
                //     }
                // };

                // Collections.sort(nums, com);
                // System.out.println(nums);

                // List<Student> studs = new ArrayList<>();
                // studs.add(new Student(21 , "NAvin"));
                // studs.add(new Student(18 , "Prathu"));
                // studs.add(new Student(21 , "Sourabh"));
                // studs.add(new Student(20 , "Ap"));

                // Comparator<Student> com = new Comparator<Student>(){
                //     public int compare(Student i, Student j){
                //         if(i.age > j.age)
                //             return 1;
                //         else 
                //             return -1;
                //     }
                // };
                
                // Collections.sort(studs, com);
                // Collections.sort(studs);        //implement comparable samjha  nhi

                // for(Student s : studs)
                //     System.out.println(s);
        
    // MAP INTERFACE-
        // Map<String, Integer> map = new HashMap<>();
        // map.put("Prathu", 52);
        // map.put("Rathu", 2);
        // map.put("Athu", 5);
        // map.put("Pru", 55);
        // map.put("Pra", 62);

        // System.out.println(map.size());
        // System.out.println(map.containsKey("Laxuu"));
        // System.out.println(map.get("Prathu"));

        // System.out.println(map.remove("Pru"));
        // System.out.println(map.size());

        // for(String key : map.keySet()){
        //     System.out.println("key "+key+ " value "+map.get(key));
        // }
    
    // STREAM API-
      // ForEach 
        // List<Integer> nums = Arrays.asList(3,6,2,8);
        
        // nums.forEach( n -> System.out.println(n));

        // int sum = 0;
        // for(int n : nums){
        //     if (n%2==0){
        //         n = n*2;
        //         sum = sum + n;
        //     }
        // }

        // System.out.println(sum);

      // Stream interface
        // List<Integer> nums = Arrays.asList(3,6,2,8);

        // Stream<Integer> s1 = nums.Stream();     //in s1
        // Stream<Integer> s2 = s1.filter(n -> name52 == 0);
        // Stream<Integer> s3 = s2.map(n -> n*2);
        // int res = s3.reduce(0, (c,e) -> c+e);

        // nums.Stream()
        //     .filter(n -> n%2==0)
        //     .map(n -> n*2)
        //     .reduce(0, (c,e) -> c+e);

        // s1.forEach(n -> System.out.println(n));     //only once
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));
        // System.out.println(res);

    // 

    }

// vararg
    // public static int sum(int a,int b){
    // return a+b;
    // }
    // public static int sum(int[] a){
    //     int sum = 0;
    //     for(int i : a){
    //         sum += i;
    //     }
    //     return sum;
    // }
    // public static int sum(int first, int second, int... a){
    //     int sum = first + second;
    //     for(int i : a){
    //         sum += i;
    //     }
    //     return sum;
    // }
// 
}

// class Student{
//     int age;
//     String name;

//     public Student(int age, String name){
//         this.age = age;
//         this.name = name;
//     }

//     @Override
//     public String toString(){
//         return "Std [age="+age+", name =" + name+"]";
//     }
// }

// class Counter{
//     int count;
//     public synchronized void increment(){
//         count++;
//     }
// }
    
// class A extends Thread{
// class A implements Runnable{
//     public void run(){
//         for (int i=1; i<=10; i++){
//             System.out.println("HI");
//             try{
//             Thread.sleep(1);
//             } catch (InterruptedException e){
//                 System.out.println("noo");
//             }
//         }
//     }
// }
// class B extends Thread{
//     public void run(){
//         for (int i=1; i<=10; i++){
//             System.out.println("HELLO");
//             try{
//             Thread.sleep(2);
//             } catch (InterruptedException e){
//                 System.out.println("noo");
//             }
//         }
        
//     }
// }

// {
//     class Calc{
//         public int sum(int a, int b){
//             // System.out.println(a+b);
//             return a+b;
//         }
//     }
//     class AdvCalc extends Calc{
//         public int multi(int a, int b){
//             return a*b;
//         }
//     }


//     class A{
//         public A(){
//             super();
//             System.out.println("default A");
//         }
//         public A(int a){
//             super();
//             System.out.println("default int A");
//         }

//         public void show(){
//             System.out.println("SHoww..");
//         }
//         private void run(){
//             System.out.println("yoo");
//         }
//     }
//     class B extends A{
//         public B(){
//             // super();
//             System.out.println("default B");
//         }
//         public B(int a){
//             // super(a);
//             this();
//             System.out.println("default int B");
//         }
//         public void show(){
//             System.out.println("Showw2..");
//         }
//     }

//     class C extends A{
//         protected int num;
//         private String name;

//         public void show(){
//             System.out.println("Show");
//         }
//         // protected void show(){
//         //     System.out.println("Show");
//         // }

//         void run(){
//             System.out.println("run");
//         }

//         public int getnum(){
//             return num;
//         }
//         public void setnum(int num){
//             this.num = num;
//         }

//         public String getname(){
//             return name;
//         }
//         public void setname(String n){
//             this.name = n;
//         }
//     }


//     abstract class Car{
//         public abstract void drive();   //undeclared-abstract
//         public abstract void fly();     //undeclared-abstract

//         public void run(){
//             System.out.println("Run");
//         };
//     }
//     abstract class bigCar extends Car{      //undeclared fly-abstract
//         public void drive(){
//             System.out.println("Drive");
//         }
//     }
//     class updatedCar extends bigCar{
//         public void fly(){
//             System.out.println("Fly");
//         }
//     }


//     interface X{
//         int p = 15;
//         String name = "prathu";

//         void show();
//         // void config();
//     }
//     interface Y extends X{
//         void config();
//     }
//     class Z implements X,Y{
//         public void show(){
//             System.out.println("Showw...");
//         }
//         public void config(){
//             System.out.println("Configg...");
//         }
//     }
// }

// enum Laptop{
//     Macbook, Lenovo(499), MSI, Surface;

//     private int price;

//     private Laptop(){
//         this.price = 500;
//     }
//     private Laptop(int price){
//         this.price = price;
//     }

//     public int getPrice(){
//         return price;
//     }
//     public void setPrice(int price){
//         this.price = price;
//     }
// }
// enum trafficLight{
//     RED("STOP"), YELLOW("READY"), GREEN("GO");

//     private final String action;

//     trafficLight(String action){
//         this.action = action;
//     }
// }

// @Deprecated
// class L{
//     public void data(){
//         System.out.println("This data belongs to L");
//     }
// }
// class P extends L{
//     @Override
//     public void data(){
//         System.out.println("This data belongs to P");
//     }
// }

// @FunctionalInterface 
// interface Game{
//     void play();
// }
// class BigGame implements Game{
//     public void play(){
//         System.out.println("bigplayy");
//     }
// }

// @FunctionalInterface
// interface School{
//     void study();
// }
// @FunctionalInterface
// interface Calci{
//     void sum(int i, int j);
// }
// @FunctionalInterface
// interface AdvCalci{
//     void loop(int i, int j);
// }


// class myException extends Exception{
//     public myException(String String){
//         super(String);
//     }
// }

