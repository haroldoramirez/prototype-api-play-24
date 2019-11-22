
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo.nobrega/projetos/prototype-api-play-24/conf/routes
// @DATE:Fri Nov 22 11:37:42 BRST 2019

import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers {

  // @LINE:11
  class ReverseAssets(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at(file:String): Call = {
    
      (file: @unchecked) match {
      
        // @LINE:11
        case (file) if file == "robots.txt" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "robots.txt")))
          Call("GET", _prefix + { _defaultPrefix } + "robots.txt")
      
        // @LINE:12
        case (file) if file == "humans.txt" =>
          implicit val _rrc = new ReverseRouteContext(Map(("path", "/public"), ("file", "humans.txt")))
          Call("GET", _prefix + { _defaultPrefix } + "humans.txt")
      
      }
    
    }
  
    // @LINE:15
    def versioned(file:Asset): Call = {
      implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
      Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[Asset]].unbind("file", file))
    }
  
  }

  // @LINE:8
  class ReverseApplication(_prefix: => String) {
    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def mudaIdioma(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "idioma")
    }
  
    // @LINE:8
    def index(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix)
    }
  
    // @LINE:10
    def jsMessages(): Call = {
      import ReverseRouteContext.empty
      Call("GET", _prefix + { _defaultPrefix } + "messages.js")
    }
  
  }


}