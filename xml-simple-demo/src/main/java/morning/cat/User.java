package morning.cat;

import lombok.*;

import java.io.Serializable;

@Data
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {

    private String userNo;

    private Long x;

    private Long y;

}
