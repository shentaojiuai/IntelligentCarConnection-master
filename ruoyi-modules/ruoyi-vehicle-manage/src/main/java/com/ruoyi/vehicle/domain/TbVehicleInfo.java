package com.ruoyi.vehicle.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.core.annotation.Excel;
import com.ruoyi.common.core.web.domain.BaseEntity;

/**
 * 车辆信息对象 tb_vehicle_info
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
public class TbVehicleInfo extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 车辆编号 */
    @Excel(name = "车辆编号")
    private String vehicleCode;

    /** 车辆VIN */
    @Excel(name = "车辆VIN")
    private String vehicleVin;

    /** 车辆类型 */
    @Excel(name = "车辆类型")
    private String vehicleType;

    /** 车辆绑定电子围栏 */
    @Excel(name = "车辆绑定电子围栏")
    private String vehicleFence;

    /** 车辆状态,0未在线,1在线,2异常,3警报 */
    @Excel(name = "车辆状态,0未在线,1在线,2异常,3警报")
    private Long vehicleStatus;

    /** 电机厂商 */
    @Excel(name = "电机厂商")
    private String vehicleMotor;

    /** 电池厂商 */
    @Excel(name = "电池厂商")
    private String vehicleBattery;

    /** 电机编号 */
    @Excel(name = "电机编号")
    private String vehicleMotorCode;

    /** 电池编号 */
    @Excel(name = "电池编号")
    private String vehicleBatteryCode;

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
    public void setVehicleCode(String vehicleCode) 
    {
        this.vehicleCode = vehicleCode;
    }

    public String getVehicleCode() 
    {
        return vehicleCode;
    }
    public void setVehicleVin(String vehicleVin) 
    {
        this.vehicleVin = vehicleVin;
    }

    public String getVehicleVin() 
    {
        return vehicleVin;
    }
    public void setVehicleType(String vehicleType) 
    {
        this.vehicleType = vehicleType;
    }

    public String getVehicleType() 
    {
        return vehicleType;
    }
    public void setVehicleFence(String vehicleFence) 
    {
        this.vehicleFence = vehicleFence;
    }

    public String getVehicleFence() 
    {
        return vehicleFence;
    }
    public void setVehicleStatus(Long vehicleStatus) 
    {
        this.vehicleStatus = vehicleStatus;
    }

    public Long getVehicleStatus() 
    {
        return vehicleStatus;
    }
    public void setVehicleMotor(String vehicleMotor) 
    {
        this.vehicleMotor = vehicleMotor;
    }

    public String getVehicleMotor() 
    {
        return vehicleMotor;
    }
    public void setVehicleBattery(String vehicleBattery) 
    {
        this.vehicleBattery = vehicleBattery;
    }

    public String getVehicleBattery() 
    {
        return vehicleBattery;
    }
    public void setVehicleMotorCode(String vehicleMotorCode) 
    {
        this.vehicleMotorCode = vehicleMotorCode;
    }

    public String getVehicleMotorCode() 
    {
        return vehicleMotorCode;
    }
    public void setVehicleBatteryCode(String vehicleBatteryCode) 
    {
        this.vehicleBatteryCode = vehicleBatteryCode;
    }

    public String getVehicleBatteryCode() 
    {
        return vehicleBatteryCode;
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
            .append("vehicleCode", getVehicleCode())
            .append("vehicleVin", getVehicleVin())
            .append("vehicleType", getVehicleType())
            .append("vehicleFence", getVehicleFence())
            .append("vehicleStatus", getVehicleStatus())
            .append("vehicleMotor", getVehicleMotor())
            .append("vehicleBattery", getVehicleBattery())
            .append("vehicleMotorCode", getVehicleMotorCode())
            .append("vehicleBatteryCode", getVehicleBatteryCode())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
