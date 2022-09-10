/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ndt.service.impl;

import com.ndt.service.KhoaluanService;
import java.util.List;
import com.ndt.pojos.Khoaluan;
import com.ndt.repository.KhoaluanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author TUN
 */
@Service
public class KhoaluanServiceImpl implements KhoaluanService{
    @Autowired
    private KhoaluanRepository khoaluanRepository;

    @Override
    public List<Khoaluan> getKhoaluans() {
        return this.khoaluanRepository.getKhoaluans();
    }
}
