public class ForLoop {
    public static void main(String[] args) {
        for(int counter = 1; counter <= 5; counter++){
            System.out.println(counter);
        }

//        System.out.println("10,000 at 2% interest = " + calculateInterest(10000.0, 2.0));
//        System.out.println("10,000 at 3% interest = " + calculateInterest(10000.0, 3.0));
//        System.out.println("10,000 at 4% interest = " + calculateInterest(10000.0, 4.0));
//        System.out.println("10,000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for(double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(10000.0,rate);
            System.out.println("10,000 at " + rate + "% interest = " + interestAmount);
        }

        for(double newRate = 7.5; newRate <= 10; newRate+=0.25){
            double newInterestAmount = calculateInterest(100.00, newRate);
            if(newInterestAmount > 8.5){break;}
            System.out.println("100.00 at " + newRate + "% interest = $" + newInterestAmount);
        }
    }

    public static double calculateInterest(double amount, double interestRate){
        return (amount * (interestRate / 100));
    }
}
