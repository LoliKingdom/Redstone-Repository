package thundr.redstonerepository.gui;

import cofh.core.util.helpers.ItemHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.network.IGuiHandler;
import thundr.redstonerepository.init.RedstoneRepositoryEquipment;

public class GuiHandler implements IGuiHandler {

	public static final int FEEDER_ID = 0;

	@Override
	public Object getClientGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {

		switch (id) {
			case FEEDER_ID:
				return new GuiFeeder(player.inventory, new ContainerFeeder(player.getHeldItemMainhand(), player.inventory));
			default:
				return null;
		}
	}

	@Override
	public Object getServerGuiElement(int id, EntityPlayer player, World world, int x, int y, int z) {

		switch (id) {
			case FEEDER_ID:
				return new ContainerFeeder(player.getHeldItemMainhand(), player.inventory);
			default:
				return null;
		}
	}
}
