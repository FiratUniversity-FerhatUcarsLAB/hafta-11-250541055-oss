public class Multadd {

    // 1️⃣ multadd metodu: a * b + c
    public static double multadd(double a, double b, double c) {
        return a * b + c;
    }

    // 2️⃣ expSum metodu: x * e^(-x) + sqrt(1 - e^(-x))
    public static double expSum(double x) {
        return x * Math.exp(-x) + Math.sqrt(1 - Math.exp(-x));
    }

    // 3️⃣ main metodu: test işlemleri
    public static void main(String[] args) {
        // multadd testi
        System.out.println("Multadd Testleri:");
        System.out.println("2 * 3 + 4 = " + multadd(2, 3, 4));
        System.out.println("1.5 * 2 + 3 = " + multadd(1.5, 2, 3));

        // Matematiksel ifadeler multadd ile hesaplanıyor
        double piOver4 = Math.PI / 4;

        // sin(π/4) + cos(π/4)/2
        double expr1 = multadd(Math.sin(piOver4), 1, Math.cos(piOver4)/2);
        System.out.println("\nsin(π/4) + cos(π/4)/2 = " + expr1);

        // log 10 + log 20
        double expr2 = multadd(Math.log(10), 1, Math.log(20));
        System.out.println("log 10 + log 20 = " + expr2);

        // expSum testi
        double x = 1.0;
        double expSumResult = expSum(x);
        System.out.println("\nexpSum(" + x + ") = " + expSumResult);
    }
}
