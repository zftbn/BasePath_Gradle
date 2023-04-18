package mimic;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class LinkedListTest {

    @Test
    void test01(){
        List<String> list=new LinkedList<>();

        list.remove(null);
        assertEquals(0,list.size());
    }

    @Test
    void test02(){
        List<String> list=new LinkedList<>();
        list.add(null);
        list.add(null);

        list.remove(null);
        assertEquals(1,list.size());
    }

    @Test
    void test03(){
        List<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");

        list.remove(null);
        assertEquals(2,list.size());
    }

    @Test
    void test04(){
        List<String> list=new LinkedList<>();

        list.remove("a");
        assertEquals(0,list.size());
    }

    @Test
    void test05(){
        List<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");

        list.remove("a");
        assertEquals(1,list.size());
    }

    @Test
    void test06(){
        List<String> list=new LinkedList<>();
        list.add("a");
        list.add("b");

        list.remove("c");
        assertEquals(2,list.size());
    }

}
