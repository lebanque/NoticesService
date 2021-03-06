package pl.coderslab.notices_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.notices_service.model.sections.Services;

import java.util.List;
import java.util.Optional;

@Repository
public interface ServicesRepository extends JpaRepository<Services, Long> {
    Optional<Services> findById(Long id);
    List<Services> findAllByOrderByCreatedDesc();
    Services save(Services services);
    void deleteById(Long id);
}
