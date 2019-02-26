package beginner;

import java.util.*;
import java.math.*;
class SmallFactorial
{
public static void main(String args[])
{
Scanner scan = new Scanner (System.in);
int t = scan.nextInt();
while(t-- > 0)
{
int n = scan.nextInt();
BigInteger f=new BigInteger("1");
for(int i=2;i<=n;i++)
           f=f.multiply(BigInteger.valueOf(i));
 System.out.println(f);
}
}
}