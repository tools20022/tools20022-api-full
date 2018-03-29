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
import com.tools20022.repository.choice.UnitOrFaceAmount1Choice;
import com.tools20022.repository.datatype.ActiveCurrencyAndAmount;
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.ISODate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ForeignExchangeTerms9;
import com.tools20022.repository.msg.PriceValue1;
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
 * Provides information about the tax voucher.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#TaxCreditOrTaxDeductionRule
 * TaxVoucher1.TaxCreditOrTaxDeductionRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxVoucherRate
 * TaxVoucher1.mmTaxVoucherRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxCredit
 * TaxVoucher1.mmTaxCredit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxDeduction
 * TaxVoucher1.mmTaxDeduction}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmGrossAmount
 * TaxVoucher1.mmGrossAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmNetAmount
 * TaxVoucher1.mmNetAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmRecordDateHolding
 * TaxVoucher1.mmRecordDateHolding}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxCreditRate
 * TaxVoucher1.mmTaxCreditRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmWithholdingTaxAmount
 * TaxVoucher1.mmWithholdingTaxAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmWithholdingTaxRate
 * TaxVoucher1.mmWithholdingTaxRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmScripDividendReinvestmentPricePerShare
 * TaxVoucher1.mmScripDividendReinvestmentPricePerShare}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmCashAmountBroughtForward
 * TaxVoucher1.mmCashAmountBroughtForward}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmAllotedSharesCost
 * TaxVoucher1.mmAllotedSharesCost}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmCashAmountCarriedForward
 * TaxVoucher1.mmCashAmountCarriedForward}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmNotionalTax
 * TaxVoucher1.mmNotionalTax}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmNotionalDividendPayable
 * TaxVoucher1.mmNotionalDividendPayable}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmBargainDate
 * TaxVoucher1.mmBargainDate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmBargainSettlementDate
 * TaxVoucher1.mmBargainSettlementDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmStampDutyAmount
 * TaxVoucher1.mmStampDutyAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmChargeAmount
 * TaxVoucher1.mmChargeAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmCommissionAmount
 * TaxVoucher1.mmCommissionAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmForeignExchangeDetails
 * TaxVoucher1.mmForeignExchangeDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TaxVoucher TaxVoucher}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TaxVoucher1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides information about the tax voucher."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TaxVoucher1", propOrder = {"taxVoucherRate", "taxCredit", "taxDeduction", "grossAmount", "netAmount", "recordDateHolding", "taxCreditRate", "withholdingTaxAmount", "withholdingTaxRate",
		"scripDividendReinvestmentPricePerShare", "cashAmountBroughtForward", "allotedSharesCost", "cashAmountCarriedForward", "notionalTax", "notionalDividendPayable", "bargainDate", "bargainSettlementDate", "stampDutyAmount",
		"chargeAmount", "commissionAmount", "foreignExchangeDetails"})
