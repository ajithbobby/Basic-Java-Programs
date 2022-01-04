public class Altprime
{ public static void main(String[] args)   
  { int n =100,flag,num,i,temp=2;    
    System.out.println("Alternate prime numbers up to " + n+" are: \n");     
    for(num = 2; num <= n-1; num++)  
    { flag=0;
      for(i = 2; i<= num / 2; i++)  
      { if(num%i==0)
        { flag=1;
          break;
        }
        else
        flag=0;
      }
      if(flag==0)
      { if(temp%2==0)
        System.out.print(num+"\t");
        temp++;
      }
    }
  }
}


