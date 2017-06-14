import java.io.*;
import java.util.Scanner;
public class pnz
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
int n=s.nextInt();
if(n<0)
{
System.out.println("positive");
}
else if(n>0)
{
System.out.println("negative");
}
else if(n=0)
{
System.out.println("zero");
}
  else
  {
    System.out.println("invalid input");
  }
}
}
