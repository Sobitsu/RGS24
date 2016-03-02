package com.grs24.mt.unistream;

import com.grs24.mt.FundsHolder;
import com.grs24.mt.MtAdapter;
import com.grs24.mt.PersonHolder;
import com.grs24.mt.RemittanceException;
import com.grs24.mt.RemittanceHolder;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Ctac
 */
public class MtUnistreamAdapter implements MtAdapter
{

	public void init(Properties cfg) throws IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public RemittanceHolder[] moneySearch(String mtcn, FundsHolder approxOrgFunds, FundsHolder approxDstFunds, String orgCountry, String dstCountry) throws RemittanceException, IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public void moneyHold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public void moneyUnhold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}

	public void moneyPay(String mtID, String mtcn, PersonHolder payee, String docID, String docDate) throws RemittanceException, IOException {
		throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
	}
	
}
