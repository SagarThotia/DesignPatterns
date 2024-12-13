package Solid_Principle.InterfaceSegregationPrinciple.AdapterPattern;

import java.util.List;

public class VegMenuAdapter implements IVegetarianMenu
{
    private final CombinedMenu adaptee;

    public VegMenuAdapter(CombinedMenu combinedMenu) {
        this.adaptee = combinedMenu;
    }

    @Override
    public List<FOODITEMS> getVegetarianItems() {
        return this.adaptee.getVegetarianItems();
    }
}

/**
 * Restrict only for Vegetarian.
 * It has private member of combined menu which is working as an adapting.
 * It also has a Constructor. This Constructor will have combined menu as
 * an argument passed to it what do we do store the adaptive over here
 * this.adaptee = combinedMenu. Put one object of combinedMenu
 * Important Highlight:  the this.adpater implements the IVegetarianMenu.
 * We will use combinedMenu as an Adaptee and we are calling adaptee
 * vegetarian helper method that are exposed in combine menu.
 *
 * Three things :
 * 1. Create a private member of CombinedMenu that acting as an adaptee and private member initialize through constructor.
 * 2. We have to create separate IVegetarianMenu interface that has only has vegatarianItems helper method in it.
 * 3. To Override this method and in this method what we will do. We will invoke adaptives vegetarian method that is part of the combined menu.
 * */