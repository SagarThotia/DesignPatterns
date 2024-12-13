package JavaTpoint.StructuralDesignPattern.BridgePattern;

public class QuestionManager
{
    protected Question q;
    public String catalog;

    public QuestionManager(String catalog)
    {
        this.catalog = catalog;
    }

    public void next()
    {
        q.nextQuestion();
    }

    public void previous()
    {
        q.previousQuestion();
    }

    public void newOne(String question)
    {
        q.newQuestion(question);
    }

    public void delete(String question)
    {
        q.deleteQuestion(question);
    }

    public void display()
    {
        q.displayQuestion();
    }

    public void displayAll()
    {
        System.out.println("Question Paper: " + catalog);
        q.displayAllQuestion();
    }
}
