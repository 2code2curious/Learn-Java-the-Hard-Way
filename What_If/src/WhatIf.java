/**
 * 1. If statements are used to control the conditions under which
 * certain statements should be executed.
 * 2. The curly braces define the scope of if statements.
 */

public class WhatIf {
    public static void main( String[] args )
    {
        // 3. Change people variable value
        int people = 30;
        int cats = 30;
        int dogs = 15;

        if ( people < cats )
        {
            System.out.println( "Too many cats!  The world is doomed!" );
        }

        if ( people > cats )
        {
            System.out.println( "Not many cats!  The world is saved!" );
        }

        if ( people < dogs )
        {
            System.out.println( "The world is drooled on!" );
        }

        if ( people > dogs )
        {
            System.out.println( "The world is dry!" );
        }

        dogs += 5;

        if ( people >= dogs )
        {
            System.out.println( "People are greater than or equal to dogs." );
        }

        if ( people <= dogs )
        {
            System.out.println( "People are less than or equal to dogs." );
        }

        if ( people == dogs )
        {
            System.out.println( "People are dogs." );
        }
    }
}