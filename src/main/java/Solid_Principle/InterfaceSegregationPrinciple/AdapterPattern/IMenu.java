package Solid_Principle.InterfaceSegregationPrinciple.AdapterPattern;

import java.util.List;

public interface IMenu
{
    public List<FOODITEMS> getVegetarianItems();

    public List<FOODITEMS> getNonVegetarianItems();
}
