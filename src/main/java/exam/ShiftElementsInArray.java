import java.util.*;
class arr11
{
  public static void main(String args[])
  {
     Scanner sc = new Scanner(System.in);
     int i,n,temp;
    System.out.println("Enter the number of Elements :");
    n = sc.nextInt();
    int[] a = new int[n];
    System.out.println(" Enter the Elements :");
    for(i=0;i<n;i++)
    {
      a[i] = sc.nextInt();
    }
     System.out.println("Original array");
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
    temp=a[n-1]       // shifting array elements
    for(i=n-1;i>0;i--)
    {
      a[i]=a[i-1]
    }
    a[0]=temp;
    System.out.println("\n New Array by rotating one position to right direction");
    for(i=0;i<n;i++)
    {
      System.out.print(a[i]+" ");
    }
  }
}
    
