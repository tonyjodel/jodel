package com.tonyjodel.calculator;

public class DamageCalculator {

    public int calculerDegats(int force, int defense) {
        int resultat = force - defense;
        if (resultat < 1) {
            return 1;
        }
        return resultat;
    }

    public int calculerDegats(int force, int defense, double bonus) {
        if (bonus <= 0) {
            throw new IllegalArgumentException("Bonus invalide");
        }

        int resultat = (int)(force * bonus) - defense;
        if (resultat < 1) {
            return 1;
        }
        return resultat;
    }
}
