import javax.swing.*;
import java.util.Scanner;

public class Terminal {
    public static void main(String[] args) {
        System.out.println("put the card");
        Scanner scanner = new Scanner(System.in);
        String cardScan = scanner.next();

        Card adminCard = new Card(false);
        adminCard.setPinCode(1111);
        adminCard.setBalance(232897982);


        if (cardScan.equals("y")){
            while (!adminCard.isBlock){  //TODO active check
                System.out.println("Enter pin");
                Scanner pin = new Scanner(System.in);

                if (adminCard.getPinCode()==pin.nextInt()){
                    System.out.println("your balance is " + adminCard.getBalance() + "$");
                }else System.out.println("wrong pin");
            }
        }else {
            System.out.println("access denied");
        }
    }
}
