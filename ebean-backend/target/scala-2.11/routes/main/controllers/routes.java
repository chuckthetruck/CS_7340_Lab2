
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/CJ/Desktop/8391/CS_7340_Lab2/ebean-backend/conf/routes
// @DATE:Fri Oct 08 17:12:35 CDT 2021

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReversePaperController PaperController = new controllers.ReversePaperController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseHomeController HomeController = new controllers.ReverseHomeController(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReversePaperController PaperController = new controllers.javascript.ReversePaperController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseHomeController HomeController = new controllers.javascript.ReverseHomeController(RoutesPrefix.byNamePrefix());
  }

}
