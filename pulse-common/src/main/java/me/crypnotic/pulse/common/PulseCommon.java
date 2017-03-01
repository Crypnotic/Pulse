package me.crypnotic.pulse.common;

import lombok.Getter;
import me.crypnotic.pulse.common.api.IPlatform;

public class PulseCommon {

	@Getter
	private IPlatform platform;

	public PulseCommon(IPlatform platform) {
		this.platform = platform;
	}

	public void enable() {

	}

	public void disable() {

	}
}
