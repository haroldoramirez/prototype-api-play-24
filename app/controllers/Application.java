package controllers;

import jsmessages.JsMessages;
import jsmessages.JsMessagesFactory;
import jsmessages.japi.Helper;
import play.libs.Scala;
import play.mvc.Controller;
import play.mvc.Result;

import javax.inject.Inject;

public class Application extends Controller {

    private final JsMessages jsMessages;

    @Inject
    public Application(JsMessagesFactory jsMessagesFactory) {
        jsMessages = jsMessagesFactory.all();
    }

    /**
     * responsavel por enviar a message internacionalizada correta atraves do contexto ou seja envia todos os messages necessarias para utilizar no template do angular
     */
    public Result jsMessages() {
        return ok(jsMessages.apply(Scala.Option("window.Messages"), Helper.messagesFromCurrentHttpContext()));
    }

}
