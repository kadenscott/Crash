package dev.kscott.casino.game;

import dev.kscott.casino.game.crash.CrashGame;

/**
 * The GameType enum.
 */
public enum GameType {
    /**
     * The GameType for {@link CoinflipGame}.
     */
    COINFLIP,
    /**
     * The GameType for {@link CrashGame}.
     */
    CRASH,
    /**
     * The GameType for {@link RouletteGame}.
     */
    ROULETTE,
    /**
     * The GameType for all other games.
     */
    OTHER
}
