
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
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

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">

    <title>The HTML5 Herald</title>
    <meta name="description" content="The HTML5 Herald">
    <meta name="author" content="SitePoint">

    """),_display_(/*10.6*/styles()),format.raw/*10.14*/("""

"""),format.raw/*12.1*/("""</head>

<body>
    """),_display_(/*15.6*/javascripts()),format.raw/*15.19*/("""
"""),format.raw/*16.1*/("""</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 11:37:42 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/index.scala.html
                  HASH: 514cd1bda8dea91b44a9e102fdf1296016f3f91c
                  MATRIX: 827->0|1065->212|1094->220|1123->222|1170->243|1204->256|1232->257
                  LINES: 32->1|41->10|41->10|43->12|46->15|46->15|47->16
                  -- GENERATED --
              */
          