package com.ruoyi.vehicle.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.vehicle.domain.TbVehicleFaultInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.log.annotation.Log;
import com.ruoyi.common.log.enums.BusinessType;
import com.ruoyi.common.security.annotation.RequiresPermissions;
import com.ruoyi.vehicle.service.ITbVehicleFaultInfoService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 车辆故障码Controller
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@RestController
@RequestMapping("/tbfinfo")
public class TbVehicleFaultInfoController extends BaseController
{
    @Autowired
    private ITbVehicleFaultInfoService tbVehicleFaultInfoService;

    /**
     * 查询车辆故障码列表
     */
    @RequiresPermissions("system:info:list")
    @GetMapping("/list")
    public TableDataInfo list(TbVehicleFaultInfo tbVehicleFaultInfo)
    {
        startPage();
        List<TbVehicleFaultInfo> list = tbVehicleFaultInfoService.selectTbVehicleFaultInfoList(tbVehicleFaultInfo);
        return getDataTable(list);
    }

    /**
     * 导出车辆故障码列表
     */
    @RequiresPermissions("system:info:export")
    @Log(title = "车辆故障码", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbVehicleFaultInfo tbVehicleFaultInfo)
    {
        List<TbVehicleFaultInfo> list = tbVehicleFaultInfoService.selectTbVehicleFaultInfoList(tbVehicleFaultInfo);
        ExcelUtil<TbVehicleFaultInfo> util = new ExcelUtil<TbVehicleFaultInfo>(TbVehicleFaultInfo.class);
        util.exportExcel(response, list, "车辆故障码数据");
    }

    /**
     * 获取车辆故障码详细信息
     */
    @RequiresPermissions("system:info:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tbVehicleFaultInfoService.selectTbVehicleFaultInfoById(id));
    }

    /**
     * 新增车辆故障码
     */
    @RequiresPermissions("system:info:add")
    @Log(title = "车辆故障码", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbVehicleFaultInfo tbVehicleFaultInfo)
    {
        return toAjax(tbVehicleFaultInfoService.insertTbVehicleFaultInfo(tbVehicleFaultInfo));
    }

    /**
     * 修改车辆故障码
     */
    @RequiresPermissions("system:info:edit")
    @Log(title = "车辆故障码", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbVehicleFaultInfo tbVehicleFaultInfo)
    {
        return toAjax(tbVehicleFaultInfoService.updateTbVehicleFaultInfo(tbVehicleFaultInfo));
    }

    /**
     * 删除车辆故障码
     */
    @RequiresPermissions("system:info:remove")
    @Log(title = "车辆故障码", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbVehicleFaultInfoService.deleteTbVehicleFaultInfoByIds(ids));
    }
}
