package Solid_Principle.LiskovSubstitutionPrinciple.LSPCompliant;

import java.util.ArrayList;
import java.util.List;

public class TemporaryEmployee extends Employee implements IEmployeeSpecialAllowances
{
    public TemporaryEmployee(Integer id, String name) {
        super(id, name);
    }

    @Override
    public Double getSalary() {
        return 500000d;
    }

    @Override
    public Double calculateBonus() {
        return 0.9 * this.getSalary();
    }

    @Override
    public List<Perks> getPerks() {
        List<Perks> perksList = new ArrayList<>();
        perksList.add(Perks.PF);
        perksList.add(Perks.LTA);
        return perksList;
    }
}
