package lt.sdacademy.eeiwa.controllers;


import lt.sdacademy.eeiwa.models.dto.DayOff;
import lt.sdacademy.eeiwa.services.CalendarService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/calendars")
public class CalendarController {

    private final CalendarService calendarService;


    public CalendarController(CalendarService calendarService) {
        this.calendarService = calendarService;
    }

    @GetMapping
    public List<DayOff> getDaysOff() {
        return calendarService.getDaysOff();
    }

    @PostMapping
    public DayOff save(@RequestBody @Valid DayOff dayOff) {
        return calendarService.save(dayOff);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        calendarService.delete(id);

        return ResponseEntity.status(HttpStatus.OK).build();
    }
}
