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
import com.tools20022.repository.codeset.ActiveCurrencyCode;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.ActiveOrHistoricCurrencyAndAmount;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Extract of trade data for an investment fund order.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmInvestmentAccountDetails
 * FundOrderData5.mmInvestmentAccountDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmFinancialInstrumentDetails
 * FundOrderData5.mmFinancialInstrumentDetails}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#mmUnitsNumber
 * FundOrderData5.mmUnitsNumber}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#mmNetAmount
 * FundOrderData5.mmNetAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#mmGrossAmount
 * FundOrderData5.mmGrossAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmHoldingsRedemptionRate
 * FundOrderData5.mmHoldingsRedemptionRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmSettlementAmount
 * FundOrderData5.mmSettlementAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.FundOrderData5#mmUnitCurrency
 * FundOrderData5.mmUnitCurrency}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FundOrderData5#mmQuotedCurrency
 * FundOrderData5.mmQuotedCurrency}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.InvestmentFundOrder
 * InvestmentFundOrder}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintOrderDataElementRule#forFundOrderData5
 * ConstraintOrderDataElementRule.forFundOrderData5}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FundOrderData5"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Extract of trade data for an investment fund order."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.FundOrderData1
 * FundOrderData1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FundOrderData5", propOrder = {"investmentAccountDetails", "financialInstrumentDetails", "unitsNumber", "netAmount", "grossAmount", "holdingsRedemptionRate", "settlementAmount", "unitCurrency", "quotedCurrency"})
