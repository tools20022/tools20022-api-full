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
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmAcquirerIdentification
 * AcquirerProtocolParameters3.mmAcquirerIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmApplicationIdentification
 * AcquirerProtocolParameters3.mmApplicationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmHost
 * AcquirerProtocolParameters3.mmHost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmOnLineTransaction
 * AcquirerProtocolParameters3.mmOnLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmOffLineTransaction
 * AcquirerProtocolParameters3.mmOffLineTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmReconciliationExchange
 * AcquirerProtocolParameters3.mmReconciliationExchange}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmReconciliationByAcquirer
 * AcquirerProtocolParameters3.mmReconciliationByAcquirer}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmTotalsPerCurrency
 * AcquirerProtocolParameters3.mmTotalsPerCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmSplitTotals
 * AcquirerProtocolParameters3.mmSplitTotals}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmCardDataVerification
 * AcquirerProtocolParameters3.mmCardDataVerification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmBatchTransferContent
 * AcquirerProtocolParameters3.mmBatchTransferContent}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmMessageItem
 * AcquirerProtocolParameters3.mmMessageItem}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3#mmProtectCardData
 * AcquirerProtocolParameters3.mmProtectCardData}</li>
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
 * "AcquirerProtocolParameters3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Acceptor parameters dedicated to the acquirer protocol."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6
 * AcquirerProtocolParameters6}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters1
 * AcquirerProtocolParameters1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcquirerProtocolParameters3", propOrder = {"acquirerIdentification", "applicationIdentification", "host", "onLineTransaction", "offLineTransaction", "reconciliationExchange", "reconciliationByAcquirer",
		"totalsPerCurrency", "splitTotals", "cardDataVerification", "batchTransferContent", "messageItem", "protectCardData"})
