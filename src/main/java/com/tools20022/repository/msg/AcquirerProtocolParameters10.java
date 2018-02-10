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
import com.tools20022.repository.codeset.BatchTransactionType1Code;
import com.tools20022.repository.codeset.TerminalManagementAction3Code;
import com.tools20022.repository.datatype.Max256Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.AcceptorConfiguration;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Acceptor parameters dedicated to the acquirer protocol.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmActionType
 * AcquirerProtocolParameters10.mmActionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmAcquirerIdentification
 * AcquirerProtocolParameters10.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmVersion
 * AcquirerProtocolParameters10.mmVersion}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmApplicationIdentification
 * AcquirerProtocolParameters10.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmHost
 * AcquirerProtocolParameters10.mmHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmOnLineTransaction
 * AcquirerProtocolParameters10.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmOffLineTransaction
 * AcquirerProtocolParameters10.mmOffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmReconciliationExchange
 * AcquirerProtocolParameters10.mmReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmReconciliationByAcquirer
 * AcquirerProtocolParameters10.mmReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmTotalsPerCurrency
 * AcquirerProtocolParameters10.mmTotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmSplitTotals
 * AcquirerProtocolParameters10.mmSplitTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmReconciliationError
 * AcquirerProtocolParameters10.mmReconciliationError}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmCardDataVerification
 * AcquirerProtocolParameters10.mmCardDataVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmNotifyOffLineCancellation
 * AcquirerProtocolParameters10.mmNotifyOffLineCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmBatchTransferContent
 * AcquirerProtocolParameters10.mmBatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmFileTransferBatch
 * AcquirerProtocolParameters10.mmFileTransferBatch}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmBatchDigitalSignature
 * AcquirerProtocolParameters10.mmBatchDigitalSignature}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmMessageItem
 * AcquirerProtocolParameters10.mmMessageItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmProtectCardData
 * AcquirerProtocolParameters10.mmProtectCardData}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10#mmMandatorySecurityTrailer
 * AcquirerProtocolParameters10.mmMandatorySecurityTrailer}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
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
 * "AcquirerProtocolParameters10"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the acquirer protocol."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11
 * AcquirerProtocolParameters11}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9
 * AcquirerProtocolParameters9}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerProtocolParameters10", propOrder = {"actionType", "acquirerIdentification", "version", "applicationIdentification", "host", "onLineTransaction", "offLineTransaction", "reconciliationExchange",
		"reconciliationByAcquirer", "totalsPerCurrency", "splitTotals", "reconciliationError", "cardDataVerification", "notifyOffLineCancellation", "batchTransferContent", "fileTransferBatch", "batchDigitalSignature", "messageItem",
		"protectCardData", "mandatorySecurityTrailer"})
