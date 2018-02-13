import java.util.Scanner;
public class Main {


    public static long hex(String dig) {

        String digits = "0123456789ABCDEF";
        dig = dig.toUpperCase();
        long value = 0;
        for (int z = 0; z < dig.length(); z++)
        {

            char a = dig.charAt(z);
            int b = digits.indexOf(a);
            //value = 16 * value + b; //stackoverflow
            value = value + (long)Math.pow(16,dig.length() - 1 - z) * b;
        }
        return value;
    }
    public static void main (String args[])
    {
        String Hexinput;
        long Decimal;
        Scanner scnr = new Scanner(System.in);


        System.out.print("Enter a hexadecimal number: ");
        Hexinput = scnr.nextLine();
        if (Hexinput.startsWith("0x")){
            Hexinput = Hexinput.substring(2);
        }

        Decimal = hex(Hexinput);
        System.out.print("Your number is " + Decimal + " in decimal");
    }
}


