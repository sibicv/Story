package sample;

public class SecondLargestNumber {

	public static void main(String[] args) {
		
		
		int a[]= {-2,-1,0,1,2,3,4,5,5,6,6};
		
		int temp=0;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		
		int n=a.length,s=0;
		for (int i = n - 2; i >= 0; i--)
        {
            /*
            If the last and second last element are equal then check the previous one else return the second last element.
            */
            if (a[i] != a[n - 1])
            {
                s= a[i];
                break;
            }
        }
		System.out.println(s);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	
	}
}
