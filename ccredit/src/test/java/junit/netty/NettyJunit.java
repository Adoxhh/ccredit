package junit.netty;

import org.junit.Test;

import ccredit.xtmodules.xtcore.netty.server.TcpServer;
import junit.base.BaseJunit;

public class NettyJunit extends BaseJunit{
	@Test
	public void startServer(){
		TcpServer tServer = new TcpServer();
		tServer.startServer();
	}
}
