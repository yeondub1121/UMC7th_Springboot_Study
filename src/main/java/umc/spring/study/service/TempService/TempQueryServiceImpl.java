package umc.spring.study.service.TempService;

import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;
import umc.spring.study.apiPayload.exception.handler.TempHandler;
import umc.spring.study.apiPayload.code.status.ErrorStatus;

@Service
@RequiredArgsConstructor
public class TempQueryServiceImpl implements TempQueryService{

    @Override
    public void CheckFlag(Integer flag) {
        if (flag == 1)
            throw new TempHandler(ErrorStatus.TEMP_EXCEPTION);
    }
}
