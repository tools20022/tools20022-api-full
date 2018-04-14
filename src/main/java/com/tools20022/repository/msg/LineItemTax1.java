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
import com.tools20022.repository.choice.TaxTypeFormat1Choice;
import com.tools20022.repository.datatype.*;
import com.tools20022.repository.entity.Tax;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money due to the government or tax authority, according to various
 * pre-defined parameters such as thresholds or income.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.LineItemTax1#mmCalculatedAmount
 * LineItemTax1.mmCalculatedAmount}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1#mmTypeCode
 * LineItemTax1.mmTypeCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1#mmTaxPointDate
 * LineItemTax1.mmTaxPointDate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1#mmCalculatedRate
 * LineItemTax1.mmCalculatedRate}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1#mmCategoryCode
 * LineItemTax1.mmCategoryCode}</li>
 * <li>{@linkplain com.tools20022.repository.msg.LineItemTax1#mmCategoryName
 * LineItemTax1.mmCategoryName}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Tax Tax}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "LineItemTax1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "LineItemTax1", propOrder = {"calculatedAmount", "typeCode", "taxPointDate", "calculatedRate", "categoryCode", "categoryName"})
public class LineItemTax1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1 LineItemTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctdAmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Amount of money resulting from the calculation of the tax."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemTax1, List<CurrencyAndAmount>> mmCalculatedAmount = new MMMessageAttribute<LineItemTax1, List<CurrencyAndAmount>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemTax1.mmObject();
			isDerived = false;
			xmlTag = "ClctdAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CalculatedAmount";
			definition = "Amount of money resulting from the calculation of the tax.";
			minOccurs = 0;
			simpleType_lazy = () -> CurrencyAndAmount.mmObject();
		}

		@Override
		public List<CurrencyAndAmount> getValue(LineItemTax1 obj) {
			return obj.getCalculatedAmount();
		}

		@Override
		public void setValue(LineItemTax1 obj, List<CurrencyAndAmount> value) {
			obj.setCalculatedAmount(value);
		}
	};
	@XmlElement(name = "TpCd")
	protected TaxTypeFormat1Choice typeCode;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TaxTypeFormat1Choice
	 * TaxTypeFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Tax#mmType Tax.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1 LineItemTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TpCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TypeCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of tax applied."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemTax1, Optional<TaxTypeFormat1Choice>> mmTypeCode = new MMMessageAttribute<LineItemTax1, Optional<TaxTypeFormat1Choice>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemTax1.mmObject();
			isDerived = false;
			xmlTag = "TpCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TypeCode";
			definition = "Type of tax applied.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> TaxTypeFormat1Choice.mmObject();
		}

		@Override
		public Optional<TaxTypeFormat1Choice> getValue(LineItemTax1 obj) {
			return obj.getTypeCode();
		}

		@Override
		public void setValue(LineItemTax1 obj, Optional<TaxTypeFormat1Choice> value) {
			obj.setTypeCode(value.orElse(null));
		}
	};
	@XmlElement(name = "TaxPtDt")
	protected ISODate taxPointDate;
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
	 * {@linkplain com.tools20022.repository.entity.Tax#mmTaxDate Tax.mmTaxDate}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1 LineItemTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TaxPtDt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TaxPointDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date of the tax point date when this tax, levy or duty becomes applicable."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemTax1, Optional<ISODate>> mmTaxPointDate = new MMMessageAttribute<LineItemTax1, Optional<ISODate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmTaxDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemTax1.mmObject();
			isDerived = false;
			xmlTag = "TaxPtDt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TaxPointDate";
			definition = "Date of the tax point date when this tax, levy or duty becomes applicable.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISODate.mmObject();
		}

		@Override
		public Optional<ISODate> getValue(LineItemTax1 obj) {
			return obj.getTaxPointDate();
		}

		@Override
		public void setValue(LineItemTax1 obj, Optional<ISODate> value) {
			obj.setTaxPointDate(value.orElse(null));
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
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1 LineItemTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ClctdRate"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CalculatedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Rate used to calculate the amount of this tax, levy or duty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemTax1, Optional<PercentageRate>> mmCalculatedRate = new MMMessageAttribute<LineItemTax1, Optional<PercentageRate>>() {
		{
			businessElementTrace_lazy = () -> Tax.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemTax1.mmObject();
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
		public Optional<PercentageRate> getValue(LineItemTax1 obj) {
			return obj.getCalculatedRate();
		}

		@Override
		public void setValue(LineItemTax1 obj, Optional<PercentageRate> value) {
			obj.setCalculatedRate(value.orElse(null));
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1 LineItemTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyCd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Code specifying the category to which this tax, levy or duty applies, such as codes for 'exempt from tax', 'standard rate', \"free export item - tax not charged'."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemTax1, Optional<Max4Text>> mmCategoryCode = new MMMessageAttribute<LineItemTax1, Optional<Max4Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemTax1.mmObject();
			isDerived = false;
			xmlTag = "CtgyCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryCode";
			definition = "Code specifying the category to which this tax, levy or duty applies, such as codes for 'exempt from tax', 'standard rate', \"free export item - tax not charged'.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max4Text.mmObject();
		}

		@Override
		public Optional<Max4Text> getValue(LineItemTax1 obj) {
			return obj.getCategoryCode();
		}

		@Override
		public void setValue(LineItemTax1 obj, Optional<Max4Text> value) {
			obj.setCategoryCode(value.orElse(null));
		}
	};
	@XmlElement(name = "CtgyNm")
	protected List<Max35Text> categoryName;
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
	 * {@linkplain com.tools20022.repository.msg.LineItemTax1 LineItemTax1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtgyNm"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CategoryName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Category name, expressed as text, of the tax, levy or duty."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<LineItemTax1, List<Max35Text>> mmCategoryName = new MMMessageAttribute<LineItemTax1, List<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.LineItemTax1.mmObject();
			isDerived = false;
			xmlTag = "CtgyNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CategoryName";
			definition = "Category name, expressed as text, of the tax, levy or duty.";
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public List<Max35Text> getValue(LineItemTax1 obj) {
			return obj.getCategoryName();
		}

		@Override
		public void setValue(LineItemTax1 obj, List<Max35Text> value) {
			obj.setCategoryName(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.LineItemTax1.mmCalculatedAmount, com.tools20022.repository.msg.LineItemTax1.mmTypeCode, com.tools20022.repository.msg.LineItemTax1.mmTaxPointDate,
						com.tools20022.repository.msg.LineItemTax1.mmCalculatedRate, com.tools20022.repository.msg.LineItemTax1.mmCategoryCode, com.tools20022.repository.msg.LineItemTax1.mmCategoryName);
				trace_lazy = () -> Tax.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "LineItemTax1";
				definition = "Amount of money due to the government or tax authority, according to various pre-defined parameters such as thresholds or income.";
			}
		});
		return mmObject_lazy.get();
	}

	public List<CurrencyAndAmount> getCalculatedAmount() {
		return calculatedAmount == null ? calculatedAmount = new ArrayList<>() : calculatedAmount;
	}

	public LineItemTax1 setCalculatedAmount(List<CurrencyAndAmount> calculatedAmount) {
		this.calculatedAmount = Objects.requireNonNull(calculatedAmount);
		return this;
	}

	public Optional<TaxTypeFormat1Choice> getTypeCode() {
		return typeCode == null ? Optional.empty() : Optional.of(typeCode);
	}

	public LineItemTax1 setTypeCode(TaxTypeFormat1Choice typeCode) {
		this.typeCode = typeCode;
		return this;
	}

	public Optional<ISODate> getTaxPointDate() {
		return taxPointDate == null ? Optional.empty() : Optional.of(taxPointDate);
	}

	public LineItemTax1 setTaxPointDate(ISODate taxPointDate) {
		this.taxPointDate = taxPointDate;
		return this;
	}

	public Optional<PercentageRate> getCalculatedRate() {
		return calculatedRate == null ? Optional.empty() : Optional.of(calculatedRate);
	}

	public LineItemTax1 setCalculatedRate(PercentageRate calculatedRate) {
		this.calculatedRate = calculatedRate;
		return this;
	}

	public Optional<Max4Text> getCategoryCode() {
		return categoryCode == null ? Optional.empty() : Optional.of(categoryCode);
	}

	public LineItemTax1 setCategoryCode(Max4Text categoryCode) {
		this.categoryCode = categoryCode;
		return this;
	}

	public List<Max35Text> getCategoryName() {
		return categoryName == null ? categoryName = new ArrayList<>() : categoryName;
	}

	public LineItemTax1 setCategoryName(List<Max35Text> categoryName) {
		this.categoryName = Objects.requireNonNull(categoryName);
		return this;
	}
}