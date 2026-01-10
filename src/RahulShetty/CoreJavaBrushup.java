package RahulShetty;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoreJavaBrushup {

	public static void main(String[] args) {
		
//		int[] arr = {1, 2, 4, 5, 6, 7, 8, 9, 10, 122};
//		int count = 0;
//		for(int i=0; i<arr.length; i++)
//		{
//			
//			int b = arr[i]%2;
//			
//			if(b==0)
//			{
//				System.out.println("The element "+arr[i]+" is divisible by 2");
//				count++;
//			}
//					
//		}
//		System.out.println(count);
//		
//		int counter = 0;
//		int[] numbers = {1, 2, 3, 4, 5};
//		int n = numbers.length;
//		System.out.println("The first elemnt of array numbers is "+numbers[0]);
//		System.out.println("The last elemnt of array numbers is "+numbers[n-1]);
//	
//		for(int i=(numbers.length-1); i>=0; i--)
//		{
//			System.out.print(numbers[i]+" ");
//			counter++;
//		}
//		System.out.println();
//		System.out.println("Total element in numbers array is "+counter);
//		
		//ArrayList
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("Shetty");
		a.add("academy");
		a.add("Selenium");
		System.out.println(a.get(2));
		
		for(int i=0; i<a.size(); i++)
		{
			System.out.println(a.get(i));
		}
		System.out.println("*********");
		for(String val:a)
		{
			System.out.println(val);
		}
		
		System.out.println("************");
		//item is present in ArrayList
		System.out.println(a.contains("Rahul"));
		String[] name = {"Abhishek", "Ranjan", "Tavant"};
		
		List<String> nameList = Arrays.asList(name);
		System.out.println(nameList.contains("Tavant"));
		
	}

}
