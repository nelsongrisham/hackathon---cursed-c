public class RepaymentCalculation {

    public static void main(String[] args) {

    }

    public double getRepaymentRate(double startCapital, int time) {
        return startCapital / time;
    }

    public double getResidualDebt(double startCapital, int timepast, int numberRates) {
        return startCapital * (1 - timepast / (double) numberRates);
    }

    public double getInterestCharges(double startCapital, int timepast, int numberRates, double intrestRate) {
        return startCapital * (1 - (timepast - 1) / (double) numberRates) * intrestRate;
    }

    public double getAnnuity(double startCapital, int timepast, int numberRates, double intrestRate) {
        return startCapital / numberRates + startCapital * (1 - (timepast - 1) / numberRates) * intrestRate;
    }

    public double getRepaymentAmount(double firstRepayment, double interestRate, int timepast) {
        return firstRepayment * Math.pow(interestRate + 1, timepast - 1);
    }

    public double getInterestAmount(double interestRate, double startCapital, double firstRepayment, int timepast) {
        return interestRate * (startCapital - firstRepayment * (Math.pow(interestRate + 1, timepast - 1) - 1) / (interestRate));
    }

    public double getResidualDebt(double startCapital, double interestRate, int timepast, double Annuity) {
        return startCapital * Math.pow(interestRate + 1, timepast) - Annuity * (Math.pow(interestRate + 1, timepast) - 1) / (interestRate - 1);
    }

    public double getRuntime(double Annuity, double firstRepayment, double interestRate){
        return (Math.log(Annuity)-Math.log(firstRepayment))/Math.log(interestRate+1);
    }
}