package ecom.mlslsenarathna.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name="trainer")
public class TrainerEntity {
    @Id
    private String trainerId;
    private String trainerName;
    private String trainerAddress;
    private double salary;
    private String trainerPhoneNumber;
    private  String trainerEmail;
    private String dob;
    private int experienceYear;
    private String Qualification;

}
