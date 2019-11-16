package com.bridgelabz.utility;
import java.io.PrintWriter;
import java.util.Scanner;

public class Utility {
	static Scanner sc;
	static long start;//variable for to start stopwatch
	static
	{
		 sc=new Scanner(System.in);
	}
	public static int readInt()//to read integer
	{
		return sc.nextInt();
		
	}
	public static boolean readboolean()//to read boolean
	{
		return sc.nextBoolean();
		
	}
	
	public static double readDouble()//to read double
	{
		return sc.nextDouble();
		
	}
	// Utility function to swap two characters in a character array
	public static void swap(char[] ch, int i, int j)
		{
			char temp = ch[i];
			ch[i] = ch[j];
			ch[j] = temp;
		}
		// Recursive function to generate all permutations of a String
	public static void permutations(char[] ch, int currentIndex)
	{
		if (currentIndex == ch.length - 1) {
			System.out.println(String.valueOf(ch));
		}

		for (int i = currentIndex; i < ch.length; i++)
		{
			swap(ch, currentIndex, i);
			permutations(ch, currentIndex + 1);
			swap(ch, currentIndex, i);
		}
	}


	public static String readString()//to read string entire line and move cursor to next line
	{
		return sc.nextLine();
		
	}
	;public static String readStr()//to read string and after reading cursor in same position
	{
		return sc.next();
		
	}
	public static String[] readStringArray(String[] st)//to read string array
	{
		for(int i=0;i<st.length;i++)
		{
			System.out.println("enter the element");
			st[i]=readStr();
			
		}
		return st;
		
	}
	public static String[] printStringArray(String[] st)//to print string array
	{
		for(int i=0;i<st.length;i++)
		{
			System.out.println(st[i]);
			
		}
		return st;
		
	}
	//to check leap year
	public static boolean checkLeapYear(int n) {
		if(n%400==0||(n%4==0&&n%100!=0))
			return true;
		else
			return false;
		
	}
	//check prime factor
	public static void primeFactor(int n)
	{ for(int i = 2; i< n; i++) {
         while(n%i == 0) {
            System.out.println(i+" ");
            n = n/i;
         }
      }
	if(n >2) {
        System.out.println(n);
     }
		
		
	}
	//check prime numer
	static boolean checkPrime(int n,int i)//to check prime
	{
		while(i<=n/2)
		{
		if(n%i==0)
			return false;
		i++;
		}
		return true;
		
		
	}
	//calculate percentage of flipping
	public static void flipCoin(int n)
	{
		int head=0,tail=0;
		int n1=n;
		while(n>0) {
		if(Math.random()>0.5)
			tail++;
		else
			head++;
		n--;
		}
		double perchead=(head*100)/n1;
		double perctail=(tail*100)/n1;
		System.out.println("percentage of head "+perchead);
		System.out.println("percentage of tail "+perctail);
		
	}
	//to replace word in string with given input string
	public static String replace(String ms,String s1,String s2)//ms=mainstring,s1=word to replace,s2=word; repalced
	{
		char[] ch=ms.toCharArray();//convert string to array
		char[] c=s1.toCharArray();
		ms="";
		for(int i=0;i<ch.length;i++)
		{
			int k=i;
			int j=0;
			while(j<c.length&&k<ch.length&&c[j]==ch[k])
			{
				j++;
				k++;
				
			}
			if(j==c.length&&(i==0||ch[i-1]==' ')&&(k==ch.length||ch[k]==' '))//to find word present in the string
			{
				ms=ms+s2;//repalce word with given word in string
				i=k-1;
			}
			else if(i<ch.length)
				ms=ms+ch[i];
		}
		return ms;
		
	}
	//to find power of number 
	public static int powerValue(int n,int p)//recursive call to find power of n
	{    if(p==0)
		return 1;
	else 
		return n*powerValue(n,p-1);
		
	}
	//to find harmonic of n
	public static float nthHarmonic(int N) 
	{ float harmonic = 1; 
	   for(int i = 2; i <= N; i++) { 
	        harmonic += (float)1 / i; 
	    } 
	   return harmonic;
	  
	}
	public static int[]  readArray(int n)//read one dimensional array
	{
		int[] a=new int[n];
	    System.out.println("enter the value");
	    for(int i=0;i<n;i++)
	    {
	    	a[i]=readInt();
	    }
	    return a;
	    
		
	}
	public static int[]  printArray(int[] a)//print one dimensional array
	{
	    System.out.println("enter the value");
	    for(int i=0;i<a.length;i++)
	    {
	    	System.out.println(a[i]);
	    }
	    return a;
	    
		
	}
	public static int findTriplets(int[] arr, int n) //find sum of triples equal to 0
	{ 
		int count=0;
	    boolean found = true; 
	    for (int i=0; i<n-2; i++) 
	    { 
	        for (int j=i+1; j<n-1; j++) 
	        { 
	            for (int k=j+1; k<n; k++) 
	            { 
	                if (arr[i]+arr[j]+arr[k] == 0) 
	                { 
	                    System.out.print(arr[i]); 
	                    System.out.print(" "); 
	                    System.out.print(arr[j]); 
	                    System.out.print(" "); 
	                    System.out.print(arr[k]); 
	                    System.out.print("\n"); 
	                    found = true; 
	                    count++;
	                } 
	            } 
	        } 
	    } 
	   return  count;
	    
	  
	} 
	public static void ecluidDistance(double  x,double  y)//find ecluid distance
	{
		System.out.println(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)));
		
	}
	public static void findRoot(double a,double b,double c)//roots of quadratic equation
	{
	double root1, root2;
    double determinant = b * b - 4 * a * c;
    // condition for real and different roots
    if(determinant > 0) {
        root1 = (-b + Math.sqrt(determinant)) / (2 * a);
        root2 = (-b - Math.sqrt(determinant)) / (2 * a);
        System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
    }
    // Condition for real and equal roots
    else if(determinant == 0) {
        root1 = root2 = -b / (2 * a);
        System.out.format("root1 = root2 = %.2f;", root1);
    }
 // If roots are not real
    else {
        double realPart = -b / (2 *a);
        double imaginaryPart = Math.sqrt(-determinant) / (2 * a);
        System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
    }
	}
	public static int[][] readTwoDimensionalArray(int row,int col)//read two dimension array
	{
		int[][]  mat=new int[row][col];
		System.out.println("enter the value");
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				mat[i][j]=readInt();
				
			}
		}
		return mat;
		
	}
	public static void displayMatrix(int[][]mat)//to display two dimensional array
	{
		System.out.println("printing array value");
		PrintWriter out= new PrintWriter(System.out); 
		for(int i=0;i<mat.length;i++)
	{
		for(int j=0;j<mat[i].length;j++)
		{
			 out.print(mat[i][j]+" ");
			 out.flush(); 
			
		}
		out.println();
	}
		
	}
	public static void windChillCalculate(double  t,double  v)//find windchill using formula
	{
		 double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	        System.out.println("Temperature = " + t);
	        System.out.println("Wind speed  = " + v);
	        System.out.println("Wind chill  = " + w);
		
	}
	// return a random coupon between 0 and n-1
    public static int getCoupon(int n) {
        return (int) (Math.random() * n);
    }
 // return number of cards you collect before obtaining one of each of the n types
    public static int collect(int n) {
        boolean[] isCollected = new boolean[n];  // isCollected[i] = true if card type i already collected
        int count = 0;                           // number of cards collected
        int distinct  = 0;                       // number of distinct card types collected

        // repeat until you've collected all n card types
        while (distinct < n) {
            int value = getCoupon(n);            // pick a random card 
            count++;                             // one more card
            if (!isCollected[value]) {           // discovered a new card type
                distinct++;
                isCollected[value] = true;
            }
        }
        return count;
    }
    public static long startStopWatch()//start the stopwatch
    {
    	return System.currentTimeMillis();
    }
    public static void gambling(int stake,int goal,int trials)
	{
		int bets = 0;        // total number of bets made
        int wins = 0;        // total number of games won

        // repeat trials times
        for (int t = 0; t < trials; t++) {

            
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;     // win $1
                else                     cash--;     // lose $1
            }
            if (cash == goal) wins++;                
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
	}
    public static long startStopwatch()//start the stopwatch
    {
    	 start=System.currentTimeMillis();
    	return start;
    }
    /**
     * Returns the elapsed CPU time (in seconds) since the stopwatch was created.
     *
     * @return elapsed CPU time (in seconds) since the stopwatch was created
     */
    public static double elapsedTime() {
        long now = System.currentTimeMillis();
        return (now - start) / 1000.0;
    }
    public  static void calculateNotes(int[] a,int[] n,int amt,int i)//to check minimum num of notes
	{                                                                //n[] represent value that how many times particular note present
		if (amt >= a[i]) {                                           //a[] represent notes value
            n[i] = amt / a[i]; 
            amt = amt - n[i] * a[i];
            if(n[i]!=0)
            System.out.println(a[i]+"  : "+n[i]);
            
		}
		i--;
		if(i>=0)
			calculateNotes(a,n,amt,i);
		
	}
    public static double convert()
	{
		System.out.println("enter 1 for celcius to farenhit and 2 for vicerversa");
		int  b=readInt();
		if(b==1)
		{
			System.out.println("enter value in celcius");
			double c=sc.nextDouble();
			double  f=((9*c)/5)+32;
			 System.out.println("farenhit value is "+f);
			 return f;
		}
		else
		{
			System.out.println("enter value in farenhit");
			 double f = sc.nextDouble();
			double  c=(f-32)*5/9;
			 System.out.println("celcius  value is "+c);
			 return c;
			
		}
		
	}
    public static int dayOfWeek(int d, int m, int y) //calculate which day
    {
    	int y0= y -(14 -m ) / 12;
	int x = y0 +(y0 /4)-(y0 /100) + (y0/400);
	
	
	int m0= m + 12 *((14 -m )/12)-2;
	
	int d0 = ( (d +x +31 *m0/12)) % 7;
	return d0;
	} 
    public static double calculatePayment(double p,double y,double R)
	{
		double n=p*12;
		double r=R/(12*100);
		double payment=(p*r)/(1-Math.pow(1+r,-n));
		System.out.println("monthly payment is "+payment);
		return payment;
	}
    public static String  decToinary(int n)
	{
		String st="";
		while(n>0)
		{
			int r=n%2;
			st=r+st;
			n=n/2;
			
		}
		System.out.println("binary value is");
	    System.out.println(st);
	    return st;
	}
    public static boolean isPowerOfTwo(int n) //check number is power of 2
    { 
        if (n == 0) 
            return false; 
          
        while (n != 1) 
        { 
            if (n % 2 != 0) 
                return false; 
            n = n / 2; 
        } 
        return true; 
    } 
	public static int swapNibbles(int x) 
	{ 
	    return ((x & 0x0F) << 4 | (x & 0xF0) >> 4); //swap nibbles
	} 
	public static double newtonMethod(double c) {//find; square root

        double epsilon = 1e-15;    // relative error tolerance
        double t = c;              // estimate of the square root of c

        // repeatedly apply Newton update step until desired precision is achieved
        while (Math.abs(t - c/t) > epsilon*t) {
            t = (c/t + t) / 2.0;
        }
        // print out the estimate of the square root of c
        System.out.println(t);
        return t;
    }
	public static String[] sortStringArray(String[] str)//sorting string array
	{
		String temp;
		 for (int j = 0; j < str.length; j++) {
	         for (int i = j + 1; i < str.length; i++) {
	            // comparing strings
	            if (str[i].compareTo(str[j]) < 0) {
	               temp = str[j];
	               str[j] = str[i];
	               str[i] = temp;
	            }
	         }
	         
	      }
		 return str;
	}
	public static int countWords(String s)//calculate num of word;s in string
	{
		int count=0;
	    char[] ch=s.toCharArray();
	    int i=0;
	    for(;i<ch.length;i++)
	    {
	    	if(i==0&&ch[i]!=' '||ch[i]!=' '&&ch[i-1]==' ')
	    	{
	    		count++;
	    		
	    	}
	    }
	    return count;
		
	}
	public static boolean binarySearch(String[] array,String value)//binary search for string array
	{

		int start = 0;
		int end = array.length;
		while (start < end) {
			int midp = (start + end) / 2;
			if (array[midp].equals(value)) {
				return true;
			} else if (((array[midp]).compareTo(value)) < 0) {
				start = midp + 1;
			} else {
				end = midp;
			}
		}
		return false;
	
		
	}
	public static String[] insertionSort(String arr[], int n)  //insertion sort for string
	{  
	    int i, j; 
	    String key;
	    for (i = 1; i < n; i++) 
	    {  
	        key = arr[i];  
	        j = i - 1;  
	  
	        /* Move elements of arr[0..i-1], that are  
	        greater than key, to one position ahead  
	        of their current position */
	        while (j >= 0 && arr[j].compareTo(key) > 0) 
	        {  
	            arr[j + 1] = arr[j];  
	            j = j - 1;  
	        }  
	        arr[j + 1] = key;  
	    }
		return arr;
	}
	public static int[] bubbleSort(int arr[]) //bubble sort in asc
    { 
        int n = arr.length; 
        for (int i = 0; i < n-1; i++) 
            for (int j = 0; j < n-i-1; j++) 
            {
                if (arr[j] > arr[j+1]) 
                { 
                    // swap arr[j+1] and arr[i] 
                    int temp = arr[j]; 
                    arr[j] = arr[j+1]; 
                    arr[j+1] = temp; 
                } 
            }
        return arr;
    }
	public static String removeSpace(String s)//remove space in string
	{
		char[] ch=s.toCharArray();
		s="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]==' ')
              i++;
			s=s+ch[i];
		}
		return s;
		
	}
	public static String lowerCase(String s)//convert string to lower case
	{
		char[] ch=s.toCharArray();
		s="";
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
				s=s+(char)(ch[i]+32);
			else
				s=s+ch[i];
			
		}
		return s;
		
	}
	public static boolean compare(String s1,String s2)//compare two string
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
	public static String  bubbleSortString(String arr) //sort the string in asc
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
	public static boolean rev(int num)//rev num and; check is it equal to orginal
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
	public static boolean checkPrimeRec(int n,int i)//to check num is prime or not using recursion
	{
		if(i==1)
			return true;
		else if(n%i==0)
			return false;
		return checkPrimeRec(n,i-1);
	}
	public static void merge(int arr[], int l, int m, int r) 
    { 
        // Find sizes of two subarrays to be merged 
        int n1 = m - l + 1; 
        int n2 = r - m; 
  
        /* Create temp arrays */
        int L[] = new int [n1]; 
        int R[] = new int [n2]; 
  
        /*Copy data to temp arrays*/
        for (int i=0; i<n1; ++i) 
            L[i] = arr[l + i]; 
        for (int j=0; j<n2; ++j) 
            R[j] = arr[m + 1+ j]; 
  
  
        /* Merge the temp arrays */
  
        // Initial indexes of first and second subarrays 
        int i = 0, j = 0; 
  
        // Initial index of merged subarry array 
        int k = l; 
        while (i < n1 && j < n2) 
        { 
            if (L[i] <= R[j]) 
            { 
                arr[k] = L[i]; 
                i++; 
            } 
            else
            { 
                arr[k] = R[j]; 
                j++; 
            } 
            k++; 
        } 
  
        /* Copy remaining elements of L[] if any */
        while (i < n1) 
        { 
            arr[k] = L[i]; 
            i++; 
            k++; 
        } 
  
        /* Copy remaining elements of R[] if any */
        while (j < n2) 
        { 
            arr[k] = R[j]; 
            j++; 
            k++; 
        } 
    } 
	public static void sort(int arr[], int l, int r) //sort array using merge
    { 
        if (l < r) 
        { 
            // Find the middle point 
            int m = (l+r)/2; 
  
            // Sort first and second halves 
            sort(arr, l, m); 
            sort(arr , m+1, r); 
  
            // Merge the sorted halves 
            merge(arr, l, m, r); 
        } 
    } 
	public static void binarySearchOutputBound(int[] array) {
		int start = 0;
		int end = array.length;
		int midp = (start + end) / 2;
		while (start < end) {
			if (start == end - 1)
				break;
			if (start != ((start + end) / 2) - 1 && ((start + end) / 2) != end - 1) {
				System.out.println("You are between " + (start) + " and " + (end - 1) + "\nEnter false for " + ""
						+ start + " to " + (((start + end) / 2) - 1) + "  " + "\nor true for " + (((start + end) / 2))
						+ " to " + (end - 1));
			} else
				System.out.println("false for " + start + " and true for " + (end - 1));
			boolean b = readboolean();
			if (end - start == 1) {
				if (b) {
					midp = end;
				} else
					midp = start;
				break;
			}
			if (end - start == 2) {
				if (b) {
					midp = end - 1;
				} else
					midp = start;
				break;
			}
			midp = ((start + end) / 2);
			if (b == true) {
				start = midp;
			} else if (b == false) {
				end = midp;
			}
		}
		System.out.println("Your Number is : " + (array[midp]));
	}

}





