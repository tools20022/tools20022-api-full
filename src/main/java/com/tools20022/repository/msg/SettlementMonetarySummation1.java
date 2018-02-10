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
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementMonetarySummation1", propOrder = {"lineTotalAmount", "allowanceTotalAmount", "totalDiscountAmount", "chargeTotalAmount", "totalPrepaidAmount", "taxTotalAmount", "taxBasisAmount", "roundingAmount",
		"grandTotalAmount", "informationAmount"})
public class SettlementMonetarySummation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "LineTtlAmt")
	protected List<CurrencyAndAmount> lineTotalAmount;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> LineItem.mmGrossAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "LineTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LineTotalAmount";
			definition = "Monetary value of the line amount total being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "AllwncTtlAmt")
	protected List<CurrencyAndAmount> allowanceTotalAmount;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Allowance.mmTotalAllowance;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "AllwncTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AllowanceTotalAmount";
			definition = "Monetary value of the allowance total being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlDscntAmt")
	protected List<CurrencyAndAmount> totalDiscountAmount;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Discount.mmDiscountAppliedAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TtlDscntAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalDiscountAmount";
			definition = "Monetary value of the total discount being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ChrgTtlAmt")
	protected List<CurrencyAndAmount> chargeTotalAmount;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Invoice.mmTotalCharge;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "ChrgTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ChargeTotalAmount";
			definition = "Monetary value of the charge amount total being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TtlPrepdAmt")
	protected List<CurrencyAndAmount> totalPrepaidAmount;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Invoice.mmTotalPrepaidAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TtlPrepdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalPrepaidAmount";
			definition = "Monetary value of the total prepaid amount being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TaxTtlAmt")
	protected List<CurrencyAndAmount> taxTotalAmount;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Invoice.mmTotalTaxAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TaxTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxTotalAmount";
			definition = "Monetary value of the total of all tax basis amounts being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "TaxBsisAmt")
	protected List<CurrencyAndAmount> taxBasisAmount;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Tax.mmTaxableBaseAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "TaxBsisAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxBasisAmount";
			definition = "Monetary value of the total of all tax basis amounts being reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "RndgAmt")
	protected List<CurrencyAndAmount> roundingAmount;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "RndgAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RoundingAmount";
			definition = "Monetary value of a rounding amount being applied and reported for this settlement.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "GrdTtlAmt")
	protected List<CurrencyAndAmount> grandTotalAmount;
	/**
	 * 
	 <p>
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
			businessElementTrace_lazy = () -> Invoice.mmTotalInvoiceAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "GrdTtlAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GrandTotalAmount";
			definition = "Monetary value of the grand total being reported for this settlement, to include addition and subtraction of individual summation amounts.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "InfAmt")
	protected List<CurrencyAndAmount> informationAmount;
	/**
	 * 
	 <p>
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
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementMonetarySummation1.mmObject();
			isDerived = false;
			xmlTag = "InfAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementMonetarySummation1";
				definition = "Specifies a collection of monetary totals for this settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CurrencyAndAmount> getLineTotalAmount() {
		return lineTotalAmount == null ? lineTotalAmount = new ArrayList<>() : lineTotalAmount;
	}

	public SettlementMonetarySummation1 setLineTotalAmount(List<CurrencyAndAmount> lineTotalAmount) {
		this.lineTotalAmount = Objects.requireNonNull(lineTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getAllowanceTotalAmount() {
		return allowanceTotalAmount == null ? allowanceTotalAmount = new ArrayList<>() : allowanceTotalAmount;
	}

	public SettlementMonetarySummation1 setAllowanceTotalAmount(List<CurrencyAndAmount> allowanceTotalAmount) {
		this.allowanceTotalAmount = Objects.requireNonNull(allowanceTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getTotalDiscountAmount() {
		return totalDiscountAmount == null ? totalDiscountAmount = new ArrayList<>() : totalDiscountAmount;
	}

	public SettlementMonetarySummation1 setTotalDiscountAmount(List<CurrencyAndAmount> totalDiscountAmount) {
		this.totalDiscountAmount = Objects.requireNonNull(totalDiscountAmount);
		return this;
	}

	public List<CurrencyAndAmount> getChargeTotalAmount() {
		return chargeTotalAmount == null ? chargeTotalAmount = new ArrayList<>() : chargeTotalAmount;
	}

	public SettlementMonetarySummation1 setChargeTotalAmount(List<CurrencyAndAmount> chargeTotalAmount) {
		this.chargeTotalAmount = Objects.requireNonNull(chargeTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getTotalPrepaidAmount() {
		return totalPrepaidAmount == null ? totalPrepaidAmount = new ArrayList<>() : totalPrepaidAmount;
	}

	public SettlementMonetarySummation1 setTotalPrepaidAmount(List<CurrencyAndAmount> totalPrepaidAmount) {
		this.totalPrepaidAmount = Objects.requireNonNull(totalPrepaidAmount);
		return this;
	}

	public List<CurrencyAndAmount> getTaxTotalAmount() {
		return taxTotalAmount == null ? taxTotalAmount = new ArrayList<>() : taxTotalAmount;
	}

	public SettlementMonetarySummation1 setTaxTotalAmount(List<CurrencyAndAmount> taxTotalAmount) {
		this.taxTotalAmount = Objects.requireNonNull(taxTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getTaxBasisAmount() {
		return taxBasisAmount == null ? taxBasisAmount = new ArrayList<>() : taxBasisAmount;
	}

	public SettlementMonetarySummation1 setTaxBasisAmount(List<CurrencyAndAmount> taxBasisAmount) {
		this.taxBasisAmount = Objects.requireNonNull(taxBasisAmount);
		return this;
	}

	public List<CurrencyAndAmount> getRoundingAmount() {
		return roundingAmount == null ? roundingAmount = new ArrayList<>() : roundingAmount;
	}

	public SettlementMonetarySummation1 setRoundingAmount(List<CurrencyAndAmount> roundingAmount) {
		this.roundingAmount = Objects.requireNonNull(roundingAmount);
		return this;
	}

	public List<CurrencyAndAmount> getGrandTotalAmount() {
		return grandTotalAmount == null ? grandTotalAmount = new ArrayList<>() : grandTotalAmount;
	}

	public SettlementMonetarySummation1 setGrandTotalAmount(List<CurrencyAndAmount> grandTotalAmount) {
		this.grandTotalAmount = Objects.requireNonNull(grandTotalAmount);
		return this;
	}

	public List<CurrencyAndAmount> getInformationAmount() {
		return informationAmount == null ? informationAmount = new ArrayList<>() : informationAmount;
	}

	public SettlementMonetarySummation1 setInformationAmount(List<CurrencyAndAmount> informationAmount) {
		this.informationAmount = Objects.requireNonNull(informationAmount);
		return this;
	}
}