package com.example.demo.service;

import com.example.demo.dto.BoardDto;
import com.example.demo.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {
    @Autowired
    private BoardMapper boardMapper;

    public List<BoardDto> selectBoardList() throws Exception {
        return boardMapper.selectBoardList();
    }
}