package Solid_Principle.InterfaceSegregationPrinciple.AdapterPattern;

public class MenuManager
{
    public static void main(String[] args)
    {
        CombinedMenu combinedMenu = new CombinedMenu();
        IVegetarianMenu tasteOfIndia = new VegMenuAdapter(combinedMenu);
        tasteOfIndia.getVegetarianItems();
    }
}
