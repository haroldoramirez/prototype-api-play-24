
// @GENERATOR:play-routes-compiler
// @SOURCE:/home/haroldo.nobrega/projetos/prototype-api-play-24/conf/routes
// @DATE:Fri Nov 22 11:37:42 BRST 2019


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
