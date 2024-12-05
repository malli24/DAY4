import java.util.*;
public class Multiple
{
    public static void main(String[]args)
    {
    Scanner Sc=new Scanner(System.in);
    int t=Sc.nextInt();
    for(int i=0;i<t;i++);
    {
    int n=Sc.nextInt();
    if((n&7)==0)
    {
        System.out.println("multiple of 8");
    }
        else
        {
            System.out.println("not multiple of 8");
        }
    }
        
    }
}