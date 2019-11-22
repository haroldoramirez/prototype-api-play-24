
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo.nobrega/projetos/prototype-api-play-24/conf/routes
// @DATE:Fri Nov 22 11:37:42 BRST 2019

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:8
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:11
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file) {
        
          if (file == """ + implicitly[JavascriptLiteral[String]].to("robots.txt") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "robots.txt"})
          }
        
          if (file == """ + implicitly[JavascriptLiteral[String]].to("humans.txt") + """) {
            return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "humans.txt"})
          }
        
        }
      """
    )
  
    // @LINE:15
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:8
  class ReverseApplication(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:9
    def mudaIdioma: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.mudaIdioma",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "idioma"})
        }
      """
    )
  
    // @LINE:8
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:10
    def jsMessages: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Application.jsMessages",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "messages.js"})
        }
      """
    )
  
  }


}