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
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
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
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesTransactionPrice2Choice", propOrder = {"monetaryValue", "percentage", "yield", "basisPoints"})
public class SecuritiesTransactionPrice2Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MntryVal", required = true)
	protected AmountAndDirection61 monetaryValue;
	/**
	 * 
	 <p>
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
	public static final MMMessageAssociationEnd<SecuritiesTransactionPrice2Choice, AmountAndDirection61> mmMonetaryValue = new MMMessageAssociationEnd<SecuritiesTransactionPrice2Choice, AmountAndDirection61>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmPrice;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.mmObject();
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

		@Override
		public AmountAndDirection61 getValue(SecuritiesTransactionPrice2Choice obj) {
			return obj.getMonetaryValue();
		}

		@Override
		public void setValue(SecuritiesTransactionPrice2Choice obj, AmountAndDirection61 value) {
			obj.setMonetaryValue(value);
		}
	};
	@XmlElement(name = "Pctg", required = true)
	protected PercentageRate percentage;
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
	public static final MMMessageAttribute<SecuritiesTransactionPrice2Choice, PercentageRate> mmPercentage = new MMMessageAttribute<SecuritiesTransactionPrice2Choice, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> SecuritiesPricing.mmRate;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.mmObject();
			isDerived = false;
			xmlTag = "Pctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Percentage";
			definition = "Price expressed as a rate, that is a percentage.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(SecuritiesTransactionPrice2Choice obj) {
			return obj.getPercentage();
		}

		@Override
		public void setValue(SecuritiesTransactionPrice2Choice obj, PercentageRate value) {
			obj.setPercentage(value);
		}
	};
	@XmlElement(name = "Yld", required = true)
	protected PercentageRate yield;
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
	public static final MMMessageAttribute<SecuritiesTransactionPrice2Choice, PercentageRate> mmYield = new MMMessageAttribute<SecuritiesTransactionPrice2Choice, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> YieldCalculation.mmValue;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.mmObject();
			isDerived = false;
			xmlTag = "Yld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Yield";
			definition = "Price expressed as a yield.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(SecuritiesTransactionPrice2Choice obj) {
			return obj.getYield();
		}

		@Override
		public void setValue(SecuritiesTransactionPrice2Choice obj, PercentageRate value) {
			obj.setYield(value);
		}
	};
	@XmlElement(name = "BsisPts", required = true)
	protected DecimalNumber basisPoints;
	/**
	 * 
	 <p>
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
	public static final MMMessageAttribute<SecuritiesTransactionPrice2Choice, DecimalNumber> mmBasisPoints = new MMMessageAttribute<SecuritiesTransactionPrice2Choice, DecimalNumber>() {
		{
			businessElementTrace_lazy = () -> Index.mmIndexPoints;
			componentContext_lazy = () -> com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.mmObject();
			isDerived = false;
			xmlTag = "BsisPts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BasisPoints";
			definition = "Price expressed as basis points.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public DecimalNumber getValue(SecuritiesTransactionPrice2Choice obj) {
			return obj.getBasisPoints();
		}

		@Override
		public void setValue(SecuritiesTransactionPrice2Choice obj, DecimalNumber value) {
			obj.setBasisPoints(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.mmMonetaryValue, com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.mmPercentage,
						com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.mmYield, com.tools20022.repository.choice.SecuritiesTransactionPrice2Choice.mmBasisPoints);
				trace_lazy = () -> SecuritiesPricing.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesTransactionPrice2Choice";
				definition = "Choice to define the price of the securities transaction.";
			}
		});
		return mmObject_lazy.get();
	}

	public AmountAndDirection61 getMonetaryValue() {
		return monetaryValue;
	}

	public SecuritiesTransactionPrice2Choice setMonetaryValue(AmountAndDirection61 monetaryValue) {
		this.monetaryValue = Objects.requireNonNull(monetaryValue);
		return this;
	}

	public PercentageRate getPercentage() {
		return percentage;
	}

	public SecuritiesTransactionPrice2Choice setPercentage(PercentageRate percentage) {
		this.percentage = Objects.requireNonNull(percentage);
		return this;
	}

	public PercentageRate getYield() {
		return yield;
	}

	public SecuritiesTransactionPrice2Choice setYield(PercentageRate yield) {
		this.yield = Objects.requireNonNull(yield);
		return this;
	}

	public DecimalNumber getBasisPoints() {
		return basisPoints;
	}

	public SecuritiesTransactionPrice2Choice setBasisPoints(DecimalNumber basisPoints) {
		this.basisPoints = Objects.requireNonNull(basisPoints);
		return this;
	}
}