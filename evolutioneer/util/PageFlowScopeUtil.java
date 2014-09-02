package util;

import java.math.BigDecimal;

import oracle.adfmf.framework.api.AdfmfJavaUtilities;


public class PageFlowScopeUtil {
    public PageFlowScopeUtil() {
        super();
    }
    
    /**
     * Return a BigDecimal from pageFlowScope.
     * @param nameSpace The name of the object in pageflow scope
     * @return BigDecimal value that is stored in pageFlowScope
     */
    public BigDecimal getPageFlowScopeBigDecimal(String nameSpace) {
        return ((BigDecimal)AdfmfJavaUtilities.evaluateELExpression("#{pageFlowScope."+ nameSpace +"}"));
    }
    
    /**
     * Return a String from pageFlowScope.
     * @param nameSpace The name of the object in pageflow scope
     * @return String value that is stored in pageFlowScope
     */
    public String getPageFlowScopeString(String nameSpace) {
        return ((String)AdfmfJavaUtilities.evaluateELExpression("#{pageFlowScope."+ nameSpace +"}"));
    }
    
    /**
     * Return a boolean from pageFlowScope.
     * @param nameSpace The name of the object in pageflow scope
     * @return Boolean value that is stored in pageFlowScope
     */
    public Boolean getPageFlowScopeBoolean(String nameSpace) {
        return ((Boolean)AdfmfJavaUtilities.evaluateELExpression("#{pageFlowScope."+ nameSpace +"}"));
    }
    
    /**
     * Set a boolean value in pageFlowScope.
     * @param nameSpace The name of the object in pageflow scope
     * @param value The value that will be set to the pageFlowScope object
     */
    public void  setPageFlowScopeBoolean(String nameSpace, boolean value) {
        AdfmfJavaUtilities.setELValue("#{pageFlowScope."+ nameSpace +"}", Boolean.valueOf(value));
    }
    
    /**
     * Set a BigDecimal value in pageFlowScope.
     * @param nameSpace The name of the object in pageflow scope
     * @param value The value that will be set to the pageFlowScope object
     */
    public void  setPageFlowScopeBigDecimal(String nameSpace, long value) {
        AdfmfJavaUtilities.setELValue("#{pageFlowScope."+ nameSpace +"}", BigDecimal.valueOf(value));
    }
    
    /**
     * Set a String value in pageFlowScope.
     * @param nameSpace The name of the object in pageflow scope
     * @param value The value that will be set to the pageFlowScope object
     */
    public void  setPageFlowScopeString(String nameSpace, String value) {
        AdfmfJavaUtilities.setELValue("#{pageFlowScope."+ nameSpace +"}", value);
    }
    
}
