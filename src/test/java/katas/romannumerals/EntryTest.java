package katas.romannumerals;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * This class is just your entry point for this kata. It can be modified or deleted as you like.
 *
 */
public class EntryTest {

    @Test
    public void testConvertToRoman() throws Exception {
        assertEquals("I", new Entry().convertToRoman());
    }
}