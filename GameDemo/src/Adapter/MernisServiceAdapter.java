package Adapter;

import java.rmi.RemoteException;

import Abstract.PlayerCheckService;
import Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PlayerCheckService{

	@Override
	public boolean checkIfRealPerson(Player player) {
		KPSPublicSoap soapClient = new KPSPublicSoapProxy();
		boolean result = false;
		
		 try {
			  result = soapClient.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName(), player.getLastName(), player.getDateOfBirth());
		  } catch (NumberFormatException e) {
			   e.printStackTrace();
		  } catch (RemoteException e) {
		       e.printStackTrace();
		  }
		 return result;
		
	}
	

}