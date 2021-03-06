package com.github.dreamhead.moco.verification;

public class AtMostVerification extends UnaryTimesVerification {

    public AtMostVerification(final int count) {
        super(count);
    }

    @Override
    protected boolean meet(final int size) {
        return size <= count;
    }
}
