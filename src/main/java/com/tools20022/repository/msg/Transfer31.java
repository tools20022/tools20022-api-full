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
import com.tools20022.repository.area.sese.TransferOutConfirmationV07;
import com.tools20022.repository.choice.ChargePaymentMethod1Choice;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.TransferReason1;
import com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode;
import com.tools20022.repository.codeset.BusinessFlowType1Code;
import com.tools20022.repository.codeset.HoldingsPlanType1Code;
import com.tools20022.repository.codeset.RoundingDirection2Code;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferConfirmationReference
 * Transfer31.mmTransferConfirmationReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmTransferReference
 * Transfer31.mmTransferReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmClientReference
 * Transfer31.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmCounterpartyReference
 * Transfer31.mmCounterpartyReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmBusinessFlowType
 * Transfer31.mmBusinessFlowType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmEffectiveTransferDate
 * Transfer31.mmEffectiveTransferDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmRequestedSettlementDate
 * Transfer31.mmRequestedSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmEffectiveSettlementDate
 * Transfer31.mmEffectiveSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmTradeDate
 * Transfer31.mmTradeDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferOrderDateForm
 * Transfer31.mmTransferOrderDateForm}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmTransferReason
 * Transfer31.mmTransferReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmHoldingsPlanType
 * Transfer31.mmHoldingsPlanType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmFinancialInstrumentDetails
 * Transfer31.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmTotalUnitsNumber
 * Transfer31.mmTotalUnitsNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmUnitsDetails
 * Transfer31.mmUnitsDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmPortfolioTransferOutRate
 * Transfer31.mmPortfolioTransferOutRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmRounding
 * Transfer31.mmRounding}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmAveragePrice
 * Transfer31.mmAveragePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmNewAveragePrice
 * Transfer31.mmNewAveragePrice}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmAverageDate
 * Transfer31.mmAverageDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmNewAverageDate
 * Transfer31.mmNewAverageDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer31#mmTransferCurrency
 * Transfer31.mmTransferCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmOwnAccountTransferIndicator
 * Transfer31.mmOwnAccountTransferIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmNonStandardSettlementInformation
 * Transfer31.mmNonStandardSettlementInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmReceivingAgentDetails
 * Transfer31.mmReceivingAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmDeliveringAgentDetails
 * Transfer31.mmDeliveringAgentDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Transfer31#mmTransferExpensesPaymentType
 * Transfer31.mmTransferExpensesPaymentType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTransfer
 * SecuritiesTransfer}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.sese.TransferOutConfirmationV07#mmTransferDetails
 * TransferOutConfirmationV07.mmTransferDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule#forTransfer31
 * ConstraintTotalUnitsNumberRule.forTransfer31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintRoundingRule#forTransfer31
 * ConstraintRoundingRule.forTransfer31}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1#forTransfer31
 * ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.
 * forTransfer31}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Transfer31"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Transfer35 Transfer35}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Transfer28
 * Transfer28}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Transfer31", propOrder = {"transferConfirmationReference", "transferReference", "clientReference", "counterpartyReference", "businessFlowType", "effectiveTransferDate", "requestedSettlementDate", "effectiveSettlementDate",
		"tradeDate", "transferOrderDateForm", "transferReason", "holdingsPlanType", "financialInstrumentDetails", "totalUnitsNumber", "unitsDetails", "portfolioTransferOutRate", "rounding", "averagePrice", "newAveragePrice", "averageDate",
		"newAverageDate", "transferCurrency", "ownAccountTransferIndicator", "nonStandardSettlementInformation", "receivingAgentDetails", "deliveringAgentDetails", "transferExpensesPaymentType"})
