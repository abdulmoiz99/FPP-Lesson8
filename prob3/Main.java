package prob3;

public class Main {
    public static void main(String[] args) {
        //a. Create an ArrayList<Marketing> type
        MarketingList list = new MarketingList();

        //b. add five objects of marketing type
        list.add(new Marketing("emp1", "product1", 1));
        list.add(new Marketing("emp3", "product3", 3));
        list.add(new Marketing("emp2", "product2", 2));
        list.add(new Marketing("emp4", "product4", 4));
        list.add(new Marketing("emp5", "product5", 5));
        System.out.println(list.toString());

        //c.delete an object from Marketing by passing instance object.
        System.out.println("Item has been removed? " + list.remove(new Marketing("emp1", "product1", 1)));
        System.out.println("Item has been removed? " + list.remove(new Marketing("emp1", "product1", 1)));

        //d. Print the size of the list
        System.out.println("Size of the list is: " + list.size());

        //e. Retrieve a Marketing object by its position.(get())
        System.out.println("Value at index 2: " + list.get(2).toString());

        //f. Update the details of a Marketing object by passing its position. (Set())
        list.Set(2, new Marketing("emp updated", "product3", 3));
        list.Set(10, new Marketing("emp updated", "product3", 3));
        System.out.println(list.toString());

        //g. Override the equals() method inside Marketing.java
//        h. Sort the list in natural order for the field salesamount using comparator
//        interface. Your Comparator should be consistent with equals.
//                i. Sort the list in natural order using employeename with the criteria of the
//        employee who achieves more than $1000 of salesamount. Write a method
//        to retrieve the result of getting list of employees have more than $1000
//        sales. Then do the sorting on this result list.
//        rketings.get()
    }
}
