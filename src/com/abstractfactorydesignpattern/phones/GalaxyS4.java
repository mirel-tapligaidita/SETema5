package com.abstractfactorydesignpattern.phones;

/**
 * Created by Mirel on 16.11.2014.
 */

import com.abstractfactorydesignpattern.IPhone;

/**
 * This class implements a GalaxyS4 phone, produced by the SamsungFactory
 */
public class GalaxyS4 implements IPhone {

    //Members of the class
    String name;

    /**
     * @param name The name(model) of the device
     */
    public GalaxyS4(String name) {
        this.name = name;
    }

    @Override
    public void call() {
        // A call is in progress
        System.out.println("On " + this.name + " a call is in progress!");
    }
}