public class TaxVoucher1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TaxVchrRate", required = true)
	protected BaseOneRate taxVoucherRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmTaxVoucherRate
	 * TaxVoucher.mmTaxVoucherRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxVchrRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxVoucherRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Distribution rate per share."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, BaseOneRate> mmTaxVoucherRate = new MMMessageAttribute<TaxVoucher1, BaseOneRate>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmTaxVoucherRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "TaxVchrRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxVoucherRate";
			definition = "Distribution rate per share.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(TaxVoucher1 obj) {
			return obj.getTaxVoucherRate();
		}

		@Override
		public void setValue(TaxVoucher1 obj, BaseOneRate value) {
			obj.setTaxVoucherRate(value);
		}
	};
	@XmlElement(name = "TaxCdt", required = true)
	protected ActiveCurrencyAndAmount taxCredit;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCdt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCredit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of tax that have been previously paid."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, ActiveCurrencyAndAmount> mmTaxCredit = new MMMessageAttribute<TaxVoucher1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "TaxCdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCredit";
			definition = "Amount of tax that have been previously paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(TaxVoucher1 obj) {
			return obj.getTaxCredit();
		}

		@Override
		public void setValue(TaxVoucher1 obj, ActiveCurrencyAndAmount value) {
			obj.setTaxCredit(value);
		}
	};
	@XmlElement(name = "TaxDdctn", required = true)
	protected ActiveCurrencyAndAmount taxDeduction;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxDdctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxDeduction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of tax that have been previously deducted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, ActiveCurrencyAndAmount> mmTaxDeduction = new MMMessageAttribute<TaxVoucher1, ActiveCurrencyAndAmount>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "TaxDdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeduction";
			definition = "Amount of tax that have been previously deducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(TaxVoucher1 obj) {
			return obj.getTaxDeduction();
		}

		@Override
		public void setValue(TaxVoucher1 obj, ActiveCurrencyAndAmount value) {
			obj.setTaxDeduction(value);
		}
	};
	@XmlElement(name = "GrssAmt", required = true)
	protected ActiveCurrencyAndAmount grossAmount;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmGrossAmount
	 * CorporateActionDistribution.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
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
	 * "Cash amount before any deductions and allowances have been made."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, ActiveCurrencyAndAmount> mmGrossAmount = new MMMessageAttribute<TaxVoucher1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmGrossAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Cash amount before any deductions and allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(TaxVoucher1 obj) {
			return obj.getGrossAmount();
		}

		@Override
		public void setValue(TaxVoucher1 obj, ActiveCurrencyAndAmount value) {
			obj.setGrossAmount(value);
		}
	};
	@XmlElement(name = "NetAmt", required = true)
	protected ActiveCurrencyAndAmount netAmount;
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
	 * {@linkplain com.tools20022.repository.entity.CorporateActionDistribution#mmNetAmount
	 * CorporateActionDistribution.mmNetAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
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
	 * "Cash amount after any deductions and allowances have been made."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, ActiveCurrencyAndAmount> mmNetAmount = new MMMessageAttribute<TaxVoucher1, ActiveCurrencyAndAmount>() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmNetAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Cash amount after any deductions and allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public ActiveCurrencyAndAmount getValue(TaxVoucher1 obj) {
			return obj.getNetAmount();
		}

		@Override
		public void setValue(TaxVoucher1 obj, ActiveCurrencyAndAmount value) {
			obj.setNetAmount(value);
		}
	};
	@XmlElement(name = "RcrdDtHldg", required = true)
	protected UnitOrFaceAmount1Choice recordDateHolding;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.UnitOrFaceAmount1Choice
	 * UnitOrFaceAmount1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmRecordDateHolding
	 * TaxVoucher.mmRecordDateHolding}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcrdDtHldg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RecordDateHolding"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Securities holding on record date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, UnitOrFaceAmount1Choice> mmRecordDateHolding = new MMMessageAttribute<TaxVoucher1, UnitOrFaceAmount1Choice>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRecordDateHolding;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "RcrdDtHldg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDateHolding";
			definition = "Securities holding on record date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}

		@Override
		public UnitOrFaceAmount1Choice getValue(TaxVoucher1 obj) {
			return obj.getRecordDateHolding();
		}

		@Override
		public void setValue(TaxVoucher1 obj, UnitOrFaceAmount1Choice value) {
			obj.setRecordDateHolding(value);
		}
	};
	@XmlElement(name = "TaxCdtRate")
	protected PercentageRate taxCreditRate;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCdtRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Applicable tax rate on the tax credit amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<PercentageRate>> mmTaxCreditRate = new MMMessageAttribute<TaxVoucher1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate";
			definition = "Applicable tax rate on the tax credit amount.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TaxVoucher1 obj) {
			return obj.getTaxCreditRate();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<PercentageRate> value) {
			obj.setTaxCreditRate(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgTaxAmt")
	protected ActiveCurrencyAndAmount withholdingTaxAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cash amount that will be withheld by a tax authority."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>> mmWithholdingTaxAmount = new MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAmount";
			definition = "Cash amount that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TaxVoucher1 obj) {
			return obj.getWithholdingTaxAmount();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setWithholdingTaxAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "WhldgTaxRate")
	protected PercentageRate withholdingTaxRate;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmRate Tax.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WhldgTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WithholdingTaxRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate of a cash distribution that wil be withheld by a tax authority."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<PercentageRate>> mmWithholdingTaxRate = new MMMessageAttribute<TaxVoucher1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Rate of a cash distribution that wil be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(TaxVoucher1 obj) {
			return obj.getWithholdingTaxRate();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<PercentageRate> value) {
			obj.setWithholdingTaxRate(value.orElse(null));
		}
	};
	@XmlElement(name = "ScripDvddRinvstmtPricPerShr")
	protected PriceValue1 scripDividendReinvestmentPricePerShare;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue1
	 * PriceValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmScripDividendReinvestmentPricePerShare
	 * TaxVoucher.mmScripDividendReinvestmentPricePerShare}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ScripDvddRinvstmtPricPerShr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ScripDividendReinvestmentPricePerShare"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Cost per share of new shares allotted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<PriceValue1>> mmScripDividendReinvestmentPricePerShare = new MMMessageAttribute<TaxVoucher1, Optional<PriceValue1>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmScripDividendReinvestmentPricePerShare;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "ScripDvddRinvstmtPricPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividendReinvestmentPricePerShare";
			definition = "Cost per share of new shares allotted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public Optional<PriceValue1> getValue(TaxVoucher1 obj) {
			return obj.getScripDividendReinvestmentPricePerShare();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<PriceValue1> value) {
			obj.setScripDividendReinvestmentPricePerShare(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAmtBrghtFwd")
	protected ActiveCurrencyAndAmount cashAmountBroughtForward;
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountBroughtForward
	 * TaxVoucher.mmCashAmountBroughtForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmtBrghtFwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountBroughtForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount retained from previous dividend or interest payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>> mmCashAmountBroughtForward = new MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountBroughtForward;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "CshAmtBrghtFwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Cash amount retained from previous dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TaxVoucher1 obj) {
			return obj.getCashAmountBroughtForward();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCashAmountBroughtForward(value.orElse(null));
		}
	};
	@XmlElement(name = "AlltdShrsCost")
	protected PriceValue1 allotedSharesCost;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PriceValue1
	 * PriceValue1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmAllotedSharesCost
	 * TaxVoucher.mmAllotedSharesCost}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AlltdShrsCost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllotedSharesCost"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Total cash amount required to purchase shares allotted."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<PriceValue1>> mmAllotedSharesCost = new MMMessageAttribute<TaxVoucher1, Optional<PriceValue1>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmAllotedSharesCost;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "AlltdShrsCost";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllotedSharesCost";
			definition = "Total cash amount required to purchase shares allotted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PriceValue1.mmObject();
		}

		@Override
		public Optional<PriceValue1> getValue(TaxVoucher1 obj) {
			return obj.getAllotedSharesCost();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<PriceValue1> value) {
			obj.setAllotedSharesCost(value.orElse(null));
		}
	};
	@XmlElement(name = "CshAmtCrrdFwd")
	protected ActiveCurrencyAndAmount cashAmountCarriedForward;
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmCashAmountCarriedForward
	 * TaxVoucher.mmCashAmountCarriedForward}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CshAmtCrrdFwd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CashAmountCarriedForward"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Cash amount carried forward to next dividend or interest payment."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>> mmCashAmountCarriedForward = new MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountCarriedForward;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "CshAmtCrrdFwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Cash amount carried forward to next dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TaxVoucher1 obj) {
			return obj.getCashAmountCarriedForward();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCashAmountCarriedForward(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlTax")
	protected ActiveCurrencyAndAmount notionalTax;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalTax"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Where new securities are issued in lieu of a cash dividend, the notional tax is the tax on the amount of cash that would have been paid. For scrips only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>> mmNotionalTax = new MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "NtnlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalTax";
			definition = "Where new securities are issued in lieu of a cash dividend, the notional tax is the tax on the amount of cash that would have been paid. For scrips only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TaxVoucher1 obj) {
			return obj.getNotionalTax();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNotionalTax(value.orElse(null));
		}
	};
	@XmlElement(name = "NtnlDvddPybl")
	protected ActiveCurrencyAndAmount notionalDividendPayable;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Dividend Dividend}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtnlDvddPybl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotionalDividendPayable"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares. For scrip only."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>> mmNotionalDividendPayable = new MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessComponentTrace_lazy = () -> Dividend.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "NtnlDvddPybl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalDividendPayable";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares. For scrip only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TaxVoucher1 obj) {
			return obj.getNotionalDividendPayable();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setNotionalDividendPayable(value.orElse(null));
		}
	};
	@XmlElement(name = "BrgnDt")
	protected ISODate bargainDate;
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmBargainDate
	 * TaxVoucher.mmBargainDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrgnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BargainDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date on which DRIP purchase completed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ISODate>> mmBargainDate = new MMMessageAttribute<TaxVoucher1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmBargainDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "BrgnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BargainDate";
			definition = "Date on which DRIP purchase completed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TaxVoucher1 obj) {
			return obj.getBargainDate();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ISODate> value) {
			obj.setBargainDate(value.orElse(null));
		}
	};
	@XmlElement(name = "BrgnSttlmDt")
	protected ISODate bargainSettlementDate;
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
	 * {@linkplain com.tools20022.repository.entity.TaxVoucher#mmBargainSettlementDate
	 * TaxVoucher.mmBargainSettlementDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BrgnSttlmDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BargainSettlementDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Settlement date of the DRIP purchase transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ISODate>> mmBargainSettlementDate = new MMMessageAttribute<TaxVoucher1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmBargainSettlementDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "BrgnSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BargainSettlementDate";
			definition = "Settlement date of the DRIP purchase transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(TaxVoucher1 obj) {
			return obj.getBargainSettlementDate();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ISODate> value) {
			obj.setBargainSettlementDate(value.orElse(null));
		}
	};
	@XmlElement(name = "StmpDtyAmt")
	protected ActiveCurrencyAndAmount stampDutyAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "StmpDtyAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "StampDutyAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of stamp duty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>> mmStampDutyAmount = new MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyAmount";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TaxVoucher1 obj) {
			return obj.getStampDutyAmount();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setStampDutyAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ChrgAmt")
	protected ActiveCurrencyAndAmount chargeAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount of charges/fees charged to the client."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>> mmChargeAmount = new MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "ChrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeAmount";
			definition = "Amount of charges/fees charged to the client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TaxVoucher1 obj) {
			return obj.getChargeAmount();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setChargeAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "ComssnAmt")
	protected ActiveCurrencyAndAmount commissionAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Adjustment#mmAmount
	 * Adjustment.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ComssnAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CommissionAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Amount due to the paying agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>> mmCommissionAmount = new MMMessageAttribute<TaxVoucher1, Optional<ActiveCurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "ComssnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionAmount";
			definition = "Amount due to the paying agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}

		@Override
		public Optional<ActiveCurrencyAndAmount> getValue(TaxVoucher1 obj) {
			return obj.getCommissionAmount();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ActiveCurrencyAndAmount> value) {
			obj.setCommissionAmount(value.orElse(null));
		}
	};
	@XmlElement(name = "FXDtls")
	protected ForeignExchangeTerms9 foreignExchangeDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ForeignExchangeTerms9
	 * ForeignExchangeTerms9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CurrencyExchange
	 * CurrencyExchange}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
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
	 * "Provides information about the foreign exchange transaction."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<TaxVoucher1, Optional<ForeignExchangeTerms9>> mmForeignExchangeDetails = new MMMessageAssociationEnd<TaxVoucher1, Optional<ForeignExchangeTerms9>>() {
		{
			businessComponentTrace_lazy = () -> CurrencyExchange.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Provides information about the foreign exchange transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ForeignExchangeTerms9.mmObject();
		}

		@Override
		public Optional<ForeignExchangeTerms9> getValue(TaxVoucher1 obj) {
			return obj.getForeignExchangeDetails();
		}

		@Override
		public void setValue(TaxVoucher1 obj, Optional<ForeignExchangeTerms9> value) {
			obj.setForeignExchangeDetails(value.orElse(null));
		}
	};
	/**
	 * Either TaxCredit orTaxDeduction must be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.TaxVoucher1 TaxVoucher1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxCredit
	 * TaxVoucher1.mmTaxCredit}</li>
	 * <li>{@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxDeduction
	 * TaxVoucher1.mmTaxDeduction}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCreditOrTaxDeductionRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Either TaxCredit orTaxDeduction must be present."</li>
	 * </ul>
	 */
	public static final MMXor TaxCreditOrTaxDeductionRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditOrTaxDeductionRule";
			definition = "Either TaxCredit orTaxDeduction must be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.TaxVoucher1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.mmTaxCredit, com.tools20022.repository.msg.TaxVoucher1.mmTaxDeduction);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.mmTaxVoucherRate, com.tools20022.repository.msg.TaxVoucher1.mmTaxCredit, com.tools20022.repository.msg.TaxVoucher1.mmTaxDeduction,
						com.tools20022.repository.msg.TaxVoucher1.mmGrossAmount, com.tools20022.repository.msg.TaxVoucher1.mmNetAmount, com.tools20022.repository.msg.TaxVoucher1.mmRecordDateHolding,
						com.tools20022.repository.msg.TaxVoucher1.mmTaxCreditRate, com.tools20022.repository.msg.TaxVoucher1.mmWithholdingTaxAmount, com.tools20022.repository.msg.TaxVoucher1.mmWithholdingTaxRate,
						com.tools20022.repository.msg.TaxVoucher1.mmScripDividendReinvestmentPricePerShare, com.tools20022.repository.msg.TaxVoucher1.mmCashAmountBroughtForward,
						com.tools20022.repository.msg.TaxVoucher1.mmAllotedSharesCost, com.tools20022.repository.msg.TaxVoucher1.mmCashAmountCarriedForward, com.tools20022.repository.msg.TaxVoucher1.mmNotionalTax,
						com.tools20022.repository.msg.TaxVoucher1.mmNotionalDividendPayable, com.tools20022.repository.msg.TaxVoucher1.mmBargainDate, com.tools20022.repository.msg.TaxVoucher1.mmBargainSettlementDate,
						com.tools20022.repository.msg.TaxVoucher1.mmStampDutyAmount, com.tools20022.repository.msg.TaxVoucher1.mmChargeAmount, com.tools20022.repository.msg.TaxVoucher1.mmCommissionAmount,
						com.tools20022.repository.msg.TaxVoucher1.mmForeignExchangeDetails);
				trace_lazy = () -> TaxVoucher.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "TaxVoucher1";
				definition = "Provides information about the tax voucher.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.TaxVoucher1.TaxCreditOrTaxDeductionRule);
			}
		});
		return mmObject_lazy.get();
	}

	public BaseOneRate getTaxVoucherRate() {
		return taxVoucherRate;
	}

	public TaxVoucher1 setTaxVoucherRate(BaseOneRate taxVoucherRate) {
		this.taxVoucherRate = Objects.requireNonNull(taxVoucherRate);
		return this;
	}

	public ActiveCurrencyAndAmount getTaxCredit() {
		return taxCredit;
	}

	public TaxVoucher1 setTaxCredit(ActiveCurrencyAndAmount taxCredit) {
		this.taxCredit = Objects.requireNonNull(taxCredit);
		return this;
	}

	public ActiveCurrencyAndAmount getTaxDeduction() {
		return taxDeduction;
	}

	public TaxVoucher1 setTaxDeduction(ActiveCurrencyAndAmount taxDeduction) {
		this.taxDeduction = Objects.requireNonNull(taxDeduction);
		return this;
	}

	public ActiveCurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public TaxVoucher1 setGrossAmount(ActiveCurrencyAndAmount grossAmount) {
		this.grossAmount = Objects.requireNonNull(grossAmount);
		return this;
	}

	public ActiveCurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public TaxVoucher1 setNetAmount(ActiveCurrencyAndAmount netAmount) {
		this.netAmount = Objects.requireNonNull(netAmount);
		return this;
	}

	public UnitOrFaceAmount1Choice getRecordDateHolding() {
		return recordDateHolding;
	}

	public TaxVoucher1 setRecordDateHolding(UnitOrFaceAmount1Choice recordDateHolding) {
		this.recordDateHolding = Objects.requireNonNull(recordDateHolding);
		return this;
	}

	public Optional<PercentageRate> getTaxCreditRate() {
		return taxCreditRate == null ? Optional.empty() : Optional.of(taxCreditRate);
	}

	public TaxVoucher1 setTaxCreditRate(PercentageRate taxCreditRate) {
		this.taxCreditRate = taxCreditRate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getWithholdingTaxAmount() {
		return withholdingTaxAmount == null ? Optional.empty() : Optional.of(withholdingTaxAmount);
	}

	public TaxVoucher1 setWithholdingTaxAmount(ActiveCurrencyAndAmount withholdingTaxAmount) {
		this.withholdingTaxAmount = withholdingTaxAmount;
		return this;
	}

	public Optional<PercentageRate> getWithholdingTaxRate() {
		return withholdingTaxRate == null ? Optional.empty() : Optional.of(withholdingTaxRate);
	}

	public TaxVoucher1 setWithholdingTaxRate(PercentageRate withholdingTaxRate) {
		this.withholdingTaxRate = withholdingTaxRate;
		return this;
	}

	public Optional<PriceValue1> getScripDividendReinvestmentPricePerShare() {
		return scripDividendReinvestmentPricePerShare == null ? Optional.empty() : Optional.of(scripDividendReinvestmentPricePerShare);
	}

	public TaxVoucher1 setScripDividendReinvestmentPricePerShare(PriceValue1 scripDividendReinvestmentPricePerShare) {
		this.scripDividendReinvestmentPricePerShare = scripDividendReinvestmentPricePerShare;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCashAmountBroughtForward() {
		return cashAmountBroughtForward == null ? Optional.empty() : Optional.of(cashAmountBroughtForward);
	}

	public TaxVoucher1 setCashAmountBroughtForward(ActiveCurrencyAndAmount cashAmountBroughtForward) {
		this.cashAmountBroughtForward = cashAmountBroughtForward;
		return this;
	}

	public Optional<PriceValue1> getAllotedSharesCost() {
		return allotedSharesCost == null ? Optional.empty() : Optional.of(allotedSharesCost);
	}

	public TaxVoucher1 setAllotedSharesCost(PriceValue1 allotedSharesCost) {
		this.allotedSharesCost = allotedSharesCost;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCashAmountCarriedForward() {
		return cashAmountCarriedForward == null ? Optional.empty() : Optional.of(cashAmountCarriedForward);
	}

	public TaxVoucher1 setCashAmountCarriedForward(ActiveCurrencyAndAmount cashAmountCarriedForward) {
		this.cashAmountCarriedForward = cashAmountCarriedForward;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNotionalTax() {
		return notionalTax == null ? Optional.empty() : Optional.of(notionalTax);
	}

	public TaxVoucher1 setNotionalTax(ActiveCurrencyAndAmount notionalTax) {
		this.notionalTax = notionalTax;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getNotionalDividendPayable() {
		return notionalDividendPayable == null ? Optional.empty() : Optional.of(notionalDividendPayable);
	}

	public TaxVoucher1 setNotionalDividendPayable(ActiveCurrencyAndAmount notionalDividendPayable) {
		this.notionalDividendPayable = notionalDividendPayable;
		return this;
	}

	public Optional<ISODate> getBargainDate() {
		return bargainDate == null ? Optional.empty() : Optional.of(bargainDate);
	}

	public TaxVoucher1 setBargainDate(ISODate bargainDate) {
		this.bargainDate = bargainDate;
		return this;
	}

	public Optional<ISODate> getBargainSettlementDate() {
		return bargainSettlementDate == null ? Optional.empty() : Optional.of(bargainSettlementDate);
	}

	public TaxVoucher1 setBargainSettlementDate(ISODate bargainSettlementDate) {
		this.bargainSettlementDate = bargainSettlementDate;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getStampDutyAmount() {
		return stampDutyAmount == null ? Optional.empty() : Optional.of(stampDutyAmount);
	}

	public TaxVoucher1 setStampDutyAmount(ActiveCurrencyAndAmount stampDutyAmount) {
		this.stampDutyAmount = stampDutyAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getChargeAmount() {
		return chargeAmount == null ? Optional.empty() : Optional.of(chargeAmount);
	}

	public TaxVoucher1 setChargeAmount(ActiveCurrencyAndAmount chargeAmount) {
		this.chargeAmount = chargeAmount;
		return this;
	}

	public Optional<ActiveCurrencyAndAmount> getCommissionAmount() {
		return commissionAmount == null ? Optional.empty() : Optional.of(commissionAmount);
	}

	public TaxVoucher1 setCommissionAmount(ActiveCurrencyAndAmount commissionAmount) {
		this.commissionAmount = commissionAmount;
		return this;
	}

	public Optional<ForeignExchangeTerms9> getForeignExchangeDetails() {
		return foreignExchangeDetails == null ? Optional.empty() : Optional.of(foreignExchangeDetails);
	}

	public TaxVoucher1 setForeignExchangeDetails(ForeignExchangeTerms9 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
		return this;
	}
}