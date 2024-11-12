package co.co.choucair.reto.tasks;

import co.co.choucair.reto.userinterfaces.IniciarSesion;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InicioSes {

    public static Performable onTheSite(String user, String password) {
        return Task.where("{0} ingresa sus credenciales",
                Enter.theValue(user).into(IniciarSesion.USUARIO),
                Enter.theValue(password).into(IniciarSesion.CLAVE),
                Click.on(IniciarSesion.BTN_LOGIN)
        );
    }
}

