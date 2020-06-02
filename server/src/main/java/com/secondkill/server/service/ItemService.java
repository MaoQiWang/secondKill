package com.secondkill.server.service;

import com.secondKill.entity.ItemKill;

import java.util.List;

public interface ItemService {
    List<ItemKill> getKillItems() throws Exception;

    ItemKill getKillDetail(Integer id) throws Exception;

}
