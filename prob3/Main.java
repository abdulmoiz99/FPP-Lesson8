package prob3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // a. Create an ArrayList<Marketing> type.
        List<Marketing> marketingList = new ArrayList<>();

        // b. add() minimum of five objects into your ArrayList collection of Marketing instances.
        marketingList.add(new Marketing("emp1", "Product1", 1500.0));
        marketingList.add(new Marketing("emp2", "Product2", 700.0));
        marketingList.add(new Marketing("emp3", "Product3", 1200.0));
        marketingList.add(new Marketing("emp4", "Product4", 900.0));
        marketingList.add(new Marketing("emp5", "Product5", 1100.0));


        // c. delete an object from Marketing by passing instance object.
        marketingList.remove(new Marketing("emp1", "Product1", 900.0));

        // d. Print the size of the list.
        System.out.println("Size of the list: " + marketingList.size());

        // e. Retrieve a Marketing object by its position.(get())
        Marketing retrieved = marketingList.get(2);
        System.out.println("Retrieved: " + retrieved);

        // f. Update the details of a Marketing object by passing its position. (Set())
        marketingList.set(2, new Marketing("emp6", "Product3", 1300.0));
        System.out.println("Updated list: " + marketingList.toString());


        // g. Override the equals() method inside Marketing.java
        // Implemented in the Marketing class

        // h. Sort the list in natural order for the field salesamount using comparator interface.
        marketingList.sort((m1, m2) -> Double.compare(m1.getSalesamount(), m2.getSalesamount()));
        System.out.println("Sorted list: " + marketingList.toString());

        // i. Sort the list in natural order using employeename with the criteria of the
        // employee who achieves more than $1000 of salesamount.
        List<Marketing> filteredList = moreThan1000Salary(marketingList);
        filteredList.sort((m1,m2) -> m1.getEmployeename().compareTo(m2.getEmployeename()));

        System.out.println("Filtered list: " + filteredList.toString());
    }
    private static List<Marketing> moreThan1000Salary(List<Marketing> list) {
        List<Marketing> result = new ArrayList<>();
        for (Marketing m : list) {
            if (m.getSalesamount() > 1000) {
                result.add(m);
            }
        }
        return result;
    }
}
