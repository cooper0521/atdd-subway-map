package subway.dto;

import lombok.Getter;
import lombok.Setter;
import subway.domain.Station;

import java.util.List;

@Getter
@Setter
public class LineResponse {
    private Long id;

    private String name;

    private String color;
}