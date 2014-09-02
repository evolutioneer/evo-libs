package util;

import oracle.adfmf.java.beans.PropertyChangeSupport;
import oracle.adfmf.java.beans.ProviderChangeSupport;

public class RefreshEventsUtil {
    public RefreshEventsUtil() {
        super();
    }
    
    private transient PropertyChangeSupport propertyChangeSupport = new PropertyChangeSupport(this);
    private transient ProviderChangeSupport providerChangeSupport = new ProviderChangeSupport(this);
    
    /**
     * Refreshes the provider with the given provider key
     * @param providerKey
     */
    public void fireProviderRefresh(String providerKey) {
        if (providerChangeSupport.hasListeners()){
            providerChangeSupport.fireProviderRefresh(providerKey);
        }
    }   
}
