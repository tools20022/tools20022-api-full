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
import com.tools20022.repository.datatype.RestrictedFINXMax16Text;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the details of the transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmAccountOwnerTransactionIdentification
 * Transaction56.mmAccountOwnerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmAccountServicerTransactionIdentification
 * Transaction56.mmAccountServicerTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmMarketInfrastructureTransactionIdentification
 * Transaction56.mmMarketInfrastructureTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmProcessorTransactionIdentification
 * Transaction56.mmProcessorTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmTradeIdentification
 * Transaction56.mmTradeIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmPoolIdentification
 * Transaction56.mmPoolIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmCommonIdentification
 * Transaction56.mmCommonIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmCorporateActionEventIdentification
 * Transaction56.mmCorporateActionEventIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmTripartyAgentServiceProviderCollateralTransactionIdentification
 * Transaction56.
 * mmTripartyAgentServiceProviderCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmClientTripartyCollateralTransactionIdentification
 * Transaction56.mmClientTripartyCollateralTransactionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmClientCollateralInstructionIdentification
 * Transaction56.mmClientCollateralInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmTripartyAgentServiceProviderCollateralInstructionIdentification
 * Transaction56.
 * mmTripartyAgentServiceProviderCollateralInstructionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transaction56#mmTransactionDetails
 * Transaction56.mmTransactionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
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
 * "Transaction56"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the details of the transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Transaction56", propOrder = {"accountOwnerTransactionIdentification", "accountServicerTransactionIdentification", "marketInfrastructureTransactionIdentification", "processorTransactionIdentification",
		"tradeIdentification", "poolIdentification", "commonIdentification", "corporateActionEventIdentification", "tripartyAgentServiceProviderCollateralTransactionIdentification", "clientTripartyCollateralTransactionIdentification",
		"clientCollateralInstructionIdentification", "tripartyAgentServiceProviderCollateralInstructionIdentification", "transactionDetails"})
