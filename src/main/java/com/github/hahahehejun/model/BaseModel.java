package com.github.hahahehejun.model;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lfw
 * @Description
 * @date 2020/10/30 13:53
 */
@Data
public class BaseModel implements Serializable {

    private Long id;

    private String name;

}
