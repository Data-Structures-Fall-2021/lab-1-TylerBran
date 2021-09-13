public class TaylorSeries {
    public static double approximateExp(int exponent, int NumIterations){
        double approx=0;
        for(int t =0;t<NumIterations;t++){
            approx+=(pow(exponent,t)/factorial(t));
        }
        return approx;
    }
    public static double factorial(int n){
        if(n<=1){
            return 1;
        } else{
            return(n*factorial(n-1));
        }
    }
    public static double pow(int x, int n){
        if(n==0) {
            return 1;
        } else{
            return(x*pow(x,n-1));
        }
    }
}
