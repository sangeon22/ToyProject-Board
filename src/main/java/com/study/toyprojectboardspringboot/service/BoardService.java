package com.study.toyprojectboardspringboot.service;

import com.study.toyprojectboardspringboot.entity.Board;
import com.study.toyprojectboardspringboot.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {

    @Autowired
    private BoardRepository boardRepository;

    public void write(Board board){
        boardRepository.save(board);
    }
}
