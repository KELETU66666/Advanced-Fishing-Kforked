package nightkosh.advanced_fishing.core;

import net.minecraft.block.material.Material;
import nightkosh.advanced_fishing.api.material.IMaterialManager;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Advanced Fishing
 *
 * @author NightKosh
 * @license Lesser GNU Public License v3 (http://www.gnu.org/licenses/lgpl.html)
 */
public class MaterialManager implements IMaterialManager {

    public static final MaterialManager INSTANCE = new MaterialManager();

    public static final Set<Material> MATERIAL_SET = new HashSet<>();

    static {
        MATERIAL_SET.addAll(Arrays.asList(Material.WATER, Material.LAVA));
    }

    @Override
    public void addMaterial(Material material) {
        MATERIAL_SET.add(material);
    }
}
