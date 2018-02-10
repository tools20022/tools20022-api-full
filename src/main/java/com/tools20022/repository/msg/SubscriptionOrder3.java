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
import com.tools20022.repository.codeset.IncomePreference1Code;
import com.tools20022.repository.codeset.RoundingDirection2Code;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Order to invest the investor's principal in an investment fund.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#NetAmountOrUnitsNumberRule
 * SubscriptionOrder3.NetAmountOrUnitsNumberRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmOrderReference
 * SubscriptionOrder3.mmOrderReference}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmOrderType
 * SubscriptionOrder3.mmOrderType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmInvestmentAccountDetails
 * SubscriptionOrder3.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmBeneficiaryDetails
 * SubscriptionOrder3.mmBeneficiaryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmUnitsNumber
 * SubscriptionOrder3.mmUnitsNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmNetAmount
 * SubscriptionOrder3.mmNetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmRounding
 * SubscriptionOrder3.mmRounding}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmGrossAmount
 * SubscriptionOrder3.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmForeignExchangeDetails
 * SubscriptionOrder3.mmForeignExchangeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmIncomePreference
 * SubscriptionOrder3.mmIncomePreference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmLetterIntentReference
 * SubscriptionOrder3.mmLetterIntentReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmAccumulationRightReference
 * SubscriptionOrder3.mmAccumulationRightReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmChargeDetails
 * SubscriptionOrder3.mmChargeDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmCommissionDetails
 * SubscriptionOrder3.mmCommissionDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmTaxDetails
 * SubscriptionOrder3.mmTaxDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmSettlementAndCustodyDetails
 * SubscriptionOrder3.mmSettlementAndCustodyDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmPhysicalDeliveryIndicator
 * SubscriptionOrder3.mmPhysicalDeliveryIndicator}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmPhysicalDeliveryDetails
 * SubscriptionOrder3.mmPhysicalDeliveryDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmCashSettlementDetails
 * SubscriptionOrder3.mmCashSettlementDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SubscriptionOrder
 * SubscriptionOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetailsRule#forSubscriptionOrder3
 * ConstraintPhysicalDeliveryDetailsRule.forSubscriptionOrder3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubscriptionOrder3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Order to invest the investor's principal in an investment fund."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubscriptionOrder3", propOrder = {"orderReference", "orderType", "investmentAccountDetails", "beneficiaryDetails", "unitsNumber", "netAmount", "rounding", "grossAmount", "foreignExchangeDetails", "incomePreference",
		"letterIntentReference", "accumulationRightReference", "chargeDetails", "commissionDetails", "taxDetails", "settlementAndCustodyDetails", "physicalDeliveryIndicator", "physicalDeliveryDetails", "cashSettlementDetails"})
