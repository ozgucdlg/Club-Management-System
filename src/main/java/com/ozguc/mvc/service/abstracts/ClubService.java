package com.ozguc.mvc.service.abstracts;

import com.ozguc.mvc.dto.ClubDto;

import java.util.List;

public interface ClubService {
    List<ClubDto> findAllClubs();
}
