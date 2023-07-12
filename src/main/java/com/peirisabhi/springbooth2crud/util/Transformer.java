package com.peirisabhi.springbooth2crud.util;

import org.springframework.beans.BeanUtils;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 12/07/2023
 * Time: 12:17
 */
public interface Transformer {
    default <T> T toDto(Class<T> type) {
        T dto = BeanUtils.instantiateClass(type);
        BeanUtils.copyProperties(this, dto);
        return dto;
    }

    default <T> T toEntity(Class<T> type) {
        T entity = BeanUtils.instantiateClass(type);
        BeanUtils.copyProperties(this, entity);
        return entity;
    }
}
