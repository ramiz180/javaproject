package javaPrograms;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Manabi {

	public static void main(String[] args) {
		String s1="i you love boy";
		String [] arr=s1.split(" ");
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length; j++) {
				if(arr[j-1].compareTo(arr[j])>0)
				{
					String temp = arr[j-1];
					arr[j-1]=arr[j];
					arr[j]=temp;
				}
			}
			
		}
		for (String e : arr) {
			System.out.print(e+" ");
		}
			
	}

}
