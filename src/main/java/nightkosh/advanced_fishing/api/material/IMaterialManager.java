package nightkosh.advanced_fishing.api.material;

import net.minecraft.block.material.Material;

/**
 * Advanced Fishing
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public interface IMaterialManager {

    /**
     * Used to add custom liquid material (non water and lava)
     * so fishing hook will be able to works correctly in it
     *
     * @param material liquid material
     */
    public void addMaterial(Material material);
}
