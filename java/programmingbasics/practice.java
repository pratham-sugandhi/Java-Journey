
import java.util.Scanner;

public class practice
{
    public static void main(String args[])
    {
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter a number : ");

        // int n = sc.nextInt();
        // System.out.println(n*n);


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


        int n = 15;
        if(n%5 == 0 || n%3 == 0)
        {
            if(n%15 != 0){
                System.out.println(n);
            }
        }
        else 
        {
            System.out.println("fail : "+n);
        }
    }
}