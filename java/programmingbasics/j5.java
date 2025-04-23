// import java.util.ArrayList;
// import java.util.Collection;

// import java.util.HashSet;
// import java.util.Set;

// import java.util.Map;

// import javax.xml.transform.Source;

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


// THREAD STATES-
    // NEW -> (start()) -> 
                    // RUNNABLE -> (run()) -> 
                                    // RUNNING -> (sleep(), wait()) -> 
                                                        // WAITING -> (notify()) -> RUNNABLE
    // RUNNING -> (stop()) -> DEAD
    // RUNNABLE -> (stop()) -> DEAD

// COLLECTION-
    // ARRAYLIST- can have same index value , in seq

        // Collection<Integer> nums = new ArrayList<Integer>();
        // List<Integer> nums = new ArrayList<Integer>();      //to work with index

        // nums.add(6);
        // nums.add(8);
        // nums.add(5);
        // nums.add(8);
        // nums.add(2);

        // System.out.println(nums.get(3));

        // for(int n : nums){
        //     System.out.println(n);
        // }
        
    // SET- no same index value , unsorted value

        // Set<Integer> nums = new HashSet<Integer>();      //to work with index
        // Set<Integer> nums = new TreeSet<Integer>();      //sorted values
        // Collection<Integer> nums = new TreeSet<Integer>(); 

        // nums.add(6);
        // nums.add(8);
        // nums.add(5);
        // nums.add(8);
        // nums.add(2);

        // Iterator<Integer> values = nums.iterator();
        
        // while(values.hasNext())
        //     System.out.println(values.next());

        // for(int n : nums){
        //     System.out.println(n);
    
    // MAP- collection of key and value pair
        // key(set) name of index value(list)

            // Map<String, Integer> students  = new HashMap<>();   //unsynchronised
            // Map<String, Integer> students  = new Hashtable<>(); //synchronised

            // students.put("Navin", 89);
            // students.put("prathu", 99);
            // students.put("Navin", 95);
            // students.put("harsh", 83);

            // System.out.println(students);
            // System.out.println(students.get("prathu"));
            // System.out.println(students.keySet());

            // for(String key : students.keySet()){
            //     System.out.println(key + " : " + students.get(key));
            // }

// COMPARATOR VS COMPARABLE-
    // Comparator- own logic for sorting
    // Comparable- power to compare itself

        // Comparator<Integer> com = new Comparator<Integer>()
        // {
        //     public int compare(Integer i, Integer j){
        //         if(i%10 > j%10)
        //             return 1;   //swap
        //         else
        //             return -1;
        //     }
        // };

        // List<Integer> nums = new ArrayList<>();
        // nums.add(43);
        // nums.add(28);
        // nums.add(76);
        // nums.add(50);

        // Collection.sort(nums);
        // Collection.sort(nums, com);

        // System.out.println(nums);



        // Comparator<String> com3 = new Comparator<String>(){
        //     public String compare(String i, String j){
        //         if(i.stringLength() > j.stringLength())
        //             return 1;   //swap
        //         else
        //             return -1;
        //     }
        // };


        // List<String> numms = new ArrayList<>();
        // numms.add("prathu");
        // numms.add("rathu");
        // numms.add("pathu");
        // numms.add("prthu");

        // Collection.sort(numms);
        // Collection.sort(numms, com3);



        // // Comparator<Student> com2 = new Comparator<Student>()
        // // {
        // //     public int compare(Student i, Student j){
        // //         if(i.age > j.age)
        // //             return 1;   //swap
        // //         else
        // //             return -1;
        // //     }
        // // };

        // Comparator<Student> com2 = (Student i, Student j) -> 
        //                 i.age > j.age ? 1 : -1;

        // List<Student> studs = new ArrayList<>();
        // studs.add(new Student(19, "prathu"));
        // studs.add(new Student(21, "rathu"));
        // studs.add(new Student(17, "brathu"));
        // studs.add(new Student(19, "sathu"));
        
        // Collection.sort(studs, com2);

        // for(Student s : studs)
        //     System.out.println(s);


// STREAM API-
    // Filter, Map , Reduce , forEach
    // List<Integer> nums = Arrays.asList(4,9,6,2,8);

    // for(int i=0; i<nums.size(); i++){
    //     System.out.println(nums.get(i));
    // };

    // for(int n : nums){
    //     System.out.println(n);
    // };

    // nums.forEach(n -> System.out.println(n));

    // int sum = 0;
    // for(int n : nums){
    //     if(n%2==0){
    //         n = n*2;
    //         sum = sum + n;
    //     } 
    // }
    // System.out.println(nums);

    // STREAM-
    // List<Integer> nums = Arrays.asList(8,5,6,3,9);

    // Stream<Integer> s1 = nums.Stream();
    // Stream<Integer> s2 = s1.filter(n -> n%2 == 0);
    // Stream<Integer> s3 = s2.map(n -> n*2);

    // int result = nums.Stream()
    //             .filter(n -> n%2==0)
    //             .map(n -> n*2)
    //             .reduce(0, (c,e) -> c+e);

    // System.out.println(result);

    // int res = s3.reduce(0, (c,e) -> c+e);
    // System.out.println(res);

    // s1.forEach(n -> System.out.println(n));
    // s2.forEach(n -> System.out.println(n));
    // s3.forEach(n -> System.out.println(n));
    // s1.forEach(n -> System.out.println(n)); //cant repeat
    // nums.forEach(n -> System.out.println(n));

// STREAM API 2-
    // List<Integer> nums = Arrays.asList(8,5,6,3,9);

    // Predicate<Integer> p = new Predicate<Integer>(){
    //     public boolean test(Integer n) {
    //         if(n%2==0)
    //             return true;
    //         else
    //             return false;
    //     }
    // };
    // Predicate<Integer> p = n -> n%2==0;

    // Function<Integer, Integer> fun = new Function<Integer, Integer>() {
    //     public Integer apply(Integer n) {
    //         return n*2; 
    //     }
    // };
    // Function<Integer, Integer> fun = n -> n*2;
    

    // int result = nums.Stream()
    //             .filter(p)      //n -> n%2==0;
    //             .map(fun)       //n -> n*2;
    //             .reduce(0, (c,e) -> c+e);   //

    // System.out.println(result);

    // Stream filteredValue = nums.parallelStream()
    //             .filter(p)
    // filteredValue.forEach(n -> System.out.println(n));

    // Stream sortedValues = nums.Stream()
    //             .filter(p)
    //             .sorted();

    // sortedValues.forEach(n -> System.out.println(n));

// 
    }
}

// class Student implements Comparable<Student>
// {
//     int age;
//     String name;

//     public Student(int age, String name){
//         this.age = age;
//         this.name = name;
//     }
    
//     public String toString(){
//         return "Std [age=" + age +", name="+ name + "]"
//     }

//     public int compareTo(Student that){
//         if(this.age > this.age)
//             return 1;
//         else 
//             return -1;
//     }
// }

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