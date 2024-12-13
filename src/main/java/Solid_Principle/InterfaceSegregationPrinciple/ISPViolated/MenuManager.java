package Solid_Principle.InterfaceSegregationPrinciple.ISPViolated;

import java.util.List;

public class MenuManager
{
    public static void main(String[] args)
    {
        IMenu tasteOFIndia = new TasteOfIndia();
        printMenu(tasteOFIndia.getNonVegetarianItems(), "TasteOfIndia");
        printMenu(tasteOFIndia.getVegetarianItems(), "TasteOfIndia");

        System.out.println("****************");

        IMenu welcomeToPunjab = new WelcomeToPunjab();
        printMenu(welcomeToPunjab.getNonVegetarianItems(), "WelcomeToPunjab");
        printMenu(welcomeToPunjab.getVegetarianItems(), "WelcomeToPunjab");
    }

    private static void printMenu(List<FOODITEMS> foodItems, String name)
    {
        if(foodItems != null && !foodItems.isEmpty())
        {
            for (FOODITEMS foodItem : foodItems)
            {
                System.out.println(name + " has item in menu as " + foodItem);
            }
        }
    }
}

/**
 * So far you will say there is no problem the code is and output is correct
 * problems occurs:
 * When so many restaurant implementing this interface and those specific restaurant speciality land on common interface
 * for eg: One Bengali restaurant came, One Gujarati restaurant came, One Rajasthani restaurant came,
 * One SouthIndian restaurant came, One Haryanvi restaurant came, One Maharashtrian restaurant came,
 * These all restaurant their own specific methods put into IMenu interface so what will actually happen
 * Those are classes who implement the interface and support in order to support those methods what they
 * will doing put the null implementation across all these methods that are not supported by that particular class
 * which becomes and issue that means those implementing classes are actually bound to implement the method provided
 * in the interface although this is not there responsibility and this is the core problem that has originated by virtue
 * of making this IMenu interface fat in interface because we are going ahead and putting all the methods in this common interface
 * so far we did understand the problem method is a common interface because it build an unnecessary dependency on the implementing classes
 * to implement those methods.
 * Solution is : Single Responsibility Principle
 *  We need to divide this big fatty interface into smaller interfaces and those interfaces would be independent of each other.
 * */