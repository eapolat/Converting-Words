import java.util.Scanner;

public class Lab04_Q3 {

    public static void main (String []args) {


        String original_input;
        String exit = "exit";
        String converted_input;
        
        converted_input = " ";

        Scanner myscan = new Scanner (System.in);

        do {

            original_input = " ";
            converted_input = " ";

            System.out.print("Enter word to convert: ");
        
            original_input = myscan.next(); 

            if (!(original_input.toLowerCase()).equals(exit)) {

            for (int i = 0; i < original_input.length(); i++) {

                char character = original_input.charAt(i);


                if (!Character.isLetter(character)) {

                    converted_input = converted_input + "*";
                } else {

                    if (original_input.indexOf(character) == i && original_input.lastIndexOf(character) == i) {

                        converted_input = converted_input + "(";

                    }
                    else {

                    converted_input = converted_input + ")";
                }

            }

            }
            
            System.out.printf("Original word: %s   Converted word: %s %n", original_input, converted_input);

        } 
        
    } while (!(original_input.toLowerCase()).equals(exit));

        myscan.close();
    
}

}