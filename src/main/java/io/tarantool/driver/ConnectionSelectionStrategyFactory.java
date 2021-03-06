package io.tarantool.driver;

import io.tarantool.driver.core.TarantoolConnection;

import java.util.Collection;

/**
 * Manages instantiation of connection selection strategies
 *
 * @see ConnectionSelectionStrategy
 * @author Alexey Kuzin
 */
public interface ConnectionSelectionStrategyFactory {
    /**
     * Take the specified collection of Tarantool server connections and instantiate a strategy
     * @param config client configuration
     * @param connections established connections
     * @return a connection selection strategy instance
     */
    ConnectionSelectionStrategy create(TarantoolClientConfig config, Collection<TarantoolConnection> connections);
}
