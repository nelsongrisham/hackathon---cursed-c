import javax.swing.*;

public class Calculator {
    double interest;
    double capital;
    double startCapital;
    double endCapital;
    double interestRate;
    int time;
    double timeframe;
    String resultType;


    public static void main(String[] args) {
        //System.out.println(getLinearInterest(100, 5,10));
        String resultType;
        switch (procedureTypeQuery()) {
            case "Lineare Zinsrechnung": //
                LinearProcedures linearProcedures = new LinearProcedures();
                resultType = resultQuery(new String[]{
                        "Zinsen",
                        "Zinsen nach n Jahren",
                        "Kapital nach n Jahren"});
                break;
            case "Dynamische Verfahren": //
                DynamicProcedures dynamicProcedures = new DynamicProcedures();
                resultType = resultQuery(new String[]{
                        "Barwert K_0 mit K_n berechnen",
                        "Barwert K_0 mit A berechnen",
                        "Endwert K_n mit K_0 berechnen",
                        "Endwert K_n mit A berechnen",
                        "Annuitaet A mit 0 berechnen",
                        "Annuitaet A mit K_n berechnen",
                        "Laufzeit n mit K_n und K_0 berechnen",
                        "Laufzeit n mit K_n und A berechnen",
                        "Laufzeit n mit K_0 und A berechnen",
                        "Zinssatz q mit K_n und K_0 berechnen",
                        "Zinssatz p mit K_n und K_0 berechnen",
                        "Regula falsi berechnen",
                        "pq-Formel",
                        "Ewige Rente - K_0 berechnen",
                        "Unterjährige Verzinsung (zeitproportional): Effektivzinssatz der unterjährigen Zinsperiode i_v berechnen",
                        "Unterjährige Verzinsung (zeitproportional): Effektiven Jahreszinssatz berechnen i_eff",
                        "Unterjährige Verzinsung (zeitproportional): Endwert K_n berechnen",
                        "Stetige Verzinsung - Endwert berechnen",
                        "Effektiven Zinssatz p_eff berechnen",
                        "Konformen Periodenzins i_konf berechnen"});
                break;
            case "Tilgungsrechnung": //
                RepaymentCalculation repaymentCalculation = new RepaymentCalculation();
                String typeOfRepaymentCalculation = queryTypeOfRepaymentCalculation();
                if (typeOfRepaymentCalculation.equals("Ratenschuldtilgung")) {
                    resultType = resultQuery(new String[]{
                            "Tilgungsrate",
                            "Restschuld",
                            "Zinsen",
                            "Annuität"});
                } else {
                    resultType = resultQuery(new String[]{
                            "Tilgungsbetrag",
                            "Zinsbetrag",
                            "Restschuld",
                            "Laufzeit"});
                }
                break;
            default:
                System.out.println("Error - procedureTypeQuery in switch");
                break;
        }
    }

    /**
     * Eingabe über JOptionPan
     */
    private void multipleInput() {
        JTextField zahlenMaxField = new JTextField(5);
        JTextField zahlenZiehungField = new JTextField(5);

        JPanel myPanel = new JPanel();
        myPanel.add(new JLabel("Capital:"));
        myPanel.add(zahlenMaxField);
        myPanel.add(Box.createHorizontalStrut(15)); // a spacer
        myPanel.add(new JLabel("Interest Rate:"));
        myPanel.add(zahlenZiehungField);
        myPanel.add(new JLabel("Time (in years)::"));
        myPanel.add(zahlenZiehungField);

        int result = JOptionPane.showConfirmDialog(null, myPanel,
                "Please Enter the two Values", JOptionPane.OK_CANCEL_OPTION);
        if (result == JOptionPane.OK_OPTION) {

            capital = Integer.parseInt(String.valueOf(zahlenMaxField));
            interestRate = Integer.parseInt(String.valueOf(zahlenZiehungField));
        }
    }

    /**
     * Userabfrage, bei der erfragt wird, was berechnet werden soll.
     */
    public static String resultQuery(String[] options) {
        ImageIcon icon = new ImageIcon("src/images/calculatorImage.png");
        String resultType = (String) JOptionPane.showInputDialog(null, "Was möchtest du berechnen?",
                "Ergebnisabfrage", JOptionPane.QUESTION_MESSAGE, icon, options, options[1]);
        System.out.println(resultType);
        return resultType;
    }

    /**
     * Erste Userabfrage, bei der erfragt wird, um welchen Aufgabentyp es sich handelt.
     * Mögliche Eingaben:
     * Lineare Zinsrechnung
     * Dynamische Verfahren
     * Tilgungsrechnung
     */
    public static String procedureTypeQuery() {
        String[] options = {"Lineare Zinsrechnung", "Dynamische Verfahren", "Tilgungsrechnung"};
        ImageIcon icon = new ImageIcon("src/images/calculatorImage.png");
        String procedureType = (String) JOptionPane.showInputDialog(null, "Um was für einen Verfahrenstypen handelt es sich?",
                "Abfrage Verfahrenstypen", JOptionPane.QUESTION_MESSAGE, icon, options, options[1]);
        System.out.println(procedureType);
        return procedureType;
    }

    public static String interestWarp() {
        String[] options = {"Vorschüssig", "Nachschüssig"};
        ImageIcon icon = new ImageIcon("src/images/calculatorImage.png");
        String InterestWarp = (String) JOptionPane.showInputDialog(null, "Möchtest du vorschüssige oder nachschüssige Werte berechnen?",
                "Abfrage Verfahrenstypen", JOptionPane.QUESTION_MESSAGE, icon, options, options[1]);
        System.out.println(InterestWarp);
        return InterestWarp;
    }

    public static String queryTypeOfRepaymentCalculation() {
        String[] options = {"Ratenschuldtilgung", "Annuitaetentilgung"};
        ImageIcon icon = new ImageIcon("src/images/calculatorImage.png");
        String typeOfRepaymentCalculation = (String) JOptionPane.showInputDialog(null, "Was für eine Art von Tilgungsrechnung möchtest du vornehmen?",
                "Abfrage des Type der Tilgungsrechnung", JOptionPane.QUESTION_MESSAGE, icon, options, options[0]);
        System.out.println(typeOfRepaymentCalculation);
        return typeOfRepaymentCalculation;
    }
}