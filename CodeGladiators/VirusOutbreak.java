package CodeGladiators;

import java.util.Scanner;

public class VirusOutbreak {
    public static void main(String[] args) throws Exception {

        //Write code here
        Scanner s = new Scanner(System.in);
        String virusComposition = s.nextLine();
        int n = s.nextInt();
        s.nextLine();
        for(int i=0; i<n; i++){
            String str ="";
            String bloodComposition = s.nextLine();
            int a=0; int b=0;
            int lengthOfVirusComposition = virusComposition.length();
            int LengthOfBloodComposition = bloodComposition.length();
            while(a<lengthOfVirusComposition && b<LengthOfBloodComposition){
                if(virusComposition.charAt(a) == bloodComposition.charAt(b)){
                    str = str+virusComposition.charAt(a);
                    a+=1; b+=1;
                }else{
                    a+=1;
                }
            }
            if(str.equals(bloodComposition)){
                System.out.println("POSITIVE");
            }else{
                System.out.println("NEGATIVE");
            }
        }

    }
}