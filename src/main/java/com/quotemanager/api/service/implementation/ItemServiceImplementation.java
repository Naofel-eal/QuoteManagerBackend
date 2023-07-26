package com.quotemanager.api.service.implementation;

import com.quotemanager.api.model.Item;
import com.quotemanager.api.repository.ItemRepository;
import com.quotemanager.api.service.ItemService;
import com.quotemanager.api.service.implementation.template.CRUDServiceImplementation;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.util.Collection;

import static java.lang.Boolean.TRUE;

@Service
@Transactional
@Slf4j
public class ItemServiceImplementation extends CRUDServiceImplementation<Item, ItemRepository> implements ItemService {
    public ItemServiceImplementation(ItemRepository itemRepository) {
        super(itemRepository);
    }
}
