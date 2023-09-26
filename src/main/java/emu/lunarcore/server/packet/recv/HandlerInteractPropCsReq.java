package emu.lunarcore.server.packet.recv;

import emu.lunarcore.server.game.GameSession;
import emu.lunarcore.server.packet.CmdId;
import emu.lunarcore.server.packet.Opcodes;
import emu.lunarcore.server.packet.PacketHandler;

@Opcodes(CmdId.InteractPropCsReq)
public class HandlerInteractPropCsReq extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] data) throws Exception {
        // TODO implement properly
        session.send(CmdId.InteractPropScRsp);
    }

}
