package com.peirisabhi.springbooth2crud.entity;

import com.peirisabhi.springbooth2crud.util.Transformer;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Created by Intellij.
 * Author: Abhishek Peiris
 * Date: 11/07/2023
 * Time: 14:51
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User implements Transformer {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;

    private String email;


}
