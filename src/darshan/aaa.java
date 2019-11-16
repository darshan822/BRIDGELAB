package darshan;
import java.util.Scanner;

public class aaa {
	public static String  bubbleSort(String arr) 
    { 
	 char[] ch=arr.toCharArray();
        int n = ch.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
            {
                if (ch[j]>ch[j+1])
                { 
                    // swap arr[j+1] and arr[i] 
                    char temp = ch[j]; 
                    ch[j] = ch[j+1]; 
                    ch[j+1] = temp; 
                } 
            }
        arr="";
        for (int i = 0; i < n; i++)
        {
        	arr=arr+ch[i];
        }
        return arr;
    }

	public static boolean compare(String s1,String s2)
	{
		if(s1.length()==s2.length())
		{
		for(int i=0;i<s1.length();i++)
		{
			if(s1.charAt(i)!=s2.charAt(i))
		      return false;
		}
		return true;
		}
		return false;
	}
	public static boolean rev(int num)
	{
		int n=num;
		int  reversed = 0;
        while(num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        if(n==reversed)
        	return true;
        else
        	return false;
		
	}
	public static boolean checkPrime(int n,int i)
	{
		if(i==1)
			return true;
		else if(n%i==0)
			return false;
		return checkPrime(n,i-1);
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("prime number between 0 to 1000");
		for(int i=2;i<=1000;i++)
		{
			if(checkPrime(i,i-1))
			{

				System.out.println(i+" is prime number ");
				if(rev(i))
					System.out.println(i+" is palindrome");	
				String s1=Integer.toString(i);
				s1=bubbleSort(s1);
				for(int j=2;j<=9999;j++)
				{
					String s2=Integer.toString(j);
					s2=bubbleSort(s2);
					if(compare(s1,s2))
					{
						System.out.println(i+" is angram of  "+j);
					}
				}
			}
				
			}
			
		}
			
		// TODO Auto-generated method stub

	}

