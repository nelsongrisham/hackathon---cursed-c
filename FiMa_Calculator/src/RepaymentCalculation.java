public class RepaymentCalculation {

    public static void main (String[] args){

    }
    public double getRepaymentRate(double startCapital, int time){
        return startCapital/time;
    }

    public double getResidualDebt(double startCapital, int timepast, int numberRates){
        return startCapital * (1 - timepast / (double)numberRates);
    }

    public double getInterestCharges(double startCapital, int timepast, int numberRates, double intrestRate){
        return startCapital * (1 - (timepast - 1) / (double)numberRates) * intrestRate;
    }

    public double getAnnuity(double startCapital, int timepast, int numberRates, double intrestRate){
        return startCapital / numberRates + startCapital * (1-(timepast-1)/numberRates) * intrestRate;
    }


}
