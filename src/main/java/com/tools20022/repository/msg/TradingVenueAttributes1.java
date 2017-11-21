/* Tools20022 - API for ISO 20022
* Copyright (C) 2017 Tools20022.com - László Bukodi 
* 
* This program is free software: you can redistribute it and/or modify
* it under the terms of the GNU General Public License as published by
* the Free Software Foundation, either version 3 of the License, or
* (at your option) any later version.
* 
* This program is distributed in the hope that it will be useful,
* but WITHOUT ANY WARRANTY; without even the implied warranty of
* MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
* GNU General Public License for more details.
* 
* You should have received a copy of the GNU General Public License
* along with this program.  If not, see <http://www.gnu.org/licenses/>.
*/

package com.tools20022.repository.msg;

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.MICIdentifier;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.OrganisationIdentification;
import com.tools20022.repository.entity.TradingMarket;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Traded venue related fields.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1#mmIdentification
 * TradingVenueAttributes1.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1#mmIssuerRequest
 * TradingVenueAttributes1.mmIssuerRequest}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1#mmAdmissionApprovalDateByIssuer
 * TradingVenueAttributes1.mmAdmissionApprovalDateByIssuer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1#mmRequestForAdmissionDate
 * TradingVenueAttributes1.mmRequestForAdmissionDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1#mmFirstTradeDate
 * TradingVenueAttributes1.mmFirstTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1#mmTerminationDate
 * TradingVenueAttributes1.mmTerminationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TradingMarket
 * TradingMarket}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TradingVenueAttributes1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Traded venue related fields."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TradingVenueAttributes1", propOrder = {"identification", "issuerRequest", "admissionApprovalDateByIssuer", "requestForAdmissionDate", "firstTradeDate", "terminationDate"})
