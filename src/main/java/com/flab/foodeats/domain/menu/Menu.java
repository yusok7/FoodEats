package com.flab.foodeats.domain.menu;

public class Menu {

	private Long shopId;
	private int menuId;
	private String menuName;
	private int menuPrice;
	private String menuConfiguration;
	private String menuExplanation;
	private String menuGroup;

	public Menu() {
	}

	public Menu(Long shopId, int menuId, String menuName, int menuPrice, String menuConfiguration,
		String menuExplanation, String menuGroup) {
		this.shopId = shopId;
		this.menuId = menuId;
		this.menuName = menuName;
		this.menuPrice = menuPrice;
		this.menuConfiguration = menuConfiguration;
		this.menuExplanation = menuExplanation;
		this.menuGroup = menuGroup;
	}

	public String getMenuName() {
		return menuName;
	}

	public String getMenuGroup() {
		return menuGroup;
	}

	public Long getShopId() {
		return shopId;
	}

	public int getMenuId() {
		return menuId;
	}

	public int getMenuPrice() {
		return menuPrice;
	}

	public String getMenuConfiguration() {
		return menuConfiguration;
	}

	public String getMenuExplanation() {
		return menuExplanation;
	}
}
