package JavaTpoint.StructuralDesignPattern.BridgePattern;

public class BridgePatternDemo
{
    public static void main(String[] args)
    {
        QuestionFormat questions = new QuestionFormat("Java Programming Language");
        questions.q = new JavaQuestions();
        questions.delete("What is class?");
        questions.display();
        questions.newOne("What is Inheritance?");
        questions.newOne("How many types of inheritance in java?");
        questions.displayAll();
    }
}
