package pl.coderslab.notices_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.notices_service.model.specifics.Localization;

import java.util.List;

@Repository
public interface LocalizationRepository extends JpaRepository <Localization, Long> {

    List<Localization> findAll();
    Localization save (Localization localization);
    void deleteById(Long id);

}
