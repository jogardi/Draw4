package com.google.gwt.query.client;

public class Browser_ie9 extends com.google.gwt.query.client.Browser {
  protected boolean isWebkit() {return false;}
  protected boolean isSafari() {return false;}
  protected boolean isOpera() {return false;}
  protected boolean isMozilla() {return false;}
  protected boolean isMsie() {return true;}
  protected boolean isIe6() {return false;}
  protected boolean isIe8() {return false;}
  protected boolean isIe9() {return true;}
  public String toString() {return "Browser:" + " webkit=" + webkit + " mozilla=" + mozilla + " opera=" + opera + " msie=" + msie + " ie6=" + ie6 + " ie8=" + ie8 + " ie9=" + ie9;}
}
