package JavaTpoint.StructuralDesignPattern.BridgePattern;

public class QuestionFormat extends QuestionManager
{

    public QuestionFormat(String catalog)
    {
        super(catalog);
    }

    public void displayAll()
    {
        System.out.println("\n______________________________________________________");
        super.displayAll();
        System.out.println("________________________________________________________");
    }
}
