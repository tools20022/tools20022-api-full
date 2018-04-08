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
import com.tools20022.repository.datatype.CurrencyAndAmount;
import com.tools20022.repository.datatype.Max4Text;
import com.tools20022.repository.datatype.Max500Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CurrencyReference3;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SettlementSubTotalCalculatedTax2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the subtotal calculated tax applicable for this settlement."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SettlementSubTotalCalculatedTax2", propOrder = {"typeCode", "calculatedRate", "basisAmount", "calculatedAmount", "exemptionReasonCode", "exemptionReasonText", "taxCurrencyExchange"})
public class SettlementSubTotalCalculatedTax2 {

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
	public static final MMMessageAttribute<SettlementSubTotalCalculatedTax2, Optional<Max4Text>> mmTypeCode = new MMMessageAttribute<SettlementSubTotalCalculatedTax2, Optional<Max4Text>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "TpCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeCode";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Optional<Max4Text> getValue(SettlementSubTotalCalculatedTax2 obj) {
			return obj.getTypeCode();
		}

		@Override
		public void setValue(SettlementSubTotalCalculatedTax2 obj, Optional<Max4Text> value) {
			obj.setTypeCode(value.orElse(null));
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
	public static final MMMessageAttribute<SettlementSubTotalCalculatedTax2, Optional<PercentageRate>> mmCalculatedRate = new MMMessageAttribute<SettlementSubTotalCalculatedTax2, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "ClctdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedRate";
			definition = "Rate used to calculate the amount of this tax, levy or duty.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public Optional<PercentageRate> getValue(SettlementSubTotalCalculatedTax2 obj) {
			return obj.getCalculatedRate();
		}

		@Override
		public void setValue(SettlementSubTotalCalculatedTax2 obj, Optional<PercentageRate> value) {
			obj.setCalculatedRate(value.orElse(null));
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
	public static final MMMessageAttribute<SettlementSubTotalCalculatedTax2, List<CurrencyAndAmount>> mmBasisAmount = new MMMessageAttribute<SettlementSubTotalCalculatedTax2, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "BsisAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisAmount";
			definition = "Monetary value used as the basis on which this tax, levy or duty is calculated.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(SettlementSubTotalCalculatedTax2 obj) {
			return obj.getBasisAmount();
		}

		@Override
		public void setValue(SettlementSubTotalCalculatedTax2 obj, List<CurrencyAndAmount> value) {
			obj.setBasisAmount(value);
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
	public static final MMMessageAttribute<SettlementSubTotalCalculatedTax2, List<CurrencyAndAmount>> mmCalculatedAmount = new MMMessageAttribute<SettlementSubTotalCalculatedTax2, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "ClctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedAmount";
			definition = "Monetary value resulting from the calculation of this tax, levy or duty.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(SettlementSubTotalCalculatedTax2 obj) {
			return obj.getCalculatedAmount();
		}

