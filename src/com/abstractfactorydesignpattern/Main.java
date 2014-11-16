package com.abstractfactorydesignpattern;

/**
 * Created by Mirel on 16.11.2014.
 */

/**
 * The main class of the project
 */
public class Main {
    public static void main(String[] args) {

        //get a AppleFactory to create a phone
        AbstractDeviceFactory applePhoneFactory = FactoryProducer.getDeviceFactory("Apple Phone");

        //get a phone
        IPhone iPhone5sPhone = applePhoneFactory.getPhone("IPhone5s");

        //make a call
        iPhone5sPhone.call();


        //get a SamsungFactory to create a phone
        AbstractDeviceFactory samsungPhoneFactory = FactoryProducer.getDeviceFactory("Samsung Phone");

        //get a phone
        IPhone galaxyS4Phone = samsungPhoneFactory.getPhone("GalaxyS4");

        //make a call
        galaxyS4Phone.call();


        //get a SamsungFactory to create a tablet
        AbstractDeviceFactory samsungTabletFactory = FactoryProducer.getDeviceFactory("Samsung Tablet");

        //get a tablet
        ITablet galaxyTab3Tablet = samsungTabletFactory.getTablet("GalaxyTab3");

        //play a game
        galaxyTab3Tablet.playGame();

        //get a AppleFactory to create a tablet
        AbstractDeviceFactory appleTabletFactory = FactoryProducer.getDeviceFactory("Apple Tablet");

        //get a ShootingGuard
        ITablet iPad3tablet = appleTabletFactory.getTablet("IPad3");

        //play a game
        iPad3tablet.playGame();

    }
}
