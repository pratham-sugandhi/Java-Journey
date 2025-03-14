
enum Status{
    Running, Failed, Pending, Success;
}

enum Laptop{
    Macbook(200), XPS(100);

    private int price;

    private Laptop(int price){
        this.price = price;
    }
}

public class j4
{
    public static void main(String a[])
    {
// ENUM-
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

// 
    }
}