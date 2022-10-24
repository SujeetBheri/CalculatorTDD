package main.java;

public class CalculatorMain {
    public CalculatorMain(){

    }
    public int add(int a, int b){
        return a+b;
    }
    //adding code
    public int sub(int a, int b) {
        return a-b;
    }
    //adding code
    public int mul(int a,int b) {
        return a*b;
    }
    //adding code
    public int div(int a, int b) {
        if(b==0)
            return b;
        else
            return a/b;

    }
    public class cube{
        public void main() {
            int a=3;
            double result=Math.pow(a,3);
            System.out.println("cube of the number is="+result);
        }
    }
}
