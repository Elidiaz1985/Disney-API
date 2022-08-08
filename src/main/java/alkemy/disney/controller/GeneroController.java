package alkemy.disney.controller;


import alkemy.disney.dto.GeneroDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("genero")
public class GeneroController {
    @PostMapping()
    public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero) {
        return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
    }

}
