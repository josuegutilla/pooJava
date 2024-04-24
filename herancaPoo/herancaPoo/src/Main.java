import exercicio.Employee;
import exercicio.OutsourcedEmployee;
import model.BusinessAccount;
import model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Conta userJosue = new Conta(1, "Josué", 5599);
//        System.out.println("numero da conta: " + userJosue.getNumeroConta());
//        System.out.println("nome do usuário: " + userJosue.getNameUSer());
//        System.out.println("total na conta: " + userJosue.getTotalDinheiro());
//
//        userJosue.retirar(599); // 5000
//        System.out.println("valor atualizado para: " + userJosue.getTotalDinheiro());
//
//        System.out.println("- - - - - - - - - - - - - - - -");
//
//        BusinessConta rwBombas = new BusinessConta(2, "RW Bombas", 155000,  350000);
//        System.out.println("nome da empresa: " + rwBombas.getNameUSer());
//        System.out.println("numero da conta: " + rwBombas.getNumeroConta());
//        System.out.println("total na conta " + rwBombas.getTotalDinheiro());
//        System.out.println("limite total: " + rwBombas.getLimiteTotal());
//
//        System.out.println("- - - - - - - - - - - - - - - -");
//
//        Conta joao = new Conta(1001, "João", 1000.0);
//        joao.retirar(200.0);
//        System.out.println(joao.getTotalDinheiro());
//
//        // Upcasting
//        // sobreposicao
//        // polimorfismo
//        Conta emanuelly = new BusinessConta(1002, "Emanuelly", 1000.0, 5);
//        emanuelly.retirar(200);
//        System.out.println(emanuelly.getTotalDinheiro());


        // Upcasting: de baixo p cima
//        Account conta1 = new BusinessAccount(1001, "josué", 100, 500);

        //Downcasting: de cima p baixo
//        BusinessAccount conta2 = (BusinessAccount) new Account(1002, "Joao", 200);


        // exercicios:

        System.out.print("Enter the number of employees: ");
        int employees = sc.nextInt();

        List<Employee> list = new ArrayList<>();

        for(int x = 1; x <= employees; x++) {
            System.out.println("Employee #" + x + " data: ");
            System.out.print("Outsourced (y/n)? ");
            char resp = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valorPerHour = sc.nextDouble();

            if(resp == 'y') {
                System.out.print("Additional charge: ");
                double charge = sc.nextDouble();

                list.add(new OutsourcedEmployee(name, hours, valorPerHour, charge));
            }
            else {
                list.add(new Employee(name, hours, valorPerHour));
            }
        }

        System.out.println();
        System.out.println("PAYMENTS: ");
        for(Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }

        sc.close();
    }
}