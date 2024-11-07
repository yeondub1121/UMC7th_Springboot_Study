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

    @ManyToOne(fetch = FetchType.LAZY) // Store와 ManyToOne 관계 설정
    @JoinColumn(name = "store_id")  // 외래 키 매핑
    private Store store;

    @ManyToOne(fetch = FetchType.LAZY) // Member와 ManyToOne 관계 설정
    @JoinColumn(name = "member_id")  // 외래 키 매핑
    private Member member;
}
