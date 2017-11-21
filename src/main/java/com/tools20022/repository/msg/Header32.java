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
import com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01;
import com.tools20022.repository.area.caam.ATMExceptionAdviceV01;
import com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02;
import com.tools20022.repository.area.caam.ATMReconciliationAdviceV02;
import com.tools20022.repository.area.catp.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to the protocol management on a segment of the path from
 * the ATM to the acquirer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header32#mmMessageFunction
 * Header32.mmMessageFunction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header32#mmProtocolVersion
 * Header32.mmProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header32#mmExchangeIdentification
 * Header32.mmExchangeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header32#mmReTransmissionCounter
 * Header32.mmReTransmissionCounter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header32#mmCreationDateTime
 * Header32.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header32#mmInitiatingParty
 * Header32.mmInitiatingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header32#mmRecipientParty
 * Header32.mmRecipientParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header32#mmProcessState
 * Header32.mmProcessState}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header32#mmTraceability
 * Header32.mmTraceability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAcknowledgementV01#mmHeader
 * ATMExceptionAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMExceptionAdviceV01#mmHeader
 * ATMExceptionAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAdviceV02#mmHeader
 * ATMReconciliationAdviceV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMReconciliationAcknowledgementV02#mmHeader
 * ATMReconciliationAcknowledgementV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAdviceV02#mmHeader
 * ATMWithdrawalCompletionAdviceV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAcknowledgementV01#mmHeader
 * ATMDepositCompletionAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalCompletionAcknowledgementV02#mmHeader
 * ATMWithdrawalCompletionAcknowledgementV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMDepositCompletionAdviceV01#mmHeader
 * ATMDepositCompletionAdviceV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAcknowledgementV02#mmHeader
 * ATMCompletionAcknowledgementV02.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMCompletionAdviceV02#mmHeader
 * ATMCompletionAdviceV02.mmHeader}</li>
 * </ul>
 * </li>
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
 * "Header32"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the protocol management on a segment of the path from the ATM to the acquirer."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Header32", propOrder = {"messageFunction", "protocolVersion", "exchangeIdentification", "reTransmissionCounter", "creationDateTime", "initiatingParty", "recipientParty", "processState", "traceability"})
