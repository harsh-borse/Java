import java.util.Scanner;
class bank_details
{
   String name, ac_no;
   float balance;
   bank_details(String name, String ac_no,float balance)
   {
    this.ac_no = ac_no;
    this.name = name;
    this.balance = balance;
   }

   void withdraw()
   {
    float amt;
    Scanner sc = new Scanner(System.in);
    System.out.print("\n Enter amount: ");
    amt = sc.nextFloat();
    balance = balance - amt;
    System.out.println("\nAvailable balance: " + balance);
   }

   void deposit()
   {
    float amt;
    Scanner sc = new Scanner(System.in);
    System.out.print("\n Enter amount: ");
    amt = sc.nextFloat();
    balance = balance + amt;
    System.out.println("\nAvailable balance: " + balance);
   }
   public class Bank
   {
    public static void main(String args[])
    {
        bank_details b = new bank_details("Harsh Borse", "123456789", 10000.0f);
        Scanner sc = new Scanner(System.in);
        int ch;
        do
        {
            System.out.println("\n1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    b.withdraw();
                    break;
                case 2:
                    b.deposit();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while(ch != 3);
   }
   }

}
