package OasisInfobyte;

import java.util.Scanner;
public class ATMInterface
{
    public static void main(String args[]){

        int Balance = 100000, Withdraw, Deposit;
        Scanner sc = new Scanner(System.in);
        int pin=1234;
        System.out.println("Enter Pin : ");
        int pass=sc.nextInt();
        int i=1;
        if(pass!=pin){

            while(true){

                i++;
                System.out.println("Wrong Pin");
                System.out.println("Re-enter pin (Attempts Remaining :- "+i+") : ");
                pass=sc.nextInt();
                if(pass==pin)
                {
                    break;
                }
                if(i==3){
                    System.out.println("You have exceeded your trials,Retry After some time !");
                    System.exit(0);
                }
            }
        }
        if(pass==pin)
        {
            System.out.println("<------Welcome ------>");
            System.out.println("Choose your choice");
            while(true)
            {
                System.out.println("1] Balance Check");
                System.out.println("2] Withdraw money");
                System.out.println("3] Deposit money");
                System.out.println("4] Exit");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("Balance is :- "+Balance);
                        System.out.println("");
                        break;
                    case 2:
                        System.out.println("Enter Withdrawal amount : ");
                        Withdraw=sc.nextInt();
                        if(Withdraw>Balance||Balance==0)
                        {
                            System.out.printf("Sorry you have insufficient balance!!\n");
                            break;
                        }
                        System.out.println("Collect your amount");
                        Balance=Balance-Withdraw;
                        System.out.println("");
                        break;
                    case 3:
                        System.out.print("Enter amount to be deposited: ");
                        Deposit = sc.nextInt();
                        Balance = Balance + Deposit;
                        System.out.println("Your Money has been deposited successfully");
                        System.out.println(" ");
                        break;

                    case 4:
                        System.out.println("We are Happy to Service you... Thank you");
                        System.exit(0);
                }
            }
        }
    }
}
