import java.util.Scanner;

public class Knapsack_01_DP_TD {
    int knapsackByDpTD(int W, int[]values, int[]weights, int n){
        int[][] Matrix = new int[n+1][W+1];
        for(int i=0; i<=n; i++){
            for (int j=0; j<=W; j++){
                if(i==0 || j==0){
                    Matrix[i][j] = 0;
                }
                else if(weights[i-1] <= j){
                   Matrix[i][j] = Math.max(values[i-1]+Matrix[i-1][j-weights[i-1]], Matrix[i-1][j]);
                }
                else {
                    Matrix[i][j] = Matrix[i-1][j];
                }
            }
        }
        return Matrix[n][W];
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Knapsack_01_DP_TD obj = new Knapsack_01_DP_TD();
        System.out.print("Enter capacity of knapsack :  ");
        int W = s.nextInt();

        System.out.print("Enter total number of itms : ");
        int n = s.nextInt();

        int[] values = new int[n];
        int[] weights = new int[n];
        System.out.println("Enter values if items : ");
        for(int i=0; i<n; i++){
            values[i] = s.nextInt();
        }
        System.out.println("Enter weights of items : ");
        for(int j=0; j<n; j++){
            weights[j] = s.nextInt();
        }

        System.out.print("Maximum profit is : " + obj.knapsackByDpTD(W,values,weights,n));
    }
}