public class TradingVenueAttributes1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MICIdentifier identification;
	/**
	 * Segment MIC for the trading venue or systematic internaliser, where
	 * applicable, otherwise the operating MIC.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.MICIdentifier
	 * MICIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.OrganisationIdentification#mmMIC
	 * OrganisationIdentification.mmMIC}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
	 * TradingVenueAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Segment MIC for the trading venue or systematic internaliser, where applicable, otherwise the operating MIC."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> OrganisationIdentification.mmMIC;
			componentContext_lazy = () -> TradingVenueAttributes1.mmObject();
			isDerived = false;
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Segment MIC for the trading venue or systematic internaliser, where applicable, otherwise the operating MIC.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MICIdentifier.mmObject();
		}
	};
	protected TrueFalseIndicator issuerRequest;
	/**
	 * Indicates whether the issuer of the financial instrument has requested or
	 * approved the trading or admission to trading of their financial
	 * instruments on a trading venue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
	 * TradingVenueAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrReq"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerRequest"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the issuer of the financial instrument has requested or approved the trading or admission to trading of their financial instruments on a trading venue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIssuerRequest = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradingVenueAttributes1.mmObject();
			isDerived = false;
			xmlTag = "IssrReq";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerRequest";
			definition = "Indicates whether the issuer of the financial instrument has requested or approved the trading or admission to trading of their financial instruments on a trading venue.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected ISODateTime admissionApprovalDateByIssuer;
	/**
	 * Date and time the issuer has approved the admission to trading or trading
	 * of its financial instruments on the trading venue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
	 * TradingVenueAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AdmssnApprvlDtByIssr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdmissionApprovalDateByIssuer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time the issuer has approved the admission to trading or trading of its financial instruments on the trading venue."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAdmissionApprovalDateByIssuer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradingVenueAttributes1.mmObject();
			isDerived = false;
			xmlTag = "AdmssnApprvlDtByIssr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdmissionApprovalDateByIssuer";
			definition = "Date and time the issuer has approved the admission to trading or trading of its financial instruments on the trading venue.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime requestForAdmissionDate;
	/**
	 * Date and time when the request for admission on the trading venue was
	 * made for the instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
	 * TradingVenueAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqForAdmssnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestForAdmissionDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when the request for admission on the trading venue was made for the instrument."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestForAdmissionDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradingVenueAttributes1.mmObject();
			isDerived = false;
			xmlTag = "ReqForAdmssnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestForAdmissionDate";
			definition = "Date and time when the request for admission on the trading venue was made for the instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime firstTradeDate;
	/**
	 * Date and time of the admission to trading on the trading venue or the
	 * date and time when the instrument was first traded or an order or quote
	 * was first received by the trading venue.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
	 * TradingVenueAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FrstTradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FirstTradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time of the admission to trading on the trading venue or the date and time when the instrument was first traded or an order or quote was first received by the trading venue. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFirstTradeDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradingVenueAttributes1.mmObject();
			isDerived = false;
			xmlTag = "FrstTradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FirstTradeDate";
			definition = "Date and time of the admission to trading on the trading venue or the date and time when the instrument was first traded or an order or quote was first received by the trading venue. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected ISODateTime terminationDate;
	/**
	 * Date and time when the financial instrument ceases to be traded or to be
	 * admitted to trading on the trading venue. Where this date and time is
	 * unavailable, the field shall not be populated.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TradingVenueAttributes1
	 * TradingVenueAttributes1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TermntnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TerminationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time when the financial instrument ceases to be traded or to be admitted to trading on the trading venue. Where this date and time is unavailable, the field shall not be populated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTerminationDate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TradingVenueAttributes1.mmObject();
			isDerived = false;
			xmlTag = "TermntnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TerminationDate";
			definition = "Date and time when the financial instrument ceases to be traded or to be admitted to trading on the trading venue. Where this date and time is unavailable, the field shall not be populated.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TradingVenueAttributes1.mmIdentification, TradingVenueAttributes1.mmIssuerRequest, TradingVenueAttributes1.mmAdmissionApprovalDateByIssuer,
						TradingVenueAttributes1.mmRequestForAdmissionDate, TradingVenueAttributes1.mmFirstTradeDate, TradingVenueAttributes1.mmTerminationDate);
				trace_lazy = () -> TradingMarket.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "TradingVenueAttributes1";
				definition = "Traded venue related fields.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "Id", required = true)
	public MICIdentifier getIdentification() {
		return identification;
	}

	public void setIdentification(MICIdentifier identification) {
		this.identification = identification;
	}

	@XmlElement(name = "IssrReq", required = true)
	public TrueFalseIndicator getIssuerRequest() {
		return issuerRequest;
	}

	public void setIssuerRequest(TrueFalseIndicator issuerRequest) {
		this.issuerRequest = issuerRequest;
	}

	@XmlElement(name = "AdmssnApprvlDtByIssr")
	public ISODateTime getAdmissionApprovalDateByIssuer() {
		return admissionApprovalDateByIssuer;
	}

	public void setAdmissionApprovalDateByIssuer(ISODateTime admissionApprovalDateByIssuer) {
		this.admissionApprovalDateByIssuer = admissionApprovalDateByIssuer;
	}

	@XmlElement(name = "ReqForAdmssnDt")
	public ISODateTime getRequestForAdmissionDate() {
		return requestForAdmissionDate;
	}

	public void setRequestForAdmissionDate(ISODateTime requestForAdmissionDate) {
		this.requestForAdmissionDate = requestForAdmissionDate;
	}

	@XmlElement(name = "FrstTradDt")
	public ISODateTime getFirstTradeDate() {
		return firstTradeDate;
	}

	public void setFirstTradeDate(ISODateTime firstTradeDate) {
		this.firstTradeDate = firstTradeDate;
	}

	@XmlElement(name = "TermntnDt")
	public ISODateTime getTerminationDate() {
		return terminationDate;
	}

	public void setTerminationDate(ISODateTime terminationDate) {
		this.terminationDate = terminationDate;
	}
}