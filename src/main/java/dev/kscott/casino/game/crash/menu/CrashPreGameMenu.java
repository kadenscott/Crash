package dev.kscott.casino.game.crash.menu;

import com.github.stefvanschie.inventoryframework.gui.type.util.Gui;
import dev.kscott.casino.game.crash.CrashGame;
import dev.kscott.casino.menu.GameMenu;
import org.bukkit.entity.Player;
import org.checkerframework.checker.nullness.qual.NonNull;

/**
 * The menu to display when {@link CrashGame} is in it's pre-game phase.
 */
public class CrashPreGameMenu extends GameMenu<CrashGame> {

    /**
     * Constructs the PreGameCrashMenu.
     *
     * @param game The {@link CrashGame} reference.
     */
    public CrashPreGameMenu(final @NonNull CrashGame game) {
        super(CrashGame.MT_PRE_GAME, game);
    }

    /**
     * Constructs the {@link CrashPreGameMenu}.
     * @param player the {@link Player} intended to view this {@link GameMenu}.
     * @return the constructed {@link GameMenu}.
     */
    @Override
    public Gui constructMenu(final @NonNull Player player) {
        return null;
    }
}