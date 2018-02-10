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

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.DateAndDateTimeChoice;
import com.tools20022.repository.choice.PriceRateOrAmountOrUnknown1Choice;
import com.tools20022.repository.choice.TypeOfPrice45Choice;
import com.tools20022.repository.choice.YieldedOrValueType1Choice;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SourceOfPrice;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Amount of money for which goods or services are offered, sold, or bought.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation16#mmType
 * PriceInformation16.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation16#mmValueType
 * PriceInformation16.mmValueType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation16#mmValue
 * PriceInformation16.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation16#mmSourceOfPrice
 * PriceInformation16.mmSourceOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation16#mmQuotationDate
 * PriceInformation16.mmQuotationDate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintValueRule#forPriceInformation16
 * ConstraintValueRule.forPriceInformation16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceInformation16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceInformation16", propOrder = {"type", "valueType", "value", "sourceOfPrice", "quotationDate"})
public class PriceInformation16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TypeOfPrice45Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice45Choice
	 * TypeOfPrice45Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16
	 * PriceInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the type of price and information about the price."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation16.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of price and information about the price.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TypeOfPrice45Choice.mmObject();
		}
	};
	@XmlElement(name = "ValTp", required = true)
	protected YieldedOrValueType1Choice valueType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.YieldedOrValueType1Choice
	 * YieldedOrValueType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmTypeOfRate
	 * SecuritiesPricing.mmTypeOfRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16
	 * PriceInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ValTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a::4!c//4!c</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ValueType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of value in which the price is expressed."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValueType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmTypeOfRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation16.mmObject();
			isDerived = false;
			xmlTag = "ValTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::4!c//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueType";
			definition = "Type of value in which the price is expressed.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> YieldedOrValueType1Choice.mmObject();
		}
	};
	@XmlElement(name = "Val", required = true)
	protected PriceRateOrAmountOrUnknown1Choice value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown1Choice
	 * PriceRateOrAmountOrUnknown1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16
	 * PriceInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Val"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Value"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price, eg, as a currency and value."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmValue = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> SecuritiesPricing.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation16.mmObject();
			isDerived = false;
			xmlTag = "Val";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Value of the price, eg, as a currency and value.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceRateOrAmountOrUnknown1Choice.mmObject();
		}
	};
	@XmlElement(name = "SrcOfPric")
	protected MarketIdentification91 sourceOfPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification91
	 * MarketIdentification91}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
	 * SourceOfPrice.mmMarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16
	 * PriceInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SrcOfPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :94B::PRIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SourceOfPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Place from which the price was obtained."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSourceOfPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SourceOfPrice.mmMarketIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation16.mmObject();
			isDerived = false;
			xmlTag = "SrcOfPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfPrice";
			definition = "Place from which the price was obtained.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.MarketIdentification91.mmObject();
		}
	};
	@XmlElement(name = "QtnDt")
	protected DateAndDateTimeChoice quotationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTimeChoice
	 * DateAndDateTimeChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmQuotationDate
	 * SecuritiesPricing.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation16
	 * PriceInformation16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtnDt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :98a::PRIC</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuotationDate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Date on which the price is obtained. With an investment fund, this is as stated in the prospectus."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuotationDate = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmQuotationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation16.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained. With an investment fund, this is as stated in the prospectus.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTimeChoice.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceInformation16.mmType, com.tools20022.repository.msg.PriceInformation16.mmValueType, com.tools20022.repository.msg.PriceInformation16.mmValue,
						com.tools20022.repository.msg.PriceInformation16.mmSourceOfPrice, com.tools20022.repository.msg.PriceInformation16.mmQuotationDate);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValueRule.forPriceInformation16);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceInformation16";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
			}
		});
		return mmObject_lazy.get();
	}

	public TypeOfPrice45Choice getType() {
		return type;
	}

	public PriceInformation16 setType(TypeOfPrice45Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public YieldedOrValueType1Choice getValueType() {
		return valueType;
	}

	public PriceInformation16 setValueType(YieldedOrValueType1Choice valueType) {
		this.valueType = Objects.requireNonNull(valueType);
		return this;
	}

	public PriceRateOrAmountOrUnknown1Choice getValue() {
		return value;
	}

	public PriceInformation16 setValue(PriceRateOrAmountOrUnknown1Choice value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public Optional<MarketIdentification91> getSourceOfPrice() {
		return sourceOfPrice == null ? Optional.empty() : Optional.of(sourceOfPrice);
	}

	public PriceInformation16 setSourceOfPrice(com.tools20022.repository.msg.MarketIdentification91 sourceOfPrice) {
		this.sourceOfPrice = sourceOfPrice;
		return this;
	}

	public Optional<DateAndDateTimeChoice> getQuotationDate() {
		return quotationDate == null ? Optional.empty() : Optional.of(quotationDate);
	}

	public PriceInformation16 setQuotationDate(DateAndDateTimeChoice quotationDate) {
		this.quotationDate = quotationDate;
		return this;
	}
}