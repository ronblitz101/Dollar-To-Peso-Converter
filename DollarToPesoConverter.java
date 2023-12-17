import java.io.*;

public class Prob2_DollarToPesoConverter {
    public static void main(String[] args) throws IOException{
        double dblPeso = 45.50, dblDollar, dblConverted;

        BufferedReader buffread = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("\nDollar to Peso Converter.");
        System.out.print("\n\tEnter Dollar amount:\t");
        dblDollar = Double.parseDouble(buffread.readLine());

        //Conversion
        dblConverted = dblDollar * dblPeso;

        System.out.print("\n\t$"+ dblDollar +" is equivalent to P"+ dblConverted +"\n\n");
    }
}