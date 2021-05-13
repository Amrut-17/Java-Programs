package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class UniquePaths {
    static class FastReader {
        BufferedReader br;
        StringTokenizer st;

        public FastReader()
        {
            br = new BufferedReader(
                    new InputStreamReader(System.in));
        }

        String next()
        {
            while (st == null || !st.hasMoreElements()) {
                try {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }

        long nextLong() {
            return Long.parseLong(next());
        }

        double nextDouble()
        {
            return Double.parseDouble(next());
        }

        String nextLine()
        {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
    }

    public static void main(String[] args)
    {
        FastReader s = new FastReader();

        int m = s.nextInt();
        int n = s.nextInt();
        int[][] dp = new int[m][n];
        for (int i=0; i<m; i++){
            for (int j=0; j<n; j++){
                if (i==0 || j==0){
                    dp[i][j] = 1;
                }else {
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        System.out.println(dp[m-1][n-1]);
    }
}

//EXPLANATION :
//- SOLVED BY RECURSION AND
//- DYNAMIC PROGRAMMING
//- DP IS BEST
//
//CONSIDER :
//
//    |S   | 1  | 1  |
//    | 1  | 2  | 3  |
//    | 1  | 3  | 6 E|
//
//HERE S = start and E = end
//now at 1st row and 1st column all entries are 1 because of condition of
//the bot that it can only move to either downward or to right so dp[i][j] = 1 if i=0 or j =0
//now at dp[1][1] this position have two choices either right or down so dp[1][1] = dp[0][1] + dp[1][0]
//following the same in the END block we get answer.