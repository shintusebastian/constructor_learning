package learning;

public class Calculator {
    String type;

    public Calculator(String type) {
        this.type = type;
    }

    //we can do polymorphism as long as the signature of the method is different
    //signature of a method is the method name and type of the arguments that are passing.
    public int sum(int a, int b) { //signature of this method is sum(int, int)
        return a + b;
    }

    public int sum(int a, int b, int c) {//signature of this method is sum(int, int, int)
        return sum(a , b) + c;// here we have overloaded the sum(a,b) from another function.
    }

    public double sum(double a, double b) { //signature is sum(double, double)
        return a + b;
    }
    public long sum(int a, long b){
        return a+b;
    }
}
