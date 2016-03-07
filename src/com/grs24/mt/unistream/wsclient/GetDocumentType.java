/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.grs24.mt.unistream.wsclient;

import com.grs24.mt.unistream.BaseDataParser;
import java.io.IOException;
import javax.xml.bind.JAXBElement;
import javax.xml.ws.WebServiceException;
import org.datacontract.schemas._2004._07.wcfservicelib.AuthenticationHeader;
import org.datacontract.schemas._2004._07.wcfservicelib.ObjectStatus;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.DocumentType;
import org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesResponseMessage;

/**
 *
 * @author Dale
 */
public class GetDocumentType {

    private static GetDocumentTypeChangesResponseMessage getDocumentTypeChanges() throws UnsupportedOperationException, IOException {
        try {
                JAXBElement<AuthenticationHeader> ahh = CommonLib.MakeAuthHead();
                org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesRequestMessage requestMessage = new org.datacontract.schemas._2004._07.wcfservicelib_dictionaries.GetDocumentTypeChangesRequestMessage();
                requestMessage.setAuthenticationHeader(ahh);
                requestMessage.setUpdateCount(0L);
                //IWebService service = new WebService().getWS2007HttpBindingIWebService();
                WebServiceSingl ws = WebServiceSingl.getInstance();
                return ws.service.getDocumentTypeChanges(requestMessage);
            }
        catch (IOException|WebServiceException ex)
            {throw new IOException("Ошибка доступа к Unistream",ex);}
    }
   
    /**
* Выполнение запроса на получение ID типа документа
* @param code. Поддерживаемые типы документов:
* Военный билет
Вид на жительство
Паспорт моряка
Водительские права
Удостоверение МВД
UK Driving Licence
Карточка иностранца
ИНН
Кредитная карта
Миграционная карта
Виза
Приглашение
Иной документ
Свидетельство о предоставлении временного убежища
Свидетельство на возвращение в страну гражданства
Текущий запрос о выписке налогооблажения
Общегражданский заграничный паспорт
Временное удостоверение личности
Удостоверение личности военнослужащего
Идентификационная карта СНГ
Идентификационная карта
Государственное удостоверение личности
Сертификат о натурализации
Номер социального обеспечения
Паспорт иностранного гражданина
Счет за коммунальные услуги
Текущая выписка из банковского счета
Выписка с кредитной/дебетной карты
Текущий запрос о выписке налогооблажения
Судебная повестка
Свидетельство  органов  ЗАГС
Разрешение на временное проживание
Свид-во о рассмотрении признания лица беженцем
Удостоверение беженца
Паспорт гражданина РФ
Временное удостоверение личности гражданина РФ
Вид на жительство в РФ
Дипломатический паспорт
Разрешение на временное проживание в РФ
Свидетельство на возвращение в страну гражданства
Удостоверение личности гражданина иностр. гос-ва
Свидетельство о предоставлении временного убежища
Св-во о предоставлении вр. убежища на терр. РФ
Другой документ
Паспорт
Временное удостоверение личности
Вид на жительство (Украина)
Разрешение на временное проживание в РФ (без гр.)
Вид на жительство (Белоруссия)
Разр. на временное проживание в РФ (лиц без гр.)
Вид на жительство (Белоруссия)
Паспорт (Белоруссия)
Удостоверение беженца (Белоруссия)
Виза (Белоруссия)
Паспорт (Казахстан)
Удостоверение личности (Казахстан)
Вид на жительство иностранного граждан. Казахстан
Паспорт лица без гражданства (Казахстан)
Вид на жительство лица без гражданства в РФ
Справка об освобождении из мест лишения свободы
* English variant
* Military ID
Residence permit
Overseas Passport
Driving Licence
Home Office Ind
UK Driving Licence
Alien Card
Tax Id
Credit Card
Immigration Permit
Visa
Invitation
Other ID
Certificate of laissez-passer  citizenship
Current council tax demand letter, or statement
foreign passport
Pink Slip
ID
CIS Card
ID Card
State Identification Card
Naturalization Certificate
Social Security
Foreign passport
Utility Bill
Current bank statement
Credit /debit card statement
Current council tax demand letter, or statement
Instrument of a court appointment
Registry office certificate
Sojourn permit
Certificate of consideration of refugee status rec
Refugee Certificate
Russian Federation Passport
Russian Federation temporary identity card
Residence permit in Russian Federation
Diplomatic passport
Temporary residence permit in Russia
Certificate of laissez-passer  citizenship
Foreign country ID
.
Certificate for temporary asylum in Russian Federa
Another document
Passport
Interim Certificate
Residence permit in Ukraine
Temporary residence permit in Russia (stless)
Residence permit (Belarus)
Temp. residence permit in Russ (stateless pers.)
Residence permit (Belarus)
Passport (Belarus)
Refugee certificate (Belarus)
Visa (Belarus)
Passport (Kazakhstan)
Id (Kazakhstan)
ResidencePermit (Kazakhstan)
StatelessPassport (Kazakhstan)
Stateless person residence permit in Russian
Inprisonment release certificate in Russian
* @return ID тпа документа
* 
* @throws Exception в случае провала выполение
*/ 
    public static Integer getDocumentsID(String code)throws Exception {
       /* GetDocumentTypeChangesResponseMessage rm = getDocumentTypeChanges();
        CommonLib.CheckFault(rm);
        debug(rm);
        if (rm.getDocumentTypes().isNil()) return null;
        for (DocumentType i : rm.getDocumentTypes().getValue().getDocumentType())
                {
                    if (i.getStatus().equals(ObjectStatus.ACTUAL)) {
                        
                        if (!i.getName().getValue().getLangText().isEmpty()) {
                            for (LangText j : i.getName().getValue().getLangText())
                            {
                                if (!j.getText().isNil() && j.getText().getValue().equals(code)) return i.getID();
                            }
                        }
                    }
                }*/
        Integer res = BaseDataParser.parseInteger(code);
        return res;
     }
    
    public static String getDocumentTypeList() throws Exception {
        GetDocumentTypeChangesResponseMessage rm = getDocumentTypeChanges();
        CommonLib.CheckFault(rm);
        if (rm.getDocumentTypes().isNil()) return null;
        StringBuilder str = new StringBuilder();
        str.append("ID").append(",").append("English Names").append(",").append("Russian Names").append(System.getProperty("line.separator"));
        for (DocumentType i : rm.getDocumentTypes().getValue().getDocumentType())
                {
                    if (i.getStatus().equals(ObjectStatus.ACTUAL)) {
                        if (!i.getName().getValue().getLangText().isEmpty()) {
                            str.append(i.getID().toString()).append(",")
                               .append(i.getName().getValue().getLangText().get(0).getText().getValue()).append(",")
                               .append(i.getName().getValue().getLangText().get(1).getText().getValue()).append(System.getProperty("line.separator"));
                        }
                    }
                }    
        return str.toString();
    }
     private static void debug(GetDocumentTypeChangesResponseMessage fprm)
        {
            CommonLib.printXml(fprm);
        }   
}
