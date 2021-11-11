package Lab06;

public class LetterRemover {
        
        public static String removeLetterHelper ( StringBuilder s, char c, int index)
        {
            // Ending condition of recursion.
            if ( s.length() > index)
            {
                if ( s.charAt( index) == c)
                {
                    s = s.deleteCharAt(index);
                    // Recursive step.
                    return ( removeLetterHelper ( s, c, index));
                }

                //runs the method at the next index.*/

                else
                {
                    // Recursive step.
                    return ( removeLetterHelper ( s, c, index + 1));
                }

            }

            // Final result.
            else{
                return s.toString();
            }

        }

        
        public static String removeLetter ( String s, char c)
        {
            StringBuilder word = new StringBuilder ( s);
            return removeLetterHelper ( word, c, 0);
        }

        

        public static void main (String [] args) throws Exception {
            String s1 = "random random";
            System.out.println( removeLetter ( s1, 'r'));
        }

}
