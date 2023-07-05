package com.ruoyi.vehicle.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.vehicle.domain.TbVehicleMoveInfo;
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
import com.ruoyi.vehicle.service.ITbVehicleMoveInfoService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 车辆监控Controller
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@RestController
@RequestMapping("/tbminfo")
public class TbVehicleMoveInfoController extends BaseController
{
    @Autowired
    private ITbVehicleMoveInfoService tbVehicleMoveInfoService;

    /**
     * 查询车辆监控列表
     */
    @RequiresPermissions("system:info:list")
    @GetMapping("/list")
    public TableDataInfo list(TbVehicleMoveInfo tbVehicleMoveInfo)
    {
        startPage();
        List<TbVehicleMoveInfo> list = tbVehicleMoveInfoService.selectTbVehicleMoveInfoList(tbVehicleMoveInfo);
        return getDataTable(list);
    }

    /**
     * 导出车辆监控列表
     */
    @RequiresPermissions("system:info:export")
    @Log(title = "车辆监控", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbVehicleMoveInfo tbVehicleMoveInfo)
    {
        List<TbVehicleMoveInfo> list = tbVehicleMoveInfoService.selectTbVehicleMoveInfoList(tbVehicleMoveInfo);
        ExcelUtil<TbVehicleMoveInfo> util = new ExcelUtil<TbVehicleMoveInfo>(TbVehicleMoveInfo.class);
        util.exportExcel(response, list, "车辆监控数据");
    }

    /**
     * 获取车辆监控详细信息
     */
    @RequiresPermissions("system:info:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tbVehicleMoveInfoService.selectTbVehicleMoveInfoById(id));
    }

    /**
     * 新增车辆监控
     */
    @RequiresPermissions("system:info:add")
    @Log(title = "车辆监控", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbVehicleMoveInfo tbVehicleMoveInfo)
    {
        return toAjax(tbVehicleMoveInfoService.insertTbVehicleMoveInfo(tbVehicleMoveInfo));
    }

    /**
     * 修改车辆监控
     */
    @RequiresPermissions("system:info:edit")
    @Log(title = "车辆监控", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbVehicleMoveInfo tbVehicleMoveInfo)
    {
        return toAjax(tbVehicleMoveInfoService.updateTbVehicleMoveInfo(tbVehicleMoveInfo));
    }

    /**
     * 删除车辆监控
     */
    @RequiresPermissions("system:info:remove")
    @Log(title = "车辆监控", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbVehicleMoveInfoService.deleteTbVehicleMoveInfoByIds(ids));
    }
}
