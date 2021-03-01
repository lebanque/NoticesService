package pl.coderslab.notices_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.coderslab.notices_service.model.specifics.Contact;


@Repository
public interface ContactRepository extends JpaRepository<Contact,Long> {

}
