import java.util.Scanner;
class perfectnum
{ public static void main(String[] args)
  { Scanner s=new Scanner(System.in);
    int sum=0,i=1,n;
    System.out.println("Enter the number");
    n=s.nextInt();
    while(i<=n/2)
    { if(n%i==0)
      { sum=sum+i;
      }
      i++;
    }
    if(sum==n)
    System.out.println(n+"is a perfect number");
    else
    System.out.println(n+"is not a perfect number");
  }
}

