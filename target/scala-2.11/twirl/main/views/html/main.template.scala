
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
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

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
  def apply/*7.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/usuario/*9.9*/() = {{
Http.Context.current().args.get("usuario").asInstanceOf[Usuario]
}};
Seq[Any](format.raw/*7.32*/("""

"""),format.raw/*11.2*/("""

"""),format.raw/*13.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    """),format.raw/*16.58*/("""
    """),format.raw/*17.5*/("""<title>"""),_display_(/*17.13*/title),format.raw/*17.18*/("""</title>
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*19.50*/routes/*19.56*/.Assets.versioned("bootstrap/css/bootstrap.min.css")),format.raw/*19.108*/("""">
    <link rel="stylesheet" media="screen" href=""""),_display_(/*20.50*/routes/*20.56*/.Assets.versioned("bootstrap/css/bootstrap-theme.min.css")),format.raw/*20.114*/("""">
    <link rel="shortcut icon" type="image/png" href=""""),_display_(/*21.55*/routes/*21.61*/.Assets.versioned("images/favicon.png")),format.raw/*21.100*/("""">
</head>
<body>
"""),format.raw/*25.23*/("""
"""),format.raw/*26.1*/("""<header class="navbar navbar-default">
    <div class="container" role="presentation">
        <ul class="nav navbar-nav navbar-right">
            """),_display_(/*29.14*/if(usuario() != null)/*29.35*/ {_display_(Seq[Any](format.raw/*29.37*/("""
            """),format.raw/*30.13*/("""<li><a href=""""),_display_(/*30.27*/routes/*30.33*/.UsuarioController.painel),format.raw/*30.58*/("""">Painel</a></li>
            """),_display_(/*31.14*/if(usuario().isAdmin())/*31.37*/ {_display_(Seq[Any](format.raw/*31.39*/("""
            """),format.raw/*32.13*/("""<li><a href=""""),_display_(/*32.27*/routes/*32.33*/.AdminController.usuarios()),format.raw/*32.60*/("""">Usuários</a></li>
            <li><a href=""""),_display_(/*33.27*/routes/*33.33*/.AdminController.produtos()),format.raw/*33.60*/("""">Produtos</a></li>
            """)))}),format.raw/*34.14*/("""
            """),format.raw/*35.13*/("""<li><a href=""""),_display_(/*35.27*/routes/*35.33*/.UsuarioController.fazLogout),format.raw/*35.61*/("""">Logout</a></li>
            """)))}),format.raw/*36.14*/("""
        """),format.raw/*37.9*/("""</ul>
    </div>
</header>
"""),_display_(/*40.2*/notificacoes()),format.raw/*40.16*/("""
"""),format.raw/*41.1*/("""<main class="container">
    """),_display_(/*42.6*/content),format.raw/*42.13*/("""
"""),format.raw/*43.1*/("""</main>
"""),_display_(/*44.2*/javascripts()),format.raw/*44.15*/("""
"""),format.raw/*45.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}


}

/*
* This template is called from the `index` template. This template
* handles the rendering of the page header and body tags. It takes
* two arguments, a `String` for the title of the page and an `Html`
* object to insert into the body of the page.
*/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 14:47:19 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/main.scala.html
                  HASH: cbd5cb85c5999908cdd15544853d6ceb8ed524a9
                  MATRIX: 997->255|1105->288|1119->295|1223->285|1252->369|1281->371|1353->468|1385->473|1420->481|1446->486|1604->617|1619->623|1693->675|1772->727|1787->733|1867->791|1951->848|1966->854|2027->893|2073->992|2101->993|2277->1142|2307->1163|2347->1165|2388->1178|2429->1192|2444->1198|2490->1223|2548->1254|2580->1277|2620->1279|2661->1292|2702->1306|2717->1312|2765->1339|2838->1385|2853->1391|2901->1418|2965->1451|3006->1464|3047->1478|3062->1484|3111->1512|3173->1543|3209->1552|3263->1580|3298->1594|3326->1595|3382->1625|3410->1632|3438->1633|3473->1642|3507->1655|3535->1656
                  LINES: 32->7|36->9|36->9|39->7|41->11|43->13|46->16|47->17|47->17|47->17|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|54->25|55->26|58->29|58->29|58->29|59->30|59->30|59->30|59->30|60->31|60->31|60->31|61->32|61->32|61->32|61->32|62->33|62->33|62->33|63->34|64->35|64->35|64->35|64->35|65->36|66->37|69->40|69->40|70->41|71->42|71->42|72->43|73->44|73->44|74->45
                  -- GENERATED --
              */
          