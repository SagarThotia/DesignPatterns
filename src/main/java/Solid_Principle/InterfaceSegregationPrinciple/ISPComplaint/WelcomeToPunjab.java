package Solid_Principle.InterfaceSegregationPrinciple.ISPComplaint;

import java.util.ArrayList;
import java.util.List;

public class WelcomeToPunjab implements IVegetarianMenu, INonVegetarianMenu
{
    @Override
    public List<FOODITEMS> getNonVegetarianItems() {
        List<FOODITEMS> nonVegFood = new ArrayList<>();
        nonVegFood.add(FOODITEMS.BUTTER_CHICKEN);
        nonVegFood.add(FOODITEMS.PRAWNS);
        return nonVegFood;
    }

    @Override
    public List<FOODITEMS> getVegetarianItems() {
        List<FOODITEMS> vegFood = new ArrayList<>();
        vegFood.add(FOODITEMS.PANEER_PASANDA);
        vegFood.add(FOODITEMS.DAL_MAKHNI);
        return vegFood;
    }
}
