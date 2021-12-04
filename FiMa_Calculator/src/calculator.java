import javax.swing.*;
import javax.swing.JOptionPane;

public class calculator {
    double interest;
    double capital;
    double interestRate;
    double time;
    String resultType;


    public void main(String[] args) {
        System.out.println(getLinearInterest(100, 5,10));
        resultQuery();
        multipleInput();
    }

  

    //Zinsrechnung lineare Zinsrechnung, gesucht Zinsen
    public double getLinearInterest(double captial, double interestRate, double time){
        interest = (capital * interestRate * time)/(360 * 100);
        return interest;
    }
    
    //public double getLinearInterestAtTime(double startCapital, double , double )
    
    //Zinsrechnung dynamische Zinsrechnung, gesucht Barwert K0
    public double getDynamicInterest(double endCapital, double time, double q){
        interest = (endCapital * (1/Math.pow(q, time));
        return interest;
    }


    private void multipleInput() {
		JTextField capitalField = new JTextField(5);
		JTextField interestRateField = new JTextField(5);
		JTextField timeField = new JTextField(5);

		JPanel myPanel = new JPanel();
		myPanel.add(new JLabel("Capital:"));
		myPanel.add(capitalField);
		myPanel.add(Box.createHorizontalStrut(15)); // a spacer
		myPanel.add(new JLabel("Interest Rate:"));
		myPanel.add(interestRateField);
        myPanel.add(new JLabel("Time (in years): "));
        myPanel.add(timeField);

		int result = JOptionPane.showConfirmDialog(null, myPanel,
				"Please Enter three Values", JOptionPane.OK_CANCEL_OPTION);
		if (result == JOptionPane.OK_OPTION) {

			capital = Double.parseDouble(String.valueOf(capitalField));
            interestRate = Double.parseDouble(String.valueOf(interestRateField));
            time = Double.parseDouble(String.valueOf(timeField));
		}
	}

    public void resultQuery()
    {
        String[] options = {"firstOption", "secondOption", "thirdOption"};
        ImageIcon icon = new ImageIcon("src/images/calculatorImage.png");
        String n = (String)JOptionPane.showInputDialog(null, "What du you want to calculate?",
                "Result Query", JOptionPane.QUESTION_MESSAGE, icon, options, options[2]);
        System.out.println(n);
        resultType = n;
    }


}


