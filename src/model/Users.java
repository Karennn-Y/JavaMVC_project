package model;

import lombok.*;

import java.sql.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Users {
    private String userId;
    private String password;
    private Date birthday;
    private Date registered_date;
    private String name;
    private String nickname;
}
