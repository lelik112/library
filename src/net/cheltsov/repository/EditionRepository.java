package net.cheltsov.repository;

import net.cheltsov.entity.Edition;

import java.util.HashMap;
import java.util.Map;

//There can be different repository for each entities
public class EditionRepository {
    private Map<Long, Edition> editions = new HashMap<>();

    public void createEdition(Edition edition) {
        editions.put(edition.getId(), edition);
    }

    public Edition readEdition(Long id) {
        return editions.get(id);
    }

    public HashMap<Long, Edition> readEditions() {
        return new HashMap<>(editions);
    }

    public void deleteEdition(Long id) {
        editions.remove(id);
    }

}
