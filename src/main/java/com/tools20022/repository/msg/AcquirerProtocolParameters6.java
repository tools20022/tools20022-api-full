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
import com.tools20022.repository.codeset.BatchTransactionType1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.TrueFalseIndicator;
import com.tools20022.repository.entity.AcceptorConfiguration;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

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
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmAcquirerIdentification
 * AcquirerProtocolParameters6.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmApplicationIdentification
 * AcquirerProtocolParameters6.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmHost
 * AcquirerProtocolParameters6.mmHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmOnLineTransaction
 * AcquirerProtocolParameters6.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmOffLineTransaction
 * AcquirerProtocolParameters6.mmOffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmReconciliationExchange
 * AcquirerProtocolParameters6.mmReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmReconciliationByAcquirer
 * AcquirerProtocolParameters6.mmReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmTotalsPerCurrency
 * AcquirerProtocolParameters6.mmTotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmSplitTotals
 * AcquirerProtocolParameters6.mmSplitTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmCardDataVerification
 * AcquirerProtocolParameters6.mmCardDataVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmNotifyOffLineCancellation
 * AcquirerProtocolParameters6.mmNotifyOffLineCancellation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmBatchTransferContent
 * AcquirerProtocolParameters6.mmBatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmMessageItem
 * AcquirerProtocolParameters6.mmMessageItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmProtectCardData
 * AcquirerProtocolParameters6.mmProtectCardData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
 * AcceptorConfiguration}</li>
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
 * "AcquirerProtocolParameters6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the acquirer protocol."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7
 * AcquirerProtocolParameters7}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
 * AcquirerProtocolParameters3}</li>
 * </ul>
 */
