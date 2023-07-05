package com.ruoyi.vehicle.service;

import java.util.List;
import com.ruoyi.vehicle.domain.TbVehicleFaultInfo;

/**
 * 车辆故障码Service接口
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
public interface ITbVehicleFaultInfoService 
{
    /**
     * 查询车辆故障码
     * 
     * @param id 车辆故障码主键
     * @return 车辆故障码
     */
    public TbVehicleFaultInfo selectTbVehicleFaultInfoById(Long id);

    /**
     * 查询车辆故障码列表
     * 
     * @param tbVehicleFaultInfo 车辆故障码
     * @return 车辆故障码集合
     */
    public List<TbVehicleFaultInfo> selectTbVehicleFaultInfoList(TbVehicleFaultInfo tbVehicleFaultInfo);

    /**
     * 新增车辆故障码
     * 
     * @param tbVehicleFaultInfo 车辆故障码
     * @return 结果
     */
    public int insertTbVehicleFaultInfo(TbVehicleFaultInfo tbVehicleFaultInfo);

    /**
     * 修改车辆故障码
     * 
     * @param tbVehicleFaultInfo 车辆故障码
     * @return 结果
     */
    public int updateTbVehicleFaultInfo(TbVehicleFaultInfo tbVehicleFaultInfo);

    /**
     * 批量删除车辆故障码
     * 
     * @param ids 需要删除的车辆故障码主键集合
     * @return 结果
     */
    public int deleteTbVehicleFaultInfoByIds(Long[] ids);

    /**
     * 删除车辆故障码信息
     * 
     * @param id 车辆故障码主键
     * @return 结果
     */
    public int deleteTbVehicleFaultInfoById(Long id);
}
