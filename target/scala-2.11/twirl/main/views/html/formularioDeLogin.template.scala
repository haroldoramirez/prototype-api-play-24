
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formularioDeLogin_Scope0 {
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

class formularioDeLogin extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[DynamicForm,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: DynamicForm):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor;

Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Login")/*5.15*/ {_display_(Seq[Any](format.raw/*5.17*/("""
"""),_display_(/*6.2*/b3/*6.4*/.form(routes.UsuarioController.fazLogin)/*6.44*/ {_display_(Seq[Any](format.raw/*6.46*/("""
"""),format.raw/*7.1*/("""<h1>Tela de Login</h1>
"""),_display_(/*8.2*/b3/*8.4*/.email(formulario("email"), '_label -> "Email", 'autocomplete -> false)),format.raw/*8.75*/("""
"""),_display_(/*9.2*/b3/*9.4*/.password(formulario("senha"), '_label -> "Senha", 'autocomplete -> false)),format.raw/*9.78*/("""
"""),_display_(/*10.2*/b3/*10.4*/.submit('class -> "btn btn-primary")/*10.40*/ {_display_(Seq[Any](format.raw/*10.42*/(""" """),format.raw/*10.43*/("""Entrar """)))}),format.raw/*10.51*/("""
""")))}),format.raw/*11.2*/("""
""")))}),format.raw/*12.2*/("""

"""),format.raw/*14.1*/("""<p>Login: haroldoramirezgmail.com</p>
<p>Senha: hjr3213722</p>"""))
      }
    }
  }

  def render(formulario:DynamicForm): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((DynamicForm) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


}

/**/
object formularioDeLogin extends formularioDeLogin_Scope0.formularioDeLogin
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 15:02:04 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/formularioDeLogin.scala.html
                  HASH: acc4f45906d3600b250d49ebebbd4814a852c30f
                  MATRIX: 774->1|930->26|958->66|985->68|1006->81|1045->83|1072->85|1081->87|1129->127|1168->129|1195->130|1244->154|1253->156|1344->227|1371->229|1380->231|1474->305|1502->307|1512->309|1557->345|1597->347|1626->348|1665->356|1697->358|1729->360|1758->362
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|40->10|40->10|40->10|41->11|42->12|44->14
                  -- GENERATED --
              */
          