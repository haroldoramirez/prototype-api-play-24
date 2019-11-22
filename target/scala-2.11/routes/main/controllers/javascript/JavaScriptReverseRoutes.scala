
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo.nobrega/projetos/prototype-api-play-24/conf/routes
// @DATE:Fri Nov 22 14:47:18 BRST 2019

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:30
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:30
    def versioned: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.versioned",
      """
        function(file) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[Asset]].javascriptUnbind + """)("file", file)})
        }
      """
    )
  
  }

  // @LINE:10
  class ReverseProdutoController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:11
    def formularioDeNovoProduto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProdutoController.formularioDeNovoProduto",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "produto/novo"})
        }
      """
    )
  
    // @LINE:10
    def salvaNovoProduto: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ProdutoController.salvaNovoProduto",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "produto/novo"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReverseAdminController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:7
    def produtos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.produtos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/produtos"})
        }
      """
    )
  
    // @LINE:6
    def usuarios: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.AdminController.usuarios",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "admin/usuarios"})
        }
      """
    )
  
  }

  // @LINE:25
  class ReverseApiController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:26
    def todos: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.todos",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/produtos/todos"})
        }
      """
    )
  
    // @LINE:27
    def doTipo: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.doTipo",
      """
        function(tipo) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/produtos/tipo/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("tipo", encodeURIComponent(tipo))})
        }
      """
    )
  
    // @LINE:25
    def comFiltros: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.ApiController.comFiltros",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "api/produtos"})
        }
      """
    )
  
  }

  // @LINE:13
  class ReverseUsuarioController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:20
    def formularioDeLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.formularioDeLogin",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
    // @LINE:22
    def fazLogout: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.fazLogout",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "logout"})
        }
      """
    )
  
    // @LINE:13
    def salvaNovoUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.salvaNovoUsuario",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
        }
      """
    )
  
    // @LINE:15
    def confirmaUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.confirmaUsuario",
      """
        function(email,codigo) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/confirma/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("email", encodeURIComponent(email)) + "/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("codigo", encodeURIComponent(codigo))})
        }
      """
    )
  
    // @LINE:14
    def formularioDeNovoUsuario: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.formularioDeNovoUsuario",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/novo"})
        }
      """
    )
  
    // @LINE:18
    def painel: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.painel",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "usuario/painel"})
        }
      """
    )
  
    // @LINE:21
    def fazLogin: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.UsuarioController.fazLogin",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "login"})
        }
      """
    )
  
  }


}