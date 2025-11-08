package ecom.mlslsenarathna.model.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Payment {
    private String paymentId;
    private double amount;
    private LocalDate payDate;


}
