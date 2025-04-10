// enum Status{
//     Running, Failed, Pending, Success;
// }

// enum Laptop{
//     Macbook(900), Msi(400), HP(700), Lenovo;

//     private int price;

//     private Laptop(int price){
//         this.price = price;
//         System.out.println("in lap"+ this.name());
//     }
//     private Laptop(){
//         this.price = 100;
//     }

//     public int getPrice(){
//         return price;
//     }
//     public int setPrice(int price){
//         this.price = price;
//         return price;
//     }

// }

public class P
{
    public static void main(String args[])
    {
        
// CODITIONAL -
    // int n = 5;
    // if(n <= 20)
    //     System.out.println("yes");
    // else if( n > 20 && n <= 30)
    //     System.out.println("okayyy");
    // else
    //     System.out.println("shitt");
    // }

// TERNARY -
        // int n = 2;
        // int res = 0;

        // res = n%2==0 ? 10 : 20;
        // System.out.println(res);

        // int p = 23;
        // int l = 13;
        // int pl = p+l;
        // int ress = 0;

        // ress = pl>50 ? 10 : 20;
        // System.out.println(ress);

        // int ps = 34;
        // int lc = 23;
        // String sc;

        // sc = ps+lc >= 50 ? "l wins" : "P wins";
        // System.out.println(sc);

// SWITCH -
        // int p = 23;
        // int s = 34;
        // int ps = p+s;

        // int pds = ps>50 ? 10 : ps<50 ? 20 : 0;
        
        // switch(pds){
        //     case 10:
        //         System.out.println("p : "+p);
        //         break;
        //     case 20:
        //         System.out.println("s : "+s);
        //         break;

        //     default:
        //         System.out.println("ps : "+ps);
        // }

// LOOPS-
    // WHILE
        // int p = 12;
        // while(p<20)
        // {
        //     System.out.println("Pratham :"+p);
        //     int j = 1;
        //     while (j <= 3)
        //     {
        //         System.out.println("sugandhi :"+j);
        //         j++;
        //     }
        //     p++;
        // }

        // int i = 10;
        // while(i<=15)
        // {
        //     int j = 1;
        //     while(j<=3)
        //     {
        //         int k = 1;
        //         while(k<=2)
        //         {
        //             System.out.println("prat");
        //             k++;
        //         }
        //         System.out.println("dev");
        //         j++;
        //     }
        //     System.out.println("sug");
        //     i++;
        // }

    // DO WHILE-
        // int i = 10;
        // do
        // {
        //     int j = 1;
        //     while(j<3)
        //     {
        //         int k = 1;
        //         do
        //         {
        //             System.out.println("prat");
        //             k++;
        //         } while(k<3);
        //         System.out.println("dev");
        //         j++;
        //     }
        //     System.out.println("sug");
        //     i++;
        // } while(i<15);

    // FOR LOOP-
        // for(int i=1; i<=4; i++)
        // {
        //     System.out.println("sug");
        // } 

        // for(int i=1; i<=4; i++)
        // {
        //     int j = 1;
        //     while(j<3)
        //     {
        //         int k = 1;
        //         do
        //         {
        //             System.out.println("prat");
        //             k++;
        //         } while(k<3);
        //         System.out.println("dev");
        //         j++;
        //     }
        //     System.out.println("sug");
        // } 

// OBJECTS-
        // int num1 = 3;
        // int num2 = 5;

        // Calculator calc = new Calculator();
        // int res = calc.add(num1 , num2);
        // System.out.println(res);

        // Calculator obj1 = new Calculator();
        // int ress = calc.multi(num1 , num2);
        // System.out.println(ress);

        // A obj1 = new A();
        // int res = obj1.loop(1);
        // System.out.println(res);

        // Stringg obj = new Stringg();
        // String res = obj.name("Pratham ", "Sugandhi");
        // System.out.println(res);

// ARRAYS-
        // int nums[] = {1,2,3,0,4,4,4};
        // int sums[] = {3,34,4,23,23,32};

        // System.out.println(nums[2]+sums[5]);

        // Student std = new Student();
        // std.age = 21;
        // std.name = "fatuu";
        // std.marks = 89;

        // Student obj1 = new Student();
        // obj1.name = "prathu";
        // obj1.age = 19;
        // obj1.marks = 90;

        // Student obj2 = new Student();         
        // obj2.name = "fatuu";
        // obj2.age = 19;
        // obj2.marks = 69;

        // Student mixArr[] = new Student[3];
        // mixArr[0] = std;
        // mixArr[1] = obj1;
        // mixArr[2] = obj2;

        // for (int i=0; i<mixArr.length; i++){
        //     System.out.println(mixArr[i].name + " : " + mixArr[i].marks);
        // }

        // Student stdArr[] = new Student[2];
        // stdArr[0] = obj1;
        // stdArr[1] = obj2;


        // for(int i=0; i<stdArr.length; i++){
        //     System.out.println(stdArr[i].name + " : " + stdArr[i].marks);
        // }

        

// ARRAYS2- 
    // int nums[][] = new int [3][4];

    // for (int i=0; i<3; i++){
    //     System.out.println(i);
    //     for(int j=0; j<4; j++){
    //         // nums[i][j] = i+j;
    //         nums[i][j] = (int)(Math.random() * 10);
    //         System.out.print(nums[i][j] + " : ");
    //     }
    //     System.out.println(i+" i");
    // };
    
    // for(int i=0; i<3; i++){
    //     for(int j=0; j<4; j++){
    //         nums[i][j] = (int)(Math.random() * 10);
    //         System.out.print(nums[i][j] + ":");
    //     }
    //     System.out.println("::" + i +" i");
    // };

    // for(int n[] : nums){
    //     for(int m[] : n){
    //         nums[i][j] = (int)(Math.random() * 10);
    //         System.out.print(nums[i][j] + ":");
    //     }
    // };
// ARRAY- 
        // Student s1 = new Student();
        // s1.age = 21;
        // s1.name = "broo";
        // s1.marks = 89;

        // Student s2 = new Student();
        // s2.age = 22;
        // s2.name = "siss";
        // s2.marks = 78;

        // Student[] arr = new Student[2];
        // arr[0] = s2;
        // arr[1] = s1;

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i].name);
        // }


        // Car c1 = new Car();
        // c1.model = "M018";

        // Car c2 = new Car();
        // c2.model = "P189";

        // Car[][] carArr = new Car[2][4];
        // carArr[0][] = c1;
        // carArr[1][] = c2;
        // carArr[][0] = c2;
        // carArr[][1] = c1;
        // carArr[][2] = c2;
        // carArr[][3] = c1;
        
        // for(int i=0; i<carArr.length; i++){
        //     for(int j=0; j<carArr.length; j++){
        //         System.out.println(carArr[i][j].model); 
        //     }
        // }

