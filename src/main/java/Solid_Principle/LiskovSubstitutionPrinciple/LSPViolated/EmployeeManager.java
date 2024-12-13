package Solid_Principle.LiskovSubstitutionPrinciple.LSPViolated;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManager
{
    public static void main(String[] args)
    {
        List<Employee> employeeList = new ArrayList<>();
        PermanentEmployee permanentEmployeeSagar = new PermanentEmployee(1, "Sagar");
        TemporaryEmployee temporaryEmployeeAlbina = new TemporaryEmployee(2, "Albina");
        ContractEmployee contractEmployeeSam = new ContractEmployee(3, "Sam");

        employeeList.add(permanentEmployeeSagar);
        employeeList.add(temporaryEmployeeAlbina);
        employeeList.add(contractEmployeeSam);

        System.out.println("Total salary of all employees is " + fetchTotalSalary(employeeList));
        System.out.println("Total bonus of all employees is " + fetchTotalBonusBudget(employeeList));
        printPerksOfEachEmployee(employeeList);
    }


    private static Double fetchTotalBonusBudget(List<Employee> employeeList)
    {
        Double totalBonus = 0d;
        for (Employee employee : employeeList)
        {
            /**
             *  If we see is and instanceof obviously OOPs principle are violate.
             *  thumb rule: If we see instanceof check if so understand that OOPS principle violation.
             *   Absolute violation of OOPS concepts
             *   Variations #1 instanceof
             *   Variations #2 Null checks
             *   It's a design bug.
             *   Make sure this code is never pushed into production stage.
             */
             if(!(employee instanceof ContractEmployee))
            {
                totalBonus += employee.calculateBonus();
            }
        }
        return totalBonus;
    }

    private static Double fetchTotalSalary(List<Employee> employeeList)
    {
        Double totalSalary = 0d;
        for (Employee employee : employeeList){
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    private static void printPerksOfEachEmployee(List<Employee> employeeList)
    {
        for (Employee employee : employeeList)
        {
             if (!(employee instanceof ContractEmployee))
             {
                 String perkList = new String();
                 if (employee.getPerks() != null)
                 {
                     for (Perks perk : employee.getPerks())
                     {
                         perkList += perk + " ";
                     }
                     System.out.println("Employee id " + employee.getId() + " with name " + employee.getName() + " has perks as " + perkList);
                 }
             }
        }
    }
}
