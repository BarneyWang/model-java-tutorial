package me.heng.chain;

/**
 * AUTHOR: wangdi
 * DATE: 29/05/2018
 * TIME: 10:18 AM
 */
public class ChianMain {


    public static void main(String[] args) {
        ChainOne chain1 = new ChainOne();
        ChainSecond chain2 = new ChainSecond();
        chain1.setNextChain(chain2);

        chain1.doHandler("1");
    }
}
