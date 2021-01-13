/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner s = new Scanner(System.in);
		
		int d;
		int maxDifference = 0 ;
		String word;
		
		word = s.nextLine();
		
        int a = word.indexOf('a');
        int b = word.indexOf('b');
        int c = word.indexOf('c');
        
        int length = word.length();
        
        for(int i=length-1; i>=0; i--){
            if(a == -1){
                break;
            }
            
            if(word.charAt(i) != word.charAt(a)){
                d = i-a;
                if(d>maxDifference){
                    maxDifference = d;
                }
                break;
            }
        }
        
        for(int i=length-1; i>=0; i--){
            if(b == -1){
                break;
            }
            if(word.charAt(i) != word.charAt(b)){
                d = i-b;
                if(d>maxDifference){
                    maxDifference = d;
                }
                break;
            }
        }
        for(int i=length-1; i>=0; i--){
            if(c == -1){
                break;
            }
            if(word.charAt(i) != word.charAt(c)){
                d = i-c;
                if(d>maxDifference){
                    maxDifference = d;
                }
                break;
            }
        }
        
        System.out.println(maxDifference);
    }
}