public class AcquirerProtocolParameters6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.GenericIdentification32> acquirerIdentification;
	/**
	 * Identification of the acquirer using this protocol.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.GenericIdentification32
	 * GenericIdentification32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmOtherIdentification
	 * PartyIdentificationInformation.mmOtherIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmAcquirerIdentification
	 * AcquirerProtocolParameters7.mmAcquirerIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmAcquirerIdentification
	 * AcquirerProtocolParameters3.mmAcquirerIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "AcqrrId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerIdentification";
			definition = "Identification of the acquirer using this protocol.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmAcquirerIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmAcquirerIdentification;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification32.mmObject();
		}
	};
	protected List<Max35Text> applicationIdentification;
	/**
	 * Identification of the payment application, user of the acquirer protocol.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmApplicationIdentification
	 * AcquirerProtocolParameters7.mmApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmApplicationIdentification
	 * AcquirerProtocolParameters3.mmApplicationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmApplicationIdentification;
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application, user of the acquirer protocol.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmApplicationIdentification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmApplicationIdentification;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.AcquirerHostConfiguration2> host;
	/**
	 * Acquirer host configuration.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerHostConfiguration2
	 * AcquirerHostConfiguration2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration#mmTerminalManagementSystem
	 * AcceptorConfiguration.mmTerminalManagementSystem}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmHost
	 * AcquirerProtocolParameters7.mmHost}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmHost
	 * AcquirerProtocolParameters3.mmHost}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHost = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "Hst";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Host";
			definition = "Acquirer host configuration.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmHost);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmHost;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerHostConfiguration2.mmObject();
		}
	};
	protected AcquirerProtocolParameters5 onLineTransaction;
	/**
	 * Acquirer protocol parameters of transactions performing an online
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5
	 * AcquirerProtocolParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmOnLineTransaction
	 * AcquirerProtocolParameters7.mmOnLineTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmOnLineTransaction
	 * AcquirerProtocolParameters3.mmOnLineTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOnLineTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "OnLineTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an online authorisation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmOnLineTransaction);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmOnLineTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters5.mmObject();
		}
	};
	protected AcquirerProtocolParameters5 offLineTransaction;
	/**
	 * Acquirer protocol parameters of transactions performing an offline
	 * authorisation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters5
	 * AcquirerProtocolParameters5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmOffLineTransaction
	 * AcquirerProtocolParameters7.mmOffLineTransaction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmOffLineTransaction
	 * AcquirerProtocolParameters3.mmOffLineTransaction}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOffLineTransaction = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "OffLineTx";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an offline authorisation.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmOffLineTransaction);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmOffLineTransaction;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters5.mmObject();
		}
	};
	protected ExchangeConfiguration4 reconciliationExchange;
	/**
	 * Configuration parameters of reconciliation exchanges.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration4
	 * ExchangeConfiguration4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmReconciliationExchange
	 * AcquirerProtocolParameters7.mmReconciliationExchange}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmReconciliationExchange
	 * AcquirerProtocolParameters3.mmReconciliationExchange}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliationExchange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "RcncltnXchg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationExchange";
			definition = "Configuration parameters of reconciliation exchanges.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmReconciliationExchange);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmReconciliationExchange;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration4.mmObject();
		}
	};
	protected TrueFalseIndicator reconciliationByAcquirer;
	/**
	 * Indicates the reconciliation period is assigned by the acquirer instead
	 * of the acceptor.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters7.mmReconciliationByAcquirer}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters3.mmReconciliationByAcquirer}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationByAcquirer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmReconciliationByAcquirer;
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "RcncltnByAcqrr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmReconciliationByAcquirer);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmReconciliationByAcquirer;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator totalsPerCurrency;
	/**
	 * Indicates the reconciliation total amounts are computed per currency.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmTotalsPerCurrency
	 * AcquirerProtocolParameters7.mmTotalsPerCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmTotalsPerCurrency
	 * AcquirerProtocolParameters3.mmTotalsPerCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalsPerCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmTotalsPerCurrency;
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "TtlsPerCcy";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmTotalsPerCurrency);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmTotalsPerCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator splitTotals;
	/**
	 * Indicates that totals in reconciliation or batch must be split per group
	 * of points of interaction and card product profiles when these
	 * informations are present in the transactions.
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * "Indicates that totals in reconciliation or batch must be split per group of points of interaction and card product profiles when these informations are present in the transactions."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmSplitTotals
	 * AcquirerProtocolParameters7.mmSplitTotals}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmSplitTotals
	 * AcquirerProtocolParameters3.mmSplitTotals}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSplitTotals = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "SpltTtls";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTotals";
			definition = "Indicates that totals in reconciliation or batch must be split per group of points of interaction and card product profiles when these informations are present in the transactions.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmSplitTotals);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmSplitTotals;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator cardDataVerification;
	/**
	 * Indicates that response messages and an AcceptorCompletionAdvice message
	 * following an authorisation exchange must contain protected or plain card
	 * data.
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * "Indicates that response messages and an AcceptorCompletionAdvice message following an authorisation exchange must contain protected or plain card data."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmCardDataVerification
	 * AcquirerProtocolParameters7.mmCardDataVerification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmCardDataVerification
	 * AcquirerProtocolParameters3.mmCardDataVerification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardDataVerification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "CardDataVrfctn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataVerification";
			definition = "Indicates that response messages and an AcceptorCompletionAdvice message following an authorisation exchange must contain protected or plain card data.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmCardDataVerification);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmCardDataVerification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected TrueFalseIndicator notifyOffLineCancellation;
	/**
	 * Send a cancellation advice for offline transactions not yet captured.
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmNotifyOffLineCancellation
	 * AcquirerProtocolParameters7.mmNotifyOffLineCancellation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotifyOffLineCancellation = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "NtfyOffLineCxl";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyOffLineCancellation";
			definition = "Send a cancellation advice for offline transactions not yet captured.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmNotifyOffLineCancellation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};
	protected List<BatchTransactionType1Code> batchTransferContent;
	/**
	 * Types of transaction to include in the batch.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmBatchTransferContent
	 * AcquirerProtocolParameters7.mmBatchTransferContent}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmBatchTransferContent
	 * AcquirerProtocolParameters3.mmBatchTransferContent}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchTransferContent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmBatchTransferContent;
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "BtchTrfCntt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmBatchTransferContent);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmBatchTransferContent;
			minOccurs = 0;
			simpleType_lazy = () -> BatchTransactionType1Code.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.MessageItemCondition1> messageItem;
	/**
	 * Configuration of a message item.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MessageItemCondition1
	 * MessageItemCondition1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmMessageItem
	 * AcquirerProtocolParameters7.mmMessageItem}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmMessageItem
	 * AcquirerProtocolParameters3.mmMessageItem}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageItem = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "MsgItm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageItem";
			definition = "Configuration of a message item.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmMessageItem);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmMessageItem;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MessageItemCondition1.mmObject();
		}
	};
	protected TrueFalseIndicator protectCardData;
	/**
	 * Indicator to require protection of sensitive card data in messages.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
	 * AcquirerProtocolParameters6}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters7#mmProtectCardData
	 * AcquirerProtocolParameters7.mmProtectCardData}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmProtectCardData
	 * AcquirerProtocolParameters3.mmProtectCardData}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectCardData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.AcceptorConfiguration.mmProtectCardData;
			componentContext_lazy = () -> AcquirerProtocolParameters6.mmObject();
			isDerived = false;
			xmlTag = "PrtctCardData";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			nextVersions_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters7.mmProtectCardData);
			previousVersion_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmProtectCardData;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters6.mmAcquirerIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters6.mmApplicationIdentification,
						com.tools20022.repository.msg.AcquirerProtocolParameters6.mmHost, com.tools20022.repository.msg.AcquirerProtocolParameters6.mmOnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters6.mmOffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters6.mmReconciliationExchange,
						com.tools20022.repository.msg.AcquirerProtocolParameters6.mmReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters6.mmTotalsPerCurrency,
						com.tools20022.repository.msg.AcquirerProtocolParameters6.mmSplitTotals, com.tools20022.repository.msg.AcquirerProtocolParameters6.mmCardDataVerification,
						com.tools20022.repository.msg.AcquirerProtocolParameters6.mmNotifyOffLineCancellation, com.tools20022.repository.msg.AcquirerProtocolParameters6.mmBatchTransferContent,
						com.tools20022.repository.msg.AcquirerProtocolParameters6.mmMessageItem, com.tools20022.repository.msg.AcquirerProtocolParameters6.mmProtectCardData);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "AcquirerProtocolParameters6";
				definition = "Acceptor parameters dedicated to the acquirer protocol.";
				nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters7.mmObject());
				previousVersion_lazy = () -> AcquirerProtocolParameters3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<GenericIdentification32> getAcquirerIdentification() {
		return acquirerIdentification;
	}

	public void setAcquirerIdentification(List<com.tools20022.repository.msg.GenericIdentification32> acquirerIdentification) {
		this.acquirerIdentification = acquirerIdentification;
	}

	public List<Max35Text> getApplicationIdentification() {
		return applicationIdentification;
	}

	public void setApplicationIdentification(List<Max35Text> applicationIdentification) {
		this.applicationIdentification = applicationIdentification;
	}

	public List<AcquirerHostConfiguration2> getHost() {
		return host;
	}

	public void setHost(List<com.tools20022.repository.msg.AcquirerHostConfiguration2> host) {
		this.host = host;
	}

	public AcquirerProtocolParameters5 getOnLineTransaction() {
		return onLineTransaction;
	}

	public void setOnLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters5 onLineTransaction) {
		this.onLineTransaction = onLineTransaction;
	}

	public AcquirerProtocolParameters5 getOffLineTransaction() {
		return offLineTransaction;
	}

	public void setOffLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters5 offLineTransaction) {
		this.offLineTransaction = offLineTransaction;
	}

	public ExchangeConfiguration4 getReconciliationExchange() {
		return reconciliationExchange;
	}

	public void setReconciliationExchange(com.tools20022.repository.msg.ExchangeConfiguration4 reconciliationExchange) {
		this.reconciliationExchange = reconciliationExchange;
	}

	public TrueFalseIndicator getReconciliationByAcquirer() {
		return reconciliationByAcquirer;
	}

	public void setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = reconciliationByAcquirer;
	}

	public TrueFalseIndicator getTotalsPerCurrency() {
		return totalsPerCurrency;
	}

	public void setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = totalsPerCurrency;
	}

	public TrueFalseIndicator getSplitTotals() {
		return splitTotals;
	}

	public void setSplitTotals(TrueFalseIndicator splitTotals) {
		this.splitTotals = splitTotals;
	}

	public TrueFalseIndicator getCardDataVerification() {
		return cardDataVerification;
	}

	public void setCardDataVerification(TrueFalseIndicator cardDataVerification) {
		this.cardDataVerification = cardDataVerification;
	}

	public TrueFalseIndicator getNotifyOffLineCancellation() {
		return notifyOffLineCancellation;
	}

	public void setNotifyOffLineCancellation(TrueFalseIndicator notifyOffLineCancellation) {
		this.notifyOffLineCancellation = notifyOffLineCancellation;
	}

	public List<BatchTransactionType1Code> getBatchTransferContent() {
		return batchTransferContent;
	}

	public void setBatchTransferContent(List<BatchTransactionType1Code> batchTransferContent) {
		this.batchTransferContent = batchTransferContent;
	}

	public List<MessageItemCondition1> getMessageItem() {
		return messageItem;
	}

	public void setMessageItem(List<com.tools20022.repository.msg.MessageItemCondition1> messageItem) {
		this.messageItem = messageItem;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public void setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = protectCardData;
	}
}