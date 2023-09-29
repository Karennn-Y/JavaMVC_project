package model;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Movies {
    private String movieId;
    private String movieName;
    private String runningTime;
    private String roundNumber;
    private String director;
    private String mainActor;
    private String startTime; // 상영 시작 시간
    private String endTime; // 상영 종료 시간
    private String ageLimit;
}
