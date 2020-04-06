package com.harim.dao;

import java.util.List;

import com.harim.vo.MovieVO;
 
public interface MovieDAO {
    
    public List<MovieVO> selectMovie() throws Exception;
}
