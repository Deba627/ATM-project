/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package access.modifiers;

/**
 *
 * @author DEBA
 */
import java.util.Scanner;

public class Bank {
//    private balance

    private double balance = 0;
//    deposit amount

    public int deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit: " + amount + ", " + "Balance: " + balance);
        }
        return amount;
    }

    public int withdraw(int withdrawAmount) {
        if (withdrawAmount < balance) {
            balance -= withdrawAmount;
            System.out.println("Withdraw: " + withdrawAmount + ", " + "Remaining Balance: " + balance);
        }
        return withdrawAmount;
    }

    public void showbalance() {
        System.out.println("Balance:" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank b = new Bank();    // one object can be access to multiple method
        while (true) {

            System.out.println("----Welcome to The ATM----");
            System.out.println("1.Deposit Amount");
            System.out.println("2.Withdraw Amount");
            System.out.println("3.Balance Enquiry");
            System.out.println("4.Exit");
//        user input to select from menu
            System.out.println("Enter your Choice: ");
            int num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Enter the Amount you want to deposit:  ");
//                  dep variable , user se input
                    int dep = sc.nextInt();
//                     method mein dep ko pass krdiya , directly inside the parameters
                    b.deposit(dep);
                    break;
                case 2:
                    System.out.println("Enter the Amount you want to withdraw: ");
                    int wdraw = sc.nextInt();
                    b.withdraw(wdraw);
                    break;
                case 3:
                    b.showbalance();
                    break;
                case 4:
                    System.out.println("THANK YOU !!!, VISIST AGAIN !!");
                    return;
                default:
                    System.out.println("Something went wrong, try again!!");
                    break;
            }
        }

//       b.deposit(5000);
//       b.withdraw(2000);
//       b.showbalance();
    }

}
//}
