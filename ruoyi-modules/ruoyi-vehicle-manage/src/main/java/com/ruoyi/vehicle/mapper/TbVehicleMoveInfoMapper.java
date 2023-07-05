package com.ruoyi.vehicle.mapper;

import java.util.List;
import com.ruoyi.vehicle.domain.TbVehicleMoveInfo;
import org.apache.ibatis.annotations.Mapper;

/**
 * 车辆监控Mapper接口
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@Mapper
public interface TbVehicleMoveInfoMapper 
{
    /**
     * 查询车辆监控
     * 
     * @param id 车辆监控主键
     * @return 车辆监控
     */
    public TbVehicleMoveInfo selectTbVehicleMoveInfoById(Long id);

    /**
     * 查询车辆监控列表
     * 
     * @param tbVehicleMoveInfo 车辆监控
     * @return 车辆监控集合
     */
    public List<TbVehicleMoveInfo> selectTbVehicleMoveInfoList(TbVehicleMoveInfo tbVehicleMoveInfo);

    /**
     * 新增车辆监控
     * 
     * @param tbVehicleMoveInfo 车辆监控
     * @return 结果
     */
    public int insertTbVehicleMoveInfo(TbVehicleMoveInfo tbVehicleMoveInfo);

    /**
     * 修改车辆监控
     * 
     * @param tbVehicleMoveInfo 车辆监控
     * @return 结果
     */
    public int updateTbVehicleMoveInfo(TbVehicleMoveInfo tbVehicleMoveInfo);

    /**
     * 删除车辆监控
     * 
     * @param id 车辆监控主键
     * @return 结果
     */
    public int deleteTbVehicleMoveInfoById(Long id);

    /**
     * 批量删除车辆监控
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTbVehicleMoveInfoByIds(Long[] ids);
}
