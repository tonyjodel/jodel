public class Fraction3 {
    private final int num; 
    private final int den; 

    public Fraction3(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }

        int pgcd = MathUtils.pgcd(num, den);
        num /= pgcd;
        den /= pgcd;

        if (den < 0) {
            num = -num;
            den = -den;
        }

        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    public Fraction3 add(Fraction3 other) {
        int newNum = this.num * other.den + other.num * this.den;
        int newDen = this.den * other.den;
        return new Fraction3(newNum, newDen);
    }

    public Fraction3 multiply(Fraction3 other) {
        return new Fraction3(this.num * other.num, this.den * other.den);
    }

    public double toDouble() {
        return (double) num / den;
    }

    public String toString() {
        return num + "/" + den;
    }

    public static void main(String[] args) {
        Fraction3 f = new Fraction3(2, 3);
        Fraction3 g = new Fraction3(1, 6);

        assert f.add(g).toString().equals("5/6") : "Addition incorrecte";
        assert f.multiply(g).toString().equals("1/9") : "Multiplication incorrecte";

        System.out.println("f = " + f);                  // 2/3
        System.out.println("g = " + g);                  // 1/6
        System.out.println("f + g = " + f.add(g));       // 5/6
        System.out.println("f * g = " + f.multiply(g));  // 1/9
        System.out.println("f en double = " + f.toDouble()); // ≈ 0.666...
    }
}
