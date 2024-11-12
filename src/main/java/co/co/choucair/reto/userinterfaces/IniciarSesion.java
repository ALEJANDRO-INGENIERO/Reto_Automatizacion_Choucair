package co.co.choucair.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IniciarSesion {
    public static final Target USUARIO = Target.the("")
            .located(By.xpath("//input[@name='username']"));
    public static final Target CLAVE = Target.the("")
            .located(By.xpath("//input[@name='password']"));
    public static final Target BTN_LOGIN = Target.the("")
            .located(By.xpath("//button[contains(@class, 'orangehrm-login-button')]"));
    public static final Target TXT_VALIDA_TEXT = Target.the("")
            .located(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-breadcrumb-module' and text() = 'Dashboard']"));


}


