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
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.AmountAndQuantity;
import com.tools20022.repository.entity.AmountRatio;
import com.tools20022.repository.entity.QuantityRatio;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndQuantityRatio2;
import com.tools20022.repository.msg.AmountToAmountRatio2;
import com.tools20022.repository.msg.QuantityToQuantityRatio1;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
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
 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice#mmQuantityToQuantity
 * RatioFormat15Choice.mmQuantityToQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice#mmAmountToAmount
 * RatioFormat15Choice.mmAmountToAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice#mmQuantityToAmount
 * RatioFormat15Choice.mmQuantityToAmount}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = May 5, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RatioFormat15Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice of format to expressed a ratio."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.choice.RatioFormat19Choice
 * RatioFormat19Choice}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.choice.RatioFormat4Choice
 * RatioFormat4Choice}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RatioFormat15Choice", propOrder = {"quantityToQuantity", "amountToAmount", "quantityToAmount"})
public class RatioFormat15Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected QuantityToQuantityRatio1 quantityToQuantity;
	/**
	 * Ratio expressed as a quotient of quantities.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
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
	 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice
	 * RatioFormat15Choice}</li>
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
	 * definition} = "Ratio expressed as a quotient of quantities."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#mmQuantityToQuantity
	 * RatioFormat19Choice.mmQuantityToQuantity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityToQuantity = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> QuantityRatio.mmObject();
			componentContext_lazy = () -> RatioFormat15Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToQuantity";
			definition = "Ratio expressed as a quotient of quantities.";
			nextVersions_lazy = () -> Arrays.asList(RatioFormat19Choice.mmQuantityToQuantity);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> QuantityToQuantityRatio1.mmObject();
		}
	};
	protected AmountToAmountRatio2 amountToAmount;
	/**
	 * Ratio expressed as a quotient of amounts.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountToAmountRatio2
	 * AmountToAmountRatio2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountRatio AmountRatio}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice
	 * RatioFormat15Choice}</li>
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
	 * definition} = "Ratio expressed as a quotient of amounts."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#mmAmountToAmount
	 * RatioFormat19Choice.mmAmountToAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountToAmount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AmountRatio.mmObject();
			componentContext_lazy = () -> RatioFormat15Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountToAmount";
			definition = "Ratio expressed as a quotient of amounts.";
			nextVersions_lazy = () -> Arrays.asList(RatioFormat19Choice.mmAmountToAmount);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountToAmountRatio2.mmObject();
		}
	};
	protected AmountAndQuantityRatio2 quantityToAmount;
	/**
	 * Ratio expressed as a quantity to amount ratio.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountAndQuantityRatio2
	 * AmountAndQuantityRatio2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.AmountAndQuantity
	 * AmountAndQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RatioFormat15Choice
	 * RatioFormat15Choice}</li>
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
	 * definition} = "Ratio expressed as a quantity to amount ratio."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.choice.RatioFormat19Choice#mmQuantityToAmount
	 * RatioFormat19Choice.mmQuantityToAmount}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmQuantityToAmount = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> AmountAndQuantity.mmObject();
			componentContext_lazy = () -> RatioFormat15Choice.mmObject();
			isDerived = false;
			xmlTag = "QtyToAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityToAmount";
			definition = "Ratio expressed as a quantity to amount ratio.";
			nextVersions_lazy = () -> Arrays.asList(RatioFormat19Choice.mmQuantityToAmount);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndQuantityRatio2.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RatioFormat15Choice.mmQuantityToQuantity, RatioFormat15Choice.mmAmountToAmount, RatioFormat15Choice.mmQuantityToAmount);
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("May 5, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "RatioFormat15Choice";
				definition = "Choice of format to expressed a ratio.";
				nextVersions_lazy = () -> Arrays.asList(RatioFormat19Choice.mmObject());
				previousVersion_lazy = () -> RatioFormat4Choice.mmObject();
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
	public AmountToAmountRatio2 getAmountToAmount() {
		return amountToAmount;
	}

	public void setAmountToAmount(AmountToAmountRatio2 amountToAmount) {
		this.amountToAmount = amountToAmount;
	}

	@XmlElement(name = "QtyToAmt", required = true)
	public AmountAndQuantityRatio2 getQuantityToAmount() {
		return quantityToAmount;
	}

	public void setQuantityToAmount(AmountAndQuantityRatio2 quantityToAmount) {
		this.quantityToAmount = quantityToAmount;
	}
}