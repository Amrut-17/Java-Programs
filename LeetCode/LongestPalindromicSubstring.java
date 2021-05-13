package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class LongestPalindromicSubstring {
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
        int start =0; int end =0;
        String str = s.nextLine();
        boolean[][] arr = new boolean[str.length()][str.length()];
        for(int x=0; x<str.length(); x++){
            for (int i=0, j=x; j<str.length(); i++, j++){
                if (x == 0){
                    arr[i][j] = true;
                }else if (x == 1){
                    if (str.charAt(i) == str.charAt(j)){
                        arr[i][j] = true;
                    }else {
                        arr[i][j] = false;
                    }
                }else {
                    if (str.charAt(i) == str.charAt(j) && arr[i + 1][j - 1]){
                        arr[i][j] = true;
                    }else {
                        arr[i][j] = false;
                    }
                }
                if (arr[i][j]){
                    start = i; end  =j;
                }
            }
        }
        System.out.println(str.substring(start, end+1));
    }
}


