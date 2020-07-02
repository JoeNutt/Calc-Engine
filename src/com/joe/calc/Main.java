package com.joe.calc;

public class Main {

    public static void main(String[] args) {
	double doubleValue1 = 100.0d;
	double doubleValue2 = 50.0d;
	char charOpcode = 'd';
	double doubleResult = 0.0d;
	if(charOpcode == 'a')
        doubleResult = doubleValue1 + doubleValue2;
	else if (charOpcode == 's')
        doubleResult = doubleValue1 - doubleValue2;
	else if (charOpcode == 'm')
        doubleResult = doubleValue1 * doubleValue2;
	else if (charOpcode == 'd')
        doubleResult = doubleValue1 / doubleValue2;

	else doubleResult = 0.0d;

	System.out.println(doubleResult);

    }
}
