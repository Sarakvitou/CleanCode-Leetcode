package sarakvitou.practice.leetcode;

import org.junit.Test;

import java.util.Random;

import static java.lang.String.valueOf;
import static org.junit.Assert.assertEquals;

public class AddTwoNumberTest {
    private final AddTwoNumbers addTwoNumbers = new AddTwoNumbers();

    @Test
    public void shouldThereExistAClassOfListNode() {
        ListNode node = new ListNode(0);
    }

    @Test
    public void shouldReturnOf0ShouldAnyOfTheArgumentsNull() {
        final ListNode list1 = new ListNode(0);
        final ListNode expectedListNode = new ListNode(0);
        assertEquals(addTwoNumbers.addTwoNumbers(list1, null), expectedListNode);
        assertEquals(addTwoNumbers.addTwoNumbers(null, list1), expectedListNode);
        assertEquals(addTwoNumbers.addTwoNumbers(null, null), expectedListNode);
    }

    @Test
    public void shouldReturn0GivenTwo0s() {
        final ListNode expectedListNode = new ListNode(0);
        final ListNode nodeZero = new ListNode(0);
        assertEquals(addTwoNumbers.addTwoNumbers(nodeZero, nodeZero), expectedListNode);
    }

    @Test
    public void shouldReturn2GivenTwo1s() {
        final ListNode expectedListNode = new ListNode(2);
        final ListNode node = new ListNode(1);
        assertEquals(addTwoNumbers.addTwoNumbers(node, node), expectedListNode);
    }

    @Test
    public void shouldReturn01Given1and9() {
        final ListNode expectedListNode = addTwoNumbers.getListNode(0);

        final ListNode arg1 = new ListNode(1);
        final ListNode arg2 = new ListNode(9);

        assertEquals(addTwoNumbers.addTwoNumbers(arg1, arg2), expectedListNode);
    }

    @Test
    public void shouldReturn01Given9and1() {
        final ListNode expectedListNode = addTwoNumbers.getListNode(0);

        final ListNode arg1 = new ListNode(1);
        final ListNode arg2 = new ListNode(9);

        assertEquals(addTwoNumbers.addTwoNumbers(arg1, arg2), expectedListNode);
    }

    @Test
    public void shouldReturn11Given2and9() {
        final ListNode expectedListNode = addTwoNumbers.getListNode(1);

        final ListNode arg1 = new ListNode(2);
        final ListNode arg2 = new ListNode(9);

        assertEquals(addTwoNumbers.addTwoNumbers(arg1, arg2), expectedListNode);
    }

    @Test
    public void shouldReturn11Given9and2() {
        final ListNode expectedListNode = addTwoNumbers.getListNode(1);

        final ListNode arg1 = new ListNode(2);
        final ListNode arg2 = new ListNode(9);

        assertEquals(addTwoNumbers.addTwoNumbers(arg1, arg2), expectedListNode);
    }

    @Test
    public void shouldReturnANonNegativeSingleDigitGivenANonNegativeSingleDigit() {
        final int nextInt = addTwoNumbers.getNextNonNegativeSingleDigitInt();
        final ListNode expected = new ListNode(nextInt);
        assertEquals(addTwoNumbers.getListNode(nextInt), expected);
    }

    @Test
    public void shouldReturn0GivenANegativeNumber() {
        final Random random = new Random();
        int nextInt = random.nextInt();
        while (nextInt >= 0) {
            nextInt = random.nextInt();
        }
        final ListNode expected = new ListNode(0);
        assertEquals(addTwoNumbers.getListNode(nextInt), expected);
    }

    @Test
    public void shouldReturn2NonNegativeDigitsInReverseGiven2NonNegativeDigits() {
        int leadingDigit = addTwoNumbers.getNextNonNegativeSingleDigitInt();
        while (leadingDigit == 0) {
            leadingDigit = addTwoNumbers.getNextNonNegativeSingleDigitInt();
        }
        final int followUpDigit = addTwoNumbers.getNextNonNegativeSingleDigitInt();

        final String twoNonNegativeDigits = valueOf(leadingDigit) + followUpDigit;
        final Integer twoNonNegativeDigitsValue = Integer.valueOf(twoNonNegativeDigits);

        final ListNode expected = new ListNode(followUpDigit);
        expected.next = new ListNode(leadingDigit);

        assertEquals(addTwoNumbers.getListNode(twoNonNegativeDigitsValue), expected);
    }
}
