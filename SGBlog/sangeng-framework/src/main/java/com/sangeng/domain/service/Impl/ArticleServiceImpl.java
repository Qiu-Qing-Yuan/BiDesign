package com.sangeng.domain.service.Impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.sangeng.domain.entity.Article;
import com.sangeng.domain.mapper.ArticleMapper;
import com.sangeng.domain.service.ArticleService;
import org.springframework.stereotype.Service;

/**
 * @author QiuQingyuan
 * @version 1.0
 * @Description: TODO
 * @date 2024-01-03  20:16
 */
@Service
public class ArticleServiceImpl extends ServiceImpl<ArticleMapper, Article> implements ArticleService {

}