public class Transfer31 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TrfConfRef", required = true)
	protected Max35Text transferConfirmationReference;
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfConfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferConfirmationReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer execution, as assigned by a confirming party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTransferConfirmationReference
	 * Transfer35.mmTransferConfirmationReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferConfirmationReference
	 * Transfer28.mmTransferConfirmationReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferConfirmationReference = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "TrfConfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferConfirmationReference";
			definition = "Unique and unambiguous identifier for a transfer execution, as assigned by a confirming party.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmTransferConfirmationReference);
			previousVersion_lazy = () -> Transfer28.mmTransferConfirmationReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "TrfRef", required = true)
	protected Max35Text transferReference;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmIdentification
	 * SecuritiesTransfer.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTransferReference
	 * Transfer35.mmTransferReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferReference
	 * Transfer28.mmTransferReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "TrfRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReference";
			definition = "Unique and unambiguous identifier for a transfer instruction, as assigned by the instructing party.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmTransferReference);
			previousVersion_lazy = () -> Transfer28.mmTransferReference;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ClntRef")
	protected AdditionalReference7 clientReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClntRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ClientReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmClientReference
	 * Transfer35.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmClientReference
	 * Transfer28.mmClientReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of a transfer. This reference can typically be used in a hub scenario to give the reference of the transfer as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmClientReference);
			previousVersion_lazy = () -> Transfer28.mmClientReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference7.mmObject();
		}
	};
	@XmlElement(name = "CtrPtyRef")
	protected AdditionalReference7 counterpartyReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AdditionalReference7
	 * AdditionalReference7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TradeIdentification#mmCounterpartyReference
	 * TradeIdentification.mmCounterpartyReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrPtyRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CounterpartyReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unambiguous identification of the transfer allocated by the counterparty."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmCounterpartyReference
	 * Transfer35.mmCounterpartyReference}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmCounterpartyReference
	 * Transfer28.mmCounterpartyReference}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCounterpartyReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TradeIdentification.mmCounterpartyReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "CtrPtyRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CounterpartyReference";
			definition = "Unambiguous identification of the transfer allocated by the counterparty.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmCounterpartyReference);
			previousVersion_lazy = () -> Transfer28.mmCounterpartyReference;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.AdditionalReference7.mmObject();
		}
	};
	@XmlElement(name = "BizFlowTp")
	protected BusinessFlowType1Code businessFlowType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BusinessFlowType1Code
	 * BusinessFlowType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BizFlowTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BusinessFlowType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmBusinessFlowType
	 * Transfer35.mmBusinessFlowType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmBusinessFlowType
	 * Transfer28.mmBusinessFlowType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBusinessFlowType = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "BizFlowTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BusinessFlowType";
			definition = "Identifies the business process in which the actors are involved. This is important to trigger the right business process, according to the market business model, which may require matching instructions in a CSD environment (double leg process) or not (single leg process).";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmBusinessFlowType);
			previousVersion_lazy = () -> Transfer28.mmBusinessFlowType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BusinessFlowType1Code.mmObject();
		}
	};
	@XmlElement(name = "FctvTrfDt", required = true)
	protected DateAndDateTimeChoice effectiveTransferDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvTrfDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveTransferDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the transfer was executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmEffectiveTransferDate
	 * Transfer35.mmEffectiveTransferDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmEffectiveTransferDate
	 * Transfer28.mmEffectiveTransferDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveTransferDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "FctvTrfDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveTransferDate";
			definition = "Date and time at which the transfer was executed.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmEffectiveTransferDate);
			previousVersion_lazy = () -> Transfer28.mmEffectiveTransferDate;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "ReqdSttlmDt")
	protected ISODate requestedSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Obligation#mmRequestedSettlementDate
	 * Obligation.mmRequestedSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ReqdSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RequestedSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmRequestedSettlementDate
	 * Transfer35.mmRequestedSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmRequestedSettlementDate
	 * Transfer28.mmRequestedSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRequestedSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Obligation.mmRequestedSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "ReqdSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RequestedSettlementDate";
			definition = "Date and time at which the securities are to be exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmRequestedSettlementDate);
			previousVersion_lazy = () -> Transfer28.mmRequestedSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "FctvSttlmDt")
	protected DateAndDateTimeChoice effectiveSettlementDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FctvSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EffectiveSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the securities were exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmEffectiveSettlementDate
	 * Transfer35.mmEffectiveSettlementDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmEffectiveSettlementDate
	 * Transfer28.mmEffectiveSettlementDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmEffectiveSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "FctvSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EffectiveSettlementDate";
			definition = "Date and time at which the securities were exchanged at the International Central Securities Depository (ICSD) or Central Securities Depository (CSD).";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmEffectiveSettlementDate);
			previousVersion_lazy = () -> Transfer28.mmEffectiveSettlementDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "TradDt")
	protected DateAndDateTimeChoice tradeDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a transaction is completed and cleared, that is, securities are delivered."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer35#mmTradeDate
	 * Transfer35.mmTradeDate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTradeDate
	 * Transfer28.mmTradeDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "TradDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDate";
			definition = "Date and time at which a transaction is completed and cleared, that is, securities are delivered.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmTradeDate);
			previousVersion_lazy = () -> Transfer28.mmTradeDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "TrfOrdrDtForm")
	protected ISODate transferOrderDateForm;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeDateTime
	 * Trade.mmTradeDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfOrdrDtForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferOrderDateForm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies in which date the investor signed the transfer order form."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTransferOrderDateForm
	 * Transfer35.mmTransferOrderDateForm}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferOrderDateForm
	 * Transfer28.mmTransferOrderDateForm}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferOrderDateForm = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "TrfOrdrDtForm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferOrderDateForm";
			definition = "Identifies in which date the investor signed the transfer order form.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmTransferOrderDateForm);
			previousVersion_lazy = () -> Transfer28.mmTransferOrderDateForm;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "TrfRsn")
	protected TransferReason1 transferReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TransferReason1
	 * TransferReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferReason
	 * SecuritiesTransfer.mmTransferReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the transfer reason."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTransferReason
	 * Transfer35.mmTransferReason}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferReason
	 * Transfer28.mmTransferReason}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "TrfRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferReason";
			definition = "Identifies the transfer reason.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmTransferReason);
			previousVersion_lazy = () -> Transfer28.mmTransferReason;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TransferReason1.mmObject();
		}
	};
	@XmlElement(name = "HldgsPlanTp")
	protected List<HoldingsPlanType1Code> holdingsPlanType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.HoldingsPlanType1Code
	 * HoldingsPlanType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmHoldingsPlanType
	 * SecuritiesSettlement.mmHoldingsPlanType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsPlanTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsPlanType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmHoldingsPlanType
	 * Transfer35.mmHoldingsPlanType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmHoldingsPlanType
	 * Transfer28.mmHoldingsPlanType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingsPlanType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmHoldingsPlanType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "HldgsPlanTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsPlanType";
			definition = "Identifies whether or not saving plan or withdrawal or switch plan are included in the holdings.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmHoldingsPlanType);
			previousVersion_lazy = () -> Transfer28.mmHoldingsPlanType;
			maxOccurs = 3;
			minOccurs = 0;
			simpleType_lazy = () -> HoldingsPlanType1Code.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmDtls", required = true)
	protected FinancialInstrument49 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrument49
	 * FinancialInstrument49}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundClass
	 * InvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FinInstrmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "FinancialInstrumentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to the financial instrument withdrawn."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmFinancialInstrumentDetails
	 * Transfer35.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmFinancialInstrumentDetails
	 * Transfer28.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmFinancialInstrumentDetails = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> InvestmentFundClass.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Information related to the financial instrument withdrawn.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmFinancialInstrumentDetails);
			previousVersion_lazy = () -> Transfer28.mmFinancialInstrumentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrument49.mmObject();
		}
	};
	@XmlElement(name = "TtlUnitsNb", required = true)
	protected FinancialInstrumentQuantity1 totalUnitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity1
	 * FinancialInstrumentQuantity1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlUnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalUnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTotalUnitsNumber
	 * Transfer35.mmTotalUnitsNumber}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTotalUnitsNumber
	 * Transfer28.mmTotalUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "TtlUnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalUnitsNumber";
			definition = "Total quantity of securities settled.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmTotalUnitsNumber);
			previousVersion_lazy = () -> Transfer28.mmTotalUnitsNumber;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	@XmlElement(name = "UnitsDtls")
	protected List<com.tools20022.repository.msg.Unit6> unitsDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Unit6 Unit6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmTransferredQuantity
	 * SecuritiesTransfer.mmTransferredQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information about the units to be transferred."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer35#mmUnitsDetails
	 * Transfer35.mmUnitsDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmUnitsDetails
	 * Transfer28.mmUnitsDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmUnitsDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmTransferredQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "UnitsDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsDetails";
			definition = "Information about the units to be transferred.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmUnitsDetails);
			previousVersion_lazy = () -> Transfer28.mmUnitsDetails;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Unit6.mmObject();
		}
	};
	@XmlElement(name = "PrtflTrfOutRate")
	protected PercentageRate portfolioTransferOutRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesQuantity#mmRate
	 * SecuritiesQuantity.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtflTrfOutRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PortfolioTransferOutRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total quantity of securities settled."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer35#mmTransferRate
	 * Transfer35.mmTransferRate}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmPortfolioTransferOutRate
	 * Transfer28.mmPortfolioTransferOutRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPortfolioTransferOutRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesQuantity.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "PrtflTrfOutRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PortfolioTransferOutRate";
			definition = "Total quantity of securities settled.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmTransferRate);
			previousVersion_lazy = () -> Transfer28.mmPortfolioTransferOutRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "Rndg")
	protected RoundingDirection2Code rounding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RoundingDirection2Code
	 * RoundingDirection2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.RoundingParameters#mmRoundingDirection
	 * RoundingParameters.mmRoundingDirection}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rndg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Rounding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the rounding direction applied to nearest unit."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer35#mmRounding
	 * Transfer35.mmRounding}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmRounding
	 * Transfer28.mmRounding}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRounding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Indicates the rounding direction applied to nearest unit.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmRounding);
			previousVersion_lazy = () -> Transfer28.mmRounding;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
		}
	};
	@XmlElement(name = "AvrgPric")
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Weighted average price of the units in the account before the transfer was executed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer35#mmAveragePrice
	 * Transfer35.mmAveragePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmAveragePrice
	 * Transfer28.mmAveragePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAveragePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "AvrgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AveragePrice";
			definition = "Weighted average price of the units in the account before the transfer was executed.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmAveragePrice);
			previousVersion_lazy = () -> Transfer28.mmAveragePrice;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	@XmlElement(name = "NewAvrgPric")
	protected ActiveOrHistoricCurrencyAnd13DecimalAmount newAveragePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAnd13DecimalAmount
	 * ActiveOrHistoricCurrencyAnd13DecimalAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AssetHolding#mmBookValue
	 * AssetHolding.mmBookValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewAvrgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewAveragePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Weighted average price of the units in the account after the transfer was executed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmNewAveragePrice
	 * Transfer35.mmNewAveragePrice}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmNewAveragePrice
	 * Transfer28.mmNewAveragePrice}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewAveragePrice = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AssetHolding.mmBookValue;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "NewAvrgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAveragePrice";
			definition = "Weighted average price of the units in the account after the transfer was executed.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmNewAveragePrice);
			previousVersion_lazy = () -> Transfer28.mmNewAveragePrice;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAnd13DecimalAmount.mmObject();
		}
	};
	@XmlElement(name = "AvrgDt")
	protected ISODate averageDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AvrgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AverageDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade date of the average weighted data of units in the account before the transfer was executed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Transfer35#mmAverageDate
	 * Transfer35.mmAverageDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAverageDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "AvrgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AverageDate";
			definition = "Trade date of the average weighted data of units in the account before the transfer was executed.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmAverageDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "NewAvrgDt")
	protected ISODate newAverageDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODate
	 * ISODate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ObligationFulfilment#mmDate
	 * ObligationFulfilment.mmDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NewAvrgDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NewAverageDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Trade date of the average weighted data of units in the account after the transfer was executed."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmNewAverageDate
	 * Transfer35.mmNewAverageDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNewAverageDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> ObligationFulfilment.mmDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "NewAvrgDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NewAverageDate";
			definition = "Trade date of the average weighted data of units in the account after the transfer was executed.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmNewAverageDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "TrfCcy")
	protected ActiveOrHistoricCurrencyCode transferCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveOrHistoricCurrencyCode
	 * ActiveOrHistoricCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesDeliveryObligation#mmTransferCurrency
	 * SecuritiesDeliveryObligation.mmTransferCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the currency to be used to transfer the holdings."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTransferCurrency
	 * Transfer35.mmTransferCurrency}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferCurrency
	 * Transfer28.mmTransferCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransferCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesDeliveryObligation.mmTransferCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "TrfCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferCurrency";
			definition = "Identifies the currency to be used to transfer the holdings.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmTransferCurrency);
			previousVersion_lazy = () -> Transfer28.mmTransferCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "OwnAcctTrfInd")
	protected YesNoIndicator ownAccountTransferIndicator;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTransfer#mmOwnAccountTransferIndicator
	 * SecuritiesTransfer.mmOwnAccountTransferIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OwnAcctTrfInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OwnAccountTransferIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the transfer results in a change of beneficial owner."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmOwnAccountTransferIndicator
	 * Transfer35.mmOwnAccountTransferIndicator}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmOwnAccountTransferIndicator
	 * Transfer28.mmOwnAccountTransferIndicator}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOwnAccountTransferIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTransfer.mmOwnAccountTransferIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "OwnAcctTrfInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OwnAccountTransferIndicator";
			definition = "Indicates whether the transfer results in a change of beneficial owner.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmOwnAccountTransferIndicator);
			previousVersion_lazy = () -> Transfer28.mmOwnAccountTransferIndicator;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "NonStdSttlmInf")
	protected Max350Text nonStandardSettlementInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmNonStandardSettlementInformation
	 * InvestmentFundOrderExecution.mmNonStandardSettlementInformation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NonStdSttlmInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NonStandardSettlementInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional specific settlement information for non-regulated traded funds."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmNonStandardSettlementInformation
	 * Transfer35.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmNonStandardSettlementInformation
	 * Transfer28.mmNonStandardSettlementInformation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNonStandardSettlementInformation = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmNonStandardSettlementInformation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "NonStdSttlmInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NonStandardSettlementInformation";
			definition = "Additional specific settlement information for non-regulated traded funds.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmNonStandardSettlementInformation);
			previousVersion_lazy = () -> Transfer28.mmNonStandardSettlementInformation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}
	};
	@XmlElement(name = "RcvgAgtDtls")
	protected PartyIdentificationAndAccount125 receivingAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125
	 * PartyIdentificationAndAccount125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmReceivingAgentDetails
	 * Transfer35.mmReceivingAgentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmReceivingAgentDetails
	 * Transfer28.mmReceivingAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReceivingAgentDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent via the place of settlement, for example, securities central depository.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmReceivingAgentDetails);
			previousVersion_lazy = () -> Transfer28.mmReceivingAgentDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount125.mmObject();
		}
	};
	@XmlElement(name = "DlvrgAgtDtls")
	protected PartyIdentificationAndAccount125 deliveringAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount125
	 * PartyIdentificationAndAccount125}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvrgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveringAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmDeliveringAgentDetails
	 * Transfer35.mmDeliveringAgentDetails}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmDeliveringAgentDetails
	 * Transfer28.mmDeliveringAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveringAgentDetails = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "DlvrgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveringAgentDetails";
			definition = "Party that delivers securities to the receiving agent at the place of settlement, for example, a central securities depository.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmDeliveringAgentDetails);
			previousVersion_lazy = () -> Transfer28.mmDeliveringAgentDetails;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PartyIdentificationAndAccount125.mmObject();
		}
	};
	@XmlElement(name = "TrfExpnssPmtTp")
	protected ChargePaymentMethod1Choice transferExpensesPaymentType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ChargePaymentMethod1Choice
	 * ChargePaymentMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Charges#mmChargePaymentMethod
	 * Charges.mmChargePaymentMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Transfer31
	 * Transfer31}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrfExpnssPmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransferExpensesPaymentType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies how the payment of charges, taxes and commissions as a result of the transfer is covered, that is, whether by cash or the redemption of units."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Transfer35#mmTransferExpensesPaymentType
	 * Transfer35.mmTransferExpensesPaymentType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Transfer28#mmTransferExpensesPaymentType
	 * Transfer28.mmTransferExpensesPaymentType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTransferExpensesPaymentType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Charges.mmChargePaymentMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.Transfer31.mmObject();
			isDerived = false;
			xmlTag = "TrfExpnssPmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransferExpensesPaymentType";
			definition = "Specifies how the payment of charges, taxes and commissions as a result of the transfer is covered, that is, whether by cash or the redemption of units.";
			nextVersions_lazy = () -> Arrays.asList(Transfer35.mmTransferExpensesPaymentType);
			previousVersion_lazy = () -> Transfer28.mmTransferExpensesPaymentType;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ChargePaymentMethod1Choice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Transfer31.mmTransferConfirmationReference, com.tools20022.repository.msg.Transfer31.mmTransferReference,
						com.tools20022.repository.msg.Transfer31.mmClientReference, com.tools20022.repository.msg.Transfer31.mmCounterpartyReference, com.tools20022.repository.msg.Transfer31.mmBusinessFlowType,
						com.tools20022.repository.msg.Transfer31.mmEffectiveTransferDate, com.tools20022.repository.msg.Transfer31.mmRequestedSettlementDate, com.tools20022.repository.msg.Transfer31.mmEffectiveSettlementDate,
						com.tools20022.repository.msg.Transfer31.mmTradeDate, com.tools20022.repository.msg.Transfer31.mmTransferOrderDateForm, com.tools20022.repository.msg.Transfer31.mmTransferReason,
						com.tools20022.repository.msg.Transfer31.mmHoldingsPlanType, com.tools20022.repository.msg.Transfer31.mmFinancialInstrumentDetails, com.tools20022.repository.msg.Transfer31.mmTotalUnitsNumber,
						com.tools20022.repository.msg.Transfer31.mmUnitsDetails, com.tools20022.repository.msg.Transfer31.mmPortfolioTransferOutRate, com.tools20022.repository.msg.Transfer31.mmRounding,
						com.tools20022.repository.msg.Transfer31.mmAveragePrice, com.tools20022.repository.msg.Transfer31.mmNewAveragePrice, com.tools20022.repository.msg.Transfer31.mmAverageDate,
						com.tools20022.repository.msg.Transfer31.mmNewAverageDate, com.tools20022.repository.msg.Transfer31.mmTransferCurrency, com.tools20022.repository.msg.Transfer31.mmOwnAccountTransferIndicator,
						com.tools20022.repository.msg.Transfer31.mmNonStandardSettlementInformation, com.tools20022.repository.msg.Transfer31.mmReceivingAgentDetails, com.tools20022.repository.msg.Transfer31.mmDeliveringAgentDetails,
						com.tools20022.repository.msg.Transfer31.mmTransferExpensesPaymentType);
				messageBuildingBlock_lazy = () -> Arrays.asList(TransferOutConfirmationV07.mmTransferDetails);
				trace_lazy = () -> SecuritiesTransfer.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTotalUnitsNumberRule.forTransfer31, com.tools20022.repository.constraints.ConstraintRoundingRule.forTransfer31,
						com.tools20022.repository.constraints.ConstraintSingleAndMultipleTransferConfirmationReferencesGuideline1.forTransfer31);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Transfer31";
				definition = "Parameters applied to the settlement of a security transfer.";
				nextVersions_lazy = () -> Arrays.asList(Transfer35.mmObject());
				previousVersion_lazy = () -> Transfer28.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getTransferConfirmationReference() {
		return transferConfirmationReference;
	}

	public Transfer31 setTransferConfirmationReference(Max35Text transferConfirmationReference) {
		this.transferConfirmationReference = Objects.requireNonNull(transferConfirmationReference);
		return this;
	}

	public Max35Text getTransferReference() {
		return transferReference;
	}

	public Transfer31 setTransferReference(Max35Text transferReference) {
		this.transferReference = Objects.requireNonNull(transferReference);
		return this;
	}

	public Optional<AdditionalReference7> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public Transfer31 setClientReference(com.tools20022.repository.msg.AdditionalReference7 clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<AdditionalReference7> getCounterpartyReference() {
		return counterpartyReference == null ? Optional.empty() : Optional.of(counterpartyReference);
	}

	public Transfer31 setCounterpartyReference(com.tools20022.repository.msg.AdditionalReference7 counterpartyReference) {
		this.counterpartyReference = counterpartyReference;
		return this;
	}

	public Optional<BusinessFlowType1Code> getBusinessFlowType() {
		return businessFlowType == null ? Optional.empty() : Optional.of(businessFlowType);
	}

	public Transfer31 setBusinessFlowType(BusinessFlowType1Code businessFlowType) {
		this.businessFlowType = businessFlowType;
		return this;
	}

	public DateAndDateTimeChoice getEffectiveTransferDate() {
		return effectiveTransferDate;
	}

	public Transfer31 setEffectiveTransferDate(DateAndDateTimeChoice effectiveTransferDate) {
		this.effectiveTransferDate = Objects.requireNonNull(effectiveTransferDate);
		return this;
	}

	public Optional<ISODate> getRequestedSettlementDate() {
		return requestedSettlementDate == null ? Optional.empty() : Optional.of(requestedSettlementDate);
	}

	public Transfer31 setRequestedSettlementDate(ISODate requestedSettlementDate) {
		this.requestedSettlementDate = requestedSettlementDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getEffectiveSettlementDate() {
		return effectiveSettlementDate == null ? Optional.empty() : Optional.of(effectiveSettlementDate);
	}

	public Transfer31 setEffectiveSettlementDate(DateAndDateTimeChoice effectiveSettlementDate) {
		this.effectiveSettlementDate = effectiveSettlementDate;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getTradeDate() {
		return tradeDate == null ? Optional.empty() : Optional.of(tradeDate);
	}

	public Transfer31 setTradeDate(DateAndDateTimeChoice tradeDate) {
		this.tradeDate = tradeDate;
		return this;
	}

	public Optional<ISODate> getTransferOrderDateForm() {
		return transferOrderDateForm == null ? Optional.empty() : Optional.of(transferOrderDateForm);
	}

	public Transfer31 setTransferOrderDateForm(ISODate transferOrderDateForm) {
		this.transferOrderDateForm = transferOrderDateForm;
		return this;
	}

	public Optional<TransferReason1> getTransferReason() {
		return transferReason == null ? Optional.empty() : Optional.of(transferReason);
	}

	public Transfer31 setTransferReason(TransferReason1 transferReason) {
		this.transferReason = transferReason;
		return this;
	}

	public List<HoldingsPlanType1Code> getHoldingsPlanType() {
		return holdingsPlanType == null ? holdingsPlanType = new ArrayList<>() : holdingsPlanType;
	}

	public Transfer31 setHoldingsPlanType(List<HoldingsPlanType1Code> holdingsPlanType) {
		this.holdingsPlanType = Objects.requireNonNull(holdingsPlanType);
		return this;
	}

	public FinancialInstrument49 getFinancialInstrumentDetails() {
		return financialInstrumentDetails;
	}

	public Transfer31 setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument49 financialInstrumentDetails) {
		this.financialInstrumentDetails = Objects.requireNonNull(financialInstrumentDetails);
		return this;
	}

	public FinancialInstrumentQuantity1 getTotalUnitsNumber() {
		return totalUnitsNumber;
	}

	public Transfer31 setTotalUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 totalUnitsNumber) {
		this.totalUnitsNumber = Objects.requireNonNull(totalUnitsNumber);
		return this;
	}

	public List<Unit6> getUnitsDetails() {
		return unitsDetails == null ? unitsDetails = new ArrayList<>() : unitsDetails;
	}

	public Transfer31 setUnitsDetails(List<com.tools20022.repository.msg.Unit6> unitsDetails) {
		this.unitsDetails = Objects.requireNonNull(unitsDetails);
		return this;
	}

	public Optional<PercentageRate> getPortfolioTransferOutRate() {
		return portfolioTransferOutRate == null ? Optional.empty() : Optional.of(portfolioTransferOutRate);
	}

	public Transfer31 setPortfolioTransferOutRate(PercentageRate portfolioTransferOutRate) {
		this.portfolioTransferOutRate = portfolioTransferOutRate;
		return this;
	}

	public Optional<RoundingDirection2Code> getRounding() {
		return rounding == null ? Optional.empty() : Optional.of(rounding);
	}

	public Transfer31 setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getAveragePrice() {
		return averagePrice == null ? Optional.empty() : Optional.of(averagePrice);
	}

	public Transfer31 setAveragePrice(ActiveOrHistoricCurrencyAnd13DecimalAmount averagePrice) {
		this.averagePrice = averagePrice;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAnd13DecimalAmount> getNewAveragePrice() {
		return newAveragePrice == null ? Optional.empty() : Optional.of(newAveragePrice);
	}

	public Transfer31 setNewAveragePrice(ActiveOrHistoricCurrencyAnd13DecimalAmount newAveragePrice) {
		this.newAveragePrice = newAveragePrice;
		return this;
	}

	public Optional<ISODate> getAverageDate() {
		return averageDate == null ? Optional.empty() : Optional.of(averageDate);
	}

	public Transfer31 setAverageDate(ISODate averageDate) {
		this.averageDate = averageDate;
		return this;
	}

	public Optional<ISODate> getNewAverageDate() {
		return newAverageDate == null ? Optional.empty() : Optional.of(newAverageDate);
	}

	public Transfer31 setNewAverageDate(ISODate newAverageDate) {
		this.newAverageDate = newAverageDate;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyCode> getTransferCurrency() {
		return transferCurrency == null ? Optional.empty() : Optional.of(transferCurrency);
	}

	public Transfer31 setTransferCurrency(ActiveOrHistoricCurrencyCode transferCurrency) {
		this.transferCurrency = transferCurrency;
		return this;
	}

	public Optional<YesNoIndicator> getOwnAccountTransferIndicator() {
		return ownAccountTransferIndicator == null ? Optional.empty() : Optional.of(ownAccountTransferIndicator);
	}

	public Transfer31 setOwnAccountTransferIndicator(YesNoIndicator ownAccountTransferIndicator) {
		this.ownAccountTransferIndicator = ownAccountTransferIndicator;
		return this;
	}

	public Optional<Max350Text> getNonStandardSettlementInformation() {
		return nonStandardSettlementInformation == null ? Optional.empty() : Optional.of(nonStandardSettlementInformation);
	}

	public Transfer31 setNonStandardSettlementInformation(Max350Text nonStandardSettlementInformation) {
		this.nonStandardSettlementInformation = nonStandardSettlementInformation;
		return this;
	}

	public Optional<PartyIdentificationAndAccount125> getReceivingAgentDetails() {
		return receivingAgentDetails == null ? Optional.empty() : Optional.of(receivingAgentDetails);
	}

	public Transfer31 setReceivingAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount125 receivingAgentDetails) {
		this.receivingAgentDetails = receivingAgentDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount125> getDeliveringAgentDetails() {
		return deliveringAgentDetails == null ? Optional.empty() : Optional.of(deliveringAgentDetails);
	}

	public Transfer31 setDeliveringAgentDetails(com.tools20022.repository.msg.PartyIdentificationAndAccount125 deliveringAgentDetails) {
		this.deliveringAgentDetails = deliveringAgentDetails;
		return this;
	}

	public Optional<ChargePaymentMethod1Choice> getTransferExpensesPaymentType() {
		return transferExpensesPaymentType == null ? Optional.empty() : Optional.of(transferExpensesPaymentType);
	}

	public Transfer31 setTransferExpensesPaymentType(ChargePaymentMethod1Choice transferExpensesPaymentType) {
		this.transferExpensesPaymentType = transferExpensesPaymentType;
		return this;
	}
}