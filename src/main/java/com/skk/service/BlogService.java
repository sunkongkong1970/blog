package com.skk.service;

import com.skk.po.Blog;
import com.skk.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.Map;

public interface BlogService {
    Blog getBlog(Long id);   //根据id获得Blog

    Blog getAndConvert(Long id); //获取并转换Blog为markdown文本以显示到前台

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);  //在新增博客页面，加入搜索条件查询博客

    Page<Blog> listBlog(Pageable pageable);   //返回一定分页数量的博客，用于index页面展示

    Page<Blog> listBlog(Long tagId,Pageable pageable);    //根据tagId来得到博客列表

    Page<Blog> listBlog(String query,Pageable pageable); //用于index页面全局搜索,query为标题或者博客内容，是搜索框传入的值

    List<Blog> listRecommendBlogTop(Integer size);  //index右边展示推荐的博客，给定size查询标记为推荐的博客

    Map<String,List<Blog>> archiveBlog(); //用于归档里查询某年的所有博客

    Long countBlog();  //计算博客总数

    Blog saveBlog(Blog blog);   //保存

    Blog updateBlog(Long id, Blog blog);   //更新

    void deleteBlog(long id);   //删除
}
