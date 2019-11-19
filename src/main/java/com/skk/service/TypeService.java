package com.skk.service;

import com.skk.po.Type;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface TypeService {
    Type saveType(Type type);   //保存

    Type getType(Long id);   //根据id获得

    Type getTypeByName(String name);  //根据name获得

    Page<Type> listType(Pageable pageable);    //分页查询使用

    List<Type> listType();   //用于查询返回的list

    List<Type> listTypeTop(Integer size);  //前端页面显示的类型。根据个数显示几个

    Type updateType(Long id, Type type);   //修改

    void deleteType(Long id);   //删除
}
