package com.example.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.demo.domain.AdmissionAssessment;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 *  Created with IntelliJ IDEA.
 *  Description:
 *  @version 1.0
 *  @author: TheFei
 *  @Date: 2021-03-26
 *  @Time: 10:55
 * 
 */
@Mapper
@Repository
public interface AdmissionAssessmentMapper extends BaseMapper<AdmissionAssessment> {
}