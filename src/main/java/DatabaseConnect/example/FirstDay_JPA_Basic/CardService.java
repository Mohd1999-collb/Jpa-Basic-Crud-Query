package DatabaseConnect.example.FirstDay_JPA_Basic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CardService {

    @Autowired
    CardRepository cardRepository;
    public void addCard(LibraryCard libraryCard) {
        cardRepository.save(libraryCard);
    }
}
