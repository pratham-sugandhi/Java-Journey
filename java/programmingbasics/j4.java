
enum Status{
    Running, Failed, Pending, Success;
}

enum Laptop{
    Macbook(200), XPS(100), Surface;

    private int price;

    private Laptop( ){
        price = 500;
    }

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }
}

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