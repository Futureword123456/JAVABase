package com.yang.day29;

public class ChainTest {
    public static void main(String[] args) {
        ChainTest chainTest = new ChainTest();
        try {
            chainTest.teat2();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void test1() throws DrunkExecpection {
        throw new DrunkExecpection("喝酒多了");
    }

    public void teat2() throws DrunkExecpection {
        try {
            test1();
        } catch (DrunkExecpection e) {
            RuntimeException runtimeException = new RuntimeException(e);
            //runtimeException.initCause(e);
            throw runtimeException;
        }
    }
}
