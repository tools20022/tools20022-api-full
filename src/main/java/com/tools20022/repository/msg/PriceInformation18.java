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
import com.tools20022.repository.choice.DateAndDateTime2Choice;
import com.tools20022.repository.choice.PriceRateOrAmountOrUnknown2Choice;
import com.tools20022.repository.choice.TypeOfPrice30Choice;
import com.tools20022.repository.choice.YieldedOrValueType1Choice;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.SourceOfPrice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.MarketIdentification89;
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
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation18#mmType
 * PriceInformation18.mmType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation18#mmValueType
 * PriceInformation18.mmValueType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.PriceInformation18#mmValue
 * PriceInformation18.mmValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation18#mmSourceOfPrice
 * PriceInformation18.mmSourceOfPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.PriceInformation18#mmQuotationDate
 * PriceInformation18.mmQuotationDate}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintValueRule#forPriceInformation18
 * ConstraintValueRule.forPriceInformation18}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceInformation18"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Amount of money for which goods or services are offered, sold, or bought."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.PriceInformation13
 * PriceInformation13}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceInformation18", propOrder = {"type", "valueType", "value", "sourceOfPrice", "quotationDate"})
public class PriceInformation18 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Tp", required = true)
	protected TypeOfPrice30Choice type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.TypeOfPrice30Choice
	 * TypeOfPrice30Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPriceType
	 * SecuritiesPricing.mmPriceType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation18
	 * PriceInformation18}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmType
	 * PriceInformation13.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation18, TypeOfPrice30Choice> mmType = new MMMessageAttribute<PriceInformation18, TypeOfPrice30Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPriceType;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation18.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of price and information about the price.";
			previousVersion_lazy = () -> PriceInformation13.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> TypeOfPrice30Choice.mmObject();
		}

		@Override
		public TypeOfPrice30Choice getValue(PriceInformation18 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(PriceInformation18 obj, TypeOfPrice30Choice value) {
			obj.setType(value);
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
	 * {@linkplain com.tools20022.repository.msg.PriceInformation18
	 * PriceInformation18}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmValueType
	 * PriceInformation13.mmValueType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation18, YieldedOrValueType1Choice> mmValueType = new MMMessageAttribute<PriceInformation18, YieldedOrValueType1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmTypeOfRate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation18.mmObject();
			isDerived = false;
			xmlTag = "ValTp";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a::4!c//4!c"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ValueType";
			definition = "Type of value in which the price is expressed.";
			previousVersion_lazy = () -> PriceInformation13.mmValueType;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> YieldedOrValueType1Choice.mmObject();
		}

		@Override
		public YieldedOrValueType1Choice getValue(PriceInformation18 obj) {
			return obj.getValueType();
		}

		@Override
		public void setValue(PriceInformation18 obj, YieldedOrValueType1Choice value) {
			obj.setValueType(value);
		}
	};
	@XmlElement(name = "Val", required = true)
	protected PriceRateOrAmountOrUnknown2Choice value;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PriceRateOrAmountOrUnknown2Choice
	 * PriceRateOrAmountOrUnknown2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing
	 * SecuritiesPricing}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation18
	 * PriceInformation18}</li>
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
	 * definition} = "Value of the price, for example, as a currency and value."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmValue
	 * PriceInformation13.mmValue}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation18, PriceRateOrAmountOrUnknown2Choice> mmValue = new MMMessageAttribute<PriceInformation18, PriceRateOrAmountOrUnknown2Choice>() {
		{
			businessComponentTrace_lazy = () -> SecuritiesPricing.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation18.mmObject();
			isDerived = false;
			xmlTag = "Val";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Value";
			definition = "Value of the price, for example, as a currency and value.";
			previousVersion_lazy = () -> PriceInformation13.mmValue;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PriceRateOrAmountOrUnknown2Choice.mmObject();
		}

		@Override
		public PriceRateOrAmountOrUnknown2Choice getValue(PriceInformation18 obj) {
			return obj.getValue();
		}

		@Override
		public void setValue(PriceInformation18 obj, PriceRateOrAmountOrUnknown2Choice value) {
			obj.setValue(value);
		}
	};
	@XmlElement(name = "SrcOfPric")
	protected MarketIdentification89 sourceOfPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MarketIdentification89
	 * MarketIdentification89}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SourceOfPrice#mmMarketIdentification
	 * SourceOfPrice.mmMarketIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation18
	 * PriceInformation18}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmSourceOfPrice
	 * PriceInformation13.mmSourceOfPrice}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceInformation18, Optional<MarketIdentification89>> mmSourceOfPrice = new MMMessageAssociationEnd<PriceInformation18, Optional<MarketIdentification89>>() {
		{
			businessElementTrace_lazy = () -> SourceOfPrice.mmMarketIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation18.mmObject();
			isDerived = false;
			xmlTag = "SrcOfPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":94B::PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SourceOfPrice";
			definition = "Place from which the price was obtained.";
			previousVersion_lazy = () -> PriceInformation13.mmSourceOfPrice;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MarketIdentification89.mmObject();
		}

		@Override
		public Optional<MarketIdentification89> getValue(PriceInformation18 obj) {
			return obj.getSourceOfPrice();
		}

		@Override
		public void setValue(PriceInformation18 obj, Optional<MarketIdentification89> value) {
			obj.setSourceOfPrice(value.orElse(null));
		}
	};
	@XmlElement(name = "QtnDt")
	protected DateAndDateTime2Choice quotationDate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateAndDateTime2Choice
	 * DateAndDateTime2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmQuotationDate
	 * SecuritiesPricing.mmQuotationDate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation18
	 * PriceInformation18}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.PriceInformation13#mmQuotationDate
	 * PriceInformation13.mmQuotationDate}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceInformation18, Optional<DateAndDateTime2Choice>> mmQuotationDate = new MMMessageAttribute<PriceInformation18, Optional<DateAndDateTime2Choice>>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmQuotationDate;
			componentContext_lazy = () -> com.tools20022.repository.msg.PriceInformation18.mmObject();
			isDerived = false;
			xmlTag = "QtnDt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":98a::PRIC"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuotationDate";
			definition = "Date on which the price is obtained. With an investment fund, this is as stated in the prospectus.";
			previousVersion_lazy = () -> PriceInformation13.mmQuotationDate;
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> DateAndDateTime2Choice.mmObject();
		}

		@Override
		public Optional<DateAndDateTime2Choice> getValue(PriceInformation18 obj) {
			return obj.getQuotationDate();
		}

		@Override
		public void setValue(PriceInformation18 obj, Optional<DateAndDateTime2Choice> value) {
			obj.setQuotationDate(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.PriceInformation18.mmType, com.tools20022.repository.msg.PriceInformation18.mmValueType, com.tools20022.repository.msg.PriceInformation18.mmValue,
						com.tools20022.repository.msg.PriceInformation18.mmSourceOfPrice, com.tools20022.repository.msg.PriceInformation18.mmQuotationDate);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintValueRule.forPriceInformation18);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceInformation18";
				definition = "Amount of money for which goods or services are offered, sold, or bought.";
				previousVersion_lazy = () -> PriceInformation13.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public TypeOfPrice30Choice getType() {
		return type;
	}

	public PriceInformation18 setType(TypeOfPrice30Choice type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public YieldedOrValueType1Choice getValueType() {
		return valueType;
	}

	public PriceInformation18 setValueType(YieldedOrValueType1Choice valueType) {
		this.valueType = Objects.requireNonNull(valueType);
		return this;
	}

	public PriceRateOrAmountOrUnknown2Choice getValue() {
		return value;
	}

	public PriceInformation18 setValue(PriceRateOrAmountOrUnknown2Choice value) {
		this.value = Objects.requireNonNull(value);
		return this;
	}

	public Optional<MarketIdentification89> getSourceOfPrice() {
		return sourceOfPrice == null ? Optional.empty() : Optional.of(sourceOfPrice);
	}

	public PriceInformation18 setSourceOfPrice(MarketIdentification89 sourceOfPrice) {
		this.sourceOfPrice = sourceOfPrice;
		return this;
	}

	public Optional<DateAndDateTime2Choice> getQuotationDate() {
		return quotationDate == null ? Optional.empty() : Optional.of(quotationDate);
	}

	public PriceInformation18 setQuotationDate(DateAndDateTime2Choice quotationDate) {
		this.quotationDate = quotationDate;
		return this;
	}
}