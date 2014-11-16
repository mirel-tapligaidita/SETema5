package com.abstractfactorydesignpattern.tablets;

/**
 * Created by Mirel on 16.11.2014.
 */

import com.abstractfactorydesignpattern.ITablet;

/**
 * This class implements a IPad3 tablet, produced by the AppleFactory
 */
public class IPad3 implements ITablet {

    //Members of the class
    String name;

    /**
     * @param name The name(model) of the device
     */
    public IPad3(String name) {
        this.name = name;
    }

    @Override
    public void playGame() {
        // A game is on progress
        System.out.println("On " + this.name + " a game is in progress");
    }
}

