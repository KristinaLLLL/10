package com.company;

public class Main {

    public static void main(String[] args) {
	ConcreteFactory complex=new ConcreteFactory();
	Complex com=complex.CreateComplex(4, -5);
	System.out.println(com.getComplex(4, -5));
    }
}
