
// SampleData.java - Sample data for testing

import javafx.collections.ObservableList;

public class SampleData {
    public static void loadSampleData(ObservableList<PizzaOrder> orders) {
        // Sample Customer 1
        PizzaOrder order1 = new PizzaOrder(
            "Sakshi", 
            "6479907483", 
            "XL", 
            5, 
            BillCalculator.calculate("XL", 5)
        );

        // Sample Customer 2
        PizzaOrder order2 = new PizzaOrder(
            "Navdeep", 
            "4376696607", 
            "L", 
            4, 
            BillCalculator.calculate("L", 4)
        );

        // Sample Customer 3
        PizzaOrder order3 = new PizzaOrder(
            "Parmjeet", 
            "4376686486", 
            "M", 
            3, 
            BillCalculator.calculate("M", 3)
        );

        orders.addAll(order1, order2, order3);
    }
}
