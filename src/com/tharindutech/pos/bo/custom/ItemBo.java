package com.tharindutech.pos.bo.custom;

import com.tharindutech.pos.dto.ItemDto;

import java.util.ArrayList;

public interface ItemBo {

    public boolean saveItem(ItemDto dto);
    public boolean updateItem(String id);
    public boolean deleteItem(String id);
    public ArrayList<ItemDto> searchItem(String searchText);



}
