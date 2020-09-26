package me.resources.skyhoes.papi;

import java.io.IOException;
import java.util.Map;
import me.clip.placeholderapi.expansion.Configurable;
import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import me.resources.skyhoes.DataHandler;

import org.bukkit.OfflinePlayer;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public final class SkyHoesExpansion extends PlaceholderExpansion implements Configurable {
	
	private final String VERSION = getClass().getPackage().getImplementationVersion();

	@Override
	public Map<String, Object> getDefaults() {
		return null;
	}

	@Override
	public @NotNull String getAuthor() {
		return "ResourcesMCM";
	}

	@Override
	public @NotNull String getIdentifier() {
		return "skyhoes";
	}

	@Override
	public @NotNull String getVersion() {
		return VERSION;
	}
	
	@Override
	public String onRequest(final OfflinePlayer offlinePlayer, String identifier) {
		if (offlinePlayer == null) {
            return "";
        }

        if (!offlinePlayer.isOnline()) {
            return "";
        }
        
        String returned = "";
        final Player player = offlinePlayer.getPlayer();
        
        switch (identifier.toLowerCase()) {
        
        	case "tokens": {
        		try {
					returned = me.resources.skyhoes.DataHandler.getTokens(player).toString();
				} catch (IOException e) {
					e.printStackTrace();
				}
        		break;
        	}
        	
        	case "croptop_cane_broken_1": {
        		return String.valueOf(DataHandler.getCaneBroken1());
        	}
        	
        	case "croptop_cane_name_1": {
        		return DataHandler.getCaneTop1();
        	}
        	
        	case "croptop_cane_broken_2": {
        		return String.valueOf(DataHandler.getCaneBroken2());
        	}
        	
        	case "croptop_cane_name_2": {
        		return DataHandler.getCaneTop2();
        	}
        	
        	case "croptop_cane_broken_3": {
        		return String.valueOf(DataHandler.getCaneBroken3());
        	}
        	
        	case "croptop_cane_name_3": {
        		return DataHandler.getCaneTop3();
        	}
        	
        	case "croptop_cane_broken_4": {
        		return String.valueOf(DataHandler.getCaneBroken4());
        	}
        	
        	case "croptop_cane_name_4": {
        		return DataHandler.getCaneTop4();
        	}
        	
        	case "croptop_cane_broken_5": {
        		return String.valueOf(DataHandler.getCaneBroken5());
        	}
        	
        	case "croptop_cane_name_5": {
        		return DataHandler.getCaneTop5();
        	}
        	
        	case "croptop_carrot_broken_1": {
        		return String.valueOf(DataHandler.getCaneBroken1());
        	}
        	
        	case "croptop_carrot_name_1": {
        		return DataHandler.getCarrotTop1();
        	}
        	
        	case "croptop_carrot_broken_2": {
        		return String.valueOf(DataHandler.getCarrotBroken2());
        	}
        	
        	case "croptop_carrot_name_2": {
        		return DataHandler.getCarrotTop2();
        	}
        	
        	case "croptop_carrot_broken_3": {
        		return String.valueOf(DataHandler.getCarrotBroken3());
        	}
        	
        	case "croptop_carrot_name_3": {
        		return DataHandler.getCarrotTop3();
        	}
        	
        	case "croptop_carrot_broken_4": {
        		return String.valueOf(DataHandler.getCarrotBroken4());
        	}
        	
        	case "croptop_carrot_name_4": {
        		return DataHandler.getCarrotTop4();
        	}
        	
        	case "croptop_carrot_broken_5": {
        		return String.valueOf(DataHandler.getCarrotBroken5());
        	}
        	
        	case "croptop_carrot_name_5": {
        		return DataHandler.getCarrotTop5();
        	}
        	
        	case "croptop_potato_name_1": {
        		return DataHandler.getPotatoTop1();
        	}
        	
        	case "croptop_potato_broken_2": {
        		return String.valueOf(DataHandler.getPotatoBroken2());
        	}
        	
        	case "croptop_potato_name_2": {
        		return DataHandler.getPotatoTop2();
        	}
        	
        	case "croptop_potato_broken_3": {
        		return String.valueOf(DataHandler.getPotatoBroken3());
        	}
        	
        	case "croptop_potato_name_3": {
        		return DataHandler.getPotatoTop3();
        	}
        	
        	case "croptop_potato_broken_4": {
        		return String.valueOf(DataHandler.getPotatoBroken4());
        	}
        	
        	case "croptop_potato_name_4": {
        		return DataHandler.getPotatoTop4();
        	}
        	
        	case "croptop_potato_broken_5": {
        		return String.valueOf(DataHandler.getPotatoBroken5());
        	}
        	
        	case "croptop_potato_name_5": {
        		return DataHandler.getPotatoTop5();
        	}
        	
        	case "croptop_wheat_name_1": {
        		return DataHandler.getWheatTop1();
        	}
        	
        	case "croptop_wheat_broken_2": {
        		return String.valueOf(DataHandler.getWheatBroken2());
        	}
        	
        	case "croptop_wheat_name_2": {
        		return DataHandler.getWheatTop2();
        	}
        	
        	case "croptop_wheat_broken_3": {
        		return String.valueOf(DataHandler.getWheatBroken3());
        	}
        	
        	case "croptop_wheat_name_3": {
        		return DataHandler.getWheatTop3();
        	}
        	
        	case "croptop_wheat_broken_4": {
        		return String.valueOf(DataHandler.getWheatBroken4());
        	}
        	
        	case "croptop_wheat_name_4": {
        		return DataHandler.getWheatTop4();
        	}
        	
        	case "croptop_wheat_broken_5": {
        		return String.valueOf(DataHandler.getWheatBroken5());
        	}
        	
        	case "croptop_wheat_name_5": {
        		return DataHandler.getWheatTop5();
        	}
        	
        	case "croptop_wart_name_1": {
        		return DataHandler.getWartTop1();
        	}
        	
        	case "croptop_wart_broken_2": {
        		return String.valueOf(DataHandler.getWartBroken2());
        	}
        	
        	case "croptop_wart_name_2": {
        		return DataHandler.getWartTop2();
        	}
        	
        	case "croptop_wart_broken_3": {
        		return String.valueOf(DataHandler.getWartBroken3());
        	}
        	
        	case "croptop_wart_name_3": {
        		return DataHandler.getWartTop3();
        	}
        	
        	case "croptop_wart_broken_4": {
        		return String.valueOf(DataHandler.getWartBroken4());
        	}
        	
        	case "croptop_wart_name_4": {
        		return DataHandler.getWartTop4();
        	}
        	
        	case "croptop_wart_broken_5": {
        		return String.valueOf(DataHandler.getWartBroken5());
        	}
        	
        	case "croptop_wart_name_5": {
        		return DataHandler.getWartTop5();
        	}
        	
        	default:
        		return identifier;
        }
        
        return returned;
	}
}