package sarakvitou.practice.leetcode;

import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class AddTwoNumbers {
    public AddTwoNumbers() {
    }

    int getNextNonNegativeSingleDigitInt() {
        final Random random = new Random();
        int nextInt = random.nextInt();
        while (nextInt < 0 || nextInt >= 10) {
            nextInt = random.nextInt();
        }
        return nextInt;
    }

    ListNode getListNode(int expectedNonNegativeValue) {
        if (String.valueOf(expectedNonNegativeValue).length() == 1) {
            return new ListNode(expectedNonNegativeValue);
        }
        if (expectedNonNegativeValue < 0) {
            return new ListNode(0);
        }

        final List numberList = String.valueOf(expectedNonNegativeValue).chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        ;
        Collections.reverse(numberList);
        ListNode leadingNode = new ListNode(Character.getNumericValue((Character) numberList.get(0)));
        final ListNode head = leadingNode;
        for (int i = 1; i < numberList.size(); i++) {
            ListNode temp = new ListNode(Character.getNumericValue((Character) numberList.get(i)));
            leadingNode.next = temp;
            leadingNode = leadingNode.next;
        }
        leadingNode = head;
        return leadingNode;
    }

    ListNode addTwoNumbers(final ListNode list1, final ListNode list2) {
        if (list1 != null && list2 != null) {
            int sumValue = list1.getValue() + list2.getValue();
            if (sumValue == 10) {
                ListNode result = getListNode(0);
                return result;
            } else if (sumValue == 11) {
                ListNode result = getListNode(1);
                return result;
            }
            return new ListNode(sumValue);
        }
        return new ListNode(0);
    }
}