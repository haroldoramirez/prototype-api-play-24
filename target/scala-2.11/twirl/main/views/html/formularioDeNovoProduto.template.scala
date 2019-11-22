
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formularioDeNovoProduto_Scope0 {
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

class formularioDeNovoProduto extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Produto],play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template takes a single argument, a String containing a
* message to display.
*/
  def apply/*5.2*/(formulario: play.data.Form[Produto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor

Seq[Any](format.raw/*5.39*/("""

"""),format.raw/*11.3*/("""

"""),format.raw/*14.1*/("""
"""),_display_(/*15.2*/main("Welcome to Play")/*15.25*/ {_display_(Seq[Any](format.raw/*15.27*/("""
"""),_display_(/*16.2*/b3/*16.4*/.form(routes.ProdutoController.salvaNovoProduto())/*16.54*/ {_display_(Seq[Any](format.raw/*16.56*/("""
"""),format.raw/*17.1*/("""<h1>Cadastro de Produto</h1>
"""),_display_(/*18.2*/b3/*18.4*/.text(formulario("titulo"), '_label -> "Título")),format.raw/*18.52*/("""
"""),_display_(/*19.2*/b3/*19.4*/.text(formulario("codigo"), '_label -> "Código")),format.raw/*19.52*/("""
"""),_display_(/*20.2*/b3/*20.4*/.text(formulario("tipo"), '_label -> "Tipo")),format.raw/*20.48*/("""
"""),_display_(/*21.2*/b3/*21.4*/.textarea(formulario("descricao"))),format.raw/*21.38*/("""
"""),_display_(/*22.2*/b3/*22.4*/.number(formulario("preco"), '_label -> "Preço")),format.raw/*22.52*/("""
"""),_display_(/*23.2*/b3/*23.4*/.submit('class -> "btn btn-primary")/*23.40*/ {_display_(Seq[Any](format.raw/*23.42*/(""" """),format.raw/*23.43*/("""Cadastrar """)))}),format.raw/*23.54*/("""
""")))}),format.raw/*24.2*/("""
""")))}))
      }
    }
  }

  def render(formulario:play.data.Form[Produto]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((play.data.Form[Produto]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


}

/*
* This template takes a single argument, a String containing a
* message to display.
*/
object formularioDeNovoProduto extends formularioDeNovoProduto_Scope0.formularioDeNovoProduto
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 14:47:19 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/formularioDeNovoProduto.scala.html
                  HASH: 52b2ef7e49345fa1e64a15baf2fd30793ebb4e21
                  MATRIX: 884->92|1051->129|1080->321|1109->360|1137->362|1169->385|1209->387|1237->389|1247->391|1306->441|1346->443|1374->444|1430->474|1440->476|1509->524|1537->526|1547->528|1616->576|1644->578|1654->580|1719->624|1747->626|1757->628|1812->662|1840->664|1850->666|1919->714|1947->716|1957->718|2002->754|2042->756|2071->757|2113->768|2145->770
                  LINES: 30->5|35->5|37->11|39->14|40->15|40->15|40->15|41->16|41->16|41->16|41->16|42->17|43->18|43->18|43->18|44->19|44->19|44->19|45->20|45->20|45->20|46->21|46->21|46->21|47->22|47->22|47->22|48->23|48->23|48->23|48->23|48->23|48->23|49->24
                  -- GENERATED --
              */
          