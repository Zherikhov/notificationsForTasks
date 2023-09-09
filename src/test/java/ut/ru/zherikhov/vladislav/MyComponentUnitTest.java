package ut.ru.zherikhov.vladislav;

import org.junit.Test;
import ru.zherikhov.vladislav.api.MyPluginComponent;
import ru.zherikhov.vladislav.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest
{
    @Test
    public void testMyName()
    {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent",component.getName());
    }
}