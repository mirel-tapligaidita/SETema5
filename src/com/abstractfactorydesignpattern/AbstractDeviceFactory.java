package com.abstractfactorydesignpattern;
/**
 * This is the Abstract Factory Class
 * It has methods to get a phone or a tablet
 */
public abstract class AbstractDeviceFactory {

    // This method creates a phone
    abstract IPhone getPhone(String model);

    // This method creates a tablet
    abstract ITablet getTablet(String model);

}