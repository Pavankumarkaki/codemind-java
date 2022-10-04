import java.util.*;
class Third_max
{
    public static void merge(int arr[],int l,int m,int h)
	{
		int temp[]=new int[h-l+1];
		int i=l;
		int j=m+1;
		int k=0;
		while(i<=m && j<=h)
		{
			if(arr[i]<arr[j])
				temp[k++]=arr[i++];
			else
				temp[k++]=arr[j++];
		}
		while(i<=m)
			temp[k++]=arr[i++];
		while(j<=h)
			temp[k++]=arr[j++];
		k=0;
		for(i=l;i<=h;i++)
			arr[i]=temp[k++];
	}
	public static void merge_sort(int arr[],int l, int h)
	{
		if(l<h)
		{
			int m=(l+h)/2;
			merge_sort(arr,l,m);
			merge_sort(arr,m+1,h);
			merge(arr,l,m,h);
		}
	}
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        int loop=0;
        if(n<3)
        {
        int max =arr[0]>arr[1]?arr[0]:arr[1];
        System.out.print(max);
        }
        else
        {
            merge_sort(arr,0,n-1);
            int max=n-1;
            for(int i=0;i<2;i++)
            {
                while(arr[max]==arr[max-1])
                {
                    max--;
                }
                max--;
            }
            System.out.print(arr[max]);
        }
    }
}