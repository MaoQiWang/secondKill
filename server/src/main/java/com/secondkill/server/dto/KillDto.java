package com.secondkill.server.dto;/**
 * Created by Administrator on 2019/6/17.
 */

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.ToString;

import java.io.Serializable;

/**
 * @Author:debug (SteadyJack)
 * @Date: 2019/6/17 22:18
 **/
@Data
@ToString
public class KillDto implements Serializable{

    @NotNull
    private Integer killId;

    private Integer userId;
}