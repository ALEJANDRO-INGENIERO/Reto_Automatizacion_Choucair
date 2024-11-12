package co.co.choucair.reto.questions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.targets.Target;

public class ValiateText implements Question<String> {
    Target element;

    public ValiateText(Target element) {
        this.element = element;
    }


    @Override
    public String answeredBy(Actor actor) {
        return element.resolveFor(actor).getText();
    }
    public static ValiateText of (Target element){
        return Instrumented.instanceOf(ValiateText.class).withProperties(element);
    }
}
