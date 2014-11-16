package com.abstractfactorydesignpattern.tablets;

/**
 * Created by Mirel on 16.11.2014.
 */

import com.abstractfactorydesignpattern.ITablet;

/**
 * This class implements a GalaxyTab3 tablet, produced by the SamsungFactory
 */
public class GalaxyTab3 implements ITablet {

    //Members of the class
    String name;

    /**
     * @param name The name(model) of the device
     */
    public GalaxyTab3(String name) {
        this.name = name;
    }

    @Override
    public void playGame() {
        // A game is on the progress
        System.out.println("On " + this.name + " a game is in progress");
    }
}

