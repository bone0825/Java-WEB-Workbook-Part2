package org.zerock.jdbcex.domain;

import lombok.*;

import java.time.LocalDate;

@Getter //읽기 전용 getter
@Builder // 객체 생성을 위한 builder 패턴
@ToString //
@AllArgsConstructor
@NoArgsConstructor
public class TodoVO {
    private Long tno;
    private String title;
    private LocalDate dueDate;
    private boolean finished;
}
