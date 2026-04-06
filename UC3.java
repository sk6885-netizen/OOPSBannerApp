/**
 * OOPSBannerApp UC3 - OOPS Banner Display Application
 *
 * This class refactors UC2 by replacing the + operator with String.join()
 * for more memory-efficient string construction of the OOPS banner.
 *
 * @author Developer
 * @version 3.0
 */
public class UC3{

    public static void main(String[] args) {

        // Line 1
        System.out.println(String.join("", " *******  ", " *******  ", " *******  ", "  ****** "));
        // Line 2
        System.out.println(String.join("", "*       * ", "*       * ", "*       * ", " *      *"));
        // Line 3
        System.out.println(String.join("", "*       * ", "*       * ", "*       * ", " *       "));
        // Line 4
        System.out.println(String.join("", "*       * ", "*       * ", "********* ", "  ****** "));
        // Line 5
        System.out.println(String.join("", "*       * ", "*       * ", "*         ", "        *"));
        // Line 6
        System.out.println(String.join("", "*       * ", "*       * ", "*         ", " *      *"));
        // Line 7
        System.out.println(String.join("", " *******  ", " *******  ", "*         ", "  ****** "));
    }
}