package RahulShetty;

public class CoreJavaBrushup2 {

	public static void main(String[] args) {
		
		//string is an object 
		//literal string example
		String s = "Abhishek Ranjan Tavant";
		String s1 = "Abhishek Ranjan Tavant"; 	//Here since text are same so s1 will refer to same memory allocation where variable s is allocated.
		
		String s2 = new String("Abhishek Ranjan Tavantian");
		String s3 = new String("Abhishek Ranjan Tavantian1"); //new memory allocated
		
		String[] split1 = s2.split(" ");
		System.out.println(split1[0]);
		System.out.println(split1[1]);
		System.out.println(split1[2]);
		
		String[] split2 = s3.split("Ranjan");
//		System.out.println(split2[1]);
		System.out.println("$$$$$$$$$$$$$$$");
		
		for(int i=0; i<s.length(); i++)
		{
			if(s.charAt(i)==' ')
			{
				System.out.print(" ");
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
		}
		
		
	}

}
