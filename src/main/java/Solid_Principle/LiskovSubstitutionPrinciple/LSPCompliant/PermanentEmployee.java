package Solid_Principle.LiskovSubstitutionPrinciple.LSPCompliant;

import java.util.ArrayList;
import java.util.List;

public class PermanentEmployee extends Employee implements IEmployeeSpecialAllowances
{
    public PermanentEmployee(Integer id, String name)
    {
        super(id, name);
    }

    @Override
    public Double getSalary() {
        return 1000000d;
    }

    @Override
    public Double calculateBonus() {
        return 1.20 * this.getSalary();
    }

    @Override
    public List<Perks> getPerks() {
        List<Perks> perksList = new ArrayList<>();
        perksList.add(Perks.PF);
        perksList.add(Perks.LTA);
        perksList.add(Perks.CAR_ALLOWANCE);
        return perksList;
    }
}
