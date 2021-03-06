package PrintFormat;

/**
 * Created by mkoduri on 6/26/2018.
 *
 * Java printf( )
 *
 * % [flags] [width] [.precision] conversion-character ( square brackets denote optional parameters )
 *
 *
 * ==============================================================================================================
 *
 *
 * @ Format String:
 *   Composed of literals and format specifiers. Arguments are required only if there are format specifiers in the
 *   format string. Format specifiers include: flags, width, precision, and conversion characters in the following
 *   sequence:
 *   % [flags] [width] [.precision] conversion-character ( square brackets denote optional parameters )

 * @ Flags:
 *   - : left-justify ( default is to right-justify )
 *   + : output a plus ( + ) or minus ( - ) sign for a numerical value
 *   0 : forces numerical values to be zero-padded ( default is blank padding )
 *   , : comma grouping separator (for numbers > 1000)
 *   : space will display a minus sign if the number is negative or a space if it is positive

 * @ Width:
 *   Specifies the field width for outputting the argument and represents the minimum number of characters to
 *   be written to the output. Include space for expected commas and a decimal point in the determination of
 *   the width for numerical values.
 *
 * @ Precision:
 *   Used to restrict the output depending on the conversion. It specifies the number of digits of precision when
 *   outputting floating-point values or the length of a substring to extract from a String. Numbers are rounded
 *   to the specified precision.
 *
 * @ Conversion-Characters:
 *   d : decimal integer [byte, short, int, long]
 *   f : floating-point number [float, double]
 *   c : character Capital C will uppercase the letter
 *   s : String Capital S will uppercase all the letters in the string
 *   h : hashcode A hashcode is like an address. This is useful for printing a reference
 *   n : newline Platform specific newline character- use %n instead of \n for greater compatibility
 *
 *
 *===============================================================================================================
 *
 */
public class PrintFormats {

    public static void main(String[] args) {

        System.out.println("=================================");
        int i = 461012;
        System.out.format("The value of i is: %d%n", i);
        System.out.println("=================================");
        double d = 22.33;
        float f = 22.3f;
        System.out.printf("float value : %f",f );

        System.out.printf("\n float value : %.2f %n",f );
        System.out.println("=================================");
        double d1 = 1.2;
        float f1 = 1.2f;
        System.out.printf("%f %f",d1,f1);
        System.out.printf("%n %.2f %.1f",d1,f1);


    }
}
