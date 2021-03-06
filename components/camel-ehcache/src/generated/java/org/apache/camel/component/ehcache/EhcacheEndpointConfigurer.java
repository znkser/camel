/* Generated by camel build tools - do NOT edit this file! */
package org.apache.camel.component.ehcache;

import org.apache.camel.CamelContext;
import org.apache.camel.spi.GeneratedPropertyConfigurer;
import org.apache.camel.support.component.PropertyConfigurerSupport;

/**
 * Generated by camel build tools - do NOT edit this file!
 */
@SuppressWarnings("unchecked")
public class EhcacheEndpointConfigurer extends PropertyConfigurerSupport implements GeneratedPropertyConfigurer {

    @Override
    public boolean configure(CamelContext camelContext, Object obj, String name, Object value, boolean ignoreCase) {
        EhcacheEndpoint target = (EhcacheEndpoint) obj;
        switch (ignoreCase ? name.toLowerCase() : name) {
        case "action": target.getConfiguration().setAction(property(camelContext, java.lang.String.class, value)); return true;
        case "basicpropertybinding":
        case "basicPropertyBinding": target.setBasicPropertyBinding(property(camelContext, boolean.class, value)); return true;
        case "bridgeerrorhandler":
        case "bridgeErrorHandler": target.setBridgeErrorHandler(property(camelContext, boolean.class, value)); return true;
        case "cachemanager":
        case "cacheManager": target.getConfiguration().setCacheManager(property(camelContext, org.ehcache.CacheManager.class, value)); return true;
        case "cachemanagerconfiguration":
        case "cacheManagerConfiguration": target.getConfiguration().setCacheManagerConfiguration(property(camelContext, org.ehcache.config.Configuration.class, value)); return true;
        case "configuration": target.getConfiguration().setConfiguration(property(camelContext, org.ehcache.config.CacheConfiguration.class, value)); return true;
        case "configurationuri":
        case "configurationUri": target.getConfiguration().setConfigurationUri(property(camelContext, java.lang.String.class, value)); return true;
        case "configurations": target.getConfiguration().setConfigurations(property(camelContext, java.util.Map.class, value)); return true;
        case "createcacheifnotexist":
        case "createCacheIfNotExist": target.getConfiguration().setCreateCacheIfNotExist(property(camelContext, boolean.class, value)); return true;
        case "eventfiring":
        case "eventFiring": target.getConfiguration().setEventFiring(property(camelContext, org.ehcache.event.EventFiring.class, value)); return true;
        case "eventordering":
        case "eventOrdering": target.getConfiguration().setEventOrdering(property(camelContext, org.ehcache.event.EventOrdering.class, value)); return true;
        case "eventtypes":
        case "eventTypes": target.getConfiguration().setEventTypes(property(camelContext, java.lang.String.class, value)); return true;
        case "exceptionhandler":
        case "exceptionHandler": target.setExceptionHandler(property(camelContext, org.apache.camel.spi.ExceptionHandler.class, value)); return true;
        case "exchangepattern":
        case "exchangePattern": target.setExchangePattern(property(camelContext, org.apache.camel.ExchangePattern.class, value)); return true;
        case "key": target.getConfiguration().setKey(property(camelContext, java.lang.Object.class, value)); return true;
        case "keytype":
        case "keyType": target.getConfiguration().setKeyType(property(camelContext, java.lang.String.class, value)); return true;
        case "lazystartproducer":
        case "lazyStartProducer": target.setLazyStartProducer(property(camelContext, boolean.class, value)); return true;
        case "synchronous": target.setSynchronous(property(camelContext, boolean.class, value)); return true;
        case "valuetype":
        case "valueType": target.getConfiguration().setValueType(property(camelContext, java.lang.String.class, value)); return true;
        default: return false;
        }
    }

}

