package RahulShetty;

public class Introduction {

	public static void main(String[] args) {
		
		//Data types
		int myNum = 5;
		String website = "Rahul Shetty Academy";
		char letter = 'r';
		double dec = 5.99;
		boolean myCard = true;
		
		System.out.println(myNum);
		System.out.println(website);
		System.out.println(letter);
		System.out.println(dec);
		System.out.println(myCard);
		
		//Arrays- To store multiple set of same data type
		
		int[] arr = new int[5];
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
		
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr2[1]);
		
		//using for loop
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		String[] name = {"Abhishek", "Ranjan", "Tavant"};
		
		for(int i=0; i<name.length; i++)
		{
			System.out.print(name[i]+" ");
		}
		
	}

}
