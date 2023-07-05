package com.ruoyi.vehicle.service.impl;

import java.util.List;
import com.ruoyi.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.vehicle.mapper.TbVehicleInfoMapper;
import com.ruoyi.vehicle.domain.TbVehicleInfo;
import com.ruoyi.vehicle.service.ITbVehicleInfoService;

/**
 * 车辆信息Service业务层处理
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@Service
public class TbVehicleInfoServiceImpl implements ITbVehicleInfoService 
{
    @Autowired
    private TbVehicleInfoMapper tbVehicleInfoMapper;

    /**
     * 查询车辆信息
     * 
     * @param id 车辆信息主键
     * @return 车辆信息
     */
    @Override
    public TbVehicleInfo selectTbVehicleInfoById(Long id)
    {
        return tbVehicleInfoMapper.selectTbVehicleInfoById(id);
    }

    /**
     * 查询车辆信息列表
     * 
     * @param tbVehicleInfo 车辆信息
     * @return 车辆信息
     */
    @Override
    public List<TbVehicleInfo> selectTbVehicleInfoList(TbVehicleInfo tbVehicleInfo)
    {
        return tbVehicleInfoMapper.selectTbVehicleInfoList(tbVehicleInfo);
    }

    /**
     * 新增车辆信息
     * 
     * @param tbVehicleInfo 车辆信息
     * @return 结果
     */
    @Override
    public int insertTbVehicleInfo(TbVehicleInfo tbVehicleInfo)
    {
        tbVehicleInfo.setCreateTime(DateUtils.getNowDate());
        return tbVehicleInfoMapper.insertTbVehicleInfo(tbVehicleInfo);
    }

    /**
     * 修改车辆信息
     * 
     * @param tbVehicleInfo 车辆信息
     * @return 结果
     */
    @Override
    public int updateTbVehicleInfo(TbVehicleInfo tbVehicleInfo)
    {
        tbVehicleInfo.setUpdateTime(DateUtils.getNowDate());
        return tbVehicleInfoMapper.updateTbVehicleInfo(tbVehicleInfo);
    }

    /**
     * 批量删除车辆信息
     * 
     * @param ids 需要删除的车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteTbVehicleInfoByIds(Long[] ids)
    {
        return tbVehicleInfoMapper.deleteTbVehicleInfoByIds(ids);
    }

    /**
     * 删除车辆信息信息
     * 
     * @param id 车辆信息主键
     * @return 结果
     */
    @Override
    public int deleteTbVehicleInfoById(Long id)
    {
        return tbVehicleInfoMapper.deleteTbVehicleInfoById(id);
    }
}
