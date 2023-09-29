package model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Tickets {
    private String ticketId;
    private String userId;
    private String movieId;
    private String sitNumber;
    private String price;
}
