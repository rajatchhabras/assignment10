package assignment10;
import java.util.*;
class stak
{
	private int size;
	private int capacity;
	private int arr[];
	static int i,k;
	public stak(int capacity)
	{
		this.capacity=capacity;
		size=0;
		arr=new int[capacity];
		i=capacity-1;
	}
	public void  push(int value)
	{
		int ar[];
		if(i>=0)
		{
			arr[i]=value;
			i--;
		}
		else
		{
			ar=Arrays.copyOf(arr,arr.length);
			capacity=capacity+1;
			arr=new int[capacity];
			for(int p=0;p<capacity-1;p++)
			{
				arr[p+1]=ar[p];
			}
			arr[0]=value;
			
			
		}
		k++;
		size=k;
	}
	int pop()
	{
		int j;
		int k=arr[0];
		if(size>0)
		{
			for( j=0;j<size-1;j++)
			{
				arr[j]=arr[j+1];
			}
			arr[j]=0;
			size--;
			capacity=capacity-1;
			return k;
		}
		else
		{
			try
			{
				if(size<=0)
					throw new ArithmeticException("Not Have Enough Element to be extracted");
			}
		finally
		{
			
		}
		return 0;
	}
	}
	void show()
	{
		for(int j=0;j<size;j++)
			System.out.println("values are  :::::::"+arr[j]);
	}
}
public class stacke {

	public static void main(String[] args) {
		System.out.println("ENTER THE CAPACITY OF THE STAK :::");
		Scanner sc=new Scanner(System.in);
		int capacity=sc.nextInt();
		System.out.println("ENTER THE size OF THE STAK TO BE FILLED :::");
		int size=sc.nextInt();
	    stak p=new stak(capacity);
	    System.out.println("ENTER THE VALUES FOR STAK :::");
	    for(int j=0;j<size;j++)
	    {
	    	
	    int values=sc.nextInt();
	    	p.push(values);
	    }
	    p.show();
	   
	    
		System.out.println("ENTER THE size OF THE STAK TO BE FILLED MORE TO PREVIOUS :::");
		int more=sc.nextInt();
		for(int j=0;j<more;j++)
	    {
	    	
	    int values=sc.nextInt();
	    	p.push(values);
	    }
		p.show();
		p.pop();
		int s=p.pop();
		   System.out.println("POPED ELEMENT IS ::"+s);
		System.out.println();
		   p.show();
		   
		
		
	}

}
