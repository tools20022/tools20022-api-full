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
import com.tools20022.repository.area.caam.*;
import com.tools20022.repository.area.catp.*;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Max3NumericText;
import com.tools20022.repository.datatype.Max6Text;
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
 * <li>{@linkplain com.tools20022.repository.msg.Header20#mmMessageFunction
 * Header20.mmMessageFunction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header20#mmProtocolVersion
 * Header20.mmProtocolVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Header20#mmExchangeIdentification
 * Header20.mmExchangeIdentification}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header20#mmCreationDateTime
 * Header20.mmCreationDateTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header20#mmInitiatingParty
 * Header20.mmInitiatingParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header20#mmRecipientParty
 * Header20.mmRecipientParty}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header20#mmProcessState
 * Header20.mmProcessState}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header20#mmTraceability
 * Header20.mmTraceability}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMAcknowledgementV01#mmHeader
 * HostToATMAcknowledgementV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticResponseV01#mmHeader
 * ATMDiagnosticResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDiagnosticRequestV01#mmHeader
 * ATMDiagnosticRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadResponseV01#mmHeader
 * ATMKeyDownloadResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceReportV01#mmHeader
 * ATMDeviceReportV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.HostToATMRequestV01#mmHeader
 * HostToATMRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMKeyDownloadRequestV01#mmHeader
 * ATMKeyDownloadRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.caam.ATMDeviceControlV01#mmHeader
 * ATMDeviceControlV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryResponseV01#mmHeader
 * ATMInquiryResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMInquiryRequestV01#mmHeader
 * ATMInquiryRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalResponseV01#mmHeader
 * ATMWithdrawalResponseV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMWithdrawalRequestV01#mmHeader
 * ATMWithdrawalRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementRequestV01#mmHeader
 * ATMPINManagementRequestV01.mmHeader}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.catp.ATMPINManagementResponseV01#mmHeader
 * ATMPINManagementResponseV01.mmHeader}</li>
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
 * "Header20"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Information related to the protocol management on a segment of the path from the ATM to the acquirer."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Header22 Header22}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Header21 Header21}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Header13
 * Header13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Header20", propOrder = {"messageFunction", "protocolVersion", "exchangeIdentification", "creationDateTime", "initiatingParty", "recipientParty", "processState", "traceability"})
