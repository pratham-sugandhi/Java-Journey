
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

        // 
    }
}

// EXCEPTION HANDELING-


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