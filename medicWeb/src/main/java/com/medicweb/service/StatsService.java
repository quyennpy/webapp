/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.medicweb.service;

import java.util.List;

/**
 *
 * @author QUYENNGUYEN
 */
public interface StatsService {
    List<Object[]> monthStats();
     List<Object[]> yearStats();
     List<Object[]> yearPatient();
     List<Object[]> monthPatient();
}
