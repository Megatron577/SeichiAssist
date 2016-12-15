package com.github.unchama.seichiassist;

import java.util.List;

import org.bukkit.Material;

public class MineStackObj {

	private String objname;
	private String japanesename;
	private int level;
	private Material material;
	private int durability;
	private boolean nameloreflag;
	private int gachatype;
	private List<String> lore;

	public MineStackObj(String objname, String japanesename,
			int level, Material material, int durability,
			boolean nameloreflag, int gachatype){
		this.objname = objname;
		this.japanesename = japanesename;
		this.level = level;
		this.material = material;
		this.durability = durability;
		this.nameloreflag = nameloreflag;
		this.gachatype = gachatype;
		this.lore = null;
	}

	public MineStackObj(String objname, String japanesename,
			int level, Material material, int durability,
			boolean nameloreflag, int gachatype, List<String> lore){
		this.objname = objname;
		this.japanesename = japanesename;
		this.level = level;
		this.material = material;
		this.durability = durability;
		this.nameloreflag = nameloreflag;
		this.gachatype = gachatype;
		this.lore = lore;
	}

	public String getMineStackObjName(){
		return objname;
	}
	public String getJapaneseName(){
		return japanesename;
	}
	public int getLevel(){
		return level;
	}
	public Material getMaterial(){
		return material;
	}
	public int getDurability(){
		return durability;
	}
	public boolean getNameloreflag(){
		return nameloreflag;
	}
	public int getGachatype(){
		return gachatype;
	}

	public List<String> getLore(){
		return lore;
	}




}