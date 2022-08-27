package com.cursoFundamentoSprintboot.platzi.FundamentosSprint.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TextController {
    @RequestMapping
    @ResponseBody
    public ResponseEntity<String> funtion()
    {
        return new ResponseEntity<>("hello from controles", HttpStatus.OK);
    }
}
