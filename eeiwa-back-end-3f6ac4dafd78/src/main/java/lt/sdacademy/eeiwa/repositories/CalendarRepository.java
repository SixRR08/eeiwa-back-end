package lt.sdacademy.eeiwa.repositories;

import lt.sdacademy.eeiwa.models.entities.CalendarEntity;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface CalendarRepository extends Repository<CalendarEntity, Long> {

   List<CalendarEntity> findAll();

   void deleteOneById(Long id);
}
