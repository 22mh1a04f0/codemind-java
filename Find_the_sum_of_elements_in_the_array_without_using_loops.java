import java.util.*;
public class Sample
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a[] = new int [n];
        for (int i = 0 ; i < n ; i++)
        {
            a[i] = sc.nextInt();
        }
        int s = 0 ;
        for (int i = 0 ; i < n ; i++)
        {
            s += a[i];
        }
        System.out.println(s);
    }
}