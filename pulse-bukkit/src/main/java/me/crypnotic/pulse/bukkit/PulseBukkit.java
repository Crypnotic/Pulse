package me.crypnotic.pulse.bukkit;

import org.bukkit.plugin.java.JavaPlugin;

import lombok.Getter;
import me.crypnotic.pulse.common.PulseCommon;
import me.crypnotic.pulse.common.api.IPlatform;

public class PulseBukkit extends JavaPlugin implements IPlatform {

	@Getter
	private PulseCommon common;

	@Override
	public void onLoad() {
		this.common = new PulseCommon(this);
	}

	@Override
	public void onEnable() {
		common.enable();
	}

	@Override
	public void onDisable() {
		common.disable();
	}
}
