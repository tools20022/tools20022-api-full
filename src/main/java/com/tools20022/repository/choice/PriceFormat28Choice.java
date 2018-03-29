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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.ext.ISO15022Synonym;
import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PriceValueType10Code;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountPrice5;
import com.tools20022.repository.msg.AmountPricePerAmount3;
import com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4;
import com.tools20022.repository.msg.PercentagePrice1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between a percentage price or an amount price or an unspecified price
 * or an amount price per amount or an amount price per financial instrument
 * quantity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#mmPercentagePrice
 * PriceFormat28Choice.mmPercentagePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#mmAmountPrice
 * PriceFormat28Choice.mmAmountPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#mmNotSpecifiedPrice
 * PriceFormat28Choice.mmNotSpecifiedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#mmAmountPricePerFinancialInstrumentQuantity
 * PriceFormat28Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice#mmAmountPricePerAmount
 * PriceFormat28Choice.mmAmountPricePerAmount}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule#forPriceFormat28Choice
 * ConstraintCoexistenceQuantityRule.forPriceFormat28Choice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule#forPriceFormat28Choice
 * ConstraintCoexistenceAmountRule.forPriceFormat28Choice}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "PriceFormat28Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a percentage price or an amount price or an unspecified price or an amount price per amount or an amount price per financial instrument quantity."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PriceFormat28Choice", propOrder = {"percentagePrice", "amountPrice", "notSpecifiedPrice", "amountPricePerFinancialInstrumentQuantity", "amountPricePerAmount"})
