package Lab06;

import java.util.ArrayList;


public class IsLexicographic {

    

    public static boolean isLexicographicHelper( ArrayList <String> s, int index) {

        // Ending condition of recursion.
        if ( index + 1 >= s.size())
        {
            return true;
        }

        else
        {

            if ( s.get( index).compareToIgnoreCase(s.get( index + 1)) > 0)
            {
                return false;
            }

            else
            {
                // Recursive step.
                return isLexicographicHelper ( s, index + 1);
            }
        }
    }

    

    public static boolean isLexicographic( ArrayList <String> s) {
        return isLexicographicHelper( s, 0);
    }


    

    public static void main (String [] args) throws Exception {
        ArrayList <String> words1 = new ArrayList <String> ();
        ArrayList <String> words2 = new ArrayList <String> ();
        ArrayList <String> words3 = new ArrayList <String> ();

        words1.add( "a");
        words1.add( "b");
        words1.add( "c");
        words1.add( "d");
        System.out.println ( words1);
        System.out.println( isLexicographic( words1) + "\n");

        words2.add ( "b");
        words2.add ( "a");
        words2.add ( "d");
        words2.add ( "c");
        System.out.println ( words2);
        System.out.println( isLexicographic( words2) + "\n");
        
    }
}
