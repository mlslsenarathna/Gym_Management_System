package ecom.mlslsenarathna.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Member {
    private String memberId;
    private String memeberName;
    private String memeberEmail;
    private String memberAddress;
    private LocalDate dob;
    private double bmi;
    private String phoneNumber;
    private String registrationFee;
    private double subscription;



}
