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
        StringBuilder s = new StringBuilder();
        int t = sc.nextInt(), n, k, a[], count, i;
        while(t > 0){
            a = new int[n = sc.nextInt()];
            count = k = sc.nextInt() % n;
            for(i = 0; i < n; i++) a[i] = sc.nextInt();
            for(i = 0; i < n ; i++)
            if (count <= 0) s.append(a[i - k]).append(' ');
            else {
                s.append(a[n - k + i]).append(' ');
                count--;
            }
            t--;
            s.append('\n');
        }
        System.out.println(s);
        sc.close();
    }
}