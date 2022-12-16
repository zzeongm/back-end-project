package com.example.demo.controller;

import com.example.demo.dto.BoardDto;
import com.example.demo.service.BoardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;


@RestController
public class BoardController {
    @Autowired
    private BoardService boardService;
    @GetMapping("/")
    public List openBoardList() throws Exception{
        List<BoardDto> list = boardService.selectBoardList();

        return list;
    }
}
