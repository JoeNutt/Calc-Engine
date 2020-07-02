package com.joe.calc;

public class Main {

	public static void main(String[] args) {
		double[] leftVals = {100.0d, 25.0d, 225.0d, 11.0d};
		double[] rightVals = {50.0d, 92.0d, 17.0d, 3.0d};
		char[] opCodes = {'d', 'a', 's', 'm'};
		double[] Results = new double[opCodes.length];

		for (int i = 0; i < opCodes.length; i++) {
			switch (opCodes[i]) {
				case 'a':
					Results[i] = leftVals[i] + rightVals[i];
					break;
				case 's':
					Results[i] = leftVals[i] - rightVals[i];
					break;
				case 'm':
					Results[i] = leftVals[i] * rightVals[i];
					break;
				case 'd':
					Results[i] = rightVals[i] != 0 ? leftVals[i] / rightVals[i] : 0.00d;
					break;
				default:
					System.out.println("invalid Opcode" + opCodes[i]);
					Results[i] = 0.0d;
					break;
			}
			}
			for(double currentResult : Results)
			System.out.println(currentResult);

	}
}
