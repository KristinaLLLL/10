package com.company;

public class ConcreteFactory implements ComplexAbstractFactory {
    @Override
    public Complex createComplex() {
        return new Complex() {
            @Override
            public String getComplex() {
                return null;
            }

            @Override
            public String getComplex(int real, int image) {
                return real+"+sqrt("+image+")";
            }
        };
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        return new Complex() {

            @Override
            public String getComplex() {
                return null;
            }

            @Override
            public String getComplex(int real, int image) {
                return real+"+sqrt("+image+")";
            }
        };
    }
}
