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

import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.EnergyQuantityUnit1Choice;
import com.tools20022.repository.choice.Quantity41Choice;
import com.tools20022.repository.codeset.DurationType1Code;
import com.tools20022.repository.codeset.WeekDay1Code;
import com.tools20022.repository.datatype.DecimalNumber;
import com.tools20022.repository.datatype.ISOTime;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Period10;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information related to energy derivatives attributes.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3#mmDeliveryInterval
 * EnergyDeliveryAttribute3.mmDeliveryInterval}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3#mmDeliveryPeriod
 * EnergyDeliveryAttribute3.mmDeliveryPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3#mmDuration
 * EnergyDeliveryAttribute3.mmDuration}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3#mmWeekDay
 * EnergyDeliveryAttribute3.mmWeekDay}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3#mmDeliveryCapacity
 * EnergyDeliveryAttribute3.mmDeliveryCapacity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3#mmQuantityUnit
 * EnergyDeliveryAttribute3.mmQuantityUnit}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3#mmPriceTimeIntervalQuantity
 * EnergyDeliveryAttribute3.mmPriceTimeIntervalQuantity}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "EnergyDeliveryAttribute3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information related to energy derivatives attributes."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "EnergyDeliveryAttribute3", propOrder = {"deliveryInterval", "deliveryPeriod", "duration", "weekDay", "deliveryCapacity", "quantityUnit", "priceTimeIntervalQuantity"})
