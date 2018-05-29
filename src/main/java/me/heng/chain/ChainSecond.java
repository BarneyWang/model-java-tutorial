package me.heng.chain;

/**
 * AUTHOR: wangdi
 * DATE: 29/05/2018
 * TIME: 10:17 AM
 */
public class ChainSecond implements ChainIf {

    private  ChainIf  nextChain = null;


    public boolean rollBack(String initStr) {
        return true;
    }

    public ChainIf getHandler() {
        return this.nextChain;
    }

    public boolean doHandler(String initStr) {
        System.out.println(initStr);
        return true;
    }

    public void setNextChain(ChainIf chain){
        this.nextChain = chain;
    }
}
