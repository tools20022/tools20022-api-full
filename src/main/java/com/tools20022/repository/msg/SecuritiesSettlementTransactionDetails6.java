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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
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
 * Provides the details of the update(s) for the settlement transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmSettlementTypeAndAdditionalParameters
 * SecuritiesSettlementTransactionDetails6.
 * mmSettlementTypeAndAdditionalParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmLinkages
 * SecuritiesSettlementTransactionDetails6.mmLinkages}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmTradeDetails
 * SecuritiesSettlementTransactionDetails6.mmTradeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmFinancialInstrumentAttributes
 * SecuritiesSettlementTransactionDetails6.mmFinancialInstrumentAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmQuantityAndAccountDetails
 * SecuritiesSettlementTransactionDetails6.mmQuantityAndAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmSettlementParameters
 * SecuritiesSettlementTransactionDetails6.mmSettlementParameters}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmStandingSettlementInstructionDetails
 * SecuritiesSettlementTransactionDetails6.
 * mmStandingSettlementInstructionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmDeliveringSettlementParties
 * SecuritiesSettlementTransactionDetails6.mmDeliveringSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmReceivingSettlementParties
 * SecuritiesSettlementTransactionDetails6.mmReceivingSettlementParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmCashParties
 * SecuritiesSettlementTransactionDetails6.mmCashParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmSettlementAmount
 * SecuritiesSettlementTransactionDetails6.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmOtherAmounts
 * SecuritiesSettlementTransactionDetails6.mmOtherAmounts}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmOtherBusinessParties
 * SecuritiesSettlementTransactionDetails6.mmOtherBusinessParties}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmAdditionalPhysicalOrRegistrationDetails
 * SecuritiesSettlementTransactionDetails6.
 * mmAdditionalPhysicalOrRegistrationDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6#mmSupplementaryData
 * SecuritiesSettlementTransactionDetails6.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
 * SecuritiesSettlement}</li>
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
 * "SecuritiesSettlementTransactionDetails6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the details of the update(s) for the settlement transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesSettlementTransactionDetails6", propOrder = {"settlementTypeAndAdditionalParameters", "linkages", "tradeDetails", "financialInstrumentAttributes", "quantityAndAccountDetails", "settlementParameters",
		"standingSettlementInstructionDetails", "deliveringSettlementParties", "receivingSettlementParties", "cashParties", "settlementAmount", "otherAmounts", "otherBusinessParties", "additionalPhysicalOrRegistrationDetails",
		"supplementaryData"})
