package extension.tools.presetconfig.wired.incoming;

import extension.parsers.HWiredContext;
import extension.tools.presetconfig.wired.PresetWiredVariable;
import gearth.protocol.HPacket;

import java.util.List;

/**
 * @author Beny.
 */
public class RetrievedWiredVariable extends PresetWiredVariable implements RetrievedWired {

    private final int typeId;

    public RetrievedWiredVariable(int wiredId, List<Integer> options, String stringConfig, List<Integer> items, int typeId, List<Integer> pickedFurniSources, List<Integer> pickedUserSources, List<Long> variableIds, HWiredContext wiredContext) {
        super(wiredId, options, stringConfig, items, pickedFurniSources, pickedUserSources, variableIds, wiredContext);
        this.typeId = typeId;
    }

    @Override
    public int getTypeId() {
        return typeId;
    }

    public static RetrievedWiredVariable fromPacket(HPacket packet) {
        return RetrievedWired.fromPacket(packet, RetrievedWiredVariable.class);
    }
}