		@Override
		public void setValue(SettlementSubTotalCalculatedTax2 obj, List<CurrencyAndAmount> value) {
			obj.setCalculatedAmount(value);
		}
	};
	@XmlElement(name = "XmptnRsnCd")
	protected Max4Text exemptionReasonCode;
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
	 * {@linkplain com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2
	 * SettlementSubTotalCalculatedTax2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "XmptnRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
	 * constraint} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.constraints.ConstraintR7#forSettlementSubTotalCalculatedTax2_ExemptionReasonCode
	 * ConstraintR7.forSettlementSubTotalCalculatedTax2_ExemptionReasonCode}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ExemptionReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reason for tax exemption expressed as a code, if invoice or card transaction is out of tax processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementSubTotalCalculatedTax2, Optional<Max4Text>> mmExemptionReasonCode = new MMMessageAttribute<SettlementSubTotalCalculatedTax2, Optional<Max4Text>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsnCd";
			constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintR7.forSettlementSubTotalCalculatedTax2_ExemptionReasonCode);
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReasonCode";
			definition = "Reason for tax exemption expressed as a code, if invoice or card transaction is out of tax processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Optional<Max4Text> getValue(SettlementSubTotalCalculatedTax2 obj) {
			return obj.getExemptionReasonCode();
		}

		@Override
		public void setValue(SettlementSubTotalCalculatedTax2 obj, Optional<Max4Text> value) {
			obj.setExemptionReasonCode(value.orElse(null));
		}
	};
	@XmlElement(name = "XmptnRsnTxt")
	protected Max500Text exemptionReasonText;
	/**
	 * 
	 <p>
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
	 * "Reason for a tax exemption, if invoice or card transaction is out of tax processing."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SettlementSubTotalCalculatedTax2, Optional<Max500Text>> mmExemptionReasonText = new MMMessageAttribute<SettlementSubTotalCalculatedTax2, Optional<Max500Text>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxationConditions;
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "XmptnRsnTxt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ExemptionReasonText";
			definition = "Reason for a tax exemption, if invoice or card transaction is out of tax processing.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max500Text.mmObject();
		}

		@Override
		public Optional<Max500Text> getValue(SettlementSubTotalCalculatedTax2 obj) {
			return obj.getExemptionReasonText();
		}

		@Override
		public void setValue(SettlementSubTotalCalculatedTax2 obj, Optional<Max500Text> value) {
			obj.setExemptionReasonText(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxCcyXchg")
	protected CurrencyReference3 taxCurrencyExchange;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<SettlementSubTotalCalculatedTax2, Optional<CurrencyReference3>> mmTaxCurrencyExchange = new MMMessageAssociationEnd<SettlementSubTotalCalculatedTax2, Optional<CurrencyReference3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SettlementSubTotalCalculatedTax2.mmObject();
			isDerived = false;
			xmlTag = "TaxCcyXchg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxCurrencyExchange";
			definition = "If tax currency in tax calculation is different from invoice currency, then applied exchange rate is given in this message structure.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CurrencyReference3.mmObject();
		}

		@Override
		public Optional<CurrencyReference3> getValue(SettlementSubTotalCalculatedTax2 obj) {
			return obj.getTaxCurrencyExchange();
		}

		@Override
		public void setValue(SettlementSubTotalCalculatedTax2 obj, Optional<CurrencyReference3> value) {
			obj.setTaxCurrencyExchange(value.orElse(null));
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
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SettlementSubTotalCalculatedTax2";
				definition = "Specifies the subtotal calculated tax applicable for this settlement.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max4Text> getTypeCode() {
		return typeCode == null ? Optional.empty() : Optional.of(typeCode);
	}

	public SettlementSubTotalCalculatedTax2 setTypeCode(Max4Text typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	public Optional<PercentageRate> getCalculatedRate() {
		return calculatedRate == null ? Optional.empty() : Optional.of(calculatedRate);
	}

	public SettlementSubTotalCalculatedTax2 setCalculatedRate(PercentageRate calculatedRate) {
		this.calculatedRate = calculatedRate;
		return this;
	}

	public List<CurrencyAndAmount> getBasisAmount() {
		return basisAmount == null ? basisAmount = new ArrayList<>() : basisAmount;
	}

	public SettlementSubTotalCalculatedTax2 setBasisAmount(List<CurrencyAndAmount> basisAmount) {
		this.basisAmount = Objects.requireNonNull(basisAmount);
		return this;
	}

	public List<CurrencyAndAmount> getCalculatedAmount() {
		return calculatedAmount == null ? calculatedAmount = new ArrayList<>() : calculatedAmount;
	}

	public SettlementSubTotalCalculatedTax2 setCalculatedAmount(List<CurrencyAndAmount> calculatedAmount) {
		this.calculatedAmount = Objects.requireNonNull(calculatedAmount);
		return this;
	}

	public Optional<Max4Text> getExemptionReasonCode() {
		return exemptionReasonCode == null ? Optional.empty() : Optional.of(exemptionReasonCode);
	}

	public SettlementSubTotalCalculatedTax2 setExemptionReasonCode(Max4Text exemptionReasonCode) {
		this.exemptionReasonCode = exemptionReasonCode;
		return this;
	}

	public Optional<Max500Text> getExemptionReasonText() {
		return exemptionReasonText == null ? Optional.empty() : Optional.of(exemptionReasonText);
	}

	public SettlementSubTotalCalculatedTax2 setExemptionReasonText(Max500Text exemptionReasonText) {
		this.exemptionReasonText = exemptionReasonText;
		return this;
	}

	public Optional<CurrencyReference3> getTaxCurrencyExchange() {
		return taxCurrencyExchange == null ? Optional.empty() : Optional.of(taxCurrencyExchange);
	}

	public SettlementSubTotalCalculatedTax2 setTaxCurrencyExchange(CurrencyReference3 taxCurrencyExchange) {
		this.taxCurrencyExchange = taxCurrencyExchange;
		return this;
	}
}