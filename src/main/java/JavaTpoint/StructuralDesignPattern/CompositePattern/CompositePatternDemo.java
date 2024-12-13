package JavaTpoint.StructuralDesignPattern.CompositePattern;

public class CompositePatternDemo
{
    public static void main(String[] args)
    {
        Employee emp1 = new Cashier(101, "Sam Tucker", 200000);
        Employee emp2 = new Cashier(102, "George Omaley", 250000);
        Employee emp3 = new Accountant(103, "Izze Stevens", 400000);
        Employee manager1 = new BankManager(104, "Miranda Bailey", 500000);

        manager1.add(emp1);
        manager1.add(emp2);
        manager1.add(emp3);
        manager1.print();
    }
}