public class AcquirerProtocolParameters10 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "ActnTp", required = true)
	protected TerminalManagementAction3Code actionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TerminalManagementAction3Code
	 * TerminalManagementAction3Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ActnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ActionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of action for the configuration parameters."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmActionType
	 * AcquirerProtocolParameters11.mmActionType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmActionType
	 * AcquirerProtocolParameters9.mmActionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmActionType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "ActnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ActionType";
			definition = "Type of action for the configuration parameters.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmActionType);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmActionType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TerminalManagementAction3Code.mmObject();
		}
	};
	@XmlElement(name = "AcqrrId", required = true)
	protected List<com.tools20022.repository.msg.GenericIdentification53> acquirerIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification53
	 * GenericIdentification53}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcqrrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcquirerIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identification of the acquirer using this protocol."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmAcquirerIdentification
	 * AcquirerProtocolParameters11.mmAcquirerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmAcquirerIdentification
	 * AcquirerProtocolParameters9.mmAcquirerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "AcqrrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerIdentification";
			definition = "Identification of the acquirer using this protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmAcquirerIdentification);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmAcquirerIdentification;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification53.mmObject();
		}
	};
	@XmlElement(name = "Vrsn", required = true)
	protected Max256Text version;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Vrsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Version"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Version of the acquirer protocol parameters."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmVersion
	 * AcquirerProtocolParameters11.mmVersion}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmVersion
	 * AcquirerProtocolParameters9.mmVersion}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmVersion = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "Vrsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Version";
			definition = "Version of the acquirer protocol parameters.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmVersion);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmVersion;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	@XmlElement(name = "ApplId")
	protected List<Max35Text> applicationIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmApplicationIdentification
	 * AcceptorConfiguration.mmApplicationIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ApplId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ApplicationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the payment application, user of the acquirer protocol."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmApplicationIdentification
	 * AcquirerProtocolParameters11.mmApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmApplicationIdentification
	 * AcquirerProtocolParameters9.mmApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmApplicationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application, user of the acquirer protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmApplicationIdentification);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmApplicationIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Hst")
	protected List<com.tools20022.repository.msg.AcquirerHostConfiguration4> host;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration4
	 * AcquirerHostConfiguration4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Hst"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Host"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Acquirer host configuration."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmHost
	 * AcquirerProtocolParameters11.mmHost}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmHost
	 * AcquirerProtocolParameters9.mmHost}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHost = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "Hst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Host";
			definition = "Acquirer host configuration.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmHost);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmHost;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerHostConfiguration4.mmObject();
		}
	};
	@XmlElement(name = "OnLineTx")
	protected AcquirerProtocolParameters8 onLineTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
	 * AcquirerProtocolParameters8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OnLineTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OnLineTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer protocol parameters of transactions performing an online authorisation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmOnLineTransaction
	 * AcquirerProtocolParameters11.mmOnLineTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmOnLineTransaction
	 * AcquirerProtocolParameters9.mmOnLineTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOnLineTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "OnLineTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an online authorisation.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmOnLineTransaction);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmOnLineTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters8.mmObject();
		}
	};
	@XmlElement(name = "OffLineTx")
	protected AcquirerProtocolParameters8 offLineTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters8
	 * AcquirerProtocolParameters8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OffLineTx"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OffLineTransaction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Acquirer protocol parameters of transactions performing an offline authorisation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmOffLineTransaction
	 * AcquirerProtocolParameters11.mmOffLineTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmOffLineTransaction
	 * AcquirerProtocolParameters9.mmOffLineTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOffLineTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "OffLineTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an offline authorisation.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmOffLineTransaction);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmOffLineTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters8.mmObject();
		}
	};
	@XmlElement(name = "RcncltnXchg")
	protected ExchangeConfiguration6 reconciliationExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration6
	 * ExchangeConfiguration6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration parameters of reconciliation exchanges."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmReconciliationExchange
	 * AcquirerProtocolParameters11.mmReconciliationExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmReconciliationExchange
	 * AcquirerProtocolParameters9.mmReconciliationExchange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliationExchange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "RcncltnXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationExchange";
			definition = "Configuration parameters of reconciliation exchanges.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmReconciliationExchange);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmReconciliationExchange;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration6.mmObject();
		}
	};
	@XmlElement(name = "RcncltnByAcqrr")
	protected TrueFalseIndicator reconciliationByAcquirer;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmReconciliationByAcquirer
	 * AcceptorConfiguration.mmReconciliationByAcquirer}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnByAcqrr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationByAcquirer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters11.mmReconciliationByAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters9.mmReconciliationByAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationByAcquirer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmReconciliationByAcquirer;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "RcncltnByAcqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmReconciliationByAcquirer);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmReconciliationByAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "TtlsPerCcy")
	protected TrueFalseIndicator totalsPerCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTotalsPerCurrency
	 * AcceptorConfiguration.mmTotalsPerCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlsPerCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalsPerCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates the reconciliation total amounts are computed per currency."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmTotalsPerCurrency
	 * AcquirerProtocolParameters11.mmTotalsPerCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmTotalsPerCurrency
	 * AcquirerProtocolParameters9.mmTotalsPerCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalsPerCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTotalsPerCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "TtlsPerCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmTotalsPerCurrency);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmTotalsPerCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "SpltTtls")
	protected TrueFalseIndicator splitTotals;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SpltTtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SplitTotals"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates that totals in reconciliation or batch must be split per group of points of interaction and card product profiles when these information are present in the transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmSplitTotals
	 * AcquirerProtocolParameters11.mmSplitTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmSplitTotals
	 * AcquirerProtocolParameters9.mmSplitTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSplitTotals = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "SpltTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTotals";
			definition = "Indicates that totals in reconciliation or batch must be split per group of points of interaction and card product profiles when these information are present in the transactions.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmSplitTotals);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmSplitTotals;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "RcncltnErr")
	protected TrueFalseIndicator reconciliationError;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcncltnErr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReconciliationError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "After an error in a totals of the Reconciliation, the POI sends transactions in error in the BatchTransfer messages."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmReconciliationError
	 * AcquirerProtocolParameters11.mmReconciliationError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmReconciliationError
	 * AcquirerProtocolParameters9.mmReconciliationError}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationError = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "RcncltnErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationError";
			definition = "After an error in a totals of the Reconciliation, the POI sends transactions in error in the BatchTransfer messages.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmReconciliationError);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmReconciliationError;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "CardDataVrfctn")
	protected TrueFalseIndicator cardDataVerification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CardDataVrfctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CardDataVerification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "True if the POI must send card data (protected or plain card data) in the AcceptorCompletionAdvice message following an authorisation exchange."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmCardDataVerification
	 * AcquirerProtocolParameters11.mmCardDataVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmCardDataVerification
	 * AcquirerProtocolParameters9.mmCardDataVerification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardDataVerification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "CardDataVrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataVerification";
			definition = "True if the POI must send card data (protected or plain card data) in the AcceptorCompletionAdvice message following an authorisation exchange.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmCardDataVerification);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmCardDataVerification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "NtfyOffLineCxl")
	protected TrueFalseIndicator notifyOffLineCancellation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfyOffLineCxl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyOffLineCancellation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Send a cancellation advice for offline transactions not yet captured."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmNotifyOffLineCancellation
	 * AcquirerProtocolParameters11.mmNotifyOffLineCancellation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmNotifyOffLineCancellation
	 * AcquirerProtocolParameters9.mmNotifyOffLineCancellation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotifyOffLineCancellation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "NtfyOffLineCxl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyOffLineCancellation";
			definition = "Send a cancellation advice for offline transactions not yet captured.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmNotifyOffLineCancellation);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmNotifyOffLineCancellation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "BtchTrfCntt")
	protected List<BatchTransactionType1Code> batchTransferContent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BatchTransactionType1Code
	 * BatchTransactionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmBatchTransferContent
	 * AcceptorConfiguration.mmBatchTransferContent}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchTrfCntt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchTransferContent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Types of transaction to include in the batch."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmBatchTransferContent
	 * AcquirerProtocolParameters11.mmBatchTransferContent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmBatchTransferContent
	 * AcquirerProtocolParameters9.mmBatchTransferContent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchTransferContent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmBatchTransferContent;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "BtchTrfCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmBatchTransferContent);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmBatchTransferContent;
			minOccurs = 0;
			simpleType_lazy = () -> BatchTransactionType1Code.mmObject();
		}
	};
	@XmlElement(name = "FileTrfBtch")
	protected TrueFalseIndicator fileTransferBatch;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FileTrfBtch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FileTransferBatch"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BatchTransfer are exchanged per file transfer protocol rather than per message."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmFileTransferBatch
	 * AcquirerProtocolParameters11.mmFileTransferBatch}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmFileTransferBatch
	 * AcquirerProtocolParameters9.mmFileTransferBatch}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFileTransferBatch = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "FileTrfBtch";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FileTransferBatch";
			definition = "BatchTransfer are exchanged per file transfer protocol rather than per message.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmFileTransferBatch);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmFileTransferBatch;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "BtchDgtlSgntr")
	protected TrueFalseIndicator batchDigitalSignature;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BtchDgtlSgntr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BatchDigitalSignature"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "BatchTransfer are authenticated by digital signature rather than a MAC (Message Authentication Code)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmBatchDigitalSignature
	 * AcquirerProtocolParameters11.mmBatchDigitalSignature}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmBatchDigitalSignature
	 * AcquirerProtocolParameters9.mmBatchDigitalSignature}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchDigitalSignature = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "BtchDgtlSgntr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchDigitalSignature";
			definition = "BatchTransfer are authenticated by digital signature rather than a MAC (Message Authentication Code).";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmBatchDigitalSignature);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmBatchDigitalSignature;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "MsgItm")
	protected List<com.tools20022.repository.msg.MessageItemCondition1> messageItem;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageItemCondition1
	 * MessageItemCondition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MsgItm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MessageItem"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Configuration of a message item."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmMessageItem
	 * AcquirerProtocolParameters11.mmMessageItem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmMessageItem
	 * AcquirerProtocolParameters9.mmMessageItem}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageItem = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "MsgItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageItem";
			definition = "Configuration of a message item.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmMessageItem);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmMessageItem;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageItemCondition1.mmObject();
		}
	};
	@XmlElement(name = "PrtctCardData", required = true)
	protected TrueFalseIndicator protectCardData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.TrueFalseIndicator
	 * TrueFalseIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmProtectCardData
	 * AcceptorConfiguration.mmProtectCardData}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtctCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProtectCardData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicator to require protection of sensitive card data in messages."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmProtectCardData
	 * AcquirerProtocolParameters11.mmProtectCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmProtectCardData
	 * AcquirerProtocolParameters9.mmProtectCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectCardData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmProtectCardData;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "PrtctCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmProtectCardData);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmProtectCardData;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	@XmlElement(name = "MndtrySctyTrlr")
	protected TrueFalseIndicator mandatorySecurityTrailer;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters10
	 * AcquirerProtocolParameters10}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MndtrySctyTrlr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MandatorySecurityTrailer"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "A security trailer is mandatory in the messages."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters11#mmMandatorySecurityTrailer
	 * AcquirerProtocolParameters11.mmMandatorySecurityTrailer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters9#mmMandatorySecurityTrailer
	 * AcquirerProtocolParameters9.mmMandatorySecurityTrailer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMandatorySecurityTrailer = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters10.mmObject();
			isDerived = false;
			xmlTag = "MndtrySctyTrlr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MandatorySecurityTrailer";
			definition = "A security trailer is mandatory in the messages.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmMandatorySecurityTrailer);
			previousVersion_lazy = () -> AcquirerProtocolParameters9.mmMandatorySecurityTrailer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters10.mmActionType, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmAcquirerIdentification,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmVersion, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmApplicationIdentification,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmHost, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmOnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmOffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmReconciliationExchange,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmTotalsPerCurrency,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmSplitTotals, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmReconciliationError,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmCardDataVerification, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmNotifyOffLineCancellation,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmBatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmFileTransferBatch,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmBatchDigitalSignature, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmMessageItem,
						com.tools20022.repository.msg.AcquirerProtocolParameters10.mmProtectCardData, com.tools20022.repository.msg.AcquirerProtocolParameters10.mmMandatorySecurityTrailer);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerProtocolParameters10";
				definition = "Acceptor parameters dedicated to the acquirer protocol.";
				nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters11.mmObject());
				previousVersion_lazy = () -> AcquirerProtocolParameters9.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TerminalManagementAction3Code getActionType() {
		return actionType;
	}

	public AcquirerProtocolParameters10 setActionType(TerminalManagementAction3Code actionType) {
		this.actionType = Objects.requireNonNull(actionType);
		return this;
	}

	public List<GenericIdentification53> getAcquirerIdentification() {
		return acquirerIdentification == null ? acquirerIdentification = new ArrayList<>() : acquirerIdentification;
	}

	public AcquirerProtocolParameters10 setAcquirerIdentification(List<com.tools20022.repository.msg.GenericIdentification53> acquirerIdentification) {
		this.acquirerIdentification = Objects.requireNonNull(acquirerIdentification);
		return this;
	}

	public Max256Text getVersion() {
		return version;
	}

	public AcquirerProtocolParameters10 setVersion(Max256Text version) {
		this.version = Objects.requireNonNull(version);
		return this;
	}

	public List<Max35Text> getApplicationIdentification() {
		return applicationIdentification == null ? applicationIdentification = new ArrayList<>() : applicationIdentification;
	}

	public AcquirerProtocolParameters10 setApplicationIdentification(List<Max35Text> applicationIdentification) {
		this.applicationIdentification = Objects.requireNonNull(applicationIdentification);
		return this;
	}

	public List<AcquirerHostConfiguration4> getHost() {
		return host == null ? host = new ArrayList<>() : host;
	}

	public AcquirerProtocolParameters10 setHost(List<com.tools20022.repository.msg.AcquirerHostConfiguration4> host) {
		this.host = Objects.requireNonNull(host);
		return this;
	}

	public Optional<AcquirerProtocolParameters8> getOnLineTransaction() {
		return onLineTransaction == null ? Optional.empty() : Optional.of(onLineTransaction);
	}

	public AcquirerProtocolParameters10 setOnLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters8 onLineTransaction) {
		this.onLineTransaction = onLineTransaction;
		return this;
	}

	public Optional<AcquirerProtocolParameters8> getOffLineTransaction() {
		return offLineTransaction == null ? Optional.empty() : Optional.of(offLineTransaction);
	}

	public AcquirerProtocolParameters10 setOffLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters8 offLineTransaction) {
		this.offLineTransaction = offLineTransaction;
		return this;
	}

	public Optional<ExchangeConfiguration6> getReconciliationExchange() {
		return reconciliationExchange == null ? Optional.empty() : Optional.of(reconciliationExchange);
	}

	public AcquirerProtocolParameters10 setReconciliationExchange(com.tools20022.repository.msg.ExchangeConfiguration6 reconciliationExchange) {
		this.reconciliationExchange = reconciliationExchange;
		return this;
	}

	public Optional<TrueFalseIndicator> getReconciliationByAcquirer() {
		return reconciliationByAcquirer == null ? Optional.empty() : Optional.of(reconciliationByAcquirer);
	}

	public AcquirerProtocolParameters10 setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = reconciliationByAcquirer;
		return this;
	}

	public Optional<TrueFalseIndicator> getTotalsPerCurrency() {
		return totalsPerCurrency == null ? Optional.empty() : Optional.of(totalsPerCurrency);
	}

	public AcquirerProtocolParameters10 setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = totalsPerCurrency;
		return this;
	}

	public Optional<TrueFalseIndicator> getSplitTotals() {
		return splitTotals == null ? Optional.empty() : Optional.of(splitTotals);
	}

	public AcquirerProtocolParameters10 setSplitTotals(TrueFalseIndicator splitTotals) {
		this.splitTotals = splitTotals;
		return this;
	}

	public Optional<TrueFalseIndicator> getReconciliationError() {
		return reconciliationError == null ? Optional.empty() : Optional.of(reconciliationError);
	}

	public AcquirerProtocolParameters10 setReconciliationError(TrueFalseIndicator reconciliationError) {
		this.reconciliationError = reconciliationError;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardDataVerification() {
		return cardDataVerification == null ? Optional.empty() : Optional.of(cardDataVerification);
	}

	public AcquirerProtocolParameters10 setCardDataVerification(TrueFalseIndicator cardDataVerification) {
		this.cardDataVerification = cardDataVerification;
		return this;
	}

	public Optional<TrueFalseIndicator> getNotifyOffLineCancellation() {
		return notifyOffLineCancellation == null ? Optional.empty() : Optional.of(notifyOffLineCancellation);
	}

	public AcquirerProtocolParameters10 setNotifyOffLineCancellation(TrueFalseIndicator notifyOffLineCancellation) {
		this.notifyOffLineCancellation = notifyOffLineCancellation;
		return this;
	}

	public List<BatchTransactionType1Code> getBatchTransferContent() {
		return batchTransferContent == null ? batchTransferContent = new ArrayList<>() : batchTransferContent;
	}

	public AcquirerProtocolParameters10 setBatchTransferContent(List<BatchTransactionType1Code> batchTransferContent) {
		this.batchTransferContent = Objects.requireNonNull(batchTransferContent);
		return this;
	}

	public Optional<TrueFalseIndicator> getFileTransferBatch() {
		return fileTransferBatch == null ? Optional.empty() : Optional.of(fileTransferBatch);
	}

	public AcquirerProtocolParameters10 setFileTransferBatch(TrueFalseIndicator fileTransferBatch) {
		this.fileTransferBatch = fileTransferBatch;
		return this;
	}

	public Optional<TrueFalseIndicator> getBatchDigitalSignature() {
		return batchDigitalSignature == null ? Optional.empty() : Optional.of(batchDigitalSignature);
	}

	public AcquirerProtocolParameters10 setBatchDigitalSignature(TrueFalseIndicator batchDigitalSignature) {
		this.batchDigitalSignature = batchDigitalSignature;
		return this;
	}

	public List<MessageItemCondition1> getMessageItem() {
		return messageItem == null ? messageItem = new ArrayList<>() : messageItem;
	}

	public AcquirerProtocolParameters10 setMessageItem(List<com.tools20022.repository.msg.MessageItemCondition1> messageItem) {
		this.messageItem = Objects.requireNonNull(messageItem);
		return this;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public AcquirerProtocolParameters10 setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = Objects.requireNonNull(protectCardData);
		return this;
	}

	public Optional<TrueFalseIndicator> getMandatorySecurityTrailer() {
		return mandatorySecurityTrailer == null ? Optional.empty() : Optional.of(mandatorySecurityTrailer);
	}

	public AcquirerProtocolParameters10 setMandatorySecurityTrailer(TrueFalseIndicator mandatorySecurityTrailer) {
		this.mandatorySecurityTrailer = mandatorySecurityTrailer;
		return this;
	}
}