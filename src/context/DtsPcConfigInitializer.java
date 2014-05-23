package com.ford.dts.context;

import javax.servlet.ServletContextEvent;

import com.ford.it.logging.ILogger;
import com.ford.it.logging.LogFactory;
import com.ford.it.persistencecore.context.PcConfigInitializer;
import com.ford.it.persistencecore.util.PcConstant;
import com.ford.it.properties.PropertyManager;

/**
 * 
 * This is an initializer for the DTS application. It loads the following
 * <ul>
 * <li>The property for the DTS Web Service Log.</li>
 * </ul>
 * 
 * @since DTS 1.0
 */
public class DtsPcConfigInitializer extends PcConfigInitializer {

    /**
     * Class Name used for logging
     */
    private static final String CLASS_NAME =
            DtsPcConfigInitializer.class.getName();
    /**
     * Logging setup
     */
    private static final ILogger log = LogFactory.getInstance().getLogger(
            CLASS_NAME);

    /**
     * Life cycle method.
     * 
     * @param contextEvent The Context Event
     */
    @Override
    public void contextInitialized(final ServletContextEvent contextEvent) {
        final String METHOD_NAME = "contextInitialized";
        log.entering(CLASS_NAME, METHOD_NAME, contextEvent);

        // Initialized dynaprop.
        System.out.println("===PM Property Initialize===");
        initializeDynaProp();
        super.init();
        System.out.println("===PM Property Initialize End===");
        log.exiting(CLASS_NAME, METHOD_NAME);
    }

    /**
     * /** Initialize Dynamic Property Manager and load the DTS required
     * namespaces for web service log.
     */
    private void initializeDynaProp() {
        final String METHOD_NAME = "initializeDynaProp";
        log.entering(CLASS_NAME, METHOD_NAME);
        System.out.println("coming in initializeDynaProp");
        final PropertyManager pm = PropertyManager.getInstance();
        try {

            System.out.println("Before initializind dynaprop"
                               + pm.getDynaVersionNumber());
            pm.initDynaProp();

            pm.loadFromDB(PcConstant.ROOT_NAME);

        } catch (final Exception e) {
            e.printStackTrace();
        }

        log.exiting(CLASS_NAME, METHOD_NAME);
    }

}
