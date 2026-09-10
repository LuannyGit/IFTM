package com.clinica.vet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.clinica.vet.model.Pet;
import com.clinica.vet.repository.PetRepository;

@Controller // Avisa que é o balcão de atendimento web
public class PetController {

    @Autowired
    private PetRepository petRepository;

    // Quando o usuário acessar "http://localhost:8080/", cai aqui!
    @GetMapping("/")
    public String mostrarPagina(Model model) {
        // Pega todos os pets do banco e envia para a tela HTML com o nome "listaPets"
        model.addAttribute("listaPets", petRepository.buscarTodos());
        return "index"; // Retorna o arquivo index.html
    }

    // Quando o usuário clicar em "Salvar" no formulário, cai aqui!
    @PostMapping("/cadastrar")
    public String cadastrarPet(Pet pet) {
        petRepository.salvar(pet); // Salva no banco
        return "redirect:/"; // Recarrega a página inicial
    }

    // O {id} na rota indica que vamos receber um número variável na URL
    @GetMapping("/deletar/{id}")
    public String deletarPet(@PathVariable Long id) {
        // O @PathVariable pega o número lá da URL e transforma na variável 'id'
        petRepository.deletar(id); 
        return "redirect:/"; // Volta para a página inicial
    }
}