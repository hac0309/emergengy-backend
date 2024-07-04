package project.emergency.toilet.service;

import project.emergency.member.entitiy.Member;
import project.emergency.toilet.dto.ToiletDTO;
import project.emergency.toilet.entity.Toilet;

import java.util.List;

public interface ToiletService {

    void register(ToiletDTO dto);
    ToiletDTO getByToiletNo(String toiletNo);
    List<ToiletDTO> getListByMemRegister();
    List<ToiletDTO> getListByDisabled();
    List<ToiletDTO> getListByDiaper();
    List<ToiletDTO> getListBySeparated();


    default Toilet dtoToEntity(ToiletDTO dto) {
        Member member = Member.builder().memId(dto.getWriter()).build();
        return Toilet.builder()
                .toiletNo(dto.getToiletNo())
                .memRegister(dto.getMemRegister())
                .writer(member)
                .lat(dto.getLat())
                .log(dto.getLog())
                .toiletName(dto.getToiletName())
                .toiletAddress(dto.getToiletAddress())
                .detail(dto.getDetail())
                .disabled(dto.getDisabled())
                .diaper(dto.getDiaper())
                .separated(dto.getSeparated())
                .status(dto.getStatus())
                .build();
    }

    default  ToiletDTO entityToDto(Toilet entity) {
        return ToiletDTO.builder()
                .toiletNo(entity.getToiletNo())
                .memRegister(entity.getMemRegister())
                .writer(entity.getWriter().getMemId())
                .lat(entity.getLat())
                .log(entity.getLog())
                .toiletName(entity.getToiletName())
                .toiletAddress(entity.getToiletAddress())
                .detail(entity.getDetail())
                .disabled(entity.getDisabled())
                .diaper(entity.getDiaper())
                .separated(entity.getSeparated())
                .status(entity.getStatus())
                .build();
    }
}
