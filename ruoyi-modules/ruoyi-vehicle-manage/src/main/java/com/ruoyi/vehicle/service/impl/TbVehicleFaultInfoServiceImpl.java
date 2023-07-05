package com.ruoyi.vehicle.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.vehicle.domain.TbVehicleFaultInfo;
import com.ruoyi.vehicle.mapper.TbVehicleFaultInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.service.ITbVehicleFaultInfoService;

/**
 * 车辆故障码Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@Service
public class TbVehicleFaultInfoServiceImpl implements ITbVehicleFaultInfoService 
{
    @Autowired
    private TbVehicleFaultInfoMapper tbVehicleFaultInfoMapper;

    /**
     * 查询车辆故障码
     * 
     * @param id 车辆故障码主键
     * @return 车辆故障码
     */
    @Override
    public TbVehicleFaultInfo selectTbVehicleFaultInfoById(Long id)
    {
        return tbVehicleFaultInfoMapper.selectTbVehicleFaultInfoById(id);
    }

    /**
     * 查询车辆故障码列表
     * 
     * @param tbVehicleFaultInfo 车辆故障码
     * @return 车辆故障码
     */
    @Override
    public List<TbVehicleFaultInfo> selectTbVehicleFaultInfoList(TbVehicleFaultInfo tbVehicleFaultInfo)
    {
        return tbVehicleFaultInfoMapper.selectTbVehicleFaultInfoList(tbVehicleFaultInfo);
    }

    /**
     * 新增车辆故障码
     * 
     * @param tbVehicleFaultInfo 车辆故障码
     * @return 结果
     */
    @Override
    public int insertTbVehicleFaultInfo(TbVehicleFaultInfo tbVehicleFaultInfo)
    {
        tbVehicleFaultInfo.setCreateTime(DateUtils.getNowDate());
        return tbVehicleFaultInfoMapper.insertTbVehicleFaultInfo(tbVehicleFaultInfo);
    }

    /**
     * 修改车辆故障码
     * 
     * @param tbVehicleFaultInfo 车辆故障码
     * @return 结果
     */
    @Override
    public int updateTbVehicleFaultInfo(TbVehicleFaultInfo tbVehicleFaultInfo)
    {
        tbVehicleFaultInfo.setUpdateTime(DateUtils.getNowDate());
        return tbVehicleFaultInfoMapper.updateTbVehicleFaultInfo(tbVehicleFaultInfo);
    }

    /**
     * 批量删除车辆故障码
     * 
     * @param ids 需要删除的车辆故障码主键
     * @return 结果
     */
    @Override
    public int deleteTbVehicleFaultInfoByIds(Long[] ids)
    {
        return tbVehicleFaultInfoMapper.deleteTbVehicleFaultInfoByIds(ids);
    }

    /**
     * 删除车辆故障码信息
     * 
     * @param id 车辆故障码主键
     * @return 结果
     */
    @Override
    public int deleteTbVehicleFaultInfoById(Long id)
    {
        return tbVehicleFaultInfoMapper.deleteTbVehicleFaultInfoById(id);
    }
}
