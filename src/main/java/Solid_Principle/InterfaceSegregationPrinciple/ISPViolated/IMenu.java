package Solid_Principle.InterfaceSegregationPrinciple.ISPViolated;

import java.util.List;

public interface IMenu
{
    public List<FOODITEMS> getVegetarianItems();

    public List<FOODITEMS> getNonVegetarianItems();
}
