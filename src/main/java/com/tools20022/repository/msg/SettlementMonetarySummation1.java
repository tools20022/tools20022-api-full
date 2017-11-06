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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.Invoice;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies a collection of monetary totals for this settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmLineTotalAmount
 * SettlementMonetarySummation1.mmLineTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmAllowanceTotalAmount
 * SettlementMonetarySummation1.mmAllowanceTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmTotalDiscountAmount
 * SettlementMonetarySummation1.mmTotalDiscountAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmChargeTotalAmount
 * SettlementMonetarySummation1.mmChargeTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmTotalPrepaidAmount
 * SettlementMonetarySummation1.mmTotalPrepaidAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmTaxTotalAmount
 * SettlementMonetarySummation1.mmTaxTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmTaxBasisAmount
 * SettlementMonetarySummation1.mmTaxBasisAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmRoundingAmount
 * SettlementMonetarySummation1.mmRoundingAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmGrandTotalAmount
 * SettlementMonetarySummation1.mmGrandTotalAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1#mmInformationAmount
 * SettlementMonetarySummation1.mmInformationAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Invoice Invoice}</li>
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
 * "SettlementMonetarySummation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies a collection of monetary totals for this settlement."</li>
 * </ul>
 */
public class SettlementMonetarySummation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<CurrencyAndAmount> lineTotalAmount;
	/**
	 * Monetary value of the line amount total being reported for this
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.LineItem#mmGrossAmount
	 * LineItem.mmGrossAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LineTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LineTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the line amount total being reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmLineTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.LineItem.mmGrossAmount;
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "LineTtlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineTotalAmount";
			definition = "Monetary value of the line amount total being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> allowanceTotalAmount;
	/**
	 * Monetary value of the allowance total being reported for this settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Allowance#mmTotalAllowance
	 * Allowance.mmTotalAllowance}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AllwncTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AllowanceTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the allowance total being reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAllowanceTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Allowance.mmTotalAllowance;
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "AllwncTtlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowanceTotalAmount";
			definition = "Monetary value of the allowance total being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> totalDiscountAmount;
	/**
	 * Monetary value of the total discount being reported for this settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Discount#mmDiscountAppliedAmount
	 * Discount.mmDiscountAppliedAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlDscntAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalDiscountAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the total discount being reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalDiscountAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Discount.mmDiscountAppliedAmount;
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TtlDscntAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDiscountAmount";
			definition = "Monetary value of the total discount being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> chargeTotalAmount;
	/**
	 * Monetary value of the charge amount total being reported for this
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalCharge
	 * Invoice.mmTotalCharge}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ChrgTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ChargeTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the charge amount total being reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmChargeTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.mmTotalCharge;
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "ChrgTtlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeTotalAmount";
			definition = "Monetary value of the charge amount total being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> totalPrepaidAmount;
	/**
	 * Monetary value of the total prepaid amount being reported for this
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalPrepaidAmount
	 * Invoice.mmTotalPrepaidAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlPrepdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalPrepaidAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the total prepaid amount being reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTotalPrepaidAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.mmTotalPrepaidAmount;
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TtlPrepdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPrepaidAmount";
			definition = "Monetary value of the total prepaid amount being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> taxTotalAmount;
	/**
	 * Monetary value of the total of all tax basis amounts being reported for
	 * this settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalTaxAmount
	 * Invoice.mmTotalTaxAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the total of all tax basis amounts being reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.mmTotalTaxAmount;
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TaxTtlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxTotalAmount";
			definition = "Monetary value of the total of all tax basis amounts being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> taxBasisAmount;
	/**
	 * Monetary value of the total of all tax basis amounts being reported for
	 * this settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxableBaseAmount
	 * Tax.mmTaxableBaseAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxBsisAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxBasisAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the total of all tax basis amounts being reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTaxBasisAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxableBaseAmount;
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TaxBsisAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxBasisAmount";
			definition = "Monetary value of the total of all tax basis amounts being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> roundingAmount;
	/**
	 * Monetary value of a rounding amount being applied and reported for this
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RndgAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RoundingAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of a rounding amount being applied and reported for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRoundingAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "RndgAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Monetary value of a rounding amount being applied and reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> grandTotalAmount;
	/**
	 * Monetary value of the grand total being reported for this settlement, to
	 * include addition and subtraction of individual summation amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Invoice#mmTotalInvoiceAmount
	 * Invoice.mmTotalInvoiceAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GrdTtlAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GrandTotalAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of the grand total being reported for this settlement, to include addition and subtraction of individual summation amounts."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmGrandTotalAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "GrdTtlAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrandTotalAmount";
			definition = "Monetary value of the grand total being reported for this settlement, to include addition and subtraction of individual summation amounts.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> informationAmount;
	/**
	 * Monetary value of an amount being reported as information for this
	 * settlement.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.CurrencyAndAmount
	 * CurrencyAndAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementMonetarySummation1
	 * SettlementMonetarySummation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InfAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InformationAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value of an amount being reported as information for this settlement."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmInformationAmount = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "InfAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InformationAmount";
			definition = "Monetary value of an amount being reported as information for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementMonetarySummation1.mmLineTotalAmount, com.tools20022.repository.msg.SettlementMonetarySummation1.mmAllowanceTotalAmount,
						com.tools20022.repository.msg.SettlementMonetarySummation1.mmTotalDiscountAmount, com.tools20022.repository.msg.SettlementMonetarySummation1.mmChargeTotalAmount,
						com.tools20022.repository.msg.SettlementMonetarySummation1.mmTotalPrepaidAmount, com.tools20022.repository.msg.SettlementMonetarySummation1.mmTaxTotalAmount,
						com.tools20022.repository.msg.SettlementMonetarySummation1.mmTaxBasisAmount, com.tools20022.repository.msg.SettlementMonetarySummation1.mmRoundingAmount,
						com.tools20022.repository.msg.SettlementMonetarySummation1.mmGrandTotalAmount, com.tools20022.repository.msg.SettlementMonetarySummation1.mmInformationAmount);
				trace_lazy = () -> Invoice.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementMonetarySummation1";
				definition = "Specifies a collection of monetary totals for this settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CurrencyAndAmount> getLineTotalAmount() {
		return lineTotalAmount;
	}

	public void setLineTotalAmount(List<CurrencyAndAmount> lineTotalAmount) {
		this.lineTotalAmount = lineTotalAmount;
	}

	public List<CurrencyAndAmount> getAllowanceTotalAmount() {
		return allowanceTotalAmount;
	}

	public void setAllowanceTotalAmount(List<CurrencyAndAmount> allowanceTotalAmount) {
		this.allowanceTotalAmount = allowanceTotalAmount;
	}

	public List<CurrencyAndAmount> getTotalDiscountAmount() {
		return totalDiscountAmount;
	}

	public void setTotalDiscountAmount(List<CurrencyAndAmount> totalDiscountAmount) {
		this.totalDiscountAmount = totalDiscountAmount;
	}

	public List<CurrencyAndAmount> getChargeTotalAmount() {
		return chargeTotalAmount;
	}

	public void setChargeTotalAmount(List<CurrencyAndAmount> chargeTotalAmount) {
		this.chargeTotalAmount = chargeTotalAmount;
	}

	public List<CurrencyAndAmount> getTotalPrepaidAmount() {
		return totalPrepaidAmount;
	}

	public void setTotalPrepaidAmount(List<CurrencyAndAmount> totalPrepaidAmount) {
		this.totalPrepaidAmount = totalPrepaidAmount;
	}

	public List<CurrencyAndAmount> getTaxTotalAmount() {
		return taxTotalAmount;
	}

	public void setTaxTotalAmount(List<CurrencyAndAmount> taxTotalAmount) {
		this.taxTotalAmount = taxTotalAmount;
	}

	public List<CurrencyAndAmount> getTaxBasisAmount() {
		return taxBasisAmount;
	}

	public void setTaxBasisAmount(List<CurrencyAndAmount> taxBasisAmount) {
		this.taxBasisAmount = taxBasisAmount;
	}

	public List<CurrencyAndAmount> getRoundingAmount() {
		return roundingAmount;
	}

	public void setRoundingAmount(List<CurrencyAndAmount> roundingAmount) {
		this.roundingAmount = roundingAmount;
	}

	public List<CurrencyAndAmount> getGrandTotalAmount() {
		return grandTotalAmount;
	}

	public void setGrandTotalAmount(List<CurrencyAndAmount> grandTotalAmount) {
		this.grandTotalAmount = grandTotalAmount;
	}

	public List<CurrencyAndAmount> getInformationAmount() {
		return informationAmount;
	}

	public void setInformationAmount(List<CurrencyAndAmount> informationAmount) {
		this.informationAmount = informationAmount;
	}
}