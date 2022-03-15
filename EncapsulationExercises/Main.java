package EncapsulationExercises;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(";");

        Map<String, Person> peopleByName = new HashMap<>();
        Map<String, Product> productByName = new HashMap<>();

        for (String value : input) {

            String[] people = value.split("=");
            String name = people[0];
            double money = Double.parseDouble(people[1]);

            Person person = new Person(name, money);
            peopleByName.putIfAbsent(name, person);

        }
        input = scanner.nextLine().split(";");

        for (String s : input) {
            String[] products = s.split("=");
            String name = products[0];
            double cost = Double.parseDouble(products[1]);
            Product product = new Product(name, cost);
            productByName.putIfAbsent(name, product);
        }

        String[] command = scanner.nextLine().split("\\s+");

        while (!command[0].equals("END")){
            String personName = command[0];
            String productName = command[1];

            try {
                peopleByName.get(personName).buyProduct(productByName.get(productName));
                System.out.printf("%s bought %s%n", personName, productName);


            }catch (IllegalArgumentException ex){
                System.out.println(ex.getMessage());
            }


            command = scanner.nextLine().split("\\s+");
        }

        for (Person value : peopleByName.values()) {
            System.out.println(value.toString());
        }


    }
}
