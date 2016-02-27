package org.bukkit.event.inventory;

import org.bukkit.block.Block;
import org.bukkit.event.Cancellable;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.bukkit.inventory.ItemStack;

/**
 * 当一个物品被熔炼完毕时触发这个事件.
 */
public class FurnaceSmeltEvent extends BlockEvent implements Cancellable {
    
    private static final HandlerList handlers = new HandlerList();
    private final ItemStack          source;
    private ItemStack                result;
    private boolean                  cancelled;
    
    public FurnaceSmeltEvent(final Block furnace, final ItemStack source, final ItemStack result) {
        super(furnace);
        this.source = source;
        this.result = result;
        this.cancelled = false;
    }
    
    /**
     * 获取参与此事件的熔炉
     * <p>
     * 原文：Gets the block for the furnace involved in this event
     *
     * @return the block of the furnace 熔炉方块
     * @deprecated 推荐使用 {@link #getBlock()}.
     */
    @Deprecated
    public Block getFurnace() {
        return getBlock();
    }
    
    /**
     * 获取被熔炼的物品
     * <p>
     * 原文：Gets the smelted ItemStack for this event
     *
     * @return smelting source ItemStack 被熔炼的物品
     */
    public ItemStack getSource() {
        return source;
    }
    
    /**
     * 获取熔炼完毕得到的物品
     * <p>
     * 原文：Gets the resultant ItemStack for this event
     *
     * @return smelting result ItemStack 熔炼完毕得到的物品
     */
    public ItemStack getResult() {
        return result;
    }
    
    /**
     * 设置熔炼完毕得到的物品
     * <p>
     * 原文：Sets the resultant ItemStack for this event
     *
     * @param result new result ItemStack 熔炼完毕得到的物品
     */
    public void setResult(ItemStack result) {
        this.result = result;
    }
    
    public boolean isCancelled() {
        return cancelled;
    }
    
    public void setCancelled(boolean cancel) {
        this.cancelled = cancel;
    }
    
    @Override
    public HandlerList getHandlers() {
        return handlers;
    }
    
    public static HandlerList getHandlerList() {
        return handlers;
    }
}
