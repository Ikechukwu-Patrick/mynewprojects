package Dispatch_Riders;

public class DispatchRiders {
    public static int accountantCalculator(int numberOfSuccessFulDelievery) {
        if (numberOfSuccessFulDelievery < 0) {
            throw new IllegalArgumentException("Invalid input");
        }
        else if (numberOfSuccessFulDelievery < 50) {
            return numberOfSuccessFulDelievery * 160 + 5000;

        } else if (numberOfSuccessFulDelievery <= 59) {
            return numberOfSuccessFulDelievery * 200 + 5000;

        } else if (numberOfSuccessFulDelievery <= 69) {
            return numberOfSuccessFulDelievery * 250 + 5000;

        } else if (numberOfSuccessFulDelievery >= 70 ) {
            return numberOfSuccessFulDelievery * 500 + 5000;

        }
        return numberOfSuccessFulDelievery;
    }

    public static void main(String[] args) {
        try {
            System.out.println(accountantCalculator(80));
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
        }

    }
    }



