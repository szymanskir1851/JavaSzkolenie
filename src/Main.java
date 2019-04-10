public class Main {
    public static int add(int a, int b) {
        return a + b;
    }

    public static double toF(double x) {
        return 1.8 * x + 32;
    }

    public static double toC(double x) {
        return (x - 32) / 1.8;
    }

    private static void sumOfDigits(int fourDigits) {
        int first = fourDigits / 1000;
        int second = (fourDigits - first * 1000) / 100;
        int third = (fourDigits - first * 1000 - second * 100) / 10;
        int fourth = fourDigits % 10;
        int sum = first + second + third + fourth;
        double avg = (first + second + third + fourth)/4;
        System.out.println(sum);
        System.out.println(avg);
    }

    public static void main(String[] args) {
        //1.1
        System.out.println("Zadanie 1.1");
        boolean b = true;
        int i = 1;
        int i2 = 2;
        char c = 'c';
        long l = 2;
        float f = 1.1f;
        double d = 2.22;
        String s = "wyraz";
        System.out.println(b);
        System.out.println(i);
        System.out.println(c);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(s);
        //1.2
        System.out.println("Zadanie 1.2");
        System.out.println(add(i, i2));
        //1.3
        System.out.println("Zadanie 1.3");
        double tempC = 36.6;
        System.out.println(toF(tempC));
        System.out.println(toC(toF(tempC)));
        //1.4
        int fourDigits = 4621;
        sumOfDigits(fourDigits);
    }
}
