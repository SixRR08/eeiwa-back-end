package lt.sdacademy.eeiwa.models.dto;

import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class DayOff {

    private Long id;

    @NotNull
    private Long userId;

    @NotNull
    private LocalDate date;

    public DayOff(Long id, @NotNull Long userId, @NotNull LocalDate date) {
        this.id = id;
        this.userId = userId;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
}
