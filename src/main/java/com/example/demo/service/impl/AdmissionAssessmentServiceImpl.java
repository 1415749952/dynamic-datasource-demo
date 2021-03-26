package com.example.demo.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.example.demo.mapper.AdmissionAssessmentMapper;
import com.example.demo.domain.AdmissionAssessment;
import com.example.demo.service.AdmissionAssessmentService;
/**
 *  Created with IntelliJ IDEA.
 *  Description:
 *  @version 1.0
 *  @author: TheFei
 *  @Date: 2021-03-26
 *  @Time: 10:55
 * 
 */
@Service
@DS("oracle")
public class AdmissionAssessmentServiceImpl extends ServiceImpl<AdmissionAssessmentMapper, AdmissionAssessment> implements AdmissionAssessmentService{

}
