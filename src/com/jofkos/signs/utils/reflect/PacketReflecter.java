package com.jofkos.signs.utils.reflect;

import com.jofkos.signs.utils.nms.NMSUtils;

public class PacketReflecter extends Reflecter {

	public PacketReflecter(String packet) {
		super(NMSUtils.getPacket(packet));
	}

}
