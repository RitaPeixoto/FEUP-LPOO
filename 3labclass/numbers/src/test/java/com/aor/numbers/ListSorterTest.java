package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListSorterTest {
    private List<Integer> list;

    @Before
    public void helper(){
        this.list = new ArrayList<>();
        this.list.add(3);
        this.list.add(2);
        this.list.add(6);
        this.list.add(1);
        this.list.add(4);
        this.list.add(5);
        this.list.add(7);
    }

    @Test
    public void sort() {
        List<Integer> expected = new ArrayList();
        expected.add(1);
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);


        ListSorter sorter = new ListSorter(list);
        List<Integer> sorted = sorter.sort();

        assertEquals(expected, sorted);
    }
}