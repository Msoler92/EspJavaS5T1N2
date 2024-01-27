package cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.services;

import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.dto.FlowerDTO;
import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerService {
    @Autowired
    FlowerRepository repo;

    public FlowerDTO save (FlowerDTO dto) {
        return null;
    }

    public FlowerDTO findById (Integer id) {
        return null;
    }

    public List<FlowerDTO> findAll() {
        return null;
    }

    public FlowerDTO update (Integer id, FlowerDTO dto) {
        return null;
    }

    public void deleteById(Integer id) {

    }
}
