package com.test.diff.services.vo;
 
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

/**
 * @author wl
 */
@Getter
@Setter
@NoArgsConstructor
public class ProjectVo {

 
    /**
     * 项目id
     */
    private long id;

    private int collectStatus;

    private int reportStatus;
//    /**
//     *  收集状态枚举
//     */
//    private CollectStatusEnum collectStatusEnum;
//
//    /**
//     * 报告状态枚举
//     */
//    private ReportStatusEnum reportStatusEnum;

    private String env;

    private int repoId;

    private String projectGroup;

    private String projectName;

    private String projectUrl;

    private boolean isDisable;

    private boolean isDelete;

    private Date addTime;

    private Date lastTime;
}
