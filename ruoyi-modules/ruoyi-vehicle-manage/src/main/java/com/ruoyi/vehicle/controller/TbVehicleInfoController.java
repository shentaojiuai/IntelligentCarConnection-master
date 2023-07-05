package com.ruoyi.vehicle.controller;

import java.util.List;
import javax.servlet.http.HttpServletResponse;
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
import com.ruoyi.vehicle.domain.TbVehicleInfo;
import com.ruoyi.vehicle.service.ITbVehicleInfoService;
import com.ruoyi.common.core.web.controller.BaseController;
import com.ruoyi.common.core.web.domain.AjaxResult;
import com.ruoyi.common.core.utils.poi.ExcelUtil;
import com.ruoyi.common.core.web.page.TableDataInfo;

/**
 * 车辆信息Controller
 * 
 * @author ruoyi
 * @date 2023-06-30
 */
@RestController
@RequestMapping("/tbiinfo")
public class TbVehicleInfoController extends BaseController
{
    @Autowired
    private ITbVehicleInfoService tbVehicleInfoService;

    /**
     * 查询车辆信息列表
     */
    @RequiresPermissions("system:info:list")
    @GetMapping("/list")
    public TableDataInfo list(TbVehicleInfo tbVehicleInfo)
    {
        startPage();
        List<TbVehicleInfo> list = tbVehicleInfoService.selectTbVehicleInfoList(tbVehicleInfo);
        return getDataTable(list);
    }

    /**
     * 导出车辆信息列表
     */
    @RequiresPermissions("system:info:export")
    @Log(title = "车辆信息", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TbVehicleInfo tbVehicleInfo)
    {
        List<TbVehicleInfo> list = tbVehicleInfoService.selectTbVehicleInfoList(tbVehicleInfo);
        ExcelUtil<TbVehicleInfo> util = new ExcelUtil<TbVehicleInfo>(TbVehicleInfo.class);
        util.exportExcel(response, list, "车辆信息数据");
    }

    /**
     * 获取车辆信息详细信息
     */
    @RequiresPermissions("system:info:query")
    @GetMapping(value = "/{id}")
    public AjaxResult getInfo(@PathVariable("id") Long id)
    {
        return success(tbVehicleInfoService.selectTbVehicleInfoById(id));
    }

    /**
     * 新增车辆信息
     */
    @RequiresPermissions("system:info:add")
    @Log(title = "车辆信息", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TbVehicleInfo tbVehicleInfo)
    {
        return toAjax(tbVehicleInfoService.insertTbVehicleInfo(tbVehicleInfo));
    }

    /**
     * 修改车辆信息
     */
    @RequiresPermissions("system:info:edit")
    @Log(title = "车辆信息", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TbVehicleInfo tbVehicleInfo)
    {
        return toAjax(tbVehicleInfoService.updateTbVehicleInfo(tbVehicleInfo));
    }

    /**
     * 删除车辆信息
     */
    @RequiresPermissions("system:info:remove")
    @Log(title = "车辆信息", businessType = BusinessType.DELETE)
	@DeleteMapping("/{ids}")
    public AjaxResult remove(@PathVariable Long[] ids)
    {
        return toAjax(tbVehicleInfoService.deleteTbVehicleInfoByIds(ids));
    }
}
