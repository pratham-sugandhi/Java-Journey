
class Student
{
    int rollno;
    String name;
    int marks;
}

public class j2
{
    public static void main(String args[])
    {

        int nums[] = new int[4];
        nums[0] = 4;
        nums[1] = 3;
        nums[2] = 9;
        nums[3] = 7;

        for(Student stud : students)
        {
            System.out.println(stud.name + " : " + stud.mark);
        }

        Student s1 = new student();
        s1.rollno = 1;
        s1.name = "Rahul";
        s1.marks = 89;

        Student s2 = new student();
        s2.rollno = 2;
        s2.name = "Mohit";
        s2.marks = 98;

        Student s3 = new student();
        s3.rollno = 3;
        s3.name = "Nigam";
        s3.marks = 83;

        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        for(int i=0; i<students.length; i++)
        {
            // System.out.println(students[i].name + " : " + students[i].marks);
        }
// ARRAYS-
        // int nums[][] = new int [3][4];

        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         nums[i][j] = (int)(Math.random() * 10);
        //         // System.out.println(nums[i][j]);
        //     }
        // }

        // for(int i=0; i<3; i++)
        // {
        //     for(int j=0; j<4; j++)
        //     {
        //         // System.out.print(nums[i][j] + " ");
        //     }
        //     // System.out.println();
        // }

        // for(int n[] : nums)
        // {
        //     for(int m : n)
        //     {
        //         // System.out.print(m + " ");
        //     }
        //     // System.out.println();
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
    
    }

}