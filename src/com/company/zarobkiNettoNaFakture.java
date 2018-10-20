package com.company;

public class zarobkiNettoNaFakture {
    final double taxRate = 1.23;
    final double incomeTaxRate = 1.18;
    Kalkulator kalkulator = new Kalkulator();
    private double zarobkiNetto;
    private double zarobkiNettoBezZusu;

    public double getZarobkiNaReke(double zarobkiBrutto, double zus) {
        zarobkiNetto = getZarobkiNetto(zarobkiBrutto);
        zarobkiNettoBezZusu = getZarobkiNettoBezZusu(zarobkiNetto, zus);
        return getZarobkiPoPodatkuPit();
    }

    private double getZarobkiPoPodatkuPit() {
        return kalkulator.oblicz(zarobkiNettoBezZusu, incomeTaxRate, "/");
    }


    private double getZarobkiNettoBezZusu(double zarobkiNetto, double zus) {
        return kalkulator.oblicz(zarobkiNetto, zus, "-");
    }

    private double getZarobkiNetto(double zarobkiBrutto) {
        return kalkulator.oblicz(zarobkiBrutto, taxRate, "/");
    }
}

 class TestZarobkiNettoNaFakture {

    public static void main(String[]args){

        zarobkiNettoNaFakture zarobkiNettoNaFakture = new zarobkiNettoNaFakture();
        System.out.println(zarobkiNettoNaFakture.getZarobkiNaReke(20000, 1163));

    }


}

