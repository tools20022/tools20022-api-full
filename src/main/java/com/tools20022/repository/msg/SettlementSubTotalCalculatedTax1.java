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
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmTypeCode
 * SettlementSubTotalCalculatedTax1.mmTypeCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmCategoryCode
 * SettlementSubTotalCalculatedTax1.mmCategoryCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmCalculatedAmount
 * SettlementSubTotalCalculatedTax1.mmCalculatedAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmBasisAmount
 * SettlementSubTotalCalculatedTax1.mmBasisAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmCalculatedRate
 * SettlementSubTotalCalculatedTax1.mmCalculatedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1#mmExemptionReason
 * SettlementSubTotalCalculatedTax1.mmExemptionReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
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
 * "SettlementSubTotalCalculatedTax1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the subtotal calculated tax applicable for this settlement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementSubTotalCalculatedTax1", propOrder = {"typeCode", "categoryCode", "calculatedAmount", "basisAmount", "calculatedRate", "exemptionReason"})
public class SettlementSubTotalCalculatedTax1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TpCd")
	protected Max4Text typeCode;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
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
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "TpCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeCode";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	@XmlElement(name = "CtgyCd")
	protected Max4Text categoryCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max4Text
	 * Max4Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmIdentification
	 * Tax.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT)."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCategoryCode = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "CtgyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryCode";
			definition = "Reference used to identify the nature of tax levied, such as Value Added Tax (VAT).";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}
	};
	@XmlElement(name = "ClctdAmt")
	protected List<CurrencyAndAmount> calculatedAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
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
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "ClctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedAmount";
			definition = "Monetary value resulting from the calculation of this tax, levy or duty.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "BsisAmt")
	protected List<CurrencyAndAmount> basisAmount;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmAmount Tax.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
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
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "BsisAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisAmount";
			definition = "Monetary value used as the basis on which this tax, levy or duty is calculated.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}
	};
	@XmlElement(name = "ClctdRate")
	protected PercentageRate calculatedRate;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
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
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "ClctdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedRate";
			definition = "Rate used to calculate the amount of this tax, levy or duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	@XmlElement(name = "XmptnRsn")
	protected TaxExemptionReason1 exemptionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.TaxExemptionReason1
	 * TaxExemptionReason1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmExemptionReason
	 * Tax.mmExemptionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1
	 * SettlementSubTotalCalculatedTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for a tax exemption."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmExemptionReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Tax.mmExemptionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReason";
			definition = "Reason for a tax exemption.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.TaxExemptionReason1.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmTypeCode, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmCategoryCode,
						com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmCalculatedAmount, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmBasisAmount,
						com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmCalculatedRate, com.tools20022.repository.msg.SettlementSubTotalCalculatedTax1.mmExemptionReason);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementSubTotalCalculatedTax1";
				definition = "Specifies the subtotal calculated tax applicable for this settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max4Text> getTypeCode() {
		return typeCode == null ? Optional.empty() : Optional.of(typeCode);
	}

	public SettlementSubTotalCalculatedTax1 setTypeCode(Max4Text typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	public Optional<Max4Text> getCategoryCode() {
		return categoryCode == null ? Optional.empty() : Optional.of(categoryCode);
	}

	public SettlementSubTotalCalculatedTax1 setCategoryCode(Max4Text categoryCode) {
		this.categoryCode = categoryCode;
		return this;
	}

	public List<CurrencyAndAmount> getCalculatedAmount() {
		return calculatedAmount == null ? calculatedAmount = new ArrayList<>() : calculatedAmount;
	}

	public SettlementSubTotalCalculatedTax1 setCalculatedAmount(List<CurrencyAndAmount> calculatedAmount) {
		this.calculatedAmount = Objects.requireNonNull(calculatedAmount);
		return this;
	}

	public List<CurrencyAndAmount> getBasisAmount() {
		return basisAmount == null ? basisAmount = new ArrayList<>() : basisAmount;
	}

	public SettlementSubTotalCalculatedTax1 setBasisAmount(List<CurrencyAndAmount> basisAmount) {
		this.basisAmount = Objects.requireNonNull(basisAmount);
		return this;
	}

	public Optional<PercentageRate> getCalculatedRate() {
		return calculatedRate == null ? Optional.empty() : Optional.of(calculatedRate);
	}

	public SettlementSubTotalCalculatedTax1 setCalculatedRate(PercentageRate calculatedRate) {
		this.calculatedRate = calculatedRate;
		return this;
	}

	public Optional<TaxExemptionReason1> getExemptionReason() {
		return exemptionReason == null ? Optional.empty() : Optional.of(exemptionReason);
	}

	public SettlementSubTotalCalculatedTax1 setExemptionReason(com.tools20022.repository.msg.TaxExemptionReason1 exemptionReason) {
		this.exemptionReason = exemptionReason;
		return this;
	}
}