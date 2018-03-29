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
import com.tools20022.repository.datatype.BaseOneRate;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.entity.PremiumCalculation;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the amount of a premium on a currency option together with its
 * calculation method.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice#mmPercentageOfCallAmount
 * PremiumQuote1Choice.mmPercentageOfCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice#mmPercentageOfPutAmount
 * PremiumQuote1Choice.mmPercentageOfPutAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice#mmPointsOfCallAmount
 * PremiumQuote1Choice.mmPointsOfCallAmount}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice#mmPointsOfPutAmount
 * PremiumQuote1Choice.mmPointsOfPutAmount}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.PremiumCalculation
 * PremiumCalculation}</li>
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
 * "PremiumQuote1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the amount of a premium on a currency option together with its calculation method."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "PremiumQuote1Choice", propOrder = {"percentageOfCallAmount", "percentageOfPutAmount", "pointsOfCallAmount", "pointsOfPutAmount"})
public class PremiumQuote1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "PctgOfCallAmt", required = true)
	protected PercentageRate percentageOfCallAmount;
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
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#mmPercentageOfCallAmount
	 * PremiumCalculation.mmPercentageOfCallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice
	 * PremiumQuote1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgOfCallAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Premium calculation is based on a percentage of the call amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumQuote1Choice, PercentageRate> mmPercentageOfCallAmount = new MMMessageAttribute<PremiumQuote1Choice, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> PremiumCalculation.mmPercentageOfCallAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PremiumQuote1Choice.mmObject();
			isDerived = false;
			xmlTag = "PctgOfCallAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfCallAmount";
			definition = "Premium calculation is based on a percentage of the call amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(PremiumQuote1Choice obj) {
			return obj.getPercentageOfCallAmount();
		}

		@Override
		public void setValue(PremiumQuote1Choice obj, PercentageRate value) {
			obj.setPercentageOfCallAmount(value);
		}
	};
	@XmlElement(name = "PctgOfPutAmt", required = true)
	protected PercentageRate percentageOfPutAmount;
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
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#mmPercentageOfPutAmount
	 * PremiumCalculation.mmPercentageOfPutAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice
	 * PremiumQuote1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PctgOfPutAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PercentageOfPutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Premium calculation is based on a percentage of the put amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumQuote1Choice, PercentageRate> mmPercentageOfPutAmount = new MMMessageAttribute<PremiumQuote1Choice, PercentageRate>() {
		{
			businessElementTrace_lazy = () -> PremiumCalculation.mmPercentageOfPutAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PremiumQuote1Choice.mmObject();
			isDerived = false;
			xmlTag = "PctgOfPutAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PercentageOfPutAmount";
			definition = "Premium calculation is based on a percentage of the put amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}

		@Override
		public PercentageRate getValue(PremiumQuote1Choice obj) {
			return obj.getPercentageOfPutAmount();
		}

		@Override
		public void setValue(PremiumQuote1Choice obj, PercentageRate value) {
			obj.setPercentageOfPutAmount(value);
		}
	};
	@XmlElement(name = "PtsOfCallAmt", required = true)
	protected BaseOneRate pointsOfCallAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#mmPointsOfCallAmount
	 * PremiumCalculation.mmPointsOfCallAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice
	 * PremiumQuote1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtsOfCallAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointsOfCallAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Premium calculation is based on points of the call amount."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumQuote1Choice, BaseOneRate> mmPointsOfCallAmount = new MMMessageAttribute<PremiumQuote1Choice, BaseOneRate>() {
		{
			businessElementTrace_lazy = () -> PremiumCalculation.mmPointsOfCallAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PremiumQuote1Choice.mmObject();
			isDerived = false;
			xmlTag = "PtsOfCallAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointsOfCallAmount";
			definition = "Premium calculation is based on points of the call amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(PremiumQuote1Choice obj) {
			return obj.getPointsOfCallAmount();
		}

		@Override
		public void setValue(PremiumQuote1Choice obj, BaseOneRate value) {
			obj.setPointsOfCallAmount(value);
		}
	};
	@XmlElement(name = "PtsOfPutAmt", required = true)
	protected BaseOneRate pointsOfPutAmount;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.BaseOneRate
	 * BaseOneRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PremiumCalculation#mmPointsOfPutAmount
	 * PremiumCalculation.mmPointsOfPutAmount}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.PremiumQuote1Choice
	 * PremiumQuote1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PtsOfPutAmt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PointsOfPutAmount"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Premium calculation is based on points of the put amount."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<PremiumQuote1Choice, BaseOneRate> mmPointsOfPutAmount = new MMMessageAttribute<PremiumQuote1Choice, BaseOneRate>() {
		{
			businessElementTrace_lazy = () -> PremiumCalculation.mmPointsOfPutAmount;
			componentContext_lazy = () -> com.tools20022.repository.choice.PremiumQuote1Choice.mmObject();
			isDerived = false;
			xmlTag = "PtsOfPutAmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PointsOfPutAmount";
			definition = "Premium calculation is based on points of the put amount.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> BaseOneRate.mmObject();
		}

		@Override
		public BaseOneRate getValue(PremiumQuote1Choice obj) {
			return obj.getPointsOfPutAmount();
		}

		@Override
		public void setValue(PremiumQuote1Choice obj, BaseOneRate value) {
			obj.setPointsOfPutAmount(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.PremiumQuote1Choice.mmPercentageOfCallAmount, com.tools20022.repository.choice.PremiumQuote1Choice.mmPercentageOfPutAmount,
						com.tools20022.repository.choice.PremiumQuote1Choice.mmPointsOfCallAmount, com.tools20022.repository.choice.PremiumQuote1Choice.mmPointsOfPutAmount);
				trace_lazy = () -> PremiumCalculation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "PremiumQuote1Choice";
				definition = "Specifies the amount of a premium on a currency option together with its calculation method.";
			}
		});
		return mmObject_lazy.get();
	}

	public PercentageRate getPercentageOfCallAmount() {
		return percentageOfCallAmount;
	}

	public PremiumQuote1Choice setPercentageOfCallAmount(PercentageRate percentageOfCallAmount) {
		this.percentageOfCallAmount = Objects.requireNonNull(percentageOfCallAmount);
		return this;
	}

	public PercentageRate getPercentageOfPutAmount() {
		return percentageOfPutAmount;
	}

	public PremiumQuote1Choice setPercentageOfPutAmount(PercentageRate percentageOfPutAmount) {
		this.percentageOfPutAmount = Objects.requireNonNull(percentageOfPutAmount);
		return this;
	}

	public BaseOneRate getPointsOfCallAmount() {
		return pointsOfCallAmount;
	}

	public PremiumQuote1Choice setPointsOfCallAmount(BaseOneRate pointsOfCallAmount) {
		this.pointsOfCallAmount = Objects.requireNonNull(pointsOfCallAmount);
		return this;
	}

	public BaseOneRate getPointsOfPutAmount() {
		return pointsOfPutAmount;
	}

	public PremiumQuote1Choice setPointsOfPutAmount(BaseOneRate pointsOfPutAmount) {
		this.pointsOfPutAmount = Objects.requireNonNull(pointsOfPutAmount);
		return this;
	}
}