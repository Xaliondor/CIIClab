import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BirthdayCakeCandles {
	
	static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
		int num = 0;
		int h;
		
		Arrays.sort(ar);
		
		h = ar[n-1];
		
		for (int l = 0; l < n; l= l+1) {
			if (ar[l] == h) {
				num = num+1;
			}
		}
		
		return num;
		
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }

}
