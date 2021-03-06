package net.sourcewriters.minecraft.minigame.jumpleagueplus.spigot.api.event;

import org.bukkit.event.HandlerList;
import org.checkerframework.checker.nullness.qual.NonNull;

import net.sourcewriters.minecraft.minigame.jumpleagueplus.common.api.JumpGamePhase;
import net.sourcewriters.minecraft.minigame.jumpleagueplus.spigot.api.IJumpLeaguePlusSpigotApi;

public class AsyncJumpLeagueGamePhaseEvent extends JumpLeagueEvent {

    private static final HandlerList HANDLERS = new HandlerList();

    private final JumpGamePhase phase;

    public AsyncJumpLeagueGamePhaseEvent(@NonNull IJumpLeaguePlusSpigotApi api, @NonNull JumpGamePhase phase) {
        super(api, true);
        this.phase = phase;
    }

    @NonNull
    public final JumpGamePhase getGamePhase() {
        return phase;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }

}
