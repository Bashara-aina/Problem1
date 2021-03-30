public class TestClass5026201066 {
    public static void main(String[] args){
	ComputeMethods5026201066 x = new ComputeMethods5026201066();
	double degreesF = 90;
	x.fToC(degreesF);
        System.out.println("Temp in celsius is " + x.fToC(degreesF));
	int a = 3;
	int b = 4;
	x.hypotenuse(a, b);
	System.out.println("Hypotenuse is " + x.hypotenuse(a, b));
	x.roll();
	System.out.println("The sum of the dice values is " + x.roll());
	
    }
}