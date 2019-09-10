package mtr.item;

import mtr.entity.EntitySP1900;
import mtr.entity.EntityTrain;
import net.minecraft.world.World;

public class ItemSP1900 extends ItemSpawnTrain {

	@Override
	protected EntityTrain getTrain(World worldIn, double x, double y, double z) {
		return new EntitySP1900(worldIn, x, y, z);
	}

	@Override
	protected int getSubtypeCount() {
		return 4;
	}
}
