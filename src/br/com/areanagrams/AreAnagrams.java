package br.com.areanagrams;

import java.util.Arrays;

public class AreAnagrams {
    public static boolean areAnagrams(String a, String b) {
        
        if(a.length() != b.length()){
			return false;
		}
        
        char[] ar1 = a.toCharArray();
        char[] ar2 = b.toCharArray();
        
		Arrays.sort(ar1);
		Arrays.sort(ar2);
        
        return Arrays.equals(ar1, ar2);
        
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("momdad", "dadmom"));
    }
}