// ENCAPSULATION-
        //GETTERS AND SETTERS-
        // Car obj = new Car();
        // obj.setCar("xuv500");

        // System.out.println(obj.getCar());

        // Calc obj1 = new Calc();
        // obj1.setType("Advanced");
        // obj1.setPrice(1199);

        // Calc obj2 = new Calc();
        // obj2.setType("Normal");
        // obj2.setPrice(599);

        // System.out.println(obj1.getType() +" "+ obj2.getPrice());

// INHERITANCE-
        // Calc obj = new Calc();
        // int a1 = obj.add(6,8);
        // int a2 = obj.multi(6,7);
        // System.out.println(a1 + " "+ a2);

// THIS AND SUPER-
    //super- calls const of upper class
    //this- calls const of same class
        // Calc obj = new Calc(5);

// OVERRIDING-
        // Student obj = new Student();
        // obj.Show();
        // obj.loop(5);

// POLYMORPHISM-
    //parent- refrence & child-obj
        // Calculator obj =new Calc();
        // obj.add(6,9);

        // A obj0 = new Student();
        // obj0.show();

// FINAL KEYWORD- 
    // variable
        // final int num = 8;
        // num = 9;     //not allowed
        // System.out.println(num);

    // class- cannot inherit from final A 
        // Student obj1 = new Student();
        // obj1.show();    //cannot inherit from final A

    // methods- methods cannot be overwrite
        // show() in B cannot override show() in A
        // Student obj1 = new Student();
        // obj1.show();

// ABSTRACT-
    //abstract methods cannot have a body
    //can't create obj ofabstract
    //can have constructor & static method

        // Animal obj0 = new Animal(); //cannot be instantiated

        // Horse obj = new Horse();
        // obj.walk(); //walk1-if not defined 

// INTERFACES-
    // interface abstract methods cannot have body
    // by default abstract and public
    // multiple inheritance
        // Horse obj = new Horse();
        // obj.walk();
        // Chicken chick = new Chicken();
        // chick.walk();

