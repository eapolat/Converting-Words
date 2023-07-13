import java.util.Scanner; 

public class Lab04_Q2 {

    public static void main(String [] args) {

        Scanner myscan = new Scanner (System.in);

        System.out.print("Enter chart data: ");

        String entered_chart = myscan.nextLine();

        boolean invalidchar = false;

        for (int i = 0 ; i < entered_chart.length() ; i++ ) {

            char character = entered_chart.charAt(i);


            if (!Character.isDigit(character)) {

                invalidchar = true;

            } 
            
        }
        if (invalidchar) {
            System.out.println("Invalid chart data!"); 
        }
        else {
                String review_print = "";

                for (int review_num = 0; review_num < entered_chart.length(); review_num++ ) {

                review_print = review_print + " Review " + (review_num+1);
                }

                System.out.println(review_print);

                int height = 9;
            
                for (int j = height; j > 0; j-- ) {

                String review_line = "";

                for (int review_num = 0; review_num < entered_chart.length(); review_num++ ) {

                    char c = entered_chart.charAt(review_num);
                    int character_numeric = Character.getNumericValue(c);

                if (character_numeric >= j) {
                    review_line = review_line + "      ***";
                } else {
                    review_line = review_line + "         ";
                }

                }

                    System.out.println(review_line);

                }
        

               /*  float sum = 0;
                sum = sum + character;
                float average = sum / entered_chart.length();
                System.out.printf("Average Review: %.1f %n");

            } */
            myscan.close();


        }
        float sum = 0;

        for (int i = 0 ; i < entered_chart.length() ; i++ ) {

            char c = entered_chart.charAt(i);
            int character_numeric = Character.getNumericValue(c);

            sum = sum + character_numeric;
        }

        float average = sum / entered_chart.length();

        if (!invalidchar) {

        System.out.printf("Average Review: %.1f", average);

        }
 
    }

} 




