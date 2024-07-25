package lt.sdacademy.eeiwa.converters;

import org.springframework.stereotype.Component;
import lt.sdacademy.eeiwa.repositories.CalendarRepository;

@Component
public class CalendarConverter {
    private final UserConverter userConverter;
    private final CalendarRepository calendarRepository;

    public CalendarConverter(UserConverter userConverter, CalendarRepository calendarRepository) {
        this.userConverter = userConverter;
        this.calendarRepository = calendarRepository;
    }

}
