package Lab06;


public class Enumerator {
    

    public static void  evenEnumerateHelper ( int startPoint, int endPoint) {

        // Ending condition of recursion.
        if ( startPoint <= endPoint)
        {
            if ( check ( startPoint, 0))
            {
                System.out.print ( startPoint + " ");
            }
            // Recursive step.
            evenEnumerateHelper( startPoint + 1, endPoint);
        }
    }

    

    public static void evenEnumerate ( int digit) {
        evenEnumerateHelper ((int) Math.pow( 10, digit - 1),(int) Math.pow( 10, digit));
    }

    
    public static boolean check ( int i, int index) {
        String s = String.valueOf( i);

        // Ending condition of recursion.
        if ( index + 1 >= s.length())
        {
            return true;
        }

        else
        {
            // Checks if the digits are in increasing order and the integer is even.
            if ( Character.getNumericValue( s.charAt( index)) < Character.getNumericValue( s.charAt ( index + 1)) && i % 2 == 0)
            {   
                // Recursive step.
                return check ( i,  index + 1);
            }

            else
            {
                return false;
            }
        }
    }

    
    public static void main (String [] args) throws Exception {
        //evenEnumerate( 1);
        //evenEnumerate( 2);
        evenEnumerate( 3);
    }
}
