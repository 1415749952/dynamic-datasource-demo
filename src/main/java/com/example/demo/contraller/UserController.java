package com.example.demo.contraller;

import com.example.demo.domain.AdmissionAssessment;
import com.example.demo.domain.SysUser;
import com.example.demo.service.AdmissionAssessmentService;
import com.example.demo.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 *
 * @version 1.0
 * @author: TheFei
 * @Date: 2021-03-26
 * @Time: 9:22
 */
@RestController
@RequestMapping("/user")
public class UserController
{
    @Autowired
    private SysUserService sysUserService;

    @Autowired
    private AdmissionAssessmentService admissionAssessmentService;

    @GetMapping
    public List<SysUser> test()
    {
       return sysUserService.list();
    }

    @GetMapping("/admiss")
    public List<AdmissionAssessment> getList()
    {
        return admissionAssessmentService.list();
    }
}
