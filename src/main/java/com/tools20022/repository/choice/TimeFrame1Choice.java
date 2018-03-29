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
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.TimeFrame;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Choice between TimeFrame elements that define a period as number of days
 * before or after a activity.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice#mmTradePlus
 * TimeFrame1Choice.mmTradePlus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice#mmTradeMinus
 * TimeFrame1Choice.mmTradeMinus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice#mmRenunciationPlus
 * TimeFrame1Choice.mmRenunciationPlus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice#mmRenunciationMinus
 * TimeFrame1Choice.mmRenunciationMinus}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.TimeFrame TimeFrame}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "TimeFrame1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Choice between TimeFrame elements that define a period as number of days before or after a activity."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "TimeFrame1Choice", propOrder = {"tradePlus", "tradeMinus", "renunciationPlus", "renunciationMinus"})
public class TimeFrame1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "TPlus", required = true)
	protected Number tradePlus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmTradePlus
	 * TimeFrame.mmTradePlus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice
	 * TimeFrame1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradePlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \n\nWhere = T is the date that the price is applied to a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TimeFrame1Choice, Number> mmTradePlus = new MMMessageAttribute<TimeFrame1Choice, Number>() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmTradePlus;
			componentContext_lazy = () -> com.tools20022.repository.choice.TimeFrame1Choice.mmObject();
			isDerived = false;
			xmlTag = "TPlus";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradePlus";
			definition = "An agreed number of days after the Trade date (T) used to define standard timeframes e.g T+3 settlement period. \n\nWhere = T is the date that the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TimeFrame1Choice obj) {
			return obj.getTradePlus();
		}

		@Override
		public void setValue(TimeFrame1Choice obj, Number value) {
			obj.setTradePlus(value);
		}
	};
	@XmlElement(name = "TMns", required = true)
	protected Number tradeMinus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmTradeMinus
	 * TimeFrame.mmTradeMinus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice
	 * TimeFrame1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TMns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TradeMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\n\nWhere = T is the date that the price is applied to a transaction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TimeFrame1Choice, Number> mmTradeMinus = new MMMessageAttribute<TimeFrame1Choice, Number>() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmTradeMinus;
			componentContext_lazy = () -> com.tools20022.repository.choice.TimeFrame1Choice.mmObject();
			isDerived = false;
			xmlTag = "TMns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TradeMinus";
			definition = "An agreed number of days before the Trade date (T) used to define standard timeframes e.g. T-1 Dealing cut off or T-2 prepayment condition\n\nWhere = T is the date that the price is applied to a transaction.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TimeFrame1Choice obj) {
			return obj.getTradeMinus();
		}

		@Override
		public void setValue(TimeFrame1Choice obj, Number value) {
			obj.setTradeMinus(value);
		}
	};
	@XmlElement(name = "RPlus", required = true)
	protected Number renunciationPlus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRenunciationPlus
	 * TimeFrame.mmRenunciationPlus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice
	 * TimeFrame1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenunciationPlus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TimeFrame1Choice, Number> mmRenunciationPlus = new MMMessageAttribute<TimeFrame1Choice, Number>() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmRenunciationPlus;
			componentContext_lazy = () -> com.tools20022.repository.choice.TimeFrame1Choice.mmObject();
			isDerived = false;
			xmlTag = "RPlus";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenunciationPlus";
			definition = "An agreed number of days after the renunciation of title documents are received used to define standard timeframes in Redemption e.g R+3 Redemption settlement cycle.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TimeFrame1Choice obj) {
			return obj.getRenunciationPlus();
		}

		@Override
		public void setValue(TimeFrame1Choice obj, Number value) {
			obj.setRenunciationPlus(value);
		}
	};
	@XmlElement(name = "RMns", required = true)
	protected Number renunciationMinus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.TimeFrame#mmRenunciationMinus
	 * TimeFrame.mmRenunciationMinus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.TimeFrame1Choice
	 * TimeFrame1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RMns"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RenunciationMinus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<TimeFrame1Choice, Number> mmRenunciationMinus = new MMMessageAttribute<TimeFrame1Choice, Number>() {
		{
			businessElementTrace_lazy = () -> TimeFrame.mmRenunciationMinus;
			componentContext_lazy = () -> com.tools20022.repository.choice.TimeFrame1Choice.mmObject();
			isDerived = false;
			xmlTag = "RMns";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RenunciationMinus";
			definition = "An agreed number of days before the Renunciation of Title documents are received used to define standard timeframes in redemption.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Number getValue(TimeFrame1Choice obj) {
			return obj.getRenunciationMinus();
		}

		@Override
		public void setValue(TimeFrame1Choice obj, Number value) {
			obj.setRenunciationMinus(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.TimeFrame1Choice.mmTradePlus, com.tools20022.repository.choice.TimeFrame1Choice.mmTradeMinus,
						com.tools20022.repository.choice.TimeFrame1Choice.mmRenunciationPlus, com.tools20022.repository.choice.TimeFrame1Choice.mmRenunciationMinus);
				trace_lazy = () -> TimeFrame.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "TimeFrame1Choice";
				definition = "Choice between TimeFrame elements that define a period as number of days before or after a activity.";
			}
		});
		return mmObject_lazy.get();
	}

	public Number getTradePlus() {
		return tradePlus;
	}

	public TimeFrame1Choice setTradePlus(Number tradePlus) {
		this.tradePlus = Objects.requireNonNull(tradePlus);
		return this;
	}

	public Number getTradeMinus() {
		return tradeMinus;
	}

	public TimeFrame1Choice setTradeMinus(Number tradeMinus) {
		this.tradeMinus = Objects.requireNonNull(tradeMinus);
		return this;
	}

	public Number getRenunciationPlus() {
		return renunciationPlus;
	}

	public TimeFrame1Choice setRenunciationPlus(Number renunciationPlus) {
		this.renunciationPlus = Objects.requireNonNull(renunciationPlus);
		return this;
	}

	public Number getRenunciationMinus() {
		return renunciationMinus;
	}

	public TimeFrame1Choice setRenunciationMinus(Number renunciationMinus) {
		this.renunciationMinus = Objects.requireNonNull(renunciationMinus);
		return this;
	}
}