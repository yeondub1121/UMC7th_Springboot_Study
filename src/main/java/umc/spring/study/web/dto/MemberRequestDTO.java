package umc.spring.study.web.dto;

import lombok.Getter;
import java.util.List;

public class MemberRequestDTO {

    @Getter
    public static class JoinDto {
        private String name;
        private Integer gender;
        private Integer birthYear;
        private Integer birthMonth;
        private Integer birthDay;
        private Integer age;
        private String address;
        private String specAddress;
        private List<Long> preferCategory;
    }
}
