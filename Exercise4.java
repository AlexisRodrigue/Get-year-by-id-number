import java.util.Scanner;

/**
 * Exercise 4 from Unit 1 scenery 1 - Programming languages initial concepts
 */
public class Exercise4 {

    public static void main (String [ ] args) {

        //Scanner variable to get data
        Scanner sc = new Scanner(System.in);

        //Get identification number - expecting format: yymmdd#####
        System.out.println("Enter the ID's Identification Number:");
        String IDNumber = sc.nextLine();

        //Get first char of the identification number
        char IDNumberChar0 = IDNumber.charAt(0);
        
        //Validate if the first char is different to 0 and checks if the idnumber has 11 digits
        if (IDNumberChar0 != '0' && IDNumber.length() == 11) {
            //Get the second number char to get the 2 year numbers
            char IDNumbeChar1 = IDNumber.charAt(1);
            //Print the result using  + "" + to concatenate the chars as string format
            System.out.println(IDNumberChar0 + "" + IDNumbeChar1);   
        }else
        {
            //Print if the ID number is invalid
            System.out.println("ID number invalid.");
        }
    }
}