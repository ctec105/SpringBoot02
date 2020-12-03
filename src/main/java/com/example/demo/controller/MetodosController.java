package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/") // path a nivel de clase
public class MetodosController {
	
	//@RequestMapping("/metodo1") // path a nivel de método
	//@RequestMapping(value = "/metodo1", method = RequestMethod.GET) // versión larga
	@GetMapping("/metodo1") // version simplificada en las nuevas versiones de Spring Framework
    public ModelAndView metodo1() {
		// ModelAndView: devuelve tanto modelo como vista con un único valor de retorno, 
		// ideal cuando tenemos que manejar modelos
		
        ModelAndView mav = new ModelAndView();
        mav.setViewName("vista1"); // la vista asociada al método
        return mav;
    }
	
	@GetMapping("/metodo2") 
	public ModelAndView metodo2() { 
		return new ModelAndView("vista2");
	}
	
	@GetMapping("/metodo3")
	public String metodo3() {
		return "vista3";
	}
	
}
