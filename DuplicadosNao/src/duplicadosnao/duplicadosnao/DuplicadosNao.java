package duplicadosnao;

import java.util.HashSet;
import java.util.Set;

public class DuplicadosNao {
    public static void main(String[] args) {
        String[] brands = { "Fiat", "Volkswagen", "Chevrolet", "Ford", "Toyota", "Porche", "Hyundai" };
        String[] cars = { "Audi", "BMW", "Mercedes Bens", "Volkswagen", "Porche", "Opel", "Porche" };
        Set<String> duplicatedItems = new HashSet<>();

        for (int i = 0; i < brands.length; i++) {
            for (int j = 0; j < brands.length; j++) {
                if (brands[i].equals(cars[j])) {
                    duplicatedItems.add(brands[i]);
                }
            }
        }

        System.out.println(duplicatedItems);
    }
}