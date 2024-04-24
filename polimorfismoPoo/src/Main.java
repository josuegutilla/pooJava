import abstracao.Circle;
import abstracao.Color;
import abstracao.Rectangle;
import abstracao.Shape;
import model.ImportedProduct;
import model.Product;
import model.UsedProduct;

import java.awt.font.FontRenderContext;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int totalProduct = sc.nextInt();

        for (int x = 1; x <= totalProduct; x++) {
            System.out.println("Product #" + x + " data:");

            System.out.print("Common, used or imported (c/u/i)? ");
            char typeProduct = sc.next().charAt(0);
            System.out.print("Name: ");
            String name = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (typeProduct == 'c') {
                list.add(new Product(name, price));
            } else if (typeProduct == 'u') {
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                LocalDate data = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                list.add(new UsedProduct(name, price, data));
            } else {
                System.out.print("Taxa de importacao: ");
                double tax = sc.nextDouble();
                list.add(new ImportedProduct(name, price, tax));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        System.out.println("--------------------------------");

        // exercicio abstracao:
        List<Shape> listShape = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int quantity = sc.nextInt();

        for (int x = 1; x <= quantity; x++) {
            System.out.println("Shape #" + x + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");
            char shapeForm = sc.next().charAt(0);

            System.out.print("Color (BLACK, BLUE, RED): ");
            Color color = Color.valueOf(sc.next());

            if (shapeForm == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();

                listShape.add(new Rectangle(color, height, width));
            }
            else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                listShape.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");

        for (Shape shape : listShape) {
            System.out.println(shape.area());
        }

        sc.close();
    }
}