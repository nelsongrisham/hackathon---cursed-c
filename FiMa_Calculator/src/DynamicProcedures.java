public class DynamicProcedures {


    public static void main(String[] args){

    }
    //gesucht Barwert K0, gegeben Kn
    public double getDynamicStartCapitalEndCapital(double endCapital, double interestRate, int time){
        return (endCapitalal * (1/Math.pow(interestRate+1, time)));

    }
    //gesucht Barwert K0, gegeben Annuität, vorschüssig
    public double getDynamicStartCapitalAnnuityForwards(double interestRate, double annuity, int time){
            double q = interestRate + 1;
        return annuity * (q*(Math.pow(q, time)-1))/(Math.pow(q, time)*(interestRate))
    }

    //gesucht Barwert K0, gegeben Annuität, nachschüssig
    public double getDynamicStartCapitalAnnuityAfterwards(double interestRate, double annuity int time){
        startCapital = annuity * ((interestRate *(Math.pow(q,time)-1))/(Math.pow(q,time)*(q-1)));
        return startCapital;
    }


    //gesucht Kn, gegeben K0
    public double getDynamicEndCapitalStartCapital(double startCapital, double interestRate, int time){
        endCapital = startCapital * Math.pow(interestRate+1, time);
        return endCapital;
    }

    //gesucht Kn, gegeben Annuität, vorschüssig
    public double getDynamicEndCapitalAnnuityForwards(double startCapital, double interestRate, double annuity, int time){
        endCapital =
        return endCapital;
    }

    //gesucht Kn, gegeben Annuität, nachschüssig
    public double getDynamicEndCapitalAnnuityAfterwards(double startCapital, double interestRate, double annuity int time){
        startCapital = annuity * ((interestRate *(Math.pow(q,time)-1))/(Math.pow(q,time)*(q-1)));
        return startCapital;
    }

    //Zinsrechnung dynamische Zinsrechnung, gesucht q
    public double getDynamicInterestRate(double startCapital, double endCapital, int time){
        interestRate= Math.pow((endCapital/startCapital),1/time);
        return interestRate;
    }

    //Zinsrechnung dynamische Zinsrechnung, gesucht n
    public double getDynamicTime(double startCapital, double endCapital, double interestRate){
        double time = ((Math.log(endCapital)-Math.log(startCapital))/Math.log(interestRate+1));
        return time;
    }


}
