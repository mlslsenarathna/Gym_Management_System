package ecom.mlslsenarathna.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Schedule {
    private String scheduleId;
    private LocalDate startDate;
    private LocalDate endDate;
    private  String timeDuration;
}
