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
@Table(name="member")
public class MemberEntity {
    @Id
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
