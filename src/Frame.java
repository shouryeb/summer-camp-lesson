import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Frame {
  JFrame f = new JFrame();

  ImageIcon image = new ImageIcon("bill.jpg");
  JTextField input = new JTextField();
  JButton button = new JButton("Calculate");

  String[] toConvertFrom = { "USD", "Euro", "Yen", "Pound", "CAN", "Australian Dollar" };
  JComboBox dropDown = new JComboBox(toConvertFrom);
  JComboBox dropDown2 = new JComboBox(toConvertFrom);

  Border border = BorderFactory.createLineBorder(Color.green, 3);
  Border border1 = BorderFactory.createLineBorder(Color.WHITE, 3);

  public static String[] arr = new String[3];

  JLabel label = new JLabel("Answer Here");

  public void Frame() {

    f.setTitle("Currency Converter");
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f.setResizable(false);
    f.setSize(600, 500);
    f.setVisible(true);
    f.setLayout(null);
    f.setIconImage(image.getImage());
    f.getContentPane().setBackground(Color.DARK_GRAY);

    label.setBounds(235, 300, 300, 50);
    label.setFont(new Font(Font.SERIF, Font.PLAIN, 25));
    label.setForeground(Color.red);

    input.setBounds(50, 75, 100, 50);
    input.setFont(new Font(Font.SERIF, Font.PLAIN, 12));
    input.setBackground(Color.orange);
    input.setBorder(border1);

    dropDown.setBounds(187, 75, 150, 50);
    dropDown.setBackground(Color.orange);
    dropDown.setBorder(border1);

    dropDown2.setBounds(375, 75, 150, 50);
    dropDown2.setBackground(Color.orange);
    dropDown2.setBorder(border1);

    button.setBounds(225, 200, 150, 50);
    button.setBorder(border);
    button.setBackground(Color.pink);

    f.add(dropDown);
    f.add(dropDown2);
    f.add(button);
    f.add(input);
    f.add(label);

    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        String currency1 = "" + dropDown.getItemAt(dropDown.getSelectedIndex());
        String currency2 = "" + dropDown2.getItemAt(dropDown2.getSelectedIndex());
        String value = input.getText();
        getAmount(currency1, currency2, value);
      }
    });
  }

  public void getAmount(String currency1, String currency2, String value) {
    CalculateAmount c = new CalculateAmount();
    arr[0] = currency1;
    arr[1] = currency2;
    arr[2] = value;
    label.setText("Amount: " + c.info());
  }
}
