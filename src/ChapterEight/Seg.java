package ChapterEight;

public class Seg {
    private static final String[][] SEGMENTS = {
            {"  ", "| |", "|_|"}, // 0
            {"   ", "  |", "  |"}, // 1
            {"  ", " _|", "|_ "}, // 2
            {"  ", " _|", " _|"}, // 3
            {"   ", "|_|", "  |"}, // 4
            {"  ", "|_ ", " _|"}, // 5
            {"  ", "|_ ", "|_|"}, // 6
            {"  ", "  |", "  |"}, // 7
            {"  ", "|_|", "|_|"}, // 8
            {"  ", "|_|", " _|"}  // 9
    };
        public static void displayNumber(int number) {
            String numberStr = String.valueOf(number);
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < numberStr.length(); j++) {
                    int digit = Character.getNumericValue(numberStr.charAt(j));
                    System.out.print(SEGMENTS[digit][i] + " ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int displayNumber = 888999;
            displayNumber(displayNumber);
        }




    }
