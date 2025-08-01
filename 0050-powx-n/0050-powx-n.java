class Solution {
    public double myPow(double x, int n) {
        return binaryExpo(x,(long) n);
    }
    public double binaryExpo(double x, long n){
        if(n==0){
            return 1;
        }
        if(n<0){
           return 1.0/ binaryExpo(x,-n);
        }
        if(n % 2 == 1){
            return x* binaryExpo(x * x, (n-1) / 2);
        }else{
            return binaryExpo(x * x, n/2);
        }
    }
}

// Explanation
//n%2==1 ->  x*func(x*x)  and n=n-1 else x*x and n/2
//2^10 -> func(4,5) -> 4*func(16,2) -> func(256,1) -> 256* func(65536,0) 
