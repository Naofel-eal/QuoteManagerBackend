package com.quotemanager.api.infrastructure.out.database.adapter;

import com.quotemanager.api.application.repository.ItemRepository;
import com.quotemanager.api.domain.model.Item;
import com.quotemanager.api.infrastructure.out.database.adapter.template.CRUDRepositoryAdapter;
import com.quotemanager.api.infrastructure.out.database.model.ItemDBO;
import com.quotemanager.api.infrastructure.out.database.repository.ItemDatabaseRepository;
import com.quotemanager.api.infrastructure.out.mapper.OUT_ItemMapper;
import org.springframework.stereotype.Service;

@Service
public class ItemRepositoryAdapter extends CRUDRepositoryAdapter<Item, ItemDBO, Long, ItemDatabaseRepository, OUT_ItemMapper> implements ItemRepository {
    public ItemRepositoryAdapter(ItemDatabaseRepository itemDatabaseRepository, OUT_ItemMapper itemMapper) {
        super(itemDatabaseRepository, itemMapper);
    }
}
