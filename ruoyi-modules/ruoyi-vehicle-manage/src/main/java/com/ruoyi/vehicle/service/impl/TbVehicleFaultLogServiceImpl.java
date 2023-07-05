package com.ruoyi.vehicle.service.impl;

import java.util.List;

import com.ruoyi.vehicle.domain.TbVehicleFaultLog;
import com.ruoyi.vehicle.mapper.TbVehicleFaultLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.service.ITbVehicleFaultLogService;

/**
 * 车辆故障报警记录Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@Service
public class TbVehicleFaultLogServiceImpl implements ITbVehicleFaultLogService 
{
    @Autowired
    private TbVehicleFaultLogMapper tbVehicleFaultLogMapper;

    /**
     * 查询车辆故障报警记录
     * 
     * @param id 车辆故障报警记录主键
     * @return 车辆故障报警记录
     */
    @Override
    public TbVehicleFaultLog selectTbVehicleFaultLogById(Long id)
    {
        return tbVehicleFaultLogMapper.selectTbVehicleFaultLogById(id);
    }

    /**
     * 查询车辆故障报警记录列表
     * 
     * @param tbVehicleFaultLog 车辆故障报警记录
     * @return 车辆故障报警记录
     */
    @Override
    public List<TbVehicleFaultLog> selectTbVehicleFaultLogList(TbVehicleFaultLog tbVehicleFaultLog)
    {
        return tbVehicleFaultLogMapper.selectTbVehicleFaultLogList(tbVehicleFaultLog);
    }

    /**
     * 新增车辆故障报警记录
     * 
     * @param tbVehicleFaultLog 车辆故障报警记录
     * @return 结果
     */
    @Override
    public int insertTbVehicleFaultLog(TbVehicleFaultLog tbVehicleFaultLog)
    {
        return tbVehicleFaultLogMapper.insertTbVehicleFaultLog(tbVehicleFaultLog);
    }

    /**
     * 修改车辆故障报警记录
     * 
     * @param tbVehicleFaultLog 车辆故障报警记录
     * @return 结果
     */
    @Override
    public int updateTbVehicleFaultLog(TbVehicleFaultLog tbVehicleFaultLog)
    {
        return tbVehicleFaultLogMapper.updateTbVehicleFaultLog(tbVehicleFaultLog);
    }

    /**
     * 批量删除车辆故障报警记录
     * 
     * @param ids 需要删除的车辆故障报警记录主键
     * @return 结果
     */
    @Override
    public int deleteTbVehicleFaultLogByIds(Long[] ids)
    {
        return tbVehicleFaultLogMapper.deleteTbVehicleFaultLogByIds(ids);
    }

    /**
     * 删除车辆故障报警记录信息
     * 
     * @param id 车辆故障报警记录主键
     * @return 结果
     */
    @Override
    public int deleteTbVehicleFaultLogById(Long id)
    {
        return tbVehicleFaultLogMapper.deleteTbVehicleFaultLogById(id);
    }
}
