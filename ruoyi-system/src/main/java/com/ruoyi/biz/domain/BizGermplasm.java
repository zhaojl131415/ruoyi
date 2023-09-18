package com.ruoyi.biz.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 种质资源对象 biz_germplasm
 * 
 * @author zhaojinliang
 * @date 2023-09-15
 */
public class BizGermplasm extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 主键 */
    private String id;

    /** 编号 */
    @Excel(name = "编号")
    private String code;

    /** 种名 */
    @Excel(name = "种名")
    private String specificName;

    /** 种拉丁名 */
    @Excel(name = "种拉丁名")
    private String latinName;

    /** 坐标 经纬度 */
    @Excel(name = "坐标 经纬度")
    private String coordinate;

    /** 经度 */
    private String longitude;

    /** 纬度 */
    private String latitude;

    /** 海拔(单位：米) */
    @Excel(name = "海拔(单位：米)")
    private String elevation;

    /** 生活型 */
    private String lifeForm;

    /** 药材名 */
    @Excel(name = "药材名")
    private String medicinalName;

    /** 采集地址 */
    private String collectionAddress;

    /** 采集时间 */
    private Date collectionTime;

    /** 种质特征 */
    @Excel(name = "种质特征")
    private String characteristics;

    /** 种质保存位置 */
    @Excel(name = "种质保存位置")
    private String preservationLocation;

    /** 种质资源植物照片 */
    private String plantPhotograph;

    /** 凭证标本 */
    private String voucherSpecimen;

    /** 删除标识 */
    private Integer delFlag;

    public void setId(String id) 
    {
        this.id = id;
    }

    public String getId() 
    {
        return id;
    }
    public void setCode(String code) 
    {
        this.code = code;
    }

    public String getCode() 
    {
        return code;
    }
    public void setSpecificName(String specificName) 
    {
        this.specificName = specificName;
    }

    public String getSpecificName() 
    {
        return specificName;
    }
    public void setLatinName(String latinName) 
    {
        this.latinName = latinName;
    }

    public String getLatinName() 
    {
        return latinName;
    }
    public void setCoordinate(String coordinate) 
    {
        this.coordinate = coordinate;
    }

    public String getCoordinate() 
    {
        return coordinate;
    }
    public void setLongitude(String longitude) 
    {
        this.longitude = longitude;
    }

    public String getLongitude() 
    {
        return longitude;
    }
    public void setLatitude(String latitude) 
    {
        this.latitude = latitude;
    }

    public String getLatitude() 
    {
        return latitude;
    }
    public void setElevation(String elevation) 
    {
        this.elevation = elevation;
    }

    public String getElevation() 
    {
        return elevation;
    }
    public void setLifeForm(String lifeForm) 
    {
        this.lifeForm = lifeForm;
    }

    public String getLifeForm() 
    {
        return lifeForm;
    }
    public void setMedicinalName(String medicinalName) 
    {
        this.medicinalName = medicinalName;
    }

    public String getMedicinalName() 
    {
        return medicinalName;
    }
    public void setCollectionAddress(String collectionAddress) 
    {
        this.collectionAddress = collectionAddress;
    }

    public String getCollectionAddress() 
    {
        return collectionAddress;
    }
    public void setCollectionTime(Date collectionTime) 
    {
        this.collectionTime = collectionTime;
    }

    public Date getCollectionTime() 
    {
        return collectionTime;
    }
    public void setCharacteristics(String characteristics) 
    {
        this.characteristics = characteristics;
    }

    public String getCharacteristics() 
    {
        return characteristics;
    }
    public void setPreservationLocation(String preservationLocation) 
    {
        this.preservationLocation = preservationLocation;
    }

    public String getPreservationLocation() 
    {
        return preservationLocation;
    }
    public void setPlantPhotograph(String plantPhotograph) 
    {
        this.plantPhotograph = plantPhotograph;
    }

    public String getPlantPhotograph() 
    {
        return plantPhotograph;
    }
    public void setVoucherSpecimen(String voucherSpecimen) 
    {
        this.voucherSpecimen = voucherSpecimen;
    }

    public String getVoucherSpecimen() 
    {
        return voucherSpecimen;
    }

    public Integer getDelFlag() 
    {
        return delFlag;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("code", getCode())
            .append("specificName", getSpecificName())
            .append("latinName", getLatinName())
            .append("coordinate", getCoordinate())
            .append("longitude", getLongitude())
            .append("latitude", getLatitude())
            .append("elevation", getElevation())
            .append("lifeForm", getLifeForm())
            .append("medicinalName", getMedicinalName())
            .append("collectionAddress", getCollectionAddress())
            .append("collectionTime", getCollectionTime())
            .append("characteristics", getCharacteristics())
            .append("preservationLocation", getPreservationLocation())
            .append("plantPhotograph", getPlantPhotograph())
            .append("voucherSpecimen", getVoucherSpecimen())
            .append("remark", getRemark())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("delFlag", getDelFlag())
            .toString();
    }
}
