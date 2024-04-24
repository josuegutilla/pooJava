import Entities.Product;
import Exercicio.Account;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        System.out.println("Enter product data: ");
//        System.out.print("Name: ");
//        String name = sc.next();
//        System.out.print("Price: ");
//        double price = sc.nextDouble();
//        System.out.print("Quantity in stock: ");
//        int quantity = sc.nextInt();
//
//        Product mouse = new Product(name, price, quantity);
//
//        // modificando o valor do atributo com a function setName. Encapsulamento.
//        mouse.setName("Computer");
//        System.out.println("Update name: " + mouse.getName());
//
//        System.out.println("Product data: " + mouse);
//
//        System.out.print("Enter the number of products to be added in stock: ");
//        int addMouse = sc.nextInt();
//        mouse.addProduct(addMouse);
//
//        System.out.println("Update data: " + mouse);
//
//        System.out.print("Enter the number of products to be removed from stock: " );
//        int removeMouse = sc.nextInt();
//        mouse.removeProduct(removeMouse);
//
//        System.out.println("Update data: " + mouse);

        // Exercicios:

        Account account;

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        System.out.print("Enter account holder: ");
        String holderAccount = sc.next();
        System.out.print("Is there na initial deposist (y/n)? ");
        String response = sc.next();

        if(response.equals("y")) {
            System.out.print("Enter initial deposit value: ");
            double depositInit = sc.nextDouble();

            account = new Account(numberAccount, holderAccount, depositInit);
        }
        else {
            account = new Account(numberAccount, holderAccount);
        }

        System.out.println("Account data: ");
        System.out.println("Account " + account);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        account.deposit(depositValue);

        System.out.println("Update account data: ");
        System.out.println("Account " + account);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        account.withdraw(withdrawValue);

        System.out.println("Update account data: ");
        System.out.println("Account " + account);
    }
}