public class FundOrderData5 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "InvstmtAcctDtls")
	protected InvestmentAccount58 investmentAccountDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.InvestmentAccount58
	 * InvestmentAccount58}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentAccount
	 * InvestmentFundTransaction.mmInvestmentAccount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
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
	 * definition} =
	 * "Account information of the individual order instruction for which the status is given."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmInvestmentAccountDetails
	 * FundOrderData1.mmInvestmentAccountDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmInvestmentAccountDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentAccount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
			isDerived = false;
			xmlTag = "InvstmtAcctDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InvestmentAccountDetails";
			definition = "Account information of the individual order instruction for which the status is given.";
			previousVersion_lazy = () -> FundOrderData1.mmInvestmentAccountDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.InvestmentAccount58.mmObject();
		}
	};
	@XmlElement(name = "FinInstrmDtls")
	protected FinancialInstrument57 financialInstrumentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.FinancialInstrument57
	 * FinancialInstrument57}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundTransaction#mmInvestmentFundClass
	 * InvestmentFundTransaction.mmInvestmentFundClass}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
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
	 * "Financial instrument information of the individual order instruction for which the status is given."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmFinancialInstrumentDetails
	 * FundOrderData1.mmFinancialInstrumentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmFinancialInstrumentDetails = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> InvestmentFundTransaction.mmInvestmentFundClass;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
			isDerived = false;
			xmlTag = "FinInstrmDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "FinancialInstrumentDetails";
			definition = "Financial instrument information of the individual order instruction for which the status is given.";
			previousVersion_lazy = () -> FundOrderData1.mmFinancialInstrumentDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrument57.mmObject();
		}
	};
	@XmlElement(name = "UnitsNb")
	protected DecimalNumber unitsNumber;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvestmentFundOrder#mmUnitsNumber
	 * InvestmentFundOrder.mmUnitsNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
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
	 * definition} = "Number of investment fund units subscribed or redeemed."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmUnitsNumber
	 * FundOrderData1.mmUnitsNumber}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitsNumber = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmUnitsNumber;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
			isDerived = false;
			xmlTag = "UnitsNb";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitsNumber";
			definition = "Number of investment fund units subscribed or redeemed.";
			previousVersion_lazy = () -> FundOrderData1.mmUnitsNumber;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};
	@XmlElement(name = "NetAmt")
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
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
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
	 * "When the status message is used for a subscription, this is the amount of money to be invested in the fund. \r\nNet Amount = Quantity * Price.\r\nWhen the status message is used for a redemption, this is the amount of money to be received following redemption of fund units. \r\nNet Amount = (Quantity * Price) - (Fees + Taxes)."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmNetAmount
	 * FundOrderData1.mmNetAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "When the status message is used for a subscription, this is the amount of money to be invested in the fund. \r\nNet Amount = Quantity * Price.\r\nWhen the status message is used for a redemption, this is the amount of money to be received following redemption of fund units. \r\nNet Amount = (Quantity * Price) - (Fees + Taxes).";
			previousVersion_lazy = () -> FundOrderData1.mmNetAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
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
	 * "When the status message is used for a subscription, this is the amount of money to be paid by the investor when subscribing to fund units. \r\nGross amount = (Quantity * Price) + (Fees + Taxes). \r\nWhen the status message is used for a redemption, this is the amount of money to be redeemed from the fund. \r\nGross Amount = Quantity * Price."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmGrossAmount
	 * FundOrderData1.mmGrossAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrossAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> InvestmentFundOrder.mmGrossAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "When the status message is used for a subscription, this is the amount of money to be paid by the investor when subscribing to fund units. \r\nGross amount = (Quantity * Price) + (Fees + Taxes). \r\nWhen the status message is used for a redemption, this is the amount of money to be redeemed from the fund. \r\nGross Amount = Quantity * Price.";
			previousVersion_lazy = () -> FundOrderData1.mmGrossAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveOrHistoricCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "HldgsRedRate")
	protected PercentageRate holdingsRedemptionRate;
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
	 * {@linkplain com.tools20022.repository.entity.RedemptionOrder#mmHoldingsRedemptionRate
	 * RedemptionOrder.mmHoldingsRedemptionRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "HldgsRedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "HoldingsRedemptionRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Portion of the investor's holdings, in a specific investment fund/fund class, that is redeemed."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmHoldingsRedemptionRate
	 * FundOrderData1.mmHoldingsRedemptionRate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmHoldingsRedemptionRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> RedemptionOrder.mmHoldingsRedemptionRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
			isDerived = false;
			xmlTag = "HldgsRedRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "HoldingsRedemptionRate";
			definition = "Portion of the investor's holdings, in a specific investment fund/fund class, that is redeemed.";
			previousVersion_lazy = () -> FundOrderData1.mmHoldingsRedemptionRate;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
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
	 * {@linkplain com.tools20022.repository.entity.Payment#mmInstructedAmount
	 * Payment.mmInstructedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
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
	 * "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmSettlementAmount
	 * FundOrderData1.mmSettlementAmount}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmSettlementAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Payment.mmInstructedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
			isDerived = false;
			xmlTag = "SttlmAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SettlementAmount";
			definition = "Total amount of money paid /to be paid or received in exchange for the financial instrument in the individual order.";
			previousVersion_lazy = () -> FundOrderData1.mmSettlementAmount;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "UnitCcy")
	protected ActiveCurrencyCode unitCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmUnitCurrency
	 * CurrencyExchange.mmUnitCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "UnitCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "UnitCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency from which the quoted currency is converted in an exchange rate calculation.\r\n1 x &lt;UnitCcy&gt; = &lt;XchgRate&gt; x &lt;QtdCcy&gt;."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmUnitCurrency
	 * FundOrderData1.mmUnitCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmUnitCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmUnitCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
			isDerived = false;
			xmlTag = "UnitCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "UnitCurrency";
			definition = "Currency from which the quoted currency is converted in an exchange rate calculation.\r\n1 x <UnitCcy> = <XchgRate> x <QtdCcy>.";
			previousVersion_lazy = () -> FundOrderData1.mmUnitCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};
	@XmlElement(name = "QtdCcy")
	protected ActiveCurrencyCode quotedCurrency;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ActiveCurrencyCode
	 * ActiveCurrencyCode}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange#mmQuotedCurrency
	 * CurrencyExchange.mmQuotedCurrency}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData5 FundOrderData5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtdCcy"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotedCurrency"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Currency into which the unit currency is converted in an exchange rate calculation.\r\n1 x &lt;UnitCcy&gt; = &lt;XchgRate&gt; x &lt;QtdCcy&gt;."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.FundOrderData1#mmQuotedCurrency
	 * FundOrderData1.mmQuotedCurrency}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuotedCurrency = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CurrencyExchange.mmQuotedCurrency;
			componentContext_lazy = () -> com.tools20022.repository.msg.FundOrderData5.mmObject();
			isDerived = false;
			xmlTag = "QtdCcy";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotedCurrency";
			definition = "Currency into which the unit currency is converted in an exchange rate calculation.\r\n1 x <UnitCcy> = <XchgRate> x <QtdCcy>.";
			previousVersion_lazy = () -> FundOrderData1.mmQuotedCurrency;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyCode.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FundOrderData5.mmInvestmentAccountDetails, com.tools20022.repository.msg.FundOrderData5.mmFinancialInstrumentDetails,
						com.tools20022.repository.msg.FundOrderData5.mmUnitsNumber, com.tools20022.repository.msg.FundOrderData5.mmNetAmount, com.tools20022.repository.msg.FundOrderData5.mmGrossAmount,
						com.tools20022.repository.msg.FundOrderData5.mmHoldingsRedemptionRate, com.tools20022.repository.msg.FundOrderData5.mmSettlementAmount, com.tools20022.repository.msg.FundOrderData5.mmUnitCurrency,
						com.tools20022.repository.msg.FundOrderData5.mmQuotedCurrency);
				trace_lazy = () -> InvestmentFundOrder.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintOrderDataElementRule.forFundOrderData5);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FundOrderData5";
				definition = "Extract of trade data for an investment fund order.";
				previousVersion_lazy = () -> FundOrderData1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<InvestmentAccount58> getInvestmentAccountDetails() {
		return investmentAccountDetails == null ? Optional.empty() : Optional.of(investmentAccountDetails);
	}

	public FundOrderData5 setInvestmentAccountDetails(com.tools20022.repository.msg.InvestmentAccount58 investmentAccountDetails) {
		this.investmentAccountDetails = investmentAccountDetails;
		return this;
	}

	public Optional<FinancialInstrument57> getFinancialInstrumentDetails() {
		return financialInstrumentDetails == null ? Optional.empty() : Optional.of(financialInstrumentDetails);
	}

	public FundOrderData5 setFinancialInstrumentDetails(com.tools20022.repository.msg.FinancialInstrument57 financialInstrumentDetails) {
		this.financialInstrumentDetails = financialInstrumentDetails;
		return this;
	}

	public Optional<DecimalNumber> getUnitsNumber() {
		return unitsNumber == null ? Optional.empty() : Optional.of(unitsNumber);
	}

	public FundOrderData5 setUnitsNumber(DecimalNumber unitsNumber) {
		this.unitsNumber = unitsNumber;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getNetAmount() {
		return netAmount == null ? Optional.empty() : Optional.of(netAmount);
	}

	public FundOrderData5 setNetAmount(ActiveOrHistoricCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
		return this;
	}

	public Optional<ActiveOrHistoricCurrencyAndAmount> getGrossAmount() {
		return grossAmount == null ? Optional.empty() : Optional.of(grossAmount);
	}

	public FundOrderData5 setGrossAmount(ActiveOrHistoricCurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
		return this;
	}

	public Optional<PercentageRate> getHoldingsRedemptionRate() {
		return holdingsRedemptionRate == null ? Optional.empty() : Optional.of(holdingsRedemptionRate);
	}

	public FundOrderData5 setHoldingsRedemptionRate(PercentageRate holdingsRedemptionRate) {
		this.holdingsRedemptionRate = holdingsRedemptionRate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getSettlementAmount() {
		return settlementAmount == null ? Optional.empty() : Optional.of(settlementAmount);
	}

	public FundOrderData5 setSettlementAmount(ActiveCurrencyAndAmount settlementAmount) {
		this.settlementAmount = settlementAmount;
		return this;
	}

	public Optional<ActiveCurrencyCode> getUnitCurrency() {
		return unitCurrency == null ? Optional.empty() : Optional.of(unitCurrency);
	}

	public FundOrderData5 setUnitCurrency(ActiveCurrencyCode unitCurrency) {
		this.unitCurrency = unitCurrency;
		return this;
	}

	public Optional<ActiveCurrencyCode> getQuotedCurrency() {
		return quotedCurrency == null ? Optional.empty() : Optional.of(quotedCurrency);
	}

	public FundOrderData5 setQuotedCurrency(ActiveCurrencyCode quotedCurrency) {
		this.quotedCurrency = quotedCurrency;
		return this;
	}
}