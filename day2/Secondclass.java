package week1.day2;

import java.util.Arrays;

public class Secondclass {
	public static void main(String[] args) {
		int a[]= {23,45,67,32,89,22};
		System.out.println("the Array input is ");
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]+" ");
		} 
		Arrays.sort(a);
		System.out.println("\nThe Scond Smallest Number in the Array is: "+a[1]);
	}

}
