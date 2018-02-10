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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.cain.AcquirerRejection;
import com.tools20022.repository.codeset.MessageFunction6Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.datatype.Max6Text;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of characteristics related to the protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header19#mmMessageFunction
 * Header19.mmMessageFunction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header19#mmOriginalMessageFunction
 * Header19.mmOriginalMessageFunction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header19#mmProtocolVersion
 * Header19.mmProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header19#mmExchangeIdentification
 * Header19.mmExchangeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header19#mmReTransmissionCounter
 * Header19.mmReTransmissionCounter}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header19#mmCreationDateTime
 * Header19.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header19#mmInitiatingParty
 * Header19.mmInitiatingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header19#mmRecipientParty
 * Header19.mmRecipientParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header19#mmTraceability
 * Header19.mmTraceability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.cain.AcquirerRejection#mmHeader
 * AcquirerRejection.mmHeader}</li>
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
 * "Header19"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Set of characteristics related to the protocol."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Header18
 * Header18}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Header19", propOrder = {"messageFunction", "originalMessageFunction", "protocolVersion", "exchangeIdentification", "reTransmissionCounter", "creationDateTime", "initiatingParty", "recipientParty", "traceability"})
public class Header19 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MsgFctn", required = true)
	protected MessageFunction6Code messageFunction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header19
	 * Header19}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header18#mmMessageFunction
	 * Header18.mmMessageFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header19.mmObject();
			isDerived = false;
			xmlTag = "MsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageFunction";
			definition = "Identifies the type of process related to the message.";
			previousVersion_lazy = () -> Header18.mmMessageFunction;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageFunction6Code.mmObject();
		}
	};
	@XmlElement(name = "OrgnlMsgFctn")
	protected MessageFunction6Code originalMessageFunction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageFunction6Code
	 * MessageFunction6Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header19
	 * Header19}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgFctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageFunction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the type of process related to the message which has to be reversed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header18#mmOriginalMessageFunction
	 * Header18.mmOriginalMessageFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOriginalMessageFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header19.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageFunction";
			definition = "Identifies the type of process related to the message which has to be reversed.";
			previousVersion_lazy = () -> Header18.mmOriginalMessageFunction;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MessageFunction6Code.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header19
	 * Header19}</li>
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
	 * definition} = "Version of the acquirer to issuer protocol specifications"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header18#mmProtocolVersion
	 * Header18.mmProtocolVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtocolVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header19.mmObject();
			isDerived = false;
			xmlTag = "PrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolVersion";
			definition = "Version of the acquirer to issuer protocol specifications";
			previousVersion_lazy = () -> Header18.mmProtocolVersion;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header19
	 * Header19}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header18#mmExchangeIdentification
	 * Header18.mmExchangeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header19.mmObject();
			isDerived = false;
			xmlTag = "XchgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeIdentification";
			definition = "Unique identification of an exchange occurrence.";
			previousVersion_lazy = () -> Header18.mmExchangeIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
		}
	};
	@XmlElement(name = "ReTrnsmssnCntr")
	protected Max3NumericText reTransmissionCounter;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header19
	 * Header19}</li>
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
	 * "Number of retransmission of the message. Incremented by 1 for each retransmission."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header18#mmReTransmissionCounter
	 * Header18.mmReTransmissionCounter}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReTransmissionCounter = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header19.mmObject();
			isDerived = false;
			xmlTag = "ReTrnsmssnCntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReTransmissionCounter";
			definition = "Number of retransmission of the message. Incremented by 1 for each retransmission.";
			previousVersion_lazy = () -> Header18.mmReTransmissionCounter;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max3NumericText.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header19
	 * Header19}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header18#mmCreationDateTime
	 * Header18.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header19.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			previousVersion_lazy = () -> Header18.mmCreationDateTime;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "InitgPty")
	protected GenericIdentification73 initiatingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73
	 * GenericIdentification73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header19
	 * Header19}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header18#mmInitiatingParty
	 * Header18.mmInitiatingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInitiatingParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header19.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Unique identification of the partner that has initiated the exchange.";
			previousVersion_lazy = () -> Header18.mmInitiatingParty;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification73.mmObject();
		}
	};
	@XmlElement(name = "RcptPty")
	protected GenericIdentification73 recipientParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification73
	 * GenericIdentification73}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header19
	 * Header19}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header18#mmRecipientParty
	 * Header18.mmRecipientParty}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRecipientParty = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header19.mmObject();
			isDerived = false;
			xmlTag = "RcptPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientParty";
			definition = "Unique identification of the partner that is the recipient of the message exchange.";
			previousVersion_lazy = () -> Header18.mmRecipientParty;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification73.mmObject();
		}
	};
	@XmlElement(name = "Tracblt")
	protected List<com.tools20022.repository.msg.Traceability3> traceability;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Traceability3
	 * Traceability3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header19
	 * Header19}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header18#mmTraceability
	 * Header18.mmTraceability}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTraceability = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Header19.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.";
			previousVersion_lazy = () -> Header18.mmTraceability;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Traceability3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Header19.mmMessageFunction, com.tools20022.repository.msg.Header19.mmOriginalMessageFunction, com.tools20022.repository.msg.Header19.mmProtocolVersion,
						com.tools20022.repository.msg.Header19.mmExchangeIdentification, com.tools20022.repository.msg.Header19.mmReTransmissionCounter, com.tools20022.repository.msg.Header19.mmCreationDateTime,
						com.tools20022.repository.msg.Header19.mmInitiatingParty, com.tools20022.repository.msg.Header19.mmRecipientParty, com.tools20022.repository.msg.Header19.mmTraceability);
				messageBuildingBlock_lazy = () -> Arrays.asList(AcquirerRejection.mmHeader);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Header19";
				definition = "Set of characteristics related to the protocol.";
				previousVersion_lazy = () -> Header18.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public MessageFunction6Code getMessageFunction() {
		return messageFunction;
	}

	public Header19 setMessageFunction(MessageFunction6Code messageFunction) {
		this.messageFunction = Objects.requireNonNull(messageFunction);
		return this;
	}

	public Optional<MessageFunction6Code> getOriginalMessageFunction() {
		return originalMessageFunction == null ? Optional.empty() : Optional.of(originalMessageFunction);
	}

	public Header19 setOriginalMessageFunction(MessageFunction6Code originalMessageFunction) {
		this.originalMessageFunction = originalMessageFunction;
		return this;
	}

	public Max6Text getProtocolVersion() {
		return protocolVersion;
	}

	public Header19 setProtocolVersion(Max6Text protocolVersion) {
		this.protocolVersion = Objects.requireNonNull(protocolVersion);
		return this;
	}

	public Max3NumericText getExchangeIdentification() {
		return exchangeIdentification;
	}

	public Header19 setExchangeIdentification(Max3NumericText exchangeIdentification) {
		this.exchangeIdentification = Objects.requireNonNull(exchangeIdentification);
		return this;
	}

	public Optional<Max3NumericText> getReTransmissionCounter() {
		return reTransmissionCounter == null ? Optional.empty() : Optional.of(reTransmissionCounter);
	}

	public Header19 setReTransmissionCounter(Max3NumericText reTransmissionCounter) {
		this.reTransmissionCounter = reTransmissionCounter;
		return this;
	}

	public ISODateTime getCreationDateTime() {
		return creationDateTime;
	}

	public Header19 setCreationDateTime(ISODateTime creationDateTime) {
		this.creationDateTime = Objects.requireNonNull(creationDateTime);
		return this;
	}

	public Optional<GenericIdentification73> getInitiatingParty() {
		return initiatingParty == null ? Optional.empty() : Optional.of(initiatingParty);
	}

	public Header19 setInitiatingParty(com.tools20022.repository.msg.GenericIdentification73 initiatingParty) {
		this.initiatingParty = initiatingParty;
		return this;
	}

	public Optional<GenericIdentification73> getRecipientParty() {
		return recipientParty == null ? Optional.empty() : Optional.of(recipientParty);
	}

	public Header19 setRecipientParty(com.tools20022.repository.msg.GenericIdentification73 recipientParty) {
		this.recipientParty = recipientParty;
		return this;
	}

	public List<Traceability3> getTraceability() {
		return traceability == null ? traceability = new ArrayList<>() : traceability;
	}

	public Header19 setTraceability(List<com.tools20022.repository.msg.Traceability3> traceability) {
		this.traceability = Objects.requireNonNull(traceability);
		return this;
	}
}