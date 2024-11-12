package co.co.choucair.reto.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrarCandidato {

    public static Target BTN_RECRUITMENT = Target.the("")
            .located(By.xpath("//span[contains(@class, 'oxd-text') and text()='Recruitment']"));
    public static Target BTN_ADD = Target.the("")
            .located(By.xpath("//button[text()=' Add ']"));
    public static Target FIRST_NAME = Target.the("")
            .located(By.xpath("//input[@name='firstName']"));
    public static Target MIDDLE_NAME = Target.the("")
            .located(By.xpath("//input[@name='middleName']"));
    public static Target LAST_NAME = Target.the("")
            .located(By.xpath("//input[@name='lastName']"));
    public static Target VACANCY = Target.the("")
            .located(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']"));
    public static Target EMAIL = Target.the("")
            .located(By.xpath("//input[@placeholder='Type here']"));
    public static Target CONTACT = Target.the("")
            .located(By.xpath("(//input[@placeholder='Type here'])[2]"));
    public static Target BTN_LOUDER = Target.the("")
            .located(By.cssSelector("input[type='file']"));
    public static Target KEYWORDS = Target.the("")
            .located(By.xpath("//input[@placeholder='Enter comma seperated words...']"));
    public static Target NOTES = Target.the("")
            .located(By.xpath("//textarea[@placeholder='Type here']"));
    public static Target DATA = Target.the("")
            .located(By.xpath("//input[@placeholder='yyyy-dd-mm']"));
    public static Target CONSENT_CHECKBOX = Target.the("Consent checkbox")
            .located(By.xpath("//i[@class='oxd-icon bi-check oxd-checkbox-input-icon']"));
    public static Target BTN_SAVE = Target.the("Consent checkbox")
            .located(By.xpath("//button[normalize-space()='Save']"));






}
