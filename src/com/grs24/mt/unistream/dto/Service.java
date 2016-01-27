package com.grs24.mt.unistream.dto;

/**
 *
 * @author Ctac
 */
public class Service 
{
	/** Идентификатор услуги
1 – комиссия банка отправившего перевод,
2 – комиссия остальных участников Юнистрим, 
3 – комиссия банка выплатившего перевод */
	private Integer ServiceID;

	/** Идентификатор участника */
	private Integer ParticipatorID;

	/** Стоимость услуги */
	private Double Fee;

	/** Идентификатор валюты в которой указана стоимость услуги */
	private Integer CurrencyID;

	/** Режим предоставления услуги */
	private ServiceMode Mode;

	/** Ответ клиента на предложение услуги */
	private Response Response;

	/** id группы необязательных услуг. 
	 * Если больше нуля, то среди необязательных услуг с одинаковым OptionalServiceGroupID, 
	 * можно выбрать (установить Response=Accepted) только одну услугу*/
	private Integer OptionalServiceGroupID;

	/** Текст предложения услуги. Банк-отправитель обязан довести его до отправителя перевода. 
	 * Например: "Желаете воспользоваться бесплатной услугой SMS уведомление о статусе перевода?" */
	private String ProposalText;

	public Service() {
	}

	public Integer getServiceID() {
		return ServiceID;
	}

	public void setServiceID(Integer ServiceID) {
		this.ServiceID = ServiceID;
	}

	public Integer getParticipatorID() {
		return ParticipatorID;
	}

	public void setParticipatorID(Integer ParticipatorID) {
		this.ParticipatorID = ParticipatorID;
	}

	public Double getFee() {
		return Fee;
	}

	public void setFee(Double Fee) {
		this.Fee = Fee;
	}

	public Integer getCurrencyID() {
		return CurrencyID;
	}

	public void setCurrencyID(Integer CurrencyID) {
		this.CurrencyID = CurrencyID;
	}

	public ServiceMode getMode() {
		return Mode;
	}

	public void setMode(ServiceMode Mode) {
		this.Mode = Mode;
	}

	public Response getResponse() {
		return Response;
	}

	public void setResponse(Response Response) {
		this.Response = Response;
	}

	public Integer getOptionalServiceGroupID() {
		return OptionalServiceGroupID;
	}

	public void setOptionalServiceGroupID(Integer OptionalServiceGroupID) {
		this.OptionalServiceGroupID = OptionalServiceGroupID;
	}

	public String getProposalText() {
		return ProposalText;
	}

	public void setProposalText(String ProposalText) {
		this.ProposalText = ProposalText;
	}

	@Override
	public String toString() {
		return "Service{" + "ServiceID=" + ServiceID + ", ParticipatorID=" + ParticipatorID + ", Fee=" + Fee + ", CurrencyID=" + CurrencyID + ", Mode=" + Mode + ", Response=" + Response + ", OptionalServiceGroupID=" + OptionalServiceGroupID + ", ProposalText=" + ProposalText + '}';
	}
}
