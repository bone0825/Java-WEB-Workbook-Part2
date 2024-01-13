package org.zerock.jdbcex.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data // getter setter to string equals hash code
@NoArgsConstructor //파라미터가 없는 생성자
@AllArgsConstructor // 모든 필드값이 필요한 생성자
public class TodoDTO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}
