package pl.coderslab.notices_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.notices_service.model.sections.Automotive;

import java.util.List;
import java.util.Optional;

@Repository
public interface AutomotiveRepository extends JpaRepository<Automotive, Long> {

    Optional<Automotive> findById(Long id);
    List<Automotive> findAllByOrderByCreatedDesc();
    Automotive save(Automotive automotive);
    void deleteById(Long id);
}
