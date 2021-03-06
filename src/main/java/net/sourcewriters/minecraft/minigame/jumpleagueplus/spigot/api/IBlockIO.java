package net.sourcewriters.minecraft.minigame.jumpleagueplus.spigot.api;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.bukkit.block.Block;
import org.bukkit.block.BlockState;

import net.sourcewriters.minecraft.minigame.jumpleagueplus.spigot.api.exception.IncompatibleDataException;
import net.sourcewriters.minecraft.minigame.jumpleagueplus.spigot.api.parkour.IParkourBlock;

public interface IBlockIO {

    IParkourBlock load(Block block);

    IParkourBlock load(BlockState block);

    IParkourBlock load(DataInput input) throws IOException, IllegalArgumentException, IncompatibleDataException;

    void save(IParkourBlock block, DataOutput output) throws IOException, IllegalArgumentException, IncompatibleDataException;

}
