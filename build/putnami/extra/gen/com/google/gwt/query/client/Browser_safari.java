package com.google.gwt.query.client;

public class Browser_safari extends com.google.gwt.query.client.Browser {
  protected boolean isWebkit() {return true;}
  protected boolean isSafari() {return true;}
  protected boolean isOpera() {return false;}
  protected boolean isMozilla() {return false;}
  protected boolean isMsie() {return false;}
  protected boolean isIe6() {return false;}
  protected boolean isIe8() {return false;}
  protected boolean isIe9() {return false;}
  protected boolean isIe10() {return false;}
  protected boolean isIe11() {return false;}
  public String toString() {return "Browser:" + " webkit=" + webkit + " mozilla=" + mozilla + " opera=" + opera + " msie=" + msie + " ie6=" + ie6 + " ie8=" + ie8 + " ie9=" + ie9;}
}
