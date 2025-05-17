
import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class p3{
    public static void main(String a[]){
        // ARRAYS--
            // Student obj1 = new Student();
            // obj1.name = "Sv";
            // obj1.rollno = 9;
            // obj1.classes = 11;

            // Student obj2 = new Student();
            // obj2.name = "pds";
            // obj2.rollno = 1;
            // obj2.classes = 12;

            // Student students[] = new Student[3];
            // students[0] = obj1;
            // students[1] = obj2;

            // for(int i=0; i<students.length; i++){
            //     System.out.println(students[i].name+" : "+students[i].rollno);
            // }

            // Liabrary obj1 = new Liabrary();
            // obj1.books = "beer";
            // obj1.price = 99;
            // obj1.info = "Data";

            // Liabrary obj2 = new Liabrary();
            // obj2.books = "deer";
            // obj2.price = 59;
            // obj2.info = "Mob";

            // Liabrary obj3 = new Liabrary();
            // obj3.books = "hear";
            // obj3.price = 11;
            // obj3.info = "Lap";

            // Liabrary BigLib[] = new Liabrary[3];
            // BigLib[0] = obj1;
            // BigLib[1] = obj2;
            // BigLib[2] = obj3;

            // for(int i=0; i<BigLib.length; i++){
            //     System.out.println(BigLib[i].books+" : "+BigLib[i].price+" : "+BigLib[i].info);
            // }

            // Car veh1 = new Car();
            // veh1.model = 909;
            // veh1.price = 9999;
            // veh1.num = 232;

            // Car veh[] = new Car[1];
            // veh[0] =  veh1;

            // System.out.println(veh[0].model+ " "+veh[0].price + " "+veh[0].num);

        // INTERFACE-
            // A obj = new C();
            // obj.run();
            // obj.show();

            // FUNCTIONAL INTERFACE-
                // P obj = new L ();
                // obj.onlyOnce();

                // Lc obj1 = new Pds();
                // obj1.home();

                // Lc obj = new Lc(){
                //     public void home(){
                //         System.out.println("yoo");
                //     }
                // };
                // obj.home();

                // Lc obj = () -> 
                //         System.out.println("Woww");
                // obj.home();

        // EXCEPTION HANDELING-
            // int x;
            // try{
            //     for(int i=1; i<=5; i++){
            //         for( x=1; x<=i; x++){
            //             System.out.print("*");
            //         }
                    
            //         if(x <= 10)
            //             System.out.println(" yoo");
            //         else 
            //             System.out.println(" nooo");
                    
            //         System.out.println(" ");
            //     }
            // }
            // catch (ArithmeticException e){
            //     System.out.println("Error");
            // }
            // finally{
            //     System.out.println("Byee");
            // }

        // MAP- put, size, containsKey, remove, get, size()
            // Map<String, Integer> map = new HashMap<>();
            // map.put("Prathu", 19);
            // map.put("Amarsh", 18);
            // map.put("Hittu", 14);

            // System.out.println(map.size());     //3
            // System.out.println(map.remove("Prathu"));   //2
            // System.out.println(map.containsKey("Prathu"));      //false
            // System.out.println(map.size());
            // System.out.println(map.get("Prathu"));

        // THREADS-
                // T obj1 = new T();
                // H obj2 =  new H();

                // obj1.start();
                // obj2.start();

            // RUNNABLE-
                // R obj1 = new R();
                // U obj2 = new U();

                // Thread t1 = new Thread(obj1);
                // Thread t2 = new Thread(obj2);

                // t1.start();
                // t2.start(); 

            // RACE COND-
                // Counter cnt = new Counter ();
                // Runnable obj1 = () -> {
                //     for(int i=1; i<=5; i++){
                //         cnt.increment();
                //         System.out.println(cnt.count);
                //     }
                // };
                // Runnable obj2 = () -> {
                //     for(int i=1; i<=10; i++){
                //         cnt.increment();
                //         System.out.println(cnt.count);
                //     }
                // };

                // Thread t1 = new Thread(obj1);
                // Thread t2 = new Thread(obj2);
                
                // t1.start();
                // t2.start();

        // COLLECTIONS-
            // List - oreder & dublicate;
                // List<String> strList = new ArrayList<>();
                // strList.add("Prathu");
                // strList.add("sug");

                // strList.add(1, "devendra");
                // strList.remove(0);

                // if(strList.contains("devendra")){
                //     System.out.println("exist at"+strList.indexOf("devendra"));
                // }
                // else 
                //     strList.add(1,"devendra");
                
            // Queue- FIFO
                // Queue<Integer> obj = new LinkedList<>();
                // obj.add(1);
                // obj.add(9);
                // obj.offer(5);

                // System.out.println(obj.peek());
                // System.out.println(obj.element());
                // System.out.println(obj.remove());

                // for(Integer i : obj){
                //     System.out.println(i);
                // }

            // Set- unique and unorder
                // Set<Integer> obj = new HashSet<>();
                // obj.add(9);
                // obj.add(5);
                // obj.add(1);

                // for(Integer i : obj)
                // System.out.println(i);
        // 
    }
}

// THREADS-
// class Counter{
//     int count =10;
//     public synchronized void increment(){
//         count++;
//     }
// }

// class R implements Runnable{
//     public void run(){
//         System.out.println("Threadd");
//         check();
//     }

//     public void check(){
//         System.out.println("Checkedd");
//     }
// }
// class U implements Runnable{
//     public void run(){
//         System.out.println("Threadd2");
//         check2();
//     }

//     public void check2(){
//         System.out.println("Checkedd2");
//     }
// }

// class T extends Thread{
//     public void run(){
//         System.out.println("Threadd");
//         check();
//     }

//     public void check(){
//         System.out.println("Checkedd");
//     }
// }
// class H extends Thread{
//     public void run(){
//         System.out.println("Threadd2");
//         check2();
//     }

//     public void check2(){
//         System.out.println("Checkedd2");
//     }
// }

//  FUNCTIONAL EXPERIENCE-
// @FunctionalInterface
// interface Lc{
//     void home();
// }
// class Pds implements Lc{
//     public void home(){
//         System.out.println("Woww");
//     };
// }
// @FunctionalInterface
// interface P  {
//     void onlyOnce();
// }
// class L implements P{
//     public void onlyOnce(){
//         System.out.println("P");
//     }
// }


//  INTERFACE-
// interface A {
//     void run();
//     void show();
// }
// abstract class B implements A{
//     public void run(){
//         System.out.println("Run");
//     }
// }
// class C implements A {
//     public void run(){
//         System.out.println("Run");
//     }
//     public void show(){
//         System.out.println("Showw");
//     }
// }
// @FunctionalInterface
// interface V{
//     void one();
// }


//  ARRAY-
// class Car{
//     int model;
//     int price;
//     int num;
// }
// class Liabrary{
//     String books;
//     int price;
//     String info;
// }
// class Student{
//     String name;
//     int rollno;
//     int classes;
// }