import java.util.Scanner;

abstract class Order {
    int id;
    String description;

    abstract void accept();
    abstract void display();
}

class PurchaseOrder extends Order {
    String customerName;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Purchase Order ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Description: ");
        description = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        customerName = sc.nextLine();
    }

    void display() {
        System.out.println("\n--- Purchase Order ---");
        System.out.println("Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Customer Name: " + customerName);
    }
}

class SalesOrder extends Order {
    String vendorName;

    void accept() {
        Scanner sc = new Scanner(System.in);

        System.out.print("\nEnter Sales Order ID: ");
        id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Description: ");
        description = sc.nextLine();

        System.out.print("Enter Vendor Name: ");
        vendorName = sc.nextLine();
    }

    void display() {
        System.out.println("\n--- Sales Order ---");
        System.out.println("Order ID: " + id);
        System.out.println("Description: " + description);
        System.out.println("Vendor Name: " + vendorName);
    }
}

public class OrderManagement {
    public static void main(String[] args) {

        PurchaseOrder p = new PurchaseOrder();
        SalesOrder s = new SalesOrder();

        p.accept();
        p.display();

        s.accept();
        s.display();
    }
}