public class DynamicProcedures {

    /**
     *
     *
     * @param args
     * @TODO Regula falsi ergänzen? Wie fügen wir die unterjährige Verzinsung (zeitproportional) hinzu (iv, ieff, inom)?
     * @TODO Gleiches Problem für (e^i, peff, ikonf)
     */
    public static void main(String[] args){

    }
    //gesucht Barwert K0, gegeben Kn
    public double getDynamicStartCapitalEndCapital(double endCapital, double interestRate, int time){
        return (endCapital * (1/Math.pow(interestRate+1, time)));

    }
    //gesucht Barwert K0, gegeben Annuität, vorschüssig
    public double getDynamicStartCapitalAnnuityForwards(double interestRate, double annuity, int time){
        return annuity * ((interestRate+1)*(Math.pow(interestRate+1, time)-1))/(Math.pow(interestRate+1, time)*(interestRate));
    }

    //gesucht Barwert K0, gegeben Annuität, nachschüssig
    public double getDynamicStartCapitalAnnuityAfterwards(double interestRate, double annuity, int time){
        return annuity * ((interestRate *(Math.pow(interestRate+1,time)-1))/(Math.pow(interestRate+1,time)*(interestRate)));
    }

    //gesucht Kn, gegeben K0
    public double getDynamicEndCapitalStartCapital(double endCapital, double interestRate, int time){
        return endCapital * Math.pow(interestRate+1, time);
    }

    //gesucht Kn, gegeben Annuität, vorschüssig
    public double getDynamicEndCapitalAnnuityForwards(double endCapital, double interestRate, double annuity, int time){
        return annuity * ((interestRate+1 *(Math.pow(interestRate+1,time))-1))/((interestRate+1)-1);
    }

    //gesucht Kn, gegeben Annuität, nachschüssig
    public double getDynamicEndCapitalAnnuityAfterwards(double startCapital, double interestRate, double annuity, int time){
       return annuity * ((Math.pow(interestRate+1,time)-1))/((interestRate+1)-1);
    }

    //gesucht A, gegeben K0 vorschüssig
    public double getDynamicAnnuityStartCapitalAfterwards(double startCapital, double interestRate, int time){
        return startCapital * ((Math.pow(interestRate+1,time)-1)*((interestRate+1)-1)/((interestRate+1)*(Math.pow(interestRate+1,time)-1)));
    }

    //gesucht A, gegeben K0 nachschüssig
    public double getDynamicAnnuityStartCapitalForwards(double startCapital, double interestRate, int time){
        return startCapital * ((Math.pow(interestRate+1,time)-1)*((interestRate+1)-1)/((Math.pow(interestRate+1,time))-1));
    }

    //gesucht A, gegeben Kn vorschüssig
    public double getDynamicAnnuityEndCapitalForwards(double endCapital, double interestRate, int time){
        return endCapital * (interestRate/((Math.pow(interestRate+1,time)-1)*(interestRate+1)));
    }

    //gesucht A, gegeben Kn nachschüssig
    public double getDynamicAnnuityEndCapitalAfterwards(double endCapital, double interestRate, int time){
        return endCapital*(interestRate/Math.pow(interestRate+1,time)-1);
    }

    //gesucht q, gegeben Kn und K0
    public double getDynamicInterestRate(double startCapital, double endCapital, int time){
        return Math.pow((endCapital/startCapital),1/time);
    }

    //gesucht n, gegeben Kn und K0
    public double getDynamicTimeEndStartCapital(double startCapital, double endCapital, double interestRate){
        return ((Math.log(endCapital)-Math.log(startCapital))/Math.log(interestRate+1));
    }

    //gesucht n, gegeben Kn, A, nachschüssig
    public double getDynamicTimeEndCapital(double endCapital, double interestRate, double annuity){
        return Math.log((endCapital/annuity)*interestRate+1)/Math.log(interestRate+1);
    }

    //gesucht n, gegeben K0, A, nachschüssig
    public double getDynamicTimeStartCapital(double startCapital, double interestRate, double annuity){
        return (Math.log(annuity)-Math.log(annuity-startCapital*interestRate))/Math.log(interestRate+1);
    }

    //gesucht p, gegeben Kn, K0
    public double getDynamicInterest(double interestRate){
        return interestRate*100;
    }
    //gesucht Regula falsi, gegeben r

    //gesucht X1,X2, gegeben p/q-Formel

    //gesucht ewige Rente, gegeben K0
    public double getUnlimitedPension(double annuity, double interestRate){
        return annuity / interestRate;
    }
    //gesucht Unterjährige Verzinsung (zeitproportional), gegeben iv
    public double getSteadyInterest(){
        return
    }
    //gesucht Unterjährige Verzinsung (zeitproportional), gegeben ieff
    public double getSteadyInterest(){
        return
    }
    //gesucht Unterjährige Verzinsung (zeitproportional), gegeben Kn
    public double getSteadyInterest(){
        return
    }
    //gesucht Stetige Verzinsung, gegeben K0
    public double getSteadyInterest(){
        return
    }
    //gesucht Stetige Verzinsung, gegeben Peff
    public double getSteadyInterest(){
        return
    }
    //konformer Periodenzins, gegeben ikonf
    public double getSteadyInterest(){
        return
    }
}


