/* inversion of matrix 
{(i, j), (p, q)}
i <= p & j <= q
M[i][j] > M[p][q]
*/

import java.util.*;

class TestClass {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t != 0) {
            int n = sc.nextInt();
            int inversion = 0;
            int M[][] = new int[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    M[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n; i++) {
                for (int p = 0; p < n; p++) {
                    for (int j = 0; j <= i; j++) {
                        for (int q = 0; q <= p; q++) {
                            if (M[i][p] < M[j][q]) {
                                inversion++;
                            }
                        }
                    }
                }
            }
            System.out.println(inversion);
            t--;
        }
        sc.close();

    }
}