public class DynamicProcedures {
    double interest;
    double startCapital;
    double endCapital;

    public void main(String[] args){

    }
    //Zinsrechnung dynamische Zinsrechnung, gesucht Barwert K0
    public double getDynamicStartCapital(double capital, double q, int time){
        startCapital = (capital * (1/Math.pow(q, time)));
        return interest;
    }
    //Zinsrechnung dynamische Zinsrechnung, gesucht Kn
    public double getDynamicEndCapital(double startCapital, double q, int time){
        endCapital = startCapital * Math.pow(q, time);
        return endCapital;
    }
}
