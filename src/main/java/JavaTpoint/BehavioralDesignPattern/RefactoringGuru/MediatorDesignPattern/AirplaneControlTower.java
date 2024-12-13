package JavaTpoint.BehavioralDesignPattern.RefactoringGuru.MediatorDesignPattern;

// Concrete Mediator
public class AirplaneControlTower implements AirTrafficControlTower
{
    @Override
    public void requestTakeoff(Airplane airplane)
    {
        // Logic for coordinating takeoff
        airplane.notifyAirTrafficControl("Requesting takeoff clearance.");
    }

    @Override
    public void requestLanding(Airplane airplane)
    {
        // Logic for coordinating landing
        airplane.notifyAirTrafficControl("Requesting landing clearance.");
    }
}
