package cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.services;

import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.dto.FlowerDTO;

import java.util.List;

public interface FlowerService {
    FlowerDTO saveOrUpdate (FlowerDTO dto);

    FlowerDTO findById (Integer id);

    List<FlowerDTO> findAll();

    void deleteById(Integer id);
}
