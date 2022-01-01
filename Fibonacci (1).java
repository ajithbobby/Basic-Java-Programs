class Fibonacci
{ public static void main(String[] args)
 {int a=0,b=1,i=1,n=10,c=0;
  System.out.print("\n\n\tFibanocci series upto "+n+" terms\n");
  while(i<=n)
  {
    System.out.print(a+"\t");
    c=a+b;
    a=b;
    b=c;
    i++;
  }
 }
}