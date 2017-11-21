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

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AmountAndQuantity;
import com.tools20022.repository.entity.AmountRatio;
import com.tools20022.repository.entity.QuantityRatio;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndQuantityRatio1;
import com.tools20022.repository.msg.AmountToAmountRatio1;
import com.tools20022.repository.msg.QuantityToQuantityRatio1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice of format to expressed a ratio.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#mmQuantityToQuantity
 * RatioFormat2Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#mmAmountToAmount
 * RatioFormat2Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#mmAmountToQuantity
 * RatioFormat2Choice.mmAmountToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#mmQuantityToAmount
 * RatioFormat2Choice.mmQuantityToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice#mmNotSpecifiedRate
 * RatioFormat2Choice.mmNotSpecifiedRate}</li>
 * </ul>
 * </li>
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
 * "RatioFormat2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format to expressed a ratio."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RatioFormat2Choice", propOrder = {"quantityToQuantity", "amountToAmount", "amountToQuantity", "quantityToAmount", "notSpecifiedRate"})
public class RatioFormat2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected QuantityToQuantityRatio1 quantityToQuantity;
	/**
	 * The ratio is expressed as a quantity per another quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.QuantityToQuantityRatio1
	 * QuantityToQuantityRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.QuantityRatio QuantityRatio}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice
	 * RatioFormat2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "The ratio is expressed as a quantity per another quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantityToQuantity = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> QuantityRatio.mmObject();
			componentContext_lazy = () -> RatioFormat2Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToQuantity";
			definition = "The ratio is expressed as a quantity per another quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> QuantityToQuantityRatio1.mmObject();
		}
	};
	protected AmountToAmountRatio1 amountToAmount;
	/**
	 * The ratio is expressed as an amount per another amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountToAmountRatio1
	 * AmountToAmountRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice
	 * RatioFormat2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The ratio is expressed as an amount per another amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountToAmount = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AmountRatio.mmObject();
			componentContext_lazy = () -> RatioFormat2Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToAmount";
			definition = "The ratio is expressed as an amount per another amount.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountToAmountRatio1.mmObject();
		}
	};
	protected AmountAndQuantityRatio1 amountToQuantity;
	/**
	 * The ratio is expressed as an amount per quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio1
	 * AmountAndQuantityRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice
	 * RatioFormat2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtToQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountToQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The ratio is expressed as an amount per quantity."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAmountToQuantity = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AmountAndQuantity.mmObject();
			componentContext_lazy = () -> RatioFormat2Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtToQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToQuantity";
			definition = "The ratio is expressed as an amount per quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountAndQuantityRatio1.mmObject();
		}
	};
	protected AmountAndQuantityRatio1 quantityToAmount;
	/**
	 * Ratio is expressed as a quantity per an amount.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio1
	 * AmountAndQuantityRatio1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice
	 * RatioFormat2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyToAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityToAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Ratio is expressed as a quantity per an amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuantityToAmount = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> AmountAndQuantity.mmObject();
			componentContext_lazy = () -> RatioFormat2Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToAmount";
			definition = "Ratio is expressed as a quantity per an amount.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> AmountAndQuantityRatio1.mmObject();
		}
	};
	protected RateType12FormatChoice notSpecifiedRate;
	/**
	 * The value of the ratio is not specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.RateType12FormatChoice
	 * RateType12FormatChoice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat2Choice
	 * RatioFormat2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotSpecifiedRate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The value of the ratio is not specified."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotSpecifiedRate = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RatioFormat2Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdRate";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedRate";
			definition = "The value of the ratio is not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> com.tools20022.repository.choice.RateType12FormatChoice.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RatioFormat2Choice.mmQuantityToQuantity, RatioFormat2Choice.mmAmountToAmount, RatioFormat2Choice.mmAmountToQuantity, RatioFormat2Choice.mmQuantityToAmount,
						RatioFormat2Choice.mmNotSpecifiedRate);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RatioFormat2Choice";
				definition = "Choice of format to expressed a ratio.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "QtyToQty", required = true)
	public QuantityToQuantityRatio1 getQuantityToQuantity() {
		return quantityToQuantity;
	}

	public void setQuantityToQuantity(QuantityToQuantityRatio1 quantityToQuantity) {
		this.quantityToQuantity = quantityToQuantity;
	}

	@XmlElement(name = "AmtToAmt", required = true)
	public AmountToAmountRatio1 getAmountToAmount() {
		return amountToAmount;
	}

	public void setAmountToAmount(AmountToAmountRatio1 amountToAmount) {
		this.amountToAmount = amountToAmount;
	}

	@XmlElement(name = "AmtToQty", required = true)
	public AmountAndQuantityRatio1 getAmountToQuantity() {
		return amountToQuantity;
	}

	public void setAmountToQuantity(AmountAndQuantityRatio1 amountToQuantity) {
		this.amountToQuantity = amountToQuantity;
	}

	@XmlElement(name = "QtyToAmt", required = true)
	public AmountAndQuantityRatio1 getQuantityToAmount() {
		return quantityToAmount;
	}

	public void setQuantityToAmount(AmountAndQuantityRatio1 quantityToAmount) {
		this.quantityToAmount = quantityToAmount;
	}

	@XmlElement(name = "NotSpcfdRate", required = true)
	public RateType12FormatChoice getNotSpecifiedRate() {
		return notSpecifiedRate;
	}

	public void setNotSpecifiedRate(com.tools20022.repository.choice.RateType12FormatChoice notSpecifiedRate) {
		this.notSpecifiedRate = notSpecifiedRate;
	}
}