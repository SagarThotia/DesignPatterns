package JavaTpoint.BehavioralDesignPattern.IntrepreterDesignPattern;

import java.util.Stack;

public class InfixToPostfixPattern implements Pattern
{

    @Override
    public String conversion(String exp) {
        int priority = 0; // for the priority of operators
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack1 = new Stack<>();
        for (int i = 0; i < exp.length(); i++)
        {
            char ch = exp.charAt(i);
            if(ch=='+'||ch=='-'||ch=='*'||ch=='/'||ch=='%')
            {
                // Check the precedence
                if(stack1.size() <= 0)
                {
                    stack1.push(ch);
                }else {
                    Character chTop = (Character) stack1.peek();
                    if(chTop=='*'||chTop=='/')
                    {
                        priority = 1;
                    }else {
                        priority = 0;
                    }
                    if(priority == 1)
                    {
                        if(ch=='*'||ch=='/'||ch=='%')
                        {
                            postfix.append(stack1.pop());
                            i--;
                        }
                    }else{
                        if(ch=='+'||ch=='-')
                        {
                            postfix.append(stack1.pop());
                            stack1.push(ch);
                        }else{
                            stack1.push(ch);
                        }
                    }
                }
            }else{
                postfix.append(ch);
            }
        }
        int len = stack1.size();
        for (int j = 0; j < len; j++)
        {
            postfix.append(stack1.pop());
        }
        return postfix.toString();
    }
}
