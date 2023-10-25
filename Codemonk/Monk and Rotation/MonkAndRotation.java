/* 
Monk loves to preform different operations on arrays, and so being the principal of Hackerearth School,
he assigned a task to his new student Mishki. Mishki will be provided with an integer array A of size N 
and an integer K ,where she needs to rotate the array in the right direction by K steps and then print the 
resultant array. As she is new to the school, please help her to complete the task.

Sample Input
1
5 2
1 2 3 4 5
Sample Output
4 5 1 2 3
*/

/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;
*/

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
import java.util.Scanner;
class TestClass {
    public static void main(String args[] ) throws Exception {
        /* Sample code to perform I/O:
         * Use either of these methods for input

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String name = br.readLine();                // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        //Scanner
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();                 // Reading input from STDIN
        System.out.println("Hi, " + name + ".");    // Writing output to STDOUT

        */

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t > 0){
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[] = new int[n];
        k = k % n;
        int count = k;
        for(int i = 0; i < n; i++){
            a[i] = sc.nextInt();
        }
        for(int i = 0; i < n ; i++){
            if(count > 0){
                System.out.print(a[n - k + i] + " ");
                count--;
            }
            else{
                System.out.print(a[i - k] + " ");
            }
        }
        t--;
        System.out.println("");
        }
    }
}