package com.co.primeraAutomatizacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class LoginPage {

    public static final Target TXT_USERNAME = Target.the("ingresar usuario")
            .locatedBy("//input[@name='username']");

    public static final Target TXT_PASSWORD = Target.the(("Ingresar contraseña"))
            .locatedBy("//input[@name='password']");

    public static final Target BTN_LOGININ = Target.the("Clic en el boton de login")
            .locatedBy("//button[@type='submit']");

    public static final Target COMPARE = Target.the("visualizacion de texto")
            .locatedBy("//*[@id=\"app\"]//h6");
}
