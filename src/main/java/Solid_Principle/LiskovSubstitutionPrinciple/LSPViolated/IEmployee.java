package Solid_Principle.LiskovSubstitutionPrinciple.LSPViolated;

import java.util.List;

public interface IEmployee
{
    public Double calculateBonus();

    public Double getSalary();

    public List<Perks> getPerks();
}
