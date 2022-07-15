package com.REST_api.REST_api.Board;

import org.springframework.stereotype.Service;

import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

@Service
public class BoardService {
    final String BOARDPATH = System.getProperty("user.dir") + "\\src\\main\\resources\\testDir\\";

    public List<Field> getField(String boardName){
        return List.of(new Field(1,1, new String[]{"EAST"}, new String[]{"com.roborally.controller.GreenConveyorBelt"}));
    }

    public List<Player> getPlayer(String boardName){
        return List.of(new Player(1,1, "SOUTH", false, "Player1", "0xff0000ff", new String[]{null, null, null, null, "OPTION_LEFT_RIGHT", null, "LEFT", "MOVE1"}, new String[]{          "RIGHT",
                "MOVE3",
                "MOVE2",
                "U_TURN",
                "MOVE1"}));
    }

    public String getBoardAsString(String boardName){
        Path filePath = Path.of(BOARDPATH+boardName);

        try {
            String content = Files.readString(filePath);
            return content;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
