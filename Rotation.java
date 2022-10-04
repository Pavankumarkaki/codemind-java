import java.util.Scanner;
class Rotate {    
 public static void main(String[] args) 
 {      Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int x=0;x<t;x++)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int [] arr = new int [n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();
            //System.out.println(k);
                for(int i=0;i<k;i++)
                {    
                    int j,last;    
                    last=arr[n-1];    
                    for(j=n-1;j>0;j--)
                    {    
                        arr[j] = arr[j-1];    
                    }    
                    arr[0] = last;    
                } 
            for(int i=0;i<n-1;i++)
            {    
                System.out.print(arr[i]+" ");    
            }
            System.out.print(arr[n-1]);
            if(t>1)
            System.out.println();
        }
    }    
}    