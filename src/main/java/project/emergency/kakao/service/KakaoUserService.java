package project.emergency.kakao.service;

import project.emergency.member.dto.MemberDTO;
import project.emergency.member.entitiy.Member;

public interface KakaoUserService {

    boolean register(MemberDTO dto);

    Member saveKakaoUser(Member member);

    default MemberDTO entityToDto(Member entity) {
        MemberDTO dto = MemberDTO.builder()
                .memId(entity.getMemId())
                .memPwd(entity.getMemPwd())
                .memEmail(entity.getMemEmail())
                .memName(entity.getMemName())
                .provider(entity.getProvider())
//                .memNick(entity.getMemNick())
                .memGrade(entity.getMemGrade())
                .memRole(entity.getMemRole())
                .memPoint(entity.getMemPoint())
                .regDate(entity.getRegDate())
                .modDate(entity.getModDate())
                .build();

        return dto;
    }

    default Member dtoToEntity(MemberDTO dto) {
        Member entity = Member.builder()
                .memId(dto.getMemId())
                .memPwd(dto.getMemPwd())
                .memEmail(dto.getMemEmail())
                .memName(dto.getMemName())
                .provider(dto.getProvider())
//                .memNick(dto.getMemNick())
                .memGrade(dto.getMemGrade())
                .memRole(dto.getMemRole())
                .memPoint(dto.getMemPoint())
                .build();

        return entity;
    }
}
