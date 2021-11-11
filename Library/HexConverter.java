package Lab06;


public class HexConverter {
    

    public static String decimalToHexHelper ( int decimal, String s){
        char [] hex = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E', 'F'};
        // Ending condition of recursion.
        if ( decimal > 0)
        {
            s = hex[ decimal % 16] + s;
            // Recursive step.
            return decimalToHexHelper ( decimal / 16, s);
        }

        else
        {
            return s;
        }
    }

    

    public static String decimalToHex ( int decimal){
        return decimalToHexHelper ( decimal, "");
    }


    public static void main (String [] args) throws Exception {
        System.out.println ( decimalToHex ( 13));
    }
}
