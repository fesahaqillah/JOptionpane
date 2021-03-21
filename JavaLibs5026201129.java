import javax.swing.JOptionPane;

public class JavaLibs5026201129 {

    public static void main(String[] args) {
        int welcome;
        welcome = JOptionPane.showConfirmDialog(null,"Are you ready to know that you're loved?", "Welcome",
                                                JOptionPane.YES_NO_OPTION);

        String first_name;
        first_name = JOptionPane.showInputDialog("What is your first name?");

        String Love_Someone;
        Love_Someone = JOptionPane.showInputDialog("Are you falling in love with someone?");

        String Someone_name;
        Someone_name = JOptionPane.showInputDialog("Mention your biggest idols in your life!");

        String Someone_gender;
        Someone_gender = JOptionPane.showInputDialog("Is him/her?");

        int your_age;
        your_age = (Integer.parseInt(JOptionPane.showInputDialog("How Old Are You?")));

        double your_height;
        your_height = (Integer.parseInt(JOptionPane.showInputDialog("How Tall Are You?")));

        int comfortable_one;
       comfortable_one = JOptionPane.showConfirmDialog(null,"Do you feel comfortable with your height?", "You Are Cute",
                JOptionPane.YES_NO_OPTION);

        double your_weight;
        your_weight = (Double.parseDouble(JOptionPane.showInputDialog("What is Your Weight? ")));

        int comfortable_two;
        comfortable_two = JOptionPane.showConfirmDialog(null,"Do you feel comfortable with your weight?", "You Are Beautiful",
                JOptionPane.YES_NO_OPTION);

        Object[] options = {"Of Course!", "I don't think so"};
        int message_dialog;
        message_dialog = (JOptionPane.showOptionDialog(null, "Do you love yourself?", "Important Question",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null, options,options[0]));

        int firstnumber= Integer.parseInt(JOptionPane.showInputDialog(null, "Choose a number between 0-10"));
        int secondnumber= Integer.parseInt(JOptionPane.showInputDialog(null, "How many people are there in your family?"));
        int sum=firstnumber+secondnumber;

        double thirdnumber= Double.parseDouble(JOptionPane.showInputDialog(null, "What is your favorite decimal number?"));
        double fourthnumber= Double.parseDouble(JOptionPane.showInputDialog(null, "What is your unlucky decimal number?"));
        double quot=thirdnumber/fourthnumber;

        //show message box at the end

        JOptionPane.showMessageDialog(null,"Hello, " + first_name + "!" +
                                 "I'll tell you something that you may not know before.\n" + Someone_name + " loves you like you love " + Someone_gender + "\n" +
                                 "You're height is " + your_height + "cm and your weight is "  + your_weight + "kg.\n" + "That's mean you got a perfect body goals on your "
                                 + your_age + "years old!\n You must feel comfortable with that, baby!\n" + sum + "is your future child! Wow! It means that you're such a loveable person!\n and "
                                 + quot + "is your lucky number!" + "Uh,Oh! You desserve to be loved expecialy by yourself!!");



    }
}
