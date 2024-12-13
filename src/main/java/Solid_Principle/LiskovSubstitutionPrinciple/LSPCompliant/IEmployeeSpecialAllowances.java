package Solid_Principle.LiskovSubstitutionPrinciple.LSPCompliant;

import java.util.List;

public interface IEmployeeSpecialAllowances
{
    public Double calculateBonus();
    public List<Perks> getPerks();
}
