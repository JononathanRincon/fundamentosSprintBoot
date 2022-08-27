package com.cursoFundamentoSprintboot.platzi.FundamentosSprint.Component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwoImplement extends ComponentImplement {
    @Override
    public void saludar() {
        System.out.println("desde mi componente 2");
    }
}
