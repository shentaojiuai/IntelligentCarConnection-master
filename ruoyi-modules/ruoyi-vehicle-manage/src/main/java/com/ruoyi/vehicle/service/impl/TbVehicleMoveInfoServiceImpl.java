package com.ruoyi.vehicle.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import com.ruoyi.vehicle.domain.TbVehicleMoveInfo;
import com.ruoyi.vehicle.mapper.TbVehicleMoveInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.service.ITbVehicleMoveInfoService;

/**
 * 车辆监控Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@Service
public class TbVehicleMoveInfoServiceImpl implements ITbVehicleMoveInfoService 
{
    @Autowired
    private TbVehicleMoveInfoMapper tbVehicleMoveInfoMapper;

    /**
     * 查询车辆监控
     * 
     * @param id 车辆监控主键
     * @return 车辆监控
     */
    @Override
    public TbVehicleMoveInfo selectTbVehicleMoveInfoById(Long id)
    {
        return tbVehicleMoveInfoMapper.selectTbVehicleMoveInfoById(id);
    }

    /**
     * 查询车辆监控列表
     * 
     * @param tbVehicleMoveInfo 车辆监控
     * @return 车辆监控
     */
    @Override
    public List<TbVehicleMoveInfo> selectTbVehicleMoveInfoList(TbVehicleMoveInfo tbVehicleMoveInfo)
    {
        return tbVehicleMoveInfoMapper.selectTbVehicleMoveInfoList(tbVehicleMoveInfo);
    }

    /**
     * 新增车辆监控
     * 
     * @param tbVehicleMoveInfo 车辆监控
     * @return 结果
     */
    @Override
    public int insertTbVehicleMoveInfo(TbVehicleMoveInfo tbVehicleMoveInfo)
    {
        tbVehicleMoveInfo.setCreateTime(DateUtils.getNowDate());
        return tbVehicleMoveInfoMapper.insertTbVehicleMoveInfo(tbVehicleMoveInfo);
    }

    /**
     * 修改车辆监控
     * 
     * @param tbVehicleMoveInfo 车辆监控
     * @return 结果
     */
    @Override
    public int updateTbVehicleMoveInfo(TbVehicleMoveInfo tbVehicleMoveInfo)
    {
        tbVehicleMoveInfo.setUpdateTime(DateUtils.getNowDate());
        return tbVehicleMoveInfoMapper.updateTbVehicleMoveInfo(tbVehicleMoveInfo);
    }

    /**
     * 批量删除车辆监控
     * 
     * @param ids 需要删除的车辆监控主键
     * @return 结果
     */
    @Override
    public int deleteTbVehicleMoveInfoByIds(Long[] ids)
    {
        return tbVehicleMoveInfoMapper.deleteTbVehicleMoveInfoByIds(ids);
    }

    /**
     * 删除车辆监控信息
     * 
     * @param id 车辆监控主键
     * @return 结果
     */
    @Override
    public int deleteTbVehicleMoveInfoById(Long id)
    {
        return tbVehicleMoveInfoMapper.deleteTbVehicleMoveInfoById(id);
    }
}
