package ru.geekbrains;
import java.util.ArrayList;
import java.util.List;
public class ChocolateVendingMachine {
    private final List<Product> products1;
    public ChocolateVendingMachine(List<Product> products1){this.products1 = products1;}
    public Chocolate getChocolate(String name, double calories){

        for (Product product : products1){
            if (product instanceof Chocolate){
                if (product.getName() == name && ((Chocolate)product).getCalories() == calories){
                    return (Chocolate) product;
                }
            }
        }
        return null;
    }
}
