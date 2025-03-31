
// class Student
// {
//     int rollno;
//     String name;
//     int marks;
// }

// class Mobile
// {
//     String brand;
//     int price;
//     static String name;     //call by its classname

//     static
//     {    
//         name = "Phone";
//         System.out.println("in static block");
//     }

//     public Mobile()
//     {
//         brand = "";
//         price = 10000;
//         System.out.println("in constuctor block");
//     }

//     public void show()
//     {
//         System.out.println(brand + " : " + price  + " : " + name);
//     }

//     public static void show1()
//     {
//         System.out.println("in static method ");
//         System.out.println(name);   //take static mmethod
//     };

//     public static void show1(Mobile obj)
//     {
//         System.out.println(obj.brand + " : " + obj.price  + " : " + obj.name):
//     }
// }


public class j2
{
    public static void main(String args[])
    {
// ARRAY -2
        // int nums[] = new int[4];
        // nums[0] = 4;
        // nums[1] = 3;
        // nums[2] = 9;
        // nums[3] = 7;

        // for(Student stud : students)
        // {
        //     System.out.println(stud.name + " : " + stud.mark);
        // }

        // Student s1 = new Student();
        // s1.rollno = 1;
        // s1.name = "Rahul";
        // s1.marks = 89;

        // Student s2 = new Student();
        // s2.rollno = 2;
        // s2.name = "Mohit";
        // s2.marks = 98;

        // Student s3 = new Student();
        // s3.rollno = 3;
        // s3.name = "Nigam";
        // s3.marks = 83;

        // Student students[] = new Student[3];
        // students[0] = s1;
        // students[1] = s2;
        // students[2] = s3;

        // for(int i=0; i<students.length; i++)
        // {
        //     System.out.println(students[i].name + " : " + students[i].marks);
        // }

// ARRAYS-
        // int nums[][] = new int [3][4];

        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         nums[i][j] = (int)(Math.random() * 10);
        //         System.out.println(nums[i][j]);
        //     }
        // };

        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         nums[i][j] = (int)(Math.random() * 10);
        //         System.out.print(nums[i][j] + ":");
        //     }
        //     System.out.println(i);
        // };

        // for(int n[] : nums)
        // {
        //     for(int m : n)
        //     {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

        // int nums[][] = new int [3][];
        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];

        // for(int i=0; i<nums.length; i++)
        // {
        //     for(int j=0; j<nums[i].length; j++)
        //     {
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }

        // for(int n[] : nums)
        // {
        //     for(int m : n)
        //     {
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }
    
// STRINGS- //immutable- can not change

        // String name = new String("navin");
        // String name = "naveen";
        // name = name + "reddy";     //new object 

        // String s1 = "navin";
        // String s2 = "navin";    //refrence

        // System.out.println("hello " + name);
        // System.out.println(name.charAt(3));
        // System.out.println(name.cpncat(" reddy"));

    // TYPES -> mutable- can change  
    //String Buffer- mutable string & thread safe
        //free buffer size of 16byte

        // StringBuffer sb = new StringBuffer("naveen");
        // sb.append(" reddy");     //- changing obj inside heap
        // sb.deleteCharAt(2);
        // sb.insert(6, "java");
        // sb.setLength(30);

        // String str = sb.toString();
        // System.out.println(str);

        // System.out.println(sb);
        // System.out.println(sb.capacty());
        // System.out.println(sb.length());

// Static- can be called with thier class name directly without object
    // Mobile obj1 = new Mobile();
    // obj1.brand = "Apple";
    // obj1.price = 10000;

    // Mobile.name = "Phone";   //static

// Non static- need classes object to be called

    // Mobile obj1 = new Mobile();
    // obj1.brand = "Apple";
    // obj1.price = 10000;
    // Mobile.name = "Phone";   
    
    // Mobile obj3 = new Mobile();
    // obj3.brand = "VIVO";
    // obj3.price = 10000;
    // Mobile.name = "SmartPhone";


    // Mobile.name="mobilePhone"; //static var //same in all obj
    
    // obj1.show();
    // obj3.show();

    // Mobile.show1();      //static method
    // Mobile.show1(obj1);
    // Mobile.show1(obj3);

    // Mobile obj1 = new Mobile(); -> called static when loaded, called constructor when obj created
    // Mobile obj3 = new Mobile(); -> will only call constructor block
    
    // Class.forName("Mobile"); //will call static block


// ENCAPSULATION- 
    // Private - can access with methods
    // methods - get and set

    // Human obj = new Human();
    // obj.setAge(19);
    // obj.setName("prathu");

    // System.out.println(obj.getName() + " : " + obj.getAge());

    // GETTERS AND SETTERS-

        // Human obj = new Human();
        // Human obj1 = new Human(18, "Navin");

        // System.out.println(obj.getName() + " : " + obj.getAge());
        // System.out.println(obj1.getName() + " : " + obj1.getAge());        


        // obj.setName("Pratham Sugandhi");
        // obj.setAge(20);

        // System.out.println(obj.getName() + " : " + obj.getAge());

    // THIS KEYWORD- used to represent current object

// CONSTRUCTOR- used to set default values i.e,, 
        // every time you create obj it calls constructor
        // constructor name should be class name
// ANONYMOUS OBJ-

    // int marks;
    // marks = 99;

    // A obj;
    // obj = new A();

    // new A();    //obj creation- anonymous
    // new A().show();     //can't write again

//
    }

}


// class A
// {
//     public A(){
//         System.out.println("obj created"); 
//     }  
//     public void show()
//     {
//         System.out.println("In a show");
//     }
// }

// class Human
// {
//     private int age = 19;
//     private String name = "Pratham";
//     // sharing will be done by methods instead of direct access;

//     // Constructor-
//     public Human()      //default constructor -same name as class
//     {
//         // System.out.println("IN CONSTRUCTOR");
//         age = 21;
//         name = "Prathu";
//     }

//     public Human(int age, String name)    //Parameterized Constructor
//     {
//         // age = a;
//         this.age = age;
//         // name = n;
//         this.name = name;
//     }

//     // Methods
//     public int getAge(){
//         return age;
//     }
//     public void setAge(int age){
//         // age = a;
//         this.age = age;
//     }

//     public String getName(){
//         return name;
//     }
//     public void setName(String name){
//         // name = n;
//         this.name = name;
//     }
// }
