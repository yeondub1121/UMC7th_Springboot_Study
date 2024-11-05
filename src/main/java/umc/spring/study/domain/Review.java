package umc.spring.study.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Builder
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Float score;

    @ManyToOne
    @JoinColumn(name = "member_id") // 외래 키 컬럼 이름을 설정
    private Member member; // Member와의 관계 매핑
}
