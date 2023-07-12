package com.peirisabhi.springbooth2crud.dto;

import com.peirisabhi.springbooth2crud.util.Transformer;
import lombok.Data;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 12/07/2023
 * Time: 12:15
 */
@Data
public class UserDto implements Transformer {
    private int id;

    private String name;

    private String email;
}
