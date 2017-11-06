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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Tax;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the subtotal calculated tax applicable for this settlement.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmTypeCode
 * SettlementSubTotalCalculatedTax2.mmTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmCalculatedRate
 * SettlementSubTotalCalculatedTax2.mmCalculatedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmBasisAmount
 * SettlementSubTotalCalculatedTax2.mmBasisAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmCalculatedAmount
 * SettlementSubTotalCalculatedTax2.mmCalculatedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmExemptionReasonCode
 * SettlementSubTotalCalculatedTax2.mmExemptionReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmExemptionReasonText
 * SettlementSubTotalCalculatedTax2.mmExemptionReasonText}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2#mmTaxCurrencyExchange
 * SettlementSubTotalCalculatedTax2.mmTaxCurrencyExchange}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "SettlementSubTotalCalculatedTax2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies  the subtotal calculated tax applicable for this settlement."</li>
 * </ul>
 */
public class SettlementSubTotalCalculatedTax2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max4Text typeCode;
	/**
	 * Type of tax applied.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmTypeCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmType;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "TpCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeCode";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	protected PercentageRate calculatedRate;
	/**
	 * Rate used to calculate the amount of this tax, levy or duty.
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
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of this tax, levy or duty."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculatedRate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmRate;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "ClctdRate";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedRate";
			definition = "Rate used to calculate the amount of this tax, levy or duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected List<CurrencyAndAmount> basisAmount;
	/**
	 * Monetary value used as the basis on which this tax, levy or duty is
	 * calculated.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsisAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value used as the basis on which this tax, levy or duty is calculated."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasisAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmAmount;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "BsisAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisAmount";
			definition = "Monetary value used as the basis on which this tax, levy or duty is calculated.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected List<CurrencyAndAmount> calculatedAmount;
	/**
	 * Monetary value resulting from the calculation of this tax, levy or duty.
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctdAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Monetary value resulting from the calculation of this tax, levy or duty."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCalculatedAmount = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmAmount;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "ClctdAmt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedAmount";
			definition = "Monetary value resulting from the calculation of this tax, levy or duty.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	protected Max4Text exemptionReasonCode;
	/**
	 * Reason for tax exemption expressed as a code, if invoice or card
	 * transaction is out of tax processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for tax exemption expressed as a code,  if invoice or card transaction is out of tax processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionReasonCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmType;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsnCd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReasonCode";
			definition = "Reason for tax exemption expressed as a code,  if invoice or card transaction is out of tax processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	protected Max500Text exemptionReasonText;
	/**
	 * Reason for a tax exemption, if invoice or card transaction is out of tax
	 * processing.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max500Text
	 * Max500Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxationConditions
	 * Tax.mmTaxationConditions}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsnTxt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReasonText"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for a tax exemption,  if invoice or card transaction is out of tax processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionReasonText = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Tax.mmTaxationConditions;
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsnTxt";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReasonText";
			definition = "Reason for a tax exemption,  if invoice or card transaction is out of tax processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}
	};
	protected CurrencyReference3 taxCurrencyExchange;
	/**
	 * If tax currency in tax calculation is different from invoice currency,
	 * then applied exchange rate is given in this message structure.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CurrencyReference3
	 * CurrencyReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxCcyXchg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxCurrencyExchange"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "If tax currency in tax calculation is different from invoice currency, then applied exchange rate is given in this message structure."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmTaxCurrencyExchange = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "TaxCcyXchg";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCurrencyExchange";
			definition = "If tax currency in tax calculation is different from invoice currency, then applied exchange rate is given in this message structure.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CurrencyReference3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmTypeCode, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmCalculatedRate,
						com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmBasisAmount, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmCalculatedAmount,
						com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmExemptionReasonCode, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmExemptionReasonText,
						com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmTaxCurrencyExchange);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "SettlementSubTotalCalculatedTax2";
				definition = "Specifies  the subtotal calculated tax applicable for this settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max4Text getTypeCode() {
		return typeCode;
	}

	public void setTypeCode(Max4Text typeCode) {
		this.typeCode = typeCode;
	}

	public PercentageRate getCalculatedRate() {
		return calculatedRate;
	}

	public void setCalculatedRate(PercentageRate calculatedRate) {
		this.calculatedRate = calculatedRate;
	}

	public List<CurrencyAndAmount> getBasisAmount() {
		return basisAmount;
	}

	public void setBasisAmount(List<CurrencyAndAmount> basisAmount) {
		this.basisAmount = basisAmount;
	}

	public List<CurrencyAndAmount> getCalculatedAmount() {
		return calculatedAmount;
	}

	public void setCalculatedAmount(List<CurrencyAndAmount> calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}

	public Max4Text getExemptionReasonCode() {
		return exemptionReasonCode;
	}

	public void setExemptionReasonCode(Max4Text exemptionReasonCode) {
		this.exemptionReasonCode = exemptionReasonCode;
	}

	public Max500Text getExemptionReasonText() {
		return exemptionReasonText;
	}

	public void setExemptionReasonText(Max500Text exemptionReasonText) {
		this.exemptionReasonText = exemptionReasonText;
	}

	public CurrencyReference3 getTaxCurrencyExchange() {
		return taxCurrencyExchange;
	}

	public void setTaxCurrencyExchange(com.tools20022.repository.msg.CurrencyReference3 taxCurrencyExchange) {
		this.taxCurrencyExchange = taxCurrencyExchange;
	}
}