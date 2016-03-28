package br.pucrs.fds.dgt.hangman.Engine;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.pucrs.fds.dgt.hangman.Engine.WordsBank;

public class WordsBankTest {

    private WordsBank wb;

    @Before
    public void setUp() throws Exception {
	wb = new WordsBank();
	
    }

    @Test
    public void testGetEmptyWordNoResorce() {
	assertEquals("", wb.getWord());
    }

}