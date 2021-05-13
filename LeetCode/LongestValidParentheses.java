package LeetCode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class LongestValidParentheses {
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

        String str = s.nextLine();

        Stack<Integer> st = new Stack<>();
        int left = -1;
        int maxLength =0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == '('){
                st.push(i);
            }else{
                if(st.isEmpty()) {
                    left = i;
                }else {
                    st.pop();
                    if (st.isEmpty()){
                        maxLength = Math.max(maxLength, i-left);
                    }else {
                        maxLength = Math.max(maxLength, i-st.peek());
                    }
                }
            }
        }
        System.out.println(maxLength);
    }
}


