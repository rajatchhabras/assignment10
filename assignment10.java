package assignment10;
import java.util.*;
class arraylist 
{
	private int siz;
	private int capacit;
	static int i;//for making the size
	private int arr [];
	public arraylist(int capacity )
	{
		i=0;
		siz=0;
		this.capacit=capacity;
	     arr=new int[capacit];
		
	}
	public void capacity()
	{
		System.out.println("THE CAPACITY OF THE ARRAY IS "+capacit);
	}
	public void size()
	{
		System.out.println("THE SIZE OF THE ARRAY IS "+siz);
	}
	
	public void add(int value)
	{
		int ar[];
		if(i<capacit)
		{
		arr[i]=value;
		i++;
		}
		else 
		{
              
			 ar=Arrays.copyOf(arr,arr.length);
			capacit=(int)(1.5*capacit);
			 arr=Arrays.copyOf(ar,capacit);
			arr[i]=value;//value that was passed in fun add
			i++;
			}
		siz=i;
	}
	public void remove(int rem)
	{
		int j,k,flag=0;
		
		for(j=0;j<siz;j++)
		{
			if(arr[j]==rem)
			{
				flag=1;
				break;
		     }
		}
		if(flag==1)
		{
			for(k=j;k<siz-1;k++)
			{
				arr[k]=arr[k+1];
			}
			arr[k]=0;
			siz--;
		}
		else
			System.out.println("DOESNOT FIND THE VALUE TO BE REMOVED ");
	}
	void show()
	{
		for(int k=0;k<siz;k++)
		{
			System.out.println("VALUES ARE : "+arr[k]);
		}
	}
}

public class assignment10
{
	public static void main(String [] args)
	{
		
		int size,capacity;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the capacity of the array ");
		 capacity=sc.nextInt();
		 System.out.println("Enter the no of elements for the array ");
		size=sc.nextInt();
		arraylist p=new arraylist(capacity);
		p.capacity();
		p.size();
		System.out.println("Enter the values for the array list ");
		for(int j=0;j<size;j++)
		{
			int value=sc.nextInt();
			p.add(value);
		}
		p.capacity();
		p.size();
		System.out.println("Enter the no  of value you want to enter  ");
		int more=sc.nextInt();
		System.out.println("Enter the values for the array list ");
		for(int j=0;j<more;j++)
		{
			int value=sc.nextInt();
			p.add(value);
		}
		p.capacity();
		p.size();
		System.out.println();
		p.show();
		System.out.println("Enter the values of the element of array list to be removed ");
		int remov=sc.nextInt();
		p.remove(remov);
		System.out.println();
		p.show();
		
		
		
	}
}
	