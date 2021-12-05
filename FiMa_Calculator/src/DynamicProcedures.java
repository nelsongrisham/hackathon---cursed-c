public class DynamicProcedures {
    double interestRate;
    double startCapital;
    double endCapital;
    double capital;
    double annuity;
    int time;


    public static void main(String[] args){

    }
    //Zinsrechnung, gesucht Barwert K0, gegeben Kn
    public double getDynamicStartCapitalEndCapital(double endCapital, double interestRate, int time){
        startCapital = (capital * (1/Math.pow(interestRate+1, time)));
        return startCapital;
    }
    //gesucht Barwert K0, gegeben Annuität, vorschüssig
    public double getDynamicStartCapitalAnnuityForward(double startCapital, double interestRate, double annuity, int time){
        double q = 1 + interestRate;
        startCapital = annuity * (q*(Math.pow(q, time)-1))/()
        return startCapital;
    }

    //gesucht Barwert K0, gegeben Annuität, nachschüssig
    public double getDynamicStartCapitalAnnuityAfterwards(double startCapital, double interestRate, double annuity int time){
        startCapital = annuity * ((interestRate *(Math.pow(interestRate+1, time)-1));
        return startCapital;
    }


    //gesucht Kn, gegeben Zinssatz, Laufzeit
    public double getDynamicEndCapital(double startCapital, double interestRate, int time){
        endCapital = startCapital * Math.pow(interestRate+1, time);
        return endCapital;
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
