package ecom.mlslsenarathna.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Trainer {
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
