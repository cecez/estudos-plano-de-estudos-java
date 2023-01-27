package org.example.wordWrap;

import junit.framework.TestCase;
import static org.example.wordWrap.Wrapper.wrap;

public class WordWrapTest extends TestCase {
    public void testEmptyWord() {
        assertEquals("", wrap("", 1));
    }

    public void testWordSmallerThanColumn() {
        assertEquals("word", wrap("word", 10));
    }

    public void testWordBiggerThanColumn() {
        assertEquals("wo\nrd", wrap("word", 2));
    }

    public void testBigWordBiggerThanColumn() {
        assertEquals("abc\ndef\ngh", wrap("abcdefgh", 3));
    }

    public void testSpaceOnWordBoundary() {
        assertEquals("word\nword", wrap("word word", 5));
    }

    public void testSpaceAfterWordBoundary() {
        assertEquals("word\nword", wrap("word word", 6));
    }

    public void testColumnSmallerThanWords() {
        assertEquals("wor\nd\nwor\nd", wrap("word word", 3));
    }

    public void testSpaceBeforeWordBoundary() {
        assertEquals("word\nword", wrap("word word", 4));
    }
}
