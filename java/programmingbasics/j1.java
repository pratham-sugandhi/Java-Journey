public class j1
{
    public static void main(String args[])
    {
// Hello World-
        // System.out.println("Helloo");


// Variable-
        // int num1 = 3;
        // int num2 = 5;
        // int res = num1 + num2;
        // System.out.println(res);


// DATA TYPES-

        // int num = 3;
        // byte by = 127;
        // short sh = 453;
        // long l =4953l;

        // float marks = 6.5f;
        // double d = 5.7;
        
        // char c = 'c';

        // boolean b = true;



//literals- 3,127,...
//Type Conversion and Casting
        // int a = 257;
        // byte k = (byte) a;

        // float f =758.89f;
        // int t = (int) f;

        // System.out.println(k);  // 257% = 257/256
        // System.out.println(t);

// Type Promotions
        // byte a = 10;
        // byte b = 30;

        // int res = a * b;
        // System.out.println(res);


// ARITHMETIC OPERATION
        // int num1 = 78;
        // int num2 = 433;

        // int res = num1 + num2;
        // int res = num1 - num2;
        // int res = num1 * num2;
        // int res = num1 / num2;
        // int res = num1 % num2;

        // num1 = num1 + 2;
        // num += 2;
        // num -= 2;

        //num1 = num1 + 1;
        // num++;    //increment
        // ++num;
        // num--;    //decrement
        // --num;

        // System.out.println(num1);
    

// RELATIONAL OPERATION
        // int x = 5;
        // int y = 3;
        // boolean res = x != y;

        // System.out.println(res);

// LOGICAL OPERATION
        // int x = 5;
        // int y = 8;
        // int a = 3;
        // int b = 9;

        // boolean res = x>y || a<b;
        // boolean res = x<y && a<b;

        // System.out.println(!res);


// CODITIONAL STATEMENT
        // IF ELSE-
        // int x = 12; 
        // if(x > 10 && x <= 20)
        //      System.out.println("hlooo");
        // else
        //      System.out.println("hrlooo");
        
        // int s = 45;
        // int h = 85;
        // if(s > h)
        // {
        //      System.out.println("hlooo");
        //      System.out.println("hooo");
        // }
        // else
        //      System.out.println("hrlooo");

        // int s = 45;
        // int h = 85;
        // int p = 0;

        // if(s>h && s>p)
        //      System.out.println(s);
        // else if (h>s && h>p)
        //      System.out.println(h);
        // else
        //      System.out.println(p);


        //TERNARY OPERATOR
        // (codn) ? true : false;

        // int n = 5;
        // int res = 0;
        // res = n<2 == 0 ? 10 : 20;
        // System.out.println(res);


// SWITCH STATEMENT

        // int n = 6;

        // switch(n){
        //      case 1:
        //         System.out.println("Monday");
        //         break;
        //      case 2:
        //         System.out.println("Tuersday");
        //         break;
        //      case 3:
        //         System.out.println("Wednesday");
        //         break;
        //      case 4:
        //         System.out.println("Thursday");
        //         break;
        //      case 5:
        //         System.out.println("Friday");
        //         break;
        //      case 6:
        //         System.out.println("Saturday");
        //         break;
        //      case 7:
        //         System.out.println("Sunday");
        //         break;

        //      default:
        //         System.out.println("enter valid number");
        // }
        
        // String day = "Sunday";
        // String res = "";

        // switch(day)
        //     {
        //         case "Saturday", "Sunday" -> res = "6 am";
        //         case "Monday" -> res = "8 am";
        //         default -> res = "7 am";
        //     } 
        //     System.out.println(res);
      

// LOOPS- 
    // WHILE LOOP
        // int i = 1;
        // while(i<=5)
        // {
        //     System.out.println("Hi, " + i);
        //     int j = 1;
        //     while(j<=3)
        //     {
        //         System.out.println("Hello " + j);
        //         j++; 
        //     }
        //     i++;
        // }
        // System.out.println("byee "+ i);



    // DO WHILE
        // int j = 5;
        // do
        // {
        //      System.out.println("Hi, " + j);
        //      j++;
        // } while (j<=4);



    // FOR LOOP
        // for(int i=1; i<=4; i++)
        // {
        //         System.out.println("Hiii " +i);
        //         for(int j=1; j<=9; j++)
        //         {
        //              System.out.println("  " + (j+8) + "-" + (j+9));   
        //         }
        // }


// OBJECTS- everything need obj 
//         to add two numbers i need obj //OOP
//         Object - Properties(knows) & Behaviours(does)
//         Class - blueprint for obj
//         Class -> JVM -> Obj

        // int num1 = 4;           //primitive var
        // int num2 = 7;

        // Calculator calc = new Calculator();                //reference var -> Object
        // int res = calc.add(num1 , num2);
        // System.out.println(res);

        // Computer obj = new Computer();
        // obj.playMusic();
        // String str = obj.getMeAPen(10);
        // System.out.println(str);

// ARRAYS-
        // int nums[] = {3,5,4,3};
        // int nums[] = new int[4];
        // nums[1] = 6;

        // System.out.println(nums[1]);
        // for(int i=0; i<=3; i++)
        // {
        //         System.out.println(nums[i]);
        // }
        
        

    }
}

// class Calculator        //designing
// {
//         int a;          //instantaneous variable- heap memo 

//         public int add(int n1, int n2)        //method
//         {
//                 int r = n1 + n2;
//                 return r;
//         }

//         public int add(int n1, int n2, int n3)        //method
//         {
//                 return n1 + n2 + n3;
//         }

//         public double add(double n1, int n2, int n3)        //method
//         {
//                 return n1 + n2 + n3;
//         }
// }

// class Computer
// {
//     public void playMusic()
//     {
//         System.out.println("Playing");
//     }

//     public String getMeAPen(int cost)
//     {
//         if(cost >= 10)
//             return "Pen";
//         else 
//             return "Nothing"; 
//     }
// }

// Every method has thier own stack