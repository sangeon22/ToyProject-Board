package com.study.toyprojectboardspringboot.controller;

import com.study.toyprojectboardspringboot.entity.Board;
import com.study.toyprojectboardspringboot.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BoardController {

    @Autowired
    private BoardService boardService;

    @GetMapping("/board/write")
    public String boardWriteForm(){
        return "boardWrite";
    }

    @PostMapping("/board/writepro")
    public String boardWritePro(Board board){
        boardService.write(board);
        return "";
    }
}
