package Solid_Principle.LiskovSubstitutionPrinciple.LSPCompliant;

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

        System.out.println("Total Salary of all employees is  " + fetchTotalSalary(employeeList));

        List<IEmployeeSpecialAllowances> employeeListSpecialAllowances = new ArrayList<>();
        employeeListSpecialAllowances.add(permanentEmployeeSagar);
        employeeListSpecialAllowances.add(temporaryEmployeeAlbina);
       //  employeeListSpecialAllowances.add(contractEmployeeSam); // throwing a Compilation Error.

        System.out.println("Total bonus budget of all employees is " + fetchTotalBonusBudget(employeeListSpecialAllowances));
        printPerksOfEachEmployee(employeeListSpecialAllowances);
    }

    private static Double fetchTotalBonusBudget(List<IEmployeeSpecialAllowances> employeeList)
    {
        Double totalBonus = 0d;
        for (IEmployeeSpecialAllowances employee : employeeList)
        {
            totalBonus += employee.calculateBonus();
        }
        return totalBonus;
    }

    private static Double fetchTotalSalary(List<Employee> employeeList)
    {
        Double totalSalary = 0d;
        for (Employee employee : employeeList)
        {
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }

    private static void printPerksOfEachEmployee(List<IEmployeeSpecialAllowances> employeeList)
    {
        for (IEmployeeSpecialAllowances employee : employeeList)
        {
            String perkList = new String();
            if(employee.getPerks() != null)
            {
                for (Perks perk : employee.getPerks())
                {
                    perkList += (perk + " ");
                }
                System.out.println("Perks are " + perkList);
            }
        }
    }
}

/**
 * Split on the basis of operation.
 * Make it more granular
 */