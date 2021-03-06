/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.wordpress;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class WordpressComponentConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    private org.apache.camel.component.wordpress.WordpressComponentConfiguration getOrCreateConfiguration(WordpressComponent target) {
        if (target.getConfiguration() == null) {
            target.setConfiguration(new org.apache.camel.component.wordpress.WordpressComponentConfiguration());
        }
        return target.getConfiguration();
    }

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        WordpressComponent target = (WordpressComponent) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "apiversion":
        case "apiVersion": getOrCreateConfiguration(target).setApiVersion(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "configuration": target.setConfiguration(property(camelContext, org.apache.camel.component.wordpress.WordpressComponentConfiguration.class, value)); return true;
        case "criteria": getOrCreateConfiguration(target).setCriteria(property(camelContext, java.util.Map.class, value)); return true;
        case "force": getOrCreateConfiguration(target).setForce(property(camelContext, boolean.class, value)); return true;
        case "id": getOrCreateConfiguration(target).setId(property(camelContext, java.lang.Integer.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "password": getOrCreateConfiguration(target).setPassword(property(camelContext, java.lang.String.class, value)); return true;
        case "searchcriteria":
        case "searchCriteria": getOrCreateConfiguration(target).setSearchCriteria(property(camelContext, org.apache.camel.component.wordpress.api.model.SearchCriteria.class, value)); return true;
        case "url": getOrCreateConfiguration(target).setUrl(property(camelContext, java.lang.String.class, value)); return true;
        case "user": getOrCreateConfiguration(target).setUser(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

