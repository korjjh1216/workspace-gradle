package com.example.demo.bbs.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.bbs.domain.Board;

public interface BoardService {
    public Optional<Board> findOne(Board board);
    public List<Board> findAll();
    public Optional<Board> findById(long id);
    public List<Board> findAllById(Iterable<Board> ids);


    public long count();
    
    public void deleteById(long id);
    

    public Board getOne(long id);

    public boolean existsById(long id);

    public void flush();

    public List<Board> saveAll(Iterable<Board> entities);
    public Board saveAndFlush(Board entity);
    public Board save(Board entity);
}
