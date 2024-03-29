package com.sangeng.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @author QiuQingyuan
 * @version 1.0
 * @Description: TODO
 * @date 2024-01-15  16:34
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ArticleDetailVo {

    private Long id;
    //标题
    private String title;
    //文章摘要
    private String summary;
    //所属分类名
    private String categoryName;
    //所属分类Id
    private Long categoryId;
    //缩略图
    private String thumbnail;
    //文章内容
    private String content;
    //访问量
    private Long viewCount;

    private Date createTime;

}
