package com.ruoyi.vehicle.service;

import java.util.List;
import com.ruoyi.vehicle.domain.TbVehicleInfo;

/**
 * 车辆信息Service接口
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
public interface ITbVehicleInfoService 
{
    /**
     * 查询车辆信息
     * 
     * @param id 车辆信息主键
     * @return 车辆信息
     */
    public TbVehicleInfo selectTbVehicleInfoById(Long id);

    /**
     * 查询车辆信息列表
     * 
     * @param tbVehicleInfo 车辆信息
     * @return 车辆信息集合
     */
    public List<TbVehicleInfo> selectTbVehicleInfoList(TbVehicleInfo tbVehicleInfo);

    /**
     * 新增车辆信息
     * 
     * @param tbVehicleInfo 车辆信息
     * @return 结果
     */
    public int insertTbVehicleInfo(TbVehicleInfo tbVehicleInfo);

    /**
     * 修改车辆信息
     * 
     * @param tbVehicleInfo 车辆信息
     * @return 结果
     */
    public int updateTbVehicleInfo(TbVehicleInfo tbVehicleInfo);

    /**
     * 批量删除车辆信息
     * 
     * @param ids 需要删除的车辆信息主键集合
     * @return 结果
     */
    public int deleteTbVehicleInfoByIds(Long[] ids);

    /**
     * 删除车辆信息信息
     * 
     * @param id 车辆信息主键
     * @return 结果
     */
    public int deleteTbVehicleInfoById(Long id);
}
