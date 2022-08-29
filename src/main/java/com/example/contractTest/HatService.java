package com.example.contractTest;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class HatService {
    private final Map<Long, Hat> hatMap;
    public HatService() {
        hatMap = new HashMap<>();
        hatMap.put(1L, new Hat(1L, "Sombrero", "yellow", 10L));
        hatMap.put(2L, new Hat(2L, "Beanie", "blue", 12L));
    }
    public Hat findHatById(Long id) {
        return hatMap.get(id);
    }
}
