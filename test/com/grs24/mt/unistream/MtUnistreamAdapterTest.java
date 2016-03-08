/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream;

import com.grs24.msg.AddressHolder;
import com.grs24.msg.CredentialsHolder;
import com.grs24.msg.FullNameTypeHolder;
import com.grs24.msg.FundsHolder;
import com.grs24.msg.IndividualHolder;
import com.grs24.msg.PersonHolder;
import com.grs24.mt.RemittanceException;
import com.grs24.mt.RemittanceHolder;
import com.grs24.mt.unistream.wsclient.TestLib;
import java.io.IOException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.math.BigDecimal;

/**
 *
 * @author Dale
 */
public class MtUnistreamAdapterTest {
    
    @BeforeClass
    public static void setUpClass() throws IOException {
        TestLib.setUpClass();
    }
    public MtUnistreamAdapterTest() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }


    /**
     * Test of moneySearch method, of class MtUnistreamAdapter.
     */
    /*
    Код
Сумма (по умолч.)
Валюта (по умолч.)
719426228685
160
RUB
182691867358
4564
RUB
207084476267
4564
RUB
426714921761
700
RUB
377832738639
200
RUB
963158387166
1500
RUB
988035822622
666
RUB
841777134476
5000
RUB
939347570110
2000
RUB
671028872107
999
RUB
719814089921
999
RUB
695421481018
999
RUB
744206698832
999
RUB
890562352298
999
RUB
963740179022
999
RUB
988132787934
999
RUB
866169743386
999
RUB
768599307743
999
RUB
792991916653
999
RUB
817384525561
999
RUB
378317565182
999
RUB
549065827558
999
RUB
573458436462
999
RUB
622243654283
999
RUB
524673218649
999
RUB
451495391919
999
RUB
475888000829
999
RUB
500280609735
999
RUB
354021921581
999
RUB
329629312672
999
RUB
280844094852
999
RUB
378414530493
999
RUB
451592357227
999
RUB
427199748315
999
RUB
402807139405
999
RUB
061310614666
999
RUB
036918005756
999
RUB
012525396847
999
RUB
134488441392
999
RUB
256451485948
999
RUB
232058877035
999
RUB
158881050302
999
RUB
914373169343
5000
RUB
012331466222
2000
RUB
061407579970
2000
RUB
037014971065
2000
RUB
110192797790
2000
RUB
085800188881
2000
RUB
524285357405
150
RUB
670834941486
50000
RUB
646442332573
50000
RUB
719620159306
50000
RUB
695227550396
50000
RUB
622049723662
50000
RUB
548871896930
50000
RUB
524479288028
50000
RUB
597657114752
50000
RUB
573264505849
50000
RUB
744012768217
50000
RUB
914761030586
50000
RUB
890368421677
50000
RUB
963546248401
50000
RUB
939153639496
50000
RUB
865975812765
50000
RUB
792797986033
50000
RUB
768405377120
50000
RUB
841583203853
50000
RUB
817190594942
50000
RUB
500086679114
50000
RUB
597560149440
50000
RUB
573167540539
50000
RUB
646345367262
50000
RUB
621952758350
50000
RUB
499989713809
50000
RUB
060922753425
50000
RUB
548774931628
50000
RUB
524382322716
50000
RUB
670737976175
50000
RUB
817093629639
50000
RUB
792701020721
50000
RUB
036530144512
50000
RUB
841486238543
50000
RUB
719523193998
50000
RUB
695130585083
50000
RUB
768308411810
50000
RUB
743915802909
50000
RUB
207278406880
50000
RUB
182885797973
50000
RUB
256063624702
50000
RUB
231671015791
50000
RUB
109707971247
50000
RUB
085315362336
50000
RUB
158493189068
50000
RUB
134100580155
50000
RUB
280456233616
50000
RUB
426811887071
50000
RUB
402419278161
50000
RUB
475597104896
50000
RUB
451204495985
50000
RUB
329241451437
50000
RUB
304848842528
50000
RUB
378026669259
50000
RUB
353634060340
50000
RUB
012137535600
50000
RUB
207375372191
50000
RUB
182982763282
50000
RUB
256160590012
50000
RUB
231767981104
50000
RUB
109804936556
50000
RUB
085412327646
50000
RUB
158590154379
50000
RUB
134197545467
50000
RUB
280553198928
50000
RUB
426908852384
50000
RUB
402516243472
50000
RUB
475694070206
50000
RUB
451301461294
50000
RUB
329338416749
50000
RUB
304945807838
50000
RUB
378123634560
50000
RUB
353731025659
50000
RUB
865878847454
50000
RUB
890174491054
50000
RUB
914664065275
50000
RUB
890271456364
50000
RUB
963352317787
50000
RUB
987744926690
50000
RUB
914567099967
50000
RUB
938959708877
50000
RUB
939056674186
50000
RUB
012234500911
50000
RUB
987841892001
50000
RUB
061019718735
50000
RUB
036627109824
50000
RUB
816996664321
50000
RUB
865781882143
50000
RUB
743818837598
50000
RUB
963449283091
50000
RUB
646636263196
4000
RUB
475500139583
900
RUB
    */
    @Test
    public void testMoneySearch() throws Exception {
        System.out.println("moneySearch");
        RemittanceHolder[] result = null;
        String mtcn = "743818837598";
        FundsHolder approxOrgFunds = null;
        FundsHolder approxDstFunds = new FundsHolder();
        BigDecimal bd = new BigDecimal("50000");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        String orgCountry = "Russia";
        String dstCountry = "Russia";
        result = TestLib.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
        assertNotNull(result[0]);
        assertEquals(result[0].getMtID(),"16016603");

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("-900");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = TestLib.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 50003);
                }

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("50000");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = TestLib.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 30002);
                }
        
        mtcn = "";
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("1900");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        try {
                result = TestLib.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 50001);
                }

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = TestLib.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 50002);
                }

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("1900");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUR");
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = TestLib.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 10011);
                }

        mtcn = "036530144512";
        approxOrgFunds = null;
        approxDstFunds = new FundsHolder();
        bd = new BigDecimal("1900");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RU");
        orgCountry = "RUS";
        dstCountry = "RUS";
        try {
                result = TestLib.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
                }
        catch (RemittanceException ex) 
                {
                 assertEquals(ex.getCode(), 50011);
                }

        System.out.println("moneySearch OK");
    }

    /**
     * Test of moneyPay method, of class MtUnistreamAdapter.
     * 19.658 сек
     */
    @Test
    public void testMoneyPay() throws Exception {
        System.out.println("moneyPay");
        String mtcn = "036530144512";
        FundsHolder approxOrgFunds = null;
        FundsHolder approxDstFunds = new FundsHolder();
        BigDecimal bd = new BigDecimal("50000");
        approxDstFunds.setAmount(bd);
        approxDstFunds.setCur("RUB");
        String orgCountry = "Russia";
        String dstCountry = "Russia";
        RemittanceHolder[] result = TestLib.instance.moneySearch(mtcn, approxOrgFunds, approxDstFunds, orgCountry, dstCountry);
        assertNotNull(result[0]);
        String mtID = result[0].getMtID();
        PersonHolder payee = new PersonHolder();
        payee.setCitizenCountry("RUS");
        payee.setBirthday(DateTimeUtils.parseDate("07.10.1977",DateTimeUtils.ORACLE_DATE_FORMAT_STRING));
        FullNameTypeHolder fullName_ = new FullNameTypeHolder();
        IndividualHolder individual_ = new IndividualHolder();
        individual_.setFirst("Владимир");
        individual_.setLast("Резин");
        individual_.setMiddle("Сергеевич");
        fullName_.setIndividual(individual_);
        payee.setFullName(fullName_);
        CredentialsHolder identification_ = new CredentialsHolder();
        identification_.setCredCountry("RUS");
        identification_.setCredNumber("656565");
        identification_.setIssueCity("Нск");
        identification_.setIssuer("Нск");
        identification_.setSerialNumber("5404");
        identification_.setCredType("35");
        payee.setIdentification(identification_);
        String[] phone_ = new String[1];
        phone_[0] = "+79139222200";
        payee.setPhone(phone_);
        AddressHolder registration_ = new AddressHolder();
        registration_.setCountry("RUS");
        registration_.setCity("Новосибирск");
        registration_.setStreet1("Большивисткая");
        registration_.setStreet2("101");
        registration_.setZipCode("630090");
        payee.setRegistration(registration_);
        payee.setResidentCountry("RUS");
        String docID = "";
        String docDate = "";
        try{
            TestLib.instance.moneyPay(mtID, mtcn, payee, docID, docDate);
        }
        catch (RemittanceException ex) {
            if (ex.getCode() == 30000)  {System.out.println("moneyHold OK");}
            else
            {fail(" Ошибка оплаты перевода");}
        }
    }


    /**
     * Test of moneyHold method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneyHold() throws Exception {
        System.out.println("moneyHold");
        String mtID = "";
        String mtcn = "";
        PersonHolder payee = null;
        try {
            TestLib.instance.moneyHold(mtID, mtcn, payee);}
        catch (RemittanceException ex) {
            assertEquals(ex.getCode(), 30001);
        }
        System.out.println("moneyHold OK");
    }

    /**
     * Test of moneyUnhold method, of class MtUnistreamAdapter.
     */
    @Test
    public void testMoneyUnhold() throws Exception {
        System.out.println("moneyUnhold");
        String mtID = "";
        String mtcn = "";
        PersonHolder payee = null;
        try {
            TestLib.instance.moneyUnhold(mtID, mtcn, payee);
            }
        catch (RemittanceException ex) {
            assertEquals(ex.getCode(), 30001);
        }
        System.out.println("moneyUnhold OK");
        }
}
