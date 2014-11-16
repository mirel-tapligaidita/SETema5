package com.abstractfactorydesignpattern.phones;

/**
 * Created by Mirel on 16.11.2014.
 */

import com.abstractfactorydesignpattern.IPhone;

/**
 * This class implements an IPhone5s, produced by the AppleFactory
 */
public class IPhone5s implements IPhone {

    //Members of the class
    String name;

    /**
     * @param name The name(model) of the device
     */
    public IPhone5s(String name) {
        this.name = name;
    }

    @Override
    public void call() {
       // A call is in progress
        System.out.println("On " + this.name + " a call is in progress!");
    }
}

