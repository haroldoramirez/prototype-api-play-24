
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo.nobrega/projetos/prototype-api-play-24/conf/routes
// @DATE:Fri Nov 22 11:37:42 BRST 2019

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:8
  Application_1: controllers.Application,
  // @LINE:11
  Assets_0: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:8
    Application_1: controllers.Application,
    // @LINE:11
    Assets_0: controllers.Assets
  ) = this(errorHandler, Application_1, Assets_0, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, Application_1, Assets_0, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.Application.index()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """idioma""", """controllers.Application.mudaIdioma()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """messages.js""", """controllers.Application.jsMessages()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """robots.txt""", """controllers.Assets.at(path:String = "/public", file:String = "robots.txt")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """humans.txt""", """controllers.Assets.at(path:String = "/public", file:String = "humans.txt")"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:8
  private[this] lazy val controllers_Application_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_Application_index0_invoker = createInvoker(
    Application_1.index(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "index",
      Nil,
      "GET",
      """ Application""",
      this.prefix + """"""
    )
  )

  // @LINE:9
  private[this] lazy val controllers_Application_mudaIdioma1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("idioma")))
  )
  private[this] lazy val controllers_Application_mudaIdioma1_invoker = createInvoker(
    Application_1.mudaIdioma(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "mudaIdioma",
      Nil,
      "GET",
      """""",
      this.prefix + """idioma"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_Application_jsMessages2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("messages.js")))
  )
  private[this] lazy val controllers_Application_jsMessages2_invoker = createInvoker(
    Application_1.jsMessages(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Application",
      "jsMessages",
      Nil,
      "GET",
      """""",
      this.prefix + """messages.js"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_Assets_at3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("robots.txt")))
  )
  private[this] lazy val controllers_Assets_at3_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """robots.txt"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_Assets_at4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("humans.txt")))
  )
  private[this] lazy val controllers_Assets_at4_invoker = createInvoker(
    Assets_0.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """""",
      this.prefix + """humans.txt"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_Assets_versioned5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned5_invoker = createInvoker(
    Assets_0.versioned(fakeValue[String], fakeValue[Asset]),
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
  
    // @LINE:8
    case controllers_Application_index0_route(params) =>
      call { 
        controllers_Application_index0_invoker.call(Application_1.index())
      }
  
    // @LINE:9
    case controllers_Application_mudaIdioma1_route(params) =>
      call { 
        controllers_Application_mudaIdioma1_invoker.call(Application_1.mudaIdioma())
      }
  
    // @LINE:10
    case controllers_Application_jsMessages2_route(params) =>
      call { 
        controllers_Application_jsMessages2_invoker.call(Application_1.jsMessages())
      }
  
    // @LINE:11
    case controllers_Assets_at3_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("robots.txt"))) { (path, file) =>
        controllers_Assets_at3_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:12
    case controllers_Assets_at4_route(params) =>
      call(Param[String]("path", Right("/public")), Param[String]("file", Right("humans.txt"))) { (path, file) =>
        controllers_Assets_at4_invoker.call(Assets_0.at(path, file))
      }
  
    // @LINE:15
    case controllers_Assets_versioned5_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned5_invoker.call(Assets_0.versioned(path, file))
      }
  }
}