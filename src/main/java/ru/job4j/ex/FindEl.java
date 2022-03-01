package ru.job4j.ex;

public class FindEl {
    public static int indexOf (String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == key) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("Element Not Found");
        }
        return rsl;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        String[] arr = new String[] {"1", "2", "3", "4", "5"};
        try {
            System.out.println(FindEl.indexOf(arr, "9"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
