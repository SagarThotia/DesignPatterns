package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.MediatorDesignPattern;

public interface Airplane
{
    public void requestTakeoff();
    public void requestLanding();
    public void notifyAirTrafficControl(String message);
}
