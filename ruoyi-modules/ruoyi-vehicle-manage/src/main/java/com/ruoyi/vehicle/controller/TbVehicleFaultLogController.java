package com.ruoyi.vehicle.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;

import com.ruoyi.vehicle.domain.TbVehicleFaultLog;
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
import com.ruoyi.vehicle.service.ITbVehicleFaultLogService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 车辆故障报警记录Controller
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@RestController
@RequestMapping("/log")
public class TbVehicleFaultLogController extends BaseController
{
    @Autowired
    private ITbVehicleFaultLogService tbVehicleFaultLogService;

    /**
     * 查询车辆故障报警记录列表
     */
    @RequiresPermissions("system:log:list")
    @GetMapping("/list")
    public TableDataInfo list(TbVehicleFaultLog tbVehicleFaultLog)
    {
        startPage();
        List<TbVehicleFaultLog> list = tbVehicleFaultLogService.selectTbVehicleFaultLogList(tbVehicleFaultLog);
        return getDataTable(list);
    }

    /**
     * 导出车辆故障报警记录列表
     */
    @RequiresPermissions("system:log:export")
    @Log(title = "车辆故障报警记录", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbVehicleFaultLog tbVehicleFaultLog)
    {
        List<TbVehicleFaultLog> list = tbVehicleFaultLogService.selectTbVehicleFaultLogList(tbVehicleFaultLog);
        ExcelUtil<TbVehicleFaultLog> util = new ExcelUtil<TbVehicleFaultLog>(TbVehicleFaultLog.class);
        util.exportExcel(response, list, "车辆故障报警记录数据");
    }

    /**
     * 获取车辆故障报警记录详细信息
     */
    @RequiresPermissions("system:log:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tbVehicleFaultLogService.selectTbVehicleFaultLogById(id));
    }

    /**
     * 新增车辆故障报警记录
     */
    @RequiresPermissions("system:log:add")
    @Log(title = "车辆故障报警记录", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbVehicleFaultLog tbVehicleFaultLog)
    {
        return toAjax(tbVehicleFaultLogService.insertTbVehicleFaultLog(tbVehicleFaultLog));
    }

    /**
     * 修改车辆故障报警记录
     */
    @RequiresPermissions("system:log:edit")
    @Log(title = "车辆故障报警记录", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbVehicleFaultLog tbVehicleFaultLog)
    {
        return toAjax(tbVehicleFaultLogService.updateTbVehicleFaultLog(tbVehicleFaultLog));
    }

    /**
     * 删除车辆故障报警记录
     */
    @RequiresPermissions("system:log:remove")
    @Log(title = "车辆故障报警记录", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbVehicleFaultLogService.deleteTbVehicleFaultLogByIds(ids));
    }
}
