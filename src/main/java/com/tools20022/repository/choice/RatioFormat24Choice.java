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
import com.tools20022.repository.codeset.RateValueType7Code;
import com.tools20022.repository.entity.AmountAndQuantity;
import com.tools20022.repository.entity.AmountRatio;
import com.tools20022.repository.entity.QuantityRatio;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndQuantityRatio5;
import com.tools20022.repository.msg.AmountToAmountRatio3;
import com.tools20022.repository.msg.QuantityToQuantityRatio2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format to express a ratio.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmQuantityToQuantity
 * RatioFormat24Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmNotSpecifiedRate
 * RatioFormat24Choice.mmNotSpecifiedRate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmAmountToAmount
 * RatioFormat24Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmAmountToQuantity
 * RatioFormat24Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice#mmQuantityToAmount
 * RatioFormat24Choice.mmQuantityToAmount}</li>
 * </ul>
 * </li>
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
 * "RatioFormat24Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format to express a ratio."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RatioFormat24Choice", propOrder = {"quantityToQuantity", "notSpecifiedRate", "amountToAmount", "amountToQuantity", "quantityToAmount"})
public class RatioFormat24Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "QtyToQty", required = true)
	protected QuantityToQuantityRatio2 quantityToQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio2
	 * QuantityToQuantityRatio2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92D::</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as a quotient of quantities."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RatioFormat24Choice, QuantityToQuantityRatio2> mmQuantityToQuantity = new MMMessageAssociationEnd<RatioFormat24Choice, QuantityToQuantityRatio2>() {
		{
			businessComponentTrace_lazy = () -> QuantityRatio.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92D::"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToQuantity";
			definition = "Ratio expressed as a quotient of quantities.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuantityToQuantityRatio2.mmObject();
		}

		@Override
		public QuantityToQuantityRatio2 getValue(RatioFormat24Choice obj) {
			return obj.getQuantityToQuantity();
		}

		@Override
		public void setValue(RatioFormat24Choice obj, QuantityToQuantityRatio2 value) {
			obj.setQuantityToQuantity(value);
		}
	};
	@XmlElement(name = "NotSpcfdRate", required = true)
	protected RateValueType7Code notSpecifiedRate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RateValueType7Code
	 * RateValueType7Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92K:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Value of the ratio not specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RatioFormat24Choice, RateValueType7Code> mmNotSpecifiedRate = new MMMessageAttribute<RatioFormat24Choice, RateValueType7Code>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92K:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "Value of the ratio not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RateValueType7Code.mmObject();
		}

		@Override
		public RateValueType7Code getValue(RatioFormat24Choice obj) {
			return obj.getNotSpecifiedRate();
		}

		@Override
		public void setValue(RatioFormat24Choice obj, RateValueType7Code value) {
			obj.setNotSpecifiedRate(value);
		}
	};
	@XmlElement(name = "AmtToAmt", required = true)
	protected AmountToAmountRatio3 amountToAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountToAmountRatio3
	 * AmountToAmountRatio3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92L:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as a quotient of amounts."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RatioFormat24Choice, AmountToAmountRatio3> mmAmountToAmount = new MMMessageAssociationEnd<RatioFormat24Choice, AmountToAmountRatio3>() {
		{
			businessComponentTrace_lazy = () -> AmountRatio.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtToAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92L:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToAmount";
			definition = "Ratio expressed as a quotient of amounts.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountToAmountRatio3.mmObject();
		}

		@Override
		public AmountToAmountRatio3 getValue(RatioFormat24Choice obj) {
			return obj.getAmountToAmount();
		}

		@Override
		public void setValue(RatioFormat24Choice obj, AmountToAmountRatio3 value) {
			obj.setAmountToAmount(value);
		}
	};
	@XmlElement(name = "AmtToQty", required = true)
	protected AmountAndQuantityRatio5 amountToQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio5
	 * AmountAndQuantityRatio5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92M:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as an amount to quantity ratio."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RatioFormat24Choice, AmountAndQuantityRatio5> mmAmountToQuantity = new MMMessageAssociationEnd<RatioFormat24Choice, AmountAndQuantityRatio5>() {
		{
			businessComponentTrace_lazy = () -> AmountAndQuantity.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtToQty";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92M:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToQuantity";
			definition = "Ratio expressed as an amount to quantity ratio.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndQuantityRatio5.mmObject();
		}

		@Override
		public AmountAndQuantityRatio5 getValue(RatioFormat24Choice obj) {
			return obj.getAmountToQuantity();
		}

		@Override
		public void setValue(RatioFormat24Choice obj, AmountAndQuantityRatio5 value) {
			obj.setAmountToQuantity(value);
		}
	};
	@XmlElement(name = "QtyToAmt", required = true)
	protected AmountAndQuantityRatio5 quantityToAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio5
	 * AmountAndQuantityRatio5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat24Choice
	 * RatioFormat24Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getSemanticMarkup
	 * semanticMarkup} = ISO15022Synonym: :92N:</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio expressed as a quantity to amount ratio."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RatioFormat24Choice, AmountAndQuantityRatio5> mmQuantityToAmount = new MMMessageAssociationEnd<RatioFormat24Choice, AmountAndQuantityRatio5>() {
		{
			businessComponentTrace_lazy = () -> AmountAndQuantity.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.RatioFormat24Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToAmt";
			semanticMarkup_lazy = () -> Arrays.asList(new ISO15022Synonym(this, ":92N:"));
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToAmount";
			definition = "Ratio expressed as a quantity to amount ratio.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndQuantityRatio5.mmObject();
		}

		@Override
		public AmountAndQuantityRatio5 getValue(RatioFormat24Choice obj) {
			return obj.getQuantityToAmount();
		}

		@Override
		public void setValue(RatioFormat24Choice obj, AmountAndQuantityRatio5 value) {
			obj.setQuantityToAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays
						.asList(com.tools20022.repository.choice.RatioFormat24Choice.mmQuantityToQuantity, com.tools20022.repository.choice.RatioFormat24Choice.mmNotSpecifiedRate,
								com.tools20022.repository.choice.RatioFormat24Choice.mmAmountToAmount, com.tools20022.repository.choice.RatioFormat24Choice.mmAmountToQuantity,
								com.tools20022.repository.choice.RatioFormat24Choice.mmQuantityToAmount);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RatioFormat24Choice";
				definition = "Choice of format to express a ratio.";
			}
		});
		return mmObject_lazy.get();
	}

	public QuantityToQuantityRatio2 getQuantityToQuantity() {
		return quantityToQuantity;
	}

	public RatioFormat24Choice setQuantityToQuantity(QuantityToQuantityRatio2 quantityToQuantity) {
		this.quantityToQuantity = Objects.requireNonNull(quantityToQuantity);
		return this;
	}

	public RateValueType7Code getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public RatioFormat24Choice setNotSpecifiedRate(RateValueType7Code notSpecifiedRate) {
		this.notSpecifiedRate = Objects.requireNonNull(notSpecifiedRate);
		return this;
	}

	public AmountToAmountRatio3 getAmountToAmount() {
		return amountToAmount;
	}

	public RatioFormat24Choice setAmountToAmount(AmountToAmountRatio3 amountToAmount) {
		this.amountToAmount = Objects.requireNonNull(amountToAmount);
		return this;
	}

	public AmountAndQuantityRatio5 getAmountToQuantity() {
		return amountToQuantity;
	}

	public RatioFormat24Choice setAmountToQuantity(AmountAndQuantityRatio5 amountToQuantity) {
		this.amountToQuantity = Objects.requireNonNull(amountToQuantity);
		return this;
	}

	public AmountAndQuantityRatio5 getQuantityToAmount() {
		return quantityToAmount;
	}

	public RatioFormat24Choice setQuantityToAmount(AmountAndQuantityRatio5 quantityToAmount) {
		this.quantityToAmount = Objects.requireNonNull(quantityToAmount);
		return this;
	}
}