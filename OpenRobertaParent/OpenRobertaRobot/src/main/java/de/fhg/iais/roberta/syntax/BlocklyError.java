package de.fhg.iais.roberta.syntax;

import de.fhg.iais.roberta.util.dbc.Assert;

/**
 * This class describes the error and how it is shown to particular blockly block.
 * <p>
 * Information contained in this class is used after to recreate Blockly block from AST.<br>
 * <br>
 * To create a object from this class {@link #make(String, boolean, String, String)}
 *
 * @author avinokurov
 */
public class BlocklyError {
    private final String errorMessage;
    private final boolean pinned;
    private final String height;
    private final String width;

    private BlocklyError(String errorMessage, boolean pinned, String height, String width) {
        super();
        Assert.isTrue(!height.equals("") && !width.equals(""));
        this.errorMessage = errorMessage;
        this.pinned = pinned;
        this.height = height;
        this.width = width;
    }

    /**
     * Create object of type {@link BlocklyError}.
     *
     * @param errorMessage is the content of the error; must be non-empty string
     * @param pinned true if the error is pinned (shown) in the Blockly workspace
     * @param height of the box where the comment is shown; must be non-empty string
     * @param width of the box where the comment is shown; must be non-empty string
     * @return object describing the comment and how it is shown
     */
    public static BlocklyError make(String errorMessage, boolean pinned, String height, String width) {
        return new BlocklyError(errorMessage, pinned, height, width);
    }

    /**
     * @return content of the error
     */
    public String getError() {
        return this.errorMessage;
    }

    /**
     * @return true if the error is shown in the Blockly workspace
     */
    public boolean isPinned() {
        return this.pinned;
    }

    /**
     * @return height of the box where the error is shown
     */
    public String getHeight() {
        return this.height;
    }

    /**
     * @return width of the box where the error is shown
     */
    public String getWidth() {
        return this.width;
    }

}