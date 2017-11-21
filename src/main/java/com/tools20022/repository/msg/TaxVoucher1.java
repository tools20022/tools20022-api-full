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
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.msg.TaxVoucher1#mmTaxCreditOrTaxDeductionRule
 * TaxVoucher1.mmTaxCreditOrTaxDeductionRule}</li>
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
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
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "TaxVoucher1", propOrder = {"taxVoucherRate", "taxCredit", "taxDeduction", "grossAmount", "netAmount", "recordDateHolding", "taxCreditRate", "withholdingTaxAmount", "withholdingTaxRate",
		"scripDividendReinvestmentPricePerShare", "cashAmountBroughtForward", "allotedSharesCost", "cashAmountCarriedForward", "notionalTax", "notionalDividendPayable", "bargainDate", "bargainSettlementDate", "stampDutyAmount",
		"chargeAmount", "commissionAmount", "foreignExchangeDetails"})
public class TaxVoucher1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected BaseOneRate taxVoucherRate;
	/**
	 * Distribution rate per share.
	 * <p>
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
	public static final MMMessageAttribute mmTaxVoucherRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmTaxVoucherRate;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "TaxVchrRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxVoucherRate";
			definition = "Distribution rate per share.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount taxCredit;
	/**
	 * Amount of tax that have been previously paid.
	 * <p>
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
	public static final MMMessageAttribute mmTaxCredit = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "TaxCdt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCredit";
			definition = "Amount of tax that have been previously paid.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount taxDeduction;
	/**
	 * Amount of tax that have been previously deducted.
	 * <p>
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
	public static final MMMessageAttribute mmTaxDeduction = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "TaxDdctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxDeduction";
			definition = "Amount of tax that have been previously deducted.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount grossAmount;
	/**
	 * Cash amount before any deductions and allowances have been made.
	 * <p>
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
	public static final MMMessageAttribute mmGrossAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmGrossAmount;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "GrssAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrossAmount";
			definition = "Cash amount before any deductions and allowances have been made.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount netAmount;
	/**
	 * Cash amount after any deductions and allowances have been made
	 * <p>
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
	 * "Cash amount after any deductions and allowances have been made"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNetAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> CorporateActionDistribution.mmNetAmount;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "NetAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NetAmount";
			definition = "Cash amount after any deductions and allowances have been made";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected UnitOrFaceAmount1Choice recordDateHolding;
	/**
	 * Securities holding on record date.
	 * <p>
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
	public static final MMMessageAttribute mmRecordDateHolding = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmRecordDateHolding;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "RcrdDtHldg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RecordDateHolding";
			definition = "Securities holding on record date.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> UnitOrFaceAmount1Choice.mmObject();
		}
	};
	protected PercentageRate taxCreditRate;
	/**
	 * Applicable tax rate on the tax credit amount
	 * <p>
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
	 * definition} = "Applicable tax rate on the tax credit amount"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxCreditRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "TaxCdtRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditRate";
			definition = "Applicable tax rate on the tax credit amount";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount withholdingTaxAmount;
	/**
	 * Cash amount that will be withheld by a tax authority.
	 * <p>
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
	public static final MMMessageAttribute mmWithholdingTaxAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxAmount";
			definition = "Cash amount that will be withheld by a tax authority.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PercentageRate withholdingTaxRate;
	/**
	 * Rate of a cash distribution that wil be withheld by a tax authority
	 * <p>
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
	 * "Rate of a cash distribution that wil be withheld by a tax authority"</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmWithholdingTaxRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "WhldgTaxRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WithholdingTaxRate";
			definition = "Rate of a cash distribution that wil be withheld by a tax authority";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PriceValue1 scripDividendReinvestmentPricePerShare;
	/**
	 * Cost per share of new shares allotted.
	 * <p>
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
	public static final MMMessageAttribute mmScripDividendReinvestmentPricePerShare = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmScripDividendReinvestmentPricePerShare;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "ScripDvddRinvstmtPricPerShr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ScripDividendReinvestmentPricePerShare";
			definition = "Cost per share of new shares allotted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue1.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount cashAmountBroughtForward;
	/**
	 * Cash amount retained from previous dividend or interest payment.
	 * <p>
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
	public static final MMMessageAttribute mmCashAmountBroughtForward = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountBroughtForward;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "CshAmtBrghtFwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountBroughtForward";
			definition = "Cash amount retained from previous dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected PriceValue1 allotedSharesCost;
	/**
	 * Total cash amount required to purchase shares allotted.
	 * <p>
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
	public static final MMMessageAttribute mmAllotedSharesCost = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmAllotedSharesCost;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "AlltdShrsCost";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllotedSharesCost";
			definition = "Total cash amount required to purchase shares allotted.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PriceValue1.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount cashAmountCarriedForward;
	/**
	 * Cash amount carried forward to next dividend or interest payment.
	 * <p>
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
	public static final MMMessageAttribute mmCashAmountCarriedForward = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmCashAmountCarriedForward;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "CshAmtCrrdFwd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CashAmountCarriedForward";
			definition = "Cash amount carried forward to next dividend or interest payment.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount notionalTax;
	/**
	 * Where new securities are issued in lieu of a cash dividend, the notional
	 * tax is the tax on the amount of cash that would have been paid. For
	 * scrips only.
	 * <p>
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
	public static final MMMessageAttribute mmNotionalTax = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "NtnlTax";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalTax";
			definition = "Where new securities are issued in lieu of a cash dividend, the notional tax is the tax on the amount of cash that would have been paid. For scrips only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount notionalDividendPayable;
	/**
	 * Amount of cash that would have been payable if the dividend had been
	 * taken in the form of cash rather than shares. For scrip only.
	 * <p>
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
	public static final MMMessageAttribute mmNotionalDividendPayable = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> Dividend.mmObject();
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "NtnlDvddPybl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotionalDividendPayable";
			definition = "Amount of cash that would have been payable if the dividend had been taken in the form of cash rather than shares. For scrip only.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ISODate bargainDate;
	/**
	 * Date on which DRIP purchase completed.
	 * <p>
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
	public static final MMMessageAttribute mmBargainDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmBargainDate;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "BrgnDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BargainDate";
			definition = "Date on which DRIP purchase completed.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ISODate bargainSettlementDate;
	/**
	 * Settlement date of the DRIP purchase transaction.
	 * <p>
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
	public static final MMMessageAttribute mmBargainSettlementDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> TaxVoucher.mmBargainSettlementDate;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "BrgnSttlmDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BargainSettlementDate";
			definition = "Settlement date of the DRIP purchase transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount stampDutyAmount;
	/**
	 * Amount of stamp duty.
	 * <p>
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
	public static final MMMessageAttribute mmStampDutyAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "StmpDtyAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "StampDutyAmount";
			definition = "Amount of stamp duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount chargeAmount;
	/**
	 * Amount of charges/fees charged to the client.
	 * <p>
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
	public static final MMMessageAttribute mmChargeAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "ChrgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeAmount";
			definition = "Amount of charges/fees charged to the client.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ActiveCurrencyAndAmount commissionAmount;
	/**
	 * Amount due to the paying agent.
	 * <p>
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
	public static final MMMessageAttribute mmCommissionAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Adjustment.mmAmount;
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "ComssnAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CommissionAmount";
			definition = "Amount due to the paying agent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ActiveCurrencyAndAmount.mmObject();
		}
	};
	protected ForeignExchangeTerms9 foreignExchangeDetails;
	/**
	 * Provides information about the foreign exchange transaction.
	 * <p>
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
	public static final MMMessageAssociationEnd mmForeignExchangeDetails = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> CurrencyExchange.mmObject();
			componentContext_lazy = () -> TaxVoucher1.mmObject();
			isDerived = false;
			xmlTag = "FXDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForeignExchangeDetails";
			definition = "Provides information about the foreign exchange transaction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ForeignExchangeTerms9.mmObject();
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
	public static final MMXor mmTaxCreditOrTaxDeductionRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCreditOrTaxDeductionRule";
			definition = "Either TaxCredit orTaxDeduction must be present.";
			messageComponent_lazy = () -> TaxVoucher1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(TaxVoucher1.mmTaxCredit, TaxVoucher1.mmTaxDeduction);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(TaxVoucher1.mmTaxVoucherRate, TaxVoucher1.mmTaxCredit, TaxVoucher1.mmTaxDeduction, TaxVoucher1.mmGrossAmount, TaxVoucher1.mmNetAmount, TaxVoucher1.mmRecordDateHolding,
						TaxVoucher1.mmTaxCreditRate, TaxVoucher1.mmWithholdingTaxAmount, TaxVoucher1.mmWithholdingTaxRate, TaxVoucher1.mmScripDividendReinvestmentPricePerShare, TaxVoucher1.mmCashAmountBroughtForward,
						TaxVoucher1.mmAllotedSharesCost, TaxVoucher1.mmCashAmountCarriedForward, TaxVoucher1.mmNotionalTax, TaxVoucher1.mmNotionalDividendPayable, TaxVoucher1.mmBargainDate, TaxVoucher1.mmBargainSettlementDate,
						TaxVoucher1.mmStampDutyAmount, TaxVoucher1.mmChargeAmount, TaxVoucher1.mmCommissionAmount, TaxVoucher1.mmForeignExchangeDetails);
				trace_lazy = () -> TaxVoucher.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
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
				xors_lazy = () -> Arrays.asList(TaxVoucher1.mmTaxCreditOrTaxDeductionRule);
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "TaxVchrRate", required = true)
	public BaseOneRate getTaxVoucherRate() {
		return taxVoucherRate;
	}

	public void setTaxVoucherRate(BaseOneRate taxVoucherRate) {
		this.taxVoucherRate = taxVoucherRate;
	}

	@XmlElement(name = "TaxCdt", required = true)
	public ActiveCurrencyAndAmount getTaxCredit() {
		return taxCredit;
	}

	public void setTaxCredit(ActiveCurrencyAndAmount taxCredit) {
		this.taxCredit = taxCredit;
	}

	@XmlElement(name = "TaxDdctn", required = true)
	public ActiveCurrencyAndAmount getTaxDeduction() {
		return taxDeduction;
	}

	public void setTaxDeduction(ActiveCurrencyAndAmount taxDeduction) {
		this.taxDeduction = taxDeduction;
	}

	@XmlElement(name = "GrssAmt", required = true)
	public ActiveCurrencyAndAmount getGrossAmount() {
		return grossAmount;
	}

	public void setGrossAmount(ActiveCurrencyAndAmount grossAmount) {
		this.grossAmount = grossAmount;
	}

	@XmlElement(name = "NetAmt", required = true)
	public ActiveCurrencyAndAmount getNetAmount() {
		return netAmount;
	}

	public void setNetAmount(ActiveCurrencyAndAmount netAmount) {
		this.netAmount = netAmount;
	}

	@XmlElement(name = "RcrdDtHldg", required = true)
	public UnitOrFaceAmount1Choice getRecordDateHolding() {
		return recordDateHolding;
	}

	public void setRecordDateHolding(UnitOrFaceAmount1Choice recordDateHolding) {
		this.recordDateHolding = recordDateHolding;
	}

	@XmlElement(name = "TaxCdtRate")
	public PercentageRate getTaxCreditRate() {
		return taxCreditRate;
	}

	public void setTaxCreditRate(PercentageRate taxCreditRate) {
		this.taxCreditRate = taxCreditRate;
	}

	@XmlElement(name = "WhldgTaxAmt")
	public ActiveCurrencyAndAmount getWithholdingTaxAmount() {
		return withholdingTaxAmount;
	}

	public void setWithholdingTaxAmount(ActiveCurrencyAndAmount withholdingTaxAmount) {
		this.withholdingTaxAmount = withholdingTaxAmount;
	}

	@XmlElement(name = "WhldgTaxRate")
	public PercentageRate getWithholdingTaxRate() {
		return withholdingTaxRate;
	}

	public void setWithholdingTaxRate(PercentageRate withholdingTaxRate) {
		this.withholdingTaxRate = withholdingTaxRate;
	}

	@XmlElement(name = "ScripDvddRinvstmtPricPerShr")
	public PriceValue1 getScripDividendReinvestmentPricePerShare() {
		return scripDividendReinvestmentPricePerShare;
	}

	public void setScripDividendReinvestmentPricePerShare(com.tools20022.repository.msg.PriceValue1 scripDividendReinvestmentPricePerShare) {
		this.scripDividendReinvestmentPricePerShare = scripDividendReinvestmentPricePerShare;
	}

	@XmlElement(name = "CshAmtBrghtFwd")
	public ActiveCurrencyAndAmount getCashAmountBroughtForward() {
		return cashAmountBroughtForward;
	}

	public void setCashAmountBroughtForward(ActiveCurrencyAndAmount cashAmountBroughtForward) {
		this.cashAmountBroughtForward = cashAmountBroughtForward;
	}

	@XmlElement(name = "AlltdShrsCost")
	public PriceValue1 getAllotedSharesCost() {
		return allotedSharesCost;
	}

	public void setAllotedSharesCost(com.tools20022.repository.msg.PriceValue1 allotedSharesCost) {
		this.allotedSharesCost = allotedSharesCost;
	}

	@XmlElement(name = "CshAmtCrrdFwd")
	public ActiveCurrencyAndAmount getCashAmountCarriedForward() {
		return cashAmountCarriedForward;
	}

	public void setCashAmountCarriedForward(ActiveCurrencyAndAmount cashAmountCarriedForward) {
		this.cashAmountCarriedForward = cashAmountCarriedForward;
	}

	@XmlElement(name = "NtnlTax")
	public ActiveCurrencyAndAmount getNotionalTax() {
		return notionalTax;
	}

	public void setNotionalTax(ActiveCurrencyAndAmount notionalTax) {
		this.notionalTax = notionalTax;
	}

	@XmlElement(name = "NtnlDvddPybl")
	public ActiveCurrencyAndAmount getNotionalDividendPayable() {
		return notionalDividendPayable;
	}

	public void setNotionalDividendPayable(ActiveCurrencyAndAmount notionalDividendPayable) {
		this.notionalDividendPayable = notionalDividendPayable;
	}

	@XmlElement(name = "BrgnDt")
	public ISODate getBargainDate() {
		return bargainDate;
	}

	public void setBargainDate(ISODate bargainDate) {
		this.bargainDate = bargainDate;
	}

	@XmlElement(name = "BrgnSttlmDt")
	public ISODate getBargainSettlementDate() {
		return bargainSettlementDate;
	}

	public void setBargainSettlementDate(ISODate bargainSettlementDate) {
		this.bargainSettlementDate = bargainSettlementDate;
	}

	@XmlElement(name = "StmpDtyAmt")
	public ActiveCurrencyAndAmount getStampDutyAmount() {
		return stampDutyAmount;
	}

	public void setStampDutyAmount(ActiveCurrencyAndAmount stampDutyAmount) {
		this.stampDutyAmount = stampDutyAmount;
	}

	@XmlElement(name = "ChrgAmt")
	public ActiveCurrencyAndAmount getChargeAmount() {
		return chargeAmount;
	}

	public void setChargeAmount(ActiveCurrencyAndAmount chargeAmount) {
		this.chargeAmount = chargeAmount;
	}

	@XmlElement(name = "ComssnAmt")
	public ActiveCurrencyAndAmount getCommissionAmount() {
		return commissionAmount;
	}

	public void setCommissionAmount(ActiveCurrencyAndAmount commissionAmount) {
		this.commissionAmount = commissionAmount;
	}

	@XmlElement(name = "FXDtls")
	public ForeignExchangeTerms9 getForeignExchangeDetails() {
		return foreignExchangeDetails;
	}

	public void setForeignExchangeDetails(com.tools20022.repository.msg.ForeignExchangeTerms9 foreignExchangeDetails) {
		this.foreignExchangeDetails = foreignExchangeDetails;
	}
}