package com.meetnow.meetnowbackend.api.common.dto;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Builder
@Getter
/**
 *  다양한 모델의 DTO도 ResponseDTO를 이용해 리턴할 수 있도록
 *  Generic 사용
 */
public class ResponseDto<T>{
    private String status;
    private List<T> data; // Todo를 단 하나보단 리스트로 반환하는 경우가 잦음.
}
