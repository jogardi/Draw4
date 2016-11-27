package com.joseph.draw4.client.gin;

import com.google.gwt.core.client.GWT;
import com.mvp4g.client.com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector;

public class com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector_fragment {
  public void memberInject_Key$type$com$joseph$draw4$client$gin$MyFactory$_annotation$$none$$(com.joseph.draw4.client.gin.MyFactory injectee) {
    
  }
  
  private com.joseph.draw4.client.gin.MyFactory singleton_Key$type$com$joseph$draw4$client$gin$MyFactory$_annotation$$none$$ = null;
  
  public com.joseph.draw4.client.gin.MyFactory get_Key$type$com$joseph$draw4$client$gin$MyFactory$_annotation$$none$$() {
    
    if (singleton_Key$type$com$joseph$draw4$client$gin$MyFactory$_annotation$$none$$ == null) {
    Object created = GWT.create(com.joseph.draw4.client.gin.MyFactory.class);
    assert created instanceof com.joseph.draw4.client.gin.MyFactory;
    com.joseph.draw4.client.gin.MyFactory result = (com.joseph.draw4.client.gin.MyFactory) created;
    
    memberInject_Key$type$com$joseph$draw4$client$gin$MyFactory$_annotation$$none$$(result);
    
        singleton_Key$type$com$joseph$draw4$client$gin$MyFactory$_annotation$$none$$ = result;
    }
    return singleton_Key$type$com$joseph$draw4$client$gin$MyFactory$_annotation$$none$$;
    
  }
  
  
  /**
   * Field for the enclosing injector.
   */
  private final com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector injector;
  public com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector_fragment(com_mvp4g_client_Mvp4gModuleImpl_com_mvp4g_client_Mvp4gModuleGinjector_com_mvp4g_client_Mvp4gModuleGinjectorGinjector injector) {
    this.injector = injector;
  }
  
}
