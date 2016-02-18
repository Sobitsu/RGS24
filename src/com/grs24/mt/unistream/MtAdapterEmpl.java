/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream;

import com.grs24.RemittanceException;
import com.grs24.RemittanceHolder;
import com.grs24.msg.FundsHolder;
import com.grs24.msg.PersonHolder;
import com.grs24.mt.MtAdapter;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Dale
 */
public class MtAdapterEmpl implements MtAdapter {

    @Override
    public void init(Properties init) throws IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public RemittanceHolder[] moneySearch(String mtcn, FundsHolder approxOrgFunds, FundsHolder approxDstFunds, String orgCountry, String dstCountry) throws RemittanceException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moneyHold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moneyUnhold(String mtID, String mtcn, PersonHolder payee) throws RemittanceException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void moneyPay(String mtID, String mtcn, PersonHolder payee, String docID, String docDate) throws RemittanceException, IOException {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
