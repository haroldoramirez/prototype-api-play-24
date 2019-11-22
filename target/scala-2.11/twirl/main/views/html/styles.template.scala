
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object styles_Scope0 {
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

class styles extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<link rel="stylesheet" media="screen" href=""""),_display_(/*1.46*/routes/*1.52*/.Assets.versioned("css/style.css")),format.raw/*1.86*/("""">"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object styles extends styles_Scope0.styles
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 14:47:19 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/styles.scala.html
                  HASH: 1ddf0642b3cc81927d66a4f298453ff883d209c0
                  MATRIX: 829->0|900->45|914->51|968->85
                  LINES: 32->1|32->1|32->1|32->1
                  -- GENERATED --
              */
          