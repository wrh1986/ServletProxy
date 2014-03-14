package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SettingServlet extends HttpServlet{

  @Override
  public void doGet(HttpServletRequest servletRequest, HttpServletResponse servletResponse)
      throws ServletException, IOException {
    
    String targetUri = servletRequest.getParameter(ProxyContext.P_TARGET_URI);
    if(null != targetUri) {
      ProxyContext.setTargetUri(targetUri);
    }
    
    String proxyOrNotStr = servletRequest.getParameter(ProxyContext.P_FORWARDEDFOR);
    if(null != proxyOrNotStr) {
      ProxyContext.setProxyOrNot(Boolean.parseBoolean(proxyOrNotStr));
    }
  }
}
