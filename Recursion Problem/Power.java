//Q. print x^n . (stack height = n)


public class Power {
    public static int calcPower(int x , int n)  {
        if( n == 0) {           //base case 1
            return 1;
        }
        if(x == 0)  {           //base case 2
            return 0;
        }
        int xPowernm1 = calcPower(x , n-1);       //recursion
        int xPown = x * xPowernm1;
        return xPown;
    }

    public static void main(String args[]) {
        int x = 2 , n = 5;
        int ans = calcPower(x , n);
        System.out.println(ans);

    }
    
}
