#jeżeli macie jakieś problemy zapraszam na discorda na kanał Publiczna pomoc 

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements CommandExecutor{
	
	public void onEnable() {
		sendCmdMsg("§aPLUGIN POMOC SIĘ WŁĄCZA");
	}
	
	public void sendCmdMsg(String s) {
		Bukkit.getConsoleSender().sendMessage(s);
	}

	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player p = (Player) sender;
		if(cmd.getName().equalsIgnoreCase("pomoc")) {
			p.sendMessage(" ");
			p.sendMessage("§7§n-----§C§LPOMOC§7§n-----");
			p.sendMessage("§7 /kit Kity");
			p.sendMessage("§7 /rangi Menu rang serwerowych");
			p.sendMessage("§7 /helpop Report");
			p.sendMessage("§7§n-----§C§LPOMOC§7§n-----");
		}
		return false;
	}
	


	

}
