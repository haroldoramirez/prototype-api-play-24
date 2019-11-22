
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object notificacoes_Scope0 {
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

class notificacoes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](_display_(/*1.2*/if(!flash.isEmpty)/*1.20*/ {_display_(Seq[Any](format.raw/*1.22*/("""
"""),format.raw/*2.1*/("""<section class="container">
    """),_display_(/*3.6*/for(key <- flash.keySet) yield /*3.30*/ {_display_(Seq[Any](format.raw/*3.32*/("""
    """),format.raw/*4.5*/("""<p class="alert alert-"""),_display_(/*4.28*/key),format.raw/*4.31*/(""" """),format.raw/*4.32*/("""text-"""),_display_(/*4.38*/key),format.raw/*4.41*/("""">
        """),_display_(/*5.10*/flash/*5.15*/.get(key)),format.raw/*5.24*/("""
    """),format.raw/*6.5*/("""</p>
    """)))}),format.raw/*7.6*/("""
"""),format.raw/*8.1*/("""</section>
""")))}))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object notificacoes extends notificacoes_Scope0.notificacoes
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 14:47:19 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/notificacoes.scala.html
                  HASH: a86a42437d1ebe8a6aeffaee7c7f5f0079063c4f
                  MATRIX: 841->1|867->19|906->21|933->22|991->55|1030->79|1069->81|1100->86|1149->109|1172->112|1200->113|1232->119|1255->122|1293->134|1306->139|1335->148|1366->153|1405->163|1432->164
                  LINES: 32->1|32->1|32->1|33->2|34->3|34->3|34->3|35->4|35->4|35->4|35->4|35->4|35->4|36->5|36->5|36->5|37->6|38->7|39->8
                  -- GENERATED --
              */
          