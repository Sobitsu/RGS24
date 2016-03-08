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
* Получение ID типа документа
*@param code - код документа
<p>Поддерживаемые типы документов:</p>
Военный билет<br>
Вид на жительство<br>
Паспорт моряка<br>
Водительские права<br>
Удостоверение МВД<br>
UK Driving Licence<br>
Карточка иностранца<br>
ИНН<br>
Кредитная карта<br>
Миграционная карта<br>
Виза<br>
Приглашение<br>
Иной документ<br>
Свидетельство о предоставлении временного убежища<br>
Свидетельство на возвращение в страну гражданства<br>
Текущий запрос о выписке налогооблажения<br>
Общегражданский заграничный паспорт<br>
Временное удостоверение личности<br>
Удостоверение личности военнослужащего<br>
Идентификационная карта СНГ<br>
Идентификационная карта<br>
Государственное удостоверение личности<br>
Сертификат о натурализации<br>
Номер социального обеспечения<br>
Паспорт иностранного гражданина<br>
Счет за коммунальные услуги<br>
Текущая выписка из банковского счета<br>
Выписка с кредитной/дебетной карты<br>
Текущий запрос о выписке налогооблажения<br>
Судебная повестка<br>
Свидетельство  органов  ЗАГС<br>
Разрешение на временное проживание<br>
Свид-во о рассмотрении признания лица беженцем<br>
Удостоверение беженца<br>
Паспорт гражданина РФ<br>
Временное удостоверение личности гражданина РФ<br>
Вид на жительство в РФ<br>
Дипломатический паспорт<br>
Разрешение на временное проживание в РФ<br>
Свидетельство на возвращение в страну гражданства<br>
Удостоверение личности гражданина иностр. гос-ва<br>
Свидетельство о предоставлении временного убежища<br>
Св-во о предоставлении вр. убежища на терр. РФ<br>
Другой документ<br>
Паспорт<br>
Временное удостоверение личности<br>
Вид на жительство (Украина)<br>
Разрешение на временное проживание в РФ (без гр.)<br>
Вид на жительство (Белоруссия)<br>
Разр. на временное проживание в РФ (лиц без гр.)<br>
Вид на жительство (Белоруссия)<br>
Паспорт (Белоруссия)<br>
Удостоверение беженца (Белоруссия)<br>
Виза (Белоруссия)<br>
Паспорт (Казахстан)<br>
Удостоверение личности (Казахстан)<br>
Вид на жительство иностранного граждан. Казахстан<br>
Паспорт лица без гражданства (Казахстан)<br>
Вид на жительство лица без гражданства в РФ<br>
Справка об освобождении из мест лишения свободы<br>
* English variant<br>
* Military ID<br>
Residence permit<br>
Overseas Passport<br>
Driving Licence<br>
Home Office Ind<br>
UK Driving Licence<br>
Alien Card<br>
Tax Id<br>
Credit Card<br>
Immigration Permit<br>
Visa<br>
Invitation<br>
Other ID<br>
Certificate of laissez-passer  citizenship<br>
Current council tax demand letter, or statement<br>
foreign passport<br>
Pink Slip<br>
ID<br>
CIS Card<br>
ID Card<br>
State Identification Card<br>
Naturalization Certificate<br>
Social Security<br>
Foreign passport<br>
Utility Bill<br>
Current bank statement<br>
Credit /debit card statement<br>
Current council tax demand letter, or statement<br>
Instrument of a court appointment<br>
Registry office certificate<br>
Sojourn permit<br>
Certificate of consideration of refugee status rec<br>
Refugee Certificate<br>
Russian Federation Passport<br>
Russian Federation temporary identity card<br>
Residence permit in Russian Federation<br>
Diplomatic passport<br>
Temporary residence permit in Russia<br>
Certificate of laissez-passer  citizenship<br>
Foreign country ID<br>
Certificate for temporary asylum in Russian Federa<br>
Another document<br>
Passport<br>
Interim Certificate<br>
Residence permit in Ukraine<br>
Temporary residence permit in Russia (stless)<br>
Residence permit (Belarus)<br>
Temp. residence permit in Russ (stateless pers.)<br>
Residence permit (Belarus)<br>
Passport (Belarus)<br>
Refugee certificate (Belarus)<br>
Visa (Belarus)<br>
Passport (Kazakhstan)<br>
Id (Kazakhstan)<br>
ResidencePermit (Kazakhstan)<br>
StatelessPassport (Kazakhstan)<br>
Stateless person residence permit in Russian<br>
Inprisonment release certificate in Russian<br>
* @return ID тпа документа
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
    
/**
*Получение справочника типов удостоверений личности
* @return справочник типов удостоверений личности
* @throws java.lang.Exception 
**/
   
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
}