public class Header20 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ATMMessageFunction1 messageFunction;
	/**
	 * Identifies the type of process related to the message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.ATMMessageFunction1
	 * ATMMessageFunction1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header22#mmMessageFunction
	 * Header22.mmMessageFunction}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmMessageFunction
	 * Header21.mmMessageFunction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header13#mmMessageFunction
	 * Header13.mmMessageFunction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMessageFunction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header20.mmObject();
			isDerived = false;
			xmlTag = "MsgFctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageFunction";
			definition = "Identifies the type of process related to the message.";
			nextVersions_lazy = () -> Arrays.asList(Header22.mmMessageFunction, Header21.mmMessageFunction);
			previousVersion_lazy = () -> Header13.mmMessageFunction;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.ATMMessageFunction1.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header22#mmProtocolVersion
	 * Header22.mmProtocolVersion}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmProtocolVersion
	 * Header21.mmProtocolVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header13#mmProtocolVersion
	 * Header13.mmProtocolVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtocolVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header20.mmObject();
			isDerived = false;
			xmlTag = "PrtcolVrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtocolVersion";
			definition = "Version of the ATM protocol specifications.";
			nextVersions_lazy = () -> Arrays.asList(Header22.mmProtocolVersion, Header21.mmProtocolVersion);
			previousVersion_lazy = () -> Header13.mmProtocolVersion;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header22#mmExchangeIdentification
	 * Header22.mmExchangeIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header21#mmExchangeIdentification
	 * Header21.mmExchangeIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header13#mmExchangeIdentification
	 * Header13.mmExchangeIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExchangeIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header20.mmObject();
			isDerived = false;
			xmlTag = "XchgId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExchangeIdentification";
			definition = "Unique identification of an exchange occurrence.";
			nextVersions_lazy = () -> Arrays.asList(Header22.mmExchangeIdentification, Header21.mmExchangeIdentification);
			previousVersion_lazy = () -> Header13.mmExchangeIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max3NumericText.mmObject();
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header22#mmCreationDateTime
	 * Header22.mmCreationDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Header21#mmCreationDateTime
	 * Header21.mmCreationDateTime}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header13#mmCreationDateTime
	 * Header13.mmCreationDateTime}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreationDateTime = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header20.mmObject();
			isDerived = false;
			xmlTag = "CreDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreationDateTime";
			definition = "Date and time at which the message was created.";
			nextVersions_lazy = () -> Arrays.asList(Header22.mmCreationDateTime, Header21.mmCreationDateTime);
			previousVersion_lazy = () -> Header13.mmCreationDateTime;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header22#mmInitiatingParty
	 * Header22.mmInitiatingParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmInitiatingParty
	 * Header21.mmInitiatingParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header13#mmInitiatingParty
	 * Header13.mmInitiatingParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInitiatingParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header20.mmObject();
			isDerived = false;
			xmlTag = "InitgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InitiatingParty";
			definition = "Unique identification of the partner that has initiated the exchange.";
			nextVersions_lazy = () -> Arrays.asList(Header22.mmInitiatingParty, Header21.mmInitiatingParty);
			previousVersion_lazy = () -> Header13.mmInitiatingParty;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header22#mmRecipientParty
	 * Header22.mmRecipientParty}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmRecipientParty
	 * Header21.mmRecipientParty}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header13#mmRecipientParty
	 * Header13.mmRecipientParty}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRecipientParty = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header20.mmObject();
			isDerived = false;
			xmlTag = "RcptPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecipientParty";
			definition = "Unique identification of the partner that is the recipient of the message exchange.";
			nextVersions_lazy = () -> Arrays.asList(Header22.mmRecipientParty, Header21.mmRecipientParty);
			previousVersion_lazy = () -> Header13.mmRecipientParty;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header22#mmProcessState
	 * Header22.mmProcessState}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessState = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header20.mmObject();
			isDerived = false;
			xmlTag = "PrcStat";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessState";
			definition = "State of the sender of the message inside the process flow.";
			nextVersions_lazy = () -> Arrays.asList(Header22.mmProcessState);
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Header20
	 * Header20}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Header22#mmTraceability
	 * Header22.mmTraceability}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.Header21#mmTraceability
	 * Header21.mmTraceability}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Header13#mmTraceability
	 * Header13.mmTraceability}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTraceability = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> Header20.mmObject();
			isDerived = false;
			xmlTag = "Tracblt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Traceability";
			definition = "Identification of partners involved in exchange from the merchant to the issuer, with the relative timestamp of their exchanges.";
			nextVersions_lazy = () -> Arrays.asList(Header22.mmTraceability, Header21.mmTraceability);
			previousVersion_lazy = () -> Header13.mmTraceability;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.Traceability4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Header20.mmMessageFunction, Header20.mmProtocolVersion, Header20.mmExchangeIdentification, Header20.mmCreationDateTime, Header20.mmInitiatingParty, Header20.mmRecipientParty,
						Header20.mmProcessState, Header20.mmTraceability);
				messageBuildingBlock_lazy = () -> Arrays.asList(HostToATMAcknowledgementV01.mmHeader, ATMDiagnosticResponseV01.mmHeader, ATMDiagnosticRequestV01.mmHeader, ATMKeyDownloadResponseV01.mmHeader, ATMDeviceReportV01.mmHeader,
						HostToATMRequestV01.mmHeader, ATMKeyDownloadRequestV01.mmHeader, ATMDeviceControlV01.mmHeader, ATMInquiryResponseV01.mmHeader, ATMInquiryRequestV01.mmHeader, ATMWithdrawalResponseV01.mmHeader,
						ATMWithdrawalRequestV01.mmHeader, ATMPINManagementRequestV01.mmHeader, ATMPINManagementResponseV01.mmHeader);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Header20";
				definition = "Information related to the protocol management on a segment of the path from the ATM to the acquirer.";
				nextVersions_lazy = () -> Arrays.asList(Header22.mmObject(), Header21.mmObject());
				previousVersion_lazy = () -> Header13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MsgFctn", required = true)
	public ATMMessageFunction1 getMessageFunction() {
		return messageFunction;
	}

	public void setMessageFunction(com.tools20022.repository.msg.ATMMessageFunction1 messageFunction) {
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