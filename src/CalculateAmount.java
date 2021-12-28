import javax.swing.*;
import java.awt.*;

public class CalculateAmount extends Frame{

    final double YEN_FACTOR = 114.87;
    final double EURO_FACTOR = .88;
    final double POUND_FACTOR = .74;
    final double CAN_FACTOR = 1.28;
    final double AUS_FACTOR = 1.38;

    Frame f1 = new Frame();

    public void calculate() {
setLabel2();

        String currency1 = f1.arr[0];
        String currency2 = f1.arr[1];
        String value = f1.arr[2];

        char fromUnit = currency1.charAt(0);
        char toUnit = currency2.charAt(0);
        double money = Integer.parseInt(value);

        if (fromUnit == 'U' && toUnit == 'E') {
            double answer = UtoE(money,false);
            
            
        } else if (fromUnit == 'U' && toUnit == 'Y') {
            double answer = UtoY(money,false);
            
            

        } else if (fromUnit == 'U' && toUnit == 'P') {
            double answer = UtoP(money,false);
            
            

        } else if (fromUnit == 'U' && toUnit == 'C') {
            double answer = UtoC(money,false);
            
            

        } else if (fromUnit == 'U' && toUnit == 'A') {
            double answer = UtoA(money,false);
            
            

        } else if (fromUnit == 'E' && toUnit == 'U') {
            double answer = UtoE(money,true);
            
            

        } else if (fromUnit == 'E' && toUnit == 'Y') {
            double answer = UtoY(UtoE(money,true),false);
            
            

        } else if (fromUnit == 'E' && toUnit == 'P') {
            double answer = UtoP(UtoE(money,true),false);
            
            

        } else if (fromUnit == 'E' && toUnit == 'C') {
            double answer = UtoC(UtoE(money, true), false);
            
            

        } else if (fromUnit == 'E' && toUnit == 'A') {
            double answer = UtoA(UtoE(money,true),false);
            
            

        } else if (fromUnit == 'Y' && toUnit == 'E') {
            double answer = UtoE(UtoY(money,true),false);
            
            

        } else if (fromUnit == 'Y' && toUnit == 'P') {
            double answer = UtoP(UtoY(money,true),false);
            
            

        } else if (fromUnit == 'Y' && toUnit == 'C') {
            double answer = UtoC(UtoY(money,true),false);
            
            

        } else if (fromUnit == 'Y' && toUnit == 'A') {
            double answer = UtoA(UtoY(money,true),false);
            
            

        } else if (fromUnit == 'Y' && toUnit == 'U') {
            double answer =UtoY(money,true);
            
            

        } else if (fromUnit == 'P' && toUnit == 'U') {
            double answer = UtoP(money,true);
            
            

        } else if (fromUnit == 'P' && toUnit == 'E') {
            double answer = UtoE(UtoP(money,true),false);
            
            

        } else if (fromUnit == 'P' && toUnit == 'Y') {
            double answer = UtoY(UtoP(money,true),false);
            
            
            
        } else if (fromUnit == 'P' && toUnit == 'C') {
            double answer = UtoC(UtoP(money,true),false);
            
            

        } else if (fromUnit == 'P' && toUnit == 'A') {
            double answer = UtoA(UtoP(money,true),false);
            
            

        } else if (fromUnit == 'C' && toUnit == 'U') {
            double answer = UtoC(money,true);
            
            

        } else if (fromUnit == 'C' && toUnit == 'E') {
            double answer = UtoE(UtoC(money,true),false);
            
            

        } else if (fromUnit == 'C' && toUnit == 'Y') {
            double answer = UtoY(UtoC(money,true),false);
            
            

        } else if (fromUnit == 'C' && toUnit == 'P') {
            double answer = UtoP(UtoC(money,true),false);
            
            

        } else if (fromUnit == 'C' && toUnit == 'A') {
            double answer = UtoA(UtoC(money,true),false);
            
            

        } else if (fromUnit == 'A' && toUnit == 'U') {
            double answer = UtoA(money,true);
            
            

        } else if (fromUnit == 'A' && toUnit == 'E') {
            double answer = UtoE(UtoA(money,true),false);
            
            

        } else if (fromUnit == 'A' && toUnit == 'Y') {
            double answer = UtoY(UtoA(money,true),false);
            
            

        } else if (fromUnit == 'A' && toUnit == 'P') {
            double answer = UtoP(UtoA(money,true),false);
            
            

        } else if (fromUnit == 'A' && toUnit == 'C') {
            double answer = UtoC(UtoA(money,true),false);
            


        } else{
            label.setText("Your initial conversion and final conversion are the same!");
           
        }
    }

    public double UtoY(double amount,boolean reverse){
        if (reverse == false){
            return amount * YEN_FACTOR;
        } else {
            return amount / YEN_FACTOR;
        }

    }
    public double UtoE(double amount, boolean reverse){
        if (reverse == false){
            return amount * EURO_FACTOR;
        } else {
            return amount / EURO_FACTOR;
        }
    }
    public double UtoP(double amount, boolean reverse){
        if (reverse == false){
            return amount * POUND_FACTOR;
        } else {
            return amount / POUND_FACTOR;
        }
    }
    public double UtoC(double amount, boolean reverse){
        if (reverse == false){
            return amount * CAN_FACTOR;
        } else {
            return amount / CAN_FACTOR;
        }
    }
    public double UtoA(double amount, boolean reverse){
        if (reverse == false){
            return amount * AUS_FACTOR;
        } else {
            return amount / AUS_FACTOR;
        }
    }












    public void displayAns(){
        JLabel label = new JLabel();

    }
}
