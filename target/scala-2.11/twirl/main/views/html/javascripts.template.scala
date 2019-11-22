
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object javascripts_Scope0 {
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

class javascripts extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<script type="text/javascript" src=""""),_display_(/*1.38*/routes/*1.44*/.Assets.versioned("js/scripts.js")),format.raw/*1.78*/(""""></script>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object javascripts extends javascripts_Scope0.javascripts
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 14:47:18 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/javascripts.scala.html
                  HASH: 48b38aaab6df0af6ba121cc527945da698cd1ec2
                  MATRIX: 839->0|902->37|916->43|970->77
                  LINES: 32->1|32->1|32->1|32->1
                  -- GENERATED --
              */
          