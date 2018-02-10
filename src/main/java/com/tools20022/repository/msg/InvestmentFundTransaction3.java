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

import com.tools20022.metamodel.*;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.codeset.*;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Creation/cancellation of investment units on the books of the fund or its
 * designated agent, as a result of executing an investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#TransactionTypeOrCorporateActionEventTypeRule
 * InvestmentFundTransaction3.TransactionTypeOrCorporateActionEventTypeRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmTransactionType
 * InvestmentFundTransaction3.mmTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmExtendedTransactionType
 * InvestmentFundTransaction3.mmExtendedTransactionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmCorporateActionEventType
 * InvestmentFundTransaction3.mmCorporateActionEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmExtendedCorporateActionEventType
 * InvestmentFundTransaction3.mmExtendedCorporateActionEventType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmBookingStatus
 * InvestmentFundTransaction3.mmBookingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmMasterReference
 * InvestmentFundTransaction3.mmMasterReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmOrderReference
 * InvestmentFundTransaction3.mmOrderReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmClientReference
 * InvestmentFundTransaction3.mmClientReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmDealReference
 * InvestmentFundTransaction3.mmDealReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmLegIdentification
 * InvestmentFundTransaction3.mmLegIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmLegExecutionIdentification
 * InvestmentFundTransaction3.mmLegExecutionIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmOrderDateTime
 * InvestmentFundTransaction3.mmOrderDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettledTransactionIndicator
 * InvestmentFundTransaction3.mmSettledTransactionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmRegisteredTransactionIndicator
 * InvestmentFundTransaction3.mmRegisteredTransactionIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmUnitsQuantity
 * InvestmentFundTransaction3.mmUnitsQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmCreditDebit
 * InvestmentFundTransaction3.mmCreditDebit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmReversal
 * InvestmentFundTransaction3.mmReversal}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettlementAmount
 * InvestmentFundTransaction3.mmSettlementAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmSettlementDate
 * InvestmentFundTransaction3.mmSettlementDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmTradeDateTime
 * InvestmentFundTransaction3.mmTradeDateTime}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmCumDividendIndicator
 * InvestmentFundTransaction3.mmCumDividendIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmPartiallyExecutedIndicator
 * InvestmentFundTransaction3.mmPartiallyExecutedIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmPriceDetails
 * InvestmentFundTransaction3.mmPriceDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction
 * InvestmentFundTransaction}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionTypeLegIdentificationRule#forInvestmentFundTransaction3
 * ConstraintTransactionTypeLegIdentificationRule.forInvestmentFundTransaction3}
 * </li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintTransactionTypeLegExecutionIdentificationRule#forInvestmentFundTransaction3
 * ConstraintTransactionTypeLegExecutionIdentificationRule.
 * forInvestmentFundTransaction3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "InvestmentFundTransaction3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4
 * InvestmentFundTransaction4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "InvestmentFundTransaction3", propOrder = {"transactionType", "extendedTransactionType", "corporateActionEventType", "extendedCorporateActionEventType", "bookingStatus", "masterReference", "orderReference",
		"clientReference", "dealReference", "legIdentification", "legExecutionIdentification", "orderDateTime", "settledTransactionIndicator", "registeredTransactionIndicator", "unitsQuantity", "creditDebit", "reversal",
		"settlementAmount", "settlementDate", "tradeDateTime", "cumDividendIndicator", "partiallyExecutedIndicator", "priceDetails"})
