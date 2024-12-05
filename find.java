import java.util.*;
public class find
{

    public static void main(String[]args)
    {
    Scanner Sc=new Scanner(System.in);
    int t=Sc.nextInt();
    for(int i=0;i<t;i++)
{
    int n=Sc.nextInt();
    int c=0;
    for(int j=1;j<=n;j++)
{
    if((n%j)==0)
    {
        System.out.println(j);
    }
    System.out.println();

}

}
    }
}    