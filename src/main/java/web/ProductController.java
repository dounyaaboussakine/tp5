package web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@Controller
public class ProductController {

    @GetMapping("/produits")
    public String afficherProduits(Model model) {
        List<String> produits = Arrays.asList("Ordinateur", "Clavier", "Souris");
        model.addAttribute("produits", produits);
        return "produits"; // renvoie vers produits.jsp
    }
}
