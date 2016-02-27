package org.bukkit.block;

public interface CommandBlock extends BlockState {

    /**
     * 获取这个命令方块激活时运行的命令。这将永远不会为空，反而会返回空的字符串。
     * <p>
     * 原文：Gets the command that this CommandBlock will run when powered.
     * This will never return null.  If the CommandBlock does not have a
     * command, an empty String will be returned instead.
     *
     * @return 当激活时这个命令方块将要运行的命令
     */
    public String getCommand();

    /**
     * 设置这个命令方块激活时运行的命令。设置这个命令为null与设置这个命令为空字符串是一样的。
     * <p>
     * 原文：Sets the command that this CommandBlock will run when powered.
     * Setting the command to null is the same as setting it to an empty
     * String.
     *
     * @param command 当激活时这个命令方块将要运行的命令
     */
    public void setCommand(String command);

    /**
     * 获取这个命令方块的名字.这个名字用于命令方块执行命令。这个名字永远不会为空，默认为“@”.
     * <p>
     * 原文：Gets the name of this CommandBlock.  The name is used with commands
     * that this CommandBlock executes.  This name will never be null, and
     * by default is "@".
     *
     * @return 这个命令方块的名字
     */
    public String getName();

    /**
     * 设置这个命令方块的名字。这个名字用于命令方块执行命令。设置名字为null与设置为“@”是一样的。
     * <p>
     * 原文：Sets the name of this CommandBlock.  The name is used with commands
     * that this CommandBlock executes.  Setting the name to null is the
     * same as setting it to "@".
     *
     * @param name 这个命令方块的新名字
     */
    public void setName(String name);
}