public class AcquirerProtocolParameters3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcqrrId", required = true)
	protected List<com.tools20022.repository.msg.GenericIdentification32> acquirerIdentification;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmAcquirerIdentification
	 * AcquirerProtocolParameters6.mmAcquirerIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAcquirerIdentification = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmOtherIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "AcqrrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcquirerIdentification";
			definition = "Identification of the acquirer using this protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmAcquirerIdentification);
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.GenericIdentification32.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmApplicationIdentification
	 * AcquirerProtocolParameters6.mmApplicationIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmApplicationIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmApplicationIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "ApplId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ApplicationIdentification";
			definition = "Identification of the payment application, user of the acquirer protocol.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmApplicationIdentification);
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "Hst")
	protected List<com.tools20022.repository.msg.AcquirerHostConfiguration2> host;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmHost
	 * AcquirerProtocolParameters6.mmHost}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmHost = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTerminalManagementSystem;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "Hst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Host";
			definition = "Acquirer host configuration.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmHost);
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerHostConfiguration2.mmObject();
		}
	};
	@XmlElement(name = "OnLineTx")
	protected AcquirerProtocolParameters4 onLineTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4
	 * AcquirerProtocolParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmOnLineTransaction
	 * AcquirerProtocolParameters6.mmOnLineTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOnLineTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "OnLineTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OnLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an online authorisation.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmOnLineTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters4.mmObject();
		}
	};
	@XmlElement(name = "OffLineTx")
	protected AcquirerProtocolParameters4 offLineTransaction;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters4
	 * AcquirerProtocolParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmOffLineTransaction
	 * AcquirerProtocolParameters6.mmOffLineTransaction}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOffLineTransaction = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "OffLineTx";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OffLineTransaction";
			definition = "Acquirer protocol parameters of transactions performing an offline authorisation.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmOffLineTransaction);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters4.mmObject();
		}
	};
	@XmlElement(name = "RcncltnXchg")
	protected ExchangeConfiguration2 reconciliationExchange;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ExchangeConfiguration2
	 * ExchangeConfiguration2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AcceptorConfiguration
	 * AcceptorConfiguration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmReconciliationExchange
	 * AcquirerProtocolParameters6.mmReconciliationExchange}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReconciliationExchange = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AcceptorConfiguration.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "RcncltnXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationExchange";
			definition = "Configuration parameters of reconciliation exchanges.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmReconciliationExchange);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ExchangeConfiguration2.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmReconciliationByAcquirer
	 * AcquirerProtocolParameters6.mmReconciliationByAcquirer}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReconciliationByAcquirer = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmReconciliationByAcquirer;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "RcncltnByAcqrr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReconciliationByAcquirer";
			definition = "Indicates the reconciliation period is assigned by the acquirer instead of the acceptor.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmReconciliationByAcquirer);
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmTotalsPerCurrency
	 * AcquirerProtocolParameters6.mmTotalsPerCurrency}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalsPerCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmTotalsPerCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "TtlsPerCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalsPerCurrency";
			definition = "Indicates the reconciliation total amounts are computed per currency.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmTotalsPerCurrency);
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmSplitTotals
	 * AcquirerProtocolParameters6.mmSplitTotals}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSplitTotals = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "SpltTtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SplitTotals";
			definition = "Indicates that totals in reconciliation or batch must be split per group of points of interaction and card product profiles when these informations are present in the transactions.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmSplitTotals);
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmCardDataVerification
	 * AcquirerProtocolParameters6.mmCardDataVerification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCardDataVerification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "CardDataVrfctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CardDataVerification";
			definition = "Indicates that response messages and an AcceptorCompletionAdvice message following an authorisation exchange must contain protected or plain card data.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmCardDataVerification);
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmBatchTransferContent
	 * AcquirerProtocolParameters6.mmBatchTransferContent}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBatchTransferContent = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmBatchTransferContent;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "BtchTrfCntt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BatchTransferContent";
			definition = "Types of transaction to include in the batch.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmBatchTransferContent);
			minOccurs = 0;
			simpleType_lazy = () -> BatchTransactionType1Code.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmMessageItem
	 * AcquirerProtocolParameters6.mmMessageItem}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMessageItem = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "MsgItm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MessageItem";
			definition = "Configuration of a message item.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmMessageItem);
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters3
	 * AcquirerProtocolParameters3}</li>
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
	 * {@linkplain com.tools20022.repository.msg.AcquirerProtocolParameters6#mmProtectCardData
	 * AcquirerProtocolParameters6.mmProtectCardData}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProtectCardData = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AcceptorConfiguration.mmProtectCardData;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcquirerProtocolParameters3.mmObject();
			isDerived = false;
			xmlTag = "PrtctCardData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProtectCardData";
			definition = "Indicator to require protection of sensitive card data in messages.";
			nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmProtectCardData);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TrueFalseIndicator.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcquirerProtocolParameters3.mmAcquirerIdentification, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmApplicationIdentification,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmHost, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmOnLineTransaction,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmOffLineTransaction, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmReconciliationExchange,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmReconciliationByAcquirer, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmTotalsPerCurrency,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmSplitTotals, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmCardDataVerification,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmBatchTransferContent, com.tools20022.repository.msg.AcquirerProtocolParameters3.mmMessageItem,
						com.tools20022.repository.msg.AcquirerProtocolParameters3.mmProtectCardData);
				trace_lazy = () -> AcceptorConfiguration.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcquirerProtocolParameters3";
				definition = "Acceptor parameters dedicated to the acquirer protocol.";
				nextVersions_lazy = () -> Arrays.asList(AcquirerProtocolParameters6.mmObject());
				previousVersion_lazy = () -> AcquirerProtocolParameters1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<GenericIdentification32> getAcquirerIdentification() {
		return acquirerIdentification == null ? acquirerIdentification = new ArrayList<>() : acquirerIdentification;
	}

	public AcquirerProtocolParameters3 setAcquirerIdentification(List<com.tools20022.repository.msg.GenericIdentification32> acquirerIdentification) {
		this.acquirerIdentification = Objects.requireNonNull(acquirerIdentification);
		return this;
	}

	public List<Max35Text> getApplicationIdentification() {
		return applicationIdentification == null ? applicationIdentification = new ArrayList<>() : applicationIdentification;
	}

	public AcquirerProtocolParameters3 setApplicationIdentification(List<Max35Text> applicationIdentification) {
		this.applicationIdentification = Objects.requireNonNull(applicationIdentification);
		return this;
	}

	public List<AcquirerHostConfiguration2> getHost() {
		return host == null ? host = new ArrayList<>() : host;
	}

	public AcquirerProtocolParameters3 setHost(List<com.tools20022.repository.msg.AcquirerHostConfiguration2> host) {
		this.host = Objects.requireNonNull(host);
		return this;
	}

	public Optional<AcquirerProtocolParameters4> getOnLineTransaction() {
		return onLineTransaction == null ? Optional.empty() : Optional.of(onLineTransaction);
	}

	public AcquirerProtocolParameters3 setOnLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters4 onLineTransaction) {
		this.onLineTransaction = onLineTransaction;
		return this;
	}

	public Optional<AcquirerProtocolParameters4> getOffLineTransaction() {
		return offLineTransaction == null ? Optional.empty() : Optional.of(offLineTransaction);
	}

	public AcquirerProtocolParameters3 setOffLineTransaction(com.tools20022.repository.msg.AcquirerProtocolParameters4 offLineTransaction) {
		this.offLineTransaction = offLineTransaction;
		return this;
	}

	public Optional<ExchangeConfiguration2> getReconciliationExchange() {
		return reconciliationExchange == null ? Optional.empty() : Optional.of(reconciliationExchange);
	}

	public AcquirerProtocolParameters3 setReconciliationExchange(com.tools20022.repository.msg.ExchangeConfiguration2 reconciliationExchange) {
		this.reconciliationExchange = reconciliationExchange;
		return this;
	}

	public Optional<TrueFalseIndicator> getReconciliationByAcquirer() {
		return reconciliationByAcquirer == null ? Optional.empty() : Optional.of(reconciliationByAcquirer);
	}

	public AcquirerProtocolParameters3 setReconciliationByAcquirer(TrueFalseIndicator reconciliationByAcquirer) {
		this.reconciliationByAcquirer = reconciliationByAcquirer;
		return this;
	}

	public Optional<TrueFalseIndicator> getTotalsPerCurrency() {
		return totalsPerCurrency == null ? Optional.empty() : Optional.of(totalsPerCurrency);
	}

	public AcquirerProtocolParameters3 setTotalsPerCurrency(TrueFalseIndicator totalsPerCurrency) {
		this.totalsPerCurrency = totalsPerCurrency;
		return this;
	}

	public Optional<TrueFalseIndicator> getSplitTotals() {
		return splitTotals == null ? Optional.empty() : Optional.of(splitTotals);
	}

	public AcquirerProtocolParameters3 setSplitTotals(TrueFalseIndicator splitTotals) {
		this.splitTotals = splitTotals;
		return this;
	}

	public Optional<TrueFalseIndicator> getCardDataVerification() {
		return cardDataVerification == null ? Optional.empty() : Optional.of(cardDataVerification);
	}

	public AcquirerProtocolParameters3 setCardDataVerification(TrueFalseIndicator cardDataVerification) {
		this.cardDataVerification = cardDataVerification;
		return this;
	}

	public List<BatchTransactionType1Code> getBatchTransferContent() {
		return batchTransferContent == null ? batchTransferContent = new ArrayList<>() : batchTransferContent;
	}

	public AcquirerProtocolParameters3 setBatchTransferContent(List<BatchTransactionType1Code> batchTransferContent) {
		this.batchTransferContent = Objects.requireNonNull(batchTransferContent);
		return this;
	}

	public List<MessageItemCondition1> getMessageItem() {
		return messageItem == null ? messageItem = new ArrayList<>() : messageItem;
	}

	public AcquirerProtocolParameters3 setMessageItem(List<com.tools20022.repository.msg.MessageItemCondition1> messageItem) {
		this.messageItem = Objects.requireNonNull(messageItem);
		return this;
	}

	public TrueFalseIndicator getProtectCardData() {
		return protectCardData;
	}

	public AcquirerProtocolParameters3 setProtectCardData(TrueFalseIndicator protectCardData) {
		this.protectCardData = Objects.requireNonNull(protectCardData);
		return this;
	}
}