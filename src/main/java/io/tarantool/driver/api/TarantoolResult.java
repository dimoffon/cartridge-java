package io.tarantool.driver.api;

import java.util.List;

/**
 * Basic interface for Tarantool operations result -- an array of tuples
 *
 * @author Alexey Kuzin
 */
public interface TarantoolResult<T> extends List<T> {
}
