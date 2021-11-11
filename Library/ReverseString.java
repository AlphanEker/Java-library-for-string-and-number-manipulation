package Lab06;

/**
 * Reverse String
 * This program is designed to reverse strings with recursion
 * @author alpha_e
 * @date 23.04.2021
 */
public class ReverseString {
    

    /**
     * This is a private method to help the recursive step possible. Simply calls itself untill the needed string is present
     * @param s the string needs to be reversed
     * @param reverse is building the reversed string
     * @param length is to know the length of the reversed string (unnecesarry parameter because can be found by reverse.length()).
     * @return
     */
    private static String reverseStringHelper ( String s, String reverse, int length)
    {

        //to know when to stop the recurcion
        if (s.length() == length) {

            return reverse;
        }
        else{

            //adds the reversed car at the string
            reverse = reverse + s.charAt(s.length()-length-1);

            //recursive step
            return reverseStringHelper(s, reverse, length+1);

        }
    }

    //public method to call the private helper
    public static String reverseString ( String s)
    {

        //Variables
        String reverse = "";

        return reverseStringHelper(s, reverse, 0);
    }

    
    public static void main (String [] args) throws Exception {
        System.out.println( reverseString( "ahai my name is alphan"));
    }
    
}
