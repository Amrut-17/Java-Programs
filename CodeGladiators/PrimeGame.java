package CodeGladiators;

import java.util.Scanner;

public class PrimeGame {
    static boolean[] prime = new boolean[1000001];

    public static void primeSieve(){

        for (int i=1; i<1000001; i++){
            prime[i] = true;
        }

        for(int i=2; i<=Math.sqrt(1000001); i++){
            if (prime[i]){
                for (int j=i*i; j<1000001;j+=i){
                    prime[j] = false;
                }
            }
        }
        prime[1] = false;
        prime[2] = true;
    }


    public static void main(String[] args) {
        primeSieve();
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();

        long diff;
        long min = 0;
        long max =0;
        while (t-->0){
            boolean flag = false;
            int count =0;
            long l = s.nextLong();
            long r = s.nextLong();
            if (r==l){
                flag = true;
            }else{
                min = Integer.MAX_VALUE;
                max = 0;
                for (int x = (int) l; x<=r; x++) {
                    if (prime[x]) {
                        if (min > x) {
                            min = x;
                        }
                        if (max < x) {
                            max = x;
                        }
                        count++;
                    }
                }
            }
            if (flag){
                System.out.println("0");
            }else if(count ==0){
                System.out.println("-1");
            }
            else {
                diff = max-min;
                System.out.println(diff);
            }
        }
    }
}
