package lt.sdacademy.eeiwa.services;

import lt.sdacademy.eeiwa.models.dto.DayOff;
import lt.sdacademy.eeiwa.models.entities.CalendarEntity;
import lt.sdacademy.eeiwa.models.entities.UserEntity;
import lt.sdacademy.eeiwa.repositories.CalendarRepository;
import lt.sdacademy.eeiwa.repositories.UserRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static java.util.stream.Collectors.toList;


@Service
public class CalendarService {

    private final UserRepository userRepository;
    private final CalendarRepository calendarRepository;

    public CalendarService(UserRepository userRepository, CalendarRepository calendarRepository) {
        this.userRepository = userRepository;
        this.calendarRepository = calendarRepository;
    }

    public DayOff save(DayOff dayOff) {
        UserEntity user = userRepository.findOneById(dayOff.getUserId());
        CalendarEntity calendar = new CalendarEntity();
        calendar.setUser(user);
        calendar.setFullDate(dayOff.getDate());
        user.getCalendars().add(calendar);
        userRepository.save(user);
        return dayOff;
    }

    public List<DayOff> getDaysOff() {
        return calendarRepository.findAll().stream().map(c -> new DayOff(c.getId(), null, c.getFullDate())).collect(toList());
    }

    @Transactional
    public void delete(Long id) {
        calendarRepository.deleteOneById(id);
    }
}
