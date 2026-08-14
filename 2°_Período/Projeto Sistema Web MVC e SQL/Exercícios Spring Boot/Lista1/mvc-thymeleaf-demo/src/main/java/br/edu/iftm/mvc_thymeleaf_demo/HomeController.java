package br.edu.iftm.mvc_thymeleaf_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
  @GetMapping("/")
  public String home(Model model) {
    model.addAttribute("mensagem", "Olá, Spring + Thymeleaf!");
    return "index"; // templates/index.html
  }
  @GetMapping("/verproduto")
public String exibirProduto(Model modelo) {
    Produto produto = new Produto("Notebook", 5000.99);
    modelo.addAttribute("prod", produto);
    return "exibeproduto";
}
@GetMapping("/sorteio")
public String sorteio() {
    return "sorteio"; // templates/sorteio.html
}
@GetMapping("/sortear")
@ResponseBody
public List<Integer> sortear() {
    List<Integer> numeros = new ArrayList<>();
    Random random = new Random();
    for (int i = 0; i < 6; i++) {
        numeros.add(random.nextInt(60) + 1); // 1 a 60
    }
    return numeros;
}
}