public class PriceFormat28Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PctgPric", required = true)
	protected PercentagePrice1 percentagePrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PercentagePrice1
	 * PercentagePrice1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
	 * SecuritiesPricing.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice
	 * PriceFormat28Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90A:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentagePrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a percentage."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceFormat28Choice, PercentagePrice1> mmPercentagePrice = new MMMessageAssociationEnd<PriceFormat28Choice, PercentagePrice1>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat28Choice.mmObject();
			isDerived = false;
			xmlTag = "PctgPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90A:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentagePrice";
			definition = "Price expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PercentagePrice1.mmObject();
		}

		@Override
		public PercentagePrice1 getValue(PriceFormat28Choice obj) {
			return obj.getPercentagePrice();
		}

		@Override
		public void setValue(PriceFormat28Choice obj, PercentagePrice1 value) {
			obj.setPercentagePrice(value);
		}
	};
	@XmlElement(name = "AmtPric", required = true)
	protected AmountPrice5 amountPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountPrice5
	 * AmountPrice5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Price#mmAmount
	 * Price.mmAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice
	 * PriceFormat28Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90a:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a currency and amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceFormat28Choice, AmountPrice5> mmAmountPrice = new MMMessageAssociationEnd<PriceFormat28Choice, AmountPrice5>() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat28Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90a:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPrice";
			definition = "Price expressed as a currency and amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPrice5.mmObject();
		}

		@Override
		public AmountPrice5 getValue(PriceFormat28Choice obj) {
			return obj.getAmountPrice();
		}

		@Override
		public void setValue(PriceFormat28Choice obj, AmountPrice5 value) {
			obj.setAmountPrice(value);
		}
	};
	@XmlElement(name = "NotSpcfdPric", required = true)
	protected PriceValueType10Code notSpecifiedPrice;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType10Code
	 * PriceValueType10Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice
	 * PriceFormat28Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdPric"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90E:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedPrice"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the price not specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PriceFormat28Choice, PriceValueType10Code> mmNotSpecifiedPrice = new MMMessageAttribute<PriceFormat28Choice, PriceValueType10Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat28Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdPric";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90E:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedPrice";
			definition = "Value of the price not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueType10Code.mmObject();
		}

		@Override
		public PriceValueType10Code getValue(PriceFormat28Choice obj) {
			return obj.getNotSpecifiedPrice();
		}

		@Override
		public void setValue(PriceFormat28Choice obj, PriceValueType10Code value) {
			obj.setNotSpecifiedPrice(value);
		}
	};
	@XmlElement(name = "AmtPricPerFinInstrmQty", required = true)
	protected AmountPricePerFinancialInstrumentQuantity4 amountPricePerFinancialInstrumentQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity4
	 * AmountPricePerFinancialInstrumentQuantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerFinancialInstrumentQuantity
	 * SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice
	 * PriceFormat28Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricPerFinInstrmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90F:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerFinancialInstrumentQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Price expressed as a ratio: amount price per financial instrument quantity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceFormat28Choice, AmountPricePerFinancialInstrumentQuantity4> mmAmountPricePerFinancialInstrumentQuantity = new MMMessageAssociationEnd<PriceFormat28Choice, AmountPricePerFinancialInstrumentQuantity4>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat28Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPricPerFinInstrmQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90F:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as a ratio: amount price per financial instrument quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPricePerFinancialInstrumentQuantity4.mmObject();
		}

		@Override
		public AmountPricePerFinancialInstrumentQuantity4 getValue(PriceFormat28Choice obj) {
			return obj.getAmountPricePerFinancialInstrumentQuantity();
		}

		@Override
		public void setValue(PriceFormat28Choice obj, AmountPricePerFinancialInstrumentQuantity4 value) {
			obj.setAmountPricePerFinancialInstrumentQuantity(value);
		}
	};
	@XmlElement(name = "AmtPricPerAmt", required = true)
	protected AmountPricePerAmount3 amountPricePerAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountPricePerAmount3
	 * AmountPricePerAmount3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerAmount
	 * SecuritiesPricing.mmAmountPricePerAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat28Choice
	 * PriceFormat28Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricPerAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :90J:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a ratio: amount price per amount."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<PriceFormat28Choice, AmountPricePerAmount3> mmAmountPricePerAmount = new MMMessageAssociationEnd<PriceFormat28Choice, AmountPricePerAmount3>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmAmountPricePerAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PriceFormat28Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPricPerAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":90J:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as a ratio: amount price per amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPricePerAmount3.mmObject();
		}

		@Override
		public AmountPricePerAmount3 getValue(PriceFormat28Choice obj) {
			return obj.getAmountPricePerAmount();
		}

		@Override
		public void setValue(PriceFormat28Choice obj, AmountPricePerAmount3 value) {
			obj.setAmountPricePerAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PriceFormat28Choice.mmPercentagePrice, com.tools20022.repository.choice.PriceFormat28Choice.mmAmountPrice,
						com.tools20022.repository.choice.PriceFormat28Choice.mmNotSpecifiedPrice, com.tools20022.repository.choice.PriceFormat28Choice.mmAmountPricePerFinancialInstrumentQuantity,
						com.tools20022.repository.choice.PriceFormat28Choice.mmAmountPricePerAmount);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCoexistenceQuantityRule.forPriceFormat28Choice,
						com.tools20022.repository.constraints.ConstraintCoexistenceAmountRule.forPriceFormat28Choice);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "PriceFormat28Choice";
				definition = "Choice between a percentage price or an amount price or an unspecified price or an amount price per amount or an amount price per financial instrument quantity.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentagePrice1 getPercentagePrice() {
		return percentagePrice;
	}

	public PriceFormat28Choice setPercentagePrice(PercentagePrice1 percentagePrice) {
		this.percentagePrice = Objects.requireNonNull(percentagePrice);
		return this;
	}

	public AmountPrice5 getAmountPrice() {
		return amountPrice;
	}

	public PriceFormat28Choice setAmountPrice(AmountPrice5 amountPrice) {
		this.amountPrice = Objects.requireNonNull(amountPrice);
		return this;
	}

	public PriceValueType10Code getNotSpecifiedPrice() {
		return notSpecifiedPrice;
	}

	public PriceFormat28Choice setNotSpecifiedPrice(PriceValueType10Code notSpecifiedPrice) {
		this.notSpecifiedPrice = Objects.requireNonNull(notSpecifiedPrice);
		return this;
	}

	public AmountPricePerFinancialInstrumentQuantity4 getAmountPricePerFinancialInstrumentQuantity() {
		return amountPricePerFinancialInstrumentQuantity;
	}

	public PriceFormat28Choice setAmountPricePerFinancialInstrumentQuantity(AmountPricePerFinancialInstrumentQuantity4 amountPricePerFinancialInstrumentQuantity) {
		this.amountPricePerFinancialInstrumentQuantity = Objects.requireNonNull(amountPricePerFinancialInstrumentQuantity);
		return this;
	}

	public AmountPricePerAmount3 getAmountPricePerAmount() {
		return amountPricePerAmount;
	}

	public PriceFormat28Choice setAmountPricePerAmount(AmountPricePerAmount3 amountPricePerAmount) {
		this.amountPricePerAmount = Objects.requireNonNull(amountPricePerAmount);
		return this;
	}
}