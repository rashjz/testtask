import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Mobby on 2/28/2017.
 */
public class UnitTestInputReader {


    @Test
    public void checkForVowelsTest() {
        Result result = InputReader.checkForVowels("boats");
        List<Character> characters = new ArrayList<>();
        characters.add('o');
        characters.add('a');

        assertNotNull(result);
        assertEquals(2, characters.size());
        assertArrayEquals(characters.toArray(), result.getArrayList().toArray());
        assertEquals(characters, InputReader.checkForVowels("boats").getArrayList());
        assertEquals(5, result.getLength());

        try {
            String s="Sachin";
            s.concat(" Tendulkar");//concat() method appends the string at the end
            System.out.println(s);//will print Sachin because strings are immutable objects
        } finally {

        }
    }

}