public class EnergyDeliveryAttribute3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DlvryIntrvl")
	protected ISOTime deliveryInterval;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISOTime
	 * ISOTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3
	 * EnergyDeliveryAttribute3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryIntrvl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryInterval"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Time interval for each block or shape."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnergyDeliveryAttribute3, Optional<ISOTime>> mmDeliveryInterval = new MMMessageAttribute<EnergyDeliveryAttribute3, Optional<ISOTime>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmObject();
			isDerived = false;
			xmlTag = "DlvryIntrvl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryInterval";
			definition = "Time interval for each block or shape.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ISOTime.mmObject();
		}

		@Override
		public Optional<ISOTime> getValue(EnergyDeliveryAttribute3 obj) {
			return obj.getDeliveryInterval();
		}

		@Override
		public void setValue(EnergyDeliveryAttribute3 obj, Optional<ISOTime> value) {
			obj.setDeliveryInterval(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryPrd")
	protected Period10 deliveryPeriod;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Period10 Period10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3
	 * EnergyDeliveryAttribute3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Definition of delivery start datetime and end datetime."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnergyDeliveryAttribute3, Optional<Period10>> mmDeliveryPeriod = new MMMessageAssociationEnd<EnergyDeliveryAttribute3, Optional<Period10>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmObject();
			isDerived = false;
			xmlTag = "DlvryPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryPeriod";
			definition = "Definition of delivery start datetime and end datetime.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Period10.mmObject();
		}

		@Override
		public Optional<Period10> getValue(EnergyDeliveryAttribute3 obj) {
			return obj.getDeliveryPeriod();
		}

		@Override
		public void setValue(EnergyDeliveryAttribute3 obj, Optional<Period10> value) {
			obj.setDeliveryPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "Drtn")
	protected DurationType1Code duration;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DurationType1Code
	 * DurationType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3
	 * EnergyDeliveryAttribute3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Drtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Duration"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "The duration of the delivery period."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnergyDeliveryAttribute3, Optional<DurationType1Code>> mmDuration = new MMMessageAttribute<EnergyDeliveryAttribute3, Optional<DurationType1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmObject();
			isDerived = false;
			xmlTag = "Drtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Duration";
			definition = "The duration of the delivery period.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DurationType1Code.mmObject();
		}

		@Override
		public Optional<DurationType1Code> getValue(EnergyDeliveryAttribute3 obj) {
			return obj.getDuration();
		}

		@Override
		public void setValue(EnergyDeliveryAttribute3 obj, Optional<DurationType1Code> value) {
			obj.setDuration(value.orElse(null));
		}
	};
	@XmlElement(name = "WkDay")
	protected WeekDay1Code weekDay;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.WeekDay1Code
	 * WeekDay1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3
	 * EnergyDeliveryAttribute3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "WkDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "WeekDay"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Days of the week of the delivery."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnergyDeliveryAttribute3, Optional<WeekDay1Code>> mmWeekDay = new MMMessageAttribute<EnergyDeliveryAttribute3, Optional<WeekDay1Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmObject();
			isDerived = false;
			xmlTag = "WkDay";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "WeekDay";
			definition = "Days of the week of the delivery.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> WeekDay1Code.mmObject();
		}

		@Override
		public Optional<WeekDay1Code> getValue(EnergyDeliveryAttribute3 obj) {
			return obj.getWeekDay();
		}

		@Override
		public void setValue(EnergyDeliveryAttribute3 obj, Optional<WeekDay1Code> value) {
			obj.setWeekDay(value.orElse(null));
		}
	};
	@XmlElement(name = "DlvryCpcty")
	protected Quantity41Choice deliveryCapacity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.Quantity41Choice
	 * Quantity41Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3
	 * EnergyDeliveryAttribute3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryCpcty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryCapacity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Delivery capacity for each delivery interval specified."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnergyDeliveryAttribute3, Optional<Quantity41Choice>> mmDeliveryCapacity = new MMMessageAssociationEnd<EnergyDeliveryAttribute3, Optional<Quantity41Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmObject();
			isDerived = false;
			xmlTag = "DlvryCpcty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryCapacity";
			definition = "Delivery capacity for each delivery interval specified.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> Quantity41Choice.mmObject();
		}

		@Override
		public Optional<Quantity41Choice> getValue(EnergyDeliveryAttribute3 obj) {
			return obj.getDeliveryCapacity();
		}

		@Override
		public void setValue(EnergyDeliveryAttribute3 obj, Optional<Quantity41Choice> value) {
			obj.setDeliveryCapacity(value.orElse(null));
		}
	};
	@XmlElement(name = "QtyUnit")
	protected EnergyQuantityUnit1Choice quantityUnit;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.EnergyQuantityUnit1Choice
	 * EnergyQuantityUnit1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3
	 * EnergyDeliveryAttribute3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QtyUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuantityUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Daily or hourly quantity in MWh or kWh/d which corresponds to the underlying commodity."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<EnergyDeliveryAttribute3, Optional<EnergyQuantityUnit1Choice>> mmQuantityUnit = new MMMessageAssociationEnd<EnergyDeliveryAttribute3, Optional<EnergyQuantityUnit1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmObject();
			isDerived = false;
			xmlTag = "QtyUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuantityUnit";
			definition = "Daily or hourly quantity in MWh or kWh/d which corresponds to the underlying commodity.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> EnergyQuantityUnit1Choice.mmObject();
		}

		@Override
		public Optional<EnergyQuantityUnit1Choice> getValue(EnergyDeliveryAttribute3 obj) {
			return obj.getQuantityUnit();
		}

		@Override
		public void setValue(EnergyDeliveryAttribute3 obj, Optional<EnergyQuantityUnit1Choice> value) {
			obj.setQuantityUnit(value.orElse(null));
		}
	};
	@XmlElement(name = "PricTmIntrvlQty")
	protected DecimalNumber priceTimeIntervalQuantity;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.EnergyDeliveryAttribute3
	 * EnergyDeliveryAttribute3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PricTmIntrvlQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PriceTimeIntervalQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if applicable the price per quantity per delivery time interval."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<EnergyDeliveryAttribute3, Optional<DecimalNumber>> mmPriceTimeIntervalQuantity = new MMMessageAttribute<EnergyDeliveryAttribute3, Optional<DecimalNumber>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmObject();
			isDerived = false;
			xmlTag = "PricTmIntrvlQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PriceTimeIntervalQuantity";
			definition = "Indicates if applicable the price per quantity per delivery time interval.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DecimalNumber.mmObject();
		}

		@Override
		public Optional<DecimalNumber> getValue(EnergyDeliveryAttribute3 obj) {
			return obj.getPriceTimeIntervalQuantity();
		}

		@Override
		public void setValue(EnergyDeliveryAttribute3 obj, Optional<DecimalNumber> value) {
			obj.setPriceTimeIntervalQuantity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmDeliveryInterval, com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmDeliveryPeriod,
						com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmDuration, com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmWeekDay, com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmDeliveryCapacity,
						com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmQuantityUnit, com.tools20022.repository.msg.EnergyDeliveryAttribute3.mmPriceTimeIntervalQuantity);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "EnergyDeliveryAttribute3";
				definition = "Information related to energy derivatives attributes.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<ISOTime> getDeliveryInterval() {
		return deliveryInterval == null ? Optional.empty() : Optional.of(deliveryInterval);
	}

	public EnergyDeliveryAttribute3 setDeliveryInterval(ISOTime deliveryInterval) {
		this.deliveryInterval = deliveryInterval;
		return this;
	}

	public Optional<Period10> getDeliveryPeriod() {
		return deliveryPeriod == null ? Optional.empty() : Optional.of(deliveryPeriod);
	}

	public EnergyDeliveryAttribute3 setDeliveryPeriod(Period10 deliveryPeriod) {
		this.deliveryPeriod = deliveryPeriod;
		return this;
	}

	public Optional<DurationType1Code> getDuration() {
		return duration == null ? Optional.empty() : Optional.of(duration);
	}

	public EnergyDeliveryAttribute3 setDuration(DurationType1Code duration) {
		this.duration = duration;
		return this;
	}

	public Optional<WeekDay1Code> getWeekDay() {
		return weekDay == null ? Optional.empty() : Optional.of(weekDay);
	}

	public EnergyDeliveryAttribute3 setWeekDay(WeekDay1Code weekDay) {
		this.weekDay = weekDay;
		return this;
	}

	public Optional<Quantity41Choice> getDeliveryCapacity() {
		return deliveryCapacity == null ? Optional.empty() : Optional.of(deliveryCapacity);
	}

	public EnergyDeliveryAttribute3 setDeliveryCapacity(Quantity41Choice deliveryCapacity) {
		this.deliveryCapacity = deliveryCapacity;
		return this;
	}

	public Optional<EnergyQuantityUnit1Choice> getQuantityUnit() {
		return quantityUnit == null ? Optional.empty() : Optional.of(quantityUnit);
	}

	public EnergyDeliveryAttribute3 setQuantityUnit(EnergyQuantityUnit1Choice quantityUnit) {
		this.quantityUnit = quantityUnit;
		return this;
	}

	public Optional<DecimalNumber> getPriceTimeIntervalQuantity() {
		return priceTimeIntervalQuantity == null ? Optional.empty() : Optional.of(priceTimeIntervalQuantity);
	}

	public EnergyDeliveryAttribute3 setPriceTimeIntervalQuantity(DecimalNumber priceTimeIntervalQuantity) {
		this.priceTimeIntervalQuantity = priceTimeIntervalQuantity;
		return this;
	}
}