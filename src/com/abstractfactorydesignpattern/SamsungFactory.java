package com.abstractfactorydesignpattern;

/**
 * Created by Mirel on 16.11.2014.
 */


import com.abstractfactorydesignpattern.phones.GalaxyS4;
import com.abstractfactorydesignpattern.tablets.GalaxyTab3;

/**
 * This is the Samsung Factory
 */
public class SamsungFactory extends AbstractDeviceFactory {

    /**
     * This methods produces a Samsung phone
     *
     * @return The instance of a Samsung phone
     */
    @Override
    IPhone getPhone(String model) {

        if (model == null) {
            return null;
        }
        if (model.equalsIgnoreCase("GalaxyS4")) {
            return new GalaxyS4(model);
        } else {
            return null;
        }


    }

    /**
     * This methods produces a Samsung tablet
     *
     * @return The instance of a Samsung tablet
     */

    @Override
    ITablet getTablet(String model) {

        if (model == null) {

            return null;

        }
        if (model.equalsIgnoreCase("GalaxyTab3")) {
            return new GalaxyTab3(model);
        } else {
            return null;
        }
    }
}