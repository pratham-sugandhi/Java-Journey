
// enum Status{
//     Running, Failed, Pending, Success;
// }

// enum Laptop{
//     Macbook(200), XPS(100), Surface;

//     private int price;

//     private Laptop( ){
//         price = 500;
//     }

//     private Laptop(int price){
//         this.price = price;
//     }

//     public int getPrice(){
//         return price;
//     }

//     public void setPrice(){
//         this.price = price;
//     }
// }

// class NavinException extends Exception
// {
//     public NavinException(String String){
//         super(String);
//     }
// }

// class A
// {
//     public void show() throws ClassNotFoundException
//     {
//         Class.forName("Demo");
//     }
// }

// import java.io.IOExceotion;
// import java.io.InputExceotion;

public class j4
{
    public static void main(String a[])
    {
// ENUM-
        // for (Laptop lap : Laptop.values())
        // {
        //     System.out.println(lap + " : "+ lap.getPrice());
        // }

        // Status s = Status.Running;
        // Status[] ss = Status.values();

        // System.out.println(s.ordinal());
        // System.out.println(ss[2]);

        // for(Status s : ss)
        // {
        //     System.out.println(s + " : " + s.ordinal());
        // }

        // Status s = Status.Pending;

        // if(s == Status.Running)
        //     System.out.println("all good");
        // else if(s == Status.Failed)
        //     System.out.println("No good");
        // else if(s == Status.Pending)
        //     System.out.println("pls wait");
        // else
        //     System.out.println("Done");


        // switch(s)
        // {
        //     case Running:
        //         System.out.println("all good");
        //         break;
        //     case Pending:
        //         System.out.println("pls wait");
        //         break;
        //     case Failed:
        //         System.out.println("no good");
        //         break;
        //     default:
        //         System.out.println("done");
        //         break;
        // }

// ANNOTATION
    // -OVERRIDE
    // -DEPRECATED

        // B obj = new B();
        // obj.showTheData();

        
    // -FunctionalInterface     //for one method only
        // C obj = new C()
        // {
        //     public void show()
        //     {
        //         System.out.println("IN SHOw");
        //     }
        // };
        // obj.show();

    // LAMBDA EXPRESSION- @functionalInterface
        // C obj = (i) -> System.out.println("IN SHOw");
        // obj.show(5);

        // C obj = (i, j) -> i+j;
        // int res = obj.add(4,5);
        // System.out.println(res);
// TYPES OF INTERFACE-
    // NORMAL
    // FUNCTIONAL
    // MARKER
// EXCEPTION HANDLING-
    // STATEMENTS-
    
    // int i = 0;
    // int j = 18/i;
    // System.out.println(j);  //exception
    // System.out.println("Byee");  //execution stops

    //exception handling
    // int i = 2;
    // int j = 0;

    // int nums[] = new int[5];
    // String str = null;
    
    // try
    // {
    //     j = 18/i;   //ArithmeticException
    //     System.out.println(str.length()); 

    //     System.out.println(nums[1]); 
    //     System.out.println(nums[5]); //Index 5 out of bounds for length 5
    // }
    // catch(ArithmeticException e)  //during exception only
    // {
    //     System.out.println("Cannot divide by 0.."+ e);
    // }
    // catch(ArrayIndexOutOfBoundsException e)  //during exception only
    // {
    //     System.out.println("Stays in index limits.."+ e);
    // }
    // catch(Exception e)  //during exception only
    // {
    //     System.out.println("Something went wrong.."+ e);
    // }

    // System.out.println(j);      //execution don't stop
    // System.out.println("Byee");     

// EXCEPTION HEIRARCHY-
    // OBJECT -> THROWABLE -> 
                // EXCEPTION ->
                        //RUNTIME EXCEPTION (UNCHECKED)- ARITHMETIC, ARRAYINDEX, NULLPOINT
                        // SQLEXCEPTION, IOEXCEPTION (CHECKED)
                // ERROR ->
                        //THREADDEATH
                        //IOERROR
                        //VIRTUALMACHINE ERROR -> OUT OF MEMORY

// EXCEPTION THROW-
    // int i = 20;
    // int j = 0;

    // try
    // {
    //     j = 18/i; 
    //     if(j == 0)
    //         throw new NavinException("navinn");
    //         // throw new ArithmeticException("cant take zero");
    // }
    // catch(NavinException e)  //during exception only
    // {
    //     j = 18/1;
    //     System.out.println("Default value.."+ e);
    // }
    // catch(Exception e)  //during exception only
    // {
    //     System.out.println("Something went wrong.."+ e);
    // }

    // System.out.println(j);      //execution don't stop
    // System.out.println("Byee");    

// EXCEPTION THROWS-
        
        // A obj = new A();
        // try{
        //     obj.show();
        // }
        // catch(ClassNotFoundException e){
        //     System.out.println("Not able to find class");
        //     e.printStackTrack();
        // }
        
// INPUT IN JAVA
    // println belongs to PrintStream class
    // out (obj) is static inside system class

    // System.out.println("Enter number");
    // int num = System.in.read();  //suitable for only one digit
    // System.out.println(num - 48);

    // InputStreamReader in = new InputStreamReader(System.in);
    // BufferReader bf = new BufferReader(in);

    // int num = Integer.parseInt(bf.readLine());
    // System.out.println(num);

    // bf.close();

    // Scanner sc = new Scanner(System.in);

    // int num = sc.nextInt();
    // System.out.println(num);

// FINALLY KEYWORD-
    // int i = 0;
    // int j = 0;

    // try
    // {
    //     j = 18/i; 
    //     System.out.println("Printt..");     //will not print during exception
    // }
    // catch(Exception e)  //during exception only
    // {
    //     System.out.println("Something went wrong.."+ e);
    // }
    // finally
    // {
    //     System.out.println("Byee");     // print compulsiorily
    // }

    // int num = 0;
    // try{
    //     InputStreamReader in = new InputStreamReader(System.in);
    //     BufferReader bf = new BufferReader(in);
    //     int num = Integer.parseInt(bf.readLine());
    //     System.out.println(num);
    // }
    // finally
    // {
    //     System.out.println(num);
    //     br.close();
    // }


    // try(BufferReader br = new BufferReader(new InputStreamReader(System.in)))
    // {
    //     num = Integer.parseInt(br.readline());
    //     System.out.println(num);
    // }

//
    }
}


// @FunctionalInterface        
// interface C
// {
//     void show(int i, int j);
// }

// class D implements C
// {
//     public void show()
//     {
//         System.out.println("IN SHOw");
//     }
// }

// @Deprecated
// class A 
// {
//     public void showTheData()
//     {
//         System.out.println("A Showw...");
//     }
// }

// class B extends A
//     {
//         @Override
//         public void showTheDara()
//         {
//             System.out.println("B Showw...");
//         }
//     }