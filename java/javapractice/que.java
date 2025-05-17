
public class que{
    public static void main(String args[]){
        // print multiplication table
            // int f=6, p;
            // for(int i=1; i<=10; i++){
            //     p = f*i;
            //     System.out.println(p);
            // }

        // sum all odd num
            // int add=1,n=30;
            // for(int i=1; i<=n; i++){
            //     if(i%2 != 0){
            //         add = add + i;
            //     }
            // }
            // System.out.println(add);

        // calculate factorial
            // int f=1, n=5;
            // while(n > 1){
            //     f = f*n;
            //     n--;
            // }
            // System.out.println(f);

        // sum of digit
            // int a=101, r, sum = 0;
            // while(a != 0){
            //     r = a%10;
            //     sum = sum + r;
            //     a = a/10;
            // }
            // System.out.println(sum);

        // GCD & LCM-
            // int a = 12, b = 15;
            // LCM obj = new LCM();
            // int res = obj.lcm(12,15);
            // System.out.println(res);

        // reverse digit
            // int a=123, r, rev=0;
            // while(a != 0){
            //     r = a%10;
            //     rev = rev * 10 + r;
            //     a = a/10;
            // }
            // System.out.println(rev);

        // FIBONACCI- (c=a+b)   0 1 1 2 3 5 8 13 21
            // int a=0, b=1, c, n=7, i=1;
                // System.out.println(a);
                // System.out.println(b);
            // while(i <= n){
            //     c = a+b;
            //     System.out.println(c);
            //     a = b;
            //     b = c;
            //     i++;
            // }

        // ARMSTRONG-
            // int a=153, r, sum=0;
            // int temp = a;
            // while(a != 0){
            //     r = a % 10; //3
            //     sum = sum + r * r * r;  //27 
            //     a = a / 10;
            // }
            // if(sum == temp){
            //     System.out.println("Armstrong");
            // }
            // else 
            //     System.out.println("not a Armstrong");

        // PALINDROME-
            // int a=151, r , sum = 0;
            // int temp = a;
            // while(a != 0){
            //     r = a % 10;
            //     sum = sum * 10 + r;
            //     a = a / 10;
            // }

            // if(sum == temp){
            //     System.out.println("Palindrome");
            // }
            // else 
            //     System.out.println("not a Palindrome");

        //  find all the divisors of n. Return all the divisors of n as an array 
            // Solution solution = new Solution();
            // int[] result = solution.divisors(32);
            // System.out.println(java.util.Arrays.toString(result));

        // Given an array arr of size n, the task is to find the sum of all the elements in the array.
            // Solution solution = new Solution();
            // System.out.println(solution.sum([1,3,4,2,5,1], 5)); 

        // Given an array arr of n elements. The task is to reverse the given array. The reversal of array should be inplace.
            // Solution solution = new Solution();
            // System.out.println(solution.rev[]);

        // Given an array of n integers, find the most frequent element in it i.e., 
            // the element that occurs the maximum number of times. 
            // If there are multiple elements that appear a maximum number of times, find the smallest of them.

        // Given an array of n integers, find the second most frequent element in it.
            // If there are multiple elements that appear a maximum number of times, 
            // find the smallest of them. If second most frequent element does not exist return -1.

        // Given an array of n integers, find the sum of the frequencies of the highest occurring number and lowest occurring number.
        // [1, n]

        
        // Solution sol = new Solution();
        // System.out.println(sol.counting(20));

        // int nums[][] = new int [3][];
        // nums[0] = new int[3];
        // nums[1] = new int[4];
        // nums[2] = new int[2];

        // for(int i=0; i<nums.length; i++){
        //     for(int j=0; j< nums[i].length;){
        //         nums[i][j] = (int)(Math.random() * 10);
        //     }
        // }

        // for(int n[] : nums){
        //     for(int m : n){
        //         System.out.print(m + " ");
        //     }
        //     System.out.println();
        // }

    // SECOND LARGEST
        // int nums[] = new int[4];
        // nums[0] = 7;
        // nums[1] = 9;
        // nums[2] = 5;
        // nums[3] = 9;
        // int largest = -1;
        // int secondLargest = -1;

        // for(int i=0; i<nums.length; i++){
        //     if(nums[i] > largest){
        //         secondLargest = largest;    //-1 7 9
        //         largest = nums[i];  //7 9 9
        //     } else if(nums[i] > secondLargest && nums[i] !=largest){
        //         secondLargest = nums[i];
        //     }
        // }
        // System.out.print(secondLargest);

    //CONSECUTIVE 1S
        // int nums[] = {0,1,1,1,0,1,1};
        // int currentCount = 0;
        // int maxCount = 0;   
        // for(int num : nums){
        //     if(num==1){
        //         currentCount++;
        //         if(currentCount > maxCount){
        //             maxCount = currentCount;   
        //         }
        //     }
        //     else {
        //         currentCount = 0;
        //     }
        // }
        // System.out.println(maxCount);

    // LEFT BY 1
        // nums = [1, 2, 3, 4, 5]  output: [2, 3, 4, 5, 1]
            int nums[] = {0,1,1,1,0,1}; //1,1,1,0,1,
            int k=1;
            
            for(int num : nums){
                
            }


        // rotate left by k
    }
}

// class Solution{
//         public int counting(int n){
           
//             int count = 0;
//             for(int i=2; i<=n; i++){ 
//                 int f=1;
//                 for(int j=2; j<i; j++){
//                     if(i%j == 0 ){
//                         f = 0;
//                         break;
//                     }else
//                        f=1;
//                 }
//                 if(f==1)
//                     count++;
//             }
//             return count;
//         }
// }

// class Solution {
//     public void reverse(int[] arr, int n) {
//         int r;
//         int rev[] = new int[n];

//         for(int i=0; i < n; i++){
//             r = arr[i] % 10;
//             // rev = rev * 10 + r;
//             rev[i] = r;
//             arr[i] = arr[i] / 10; 
//         }
//         return rev;
//     }
// }

// class Solution {
//     public  int sum(int arr[], int n) {
//         // int arr[] = new int[n];

//         int sum = 0;
//         for(int i=0; i<arr.length; i++){
//             sum = sum + arr[i];
//         }

//         return sum;
//     }
// }

// class Solution{
//     public int[] divisors(int n){
//         int count = 0;
//         for(int i=1; i<=n; i++){
//             if(n % i == 0){
//                 count++;
//             }
//         }

//         int[] divisor = new int[count];
//         int j=0;

//         for(int i=1; i<=n; i++){
//             if(n % i == 0){
//                 divisor[j] = i;
//                 j++;
//             }
//         }
//         return divisor;
//     }
// }

// class LCM{
//     public int gcd(int a, int b){
//         while(b != 0){
//             int temp = b;   //15 12 3
//             b = a % b;     
//             // System.out.println(b+" :");  //12 3 0
//             a = temp;
//             // System.out.println(a);  //15 12 3
//         };
//         return a;
//     }

//     public int lcm(int a, int b){
//         return (a*b) / gcd(a,b);
//     }
// }

