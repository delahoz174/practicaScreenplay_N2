package com.co.primeraAutomatizacion.questions;

import com.co.primeraAutomatizacion.userinterfaces.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;


public class CompareLogin implements Question <String>{
    @Override
    public String answeredBy(Actor actor){
        return Text.of(LoginPage.COMPARE).viewedBy(actor).asString();
    }

    public static CompareLogin compare(){
        return new CompareLogin();
    }
}
