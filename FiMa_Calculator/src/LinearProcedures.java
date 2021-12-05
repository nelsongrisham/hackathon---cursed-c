public class LinearProcedures {
    /**
     *
     * @param args
     * @TODO Methoden unabhängig von Klassenvariable schreiben
     */

    public static void main(String[] args){

    }
    //Lineare Zinsrechnung gesucht Z
    public double getLinearInterest(double captial, double interestRate, int time){
        interest = (capital * interestRate * time)/(360);
        return interest;
    }
    //Lineare Zinsrechnung gesucht Zn
    public double getLinearInterestTimeFrame(double startCapital, double timeframe, double interestRate){
        interest = startCapital * timeframe * interestRate;
        return interest;
    }
    //Lineare Zinsrechnung gesucht Kn
    public double getLinearEndCapital(double startCapital, double timeframe, double interestRate){
        endCapital = startCapital * (1 + timeframe * interestRate);
        return endCapital;
    }
}