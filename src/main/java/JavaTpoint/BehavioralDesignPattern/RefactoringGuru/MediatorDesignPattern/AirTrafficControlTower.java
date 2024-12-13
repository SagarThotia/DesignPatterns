package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.MediatorDesignPattern;
// Mediator Interface
public interface AirTrafficControlTower
{
    public void requestTakeoff(Airplane airplane);
    public void requestLanding(Airplane airplane);


}
