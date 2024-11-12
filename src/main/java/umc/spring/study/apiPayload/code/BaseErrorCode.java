package umc.spring.study.apiPayload.code;

import umc.spring.study.apiPayload.code.ErrorReasonDTO;

public interface BaseErrorCode {

    ErrorReasonDTO getReason();

    ErrorReasonDTO getReasonHttpStatus();
}
