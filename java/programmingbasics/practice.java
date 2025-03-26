
import java.util.Scanner;

public class practice
{
    public static void main(String args[])
    {
    // BASIC SYNTAX
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");

        // int n = sc.nextInt();
        // System.out.println(n*n);

        //user input a,b : a>b, remainder when a/b =>
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter dividend: ");
        // int a = 14; //sc.nextInt();
        // System.out.println("Enter divisor: ");
        // int b = 8; //sc.nextInt();

        // int q = a/b;
        // Divisor * quotient + remainder = dividend

        // int remainder = a - (b*q);
        // int r = a%b;

        // System.out.println("a:"+a+" remainder:"+remainder);


        //ASCII
        // char ch = 'a';
        // System.out.println(ch);

        // int a = (int)ch;
        // System.out.println(a);

    // IF ELSE-
        // int n =  5;
        // if( n%2 == 0)
        //     System.out.println("Even : "+n);
        // else 
        //     System.out.println("Odd : "+n);
        

        // int year = 2000;
        // if ( year % 4 == 0){
        //     System.out.println("Leap year");
        // }
        // else {
        //     System.out.println("Not a leap year");
        // }


        // int num = -3;
        // if (num < 0 ){
        //     num = num * (-1);
        //     System.out.println(num);
        // }
        // else {
        //     System.out.println(num);
        // }


        // int cp = 6000;
        // int sp = 5900;
        // int profit = sp - cp;
        // int loss = cp - sp;
        // if (sp > cp){
        //     System.out.println("Profit : "+ profit);
        // }
        // else{
        //     System.out.println("loss : "+ loss);
        // }


        // int l = 12;
        // int  b = 10;
        // int area = l*b;
        // int perimeter = 2*(l+b);
        // if (area > perimeter){
        //     System.out.println("Area is greater : "+area);
        // }
        // else if(area = perimeter){
        //     System.out.println("Area and perimeter are same");
        // }
        // else{
        //     System.out.println("Perimeter  is greater : "+perimeter);
        // }


        // int n = 15;
        // if(n%5 == 0 || n%3 == 0)
        // {
        //     if(n%15 != 0){
        //         System.out.println(n);
        //     }
        // }
        // else 
        // {
        //     System.out.println("fail : "+n);
        // }

        // int a = 5;
        // int b = 3;  
        // int c = 9;

        // int greater = (a>b) ? (a>c ? a : c) : (b>c ? b : c);
        // System.out.println(greater);   

        // int a = 5;
        // int b = 3;  
        // int c = 9;

        // if(a+b>c){
        //     System.out.println("possible");
        // }
        // else if(b+c>a)
        //     System.out.println("possible");
        // else if(a+c>b)
        //     System.out.println("possible");
        // else
        //     System.out.println("not possible");

        // int r = 21;
        // int s = 19;
        // int p = 18;
        // int young = r<s ? (r<p ? "r"+r : "p"+p) : (s<p ? "s"+s : "p"+p);

        // int x=3;
        // int y=0;
        // if(x==0){
        //     if(x==0 && y==0)
        //         System.out.println("origin");
        //     else
        //         System.out.println("y-coordinate");
        // }
        // else{
        //     System.out.println("x-coordinate");
        // }

        // int x=2, y=3, x1=2, y1=3;
        // int r= 12;
        // int d1 = (x-x1)*(x-x1);
        // int d2 = (y-y1)*(y-y1);
        // int d = ( d1 + d2);
        // if(d*d > r*r)
        //      System.out.println("outside");
        // else if(d*d < r*r)
        //      System.out.println("inside");
        // else
        //      System.out.println("surface");

    // LOOPS-
        // divisible by 3
        // for(int i=1; i<=50; i++){
        //     if(i%3 == 0)
        //         System.out.println(i);
        // }

        //odd number
        // for(int i=1; i<=10; i++){
        //     if(i%2==0) continue;
        //     System.out.println(i);
        // }
        // for(int i=1; i<=20; i+=2){
        //     System.out.println(i);
        // }

        // even number
        // for(int i=1; i<=10; i++){
        //     if(i%2==1) continue;
        //     System.out.println(i);
        // }

        // for(int i=1; i<=10; i++){
        //     int n = i*19;
        //     System.out.println(n);
        // }

        // for(int i=10; i>=1; i--){
        //     i = i/2;
        //     System.out.println(i);
        // }

        // int n = 9;
        // for(int i=1; i<=2*n-1; i+=2){
        //     System.out.println(i+" >");
        //     for(int j=4; j<=3*n-1; j+=3){
        //         System.out.println(j+" ");
        //     }
        // }

        // int a=1, r=3;
        // for(int i=1; i<= n ;i++){
        //     System.out.println(a+" ");
        //     a *= r;
        // }


        // PRIME
        // int n = 45;
        // int hf = 1;
        // for(int i=1; i<=n; i++){
        //     if(n%i == 0){
        //         System.out.println(i);
        //     }
        // }

        // int n = 64;
        // int hf = 1;
        // for(int i=1; i<=n; i++){
        //     if(n%i==0){
        //         hf = i;
        //     };
        // }
        // System.out.println(hf);

        // int n = 64;
        // int hf = 1;
        // for(int i=n-1; i>=1; i--){
        //     if(n%i==0){
        //         hf = i;
        //         break;
        //     }
        // }
        // System.out.println(hf);

        // int n = 40;
        // boolean flag = false;   //false = prime
        // // for(int i=2; i<n; i++){
        // for(int i=2; i<Math.sqrt(n); i++){
        //     if(n%i==0){
        //     //     System.out.println("Composite");
        //         flag = true;    //true = composite
        //         break;
        //     }
        // }
        // if(n==1)
        //     System.out.println("neither Prime nor Composite");
        // else if(flag==false)
        //     System.out.println("Prime");
        // else
        //     System.out.println("Composite");

        // if i is factor of n then, n/i is also a factor

        // int n = 78349;
        // int sum = 0;
        // while(n!=0){
        //     int ld = n%10;
        //     sum += ld;
        //     n /= 10;
        // }
        // System.out.println(sum);

        // int n = 383;
        // int pro = 1;
        // while(n!=0){
        //     int ld = n%10;
        //     pro = pro * ld;
        //     n = n/10;
        // }
        // System.out.println(pro);

        // int n = 702;
        // int ld,pro = 1;
        // while(n!=0){    //70,7
        //     ld = n%10;      //2,0
        //     if(ld!=0){
        //         pro *= ld;  //2
        //         n /= 10;    //70
        //         }
        //     else 
        //         n = n/10;   //7
        //  }
        // System.out.println(pro);

        //to print sum of even digit
        // int n = 954;
        // int ld, sum = 0;
        // while(n!=0){
        //     ld = n%10;
        //     if(ld%2==1)
        //         sum += ld;
        //     n = n/10;
        // }
        // System.out.println(sum);

        //reverse of num
        // int n = 7483;
        // int ld, r = 0;
        // while(n!=0){
        //     ld = n%10;  //3,8,4,7
        //     // System.out.println(ld);
        //     r = (r*10)+ld; //3847
        //     n = n/10;
        // }
        // System.out.println(r);
        // int sum = n+r;
        // System.out.println(sum);

        //factorial
        // int r=1, n = 5;
        // for(int i=n; i>=2; i--){
        //     r = r*i;
        // }
        // System.out.println(r);

        // ASCII-
        // int(int i=65; i<=90; i++){
        //     System.out.println(i +" " + (char)i)
        // }

    // ARRAYS-
        // int[] arr = {4,2,8,9,7,};
        // arr[2] = 0;
        // System.out.println(arr[2]); //access

        // int[] arr1 = new int[5];
        // arr1[0] = 4;
        // arr1[4] = 9;
        // System.out.println(arr1[4]);    //default zero

        // int[] arr = {45,6,98,64,25,90,76};
        // for (int i=0; i<=arr.length; i++){
        //     System.out.println(arr[i]+ " ");
        // }

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter array size: ");
        // int n = sc.nextInt();
        // int[] arr = new int[n];

        // System.out.println("Enter array: ");
        // for(int i=0; i<n; i++){
        //     arr[i] = sc.nextInt();
        // }
        // for(int i=0; i<n; i++){
        //     System.out.println(arr[i]+" ");
        // }

        // int[] marks = {56,43,56,90,29,69};
        // for(int i=0; i<marks.length; i++){
        //     if(marks[i]<35)
        //         System.out.println(marks[i]+" index: "+i);
        // }

        // int[] arr = {78,42,56,89,65};
        // int sums = 0;
        // for(int i=0; i<arr.length; i++){
        //     sums += arr[i];
        // }
        // System.out.println(sums);

        // int[] data = {32,45,56,69,98};
        // int sum = 0;
        // for(int i=0; i<data.length; i++){
        //     if(data[i]<35)
        //         System.out.println(i);
            
        //     sum += data[i];
        // }
        // System.out.println(sum);

        // int x = 9;
        // int[] arr = {3,7,9,4,0};
        // boolean flag = false;
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i]==x){
        //         flag = true;
        //         break;
        //     }
        // }
        // if(flag==true)
        //     System.out.println("Mila");
        // else
        //     System.out.println("nhi mila");

        // int[] arr = {45,6,78,76,53,88};
        // int max = arr[0];
        // for(int i=0; i<arr.length; i++){
        //     if(arr[i] > max)
        //         max = arr[i];
        // }
        // System.out.println(max);

        // int[] arr1 = {24,67,54,67,56};
        // int large = Integer.MIN_VALUE;
        // for(int i=0; i<arr1.length;i++){
        //     if(arr1[i] > large)
        //         large = arr1[i];
        // }
        // int sec = Integer.MIN_VALUE;
        // for(int i=0; i<arr1.length; i++){
        //     if(arr1[i] > sec && arr1[i] != large)
        //         sec = arr1[i];
        // }
        // System.out.println(large);
        // System.out.println(sec);

    // ARRAY TO METHODS-
    // PATTERN PRINTING-
        //star rec
        // int n = 3;  //rows
        // int m = 5;  //coloumns
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=m; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // int n=4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         // System.out.print(i+" ");
        //         System.out.print(j+ " ");
        //     }
        //     System.out.println();
        // }
        
        // int n=4;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         System.out.print((char)(j+64)+ " ");
        //     }
        //     System.out.println();
        // }

        //Triangle
        // int n = 4;
        // for(int i=1; i<=n; i++){    //1
        //     for(int j=1; j<=i; j++){  //1
        //         System.out.print("*");
        //         // System.out.print((2*j-1)+" ");
        //     }
        //     System.out.println();
        // }

        // String m = "prathu";
        // for(int i=1; i<=m.length(); i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(m.charAt(1)+" ");
        //     }
        //     System.out.println();
        // }

        // String m = "prathu";
        // for(int i=1; i<=m.length(); i++){
        //     for(int j=m.length(); j>=i; j--){
        //         System.out.print(m.charAt(1)+" ");
        //     }
        //     System.out.println();
        // }

        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         if(i%2==0)
        //             System.out.print((char)(j+64)+ " ");
        //         else 
        //             System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        // int n = 4;
        // int a = 1;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=i; j++){
        //         System.out.print(a+" ");
        //         a += 1;
        //     }
        //     System.out.println();
        // }

        // int n=4;
        // for(int i=1; i<=n; i++){
        //     // for(int j=1; j<=i; j++){
        //     //     if(i%2!=0){
        //     //         if(j%2!=0) System.out.println(1+" ");
        //     //         else System.out.print(0+" ");
        //     //     }
        //     //     else{
        //     //         if(j%2==0) System.out.println(1+" ");
        //     //         else System.out.print(0+" ");
        //     //     }
        //     // }
        //     for(int j=1; j<=i; j++){
        //         if((i+j)%2 == 0)
        //             System.out.print(1+" ");
        //         else 
        //             System.out.print(0+" ");
        //     }
        //     System.out.println();
        // }

        // int n=5;
        // for(int i=1; i<=n; i++){
        //     for(int j=1; j<=n; j++){
        //         if(i==(n/2+1) || j==(n/2+1)){
        //             System.out.print("*"+" ");
        //         }
        //         else    
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

        // int n=5;
        // int m=4;
        // for(int i=1; i<=m; i++){
        //     for(int j=1; j<=n; j++){
        //         if(i==1 || i==m || j==1 || j==n)
        //             System.out.print("*");
        //         else 
        //             System.out.print(" ");
        //     }
        //     System.out.println();
        // }

    

    }
}

