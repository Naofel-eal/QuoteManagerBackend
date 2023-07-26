package com.quotemanager.api.service;

import com.quotemanager.api.model.Item;
import com.quotemanager.api.service.template.CRUDService;
import org.springframework.stereotype.Service;

@Service
public interface ItemService extends CRUDService<Item> {
}
