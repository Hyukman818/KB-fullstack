package org.scoula.board.service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
import org.scoula.board.domain.BoardVO;
import org.scoula.board.dto.BoardDTO;
import org.scoula.board.mapper.BoardMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Log4j2
@Service
@RequiredArgsConstructor
public class BoardServiceImpl implements BoardService {

    final private BoardMapper mapper;

    @Override
    public List<BoardDTO> getList() {
        log.info("getList.......");
        return mapper
                .getList()
                .stream()
                .map(BoardDTO::of)
                .toList();
    }

    @Override
    public BoardDTO get(Long no) {
        log.info("get......" + no);
        BoardVO vo = mapper.get(no);

        BoardDTO dto = BoardDTO.of(vo);
        return dto;
    }

    @Override
    public void create(BoardDTO boardDTO) {

    }

    @Override
    public boolean update(BoardDTO boardDTO) {
        return mapper.update(boardDTO.toVO()) == 1;
    }

    @Override
    public boolean delete(Long no) {
        return false;
    }
}
