package io.tarantool.driver.protocol.operations;

import io.tarantool.driver.mappers.MessagePackObjectMapper;
import org.msgpack.value.Value;

import java.util.Arrays;

/**
 * Represent splice operation on tuple field
 *
 * @author Sergey Volgin
 */
public class TupleSpliceOperation extends TupleUpdateOperation {

    private final int position;
    private final int offset;

    public TupleSpliceOperation(int fieldIndex, int position, int offset, String value) {
        super(TarantoolUpdateOperationType.SPLICE, fieldIndex, value);
        this.position = position;
        this.offset = offset;
    }

    public TupleSpliceOperation(String fieldName, int position, int offset, String value) {
        super(TarantoolUpdateOperationType.SPLICE, fieldName, value);
        this.position = position;
        this.offset = offset;
    }

    @Override
    public Value toMessagePackValue(MessagePackObjectMapper mapper) {
        return mapper.toValue(Arrays.asList(
                getOperationType().toString(), getFieldIndex(), getPosition(), getOffset(), getValue()));
    }

    public int getPosition() {
        return position;
    }

    public int getOffset() {
        return offset;
    }
}