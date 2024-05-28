package org.example.fakeapi;

import org.springframework.core.io.ClassPathResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

@RestController
public class FakeApiController {


    @GetMapping("/get-document")
    public ResponseEntity<String> getDocument() {
        Path path = Path.of("/home/ronaldo/Desktop/pmp/FakeApi/src/main/java/org/example/fakeapi/response.json");
        try {
            String content = Files.readString(path);
            return ResponseEntity.ok(content);
        }catch (IOException e){
            e.printStackTrace();
            return ResponseEntity.internalServerError().build();
        }

    }
    
}
