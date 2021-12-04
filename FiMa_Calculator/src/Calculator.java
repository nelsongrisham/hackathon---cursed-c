import javax.swing.*;

public class Calculator {
    double interest;
    double capital;
    double startCapital;
    double endCapital;
    double interestRate;
    int time;
    double timeframe;

    public void main(String[] args) {
        //System.out.println(getLinearInterest(100, 5,10));
        switch (procedureTypeQuery()) {
            case "Lineare Zinsrechnung": //
                LinearProcedures linearProcedures =  new LinearProcedures();
                break;
            case "Dynamische Verfahren": //
                DynamicProcedures dynamicProcedures = new DynamicProcedures();
                break;
            case "Tilgungsrechnung": //
                RepaymentCalculation repaymentCalculation = new RepaymentCalculation();
                break;
            default:
                System.out.println("Error - procedureTypeQuery in switch");
                break;
        }
    }

    /**
     * Eingabe über JOptionPane
     * @author tomas
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
     * @author tomas
     */
    public String resultQuery()
    {
        String[] options = {"firstOption", "secondOption", "thirdOption"};
        ImageIcon icon = new ImageIcon("src/images/calculatorImage.png");
        String resultType = (String)JOptionPane.showInputDialog(null, "Was möchtest du berechnen?",
                "Ergebnisabfrage", JOptionPane.QUESTION_MESSAGE, icon, options, options[3]);
        System.out.println(resultType);
        return resultType;
    }

    /**
     * Erste Userabfrage, bei der erfragt wird, um welchen Aufgabentyp es sich handelt.
     * Mögliche Eingaben:
     *      Lineare Zinsrechnung
     *      Dynamische Verfahren
     *      Tilgungsrechnung
     * @author tomas
     *
     */
    public String procedureTypeQuery()
    {
        String[] options = {"Lineare Zinsrechnung", "Dynamische Verfahren", "Tilgungsrechnung"};
        ImageIcon icon = new ImageIcon("src/images/calculatorImage.png");
        String procedureType = (String)JOptionPane.showInputDialog(null, "Um was für einen Verfahrenstypen handelt es sich?",
                "Abfrage Verfahrenstypen", JOptionPane.QUESTION_MESSAGE, icon, options, options[3]);
        System.out.println(procedureType);
        return procedureType;
    }
}


