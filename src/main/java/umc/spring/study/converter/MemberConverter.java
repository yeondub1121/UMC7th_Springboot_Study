package umc.spring.study.converter;

import umc.spring.study.domain.Member;
import umc.spring.study.domain.enums.Gender;
import umc.spring.study.domain.enums.MemberStatus;
import umc.spring.study.domain.mapping.MemberPrefer;
import umc.spring.study.web.dto.MemberResponseDTO;
import umc.spring.study.web.dto.MemberRequestDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;
import umc.spring.study.apiPayload.code.status.ErrorStatus;
import umc.spring.study.apiPayload.exception.GeneralException;

import java.time.LocalDateTime;
import java.util.ArrayList;


public class MemberConverter {

    public static MemberResponseDTO.JoinResultDTO toJoinResultDTO(Member member){
        return MemberResponseDTO.JoinResultDTO.builder()
                .memberId(member.getId())
                .createdAt(LocalDateTime.now())
                .build();
    }

    public static Member toMember(MemberRequestDTO.JoinDto request){

        Gender gender = null;

        switch (request.getGender()){
            case 1:
                gender = Gender.MALE;
                break;
            case 2:
                gender = Gender.FEMALE;
                break;
            case 3:
                gender = Gender.NONE;
                break;
        }

        Member member = Member.builder()
                .address(request.getAddress())
                .specAddress(request.getSpecAddress())
                .gender(gender)
                .name(request.getName())
                .status(MemberStatus.ACTIVE)  // 기본 상태 설정
                .memberPreferList(new ArrayList<>())
                .build();

        return member;
    }
}
