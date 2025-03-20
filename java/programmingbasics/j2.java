
class Student
{
    int rollno;
    String name;
    int marks;
}

// class Mobile
//  {
//     String brand;
//     int price;
//     static String name;

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

//     public static void show1(Mobile obj)
//     {
//         // System.out.println(obj.brand + " : " + obj.price  + " : " + obj.name):
//     }
// }

// class A
// {
//     public void show()
//     {
//         System.out.println("In a show");
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
        int nums[][] = new int [3][4];

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
    
// STRINGS- //immutable

        // String name = new String("navin");
        // String name = "naveen";
        // name = name + "reddy";     //new object 

        // String s1 = "navin";
        // String s2 = "navin";    //refrence

        // System.out.println("hello " + name);
        // System.out.println(name.charAt(3));
        // System.out.println(name.cpncat(" reddy"));

// TYPES - mutable & immutable
        //String Buffer-thread safe
        // StringBuffer sb = new StringBuffer("naveen");
        // sb.append(" reddy");
        // sb.deleteCharAt(2);
        // sb.insert(6, "java");
        // sb.setLength(30);

        // System.out.println(sb);
        // System.out.println(sb.capacty());
        // System.out.println(sb.length());

// Static- can be called with thier class name directly without object
// Non static need classes object to be called

    // Mobile obj1 = new Mobile();

    // obj1.brand = "Apple";
    // obj1.price = 10000;
    // Mobile.name = "Phone";
    
    // obj1.show();
    // Mobile.show1(obj1);

    // Mobile obj3 = new Mobile();

    // obj3.brand = "VIVO";
    // obj3.price = 10000;
    // Mobile.name = "SmartPhone";
    
    // obj3.show();


    // Class.forName("Mobile"); //will call static block


// ENCAPSULATION- 
    // GETTERS AND SETTERS-

        // Human obj = new Human();
        // Human obj1 = new Human(18, "Navin");

        // System.out.println(obj.getName() + " : " + obj.getAge());
        // System.out.println(obj1.getName() + " : " + obj1.getAge());        


        // obj.setName("Pratham Sugandhi");
        // obj.setAge(20);

        // System.out.println(obj.getName() + " : " + obj.getAge());

    // THIS KEYWORD- used to represent current object

// CONSTRUCTOR- for some default values i.e,, 
        // every time you create obj it calls constructor

    }

}

class Human
{
    private int age = 19;
    private String name = "Pratham";
    // sharing will be done by methods instead of direct access;

    // Constructor-
    public Human()      //default constructor -same name as class
    {
        // System.out.println("IN CONSTRUCTOR");
        age = 21;
        name = "Prathu";
    }

    public Human(int age, String name)    //Parameterized Constructor
    {
        // age = a;
        this.age = age;
        // name = n;
        this.name = name;
    }

    // Methods
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        // age = a;
        this.age = age;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        // name = n;
        this.name = name;
    }
}
