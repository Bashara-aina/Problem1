import java.util.Random;

public class ComputeMethods5026201066 {
    int degreesF = 0;

    public double fToC(double degreesF) {
        double degreesC = 5 / 9.0 * (degreesF - 32);
        return degreesC;
    }

    public double hypotenuse(int a, int b) {
        double c = Math.sqrt(Math.pow(a, 2) + b * b);
        return c;
    }

    public int roll() {
        Random random = new Random();
        int randomnum1 = random.nextInt(6) + 1;
        int randomnum2 = random.nextInt(6) + 1;
        int jumlah = (randomnum1 + randomnum2);
        return jumlah;
	
    }
}