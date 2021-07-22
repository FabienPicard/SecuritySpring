package com.wildcodeschool.myProjectWithSecurity;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    public String assemble() {
        return "Avengers...Assemble";
    }

    @GetMapping("/secret-bases")
    public List<String> secretBases() {
        List<String> schoolList;
        schoolList = Arrays.asList("Biarritz", "Bordeaux", "La Loupe", "Lille", "Lyon", "Marseille", "Nantes", "Orléans",
                "Paris", "Reims", "Saintes", "Strasbourg", "Toulouse", "Tours", "Amsterdam", "Barcelone", "Berlin",
                "Bruxelles", "Bucarest", "Lisbonne", "Londres", "Madrid"
        );
        return schoolList;
    }
}