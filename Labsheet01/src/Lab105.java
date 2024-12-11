import javax.swing.JOptionPane;
public class Lab105 {
    public static void main(String[] args)
    {
 

        String cdId = JOptionPane.showInputDialog(null,
               "This program calculates the total cost of a CD order" + 
               "\nPlease enter the ID of the the CD",
               "Input",JOptionPane.QUESTION_MESSAGE);
        String cdTitle = JOptionPane.showInputDialog(null,
                "Please enter the title of the CD",
                "Input",JOptionPane.QUESTION_MESSAGE);
        double cdPrice = Double.parseDouble(JOptionPane.showInputDialog(null,
                "Please enter the price of the CD in U.S. dollars",
                "Input",JOptionPane.QUESTION_MESSAGE));
        int cdQuantity = Integer.parseInt(JOptionPane.showInputDialog(null,
                "Please enter the quantity to be purchased",
                "Input",JOptionPane.QUESTION_MESSAGE));
        //calculation
        double cdSubtotal = cdPrice * cdQuantity;
        double cdTotal = cdSubtotal * (1 + 0.0625);
        //display
        JOptionPane.showMessageDialog(null,
                "Summary of the transaction:" +
                "\n"+ 
                "\nCD ID: "+cdId+
                "\nCD Title: "+ cdTitle + 
                "\nCD Unit Price: $" +cdPrice+ 
                "\nCD Quantity: "+cdQuantity+ 
                "\n"+
                "\nSubtotal: $"+ cdSubtotal +
                "\nTax rate: 6.25%"+ 
                "\nTotal: $" +cdTotal+
                "\n"+ 
                "\nEnd of Program");
    }
}