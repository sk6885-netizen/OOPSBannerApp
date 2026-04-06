/**
 * OOPSBannerApp UC4 - OOPS Banner Display Application
 *
 * This class refactors UC3 by storing all banner lines in a String array
 * and using a for-each loop to print them, eliminating repetitive print
 * statements and improving code modularity and reusability.
 *
 * @author Developer
 * @version 4.0
 */
public class UC4 {

    public static void main(String[] args) {

        // Step 1: Create a String array to hold all 7 lines of the OOPS banner
        String[] bannerLines = new String[7];

        // Step 2: Populate each line using String.join()
        bannerLines[0] = String.join("", " *******  ", " *******  ", " *******  ", "  ****** ");
        bannerLines[1] = String.join("", "*       * ", "*       * ", "*       * ", " *      *");
        bannerLines[2] = String.join("", "*       * ", "*       * ", "*       * ", " *       ");
        bannerLines[3] = String.join("", "*       * ", "*       * ", "********* ", "  ****** ");
        bannerLines[4] = String.join("", "*       * ", "*       * ", "*         ", "        *");
        bannerLines[5] = String.join("", "*       * ", "*       * ", "*         ", " *      *");
        bannerLines[6] = String.join("", " *******  ", " *******  ", "*         ", "  ****** ");

        // Step 3: Use a for-each loop to print each line
        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
}