package cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.services;

import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.domain.FlowerEntity;
import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.dto.FlowerDTO;
import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.exceptions.IdNotFoundException;
import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.repository.FlowerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class FlowerService {
    @Autowired
    FlowerRepository repo;

    public FlowerDTO saveOrUpdate (FlowerDTO dto) {
        return FlowerDTO.fromEntity(
                repo.save(FlowerDTO.toEntity(dto))
        );
    }

    public FlowerDTO findById (Integer id) {
        Optional<FlowerEntity> returnEntity = repo.findById(id);
        if (returnEntity.isEmpty()) {
            throw new IdNotFoundException("Could not find entity with id " + id);
        }
        return FlowerDTO.fromEntity(returnEntity.get());
    }

    public List<FlowerDTO> findAll() {
        return repo.findAll().stream().map(FlowerDTO::fromEntity).collect(Collectors.toList());
    }

    public void deleteById(Integer id) {
        repo.findById(id); //Throw exception if not found

        repo.deleteById(id);
    }
}