public class InvestmentFundTransaction3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TxTp", required = true)
	protected TransactionType2Code transactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionType2Code
	 * TransactionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
	 * InvestmentFundTransaction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionType";
			definition = "Type of investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> TransactionType2Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedTxTp", required = true)
	protected Extended350Code extendedTransactionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmType
	 * InvestmentFundTransaction.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedTxTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedTransactionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of investment fund transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedTransactionType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "XtndedTxTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedTransactionType";
			definition = "Type of investment fund transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "CorpActnEvtTp", required = true)
	protected CorporateActionEventType1Code corporateActionEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CorporateActionEventType1Code
	 * CorporateActionEventType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CorpActnEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCorporateActionEventType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "CorpActnEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CorporateActionEventType";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CorporateActionEventType1Code.mmObject();
		}
	};
	@XmlElement(name = "XtndedCorpActnEvtTp", required = true)
	protected Extended350Code extendedCorporateActionEventType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.Extended350Code
	 * Extended350Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CorporateActionEvent#mmType
	 * CorporateActionEvent.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XtndedCorpActnEvtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExtendedCorporateActionEventType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of corporate action event."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExtendedCorporateActionEventType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionEvent.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "XtndedCorpActnEvtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExtendedCorporateActionEventType";
			definition = "Type of corporate action event.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Extended350Code.mmObject();
		}
	};
	@XmlElement(name = "BookgSts")
	protected TransactionStatus1Code bookingStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.TransactionStatus1Code
	 * TransactionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatus#mmTransactionStatus
	 * SecuritiesTradeStatus.mmTransactionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status of an investment fund transaction."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmBookingStatus
	 * InvestmentFundTransaction4.mmBookingStatus}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBookingStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeStatus.mmTransactionStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "BookgSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingStatus";
			definition = "Status of an investment fund transaction.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmBookingStatus);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> TransactionStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "MstrRef")
	protected Max35Text masterReference;
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
	 * {@linkplain com.tools20022.repository.entity.Order#mmMasterIdentification
	 * Order.mmMasterIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MstrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MasterReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmMasterReference
	 * InvestmentFundTransaction4.mmMasterReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmMasterReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Order.mmMasterIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "MstrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MasterReference";
			definition = "Unique and unambiguous identifier for a group of individual orders, as assigned by the instructing party. This identifier links the individual orders together.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmMasterReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrdrRef")
	protected Max35Text orderReference;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesOrder#mmIdentification
	 * SecuritiesOrder.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmOrderReference
	 * InvestmentFundTransaction4.mmOrderReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique identifier for an order, as assigned by the sell-side. The identifier must be unique within a single trading day.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmOrderReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ClntRef")
	protected Max35Text clientReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmClientReference
	 * InvestmentFundTransaction.mmClientReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
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
	 * "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmClientReference
	 * InvestmentFundTransaction4.mmClientReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmClientReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmClientReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "ClntRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ClientReference";
			definition = "Unique and unambiguous investor's identification of an order. This reference can typically be used in a hub scenario to give the reference of the order as assigned by the underlying client.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmClientReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "DealRef")
	protected Max35Text dealReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmDealIdentification
	 * InvestmentFundOrderExecution.mmDealIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DealRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DealReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identifier for an order execution, as assigned by a confirming party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmDealReference
	 * InvestmentFundTransaction4.mmDealReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDealReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmDealIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "DealRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DealReference";
			definition = "Unique and unambiguous identifier for an order execution, as assigned by a confirming party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmDealReference);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "LegId")
	protected Max35Text legIdentification;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique technical identifier for an instance of a leg within a switch."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmLegIdentification
	 * InvestmentFundTransaction4.mmLegIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "LegId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegIdentification";
			definition = "Unique technical identifier for an instance of a leg within a switch.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmLegIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "LegExctnId")
	protected Max35Text legExecutionIdentification;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LegExctnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LegExecutionIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identifier for an instance of a leg execution within a switch confirmation."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmLegExecutionIdentification
	 * InvestmentFundTransaction4.mmLegExecutionIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLegExecutionIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "LegExctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LegExecutionIdentification";
			definition = "Unique identifier for an instance of a leg execution within a switch confirmation.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmLegExecutionIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrdrDtTm")
	protected ISODateTime orderDateTime;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderDateTime
	 * InvestmentFundOrder.mmOrderDateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which the order was placed by the investor."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmOrderDateTime
	 * InvestmentFundTransaction4.mmOrderDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "OrdrDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderDateTime";
			definition = "Date and time at which the order was placed by the investor.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmOrderDateTime);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	@XmlElement(name = "SttldTxInd", required = true)
	protected YesNoIndicator settledTransactionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmSettledIndicator
	 * InvestmentFundOrderExecution.mmSettledIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttldTxInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettledTransactionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the cash payment with respect to the executed order is settled."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettledTransactionIndicator
	 * InvestmentFundTransaction4.mmSettledTransactionIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettledTransactionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmSettledIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "SttldTxInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettledTransactionIndicator";
			definition = "Indicates whether the cash payment with respect to the executed order is settled.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmSettledTransactionIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "RegdTxInd", required = true)
	protected YesNoIndicator registeredTransactionIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmRegisteredIndicator
	 * InvestmentFundOrderExecution.mmRegisteredIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RegdTxInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RegisteredTransactionIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the executed order has a registered status on the books of the transfer agent."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmRegisteredTransactionIndicator
	 * InvestmentFundTransaction4.mmRegisteredTransactionIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRegisteredTransactionIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmRegisteredIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "RegdTxInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RegisteredTransactionIndicator";
			definition = "Indicates whether the executed order has a registered status on the books of the transfer agent.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmRegisteredTransactionIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "UnitsQty", required = true)
	protected FinancialInstrumentQuantity1 unitsQuantity;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmUnitsNumber
	 * InvestmentFundOrderExecution.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of investment funds units."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmUnitsQuantity
	 * InvestmentFundTransaction4.mmUnitsQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitsQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "UnitsQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsQuantity";
			definition = "Number of investment funds units.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmUnitsQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	@XmlElement(name = "CdtDbt", required = true)
	protected CreditDebitCode creditDebit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CreditDebitCode
	 * CreditDebitCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmCreditDebitIndicator
	 * InvestmentFundTransaction.mmCreditDebitIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CdtDbt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CreditDebit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Direction of the transaction being reported, ie, securities are received (credited) or delivered (debited)."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmCreditDebit
	 * InvestmentFundTransaction4.mmCreditDebit}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCreditDebit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmCreditDebitIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "CdtDbt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CreditDebit";
			definition = "Direction of the transaction being reported, ie, securities are received (credited) or delivered (debited).";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmCreditDebit);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CreditDebitCode.mmObject();
		}
	};
	@XmlElement(name = "Rvsl")
	protected ReversalCode reversal;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.ReversalCode
	 * ReversalCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rvsl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reversal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Transaction being reported is a reversal of previously reported transaction."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmReversal
	 * InvestmentFundTransaction4.mmReversal}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmReversal = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "Rvsl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reversal";
			definition = "Transaction being reported is a reversal of previously reported transaction.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmReversal);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ReversalCode.mmObject();
		}
	};
	@XmlElement(name = "SttlmAmt")
	protected ActiveCurrencyAndAmount settlementAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveCurrencyAndAmount
	 * ActiveCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementAmount
	 * SecuritiesSettlement.mmSettlementAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
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
	 * "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettlementAmount
	 * InvestmentFundTransaction4.mmSettlementAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Amount of money to be moved between the debtor and creditor, before deduction of charges, expressed in the currency as ordered by the initiating party.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmSettlementAmount);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "SttlmDt")
	protected ISODate settlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlement#mmSettlementDate
	 * SecuritiesSettlement.mmSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the debtor expects the amount of money to be available to the creditor."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmSettlementDate
	 * InvestmentFundTransaction4.mmSettlementDate}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesSettlement.mmSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "SttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementDate";
			definition = "Date on which the debtor expects the amount of money to be available to the creditor.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmSettlementDate);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	@XmlElement(name = "TradDtTm", required = true)
	protected DateAndDateTimeChoice tradeDateTime;
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TradDtTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeDateTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date and time at which a price is applied, according to the terms stated in the prospectus."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmTradeDateTime
	 * InvestmentFundTransaction4.mmTradeDateTime}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTradeDateTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeDateTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "TradDtTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeDateTime";
			definition = "Date and time at which a price is applied, according to the terms stated in the prospectus.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmTradeDateTime);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};
	@XmlElement(name = "CumDvddInd", required = true)
	protected YesNoIndicator cumDividendIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmCumDividendIndicator
	 * SecuritiesPricing.mmCumDividendIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CumDvddInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CumDividendIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmCumDividendIndicator
	 * InvestmentFundTransaction4.mmCumDividendIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCumDividendIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmCumDividendIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "CumDvddInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CumDividendIndicator";
			definition = "Indicates whether the dividend is included, ie, cum-dividend, in the executed price. When the dividend is not included, the price will be ex-dividend.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmCumDividendIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PrtlyExctdInd", required = true)
	protected YesNoIndicator partiallyExecutedIndicator;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmPartiallyExecutedIndicator
	 * InvestmentFundOrderExecution.mmPartiallyExecutedIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtlyExctdInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PartiallyExecutedIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPartiallyExecutedIndicator
	 * InvestmentFundTransaction4.mmPartiallyExecutedIndicator}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPartiallyExecutedIndicator = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmPartiallyExecutedIndicator;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "PrtlyExctdInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PartiallyExecutedIndicator";
			definition = "Indicates whether the order has been partially executed, ie, the confirmed quantity does not match the ordered quantity for a given financial instrument.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmPartiallyExecutedIndicator);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PricDtls")
	protected UnitPrice11 priceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.UnitPrice11
	 * UnitPrice11}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrderExecution#mmExecutedTradePrice
	 * InvestmentFundOrderExecution.mmExecutedTradePrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price at which the order was executed."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction4#mmPriceDetails
	 * InvestmentFundTransaction4.mmPriceDetails}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPriceDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrderExecution.mmExecutedTradePrice;
			componentContext_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			isDerived = false;
			xmlTag = "PricDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceDetails";
			definition = "Price at which the order was executed.";
			nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmPriceDetails);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.UnitPrice11.mmObject();
		}
	};
	/**
	 * Either TransactionType or ExtendedTransactionType or
	 * CorporateActionEventType or ExtendedCorporateActionEventType must be
	 * present but not more than one.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3
	 * InvestmentFundTransaction3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmTransactionType
	 * InvestmentFundTransaction3.mmTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmExtendedTransactionType
	 * InvestmentFundTransaction3.mmExtendedTransactionType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmCorporateActionEventType
	 * InvestmentFundTransaction3.mmCorporateActionEventType}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.InvestmentFundTransaction3#mmExtendedCorporateActionEventType
	 * InvestmentFundTransaction3.mmExtendedCorporateActionEventType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TransactionTypeOrCorporateActionEventTypeRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either TransactionType or ExtendedTransactionType or CorporateActionEventType or ExtendedCorporateActionEventType must be present but not more than one."
	 * </li>
	 * </ul>
	 */
	public static final MMXor TransactionTypeOrCorporateActionEventTypeRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TransactionTypeOrCorporateActionEventTypeRule";
			definition = "Either TransactionType or ExtendedTransactionType or CorporateActionEventType or ExtendedCorporateActionEventType must be present but not more than one.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.InvestmentFundTransaction3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction3.mmTransactionType, com.tools20022.repository.msg.InvestmentFundTransaction3.mmExtendedTransactionType,
					com.tools20022.repository.msg.InvestmentFundTransaction3.mmCorporateActionEventType, com.tools20022.repository.msg.InvestmentFundTransaction3.mmExtendedCorporateActionEventType);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction3.mmTransactionType, com.tools20022.repository.msg.InvestmentFundTransaction3.mmExtendedTransactionType,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmCorporateActionEventType, com.tools20022.repository.msg.InvestmentFundTransaction3.mmExtendedCorporateActionEventType,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmBookingStatus, com.tools20022.repository.msg.InvestmentFundTransaction3.mmMasterReference,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmOrderReference, com.tools20022.repository.msg.InvestmentFundTransaction3.mmClientReference,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmDealReference, com.tools20022.repository.msg.InvestmentFundTransaction3.mmLegIdentification,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmLegExecutionIdentification, com.tools20022.repository.msg.InvestmentFundTransaction3.mmOrderDateTime,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmSettledTransactionIndicator, com.tools20022.repository.msg.InvestmentFundTransaction3.mmRegisteredTransactionIndicator,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmUnitsQuantity, com.tools20022.repository.msg.InvestmentFundTransaction3.mmCreditDebit, com.tools20022.repository.msg.InvestmentFundTransaction3.mmReversal,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmSettlementAmount, com.tools20022.repository.msg.InvestmentFundTransaction3.mmSettlementDate,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmTradeDateTime, com.tools20022.repository.msg.InvestmentFundTransaction3.mmCumDividendIndicator,
						com.tools20022.repository.msg.InvestmentFundTransaction3.mmPartiallyExecutedIndicator, com.tools20022.repository.msg.InvestmentFundTransaction3.mmPriceDetails);
				trace_lazy = () -> InvestmentFundTransaction.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintTransactionTypeLegIdentificationRule.forInvestmentFundTransaction3,
						com.tools20022.repository.constraints.ConstraintTransactionTypeLegExecutionIdentificationRule.forInvestmentFundTransaction3);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "InvestmentFundTransaction3";
				definition = "Creation/cancellation of investment units on the books of the fund or its designated agent, as a result of executing an investment fund order.";
				nextVersions_lazy = () -> Arrays.asList(InvestmentFundTransaction4.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.InvestmentFundTransaction3.TransactionTypeOrCorporateActionEventTypeRule);
			}
		});
		return mmObject_lazy.get();
	}

	public TransactionType2Code getTransactionType() {
		return transactionType;
	}

	public InvestmentFundTransaction3 setTransactionType(TransactionType2Code transactionType) {
		this.transactionType = Objects.requireNonNull(transactionType);
		return this;
	}

	public Extended350Code getExtendedTransactionType() {
		return extendedTransactionType;
	}

	public InvestmentFundTransaction3 setExtendedTransactionType(Extended350Code extendedTransactionType) {
		this.extendedTransactionType = Objects.requireNonNull(extendedTransactionType);
		return this;
	}

	public CorporateActionEventType1Code getCorporateActionEventType() {
		return corporateActionEventType;
	}

	public InvestmentFundTransaction3 setCorporateActionEventType(CorporateActionEventType1Code corporateActionEventType) {
		this.corporateActionEventType = Objects.requireNonNull(corporateActionEventType);
		return this;
	}

	public Extended350Code getExtendedCorporateActionEventType() {
		return extendedCorporateActionEventType;
	}

	public InvestmentFundTransaction3 setExtendedCorporateActionEventType(Extended350Code extendedCorporateActionEventType) {
		this.extendedCorporateActionEventType = Objects.requireNonNull(extendedCorporateActionEventType);
		return this;
	}

	public Optional<TransactionStatus1Code> getBookingStatus() {
		return bookingStatus == null ? Optional.empty() : Optional.of(bookingStatus);
	}

	public InvestmentFundTransaction3 setBookingStatus(TransactionStatus1Code bookingStatus) {
		this.bookingStatus = bookingStatus;
		return this;
	}

	public Optional<Max35Text> getMasterReference() {
		return masterReference == null ? Optional.empty() : Optional.of(masterReference);
	}

	public InvestmentFundTransaction3 setMasterReference(Max35Text masterReference) {
		this.masterReference = masterReference;
		return this;
	}

	public Optional<Max35Text> getOrderReference() {
		return orderReference == null ? Optional.empty() : Optional.of(orderReference);
	}

	public InvestmentFundTransaction3 setOrderReference(Max35Text orderReference) {
		this.orderReference = orderReference;
		return this;
	}

	public Optional<Max35Text> getClientReference() {
		return clientReference == null ? Optional.empty() : Optional.of(clientReference);
	}

	public InvestmentFundTransaction3 setClientReference(Max35Text clientReference) {
		this.clientReference = clientReference;
		return this;
	}

	public Optional<Max35Text> getDealReference() {
		return dealReference == null ? Optional.empty() : Optional.of(dealReference);
	}

	public InvestmentFundTransaction3 setDealReference(Max35Text dealReference) {
		this.dealReference = dealReference;
		return this;
	}

	public Optional<Max35Text> getLegIdentification() {
		return legIdentification == null ? Optional.empty() : Optional.of(legIdentification);
	}

	public InvestmentFundTransaction3 setLegIdentification(Max35Text legIdentification) {
		this.legIdentification = legIdentification;
		return this;
	}

	public Optional<Max35Text> getLegExecutionIdentification() {
		return legExecutionIdentification == null ? Optional.empty() : Optional.of(legExecutionIdentification);
	}

	public InvestmentFundTransaction3 setLegExecutionIdentification(Max35Text legExecutionIdentification) {
		this.legExecutionIdentification = legExecutionIdentification;
		return this;
	}

	public Optional<ISODateTime> getOrderDateTime() {
		return orderDateTime == null ? Optional.empty() : Optional.of(orderDateTime);
	}

	public InvestmentFundTransaction3 setOrderDateTime(ISODateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
		return this;
	}

	public YesNoIndicator getSettledTransactionIndicator() {
		return settledTransactionIndicator;
	}

	public InvestmentFundTransaction3 setSettledTransactionIndicator(YesNoIndicator settledTransactionIndicator) {
		this.settledTransactionIndicator = Objects.requireNonNull(settledTransactionIndicator);
		return this;
	}

	public YesNoIndicator getRegisteredTransactionIndicator() {
		return registeredTransactionIndicator;
	}

	public InvestmentFundTransaction3 setRegisteredTransactionIndicator(YesNoIndicator registeredTransactionIndicator) {
		this.registeredTransactionIndicator = Objects.requireNonNull(registeredTransactionIndicator);
		return this;
	}

	public FinancialInstrumentQuantity1 getUnitsQuantity() {
		return unitsQuantity;
	}

	public InvestmentFundTransaction3 setUnitsQuantity(com.tools20022.repository.msg.FinancialInstrumentQuantity1 unitsQuantity) {
		this.unitsQuantity = Objects.requireNonNull(unitsQuantity);
		return this;
	}

	public CreditDebitCode getCreditDebit() {
		return creditDebit;
	}

	public InvestmentFundTransaction3 setCreditDebit(CreditDebitCode creditDebit) {
		this.creditDebit = Objects.requireNonNull(creditDebit);
		return this;
	}

	public Optional<ReversalCode> getReversal() {
		return reversal == null ? Optional.empty() : Optional.of(reversal);
	}

	public InvestmentFundTransaction3 setReversal(ReversalCode reversal) {
		this.reversal = reversal;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public InvestmentFundTransaction3 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ISODate> getSettlementDate() {
		return settlementDate == null ? Optional.empty() : Optional.of(settlementDate);
	}

	public InvestmentFundTransaction3 setSettlementDate(ISODate settlementDate) {
		this.settlementDate = settlementDate;
		return this;
	}

	public DateAndDateTimeChoice getTradeDateTime() {
		return tradeDateTime;
	}

	public InvestmentFundTransaction3 setTradeDateTime(DateAndDateTimeChoice tradeDateTime) {
		this.tradeDateTime = Objects.requireNonNull(tradeDateTime);
		return this;
	}

	public YesNoIndicator getCumDividendIndicator() {
		return cumDividendIndicator;
	}

	public InvestmentFundTransaction3 setCumDividendIndicator(YesNoIndicator cumDividendIndicator) {
		this.cumDividendIndicator = Objects.requireNonNull(cumDividendIndicator);
		return this;
	}

	public YesNoIndicator getPartiallyExecutedIndicator() {
		return partiallyExecutedIndicator;
	}

	public InvestmentFundTransaction3 setPartiallyExecutedIndicator(YesNoIndicator partiallyExecutedIndicator) {
		this.partiallyExecutedIndicator = Objects.requireNonNull(partiallyExecutedIndicator);
		return this;
	}

	public Optional<UnitPrice11> getPriceDetails() {
		return priceDetails == null ? Optional.empty() : Optional.of(priceDetails);
	}

	public InvestmentFundTransaction3 setPriceDetails(com.tools20022.repository.msg.UnitPrice11 priceDetails) {
		this.priceDetails = priceDetails;
		return this;
	}
}