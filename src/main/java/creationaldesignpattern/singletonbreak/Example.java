package creationaldesignpattern.singletonbreak;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Example
{
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException
    {
//        Samosa s1 = Samosa.getSamosa();
//        Samosa s1 = Samosa.INSTANCE;
//        System.out.println(s1.hashCode());
//        s1.test();

        Constructor<Samosa> constructor = Samosa.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        Samosa s2 = constructor.newInstance();
        System.out.println(s2.hashCode());
    }
}