// ENUM- self made constants
        // int i = 5;
        // Status s = Status.Running;
        // System.out.println(s.ordinal());  //Running-0

        // Status[] ss = Status.values();
        // System.out.println(ss[0]);

        // for(Status s : ss){
        // System.out.println(s+ " : "+ s.ordinal());
        // }

        // Status s = Status.Pending;

        // switch(s){
        //     case Running:
        //         System.out.println("all good");
        //         break;
        //     case Failed:
        //         System.out.println("good");
        //         break;
        //     case Pending:
        //         System.out.println("poor");
        //         break;
        //     default: 
        //         System.out.println("done");
        //         break;
        // }

        // if(s == Status.Running)
        //     System.out.println("all good");
        // else if(s == Status.Failed)
        //     System.out.println("No good");
        // else if(s == Status.Pending)
        //     System.out.println("pls wait");
        // else
        //     System.out.println("Done");

        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap+" "+lap.getPrice());

// ANNOTATIONS- 
    //@Override
    //@Deprecated
    //@Functional Interface
        // A obj = new A(){
        //     public void show(){
        //         System.out.println("in show");
        //     }
        // };

        // A obj = (int i, int j) -> {
        //         System.out.println("in show "+ i*j);
        //     };
        // obj.show(7,9);

// EXCEPTION HANDLING-
    // Try and Catch
        int i = 9;
        int j = 0;

        // int num[] = new int[5];
        // String str = null;

        try{
            j = 18/i;
            if(j == 0){
                // throw new ArithmeticException("message..");
                throw new NavinException("Exception..");
            }

            // System.out.println(str.length());
            // System.out.println(num[5]);
        }

        catch(NavinException e){
            j = 18/1;
            System.out.println("Navinn..");
        }
        catch(ArithmeticException e){
            // System.out.println("something went wrong");
            j = 18/1;
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Out of index");
        }
        catch(Exception e){
            System.out.println("Error "+ e);
        }

        System.out.println(j);
        System.out.println("yoo");
    }
}

class NavinException extends Exception{
    public NavinException(String string){} 
}

// @FunctionalInterface
// interface A{
//     void show(int i, int j);
// }

// interface Animal{
//     void walk();
// }
// interface Herbivore{}

// class Horse implements Animal{
//     public void walk(){
//         System.out.println("walkk");
//     }
// }
// class Chicken implements Animal,Herbivore{
//     public void walk(){
//         System.out.println("chickku");
//     }
// }

// abstract class Animal{
//     abstract void walk();

//     Animal(){
//         System.out.println("cons..");
//     }
// }

// class Horse extends Animal{
//     public void walk(){
//         System.out.println("walk2");
//     };

//     Horse(){
//         System.out.println("cons2..");
//     }
// }

// class Calc extends Calculator{
//     private String type;
//     private int price;
//     public int nums;

//     public Calc(){
//         super();
//         System.out.println("IN cons..");
//         type = "normal";
//         price =  699;
//     }

//     public Calc(int nums){
//         int sum = nums+nums;
//         System.out.println(sum);
//     }

//     public String getType(){
//         return type;
//     }
//     public int getPrice(){
//         return price;
//     }

//     public String setType(String type){
//         this.type = type;
//         return type;
//     }
//     public int setPrice(int price){
//         this.price = price;
//         return price;
//     }
// }

// class Car{
//     private String model;

//     public String getCar(){
//         return model;
//     }
//     public String setCar(String model){
//         this.model = model;
//         return model;
//     }

// }

// class Student extends A
// {
//     int age;
//     String name;
//     int marks;

//     public void Show(){
//         System.out.println("Blaa");
//     }
// }

// class Calculator{
//     public Calculator(){
//         System.out.println("Calc cons..");
//     }

//     public int add(int n1, int n2){
//         int r = n1 + n2;
//         return r;
//     } 
//     public int multi(int n1, int n2){
//         int r = n1*n2;
//         return r;
//     }
// }

// final class A 
// {
//     public void show(){
//         System.out.println("IN Showw");
//     }

//     public int loop(int i){
//         for(i=1; i<=3; i++){
//             // void show(); -- not possible
//             int j = 1;
//             while(j<=3){
//                 System.out.println("IN J");
//                 j++;
//             }
//             System.out.println("IN I");
//         }
//         return i;
//     }
// }

// class Stringg {
//     public String name(String n1, String n2){
//         String fn = n1 + n2;
//         return fn;
//     }
// }