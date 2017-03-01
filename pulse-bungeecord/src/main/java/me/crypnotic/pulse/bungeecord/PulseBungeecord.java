package me.crypnotic.pulse.bungeecord;

import lombok.Getter;
import me.crypnotic.pulse.common.PulseCommon;
import me.crypnotic.pulse.common.api.IPlatform;
import net.md_5.bungee.api.plugin.Plugin;

public class PulseBungeecord extends Plugin implements IPlatform {

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
