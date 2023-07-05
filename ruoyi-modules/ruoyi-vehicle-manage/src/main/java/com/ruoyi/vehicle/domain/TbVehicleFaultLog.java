package com.ruoyi.vehicle.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车辆故障报警记录对象 tb_vehicle_fault_log
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
public class TbVehicleFaultLog extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 车辆ID */
    @Excel(name = "车辆ID")
    private String vehicleId;

    /** 故障码ID */
    @Excel(name = "故障码ID")
    private String vehicleFaultId;

    /** 报警状态 0不警报1警报 */
    @Excel(name = "报警状态 0不警报1警报")
    private String logStatus;

    /** 开始报警时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "开始报警时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date startTime;

    /** 结束报警时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "结束报警时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date endTime;

    /** 处理人 */
    @Excel(name = "处理人")
    private String processBy;

    /** 处理时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "处理时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date processTime;

    /** 删除标识;0:未删除;1:删除 */
    private Long delFlag;

    /** 时间戳 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "时间戳", width = 30, dateFormat = "yyyy-MM-dd")
    private Date lastTime;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setVehicleId(String vehicleId) 
    {
        this.vehicleId = vehicleId;
    }

    public String getVehicleId() 
    {
        return vehicleId;
    }
    public void setVehicleFaultId(String vehicleFaultId) 
    {
        this.vehicleFaultId = vehicleFaultId;
    }

    public String getVehicleFaultId() 
    {
        return vehicleFaultId;
    }
    public void setLogStatus(String logStatus) 
    {
        this.logStatus = logStatus;
    }

    public String getLogStatus() 
    {
        return logStatus;
    }
    public void setStartTime(Date startTime) 
    {
        this.startTime = startTime;
    }

    public Date getStartTime() 
    {
        return startTime;
    }
    public void setEndTime(Date endTime) 
    {
        this.endTime = endTime;
    }

    public Date getEndTime() 
    {
        return endTime;
    }
    public void setProcessBy(String processBy) 
    {
        this.processBy = processBy;
    }

    public String getProcessBy() 
    {
        return processBy;
    }
    public void setProcessTime(Date processTime) 
    {
        this.processTime = processTime;
    }

    public Date getProcessTime() 
    {
        return processTime;
    }
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }
    public void setLastTime(Date lastTime) 
    {
        this.lastTime = lastTime;
    }

    public Date getLastTime() 
    {
        return lastTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("vehicleId", getVehicleId())
            .append("vehicleFaultId", getVehicleFaultId())
            .append("logStatus", getLogStatus())
            .append("startTime", getStartTime())
            .append("endTime", getEndTime())
            .append("processBy", getProcessBy())
            .append("processTime", getProcessTime())
            .append("delFlag", getDelFlag())
            .append("lastTime", getLastTime())
            .toString();
    }
}
