package de.fhg.iais.roberta.syntax.action;

import de.fhg.iais.roberta.syntax.BlockType;
import de.fhg.iais.roberta.syntax.BlocklyBlockProperties;
import de.fhg.iais.roberta.syntax.BlocklyComment;
import de.fhg.iais.roberta.syntax.BlocklyError;

public abstract class MoveAction<V> extends Action<V> {
    private final String port;

    public MoveAction(String port, BlockType kind, BlocklyBlockProperties properties, BlocklyComment comment, BlocklyError error) {
        super(kind, properties, comment, error);
        this.port = port;
    }

    /**
     * @return port on which the motor is connected.
     */
    public String getUserDefinedPort() {
        return this.port;
    }

}
