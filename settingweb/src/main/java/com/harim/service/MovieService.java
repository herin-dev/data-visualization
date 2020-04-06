package com.harim.service;

import java.util.List;
 
import com.harim.vo.MovieVO;
 
public interface MovieService {
    
    public List<MovieVO> selectMovie() throws Exception;
}