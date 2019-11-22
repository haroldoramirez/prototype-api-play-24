
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object formularioDeNovoUsuario_Scope0 {
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

class formularioDeNovoUsuario extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[play.data.Form[Usuario],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(formulario: play.data.Form[Usuario]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import b3.vertical.fieldConstructor;

Seq[Any](format.raw/*1.39*/("""

"""),format.raw/*4.1*/("""
"""),_display_(/*5.2*/main("Cadastro de Usuário")/*5.29*/ {_display_(Seq[Any](format.raw/*5.31*/("""
"""),_display_(/*6.2*/b3/*6.4*/.form(routes.UsuarioController.salvaNovoUsuario)/*6.52*/ {_display_(Seq[Any](format.raw/*6.54*/("""
"""),format.raw/*7.1*/("""<h1>Cadastre-se</h1>
"""),_display_(/*8.2*/b3/*8.4*/.text(formulario("nome"), '_label -> "Nome")),format.raw/*8.48*/("""
"""),_display_(/*9.2*/b3/*9.4*/.email(formulario("email"), '_label -> "Email")),format.raw/*9.51*/("""
"""),_display_(/*10.2*/b3/*10.4*/.password(formulario("senha"), '_label -> "Senha")),format.raw/*10.54*/("""
"""),_display_(/*11.2*/b3/*11.4*/.password(formulario("confirmaSenha"), '_label -> "Confirmação de senha")),format.raw/*11.77*/("""
"""),_display_(/*12.2*/b3/*12.4*/.submit('class -> "btn btn-primary")/*12.40*/ {_display_(Seq[Any](format.raw/*12.42*/(""" """),format.raw/*12.43*/("""Cadastrar """)))}),format.raw/*12.54*/("""
""")))}),format.raw/*13.2*/("""
""")))}))
      }
    }
  }

  def render(formulario:play.data.Form[Usuario]): play.twirl.api.HtmlFormat.Appendable = apply(formulario)

  def f:((play.data.Form[Usuario]) => play.twirl.api.HtmlFormat.Appendable) = (formulario) => apply(formulario)

  def ref: this.type = this

}


}

/**/
object formularioDeNovoUsuario extends formularioDeNovoUsuario_Scope0.formularioDeNovoUsuario
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 14:47:19 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/formularioDeNovoUsuario.scala.html
                  HASH: 1694a3ae61fe2130320d02de403d44f9cf06cfe6
                  MATRIX: 798->1|966->38|994->78|1021->80|1056->107|1095->109|1122->111|1131->113|1187->161|1226->163|1253->164|1300->186|1309->188|1373->232|1400->234|1409->236|1476->283|1504->285|1514->287|1585->337|1613->339|1623->341|1717->414|1745->416|1755->418|1800->454|1840->456|1869->457|1911->468|1943->470
                  LINES: 27->1|32->1|34->4|35->5|35->5|35->5|36->6|36->6|36->6|36->6|37->7|38->8|38->8|38->8|39->9|39->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|42->12|42->12|42->12|42->12|42->12|43->13
                  -- GENERATED --
              */
          