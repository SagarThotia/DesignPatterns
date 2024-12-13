package JavaTpoint.CreationalDesignPattern.FactoryMethodPattern;

public class GetPlanFactory
{
    // use getPlan method to get object of type plan
    public Plan getPlan(String planType)
    {
        if(planType == null)
        {
            return null;
        }

        if(planType.trim().equalsIgnoreCase("DOMESTICPLAN"))
        {
            return new DomesticPlan();
        }else if(planType.trim().equalsIgnoreCase("COMMERCIALPLAN"))
        {
            return new CommercialPlan();
        } else if (planType.trim().equalsIgnoreCase("INSTITUTIONALPLAN"))
        {
            return new InstitutionalPlan();
        }
        return null;
    }
}
