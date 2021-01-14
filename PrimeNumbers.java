import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
		int t = s.nextInt();
        for(int j=0; j<t; j++){
		    int n = s.nextInt();
		    if(n>1){
		    int count =0;
		    for(int i=2; i<(int)Math.sqrt(n)+1; i++){
		        if(n%i == 0){
		            count += 1;
		        }
		    }
		    if(count > 0){
		        System.out.println("no");
		    }
		    else{
		        System.out.println("yes");
		    }
		}
		else{
		    System.out.println("no");
		}
        }
    }

}
