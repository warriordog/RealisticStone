package net.acomputerdog.RealisticStone;

import net.acomputerdog.BlazeLoader.api.block.ApiBlock;
import net.acomputerdog.BlazeLoader.main.Version;
import net.acomputerdog.BlazeLoader.mod.Mod;
import net.acomputerdog.BlazeLoader.util.logger.BLLogger;

public class ModRealisticStone extends Mod {
    public static final BLLogger logger = new BLLogger("Realistic_Stone", false, false);

    /**
     * Returns ID used to identify this mod internally, even among different versions of the same mod.  Mods should override.
     * --This should never be changed after the mod has been released!--
     *
     * @return Returns the id of the mod.
     */
    @Override
    public String getModId() {
        return "acomputerdog.realisticstone";
    }

    /**
     * Returns the user-friendly name of the mod.  Mods should override.
     * --Can be changed among versions, so this should not be used to ID mods!--
     *
     * @return Returns user-friendly name of the mod.
     */
    @Override
    public String getModName() {
        return "Realistic Stone";
    }

    /**
     * Gets the version of the mod as an integer for choosing the newer version.
     *
     * @return Return the version of the mod as an integer.
     */
    @Override
    public int getIntModVersion() {
        return 0;
    }

    /**
     * Gets the version of the mod as a String for display.
     *
     * @return Returns the version of the mod as an integer.
     */
    @Override
    public String getStringModVersion() {
        return "0.0";
    }

    /**
     * Returns true if this mod is compatible with the installed version of BlazeLoader.  This should be checked using Version.class.
     * -Called before mod is loaded!  Do not depend on Mod.load()!-
     *
     * @return Returns true if the mod is compatible with the installed version of BlazeLoader.
     */
    @Override
    public boolean isCompatibleWithBLVersion() {
        if(!Version.getMinecraftVersion().equals("1.7.2")){
            System.out.println("TerrainEdit - Incorrect Minecraft version, aborting launch!");
            return false;
        }else if(Version.getGlobalVersion() == 2 && Version.getApiVersion() > 8){
            System.out.println("TerrainEdit - Unknown BL version, bad things may happen!");
            return true;
        }else if(Version.getGlobalVersion() != 2 || Version.getApiVersion() <= -1){
            System.out.println("TerrainEdit - Incompatible BL version, aborting launch!");
            return false;
        }else{
            System.out.println("TerrainEdit - Valid BL and MC versions.");
            return true;
        }
    }

    /**
     * Gets a user-friendly description of the mod.
     *
     * @return Return a String representing a user-friendly description of the mod.
     */
    @Override
    public String getModDescription() {
        return "Makes stone harder at deeper depths";
    }

    /**
     * Called when mod is started.  Game is fully loaded and can be interacted with.
     */
    @Override
    public void start() {
        ApiBlock.registerBlock(new BlockRealisticStone(ApiBlock.getBlockByName("stone")), "stone", 1);
    }

    /**
     * Called when mod is loaded.  Called before game is loaded.
     */
    @Override
    public void load() {
        logger.logInfo("Realistic Stone is starting.");
    }

    /**
     * Called when mod is stopped.  Game is about to begin shutting down, so mod should release system resources, close streams, etc.
     */
    @Override
    public void stop() {
        logger.logInfo("Realistic Stone is stopping.");
    }
}
