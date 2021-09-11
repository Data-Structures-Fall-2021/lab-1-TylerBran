public class TaylorSeries {
    public double approximateExp(int exponent, int NumIterations){
        double approx=0;
        int Iterations=0;
        while(Iterations<=NumIterations){
            approx=approx+(pow(exponent,Iterations)/factorial(Iterations));
            Iterations++;
        }
        return approx;
    }
    public double factorial(int n){
        if(n==0){
            return 1;
        } else{
            return(n*factorial(n-1));
        }
    }
    public double pow(int x, int n){
        if(n==0) {
            return 1;
        } else{
            return(x*pow(x,n-1));
        }
    }

}
