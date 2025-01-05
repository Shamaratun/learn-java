package JavaPractice;

public class p {
    public static void main(String[] args) {


                for (int i = 1; i <= 10; ++i) {
                    if (i > 4 && i < 9) {
                        continue;
                    }

                    // Check if it's the last number in the sequence (i == 10)
                    if (i != 10) {
                        System.out.print(i + " , ");
                    } else {
                        System.out.print(i);  // Print the last number without the comma
                    }
                }
            }
        }


