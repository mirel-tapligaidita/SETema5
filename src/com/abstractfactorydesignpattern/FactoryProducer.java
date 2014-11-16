package com.abstractfactorydesignpattern;

/**
 * Created by Mirel on 16.11.2014.
 */

/**
 * This is the factory producer class that creates the desired type of factories
 */
public abstract class FactoryProducer {

    /**
     * This method creates a DevicesFactory according to the desired device to be built
     *
     * @param type The desired factory
     * @return The instance of a Factory object or null if the option doesn't match
     */
    public static AbstractDeviceFactory getDeviceFactory(String type) {

        if (type == null) {
            return null;
        } else if (type.equalsIgnoreCase("Apple Phone")) {
            return new AppleFactory();
        } else if (type.equalsIgnoreCase("Apple Tablet")) {
            return new AppleFactory();
        } else if (type.equalsIgnoreCase("Samsung Phone")) {
            return new SamsungFactory();
        } else if (type.equalsIgnoreCase("Samsung Tablet")) {
            return new SamsungFactory();
        } else {
            return null;
        }

    }


}