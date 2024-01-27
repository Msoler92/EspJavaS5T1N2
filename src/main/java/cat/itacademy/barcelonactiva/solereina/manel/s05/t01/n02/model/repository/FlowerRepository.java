package cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.repository;

import cat.itacademy.barcelonactiva.solereina.manel.s05.t01.n02.model.domain.FlowerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlowerRepository extends JpaRepository<FlowerEntity, Integer> {
}
