import java.util.*;
class Annagram
{
	
	public static void main(String args[])
	{
		int i,j;
		String str1= "priya";
	String str2= "ayirp";
	
		char a[]= str1.toCharArray();
		char b[]= str2.toCharArray();
		for(i=0;i<str1.length();i++)
		{
			for(j=i+1;j<str1.length()-i-1;j++)
			{
			if(a[j]>a[j+1])
			{
				char temp= a[j];
				a[j]= a[j+1];
				a[j+1]= temp;
			}
			
			}
		}
		for(i=0;i<str2.length();i++)
		{
			for(j=i+1;j<str2.length()-i-1;j++)
			{
			if(b[j]>b[j+1])
			{
				char temp1= b[j];
				b[j]= b[j+1];
				b[j+1]= temp1;
			}
			
			}
		}
		int flag=0;
		for(i=0;i<str1.length();i++)
		{
			if(a[i]!=b[i])
			{
				flag=1;
			}
		
		}
		if (flag==0)
		{
		System.out.println("annagram");
		
		}
		else
		{
			System.out.println("not");
		}
		
	}
}
	