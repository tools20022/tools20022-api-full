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
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.PriceValueType9Code;
import com.tools20022.repository.datatype.RestrictedFINDecimalNumber;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.Price;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountPrice5;
import com.tools20022.repository.msg.AmountPricePerAmount3;
import com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7;
import com.tools20022.repository.msg.PercentagePrice1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
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
 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmPercentagePrice
 * PriceFormat53Choice.mmPercentagePrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmAmountPrice
 * PriceFormat53Choice.mmAmountPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmNotSpecifiedPrice
 * PriceFormat53Choice.mmNotSpecifiedPrice}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmAmountPricePerFinancialInstrumentQuantity
 * PriceFormat53Choice.mmAmountPricePerFinancialInstrumentQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmAmountPricePerAmount
 * PriceFormat53Choice.mmAmountPricePerAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice#mmIndexPoints
 * PriceFormat53Choice.mmIndexPoints}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesPricing
 * SecuritiesPricing}</li>
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
 * "PriceFormat53Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between a percentage price or an amount price or an unspecified price or an amount price per amount or an amount price per financial instrument quantity."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "PriceFormat53Choice", propOrder = {"percentagePrice", "amountPrice", "notSpecifiedPrice", "amountPricePerFinancialInstrumentQuantity", "amountPricePerAmount", "indexPoints"})
public class PriceFormat53Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected PercentagePrice1 percentagePrice;
	/**
	 * Price expressed as a percentage.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice
	 * PriceFormat53Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgPric"</li>
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
	public static final MMMessageAssociationEnd mmPercentagePrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmRate;
			componentContext_lazy = () -> PriceFormat53Choice.mmObject();
			isDerived = false;
			xmlTag = "PctgPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentagePrice";
			definition = "Price expressed as a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PercentagePrice1.mmObject();
		}
	};
	protected AmountPrice5 amountPrice;
	/**
	 * Price expressed as a currency and amount.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice
	 * PriceFormat53Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPric"</li>
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
	public static final MMMessageAssociationEnd mmAmountPrice = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Price.mmAmount;
			componentContext_lazy = () -> PriceFormat53Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPrice";
			definition = "Price expressed as a currency and amount.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPrice5.mmObject();
		}
	};
	protected PriceValueType9Code notSpecifiedPrice;
	/**
	 * Value of the price not specified.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PriceValueType9Code
	 * PriceValueType9Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice
	 * PriceFormat53Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NotSpcfdPric"</li>
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
	public static final MMMessageAttribute mmNotSpecifiedPrice = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> PriceFormat53Choice.mmObject();
			isDerived = false;
			xmlTag = "NotSpcfdPric";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotSpecifiedPrice";
			definition = "Value of the price not specified.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PriceValueType9Code.mmObject();
		}
	};
	protected AmountPricePerFinancialInstrumentQuantity7 amountPricePerFinancialInstrumentQuantity;
	/**
	 * Price expressed as a ratio: amount price per financial instrument
	 * quantity.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmountPricePerFinancialInstrumentQuantity7
	 * AmountPricePerFinancialInstrumentQuantity7}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmAmountPricePerFinancialInstrumentQuantity
	 * SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice
	 * PriceFormat53Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricPerFinInstrmQty"</li>
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
	public static final MMMessageAssociationEnd mmAmountPricePerFinancialInstrumentQuantity = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmAmountPricePerFinancialInstrumentQuantity;
			componentContext_lazy = () -> PriceFormat53Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPricPerFinInstrmQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPricePerFinancialInstrumentQuantity";
			definition = "Price expressed as a ratio: amount price per financial instrument quantity.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPricePerFinancialInstrumentQuantity7.mmObject();
		}
	};
	protected AmountPricePerAmount3 amountPricePerAmount;
	/**
	 * Price expressed as a ratio: amount price per amount
	 * <p>
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
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice
	 * PriceFormat53Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmtPricPerAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmountPricePerAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a ratio: amount price per amount"</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmAmountPricePerAmount = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmAmountPricePerAmount;
			componentContext_lazy = () -> PriceFormat53Choice.mmObject();
			isDerived = false;
			xmlTag = "AmtPricPerAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmountPricePerAmount";
			definition = "Price expressed as a ratio: amount price per amount";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountPricePerAmount3.mmObject();
		}
	};
	protected RestrictedFINDecimalNumber indexPoints;
	/**
	 * Price expressed in index points.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.RestrictedFINDecimalNumber
	 * RestrictedFINDecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexPoints
	 * Index.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PriceFormat53Choice
	 * PriceFormat53Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IndxPts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IndexPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed in index points."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmIndexPoints = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexPoints;
			componentContext_lazy = () -> PriceFormat53Choice.mmObject();
			isDerived = false;
			xmlTag = "IndxPts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IndexPoints";
			definition = "Price expressed in index points.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> RestrictedFINDecimalNumber.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(PriceFormat53Choice.mmPercentagePrice, PriceFormat53Choice.mmAmountPrice, PriceFormat53Choice.mmNotSpecifiedPrice, PriceFormat53Choice.mmAmountPricePerFinancialInstrumentQuantity,
						PriceFormat53Choice.mmAmountPricePerAmount, PriceFormat53Choice.mmIndexPoints);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PriceFormat53Choice";
				definition = "Choice between a percentage price or an amount price or an unspecified price or an amount price per amount or an amount price per financial instrument quantity.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "PctgPric", required = true)
	public PercentagePrice1 getPercentagePrice() {
		return percentagePrice;
	}

	public void setPercentagePrice(PercentagePrice1 percentagePrice) {
		this.percentagePrice = percentagePrice;
	}

	@XmlElement(name = "AmtPric", required = true)
	public AmountPrice5 getAmountPrice() {
		return amountPrice;
	}

	public void setAmountPrice(AmountPrice5 amountPrice) {
		this.amountPrice = amountPrice;
	}

	@XmlElement(name = "NotSpcfdPric", required = true)
	public PriceValueType9Code getNotSpecifiedPrice() {
		return notSpecifiedPrice;
	}

	public void setNotSpecifiedPrice(PriceValueType9Code notSpecifiedPrice) {
		this.notSpecifiedPrice = notSpecifiedPrice;
	}

	@XmlElement(name = "AmtPricPerFinInstrmQty", required = true)
	public AmountPricePerFinancialInstrumentQuantity7 getAmountPricePerFinancialInstrumentQuantity() {
		return amountPricePerFinancialInstrumentQuantity;
	}

	public void setAmountPricePerFinancialInstrumentQuantity(AmountPricePerFinancialInstrumentQuantity7 amountPricePerFinancialInstrumentQuantity) {
		this.amountPricePerFinancialInstrumentQuantity = amountPricePerFinancialInstrumentQuantity;
	}

	@XmlElement(name = "AmtPricPerAmt", required = true)
	public AmountPricePerAmount3 getAmountPricePerAmount() {
		return amountPricePerAmount;
	}

	public void setAmountPricePerAmount(AmountPricePerAmount3 amountPricePerAmount) {
		this.amountPricePerAmount = amountPricePerAmount;
	}

	@XmlElement(name = "IndxPts", required = true)
	public RestrictedFINDecimalNumber getIndexPoints() {
		return indexPoints;
	}

	public void setIndexPoints(RestrictedFINDecimalNumber indexPoints) {
		this.indexPoints = indexPoints;
	}
}