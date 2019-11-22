package models;

import play.data.validation.Constraints;

import javax.persistence.Entity;

@Entity
public class Produto extends BaseModel {

    @Constraints.Required(message = "Campo título é obrigatório")
    private String titulo;

    @Constraints.Required(message = "Campo código é obrigatório")
    private String codigo;

    @Constraints.Required(message = "Campo tipo é obrigatório")
    private String tipo;

    private String tipo2;

    private String descricao;

    @Constraints.Required(message = "Campo preço é obrigatório")
    private Double preco;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
}
