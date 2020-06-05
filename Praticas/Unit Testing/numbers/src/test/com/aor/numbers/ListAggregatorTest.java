package com.aor.numbers;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

/*
* The tests are organized in three different phases:
* Arrange - Where the test is setup and the data is arranged.
* Act - Where the the actual method under test is invoked.
* Assert - Where a single logical assert is used to test the outcome.
* */
public class ListAggregatorTest {
    private List<Integer> helper(){
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);
        return list;
    }

    @Test
    public void sum() {
        List<Integer> list = helper();

        ListAggregator aggregator = new ListAggregator(list);

        int sum = aggregator.sum();

        assertEquals(14, sum);
    }

    @Test
    public void maxBug() {//exercise 4-- max all negative
        List<Integer> list = new ArrayList<>();
        list.add(-1);
        list.add(-4);
        list.add(-5);

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(-1, max);
    }

    @Test
    public void max() {
        List<Integer> list = helper();

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(5, max);
    }

    @Test
    public void min() {
        List<Integer> list = helper();

        ListAggregator aggregator = new ListAggregator(list);

        int min = aggregator.min();

        assertEquals(1, min);
    }
    @Test
    public void distinctBug() {
        class ListDeduplicatorStub implements IListDeduplicator{
            @Override
            public List<Integer> deduplicate(IListSorter listSorter) {
                List<Integer> unique = new ArrayList<>();
                unique.add(1);
                unique.add(2);
                unique.add(4);
                return unique;
            }
        }

        class ListSorterStub implements IListSorter {
            @Override
            public List<Integer> sort() {
                List<Integer> sorted = new ArrayList<>();
                sorted.add(1);
                sorted.add(2);
                sorted.add(2);
                sorted.add(4);
                return sorted;
            }
        }
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(new ListDeduplicatorStub(), new ListSorterStub());

        assertEquals(3, distinct);
    }



    @Test
    public void distinct() {
        class ListDeduplicatorStub implements IListDeduplicator{
            @Override
            public List<Integer> deduplicate(IListSorter listSorter) {
                List<Integer> unique = new ArrayList<>();
                unique.add(1);
                unique.add(2);
                unique.add(4);
                unique.add(5);
                return unique;
            }
        }
        class ListSorterStub implements IListSorter {
            @Override
            public List<Integer> sort() {
                List<Integer> sorted = new ArrayList<>();
                sorted.add(1);
                sorted.add(2);
                sorted.add(2);
                sorted.add(4);
                return sorted;
            }
        }
        List<Integer> list = helper();

        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(new ListDeduplicatorStub(), new ListSorterStub());

        assertEquals(4, distinct);
    }
}