public class Header32 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMMessageFunction2 messageFunction;
	/**
	 * Identifies the type of process related to the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMMessageFunction2
	 * ATMMessageFunction2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgFctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageFunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the type of process related to the message."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header32.mmObject();
			isDerived = false;
			xmlTag = "MsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageFunction";
			definition = "Identifies the type of process related to the message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.ATMMessageFunction2.mmObject();
		}
	};
	protected Max6Text protocolVersion;
	/**
	 * Version of the ATM protocol specifications.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max6Text
	 * Max6Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcolVrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtocolVersion"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the ATM protocol specifications."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtocolVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header32.mmObject();
			isDerived = false;
			xmlTag = "PrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolVersion";
			definition = "Version of the ATM protocol specifications.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max6Text.mmObject();
		}
	};
	protected Max3NumericText exchangeIdentification;
	/**
	 * Unique identification of an exchange occurrence.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Max3NumericText
	 * Max3NumericText}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XchgId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExchangeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identification of an exchange occurrence."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header32.mmObject();
			isDerived = false;
			xmlTag = "XchgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeIdentification";
			definition = "Unique identification of an exchange occurrence.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	protected Number reTransmissionCounter;
	/**
	 * Retransmission counter of this advice, 0 for the first transmission.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReTrnsmssnCntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReTransmissionCounter"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * " Retransmission counter of this advice, 0 for the first transmission."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReTransmissionCounter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header32.mmObject();
			isDerived = false;
			xmlTag = "ReTrnsmssnCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTransmissionCounter";
			definition = " Retransmission counter of this advice, 0 for the first transmission.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected ISODateTime creationDateTime;
	/**
	 * Date and time at which the message was created.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CreDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreationDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the message was created."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header32.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected Max35Text initiatingParty;
	/**
	 * Unique identification of the partner that has initiated the exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InitgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InitiatingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that has initiated the exchange."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatingParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header32.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Unique identification of the partner that has initiated the exchange.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text recipientParty;
	/**
	 * Unique identification of the partner that is the recipient of the message
	 * exchange.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcptPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecipientParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification of the partner that is the recipient of the message exchange."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipientParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header32.mmObject();
			isDerived = false;
			xmlTag = "RcptPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientParty";
			definition = "Unique identification of the partner that is the recipient of the message exchange.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected Max35Text processState;
	/**
	 * State of the sender of the message inside the process flow.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcStat"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessState"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "State of the sender of the message inside the process flow."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessState = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header32.mmObject();
			isDerived = false;
			xmlTag = "PrcStat";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessState";
			definition = "State of the sender of the message inside the process flow.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Traceability4> traceability;
	/**
	 * Identification of partners involved in exchange from the merchant to the
	 * issuer, with the relative timestamp of their exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Traceability4
	 * Traceability4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header32
	 * Header32}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tracblt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Traceability"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTraceability = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header32.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Traceability4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Header32.mmMessageFunction, Header32.mmProtocolVersion, Header32.mmExchangeIdentification, Header32.mmReTransmissionCounter, Header32.mmCreationDateTime, Header32.mmInitiatingParty,
						Header32.mmRecipientParty, Header32.mmProcessState, Header32.mmTraceability);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMExceptionAcknowledgementV01.mmHeader, ATMExceptionAdviceV01.mmHeader, ATMReconciliationAdviceV02.mmHeader, ATMReconciliationAcknowledgementV02.mmHeader,
						ATMWithdrawalCompletionAdviceV02.mmHeader, ATMDepositCompletionAcknowledgementV01.mmHeader, ATMWithdrawalCompletionAcknowledgementV02.mmHeader, ATMDepositCompletionAdviceV01.mmHeader,
						ATMCompletionAcknowledgementV02.mmHeader, ATMCompletionAdviceV02.mmHeader);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Header32";
				definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgFctn", required = true)
	public ATMMessageFunction2 getMessageFunction() {
		return messageFunction;
	}

	public void setMessageFunction(com.tools20022.repository.msg.ATMMessageFunction2 messageFunction) {
		this.messageFunction = messageFunction;
	}

	@XmlElement(name = "PrtcolVrsn", required = true)
	public Max6Text getProtocolVersion() {
		return protocolVersion;
	}

	public void setProtocolVersion(Max6Text protocolVersion) {
		this.protocolVersion = protocolVersion;
	}

	@XmlElement(name = "XchgId", required = true)
	public Max3NumericText getExchangeIdentification() {
		return exchangeIdentification;
	}

	public void setExchangeIdentification(Max3NumericText exchangeIdentification) {
		this.exchangeIdentification = exchangeIdentification;
	}

	@XmlElement(name = "ReTrnsmssnCntr")
	public Number getReTransmissionCounter() {
		return reTransmissionCounter;
	}

	public void setReTransmissionCounter(Number reTransmissionCounter) {
		this.reTransmissionCounter = reTransmissionCounter;
	}

	@XmlElement(name = "CreDtTm", required = true)
	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public void setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = creationDateTime;
	}

	@XmlElement(name = "InitgPty", required = true)
	public Max35Text getInitiatingParty() {
		return initiatingParty;
	}

	public void setInitiatingParty(Max35Text initiatingParty) {
		this.initiatingParty = initiatingParty;
	}

	@XmlElement(name = "RcptPty")
	public Max35Text getRecipientParty() {
		return recipientParty;
	}

	public void setRecipientParty(Max35Text recipientParty) {
		this.recipientParty = recipientParty;
	}

	@XmlElement(name = "PrcStat")
	public Max35Text getProcessState() {
		return processState;
	}

	public void setProcessState(Max35Text processState) {
		this.processState = processState;
	}

	@XmlElement(name = "Tracblt")
	public List<Traceability4> getTraceability() {
		return traceability;
	}

	public void setTraceability(List<com.tools20022.repository.msg.Traceability4> traceability) {
		this.traceability = traceability;
	}
}