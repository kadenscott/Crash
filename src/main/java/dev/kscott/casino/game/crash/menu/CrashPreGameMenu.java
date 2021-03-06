package dev.kscott.casino.game.crash.menu;

import com.github.stefvanschie.inventoryframework.gui.GuiItem;
import com.github.stefvanschie.inventoryframework.gui.type.ChestGui;
import com.github.stefvanschie.inventoryframework.gui.type.util.Gui;
import com.github.stefvanschie.inventoryframework.pane.StaticPane;
import dev.kscott.casino.game.crash.CrashGame;
import dev.kscott.casino.menu.GameMenu;
import dev.kscott.crash.utils.ItemBuilder;
import org.bukkit.Material;
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
     *
     * @param player the {@link Player} intended to view this {@link GameMenu}.
     * @return the constructed {@link GameMenu}.
     */
    @Override
    public Gui constructMenu(final @NonNull Player player) {
        final @NonNull ChestGui gui = new ChestGui(6, "Crash");

        gui.setOnGlobalClick(event -> event.setCancelled(true));

        final @NonNull StaticPane bgPane = new StaticPane(9, 6);
        bgPane.fillWith(new ItemBuilder(Material.GRAY_STAINED_GLASS_PANE).name("").build());

        final @NonNull StaticPane fgPane = new StaticPane(4, 2, 1, 1);
        fgPane.addItem(new GuiItem(new ItemBuilder(Material.RED_STAINED_GLASS_PANE)
                .name(this.game.getPreGameSecondsLeft() + "s until start")
                .build()), 0, 0);

        gui.addPane(fgPane);
        gui.addPane(bgPane);

        return gui;
    }
}
