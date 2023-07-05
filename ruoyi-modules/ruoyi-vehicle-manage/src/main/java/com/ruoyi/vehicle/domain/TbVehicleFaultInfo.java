package com.ruoyi.vehicle.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车辆故障码对象 tb_vehicle_fault_info
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
public class TbVehicleFaultInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 故障类型 */
    @Excel(name = "故障类型")
    private String faultType;

    /** 故障组 */
    @Excel(name = "故障组")
    private String faultGroup;

    /** 故障位 */
    @Excel(name = "故障位")
    private String faultSite;

    /** 故障值 */
    @Excel(name = "故障值")
    private String faultValue;

    /** 故障标签 */
    @Excel(name = "故障标签")
    private String faultLabel;

    /** 故障码 */
    @Excel(name = "故障码")
    private String faultCoed;

    /** 是否警告 0未警报 1警报 */
    @Excel(name = "是否警告 0未警报 1警报")
    private Long isWarn;

    /** 删除标识;0:未删除;1:删除 */
    private Long delFlag;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setFaultType(String faultType) 
    {
        this.faultType = faultType;
    }

    public String getFaultType() 
    {
        return faultType;
    }
    public void setFaultGroup(String faultGroup) 
    {
        this.faultGroup = faultGroup;
    }

    public String getFaultGroup() 
    {
        return faultGroup;
    }
    public void setFaultSite(String faultSite) 
    {
        this.faultSite = faultSite;
    }

    public String getFaultSite() 
    {
        return faultSite;
    }
    public void setFaultValue(String faultValue) 
    {
        this.faultValue = faultValue;
    }

    public String getFaultValue() 
    {
        return faultValue;
    }
    public void setFaultLabel(String faultLabel) 
    {
        this.faultLabel = faultLabel;
    }

    public String getFaultLabel() 
    {
        return faultLabel;
    }
    public void setFaultCoed(String faultCoed) 
    {
        this.faultCoed = faultCoed;
    }

    public String getFaultCoed() 
    {
        return faultCoed;
    }
    public void setIsWarn(Long isWarn) 
    {
        this.isWarn = isWarn;
    }

    public Long getIsWarn() 
    {
        return isWarn;
    }
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("faultType", getFaultType())
            .append("faultGroup", getFaultGroup())
            .append("faultSite", getFaultSite())
            .append("faultValue", getFaultValue())
            .append("faultLabel", getFaultLabel())
            .append("faultCoed", getFaultCoed())
            .append("isWarn", getIsWarn())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
