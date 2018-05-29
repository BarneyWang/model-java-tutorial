package me.heng.chain;

/**
 * AUTHOR: wangdi
 * DATE: 29/05/2018
 * TIME: 10:10 AM
 */
public interface ChainIf {

    boolean rollBack(String initStr);

    ChainIf getHandler();

    boolean doHandler(String initStr);
}