public class SecuritiesSettlementTransactionDetails6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected SettlementTypeAndAdditionalParameters7 settlementTypeAndAdditionalParameters;
	/**
	 * Provides settlement type and identification information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters7
	 * SettlementTypeAndAdditionalParameters7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmTpAndAddtlParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementTypeAndAdditionalParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Provides settlement type and identification information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementTypeAndAdditionalParameters = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "SttlmTpAndAddtlParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementTypeAndAdditionalParameters";
			definition = "Provides settlement type and identification information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters7.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.Linkages22> linkages;
	/**
	 * Link to another transaction that must be processed after, before or at
	 * the same time.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Linkages22 Linkages22}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lnkgs"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Linkages"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Link to another transaction that must be processed after, before or at the same time."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLinkages = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "Lnkgs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Linkages";
			definition = "Link to another transaction that must be processed after, before or at the same time.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Linkages22.mmObject();
		}
	};
	protected SecuritiesTradeDetails27 tradeDetails;
	/**
	 * Details of the trade.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesTradeDetails27
	 * SecuritiesTradeDetails27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmRelatedTrade
	 * SecuritiesTradeExecution.mmRelatedTrade}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Details of the trade."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTradeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmRelatedTrade;
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "TradDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDetails";
			definition = "Details of the trade.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SecuritiesTradeDetails27.mmObject();
		}
	};
	protected FinancialInstrumentAttributes41 financialInstrumentAttributes;
	/**
	 * Attributes defining a financial instrument.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes41
	 * FinancialInstrumentAttributes41}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSecurity
	 * SecuritiesSettlement.mmSecurity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Attributes defining a financial instrument."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentAttributes = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSecurity;
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentAttributes";
			definition = "Attributes defining a financial instrument.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentAttributes41.mmObject();
		}
	};
	protected QuantityAndAccount32 quantityAndAccountDetails;
	/**
	 * Details related to the account and quantity involved in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.QuantityAndAccount32
	 * QuantityAndAccount32}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyAndAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityAndAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Details related to the account and quantity involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityAndAccountDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "QtyAndAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityAndAccountDetails";
			definition = "Details related to the account and quantity involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.QuantityAndAccount32.mmObject();
		}
	};
	protected SettlementDetails51 settlementParameters;
	/**
	 * Parameters which explicitly state the conditions that must be fulfilled
	 * before a particular transaction of a financial instrument can be settled.
	 * These parameters are defined by the instructing party in compliance with
	 * settlement rules in the market the transaction will settle in.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementDetails51
	 * SettlementDetails51}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement
	 * SecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmParams"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementParameters"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementParameters = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> SecuritiesSettlement.mmObject();
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "SttlmParams";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementParameters";
			definition = "Parameters which explicitly state the conditions that must be fulfilled before a particular  transaction of a financial instrument can be settled.  These parameters are defined by the instructing party in compliance with settlement rules in the market the transaction will settle in.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementDetails51.mmObject();
		}
	};
	protected StandingSettlementInstruction7 standingSettlementInstructionDetails;
	/**
	 * Specifies what settlement standing instruction database is to be used to
	 * derive the settlement parties involved in the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.StandingSettlementInstruction7
	 * StandingSettlementInstruction7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Settlement#mmStandingSettlementInstruction
	 * Settlement.mmStandingSettlementInstruction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StgSttlmInstrDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StandingSettlementInstructionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmStandingSettlementInstructionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Settlement.mmStandingSettlementInstruction;
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "StgSttlmInstrDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StandingSettlementInstructionDetails";
			definition = "Specifies what settlement standing instruction database is to be used to derive the settlement parties involved in the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.StandingSettlementInstruction7.mmObject();
		}
	};
	protected SettlementParties27 deliveringSettlementParties;
	/**
	 * Identifies the chain of delivering settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties27
	 * SettlementParties27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DeliveringSettlementParty
	 * DeliveringSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of delivering settlement parties."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDeliveringSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> DeliveringSettlementParty.mmObject();
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "DlvrgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringSettlementParties";
			definition = "Identifies the chain of delivering settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties27.mmObject();
		}
	};
	protected SettlementParties27 receivingSettlementParties;
	/**
	 * Identifies the chain of receiving settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SettlementParties27
	 * SettlementParties27}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ReceivingSettlementParty
	 * ReceivingSettlementParty}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgSttlmPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingSettlementParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the chain of receiving settlement parties."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmReceivingSettlementParties = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> ReceivingSettlementParty.mmObject();
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "RcvgSttlmPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingSettlementParties";
			definition = "Identifies the chain of receiving settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SettlementParties27.mmObject();
		}
	};
	protected CashParties14 cashParties;
	/**
	 * Cash parties involved in the transaction if different for the securities
	 * settlement parties.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CashParties14
	 * CashParties14}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Payment#mmPartyRole
	 * Payment.mmPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash parties involved in the transaction if different for the securities settlement parties."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashParties = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Payment.mmPartyRole;
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "CshPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashParties";
			definition = "Cash parties involved in the transaction if different for the securities settlement parties.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CashParties14.mmObject();
		}
	};
	protected AmountAndDirection33 settlementAmount;
	/**
	 * Total amount of money to be paid or received in exchange for the
	 * securities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection33
	 * AmountAndDirection33}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total amount of money to be paid or received in exchange for the securities."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money to be paid or received in exchange for the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.AmountAndDirection33.mmObject();
		}
	};
	protected OtherAmounts20 otherAmounts;
	/**
	 * Other amounts than the settlement amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherAmounts20
	 * OtherAmounts20}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAmts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAmounts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other amounts than the settlement amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherAmounts = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "OthrAmts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAmounts";
			definition = "Other amounts than the settlement amount.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherAmounts20.mmObject();
		}
	};
	protected OtherParties24 otherBusinessParties;
	/**
	 * Other business parties relevant to the transaction.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.OtherParties24
	 * OtherParties24}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrBizPties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherBusinessParties"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Other business parties relevant to the transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherBusinessParties = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "OthrBizPties";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherBusinessParties";
			definition = "Other business parties relevant to the transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.OtherParties24.mmObject();
		}
	};
	protected RegistrationParameters2 additionalPhysicalOrRegistrationDetails;
	/**
	 * Provides information required for the registration or physical
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.RegistrationParameters2
	 * RegistrationParameters2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Security#mmRegistration
	 * Security.mmRegistration}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlPhysOrRegnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalPhysicalOrRegistrationDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides information required for the registration or physical settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAdditionalPhysicalOrRegistrationDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Security.mmRegistration;
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "AddtlPhysOrRegnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalPhysicalOrRegistrationDetails";
			definition = "Provides information required for the registration or physical settlement.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.RegistrationParameters2.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData;
	/**
	 * Additional information that cannot be captured in the structured elements
	 * and/or any other specific block.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesSettlementTransactionDetails6
	 * SecuritiesSettlementTransactionDetails6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that cannot be captured in the structured elements and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSupplementaryData = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SecuritiesSettlementTransactionDetails6.mmObject();
			isDerived = false;
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that cannot be captured in the structured elements and/or any other specific block.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.SupplementaryData1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesSettlementTransactionDetails6.mmSettlementTypeAndAdditionalParameters, SecuritiesSettlementTransactionDetails6.mmLinkages,
						SecuritiesSettlementTransactionDetails6.mmTradeDetails, SecuritiesSettlementTransactionDetails6.mmFinancialInstrumentAttributes, SecuritiesSettlementTransactionDetails6.mmQuantityAndAccountDetails,
						SecuritiesSettlementTransactionDetails6.mmSettlementParameters, SecuritiesSettlementTransactionDetails6.mmStandingSettlementInstructionDetails, SecuritiesSettlementTransactionDetails6.mmDeliveringSettlementParties,
						SecuritiesSettlementTransactionDetails6.mmReceivingSettlementParties, SecuritiesSettlementTransactionDetails6.mmCashParties, SecuritiesSettlementTransactionDetails6.mmSettlementAmount,
						SecuritiesSettlementTransactionDetails6.mmOtherAmounts, SecuritiesSettlementTransactionDetails6.mmOtherBusinessParties, SecuritiesSettlementTransactionDetails6.mmAdditionalPhysicalOrRegistrationDetails,
						SecuritiesSettlementTransactionDetails6.mmSupplementaryData);
				trace_lazy = () -> SecuritiesSettlement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesSettlementTransactionDetails6";
				definition = "Provides the details of the update(s) for the settlement transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "SttlmTpAndAddtlParams")
	public SettlementTypeAndAdditionalParameters7 getSettlementTypeAndAdditionalParameters() {
		return settlementTypeAndAdditionalParameters;
	}

	public void setSettlementTypeAndAdditionalParameters(com.tools20022.repository.msg.SettlementTypeAndAdditionalParameters7 settlementTypeAndAdditionalParameters) {
		this.settlementTypeAndAdditionalParameters = settlementTypeAndAdditionalParameters;
	}

	@XmlElement(name = "Lnkgs")
	public List<Linkages22> getLinkages() {
		return linkages;
	}

	public void setLinkages(List<com.tools20022.repository.msg.Linkages22> linkages) {
		this.linkages = linkages;
	}

	@XmlElement(name = "TradDtls")
	public SecuritiesTradeDetails27 getTradeDetails() {
		return tradeDetails;
	}

	public void setTradeDetails(com.tools20022.repository.msg.SecuritiesTradeDetails27 tradeDetails) {
		this.tradeDetails = tradeDetails;
	}

	@XmlElement(name = "FinInstrmAttrbts")
	public FinancialInstrumentAttributes41 getFinancialInstrumentAttributes() {
		return financialInstrumentAttributes;
	}

	public void setFinancialInstrumentAttributes(com.tools20022.repository.msg.FinancialInstrumentAttributes41 financialInstrumentAttributes) {
		this.financialInstrumentAttributes = financialInstrumentAttributes;
	}

	@XmlElement(name = "QtyAndAcctDtls")
	public QuantityAndAccount32 getQuantityAndAccountDetails() {
		return quantityAndAccountDetails;
	}

	public void setQuantityAndAccountDetails(com.tools20022.repository.msg.QuantityAndAccount32 quantityAndAccountDetails) {
		this.quantityAndAccountDetails = quantityAndAccountDetails;
	}

	@XmlElement(name = "SttlmParams")
	public SettlementDetails51 getSettlementParameters() {
		return settlementParameters;
	}

	public void setSettlementParameters(com.tools20022.repository.msg.SettlementDetails51 settlementParameters) {
		this.settlementParameters = settlementParameters;
	}

	@XmlElement(name = "StgSttlmInstrDtls")
	public StandingSettlementInstruction7 getStandingSettlementInstructionDetails() {
		return standingSettlementInstructionDetails;
	}

	public void setStandingSettlementInstructionDetails(com.tools20022.repository.msg.StandingSettlementInstruction7 standingSettlementInstructionDetails) {
		this.standingSettlementInstructionDetails = standingSettlementInstructionDetails;
	}

	@XmlElement(name = "DlvrgSttlmPties")
	public SettlementParties27 getDeliveringSettlementParties() {
		return deliveringSettlementParties;
	}

	public void setDeliveringSettlementParties(com.tools20022.repository.msg.SettlementParties27 deliveringSettlementParties) {
		this.deliveringSettlementParties = deliveringSettlementParties;
	}

	@XmlElement(name = "RcvgSttlmPties")
	public SettlementParties27 getReceivingSettlementParties() {
		return receivingSettlementParties;
	}

	public void setReceivingSettlementParties(com.tools20022.repository.msg.SettlementParties27 receivingSettlementParties) {
		this.receivingSettlementParties = receivingSettlementParties;
	}

	@XmlElement(name = "CshPties")
	public CashParties14 getCashParties() {
		return cashParties;
	}

	public void setCashParties(com.tools20022.repository.msg.CashParties14 cashParties) {
		this.cashParties = cashParties;
	}

	@XmlElement(name = "SttlmAmt")
	public AmountAndDirection33 getSettlementAmount() {
		return settlementAmount;
	}

	public void setSettlementAmount(com.tools20022.repository.msg.AmountAndDirection33 settlementAmount) {
		this.settlementAmount = settlementAmount;
	}

	@XmlElement(name = "OthrAmts")
	public OtherAmounts20 getOtherAmounts() {
		return otherAmounts;
	}

	public void setOtherAmounts(com.tools20022.repository.msg.OtherAmounts20 otherAmounts) {
		this.otherAmounts = otherAmounts;
	}

	@XmlElement(name = "OthrBizPties")
	public OtherParties24 getOtherBusinessParties() {
		return otherBusinessParties;
	}

	public void setOtherBusinessParties(com.tools20022.repository.msg.OtherParties24 otherBusinessParties) {
		this.otherBusinessParties = otherBusinessParties;
	}

	@XmlElement(name = "AddtlPhysOrRegnDtls")
	public RegistrationParameters2 getAdditionalPhysicalOrRegistrationDetails() {
		return additionalPhysicalOrRegistrationDetails;
	}

	public void setAdditionalPhysicalOrRegistrationDetails(com.tools20022.repository.msg.RegistrationParameters2 additionalPhysicalOrRegistrationDetails) {
		this.additionalPhysicalOrRegistrationDetails = additionalPhysicalOrRegistrationDetails;
	}

	@XmlElement(name = "SplmtryData")
	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData;
	}

	public void setSupplementaryData(List<com.tools20022.repository.msg.SupplementaryData1> supplementaryData) {
		this.supplementaryData = supplementaryData;
	}
}