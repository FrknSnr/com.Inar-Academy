package chapters.chapter10.Exercise08;

import java.util.Scanner;

public class Tax {

    private static final int SINGLE_FILER = 0;
    private static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    private static final int MARRIED_SEPARATELY = 2;
    private static final int HEAD_OF_HOUSEHOLD = 3;

    private int fillingStatus;
    private int[][] brackets;
    private double[] rates;
    private double taxableIncome;

    public Tax() {
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.fillingStatus = filingStatus;
        this.taxableIncome = taxableIncome;
        this.rates = rates;
        this.brackets = brackets;

    }

    public double getTaxableIncome() {
        return taxableIncome;
    }

    public void setTaxableIncome(double taxableIncome) {
        this.taxableIncome = taxableIncome;
    }

    public int getFillingStatus() {
        return fillingStatus;
    }

    public void setFillingStatus(int fillingStatus) {
        this.fillingStatus = fillingStatus;
    }

    public int[][] getBrackets() {
        return brackets;
    }

    public void setBrackets(int[][] brackets) {
        this.brackets = brackets;
    }

    public double[] getRates() {
        return rates;
    }

    public void setRates(double[] rates) {
        this.rates = rates;
    }

    public double getTax() {
        double tax = 0;

        return 0;

    }
}
