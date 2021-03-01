package pl.coderslab.notices_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.notices_service.model.sections.Clothing;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClothingRepository extends JpaRepository<Clothing, Long> {

    Optional<Clothing> findById(Long id);
    List<Clothing> findAllByOrderByCreatedDesc();
    Clothing save(Clothing clothing);
    void deleteById(Long id);
}
