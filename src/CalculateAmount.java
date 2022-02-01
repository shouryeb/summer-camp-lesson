
public class CalculateAmount extends Frame {
    Frame f1 = new Frame();

    public String info() {

        String currency1 = f1.arr[0];
        String currency2 = f1.arr[1];
        String value = f1.arr[2];

        char fromUnit = currency1.charAt(0);
        char toUnit = currency2.charAt(0);
        double money = Double.parseDouble(value);

        char[] implicitIndex = {'U','E','Y','P','C','A'};
        int coord1 = 0;
        for (int i = 0; i < 6; i++){
            if (fromUnit == implicitIndex[i]){
                coord1 = i;
            }
        }
        int coord2 = 0;
        for (int j = 0; j < 6; j++){
            if (toUnit == implicitIndex[j]){
                coord2 = j;
            }
        }
        return calculate(coord1,coord2,money);
    }
    public String calculate(int x, int y, double amount){
        double[][] conversionFactors = {{1.00,1.12983,0.00866985,1.36,0.786396,0.721611,},
                                        {0.880966,1.00,0.0076,1.116479,1.00,0.637946},
                                        {115.356,130.681,1.00,155.79,90.50,82.91},
                                        {0.741368,0.838184,0.00643971,1.00,0.583284,0.536749},
                                        {1.26837,1.4432,0.01105,100,1.00,0.91759},
                                        {1.39,1.57,0.012,1.87,1.09,1.00}};

        return Integer.toString((int)(amount * (conversionFactors[y][x])));
    }
}