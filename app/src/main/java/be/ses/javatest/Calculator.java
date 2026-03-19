package be.ses.javatest;

public class Calculator {
    public Float divide(Float x, Float y) {
        return x / y;
    }

    public Float multiply(Float x, Float y) {
        return x * y;
    }

    public Float subtract(Float x, Float y) {
        return x - y;
    }

    public Float add(Float x, Float y) {
        return x + y;
    }   

    public Float root(Float x) {
        return (float) Math.sqrt(x);
    }
}
