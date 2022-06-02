public class D2 {

    public static void main( String[] args )
    {
        String input = InputString();

        for ( int i = 0; i < input.length(); i++ )
        {
            char c = input.charAt( i );
            if ( Character.isWhitespace( c ) ) {
                System.out.print( '_' );
            } else if ( Character.isLetter( c ) ) {
                System.out.print( Character.toUpperCase( c ) );
            }
        }
    }


}
