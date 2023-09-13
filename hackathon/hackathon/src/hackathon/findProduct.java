package hackathon;

import java.io.*;
import java.util.*;
import java.lang.Math;
//X=7 Y=5
//A+B=7
//A-B=5
//			a=12-7=5
//So A=6 and B=1
//Hence A*B=6*1=6.


public class findProduct {
//    public static int solution(int X, int Y) {
//        // Write your code here
//    String	A="abc";
//    	for(int i=0;i<A.length();i++)
//    	{
//    		if(Character.isUpperCase(A.charAt(i)))
//    		{
//    			System.out.println("is upper");
//    		}
//    	}
//    	
//    	
//    	
//    return 0;
//    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//    
//        int X = Integer.parseInt(scan.nextLine().trim());
//        
//        int Y = Integer.parseInt(scan.nextLine().trim());
//    
//        int result = solution(X, Y);
//    
//        System.out.println(result);
//    	
//    	List<Integer> a = new ArrayList<>();
//    	a.add(10);
//    	a.add(2);
//    	a.add(2);
//    	a.add(3);
//    	a.sort();
//    	if(!a.contains(10))
//    	{
//    		System.out.println(a);
//    	}
//		------------------------------------------    	
//
////    	7-A
////    	5-B
////    	6-Z
////    	A+B=7
////    	A-B=5
////
////    	So A=6 and B=1
////    	Hence A*B=6*1=6.
//    	
//    	import java.io.*;
//    	import java.util.*;
//    	import java.lang.Math;
//
//
//    	public class Solution {
//    	    public static int findProduct(int X, int Y) {
//    	        // Write your code here
//    	          int A=(X+Y)/2;
//    	        int B=(X-Y)/2;
//    	        return A*B;
//    	    
//    	    
//    	    }
//
//    	    public static void main(String[] args) {
//    	        Scanner scan = new Scanner(System.in);
//    	    
//    	        int X = Integer.parseInt(scan.nextLine().trim());
//    	        
//    	        int Y = Integer.parseInt(scan.nextLine().trim());
//    	    
//    	        int result = findProduct(X, Y);
//    	    
//    	        System.out.println(result);
//    	    }
//    	}
 //   	-------------------------------------------------
    	
////    	N=3
////    	S="eat"
////
////    	Sorting all the vowels in S and not changing consonants will result in B="aet".
////    	
////		N=6
////		S="create"
////
////		c, r, and t wont change positions because these are consonants, and vowels will be sorted hence the B="craete".
//    	
//    	import java.io.*;
//    	import java.util.*;
//    	import java.lang.Math;
//
//
//    	public class Solution {
//    	    public static String sortVowels(int N, String S) {
//    	        // Write your code here
//    	        // String s="",finS="";
//    	        // int f=0,l=0;
//    	        // for(int i=0;i<N;i++)
//    	        // {
//    	            
//    	        //     if(S.charAt(i)=='a'||S.charAt(i)=='e'||S.charAt(i)=='i'||S.charAt(i)=='o'||S.charAt(i)=='u'
//    	        //     ||S.charAt(i)=='A'||S.charAt(i)=='E'||S.charAt(i)=='I'||S.charAt(i)=='O'||S.charAt(i)=='U')
//    	        //     {
//    	                
//    	        //     }
//    	        // }
//    	     StringBuilder vowels=new StringBuilder();
//    	    StringBuilder consonants=new StringBuilder();
//    	    for(int i=0;i<S.length();i++){
//    	    if(isVowel(S.charAt(i))){
//    	        vowels.append(S.charAt(i));
//    	    }
//    	    else{
//    	        consonants.append(S.charAt(i));
//    	    }
//    	    }
//    	    //sort the vowels;
//    	    char sortedvowelarr[]=vowels.toString().toCharArray();
//    	    
//    	    Arrays.sort(sortedvowelarr);
//    	    StringBuilder out=new StringBuilder();
//    	    int vi=0;
//    	    int ci=0;
//    	    for(int i=0;i<S.length();i++){
//    	        if(isVowel(S.charAt(i))){
//    	out.append(sortedvowelarr[vi++]);
//    	        }
//    	        else{
//    	            out.append(consonants.charAt(ci++));
//    	        }
//    	    }
//    	    return out.toString();
//    	    }
//    	static boolean isVowel(char c){
//    	    return c=='a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u';
//    	    }
//
//    	    public static void main(String[] args) {
//    	        Scanner scan = new Scanner(System.in);
//    	    
//    	        int N = Integer.parseInt(scan.nextLine().trim());
//    	        
//    	        String S = scan.nextLine();
//    	    
//    	        String result = sortVowels(N, S);
//    	    
//    	        System.out.println(result);
//    	    }
//    	}
//-----------------------------------------------------------  
    	
////    	N=3
////    	A=["abc", "bca", "cdf"]
////    	here "abc" and "bca" are anagrams of each other hence the maximum number of strings we can choose is 2.
////    			
////    	N=3
////    	A=["abc", "def", "ghi"]
////    	There are no two strings which are anagrams of each other, hence there is only 1 string we can choose.
//    	
//    	import java.io.*;
//    	import java.util.*;
//    	import java.lang.Math;
//
//
//    	public class Solution {
//    	    public static int maxAnagrams(int N, List<String> A) {
//    	        // Write your code here
//    	        List<String>list=new ArrayList<String>();
//    	     Collections.sort(A);
//    	        int count=0;
//    	    for(int i=0;i<N;i++){
//    	String str=A.get(i);
//    	char arr[]=str.toCharArray();
//    	Arrays.sort(arr);
//    	String s=new String(arr);
//    	list.add(s);
//    	 }
//    	 Map<String,Integer>freqmap=new HashMap<>();
//    	 for(String s:list){
//    	     freqmap.put(s,freqmap.getOrDefault(s,0)+1);
//    	 }
//    	 int maxFreq=0;
//    	 for(int freq:freqmap.values()){
//    	     maxFreq=Math.max(maxFreq,freq);
//    	 }
//    	 return maxFreq;
//    	    }
//
//    	    public static void main(String[] args) {
//    	        Scanner scan = new Scanner(System.in);
//    	    
//    	        int N = Integer.parseInt(scan.nextLine().trim());
//    	        
//    	        List<String> A = new ArrayList<>(N);
//    	        for(int j=0; j<N; j++) {
//    	            A.add(scan.nextLine());
//    	        }
//    	    
//    	        int result = maxAnagrams(N, A);
//    	    
//    	        System.out.println(result);
//    	    }
//    	}
    	//-----------------------------------------------------------------
    
////    	N=3
////    	A=[2,2,3]
////		Prime numbers occurring in A are 2 and 3, but 3 is occurring only once, hence there is only 1 number => 2 which is prime and occurs more than once.
////		Hence B=[2]
////				
////		N=6
////		A=[4,4,5,5,6,6]
////		There is only 1 prime number in A which is 5 and occurs more than once, hence the array B=[5].
//    	
//    	
//    	import java.io.*;
//    	import java.util.*;
//    	import java.lang.Math;
//
//
//    	public class Solution {
//    	    public static List<Integer> multiplePrimes(int N, List<Integer> A) {
//    	        // Write your code here
//    	    //     int count=0;
//    	    //     Collections.sort(A);
//    	    //     List<Integer> B=new ArrayList<>();
//    	    //     for(int i=0;i<A.size();i++)
//    	    //     {
//    	    //         count=0;
//    	    //         if(isPrime(A.get(i)))
//    	    //         {
//    	    //             for(int j=0;j<A.size();j++)
//    	    //             {
//    	    //                 if(A.get(i)==A.get(j))
//    	    //                 {
//    	    //                     count++;
//    	    //                    // System.out.println(count+"- "+A.get(i));
//    	    //                 }
//    	    //             }
//    	    //         }
//    	    //         if(count>=2 && !B.contains(A.get(i)))
//    	    //         B.add(A.get(i));
//    	    //     }
//    	    // return B;
//    	    // }
//
//    	    // public static boolean isPrime(int n)
//    	    // {
//    	    //     if(n<2)
//    	    //     return false;
//    	    //     if(n==2)
//    	    //     return true;
//    	    //     for(int i=2;i<n;i++)
//    	    //     {
//    	    //         if(n%i==0)
//    	    //             return false;
//    	    //     }
//    	    //     return true;
//    	       List<Integer>list=new ArrayList<>();
//    	        Map<Integer,Integer>freqmap=new HashMap<>();
//    	    for(int num:A){
//    	        if(isPrime(num)){
//    	freqmap.put(num,freqmap.getOrDefault(num,0)+1);
//
//    	 
//
//    	       }
//    	    }
//    	    for(Map.Entry<Integer,Integer>entry:freqmap.entrySet())
//    	if(entry.getValue()>1){
//    	    list.add(entry.getKey());
//    	}
//    	Collections.sort(list);
//    	return list;
//    	    
//    	    }
//    	 public static boolean isPrime(int n) {
//    	        if (n <= 1) {
//    	            return false;
//    	        }
//    	        for (int i = 2; i * i <= n; i++) {
//    	            if (n % i == 0) {
//    	                return false;
//    	            }
//    	        }
//    	        return true;
//    	    
//    	    }
//
//    	    public static void main(String[] args) {
//    	        Scanner scan = new Scanner(System.in);
//    	    
//    	        int N = Integer.parseInt(scan.nextLine().trim());
//    	        
//    	        List<Integer> A = new ArrayList<>(N);
//    	        for(int j=0; j<N; j++) {
//    	            A.add(Integer.parseInt(scan.nextLine().trim()));
//    	        }
//    	    
//    	        List<Integer> result = multiplePrimes(N, A);
//    	    
//    	        for(int j=0; j<result.size(); j++) {
//    	            System.out.println(result.get(j));
//    	        }
//    	    }
//    	}
    	//----------------------------------------------------
    	
////    	N=3
////		A=[1,2,3]
////		There is only 1 even number 2 and 2 does not have a prime factor greater than 2, hence there are no great numbers to sum is 0.
////
////		N=5
////		A=[2,4,6,8,10]
////		Numbers 6 and 10 are great numbers, because 6 is even and has a prime factor 3 which is greater than 2, and similarly 10 is even and has a prime factor 5. Hence the sum of great number in A is 6+10=16.
////    	
////		N=6
////		A=[1,2,3,4,5,6]
////		Only 6 is a great number, hence the answer is 6.
//
//    	import java.io.*;
//    	import java.util.*;
//    	import java.lang.Math;
//
//
//    	public class Solution {
//    	    public static int evenPrimes(int N, List<Integer> A) {
//    	        // Write your code here
//    	     int sum=0;
//    	    for(int num:A){
//    	        if(num%2==0){
//    	            for(int i=3;i<=num;i++){
//    	                if(num%i==0&&isPrime(i)){
//    	            sum+=num;
//    	            break;
//    	                }
//    	            }
//    	        }
//    	    }
//    	    return sum;
//    	    }
//    	 public static boolean isPrime(int n) {
//    	        if (n <= 1) {
//    	            return false;
//    	        }
//    	        for (int i = 2; i * i <= n; i++) {
//    	            if (n % i == 0) {
//    	                return false;
//    	            }
//    	        }
//    	        return true;
//    	    }
//    	    
//
//    	    public static void main(String[] args) {
//    	        Scanner scan = new Scanner(System.in);
//    	    
//    	        int N = Integer.parseInt(scan.nextLine().trim());
//    	        
//    	        List<Integer> A = new ArrayList<>(N);
//    	        for(int j=0; j<N; j++) {
//    	            A.add(Integer.parseInt(scan.nextLine().trim()));
//    	        }
//    	    
//    	        int result = evenPrimes(N, A);
//    	    
//    	        System.out.println(result);
//    	    }
//    	}
    }
}
