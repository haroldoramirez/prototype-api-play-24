
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object painel_Scope0 {
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

class painel extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Usuario,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(usuario: Usuario):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.20*/("""
"""),_display_(/*2.2*/main("Painel do usuário")/*2.27*/ {_display_(Seq[Any](format.raw/*2.29*/("""
"""),format.raw/*3.1*/("""<section class="jumbotron">
    <h1>Painel do usuário</h1>
    <p>Bem vindo, <strong>"""),_display_(/*5.28*/usuario/*5.35*/.getNome()),format.raw/*5.45*/("""</strong>! Este é seu painel. Aqui você poderá ver sua chave de acesso e também suas requisições!</p>
</section>
<section class="panel panel-default">
    <header class="panel-heading">
        <h2 class="panel-title">Sua chave de acesso pessoal</h2>
    </header>
    <p class="panel-body">
        Sua chave de acesso é: <strong>"""),_display_(/*12.41*/usuario/*12.48*/.getToken().getCodigo()),format.raw/*12.71*/("""</strong>
    </p>
    <p class="panel-body">
        Para acessar a API, faça um GET na seguinte URL (adicionando no cabeçalho "API-Token" a sua chave de acesso): <pre>http://localhost:9000/api/produtos</pre>
    </p>
    <p class="panel-body">
        Você já fez <strong>"""),_display_(/*18.30*/usuario/*18.37*/.getAcessos.size()),format.raw/*18.55*/("""</strong> à nossa API;
    </p>
</section>
""")))}))
      }
    }
  }

  def render(usuario:Usuario): play.twirl.api.HtmlFormat.Appendable = apply(usuario)

  def f:((Usuario) => play.twirl.api.HtmlFormat.Appendable) = (usuario) => apply(usuario)

  def ref: this.type = this

}


}

/**/
object painel extends painel_Scope0.painel
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 14:53:19 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/painel.scala.html
                  HASH: f40700d5713d5c1d6115a2fd511b97208e8100ed
                  MATRIX: 748->1|861->19|888->21|921->46|960->48|987->49|1099->135|1114->142|1144->152|1503->484|1519->491|1563->514|1865->789|1881->796|1920->814
                  LINES: 27->1|32->1|33->2|33->2|33->2|34->3|36->5|36->5|36->5|43->12|43->12|43->12|49->18|49->18|49->18
                  -- GENERATED --
              */
          