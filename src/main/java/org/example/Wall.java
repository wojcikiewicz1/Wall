package org.example;

import java.util.List;
import java.util.Optional;

public class Wall implements Structure{
    private List<Block> blocks;


    @Override
    public Optional<Block> findBlockByColor(String color) {
        for (Block block : blocks) {
            if (block.getColor().equals(color)) {
                return Optional.of(block);
            }
        }
        return Optional.empty();
    }

    @Override
    public List<Block> findBlocksByMaterial(String material) {
        for (Block block : blocks) {
            if (block.getMaterial().equals(material)) {
                return List.of(block);
            }
        }
        return null;
    }

    @Override
    public int count() {
        return blocks.size();
    }
}
