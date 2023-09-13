package wecp;

import java.io.*;
import java.util.*;
import java.lang.Math;
public class MissingKeyboard {
    public static int missingKeyboards(int[] Arr){
        int count=0;
        Arrays.sort(Arr);       //8 10 12 13
        int ele=Arr[0];
        for(int i=1;i<Arr.length;i++)
        {
            if(Arr[i]-ele>1)
            {
                count=count+((Arr[i]-ele)-1);
            }
            ele=Arr[i];
        }
       
        return count;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N;
        N=scan.nextInt();
        int[] Arr = new int[N];
        for(int j=0;j<N;j++){
            Arr[j]=scan.nextInt();
        }
        int result;
        missingKeyboards(Arr);
         result = missingKeyboards(Arr);
         System.out.print(result);
        return ;
    }
}
