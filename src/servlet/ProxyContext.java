package servlet;

import java.net.URI;
import java.net.URISyntaxException;

public class ProxyContext {

  /** A boolean parameter name to enable logging of input and target URLs to the servlet log. */
  public static final String P_LOG = "log";

  /** A boolean parameter name to enable forwarding of the client IP */
  public static final String P_FORWARDEDFOR = "proxy";

  /** The parameter name for the target (destination) URI to proxy to. */
  public static final String P_TARGET_URI = "target";
  
  protected static boolean PROXY_OR_NOT = true;
  protected static URI TARGET_URI_OBJECT = null;
  protected static String TARGET_URI = null;
  
  public static void setProxyOrNot(boolean flag) {
    PROXY_OR_NOT = flag;
  }
  
  public  static void setTargetUri(String targetURI) {
    if(null == targetURI) return;
    try {
      TARGET_URI_OBJECT = new URI(TARGET_URI);
      TARGET_URI = TARGET_URI_OBJECT.toString();
    } catch (URISyntaxException e) {
      throw new RuntimeException("Trying to process targetUri init parameter: "+e,e);
    }
  }
  
}
