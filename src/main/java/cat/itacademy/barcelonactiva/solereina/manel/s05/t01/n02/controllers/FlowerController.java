package cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.controllers;

import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.dto.FlowerDTO;
import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.services.FlowerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flower")
public class FlowerController {
    @Autowired
    private FlowerService service;
    @PostMapping("/add")
    public ResponseEntity<FlowerDTO> addFlower(@RequestBody FlowerDTO dto) {
        return new ResponseEntity<>(service.saveOrUpdate(dto), HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<FlowerDTO> updateFlower(@RequestBody FlowerDTO dto) {
        return new ResponseEntity<>(service.saveOrUpdate(dto), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<FlowerDTO> deleteFlowerById(@PathVariable Integer id) {
        service.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/getOne/{id}")
    public ResponseEntity<FlowerDTO> getFlowerById(@PathVariable Integer id) {
        return new ResponseEntity<>(service.findById(id), HttpStatus.OK);
    }
    @GetMapping("/getAll")
    public ResponseEntity<List<FlowerDTO>> getAllFlowers() {
        return new ResponseEntity<>(service.findAll(), HttpStatus.OK);
    }
}
