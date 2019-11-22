package models;

import play.libs.mailer.Email;

public class EmailDeCadastro extends Email {

    private static final String REMETENTE = "Play <no-reply@play.com.br>";
    private static final String ASSUNTO = "Confirmação de cadastro no play_api";
    private static final String CORPO_FORMAT = "Olá %s! Por favor click no link a seguir para confirmar seu cadastro. <a href='%s'>Confirmar cadastro!</a>";

    public EmailDeCadastro(TokenDeCadastro token) {
        Usuario usuario = token.getUsuario();
        this.setFrom(REMETENTE);
        this.setSubject(ASSUNTO);
        String destinatario = String.format("%s <%s>", usuario.getNome(), usuario.getEmail());
        this.addTo(destinatario);
        String link = String.format("http://localhost:9000/usuario/confirma/%s/%s", usuario.getEmail(), token.getCodigo());
        String corpo = String.format(CORPO_FORMAT, usuario.getNome(), link);
        this.setBodyHtml(corpo);
    }
}
