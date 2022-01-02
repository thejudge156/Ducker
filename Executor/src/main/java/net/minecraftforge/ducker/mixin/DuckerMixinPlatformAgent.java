package net.minecraftforge.ducker.mixin;

import org.spongepowered.asm.launch.platform.IMixinPlatformServiceAgent;
import org.spongepowered.asm.launch.platform.MixinPlatformAgentAbstract;
import org.spongepowered.asm.launch.platform.container.IContainerHandle;
import org.spongepowered.asm.util.Constants;

import java.util.Collection;

public class DuckerMixinPlatformAgent extends MixinPlatformAgentAbstract implements IMixinPlatformServiceAgent
{
    @Override
    public void init()
    {

    }

    @Override
    public String getSideName()
    {
        return Constants.SIDE_CLIENT;
    }

    @Override
    public Collection<IContainerHandle> getMixinContainers()
    {
        return null;
    }
}
