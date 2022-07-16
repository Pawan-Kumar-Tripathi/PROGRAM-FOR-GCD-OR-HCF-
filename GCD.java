import java.io.*;
import java.util.*;
class GCD
    {
        public void main()
        {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the first number");
            int y = sc.nextInt();
            int x = sc.nextInt();
            int min ;
            int ans = 1;
            if ( x>=y )
            {
                min = y;
            }
            else
            {
                min = x;
            }
            for(int i = 1; i <= min; i ++)
            {
                if ( x % i == 0  && y % i == 0 )
                {
                     ans = i ;
                }
            }
            System.out.println(" the gcd is " +ans);
        }
    }