

public class j5{
    public static void main(String a[]) throws InterruptedException {

// TRY WITH RESOURCES-
        // int i = 0;
        // int j = 0;
        // try{
        //     j =18/i;
        //     System.out.println("print");
        // }
        // finally{
        //     System.out.println("Byeee");
        // }

        // int num = 0;
        // BufferedReader br = null;
        // try{
        //     // InputStreamReader in = new InputStreamReader(System.in);
        //     // br = new BufferedReader(in);

        //     br = new BufferedReader(new InputStreamReader(System.in));
        //     num = Integer.parseInt(br.readline());
        //     System.out.println(num);
        // }
        // finally{
        //     br.close();
        //     System.out.println("Byeee");
        // }

        // int num = 0;
        // try(BufferedReader br = new BufferedReader(new InputStreamReader(System.in));)
        // {
        //     num = Integer.parseInt(br.readline());
        //     System.out.println(num);
        // }

// THREADS- are used to perform two behaviour (methods) parallely
    // THREADS PRIORITES
    // start -> extends Thread -> run
    
        // A obj1 = new A ();
        // B obj2 = new B ();

        // System.out.println(obj1.getPriority());
        // obj2.setPriority(Thread.MAX_PRIORITY);

        // // obj1.show();
        // obj1.start();

        // // obj2.show();
        // obj2.start();

// RUNNABLE VS THREAD-
        // Runnable obj1 = new A ();
        // Runnable obj2 = new B ();

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();
    
    // LAMBDA-
        // Runnable obj1 = () -> {
        //     for(int i=1; i<5; i++){
        //         System.out.println("Hii");
        //         try{
        //             Thread.sleep(10);
        //         } catch(TnterruptedException e){
        //             e.printStackTrack();
        //         }
        //     }
        // };

        // Runnable obj2 = () -> {
        //     for(int i=1; i<5; i++){
        //         System.out.println("Byee");
        //         try{
        //             Thread.sleep(10);
        //         } catch(TnterruptedException e){
        //             e.printStackTrack();
        //         }
        //     }
        // };

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();

// RACE CONDITION-
    // synchronized

        // Counter c = new Counter();

        // Runnable obj1 = () -> {
        //     for(int i=1; i <= 50; i++){
        //         c.increment();
        //     }
        // };

        // Runnable obj2 = () -> {
        //     for(int i=1; i <= 50; i++){
        //         c.increment();
        //     }
        // };

        // Thread t1 = new Thread(obj1);
        // Thread t2 = new Thread(obj2);

        // t1.start();
        // t2.start();
         
        // t1.join();
        // t2.join();

        // System.out.println(c.count);


//  THREAD STATES-
    // NEW -> (start()) -> 
                    // RUNNABLE -> (run()) -> 
                                    // RUNNING -> (sleep(), wait()) -> 
                                                        // WAITING -> (notify()) -> RUNNABLE
    // RUNNING -> (stop()) -> DEAD
    // RUNNABLE -> (stop()) -> DEAD

// 
    }
}

// class Counter
// {
//     int count;
//     public synchronized void increment()
//     {
//         count++;
//     }
// }

// // class A extends Thread
// class A implements Runnable
// {
//     public void run(){
//         for(int i=1; i<5; i++){
//             System.out.println("Hii");
//             // try{
//             //     Thread.sleep(10);
//             // } catch(TnterruptedException e){
//             //     e.printStackTrack();
//             // }
//         }
//     }
// }

// // class B extends Thread
// class B implements Runnable
// {
//     public void run(){
//         for(int i=1; i<5; i++){
//             System.out.println("Byee");
//             // try{
//             //     Thread.sleep(10);
//             // } catch(TnterruptedException e){
//             //     e.printStackTrack();
//             // }
//         }
//     }
// }