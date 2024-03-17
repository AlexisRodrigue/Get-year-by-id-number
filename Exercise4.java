import java.util.Scanner;

/**
 * test1
 */
public class Exercise4 {

    public static void main (String [ ] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the ID's Identification Number:");
        String IDNumber = sc.nextLine();
        char IDNumberChar0 = IDNumber.charAt(0);
        if (IDNumberChar0 != '0') {
            char IDNumbeChar1 = IDNumber.charAt(1);
            System.out.println(IDNumberChar0 + "" + IDNumbeChar1);   
        }else
        {
            System.out.println("ID number invalid.");
        }

    }
}