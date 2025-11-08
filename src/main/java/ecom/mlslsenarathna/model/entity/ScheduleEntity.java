package ecom.mlslsenarathna.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="schedule")
public class ScheduleEntity {
    @Id
    private String scheduleId;
    private LocalDate startDate;
    private LocalDate endDate;
    private  String timeDuration;
}
