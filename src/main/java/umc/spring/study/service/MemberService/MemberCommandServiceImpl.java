package umc.spring.study.service.MemberService;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import umc.spring.study.repository.MemberRepository.MemberRepository;
import umc.spring.study.web.dto.MemberRequestDTO;
import umc.spring.study.domain.Member;
import umc.spring.study.converter.MemberConverter;

@Service
@RequiredArgsConstructor
public class MemberCommandServiceImpl implements MemberCommandService{

    private final MemberRepository memberRepository;

    @Override
    public Member joinMember(MemberRequestDTO.JoinDto request) {

        Member newMember = MemberConverter.toMember(request);

        return null;
    }
}
