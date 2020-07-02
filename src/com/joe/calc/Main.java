package com.joe.calc;

public class Main {

    public static void main(String[] args) {
	double doubleValue1 = 100.0d;
	double doubleValue2 = 50.0d;
	char charOpcode = 'd';
	double doubleResult = 0.0d;

	switch (charOpcode){
		case 'a':
        doubleResult = doubleValue1 + doubleValue2;
        break;
		case 's':
        doubleResult = doubleValue1 - doubleValue2;
        break;
		case 'm':
        doubleResult = doubleValue1 * doubleValue2;
        break;
		case'd':
			doubleResult = doubleValue2 != 0 ? doubleValue1 / doubleValue2 : 0.00d;
			break;
		default:
		System.out.println("invalid Opcode"+ charOpcode);
		doubleResult = 0.0d;
		break;
	}
	System.out.println(doubleResult);
    }
}
