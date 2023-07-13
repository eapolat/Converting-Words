import java.util.Scanner;


public class Lab04_Revision {
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

                if (!Character.isLetter(character) | Character.isUpperCase(character)) {

                    System.out.println("Invalid input! Only enter lowercase letters.");

                    i = 1000;
                }
            }

                int max_count = 1;
                char most_used_letter = '\0';
                int count = 0;
                //int flag = 0;

                for (char control_charac = 'a' ; control_charac <= 'z' ; control_charac++) {

                    count = 0;

                    for (int j = 0 ; j < original_input.length(); j++) {

                        if (original_input.charAt(j)==control_charac) {

                            count++;
                        }
                    }

                    if (count >= max_count) {

                        max_count = count;
                        most_used_letter = control_charac;
                    }
                }

                if (max_count != 1) {

                converted_input = original_input.replace(most_used_letter, '(');

                }
                else {
                    if (max_count == 1) {

                        most_used_letter = original_input.charAt(0);

                        converted_input = original_input.replace(original_input.charAt(0), '(');
                    }

                }

                for (int k = 0; k < original_input.length(); k++) {
                    char control_charac_2 = original_input.charAt(k);

                    if (!(control_charac_2 == most_used_letter)) {


                        char new_charac = (char) (control_charac_2 + original_input.length());
                        if (new_charac > 122) {
                            new_charac = (char) (new_charac - 26);
                        }
                        converted_input = converted_input.replace(control_charac_2, new_charac);


                    }
                }

            }

            boolean control = true;

            for (int i = 0; i < original_input.length(); i++) {

                char character = original_input.charAt(i);

                if (!(Character.isLetter(character)) | Character.isUpperCase(character)) {
                   i = 1000;
                   control = false;
                }
            }
                if (control == true) {
                System.out.println("Length: " + converted_input.length());
                System.out.printf("Converted word: %s %n", converted_input);
                }



                //} else {
                   // System.out.println("Invalid input! Only enter lowercase letters.");
                    // i = 1000;
                

                
        
        
        } 
        
        while (!(original_input.toLowerCase()).equals(exit));

        myscan.close();

    }
}    
