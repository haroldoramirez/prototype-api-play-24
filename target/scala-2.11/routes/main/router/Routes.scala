
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo.nobrega/projetos/prototype-api-play-24/conf/routes
// @DATE:Fri Nov 22 14:47:18 BRST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  AdminController_0: controllers.AdminController,
  // @LINE:10
  ProdutoController_2: controllers.ProdutoController,
  // @LINE:13
  UsuarioController_1: controllers.UsuarioController,
  // @LINE:25
  ApiController_4: controllers.ApiController,
  // @LINE:30
  Assets_3: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    AdminController_0: controllers.AdminController,
    // @LINE:10
    ProdutoController_2: controllers.ProdutoController,
    // @LINE:13
    UsuarioController_1: controllers.UsuarioController,
    // @LINE:25
    ApiController_4: controllers.ApiController,
    // @LINE:30
    Assets_3: controllers.Assets
  ) = this(errorHandler, AdminController_0, ProdutoController_2, UsuarioController_1, ApiController_4, Assets_3, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, AdminController_0, ProdutoController_2, UsuarioController_1, ApiController_4, Assets_3, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/usuarios""", """controllers.AdminController.usuarios()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """admin/produtos""", """controllers.AdminController.produtos()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produto/novo""", """controllers.ProdutoController.salvaNovoProduto()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """produto/novo""", """controllers.ProdutoController.formularioDeNovoProduto()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/novo""", """controllers.UsuarioController.salvaNovoUsuario()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/novo""", """controllers.UsuarioController.formularioDeNovoUsuario()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/confirma/$email<[^/]+>/$codigo<[^/]+>""", """controllers.UsuarioController.confirmaUsuario(email:String, codigo:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """usuario/painel""", """controllers.UsuarioController.painel()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UsuarioController.formularioDeLogin()"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """login""", """controllers.UsuarioController.fazLogin()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """logout""", """controllers.UsuarioController.fazLogout()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/produtos""", """controllers.ApiController.comFiltros"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/produtos/todos""", """controllers.ApiController.todos"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """api/produtos/tipo/$tipo<[^/]+>""", """controllers.ApiController.doTipo(tipo:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_AdminController_usuarios0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/usuarios")))
  )
  private[this] lazy val controllers_AdminController_usuarios0_invoker = createInvoker(
    AdminController_0.usuarios(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "usuarios",
      Nil,
      "GET",
      """ Rotas""",
      this.prefix + """admin/usuarios"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_AdminController_produtos1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("admin/produtos")))
  )
  private[this] lazy val controllers_AdminController_produtos1_invoker = createInvoker(
    AdminController_0.produtos(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.AdminController",
      "produtos",
      Nil,
      "GET",
      """""",
      this.prefix + """admin/produtos"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_ProdutoController_salvaNovoProduto2_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produto/novo")))
  )
  private[this] lazy val controllers_ProdutoController_salvaNovoProduto2_invoker = createInvoker(
    ProdutoController_2.salvaNovoProduto(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProdutoController",
      "salvaNovoProduto",
      Nil,
      "POST",
      """""",
      this.prefix + """produto/novo"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_ProdutoController_formularioDeNovoProduto3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("produto/novo")))
  )
  private[this] lazy val controllers_ProdutoController_formularioDeNovoProduto3_invoker = createInvoker(
    ProdutoController_2.formularioDeNovoProduto(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ProdutoController",
      "formularioDeNovoProduto",
      Nil,
      "GET",
      """""",
      this.prefix + """produto/novo"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_UsuarioController_salvaNovoUsuario4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/novo")))
  )
  private[this] lazy val controllers_UsuarioController_salvaNovoUsuario4_invoker = createInvoker(
    UsuarioController_1.salvaNovoUsuario(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "salvaNovoUsuario",
      Nil,
      "POST",
      """""",
      this.prefix + """usuario/novo"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_UsuarioController_formularioDeNovoUsuario5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/novo")))
  )
  private[this] lazy val controllers_UsuarioController_formularioDeNovoUsuario5_invoker = createInvoker(
    UsuarioController_1.formularioDeNovoUsuario(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "formularioDeNovoUsuario",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/novo"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_UsuarioController_confirmaUsuario6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/confirma/"), DynamicPart("email", """[^/]+""",true), StaticPart("/"), DynamicPart("codigo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_UsuarioController_confirmaUsuario6_invoker = createInvoker(
    UsuarioController_1.confirmaUsuario(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "confirmaUsuario",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """usuario/confirma/$email<[^/]+>/$codigo<[^/]+>"""
    )
  )

  // @LINE:18
  private[this] lazy val controllers_UsuarioController_painel7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("usuario/painel")))
  )
  private[this] lazy val controllers_UsuarioController_painel7_invoker = createInvoker(
    UsuarioController_1.painel(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "painel",
      Nil,
      "GET",
      """""",
      this.prefix + """usuario/painel"""
    )
  )

  // @LINE:20
  private[this] lazy val controllers_UsuarioController_formularioDeLogin8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UsuarioController_formularioDeLogin8_invoker = createInvoker(
    UsuarioController_1.formularioDeLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "formularioDeLogin",
      Nil,
      "GET",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:21
  private[this] lazy val controllers_UsuarioController_fazLogin9_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("login")))
  )
  private[this] lazy val controllers_UsuarioController_fazLogin9_invoker = createInvoker(
    UsuarioController_1.fazLogin(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "fazLogin",
      Nil,
      "POST",
      """""",
      this.prefix + """login"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_UsuarioController_fazLogout10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("logout")))
  )
  private[this] lazy val controllers_UsuarioController_fazLogout10_invoker = createInvoker(
    UsuarioController_1.fazLogout(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.UsuarioController",
      "fazLogout",
      Nil,
      "GET",
      """""",
      this.prefix + """logout"""
    )
  )

  // @LINE:25
  private[this] lazy val controllers_ApiController_comFiltros11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/produtos")))
  )
  private[this] lazy val controllers_ApiController_comFiltros11_invoker = createInvoker(
    ApiController_4.comFiltros,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "comFiltros",
      Nil,
      "GET",
      """ API""",
      this.prefix + """api/produtos"""
    )
  )

  // @LINE:26
  private[this] lazy val controllers_ApiController_todos12_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/produtos/todos")))
  )
  private[this] lazy val controllers_ApiController_todos12_invoker = createInvoker(
    ApiController_4.todos,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "todos",
      Nil,
      "GET",
      """""",
      this.prefix + """api/produtos/todos"""
    )
  )

  // @LINE:27
  private[this] lazy val controllers_ApiController_doTipo13_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("api/produtos/tipo/"), DynamicPart("tipo", """[^/]+""",true)))
  )
  private[this] lazy val controllers_ApiController_doTipo13_invoker = createInvoker(
    ApiController_4.doTipo(fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.ApiController",
      "doTipo",
      Seq(classOf[String]),
      "GET",
      """""",
      this.prefix + """api/produtos/tipo/$tipo<[^/]+>"""
    )
  )

  // @LINE:30
  private[this] lazy val controllers_Assets_versioned14_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned14_invoker = createInvoker(
    Assets_3.versioned(fakeValue[String], fakeValue[Asset]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/$file<.+>"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_AdminController_usuarios0_route(params) =>
      call { 
        controllers_AdminController_usuarios0_invoker.call(AdminController_0.usuarios())
      }
  
    // @LINE:7
    case controllers_AdminController_produtos1_route(params) =>
      call { 
        controllers_AdminController_produtos1_invoker.call(AdminController_0.produtos())
      }
  
    // @LINE:10
    case controllers_ProdutoController_salvaNovoProduto2_route(params) =>
      call { 
        controllers_ProdutoController_salvaNovoProduto2_invoker.call(ProdutoController_2.salvaNovoProduto())
      }
  
    // @LINE:11
    case controllers_ProdutoController_formularioDeNovoProduto3_route(params) =>
      call { 
        controllers_ProdutoController_formularioDeNovoProduto3_invoker.call(ProdutoController_2.formularioDeNovoProduto())
      }
  
    // @LINE:13
    case controllers_UsuarioController_salvaNovoUsuario4_route(params) =>
      call { 
        controllers_UsuarioController_salvaNovoUsuario4_invoker.call(UsuarioController_1.salvaNovoUsuario())
      }
  
    // @LINE:14
    case controllers_UsuarioController_formularioDeNovoUsuario5_route(params) =>
      call { 
        controllers_UsuarioController_formularioDeNovoUsuario5_invoker.call(UsuarioController_1.formularioDeNovoUsuario())
      }
  
    // @LINE:15
    case controllers_UsuarioController_confirmaUsuario6_route(params) =>
      call(params.fromPath[String]("email", None), params.fromPath[String]("codigo", None)) { (email, codigo) =>
        controllers_UsuarioController_confirmaUsuario6_invoker.call(UsuarioController_1.confirmaUsuario(email, codigo))
      }
  
    // @LINE:18
    case controllers_UsuarioController_painel7_route(params) =>
      call { 
        controllers_UsuarioController_painel7_invoker.call(UsuarioController_1.painel())
      }
  
    // @LINE:20
    case controllers_UsuarioController_formularioDeLogin8_route(params) =>
      call { 
        controllers_UsuarioController_formularioDeLogin8_invoker.call(UsuarioController_1.formularioDeLogin())
      }
  
    // @LINE:21
    case controllers_UsuarioController_fazLogin9_route(params) =>
      call { 
        controllers_UsuarioController_fazLogin9_invoker.call(UsuarioController_1.fazLogin())
      }
  
    // @LINE:22
    case controllers_UsuarioController_fazLogout10_route(params) =>
      call { 
        controllers_UsuarioController_fazLogout10_invoker.call(UsuarioController_1.fazLogout())
      }
  
    // @LINE:25
    case controllers_ApiController_comFiltros11_route(params) =>
      call { 
        controllers_ApiController_comFiltros11_invoker.call(ApiController_4.comFiltros)
      }
  
    // @LINE:26
    case controllers_ApiController_todos12_route(params) =>
      call { 
        controllers_ApiController_todos12_invoker.call(ApiController_4.todos)
      }
  
    // @LINE:27
    case controllers_ApiController_doTipo13_route(params) =>
      call(params.fromPath[String]("tipo", None)) { (tipo) =>
        controllers_ApiController_doTipo13_invoker.call(ApiController_4.doTipo(tipo))
      }
  
    // @LINE:30
    case controllers_Assets_versioned14_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned14_invoker.call(Assets_3.versioned(path, file))
      }
  }
}