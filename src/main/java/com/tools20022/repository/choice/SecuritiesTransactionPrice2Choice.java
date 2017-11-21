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
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.Index;
import com.tools20022.repository.entity.SecuritiesPricing;
import com.tools20022.repository.entity.YieldCalculation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmountAndDirection61;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice to define the price of the securities transaction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmMonetaryValue
 * SecuritiesTransactionPrice2Choice.mmMonetaryValue}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmPercentage
 * SecuritiesTransactionPrice2Choice.mmPercentage}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmYield
 * SecuritiesTransactionPrice2Choice.mmYield}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice#mmBasisPoints
 * SecuritiesTransactionPrice2Choice.mmBasisPoints}</li>
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
 * "SecuritiesTransactionPrice2Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Choice to define the price of the securities transaction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "SecuritiesTransactionPrice2Choice", propOrder = {"monetaryValue", "percentage", "yield", "basisPoints"})
public class SecuritiesTransactionPrice2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	protected AmountAndDirection61 monetaryValue;
	/**
	 * Price expressed as a monetary value.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AmountAndDirection61
	 * AmountAndDirection61}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmPrice
	 * SecuritiesPricing.mmPrice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice
	 * SecuritiesTransactionPrice2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MntryVal"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MonetaryValue"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a monetary value."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMonetaryValue = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> SecuritiesTransactionPrice2Choice.mmObject();
			isDerived = false;
			xmlTag = "MntryVal";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MonetaryValue";
			definition = "Price expressed as a monetary value.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmountAndDirection61.mmObject();
		}
	};
	protected PercentageRate percentage;
	/**
	 * Price expressed as a rate, that is a percentage.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPricing#mmRate
	 * SecuritiesPricing.mmRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice
	 * SecuritiesTransactionPrice2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Pctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Percentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a rate, that is a percentage."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmRate;
			componentContext_lazy = () -> SecuritiesTransactionPrice2Choice.mmObject();
			isDerived = false;
			xmlTag = "Pctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			definition = "Price expressed as a rate, that is a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected PercentageRate yield;
	/**
	 * Price expressed as a yield.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.entity.YieldCalculation#mmValue
	 * YieldCalculation.mmValue}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice
	 * SecuritiesTransactionPrice2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Yld"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Yield"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as a yield."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmYield = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValue;
			componentContext_lazy = () -> SecuritiesTransactionPrice2Choice.mmObject();
			isDerived = false;
			xmlTag = "Yld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yield";
			definition = "Price expressed as a yield.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	protected DecimalNumber basisPoints;
	/**
	 * Price expressed as basis points.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.DecimalNumber
	 * DecimalNumber}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Index#mmIndexPoints
	 * Index.mmIndexPoints}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice
	 * SecuritiesTransactionPrice2Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BsisPts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BasisPoints"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Price expressed as basis points."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBasisPoints = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexPoints;
			componentContext_lazy = () -> SecuritiesTransactionPrice2Choice.mmObject();
			isDerived = false;
			xmlTag = "BsisPts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisPoints";
			definition = "Price expressed as basis points.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(SecuritiesTransactionPrice2Choice.mmMonetaryValue, SecuritiesTransactionPrice2Choice.mmPercentage, SecuritiesTransactionPrice2Choice.mmYield,
						SecuritiesTransactionPrice2Choice.mmBasisPoints);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionPrice2Choice";
				definition = "Choice to define the price of the securities transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MntryVal", required = true)
	public AmountAndDirection61 getMonetaryValue() {
		return monetaryValue;
	}

	public void setMonetaryValue(AmountAndDirection61 monetaryValue) {
		this.monetaryValue = monetaryValue;
	}

	@XmlElement(name = "Pctg", required = true)
	public PercentageRate getPercentage() {
		return percentage;
	}

	public void setPercentage(PercentageRate percentage) {
		this.percentage = percentage;
	}

	@XmlElement(name = "Yld", required = true)
	public PercentageRate getYield() {
		return yield;
	}

	public void setYield(PercentageRate yield) {
		this.yield = yield;
	}

	@XmlElement(name = "BsisPts", required = true)
	public DecimalNumber getBasisPoints() {
		return basisPoints;
	}

	public void setBasisPoints(DecimalNumber basisPoints) {
		this.basisPoints = basisPoints;
	}
}