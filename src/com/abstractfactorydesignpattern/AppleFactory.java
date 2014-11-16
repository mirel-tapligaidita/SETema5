package com.abstractfactorydesignpattern;

/**
 * Created by Mirel on 16.11.2014.
 */

import com.abstractfactorydesignpattern.phones.IPhone5s;
import com.abstractfactorydesignpattern.tablets.IPad3;

/**
 * This is the Apple Factory
 */
public class AppleFactory extends AbstractDeviceFactory {
    /**
     * The method creates an ApplePhone
     *
     * @return Returns an instance of an Apple phone
     */
    @Override
    IPhone getPhone(String model) {

        if (model == null) {
            return null;
        }
        if (model.equalsIgnoreCase("IPhone5s")) {
            return new IPhone5s(model);

        } else {
            return null;
        }


    }


    /**
     * The method creates an Apple tablet
     *
     * @return Returns an instance of an Apple tablet
     */
    @Override
    ITablet getTablet(String model) {

        if (model == null) {
            return null;
        }
        if (model.equalsIgnoreCase("IPad3")) {
            return new IPad3(model);
        } else {
            return null;
        }
    }
}
