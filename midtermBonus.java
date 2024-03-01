public class midtermBonus {

    public static void main(String args[]) {
        BasicCalculator user = new BasicCalculator();
        user.add(5);
        user.subtract(3);
        user.subtract(1);
        user.multiply(10);
        user.divide(2);
        user.multiply(12);
        user.reset(14583);
        user.divide(43);
    }

    public static abstract class AddSubCalculator {
        double myNumber = 0;
        void add(double addAmount) {
            myNumber += addAmount;
            System.out.println("your number is now: " + myNumber);
        }
        void subtract(double subAmount) {
            myNumber -= subAmount;
            System.out.println("your number is now: " + myNumber);
        }
        void reset(double newAmount) {
            myNumber = newAmount;
            System.out.println("your number is now: " + myNumber);
        }
    }
   
    public static class BasicCalculator extends AddSubCalculator{
        BasicCalculator() {
            
        }

        void multiply(double addAmount) {
            myNumber *= addAmount;
            System.out.println("your number is now: " + myNumber);
        }
        void divide(double subAmount) {
            myNumber /= subAmount;
            System.out.println("your number is now: " + myNumber);
        }
    }

}

