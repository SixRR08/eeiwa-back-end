package lt.sdacademy.eeiwa.models.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "calendar")
public class CalendarEntity extends AbstractEntity {

    @Column(name = "full_date", nullable = false)
    private LocalDate fullDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;

    public LocalDate getFullDate() {
        return fullDate;
    }

    public void setFullDate(LocalDate fullDate) {
        this.fullDate = fullDate;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
