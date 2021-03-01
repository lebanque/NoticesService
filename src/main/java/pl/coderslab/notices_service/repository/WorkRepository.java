package pl.coderslab.notices_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.notices_service.model.sections.Work;

import java.util.List;
import java.util.Optional;

@Repository
public interface WorkRepository extends JpaRepository <Work, Long> {
    Optional<Work> findById(Long id);
    List<Work> findAllByOrderByCreatedDesc();
    Work save(Work work);
    void deleteById(Long id);
}
