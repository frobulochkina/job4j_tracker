package ru.job4j.tracker;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ValidateInputTest {

    @Test
    public void whenInvalidInput() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"one", "1"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(1));
    }

    @Test
    public void whenNegativeInput() {
        Output out = new StubOutput();
        String[] arr;
        Input in = new StubInput(
                arr = new String[] {"-2", "-4", "-8"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = 0;
        for (int i = 0; i < arr.length; i++) {
            selected = input.askInt("Enter menu:");
        }
        assertThat(selected, is(-8));
    }

    @Test
    public void whenOneRight() {
        Output out = new StubOutput();
        Input in = new StubInput(
                new String[] {"2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = input.askInt("Enter menu:");
        assertThat(selected, is(2));
    }

    @Test
    public void whenEverythingRight() {
        Output out = new StubOutput();
        String[] arr;
        Input in = new StubInput(
                arr = new String[] {"1", "4", "2"}
        );
        ValidateInput input = new ValidateInput(out, in);
        int selected = 0;
        for (int i = 0; i < arr.length; i++) {
            selected = input.askInt("Enter menu:");
        }
        assertThat(selected, is(2));
    }
}