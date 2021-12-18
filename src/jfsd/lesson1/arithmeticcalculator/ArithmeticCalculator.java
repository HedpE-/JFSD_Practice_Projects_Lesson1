package jfsd.lesson1.arithmeticcalculator;

public class ArithmeticCalculator {

	public void add(int num1, int num2) {
		writeOperation(num1+" + "+num2);
		System.out.println("Result:\n"+(num1+num2));
	}
	public void add(float num1, float num2) {
		writeOperation(String.format("%.2f", num1)+" + "+String.format("%.2f", num2));
		System.out.println("Result:\n"+String.format("%.2f", num1+num2));
	}
	public void add(int num1, float num2) {
		writeOperation(num1+" + "+String.format("%.2f", num2));
		System.out.println("Result:\n"+String.format("%.2f", num1+num2));
	}
	public void add(float num1, int num2) {
		writeOperation(String.format("%.2f", num1)+" + "+num2);
		System.out.println("Result:\n"+String.format("%.2f", num1+num2));
	}

	public void subtract(int num1, int num2) {
		writeOperation(num1+" - "+num2);
		System.out.println("Result:\n"+(num1-num2));
	}
	public void subtract(float num1, float num2) {
		writeOperation(String.format("%.2f", num1)+" - "+String.format("%.2f", num2));
		System.out.println("Result:\n"+String.format("%.2f", num1-num2));
	}
	public void subtract(int num1, float num2) {
		writeOperation(num1+" - "+String.format("%.2f", num2));
		System.out.println("Result:\n"+String.format("%.2f", num1-num2));
	}
	public void subtract(float num1, int num2) {
		writeOperation(String.format("%.2f", num1)+" - "+num2);
		System.out.println("Result:\n"+String.format("%.2f", num1-num2));
	}

	public void multiply(int num1, int num2) {
		writeOperation(num1+" * "+num2);
		System.out.println("Result:\n"+(num1*num2));
	}
	public void multiply(float num1, float num2) {
		writeOperation(String.format("%.2f", num1)+" * "+String.format("%.2f", num2));
		System.out.println("Result:\n"+String.format("%.2f", num1*num2));
	}
	public void multiply(int num1, float num2) {
		writeOperation(num1+" * "+String.format("%.2f", num2));
		System.out.println("Result:\n"+String.format("%.2f", num1*num2));
	}
	public void multiply(float num1, int num2) {
		writeOperation(String.format("%.2f", num1)+" * "+num2);
		System.out.println("Result:\n"+String.format("%.2f", num1*num2));
	}

	public void divide(int num1, int num2) {
		writeOperation(num1+" / "+num2);
		System.out.println("Result:");
		try {
			System.out.println((int)doDivision(num1, num2));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	public void divide(float num1, float num2) {
		writeOperation(String.format("%.2f", num1)+" / "+String.format("%.2f", num2));
		System.out.println("Result:");
		try {
			System.out.println(String.format("%.2f", doDivision(num1, num2)));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	public void divide(int num1, float num2) {
		writeOperation(num1+" / "+String.format("%.2f", num2));
		System.out.println("Result:");
		try {
			System.out.println(String.format("%.2f", doDivision(num1, num2)));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	public void divide(float num1, int num2) {
		writeOperation(String.format("%.2f", num1)+" / "+num2);
		System.out.println("Result:");
		try {
			System.out.println(String.format("%.2f", doDivision(num1, num2)));
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
	
	private float doDivision(float num1, float num2) {
		if(num2 == 0) {
			throw new ArithmeticException("Cannot divide by zero.");
		}
		return num1/num2;
	}
	
	private void writeOperation(String operation) {
		System.out.println("Operation:\n"+operation);
	}
	
	public static void main(String[] args) {
		
		int i1 = 6;
		int i2 = 83;
		float f1 = 35.5f;
		float f2 = 2.2f;
		
		ArithmeticCalculator calc = new ArithmeticCalculator();

		System.out.println("Addition operations");
		
		calc.add(i1,  i2);
		System.out.println();
		calc.add(f1,  f2);
		System.out.println();
		calc.add(i1,  f2);
		System.out.println();
		calc.add(f1,  i2);
		System.out.println();
		
		System.out.println("Subtraction operations");
		
		calc.subtract(i1,  i2);
		System.out.println();
		calc.subtract(f1,  f2);
		System.out.println();
		calc.subtract(i1,  f2);
		System.out.println();
		calc.subtract(f1,  i2);
		System.out.println();
		
		System.out.println("Multiplication operations");
		
		calc.multiply(i1,  i2);
		System.out.println();
		calc.multiply(f1,  f2);
		System.out.println();
		calc.multiply(i1,  f2);
		System.out.println();
		calc.multiply(f1,  i2);
		System.out.println();

		System.out.println("Division operations");
		
		calc.divide(i1,  0);
		System.out.println();
		calc.divide(i1,  i2);
		System.out.println();
		calc.divide(f1,  0.0f);
		System.out.println();
		calc.divide(f1,  f2);
		System.out.println();
		calc.divide(i1,  0.0f);
		System.out.println();
		calc.divide(i1,  f2);
		System.out.println();
		calc.divide(f1,  0);
		System.out.println();
		calc.divide(f1,  i2);
		System.out.println();

	}

}
