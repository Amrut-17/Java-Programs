import java.util.Scanner;

class Knapsack_01_recursive{
    int knapsack(int W, int[]value, int[]weight, int n){
        if (W == 0 || n == 0)
            return 0;
        if(weight[n-1] > W){
            return knapsack(W, value, weight, n-1);
        }
        else {
            return Math.max(value[n-1]+knapsack(W-weight[n-1],value,weight,n-1),
                    knapsack(W,value,weight,n-1));
        }

    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Knapsack_01_recursive obj = new Knapsack_01_recursive();
        System.out.print("Enter capacity of knapsack : ");
        int capacity = s.nextInt();

        System.out.print("Enter total number of items : ");
        int n = s.nextInt();

        int[] value = new int[n];
        int[] weight = new int[n];
        System.out.println("Enter VALUE : ");
        for (int i=0; i<n; i++){
            value[i] = s.nextInt();
        }
        System.out.println("Enter WEIGHT's : ");
        for (int j=0; j<n; j++){
            weight[j] = s.nextInt();
        }

        System.out.println("Maximum profit : "+obj.knapsack(capacity, value, weight, n));


    }
}