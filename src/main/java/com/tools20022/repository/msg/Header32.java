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
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Header32", propOrder = {"messageFunction", "protocolVersion", "exchangeIdentification", "reTransmissionCounter", "creationDateTime", "initiatingParty", "recipientParty", "processState", "traceability"})
public class Header32 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgFctn", required = true)
	protected ATMMessageFunction2 messageFunction;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Header32.mmObject();
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
	@XmlElement(name = "PrtcolVrsn", required = true)
	protected Max6Text protocolVersion;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Header32.mmObject();
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
	@XmlElement(name = "XchgId", required = true)
	protected Max3NumericText exchangeIdentification;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Header32.mmObject();
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
	@XmlElement(name = "ReTrnsmssnCntr")
	protected Number reTransmissionCounter;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Header32.mmObject();
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
	@XmlElement(name = "CreDtTm", required = true)
	protected ISODateTime creationDateTime;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Header32.mmObject();
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
	@XmlElement(name = "InitgPty", required = true)
	protected Max35Text initiatingParty;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Header32.mmObject();
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
	@XmlElement(name = "RcptPty")
	protected Max35Text recipientParty;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Header32.mmObject();
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
	@XmlElement(name = "PrcStat")
	protected Max35Text processState;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Header32.mmObject();
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
	@XmlElement(name = "Tracblt")
	protected List<com.tools20022.repository.msg.Traceability4> traceability;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.Header32.mmObject();
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
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Header32.mmMessageFunction, com.tools20022.repository.msg.Header32.mmProtocolVersion, com.tools20022.repository.msg.Header32.mmExchangeIdentification,
						com.tools20022.repository.msg.Header32.mmReTransmissionCounter, com.tools20022.repository.msg.Header32.mmCreationDateTime, com.tools20022.repository.msg.Header32.mmInitiatingParty,
						com.tools20022.repository.msg.Header32.mmRecipientParty, com.tools20022.repository.msg.Header32.mmProcessState, com.tools20022.repository.msg.Header32.mmTraceability);
				messageBuildingBlock_lazy = () -> Arrays.asList(ATMExceptionAcknowledgementV01.mmHeader, ATMExceptionAdviceV01.mmHeader, ATMReconciliationAdviceV02.mmHeader, ATMReconciliationAcknowledgementV02.mmHeader,
						ATMWithdrawalCompletionAdviceV02.mmHeader, ATMDepositCompletionAcknowledgementV01.mmHeader, ATMWithdrawalCompletionAcknowledgementV02.mmHeader, ATMDepositCompletionAdviceV01.mmHeader,
						ATMCompletionAcknowledgementV02.mmHeader, ATMCompletionAdviceV02.mmHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Header32";
				definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
			}
		});
		return mmObject_lazy.get();
	}

	public ATMMessageFunction2 getMessageFunction() {
		return messageFunction;
	}

	public Header32 setMessageFunction(com.tools20022.repository.msg.ATMMessageFunction2 messageFunction) {
		this.messageFunction = Objects.requireNonNull(messageFunction);
		return this;
	}

	public Max6Text getProtocolVersion() {
		return protocolVersion;
	}

	public Header32 setProtocolVersion(Max6Text protocolVersion) {
		this.protocolVersion = Objects.requireNonNull(protocolVersion);
		return this;
	}

	public Max3NumericText getExchangeIdentification() {
		return exchangeIdentification;
	}

	public Header32 setExchangeIdentification(Max3NumericText exchangeIdentification) {
		this.exchangeIdentification = Objects.requireNonNull(exchangeIdentification);
		return this;
	}

	public Optional<Number> getReTransmissionCounter() {
		return reTransmissionCounter == null ? Optional.empty() : Optional.of(reTransmissionCounter);
	}

	public Header32 setReTransmissionCounter(Number reTransmissionCounter) {
		this.reTransmissionCounter = reTransmissionCounter;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public Header32 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Max35Text getInitiatingParty() {
		return initiatingParty;
	}

	public Header32 setInitiatingParty(Max35Text initiatingParty) {
		this.initiatingParty = Objects.requireNonNull(initiatingParty);
		return this;
	}

	public Optional<Max35Text> getRecipientParty() {
		return recipientParty == null ? Optional.empty() : Optional.of(recipientParty);
	}

	public Header32 setRecipientParty(Max35Text recipientParty) {
		this.recipientParty = recipientParty;
		return this;
	}

	public Optional<Max35Text> getProcessState() {
		return processState == null ? Optional.empty() : Optional.of(processState);
	}

	public Header32 setProcessState(Max35Text processState) {
		this.processState = processState;
		return this;
	}

	public List<Traceability4> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public Header32 setTraceability(List<com.tools20022.repository.msg.Traceability4> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}
}