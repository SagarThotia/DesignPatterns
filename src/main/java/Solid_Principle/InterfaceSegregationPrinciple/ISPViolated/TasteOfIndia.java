package Solid_Principle.InterfaceSegregationPrinciple.ISPViolated;

import java.util.ArrayList;
import java.util.List;

public class TasteOfIndia implements IMenu
{
    @Override
    public List<FOODITEMS> getVegetarianItems() {
        List<FOODITEMS> vegFood = new ArrayList<>();
        vegFood.add(FOODITEMS.DAL_MAKHNI);
        vegFood.add(FOODITEMS.PANEER_PASANDA);
        return vegFood;
    }

    // ISP violated
    @Override
    public List<FOODITEMS> getNonVegetarianItems() {
        return null;
    }
}
