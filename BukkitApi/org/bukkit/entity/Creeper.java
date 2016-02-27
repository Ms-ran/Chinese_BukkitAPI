package org.bukkit.entity;

/**
 * 代表爬行者.
 */
public interface Creeper extends Monster {

    /**
     * 检查这个爬行者是否为高压的(触电)
     * <p>
     * 原文:
     * Checks if this Creeper is powered (Electrocuted)
     *
     * @return true if 如果爬行者是高压的则为true
     */
    public boolean isPowered();

    /**
     * 设置这个爬行者为高压状态.
     * <p>
     * 原文:
     * Sets the Powered status of this Creeper
     *
     * @param value 新的高压状态
     */
    public void setPowered(boolean value);
}