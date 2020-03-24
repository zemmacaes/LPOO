package com.aor.numbers;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ListAggregatorTest
{
    private List<Integer> list;

    @Before
    public void setup()
    {
        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);
        list.add(5);
    }

    @Test
    public void sum()
    {
        ListAggregator aggregator = new ListAggregator(list);

        int sum = aggregator.sum();

        assertEquals(14, sum);
    }

    @Test
    public void max()
    {
        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(5, max);
    }

    @Test
    public void min()
    {
        ListAggregator aggregator = new ListAggregator(list);

        int min = aggregator.min();

        assertEquals(1, min);
    }

    @Test
    public void distinct()
    {
        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(new ListDeduplicator(list));

        assertEquals(4, distinct);
    }

    @Test
    public void bug7263()
    {
        list = new ArrayList<>();
        list.add(-1);
        list.add(-5);
        list.add(-4);

        ListAggregator aggregator = new ListAggregator(list);

        int max = aggregator.max();

        assertEquals(-1, max);
    }

    @Test
    public void bug8726()
    {
        class Stub implements IListDeduplicator
        {
            @Override
            public List<Integer> deduplicate()
            {
                List<Integer> correct = new ArrayList<>();

                correct.add(1);
                correct.add(2);
                correct.add(4);

                return correct;
            }
        }

        list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(2);

        ListAggregator aggregator = new ListAggregator(list);

        int distinct = aggregator.distinct(new Stub());

        assertEquals(3, distinct);
    }
}