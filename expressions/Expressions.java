
package expressions;

public class Expressions {
    public static void main(String[] args) {
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        System.out.println(myTotal);
        myThirdNumber = myFirstNumber * 2;
        System.out.println(myTotal);
        int myLastOne = myTotal - 1000;
        System.out.println(myLastOne);
    }
}