package ecom.mlslsenarathna.model.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    private String userId;
    private String userName;
    private String password;
    private  String roleName;

}
