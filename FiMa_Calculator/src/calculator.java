import javax.swing.*;

public class calculator {
    double interest;
    double capital;
    double interestRate;
    double time;


    public void main(String[] args) {
            System.out.println(getLinearInterest(100, 5,10));
    }

  

    //Zinsrechnung lineare Zinsrechnung, gesucht Zinsen
    public double getLinearInterest(double captial, double interestRate, double time){
        interest = (capital * interestRate * time)/(360 * 100);
        return interest;
    }
    
    public double getLinearInterestAtTime(double startCapital, double , double )
    
    //Zinsrechnung dynamische Zinsrechnung, gesucht Barwert K0
    public double getDynamicInterest(double )
    

    }

    private  void multipleInput() {
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
}


