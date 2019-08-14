package sarakvitou.practice.leetcode;

import com.openpojo.business.BusinessIdentity;
import com.openpojo.business.annotation.BusinessKey;

class ListNode {
    @BusinessKey
    private int value;
    ListNode next;

    ListNode(final int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    @Override
    public boolean equals(final Object o) {
        return BusinessIdentity.areEqual(this, o);
    }

    @Override
    public int hashCode() {
        return BusinessIdentity.getHashCode(this);
    }
}
