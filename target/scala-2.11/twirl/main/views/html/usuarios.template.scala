
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object usuarios_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class usuarios extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuarios: List[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/numeroDeAcessos/*3.17*/(usuario: Usuario) = {{
usuario.getAcessos.size()
}};def /*7.2*/ultimoAcesso/*7.14*/(usuario: Usuario) = {{
var ultimo = numeroDeAcessos(usuario)-1
if (ultimo >= 0) {
usuario.getAcessos.get(ultimo).getDataDeAcesso()
}
}};def /*14.2*/codigo/*14.8*/(usuario: Usuario) = {{
var token = usuario.getToken()
if (token != null) {
token.getCodigo()
}
}};
Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*5.2*/("""

"""),format.raw/*12.2*/("""

"""),format.raw/*19.2*/("""

"""),_display_(/*21.2*/main("Lista de usuários")/*21.27*/ {_display_(Seq[Any](format.raw/*21.29*/("""
"""),format.raw/*22.1*/("""<section class="panel panel-default">
    <header class="panel-heading">
        <h2 class="panel-title">Lista de usuários</h2>
    </header>
    <div class="panel-body">
        <table class="table table-striped">
            <thead>
            <tr>
                <td>Id</td>
                <td>Nome</td>
                <td>Email</td>
                <td>Token</td>
                <td>Acessos</td>
                <td>Último acesso</td>
            </tr>
            </thead>
            <tbody>
            """),_display_(/*39.14*/for(usuario <- usuarios) yield /*39.38*/ {_display_(Seq[Any](format.raw/*39.40*/("""
            """),format.raw/*40.13*/("""<tr>
                <td>"""),_display_(/*41.22*/usuario/*41.29*/.getId()),format.raw/*41.37*/("""</td>
                <td>"""),_display_(/*42.22*/usuario/*42.29*/.getNome()),format.raw/*42.39*/("""</td>
                <td>"""),_display_(/*43.22*/usuario/*43.29*/.getEmail()),format.raw/*43.40*/("""</td>
                <td>"""),_display_(/*44.22*/codigo(usuario)),format.raw/*44.37*/("""</td>
                <td>"""),_display_(/*45.22*/numeroDeAcessos(usuario)),format.raw/*45.46*/("""</td>
                <td>"""),_display_(/*46.22*/ultimoAcesso(usuario)),format.raw/*46.43*/("""</td>
            </tr>
            """)))}),format.raw/*48.14*/("""
            """),format.raw/*49.13*/("""</tbody>
        </table>
    </div>
</section>
""")))}))
      }
    }
  }

  def render(usuarios:List[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(usuarios)

  def f:((List[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (usuarios) => apply(usuarios)

  def ref: this.type = this

}


}

/**/
object usuarios extends usuarios_Scope0.usuarios
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 14:47:18 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/usuarios.scala.html
                  HASH: 7a81f925fd9682be699d480d6d8dbc94479f8811
                  MATRIX: 758->1|861->29|884->44|948->98|968->110|1117->248|1131->254|1258->26|1286->95|1315->245|1344->351|1373->354|1407->379|1447->381|1475->382|2018->898|2058->922|2098->924|2139->937|2192->963|2208->970|2237->978|2291->1005|2307->1012|2338->1022|2392->1049|2408->1056|2440->1067|2494->1094|2530->1109|2584->1136|2629->1160|2683->1187|2725->1208|2793->1245|2834->1258
                  LINES: 27->1|31->3|31->3|33->7|33->7|38->14|38->14|44->1|46->5|48->12|50->19|52->21|52->21|52->21|53->22|70->39|70->39|70->39|71->40|72->41|72->41|72->41|73->42|73->42|73->42|74->43|74->43|74->43|75->44|75->44|76->45|76->45|77->46|77->46|79->48|80->49
                  -- GENERATED --
              */
          