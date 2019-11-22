
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object produtos_Scope0 {
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

class produtos extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[Produto],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(produtos: List[Produto]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*3.2*/formataEmReais/*3.16*/(preco: Double) = {{
String.format("R$%.2f", preco)
}};
Seq[Any](format.raw/*1.27*/("""

"""),format.raw/*5.2*/("""

"""),_display_(/*7.2*/main("Lista de produtos")/*7.27*/ {_display_(Seq[Any](format.raw/*7.29*/("""
"""),format.raw/*8.1*/("""<section class="panel panel-default">
    <header class="panel-heading">
        <h2 class="panel-title">Lista de produtos</h2>
    </header>
    <div class="panel-body">
        <a class="btn btn-info" href=""""),_display_(/*13.40*/routes/*13.46*/.ProdutoController.formularioDeNovoProduto),format.raw/*13.88*/("""">Criar novo produto</a>
        <table class="table table-striped">
            <thead>
            <tr>
                <td>Id</td>
                <td>Título</td>
                <td>Código</td>
                <td>Tipo</td>
                <td>Descrição</td>
                <td>Preço</td>
            </tr>
            </thead>
            <tbody>
            """),_display_(/*26.14*/for(produto <- produtos) yield /*26.38*/ {_display_(Seq[Any](format.raw/*26.40*/("""
            """),format.raw/*27.13*/("""<tr>
                <td>"""),_display_(/*28.22*/produto/*28.29*/.getId()),format.raw/*28.37*/("""</td>
                <td>"""),_display_(/*29.22*/produto/*29.29*/.getTitulo()),format.raw/*29.41*/("""</td>
                <td>"""),_display_(/*30.22*/produto/*30.29*/.getCodigo()),format.raw/*30.41*/("""</td>
                <td>"""),_display_(/*31.22*/produto/*31.29*/.getTipo()),format.raw/*31.39*/("""</td>
                <td>"""),_display_(/*32.22*/produto/*32.29*/.getDescricao()),format.raw/*32.44*/("""</td>
                <td>"""),_display_(/*33.22*/formataEmReais(produto.getPreco())),format.raw/*33.56*/("""</td>
            </tr>
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""</tbody>
        </table>
    </div>
</section>
""")))}))
      }
    }
  }

  def render(produtos:List[Produto]): play.twirl.api.HtmlFormat.Appendable = apply(produtos)

  def f:((List[Produto]) => play.twirl.api.HtmlFormat.Appendable) = (produtos) => apply(produtos)

  def ref: this.type = this

}


}

/**/
object produtos extends produtos_Scope0.produtos
              /*
                  -- GENERATED --
                  DATE: Fri Nov 22 14:47:19 BRST 2019
                  SOURCE: /home/haroldo.nobrega/projetos/prototype-api-play-24/app/views/produtos.scala.html
                  HASH: 17213a25192a380811a2b58798e11e8379ad0c85
                  MATRIX: 758->1|861->29|883->43|966->26|994->96|1022->99|1055->124|1094->126|1121->127|1358->337|1373->343|1436->385|1829->751|1869->775|1909->777|1950->790|2003->816|2019->823|2048->831|2102->858|2118->865|2151->877|2205->904|2221->911|2254->923|2308->950|2324->957|2355->967|2409->994|2425->1001|2461->1016|2515->1043|2570->1077|2638->1114|2679->1127
                  LINES: 27->1|31->3|31->3|34->1|36->5|38->7|38->7|38->7|39->8|44->13|44->13|44->13|57->26|57->26|57->26|58->27|59->28|59->28|59->28|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|63->32|63->32|64->33|64->33|66->35|67->36
                  -- GENERATED --
              */
          