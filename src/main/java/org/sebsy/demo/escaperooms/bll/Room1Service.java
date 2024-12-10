package org.sebsy.demo.escaperooms.bll;

import org.springframework.stereotype.Service;
import org.springframework.context.annotation.Profile;

@Service
@Profile("passage")
public class Room1Service implements RoomService {

    public String entreeSalle() {

        return "Bravo, vous avez trouvé la deuxième salle !";
    }

}