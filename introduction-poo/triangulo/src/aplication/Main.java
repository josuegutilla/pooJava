package aplication;

import entities.Product;

import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;
import entities.Triangulo;
import exercicios.CurrencyConverter;
import exercicios.Estudante;
import exercicios.Funcionario;
import exercicios.Retangulo;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

//        Triangulo x = new Triangulo();
//        Triangulo y = new Triangulo();
//
//        System.out.println("Escreva o tamanho do triangulo X: ");
//        x.setA(sc.nextDouble());
//        x.setB(sc.nextDouble());
//        x.setC(sc.nextDouble());
//
//        System.out.println("Escreva os tamanhos do triangulo y: ");
//        y.setA(sc.nextDouble());
//        y.setB(sc.nextDouble());
//        y.setC(sc.nextDouble());
//
//        System.out.println("Area do triangulo X: " + x.areaTriangulo());
//        System.out.println("Area do triangulo Y: " + y.areaTriangulo());
//
//        if(x.areaTriangulo() > y.areaTriangulo()) {
//            System.out.printf("entities.Triangulo com a area maior X : %.4f%n", x.areaTriangulo());
//        } else {
//            System.out.printf("entities.Triangulo com a area maior Y : %.4f%n", y.areaTriangulo());
//        }

        // -------------------------------------------------------------------------------------------

//        System.out.println("Entre com os dados do produto:");
//
//        System.out.print("Nome: ");
//        String nomeProduct = sc.nextLine();
//
//        System.out.print("Preço: ");
//        double priceProduct = sc.nextDouble();
//
//        System.out.print("Quantidade em estoque: ");
//        int quantityProduct = sc.nextInt();
//
//        Product p = new Product(nomeProduct, priceProduct, quantityProduct);
//
//        System.out.println("Dados do produto: " + p);
//
//        System.out.print("Insira a quantidade de produtos a serem adicionados ao estoque: ");
//        p.addProducts(sc.nextInt());
//        System.out.println("Dados do produto atualizados: " + p);
//
//        System.out.print("Insira a quantidade de produtos a serem removidos do estoque: ");
//        p.removeProducts(sc.nextInt());
//        System.out.println("Dados do produto atualizados: " + p);

        // -------------------------------------------------------------------------------------------
                                        // exercicios:
//
//        Retangulo retangulo = new Retangulo(3, 4);
//        System.out.println("area do retângulo: " + retangulo.area());
//        System.out.println("diagonal do retângulo: " + retangulo.diagonal());
//        System.out.println("largura do retângulo: " + retangulo.getWidth());
//        System.out.println("altura do retângulo: " + retangulo.getHeigth());

        // -------------------------------------------------------------------------------------------

//        System.out.print("Name: ");
//        String nameFunc = sc.next();
//
//        System.out.print("Gross salary: ");
//        double grossSalaryFunc = sc.nextDouble();
//
//        System.out.print("Tax: ");
//        double taxFunc = sc.nextDouble();
//
//        Funcionario josue = new Funcionario(nameFunc, grossSalaryFunc, taxFunc);
//
//        System.out.println("Employee: " + josue.getName() + ", $ " + josue.netSalary());
//
//        System.out.print("Which percentage to increase salary? ");
//        double percentageFunc = sc.nextDouble();
//        josue.increaseSalary(percentageFunc);
//
//        System.out.println("Updated data: " + josue.getName() + ", $ " + josue.getPrice());

        // -------------------------------------------------------------------------------------------

//        System.out.print("Nome aluno: ");
//        String nome = sc.next();
//
//        System.out.print("Nota 1: ");
//        double n1 = sc.nextDouble();
//
//        System.out.print("Nota 2: ");
//        double n2 = sc.nextDouble();
//
//        System.out.print("Nota 3: ");
//        double n3 = sc.nextDouble();
//
//        Estudante josue = new Estudante(nome, n1, n2, n3);
//
//        if(josue.somaNota() < josue.notaMinima) {
//            System.out.println("FINAL GRADE = " + josue.somaNota());
//            System.out.println("FAILED");
//            System.out.println("MISSING " + josue.pontosRestantes() + " POINTS");
//        } else {
//            System.out.println("FINAL GRADE " + josue.somaNota());
//            System.out.println("PASS");
//        }

        // -------------------------------------------------------------------------------------------

        System.out.print("Qual é o preço do dólar? ");
        double dollarPrice = sc.nextDouble();

        System.out.print("Quantos dólares serão comprados? ");
        double amount = sc.nextDouble();

        System.out.println("Valor a ser pago em reais = " + CurrencyConverter.dollarToReal(amount, dollarPrice));
    }
}