package com.cursoFundamentoSprintboot.platzi.FundamentosSprint.Component;

import org.springframework.stereotype.Component;

@Component
public class ComponentImplement implements ComponetDependecy {

    @Override
    public void saludar() {
        System.out.println("hola mundo desde mi componente");
    }
}
