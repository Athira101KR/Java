package hackathon;

import java.io.*;
import java.util.*;
import java.lang.Math;


public class sentenceWithoutVowels {
    public static String removeVowels(int N, String S) {
        // Write your code here
       // System.out.println(S);
       String s="";
       for(int i=N-1;i>=0;i--)
       {
           if(S.charAt(S.length()-1)=='a'||S.charAt(S.length()-1)=='e'||S.charAt(S.length()-1)=='i'||S.charAt(S.length()-1)=='o'||S.charAt(S.length()-1)=='u'
           ||S.charAt(S.length()-1)=='A'||S.charAt(S.length()-1)=='E'||S.charAt(S.length()-1)=='I'||S.charAt(S.length()-1)=='O'||S.charAt(S.length()-1)=='U')
           {
              S=S.substring(0, S.length()-1);
           }
       }
     //  System.out.println(S.length());
        return S;
    
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    
        int N = Integer.parseInt(scan.nextLine().trim());
        
        String S = scan.nextLine();
    
        String result = removeVowels(N, S);
    
        System.out.println(result);
    }
}
