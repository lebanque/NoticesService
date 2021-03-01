package pl.coderslab.notices_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.notices_service.model.sections.Estates;

import java.util.List;
import java.util.Optional;

@Repository
public interface EstatesRepository extends JpaRepository<Estates, Long> {
    Optional<Estates> findById(Long id);
    List<Estates> findAllByOrderByCreatedDesc();
    Estates save(Estates estates);
    void deleteById(Long id);
}
