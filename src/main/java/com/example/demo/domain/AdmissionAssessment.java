package com.example.demo.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.math.BigDecimal;
import java.util.Date;
import lombok.Data;

/**
 *  Created with IntelliJ IDEA.
 *  Description:
 *  @version 1.0
 *  @author: TheFei
 *  @Date: 2021-03-26
 *  @Time: 10:55
 * 
 */
/**
    * cda子集主表-入院评估记录子集主表(ADMISSION_ASSESSMENT)
    */
@Data
@TableName(value = "ADMISSION_ASSESSMENT")
public class AdmissionAssessment {
    /**
     * 文档编号
     */
    @TableId(value = "DOC_NO", type = IdType.INPUT)
    private String docNo;

    /**
     * 住院流水号
     */
    @TableField(value = "INPATIENT_SN")
    private String inpatientSn;

    /**
     * 住院号
     */
    @TableField(value = "INP_NO")
    private String inpNo;

    /**
     * 患者ID
     */
    @TableField(value = "PATIENT_ID")
    private String patientId;

    /**
     * 入病房方式
     */
    @TableField(value = "INTO_ROOM_WAY")
    private String intoRoomWay;

    /**
     * 主要症状
     */
    @TableField(value = "SYMPTOMPTOM")
    private String symptomptom;

    /**
     * 体重（kg）
     */
    @TableField(value = "WEIGHT")
    private BigDecimal weight;

    /**
     * 体温（℃）
     */
    @TableField(value = "TEMPERATURE")
    private BigDecimal temperature;

    /**
     * 呼吸频率（次/min)
     */
    @TableField(value = "BREATH_FREQUENCY")
    private Short breathFrequency;

    /**
     * 脉率(次/min)
     */
    @TableField(value = "SPHYGMUS")
    private Short sphygmus;

    /**
     * 收缩压(mmHg)
     */
    @TableField(value = "SYSTOLIC_PRESSURE")
    private Short systolicPressure;

    /**
     * 舒张压(mmHg)
     */
    @TableField(value = "DIASTOLIC_PRESSURE")
    private Short diastolicPressure;

    /**
     * 入院原因
     */
    @TableField(value = "INP_REASON")
    private String inpReason;

    /**
     * 入院途径代码
     */
    @TableField(value = "INP_APPROACH_CODE")
    private String inpApproachCode;

    /**
     * Apgar评分值
     */
    @TableField(value = "APGAR_GRADE")
    private Short apgarGrade;

    /**
     * 饮食情况代码
     */
    @TableField(value = "DIETARY_STATUS_CODE")
    private Short dietaryStatusCode;

    /**
     * 发育程度代码
     */
    @TableField(value = "DEVELOPMENT_DEGREE_CODE")
    private Short developmentDegreeCode;

    /**
     * 精神状态正常标志
     */
    @TableField(value = "SPIRIT_STATUS_FLAG")
    private String spiritStatusFlag;

    /**
     * 睡眠状况
     */
    @TableField(value = "SLEEP_STATUS")
    private String sleepStatus;

    /**
     * 特殊情况
     */
    @TableField(value = "SPECIAL_STATUS")
    private String specialStatus;

    /**
     * 心理状态代码
     */
    @TableField(value = "PSYCHOLOGICAL_STATUS")
    private String psychologicalStatus;

    /**
     * 营养状态代码
     */
    @TableField(value = "NUTRITION_STATUS")
    private Short nutritionStatus;

    /**
     * 自理能力代码
     */
    @TableField(value = "SELF_CARE_STATUS")
    private Short selfCareStatus;

    /**
     * 过敏史
     */
    @TableField(value = "ALLERGY_HISTORY")
    private String allergyHistory;

    /**
     * 一般健康状况标志
     */
    @TableField(value = "HEALTH_STATUS")
    private String healthStatus;

    /**
     * 疾病史（含外伤）
     */
    @TableField(value = "DISEASE_HISTORY")
    private String diseaseHistory;

    /**
     * 患者传染性标志
     */
    @TableField(value = "INFECT_FLAG")
    private String infectFlag;

    /**
     * 传染病史
     */
    @TableField(value = "INFECT_HISTORY")
    private String infectHistory;

    /**
     * 预防接种史
     */
    @TableField(value = "PREVENT_HISTORY")
    private String preventHistory;

    /**
     * 手术史
     */
    @TableField(value = "OPERATION_HISTORY")
    private String operationHistory;

    /**
     * 输血史
     */
    @TableField(value = "BLOOD_TRANSFUSION_HISTORY")
    private String bloodTransfusionHistory;

    /**
     * 家族史
     */
    @TableField(value = "FAMILY_HISTORY")
    private String familyHistory;

    /**
     * 吸烟标志
     */
    @TableField(value = "SMOKING_FLAG")
    private String smokingFlag;

    /**
     * 停止吸烟天数
     */
    @TableField(value = "STOP_SMOKING_DAY")
    private Integer stopSmokingDay;

    /**
     * 吸烟状况代码
     */
    @TableField(value = "SMOKING_STATUS")
    private Short smokingStatus;

    /**
     * 日吸烟量（支）
     */
    @TableField(value = "SMOKING_PER_DAY")
    private Short smokingPerDay;

    /**
     * 饮酒标志
     */
    @TableField(value = "DRINKING_FLAG")
    private String drinkingFlag;

    /**
     * 饮酒频率代码
     */
    @TableField(value = "DRINKING_FREQUENCY")
    private String drinkingFrequency;

    /**
     * 日饮酒量（mL)
     */
    @TableField(value = "DAILY_DRINK")
    private Short dailyDrink;

    /**
     * 通知医师标志
     */
    @TableField(value = "INFORM_DOCTOR_FLG")
    private String informDoctorFlg;

    /**
     * 通知医师日期时间
     */
    @TableField(value = "NOTIFY_PHYSICIAN_DATETIME")
    private Date notifyPhysicianDatetime;

    /**
     * 评估日期时间
     */
    @TableField(value = "ASSESSMENT_DATETIME")
    private Date assessmentDatetime;

    /**
     * 责任护士签名
     */
    @TableField(value = "NURSING_SIGN")
    private String nursingSign;

    /**
     * 接诊护士签名
     */
    @TableField(value = "RECEPTION_NURSING_SIGN")
    private String receptionNursingSign;

    /**
     * 签名日期时间
     */
    @TableField(value = "SIGN_DATETIME")
    private Date signDatetime;

    /**
     * 最后修改时间
     */
    @TableField(value = "LAST_MODIFIC_TIME")
    private Date lastModificTime;
}