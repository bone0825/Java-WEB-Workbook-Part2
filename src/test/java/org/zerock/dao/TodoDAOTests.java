package org.zerock.dao;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.zerock.jdbcex.dao.TodoDAO;
import org.zerock.jdbcex.domain.TodoVO;

import java.time.LocalDate;
import java.util.List;

public class TodoDAOTests {
    private TodoDAO todoDAO;

    @BeforeEach
    public void read(){
        todoDAO = new TodoDAO();
    }

    @Test
    public void tesetTime() throws Exception{
        System.out.println(todoDAO.getTime());
    }

    @Test
    public void testInsert() throws Exception{
        TodoVO todoVO = TodoVO.builder()
                .title("Sample Title")
                .dueDate(LocalDate.of(2024,1,11))
                .build();
        todoDAO.insert(todoVO);
        System.out.println("insert OK");

        // 데이터베이스에서 해당 데이터를 조회하여 검증

    }

    @Test
    public void testList() throws Exception {
        List<TodoVO> list = todoDAO.selectAll();

        list.forEach(vo -> System.out.println(vo));
    }

    @Test
    public void testSelectOne() throws Exception{
        Long tno = 1L;

        TodoVO vo = todoDAO.selectONe(tno);
        System.out.println(vo);
    }

    @Test
    public void testUpdateOne() throws Exception{
        TodoVO todoVO = TodoVO.builder()
                .tno(1L)
                .title("Update Test")
                .dueDate(LocalDate.of(2023,1,11))
                .finished(true)
                .build();
        todoDAO.updateOne(todoVO);
    }
    @Test
    public void testDeleteOne() throws Exception{
        todoDAO.deleteOne(1L);
    }
}
