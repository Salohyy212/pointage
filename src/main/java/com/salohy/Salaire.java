package com.salohy;



public final class Salaire {
    private final int brut;
    private final int net;

    public Salaire(int brut, int net) {
        this.brut = brut;
        this.net = net;
    }

    public Salaire(int brut) {
        this.brut = brut;

        double tauxImpotsSurLeRevenu = 0.2;
        this.net = (int) (brut - (brut * tauxImpotsSurLeRevenu));
    }

    public int getBrut() {
        return brut;
    }

    public int getNet() {
        return net;
    }
}
