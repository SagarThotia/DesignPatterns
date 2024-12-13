package Solid_Principle.InterfaceSegregationPrinciple.ISPComplaint;

import java.util.List;

public class MenuManager
{
    public static void main(String[] args)
    {
        TasteOfIndia tasteOfIndia = new TasteOfIndia();
        printMenu(tasteOfIndia.getVegetarianItems(), "TasteOfIndia");
        // printMenu(tasteOfIndia.getNonVegetarianItems(), "TasteOfIndia"); // throw compile Time error

        System.out.println("************************");

        WelcomeToPunjab welcomeToPunjab = new WelcomeToPunjab();
        printMenu(welcomeToPunjab.getNonVegetarianItems(), "WelcomeToPunjab");
        printMenu(welcomeToPunjab.getVegetarianItems(), "WelcomeToPunjab");
    }

    private static void printMenu(List<FOODITEMS> items, String name)
    {
        for (FOODITEMS fooditem : items)
        {
            System.out.println(name + " has item in menu as " + fooditem);
        }
    }
}


/**
 * This is pretty simple solution and most obvious one as well. If the code is developed for the first time
 * to fix this from violated case to this case becomes really simple however challenges.
 * When legacy code is running on production is extremely complicated in nature redesigning re-architecting it.
 * It is a really difficult task then the developer, the reviewer will be extremely fearful that no change is
 * made that would break the production code, and it will require extensive level of testing so in that case.
 * what is the solution? what is the way out? where we don't want to redesign the whole architecture?
 * The solution comes as adaptive pattern, so we will be using a very famous technique of system design
 * known as Adapter pattern.
 */
