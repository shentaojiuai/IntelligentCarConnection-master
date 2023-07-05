package com.ruoyi.vehicle.mapper;

import java.util.List;
import com.ruoyi.vehicle.domain.TbVehicleFaultLog;
import org.apache.ibatis.annotations.Mapper;

/**
 * 车辆故障报警记录Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@Mapper
public interface TbVehicleFaultLogMapper 
{
    /**
     * 查询车辆故障报警记录
     * 
     * @param id 车辆故障报警记录主键
     * @return 车辆故障报警记录
     */
    public TbVehicleFaultLog selectTbVehicleFaultLogById(Long id);

    /**
     * 查询车辆故障报警记录列表
     * 
     * @param tbVehicleFaultLog 车辆故障报警记录
     * @return 车辆故障报警记录集合
     */
    public List<TbVehicleFaultLog> selectTbVehicleFaultLogList(TbVehicleFaultLog tbVehicleFaultLog);

    /**
     * 新增车辆故障报警记录
     * 
     * @param tbVehicleFaultLog 车辆故障报警记录
     * @return 结果
     */
    public int insertTbVehicleFaultLog(TbVehicleFaultLog tbVehicleFaultLog);

    /**
     * 修改车辆故障报警记录
     * 
     * @param tbVehicleFaultLog 车辆故障报警记录
     * @return 结果
     */
    public int updateTbVehicleFaultLog(TbVehicleFaultLog tbVehicleFaultLog);

    /**
     * 删除车辆故障报警记录
     * 
     * @param id 车辆故障报警记录主键
     * @return 结果
     */
    public int deleteTbVehicleFaultLogById(Long id);

    /**
     * 批量删除车辆故障报警记录
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbVehicleFaultLogByIds(Long[] ids);
}