public class SubscriptionOrder3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrdrRef", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
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
	 * "Unique and unambiguous identifier for an order, as assigned by the instructing party."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesOrder.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "OrdrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderReference";
			definition = "Unique and unambiguous identifier for an order, as assigned by the instructing party.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "OrdrTp")
	protected List<com.tools20022.repository.msg.FundOrderType1> orderType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.FundOrderType1
	 * FundOrderType1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmOrderType
	 * InvestmentFundOrder.mmOrderType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrdrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OrderType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the category of the investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmOrderType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmOrderType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "OrdrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OrderType";
			definition = "Specifies the category of the investment fund order.";
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.FundOrderType1.mmObject();
		}
	};
	@XmlElement(name = "InvstmtAcctDtls", required = true)
	protected InvestmentAccount13 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount13
	 * InvestmentAccount13}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InvstmtAcctDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InvestmentAccountDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Account impacted by an investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account impacted by an investment fund order.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount13.mmObject();
		}
	};
	@XmlElement(name = "BnfcryDtls")
	protected IndividualPerson2 beneficiaryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.IndividualPerson2
	 * IndividualPerson2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Person Person}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BnfcryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BeneficiaryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the investor."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmBeneficiaryDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Person.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "BnfcryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BeneficiaryDetails";
			definition = "Additional information about the investor.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.IndividualPerson2.mmObject();
		}
	};
	@XmlElement(name = "UnitsNb", required = true)
	protected FinancialInstrumentQuantity1 unitsNumber;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitsNb"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitsNumber"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity of investment fund units to be subscribed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Quantity of investment fund units to be subscribed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity1.mmObject();
		}
	};
	@XmlElement(name = "NetAmt", required = true)
	protected ActiveOrHistoricCurrencyAndAmount netAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmNetAmount
	 * InvestmentFundOrder.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NetAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to determine the quantity of investment fund units to be subscribed."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
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
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRounding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RoundingParameters.mmRoundingDirection;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "Rndg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Rounding";
			definition = "Indicates the rounding direction applied to nearest unit.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RoundingDirection2Code.mmObject();
		}
	};
	@XmlElement(name = "GrssAmt")
	protected ActiveOrHistoricCurrencyAndAmount grossAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount
	 * ActiveOrHistoricCurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmGrossAmount
	 * InvestmentFundOrder.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrssAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrossAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money used to determine the quantity of investment fund units to be subscribed, including all charges, commissions, and tax."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Amount of money used to determine the quantity of investment fund units to be subscribed, including all charges, commissions, and tax.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "FXDtls")
	protected ForeignExchangeTerms5 foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms5
	 * ForeignExchangeTerms5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.ForeignExchangeTrade#mmAgreedRate
	 * ForeignExchangeTrade.mmAgreedRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "FXDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForeignExchangeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information needed to process a currency exchange or conversion."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> ForeignExchangeTrade.mmAgreedRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Information needed to process a currency exchange or conversion.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms5.mmObject();
		}
	};
	@XmlElement(name = "IncmPref")
	protected IncomePreference1Code incomePreference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.IncomePreference1Code
	 * IncomePreference1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountService#mmIncomePreference
	 * InvestmentAccountService.mmIncomePreference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IncmPref"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IncomePreference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Dividend option chosen by the account owner based on the options offered in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIncomePreference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountService.mmIncomePreference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "IncmPref";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IncomePreference";
			definition = "Dividend option chosen by the account owner based on the options offered in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> IncomePreference1Code.mmObject();
		}
	};
	@XmlElement(name = "LttrInttRef")
	protected Max35Text letterIntentReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccount#mmInvestmentAccountContract
	 * InvestmentAccount.mmInvestmentAccountContract}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LttrInttRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LetterIntentReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLetterIntentReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccount.mmInvestmentAccountContract;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "LttrInttRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LetterIntentReference";
			definition = "Reference of a letter of intent program, in which sales commissions are reduced based on the aggregate of a customer's actual purchase and anticipated purchases, over a specific period of time, and as agreed by the customer. A letter of intent program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "AcmltnRghtRef")
	protected Max35Text accumulationRightReference;
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
	 * {@linkplain com.tools20022.repository.entity.InvestmentAccountContract#mmAccumulationRightReference
	 * InvestmentAccountContract.mmAccumulationRightReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcmltnRghtRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccumulationRightReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference of an accumulation right program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccumulationRightReference = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentAccountContract.mmAccumulationRightReference;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "AcmltnRghtRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccumulationRightReference";
			definition = "Reference of an accumulation right program, in which sales commissions are based on a customer's present purchases of shares and the aggregate quantity previously purchased by the customer. An accumulation rights program is mainly used in the US market.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "ChrgDtls")
	protected List<com.tools20022.repository.msg.Charge8> chargeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Charge8 Charge8}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionCharge
	 * InvestmentFundTransaction.mmTransactionCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Charge for the placement of an order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmChargeDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "ChrgDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeDetails";
			definition = "Charge for the placement of an order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Charge8.mmObject();
		}
	};
	@XmlElement(name = "ComssnDtls")
	protected List<com.tools20022.repository.msg.Commission6> commissionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Commission6
	 * Commission6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Trade#mmTradeCommission
	 * Trade.mmTradeCommission}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Commission linked to the execution of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCommissionDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Trade.mmTradeCommission;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "ComssnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionDetails";
			definition = "Commission linked to the execution of an investment fund order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Commission6.mmObject();
		}
	};
	@XmlElement(name = "TaxDtls")
	protected List<com.tools20022.repository.msg.Tax6> taxDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Tax6 Tax6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmTransactionTax
	 * InvestmentFundTransaction.mmTransactionTax}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Tax applicable to an investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmTransactionTax;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "TaxDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDetails";
			definition = "Tax applicable to an investment fund order.";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.Tax6.mmObject();
		}
	};
	@XmlElement(name = "SttlmAndCtdyDtls")
	protected FundSettlementParameters4 settlementAndCustodyDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FundSettlementParameters4
	 * FundSettlementParameters4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeExecution#mmSecuritiesSettlement
	 * SecuritiesTradeExecution.mmSecuritiesSettlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SttlmAndCtdyDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SettlementAndCustodyDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Parameters used to execute the settlement of an investment fund order."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSettlementAndCustodyDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesTradeExecution.mmSecuritiesSettlement;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "SttlmAndCtdyDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAndCustodyDetails";
			definition = "Parameters used to execute the settlement of an investment fund order.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FundSettlementParameters4.mmObject();
		}
	};
	@XmlElement(name = "PhysDlvryInd", required = true)
	protected YesNoIndicator physicalDeliveryIndicator;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryInd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryIndicator"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the financial instrument is to be physically delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPhysicalDeliveryIndicator = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryInd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryIndicator";
			definition = "Indicates whether the financial instrument is to be physically delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "PhysDlvryDtls")
	protected NameAndAddress4 physicalDeliveryDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress4
	 * NameAndAddress4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PhysicalDelivery#mmAddress
	 * PhysicalDelivery.mmAddress}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PhysDlvryDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PhysicalDeliveryDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information related to physical delivery of the securities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmPhysicalDeliveryDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PhysicalDelivery.mmAddress;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "PhysDlvryDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PhysicalDeliveryDetails";
			definition = "Information related to physical delivery of the securities.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress4.mmObject();
		}
	};
	@XmlElement(name = "CshSttlmDtls")
	protected PaymentTransaction17 cashSettlementDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PaymentTransaction17
	 * PaymentTransaction17}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmPaymentOffset
	 * PaymentObligation.mmPaymentOffset}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshSttlmDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashSettlementDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Payment transaction resulting from the investment fund order execution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCashSettlementDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmPaymentOffset;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			isDerived = false;
			xmlTag = "CshSttlmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashSettlementDetails";
			definition = "Payment transaction resulting from the investment fund order execution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PaymentTransaction17.mmObject();
		}
	};
	/**
	 * Either NetAmount or UnitsNumber must be present, but not both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3
	 * SubscriptionOrder3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmUnitsNumber
	 * SubscriptionOrder3.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.SubscriptionOrder3#mmNetAmount
	 * SubscriptionOrder3.mmNetAmount}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NetAmountOrUnitsNumberRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either NetAmount or UnitsNumber must be present, but not both."</li>
	 * </ul>
	 */
	public static final MMXor NetAmountOrUnitsNumberRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmountOrUnitsNumberRule";
			definition = "Either NetAmount or UnitsNumber must be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.SubscriptionOrder3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder3.mmUnitsNumber, com.tools20022.repository.msg.SubscriptionOrder3.mmNetAmount);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder3.mmOrderReference, com.tools20022.repository.msg.SubscriptionOrder3.mmOrderType,
						com.tools20022.repository.msg.SubscriptionOrder3.mmInvestmentAccountDetails, com.tools20022.repository.msg.SubscriptionOrder3.mmBeneficiaryDetails, com.tools20022.repository.msg.SubscriptionOrder3.mmUnitsNumber,
						com.tools20022.repository.msg.SubscriptionOrder3.mmNetAmount, com.tools20022.repository.msg.SubscriptionOrder3.mmRounding, com.tools20022.repository.msg.SubscriptionOrder3.mmGrossAmount,
						com.tools20022.repository.msg.SubscriptionOrder3.mmForeignExchangeDetails, com.tools20022.repository.msg.SubscriptionOrder3.mmIncomePreference,
						com.tools20022.repository.msg.SubscriptionOrder3.mmLetterIntentReference, com.tools20022.repository.msg.SubscriptionOrder3.mmAccumulationRightReference,
						com.tools20022.repository.msg.SubscriptionOrder3.mmChargeDetails, com.tools20022.repository.msg.SubscriptionOrder3.mmCommissionDetails, com.tools20022.repository.msg.SubscriptionOrder3.mmTaxDetails,
						com.tools20022.repository.msg.SubscriptionOrder3.mmSettlementAndCustodyDetails, com.tools20022.repository.msg.SubscriptionOrder3.mmPhysicalDeliveryIndicator,
						com.tools20022.repository.msg.SubscriptionOrder3.mmPhysicalDeliveryDetails, com.tools20022.repository.msg.SubscriptionOrder3.mmCashSettlementDetails);
				trace_lazy = () -> SubscriptionOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintPhysicalDeliveryDetailsRule.forSubscriptionOrder3);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "SubscriptionOrder3";
				definition = "Order to invest the investor's principal in an investment fund.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubscriptionOrder3.NetAmountOrUnitsNumberRule);
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getOrderReference() {
		return orderReference;
	}

	public SubscriptionOrder3 setOrderReference(Max35Text orderReference) {
		this.orderReference = Objects.requireNonNull(orderReference);
		return this;
	}

	public List<FundOrderType1> getOrderType() {
		return orderType == null ? orderType = new ArrayList<>() : orderType;
	}

	public SubscriptionOrder3 setOrderType(List<com.tools20022.repository.msg.FundOrderType1> orderType) {
		this.orderType = Objects.requireNonNull(orderType);
		return this;
	}

	public InvestmentAccount13 getInvestmentAccountDetails() {
		return investmentAccountDetails;
	}

	public SubscriptionOrder3 setInvestmentAccountDetails(com.tools20022.repository.msg.InvestmentAccount13 investmentAccountDetails) {
		this.investmentAccountDetails = Objects.requireNonNull(investmentAccountDetails);
		return this;
	}

	public Optional<IndividualPerson2> getBeneficiaryDetails() {
		return beneficiaryDetails == null ? Optional.empty() : Optional.of(beneficiaryDetails);
	}

	public SubscriptionOrder3 setBeneficiaryDetails(com.tools20022.repository.msg.IndividualPerson2 beneficiaryDetails) {
		this.beneficiaryDetails = beneficiaryDetails;
		return this;
	}

	public FinancialInstrumentQuantity1 getUnitsNumber() {
		return unitsNumber;
	}

	public SubscriptionOrder3 setUnitsNumber(com.tools20022.repository.msg.FinancialInstrumentQuantity1 unitsNumber) {
		this.unitsNumber = Objects.requireNonNull(unitsNumber);
		return this;
	}

	public ActiveOrHistoricCurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public SubscriptionOrder3 setNetAmount(ActiveOrHistoricCurrencyAndAmount netAmount) {
		this.netAmount = Objects.requireNonNull(netAmount);
		return this;
	}

	public Optional<RoundingDirection2Code> getRounding() {
		return rounding == null ? Optional.empty() : Optional.of(rounding);
	}

	public SubscriptionOrder3 setRounding(RoundingDirection2Code rounding) {
		this.rounding = rounding;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getGrossAmount() {
		return grossAmount == null ? Optional.empty() : Optional.of(grossAmount);
	}

	public SubscriptionOrder3 setGrossAmount(ActiveOrHistoricCurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
		return this;
	}

	public Optional<ForeignExchangeTerms5> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public SubscriptionOrder3 setForeignExchangeDetails(com.tools20022.repository.msg.ForeignExchangeTerms5 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}

	public Optional<IncomePreference1Code> getIncomePreference() {
		return incomePreference == null ? Optional.empty() : Optional.of(incomePreference);
	}

	public SubscriptionOrder3 setIncomePreference(IncomePreference1Code incomePreference) {
		this.incomePreference = incomePreference;
		return this;
	}

	public Optional<Max35Text> getLetterIntentReference() {
		return letterIntentReference == null ? Optional.empty() : Optional.of(letterIntentReference);
	}

	public SubscriptionOrder3 setLetterIntentReference(Max35Text letterIntentReference) {
		this.letterIntentReference = letterIntentReference;
		return this;
	}

	public Optional<Max35Text> getAccumulationRightReference() {
		return accumulationRightReference == null ? Optional.empty() : Optional.of(accumulationRightReference);
	}

	public SubscriptionOrder3 setAccumulationRightReference(Max35Text accumulationRightReference) {
		this.accumulationRightReference = accumulationRightReference;
		return this;
	}

	public List<Charge8> getChargeDetails() {
		return chargeDetails == null ? chargeDetails = new ArrayList<>() : chargeDetails;
	}

	public SubscriptionOrder3 setChargeDetails(List<com.tools20022.repository.msg.Charge8> chargeDetails) {
		this.chargeDetails = Objects.requireNonNull(chargeDetails);
		return this;
	}

	public List<Commission6> getCommissionDetails() {
		return commissionDetails == null ? commissionDetails = new ArrayList<>() : commissionDetails;
	}

	public SubscriptionOrder3 setCommissionDetails(List<com.tools20022.repository.msg.Commission6> commissionDetails) {
		this.commissionDetails = Objects.requireNonNull(commissionDetails);
		return this;
	}

	public List<Tax6> getTaxDetails() {
		return taxDetails == null ? taxDetails = new ArrayList<>() : taxDetails;
	}

	public SubscriptionOrder3 setTaxDetails(List<com.tools20022.repository.msg.Tax6> taxDetails) {
		this.taxDetails = Objects.requireNonNull(taxDetails);
		return this;
	}

	public Optional<FundSettlementParameters4> getSettlementAndCustodyDetails() {
		return settlementAndCustodyDetails == null ? Optional.empty() : Optional.of(settlementAndCustodyDetails);
	}

	public SubscriptionOrder3 setSettlementAndCustodyDetails(com.tools20022.repository.msg.FundSettlementParameters4 settlementAndCustodyDetails) {
		this.settlementAndCustodyDetails = settlementAndCustodyDetails;
		return this;
	}

	public YesNoIndicator getPhysicalDeliveryIndicator() {
		return physicalDeliveryIndicator;
	}

	public SubscriptionOrder3 setPhysicalDeliveryIndicator(YesNoIndicator physicalDeliveryIndicator) {
		this.physicalDeliveryIndicator = Objects.requireNonNull(physicalDeliveryIndicator);
		return this;
	}

	public Optional<NameAndAddress4> getPhysicalDeliveryDetails() {
		return physicalDeliveryDetails == null ? Optional.empty() : Optional.of(physicalDeliveryDetails);
	}

	public SubscriptionOrder3 setPhysicalDeliveryDetails(com.tools20022.repository.msg.NameAndAddress4 physicalDeliveryDetails) {
		this.physicalDeliveryDetails = physicalDeliveryDetails;
		return this;
	}

	public Optional<PaymentTransaction17> getCashSettlementDetails() {
		return cashSettlementDetails == null ? Optional.empty() : Optional.of(cashSettlementDetails);
	}

	public SubscriptionOrder3 setCashSettlementDetails(com.tools20022.repository.msg.PaymentTransaction17 cashSettlementDetails) {
		this.cashSettlementDetails = cashSettlementDetails;
		return this;
	}
}