/*
 *
 * MDM-Lab: Open Source Android MDM Software
 * https://laborato.org
 *
*
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.hmdm.plugins.devicelog.rest.json;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>A DTO carrying the parameters for filtering the lists of device log record objects.</p>
 *
 * @author isv
 */
@ApiModel(description = "The parameters for filtering the lists of device log record objects")
@JsonIgnoreProperties(ignoreUnknown = true)
public class DeviceLogFilter implements Serializable {

    private static final long serialVersionUID = -2102574525702596048L;

    /**
     * <p>A number of records per single page of data to be retrieved.</p>
     */
    @ApiModelProperty("A number of records per single page of data to be retrieved")
    private int pageSize = 50;

    /**
     * <p>A number of page of data to be retrieved.</p>
     */
    @ApiModelProperty("A number of page of data to be retrieved (1-based)")
    private int pageNum = 1;

    /**
     * <p>A filter used for filtering the data records by device.</p>
     */
    @ApiModelProperty("A filter used for filtering the data records by device")
    private String deviceFilter;

    /**
     * <p>A filter used for filtering the data records by device.</p>
     */
    @ApiModelProperty("A filter used for filtering the data records by message")
    private String messageFilter;

    /**
     * <p>A timestamp for <code>FROM</code> boundary for filtering the data records by dates.</p>
     */
    @ApiModelProperty("A timestamp for FROM boundary for filtering the data records by dates")
    private Date dateFrom;

    /**
     * <p>A timestamp for <code>TO</code> boundary for filtering the data records by dates.</p>
     */
    @ApiModelProperty("A timestamp for TO boundary for filtering the data records by dates")
    private Date dateTo;

    /**
     * <p>An ID of an application for filtering the data records by application.</p>
     */
    @ApiModelProperty("A package ID of an application for filtering the data records by application")
    private String applicationFilter;

    /**
     * <p>A severity for filtering the data records.</p>
     */
    @ApiModelProperty("A severity for filtering the data records")
    private Integer severity;

    /**
     * <p>A name of sorting column.</p>
     */
    @ApiModelProperty("A name of sorting column")
    private String sortValue = "createTime";

    /**
     * <p>An ID of a customer.</p>
     */
    @ApiModelProperty(hidden = true)
    private int customerId;

    /**
     * <p>An ID of a user.</p>
     */
    @ApiModelProperty(hidden = true)
    private int userId;

    /**
     * <p>A flag indicating if data must be exported.</p>
     */
    @ApiModelProperty(hidden = true)
    private boolean export = false;

    /**
     * <p>Constructs new <code>DeviceLogFilter</code> instance. This implementation does nothing.</p>
     */
    public DeviceLogFilter() {
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public Date getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(Date dateFrom) {
        this.dateFrom = dateFrom;
    }

    public Date getDateTo() {
        return dateTo;
    }

    public void setDateTo(Date dateTo) {
        this.dateTo = dateTo;
    }


    public String getSortValue() {
        return sortValue;
    }

    public void setSortValue(String sortValue) {
        this.sortValue = sortValue;
    }

    public String getDeviceFilter() {
        return deviceFilter;
    }

    public void setDeviceFilter(String deviceFilter) {
        this.deviceFilter = deviceFilter;
    }

    public String getMessageFilter() {
        return messageFilter;
    }

    public void setMessageFilter(String messageFilter) {
        this.messageFilter = messageFilter;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getApplicationFilter() {
        return applicationFilter;
    }

    public void setApplicationFilter(String applicationFilter) {
        this.applicationFilter = applicationFilter;
    }

    public Integer getSeverity() {
        return severity;
    }

    public void setSeverity(Integer severity) {
        this.severity = severity;
    }

    public long getDateFromMillis() {
        if (dateFrom != null) {
            return dateFrom.getTime();
        } else {
            return 0;
        }
    }

    public long getDateToMillis() {
        if (dateTo != null) {
            return dateTo.getTime();
        } else {
            return 0;
        }
    }

    public boolean isExport() {
        return export;
    }

    public void setExport(boolean export) {
        this.export = export;
    }

    @Override
    public String toString() {
        return "DeviceLogFilter{" +
                "pageSize=" + pageSize +
                ", pageNum=" + pageNum +
                ", deviceFilter='" + deviceFilter + '\'' +
                ", messageFilter='" + messageFilter + '\'' +
                ", dateFrom=" + dateFrom +
                ", dateTo=" + dateTo +
                ", applicationFilter=" + applicationFilter +
                ", severity='" + severity + '\'' +
                ", sortValue='" + sortValue + '\'' +
                ", customerId=" + customerId +
                ", userId=" + userId +
                ", export=" + export +
                '}';
    }
}
