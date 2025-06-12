public class Fraction2 {
    private final int num; // numérateur
    private final int den; // dénominateur

    public Fraction2(int num, int den) {
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

    public Fraction2 add(Fraction2 other) {
        int newNum = this.num * other.den + other.num * this.den;
        int newDen = this.den * other.den;
        return new Fraction2(newNum, newDen);
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    public static void main(String[] args) {
        Fraction2 f1 = new Fraction2(1, 2);
        Fraction2 f2 = new Fraction2(3, 4);
        Fraction2 result = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + result);  // 1/2 + 3/4 = 5/4
    }
}
