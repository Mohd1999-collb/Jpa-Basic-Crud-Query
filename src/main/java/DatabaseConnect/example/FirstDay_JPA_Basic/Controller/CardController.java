package DatabaseConnect.example.FirstDay_JPA_Basic.Controller;

import DatabaseConnect.example.FirstDay_JPA_Basic.CardService;
import DatabaseConnect.example.FirstDay_JPA_Basic.LibraryCard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/card")
public class CardController {

    @Autowired
    CardService cardService;
    @PostMapping("/add-card")
    public String addCard(@RequestBody LibraryCard libraryCard){
        cardService.addCard(libraryCard);
        return "Library card added of id " + libraryCard.getId() + " is successfully";
    }
}
