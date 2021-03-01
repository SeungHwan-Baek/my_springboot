package com.keeper100.springboot.dto;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class HelloResposeDtoTest {

    @Test
    public void 롬복_기능_테스트(){
        //given
        String name = "test";
        int amount = 1000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name, amount);

        //then
        //aasertj 라는 테스트 검증 라이브러리를 사용하여 검증
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }
}
