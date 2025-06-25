package org.scoula.board.service;

import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.scoula.board.dto.BoardDTO;
import org.scoula.config.RootConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = RootConfig.class)
class BoardServiceImplTest {

    @Autowired
    private BoardService service;

    @Test
    @DisplayName("게시글 목록 추출")
    void getList() {
        for(BoardDTO boardDTO : service.getList()) {
            log.info(boardDTO);
        }
    }

    @Test
    void get() {
        BoardDTO boardDTO = service.get(1L);

        boardDTO.setTitle("제목 수정");
        log.info("update RESULT: " + service.update(boardDTO));
    }

    @Test
    void create() {
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}