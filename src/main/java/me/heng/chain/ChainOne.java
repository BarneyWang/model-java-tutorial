package me.heng.chain;

/**
 * AUTHOR: wangdi
 * DATE: 29/05/2018
 * TIME: 10:12 AM
 */
public class ChainOne implements ChainIf{

    private  ChainIf  nextChain = null;

    public boolean rollBack(String initStr) {
        return true;
    }

    public ChainIf getHandler() {
        return this.nextChain;
    }

    public boolean doHandler(String initStr) {
        System.out.println(initStr);

        return nextChain.doHandler(initStr+222);
    }

    public void setNextChain(ChainIf chain){
        this.nextChain = chain;
    }
}
