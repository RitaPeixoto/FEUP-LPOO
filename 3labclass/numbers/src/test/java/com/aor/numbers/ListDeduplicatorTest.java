package com.aor.numbers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListDeduplicatorTest {
    private List<Integer> helper(){
        List<Integer> list= new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);
        return list;
    }

    @Test
    public void deduplicate() {
        List<Integer> list = helper();
        class ListSortStub implements IListSorter {
            public List<Integer> sort(){
                List<Integer> unique = new ArrayList<>();
                unique.add(1);
                unique.add(2);
                unique.add(2);
                unique.add(4);
                unique.add(5);
                return unique;
            }
        }
        ListDeduplicator deduplicator = new ListDeduplicator(list);
        List<Integer> distinct = deduplicator.deduplicate(new ListSortStub());
        List<Integer> expected=new ArrayList<>();
        expected.add(1);
        expected.add(2);
        expected.add(4);
        expected.add(5);

        assertEquals(expected, distinct);
    }
}