public class Fraction {
    private final int num; // numérateur
    private final int den; // dénominateur

    public Fraction(int num, int den) {
        if (den == 0) {
            throw new IllegalArgumentException("Le dénominateur ne peut pas être zéro.");
        }
        // ici on pourrait simplifier la fraction (réduction)
        this.num = num;
        this.den = den;
    }

    public int getNum() {
        return num;
    }

    public int getDen() {
        return den;
    }

    @Override
    public String toString() {
        return num + "/" + den;
    }

    // Exemple d'addition
    public Fraction add(Fraction other) {
        int newNum = this.num * other.den + other.num * this.den;
        int newDen = this.den * other.den;
        return new Fraction(newNum, newDen); // à réduire plus tard
    }

    // Tu peux ajouter soustraction, multiplication, division ici

    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 2);
        Fraction f2 = new Fraction(3, 4);
        Fraction result = f1.add(f2);
        System.out.println(f1 + " + " + f2 + " = " + result);
    }
}
