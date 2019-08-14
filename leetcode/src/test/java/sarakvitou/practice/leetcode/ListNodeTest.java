package sarakvitou.practice.leetcode;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ListNodeTest {

    @Test
    public void shouldReturnFalseForComparingWithNull() {
        assertNotEquals(new ListNode(1), null);
    }

    @Test
    public void shouldReturnTrueForComparingToSelf() {
        ListNode node = new ListNode(1);
        assertEquals(node, node);
    }

    @Test
    public void shouldReturnTrueForComparingWithAlikeValue() {
        assertEquals(new ListNode(1), new ListNode(1));
    }

    @Test
    public void shouldReturnFalseForComparingWithNonAlikeValue() {
        assertNotEquals(new ListNode(1), new ListNode(2));
    }
}