package pl.coderslab.notices_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.notices_service.model.sections.Electronics;

import java.util.List;
import java.util.Optional;

@Repository
public interface ElectronicsRepository extends JpaRepository<Electronics, Long> {

    Optional<Electronics> findById(Long id);
    List<Electronics> findAllByOrderByCreatedDesc();
    Electronics save(Electronics electronics);
    void deleteById(Long id);
}
