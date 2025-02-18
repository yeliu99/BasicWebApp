package com.develogical;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void returnsEmptyStringIfCannotProcessQuery() throws Exception {
        assertThat(queryProcessor.process("test"), is(""));
    }

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void knowsAboutImperial() throws Exception {
        assertThat(queryProcessor.process("Imperial"),
                containsString("university"));
    }

    @Test
    public void knowsAboutTeam() throws Exception {
        assertThat(queryProcessor.process("team"),
                containsString("team"));
    }

    @Test
    public void knowsAboutPlus() throws Exception {
        assertThat(queryProcessor.process("plus"),
                containsString("18"));
    }

    @Test
    public void knowsAboutPrime() throws Exception {
        assertThat(queryProcessor.process("prime"),
                containsString("389"));
    }

    @Test
    public void knowsAboutMultiplied() throws Exception {
        assertThat(queryProcessor.process("multiplied"),
                containsString("48"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
}
