package io.anuke.mindustry.resource;

public class ItemStack implements CarryItem{
	public Item item;
	public int amount;
	
	public ItemStack(Item item, int amount){
		this.item = item;
		this.amount = amount;
	}

	public boolean equals(ItemStack other){
		return other != null && other.item == item && other.amount == amount;
	}
}