public class Transaction56 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected RestrictedFINXMax16Text accountOwnerTransactionIdentification;
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * owner (or the instructing party managing the account).
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountOwnerTransactionIdentification
	 * Entry.mmAccountOwnerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctOwnrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountOwnerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountOwnerTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountOwnerTransactionIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "AcctOwnrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountOwnerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account owner (or the instructing party managing the account).";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text accountServicerTransactionIdentification;
	/**
	 * Unambiguous identification of the transaction as known by the account
	 * servicer.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Entry#mmAccountServicerTransactionIdentification
	 * Entry.mmAccountServicerTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctSvcrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountServicerTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transaction as known by the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountServicerTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Entry.mmAccountServicerTransactionIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "AcctSvcrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountServicerTransactionIdentification";
			definition = "Unambiguous identification of the transaction as known by the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text marketInfrastructureTransactionIdentification;
	/**
	 * Identification of a transaction assigned by a market infrastructure other
	 * than a central securities depository, for example, Target2-Securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmMarketInfrastructureTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmMarketInfrastructureTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MktInfrstrctrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MarketInfrastructureTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMarketInfrastructureTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmMarketInfrastructureTransactionIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "MktInfrstrctrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MarketInfrastructureTransactionIdentification";
			definition = "Identification of a transaction assigned by a market infrastructure other than a central securities depository, for example, Target2-Securities.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text processorTransactionIdentification;
	/**
	 * Identification of the transaction assigned by the processor of the
	 * instruction other than the account owner the account servicer and the
	 * market infrastructure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmProcessorTransactionIdentification
	 * SecuritiesTradeIdentification.mmProcessorTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrcrTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProcessorTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmProcessorTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmProcessorTransactionIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "PrcrTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProcessorTransactionIdentification";
			definition = "Identification of the transaction assigned by the processor of the instruction other than the account owner the account servicer and the market infrastructure.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected List<RestrictedFINXMax16Text> tradeIdentification;
	/**
	 * Reference assigned to the trade by the investor or the trading party.
	 * This reference will be used throughout the trade life cycle to
	 * access/update the trade details.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmIdentification
	 * TradeIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "TradId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeIdentification";
			definition = "Reference assigned to the trade by the investor or the trading party. This reference will be used throughout the trade life cycle to access/update the trade details.";
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text poolIdentification;
	/**
	 * Collective reference identifying a set of messages.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmPoolIdentification
	 * SecuritiesTradeIdentification.mmPoolIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PoolId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PoolIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Collective reference identifying a set of messages."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPoolIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmPoolIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "PoolId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PoolIdentification";
			definition = "Collective reference identifying a set of messages.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text commonIdentification;
	/**
	 * Unique reference agreed upon by the two trade counterparties to identify
	 * the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCommonIdentification
	 * TradeIdentification.mmCommonIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CmonId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommonIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference agreed upon by the two trade counterparties to identify the trade."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCommonIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCommonIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "CmonId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommonIdentification";
			definition = "Unique reference agreed upon by the two trade counterparties to identify the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text corporateActionEventIdentification;
	/**
	 * Identification assigned by the account servicer to unambiguously identify
	 * a corporate action event.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEventRegistration#mmCorporateActionEventIdentification
	 * CorporateActionEventRegistration.mmCorporateActionEventIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification assigned by the account servicer to unambiguously identify a corporate action event."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateActionEventIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEventRegistration.mmCorporateActionEventIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventIdentification";
			definition = "Identification assigned by the account servicer to unambiguously identify a corporate action event.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text tripartyAgentServiceProviderCollateralTransactionIdentification;
	/**
	 * Unique identification identifying the triparty collateral management
	 * transaction from the triparty-agent's/service-provider's point of view.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgtSvcPrvdrCollTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentServiceProviderCollateralTransactionIdentification"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification identifying the triparty collateral management transaction from the triparty-agent's/service-provider's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTripartyAgentServiceProviderCollateralTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmTripartyAgentCollateralTransactionIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgtSvcPrvdrCollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentServiceProviderCollateralTransactionIdentification";
			definition = "Unique identification identifying the triparty collateral management transaction from the triparty-agent's/service-provider's point of view.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text clientTripartyCollateralTransactionIdentification;
	/**
	 * Unique reference identifying the triparty collateral management
	 * transaction from the client's point of view.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmClientTripartyCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmClientTripartyCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntTrptyCollTxId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientTripartyCollateralTransactionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique reference identifying the triparty collateral management transaction from the client's point of view."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientTripartyCollateralTransactionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmClientTripartyCollateralTransactionIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "ClntTrptyCollTxId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientTripartyCollateralTransactionIdentification";
			definition = "Unique reference identifying the triparty collateral management transaction from the client's point of view.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text clientCollateralInstructionIdentification;
	/**
	 * Unique identification assigned to the instruction by the client.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.mmCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntCollInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientCollateralInstructionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned to the instruction by the client."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientCollateralInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmCollateralTransactionIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "ClntCollInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientCollateralInstructionIdentification";
			definition = "Unique identification assigned to the instruction by the client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected RestrictedFINXMax16Text tripartyAgentServiceProviderCollateralInstructionIdentification;
	/**
	 * Unique identification assigned to the instruction by the
	 * triparty-agent/service-provider.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINXMax16Text
	 * RestrictedFINXMax16Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeIdentification#mmTripartyAgentCollateralTransactionIdentification
	 * SecuritiesTradeIdentification.
	 * mmTripartyAgentCollateralTransactionIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgtSvcPrvdrCollInstrId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgentServiceProviderCollateralInstructionIdentification"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification assigned to the instruction by the triparty-agent/service-provider."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTripartyAgentServiceProviderCollateralInstructionIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeIdentification.mmTripartyAgentCollateralTransactionIdentification;
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgtSvcPrvdrCollInstrId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgentServiceProviderCollateralInstructionIdentification";
			definition = "Unique identification assigned to the instruction by the triparty-agent/service-provider.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RestrictedFINXMax16Text.mmObject();
		}
	};
	protected TransactionDetails99 transactionDetails;
	/**
	 * Identifies the details of the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.TransactionDetails99
	 * TransactionDetails99}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTrade
	 * SecuritiesTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Transaction56 Transaction56}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the details of the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransactionDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesTrade.mmObject();
			componentContext_lazy = () -> Transaction56.mmObject();
			isDerived = false;
			xmlTag = "TxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionDetails";
			definition = "Identifies the details of the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.TransactionDetails99.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Transaction56.mmAccountOwnerTransactionIdentification, Transaction56.mmAccountServicerTransactionIdentification, Transaction56.mmMarketInfrastructureTransactionIdentification,
						Transaction56.mmProcessorTransactionIdentification, Transaction56.mmTradeIdentification, Transaction56.mmPoolIdentification, Transaction56.mmCommonIdentification, Transaction56.mmCorporateActionEventIdentification,
						Transaction56.mmTripartyAgentServiceProviderCollateralTransactionIdentification, Transaction56.mmClientTripartyCollateralTransactionIdentification, Transaction56.mmClientCollateralInstructionIdentification,
						Transaction56.mmTripartyAgentServiceProviderCollateralInstructionIdentification, Transaction56.mmTransactionDetails);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transaction56";
				definition = "Specifies the details of the transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctOwnrTxId", required = true)
	public RestrictedFINXMax16Text getAccountOwnerTransactionIdentification() {
		return accountOwnerTransactionIdentification;
	}

	public void setAccountOwnerTransactionIdentification(RestrictedFINXMax16Text accountOwnerTransactionIdentification) {
		this.accountOwnerTransactionIdentification = accountOwnerTransactionIdentification;
	}

	@XmlElement(name = "AcctSvcrTxId")
	public RestrictedFINXMax16Text getAccountServicerTransactionIdentification() {
		return accountServicerTransactionIdentification;
	}

	public void setAccountServicerTransactionIdentification(RestrictedFINXMax16Text accountServicerTransactionIdentification) {
		this.accountServicerTransactionIdentification = accountServicerTransactionIdentification;
	}

	@XmlElement(name = "MktInfrstrctrTxId")
	public RestrictedFINXMax16Text getMarketInfrastructureTransactionIdentification() {
		return marketInfrastructureTransactionIdentification;
	}

	public void setMarketInfrastructureTransactionIdentification(RestrictedFINXMax16Text marketInfrastructureTransactionIdentification) {
		this.marketInfrastructureTransactionIdentification = marketInfrastructureTransactionIdentification;
	}

	@XmlElement(name = "PrcrTxId")
	public RestrictedFINXMax16Text getProcessorTransactionIdentification() {
		return processorTransactionIdentification;
	}

	public void setProcessorTransactionIdentification(RestrictedFINXMax16Text processorTransactionIdentification) {
		this.processorTransactionIdentification = processorTransactionIdentification;
	}

	@XmlElement(name = "TradId")
	public List<RestrictedFINXMax16Text> getTradeIdentification() {
		return tradeIdentification;
	}

	public void setTradeIdentification(List<RestrictedFINXMax16Text> tradeIdentification) {
		this.tradeIdentification = tradeIdentification;
	}

	@XmlElement(name = "PoolId")
	public RestrictedFINXMax16Text getPoolIdentification() {
		return poolIdentification;
	}

	public void setPoolIdentification(RestrictedFINXMax16Text poolIdentification) {
		this.poolIdentification = poolIdentification;
	}

	@XmlElement(name = "CmonId")
	public RestrictedFINXMax16Text getCommonIdentification() {
		return commonIdentification;
	}

	public void setCommonIdentification(RestrictedFINXMax16Text commonIdentification) {
		this.commonIdentification = commonIdentification;
	}

	@XmlElement(name = "CorpActnEvtId")
	public RestrictedFINXMax16Text getCorporateActionEventIdentification() {
		return corporateActionEventIdentification;
	}

	public void setCorporateActionEventIdentification(RestrictedFINXMax16Text corporateActionEventIdentification) {
		this.corporateActionEventIdentification = corporateActionEventIdentification;
	}

	@XmlElement(name = "TrptyAgtSvcPrvdrCollTxId")
	public RestrictedFINXMax16Text getTripartyAgentServiceProviderCollateralTransactionIdentification() {
		return tripartyAgentServiceProviderCollateralTransactionIdentification;
	}

	public void setTripartyAgentServiceProviderCollateralTransactionIdentification(RestrictedFINXMax16Text tripartyAgentServiceProviderCollateralTransactionIdentification) {
		this.tripartyAgentServiceProviderCollateralTransactionIdentification = tripartyAgentServiceProviderCollateralTransactionIdentification;
	}

	@XmlElement(name = "ClntTrptyCollTxId")
	public RestrictedFINXMax16Text getClientTripartyCollateralTransactionIdentification() {
		return clientTripartyCollateralTransactionIdentification;
	}

	public void setClientTripartyCollateralTransactionIdentification(RestrictedFINXMax16Text clientTripartyCollateralTransactionIdentification) {
		this.clientTripartyCollateralTransactionIdentification = clientTripartyCollateralTransactionIdentification;
	}

	@XmlElement(name = "ClntCollInstrId")
	public RestrictedFINXMax16Text getClientCollateralInstructionIdentification() {
		return clientCollateralInstructionIdentification;
	}

	public void setClientCollateralInstructionIdentification(RestrictedFINXMax16Text clientCollateralInstructionIdentification) {
		this.clientCollateralInstructionIdentification = clientCollateralInstructionIdentification;
	}

	@XmlElement(name = "TrptyAgtSvcPrvdrCollInstrId")
	public RestrictedFINXMax16Text getTripartyAgentServiceProviderCollateralInstructionIdentification() {
		return tripartyAgentServiceProviderCollateralInstructionIdentification;
	}

	public void setTripartyAgentServiceProviderCollateralInstructionIdentification(RestrictedFINXMax16Text tripartyAgentServiceProviderCollateralInstructionIdentification) {
		this.tripartyAgentServiceProviderCollateralInstructionIdentification = tripartyAgentServiceProviderCollateralInstructionIdentification;
	}

	@XmlElement(name = "TxDtls")
	public TransactionDetails99 getTransactionDetails() {
		return transactionDetails;
	}

	public void setTransactionDetails(com.tools20022.repository.msg.TransactionDetails99 transactionDetails) {
		this.transactionDetails = transactionDetails;
	}
}