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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.choice.BookingUnit1Choice;
import com.tools20022.repository.codeset.BookingType1Code;
import com.tools20022.repository.codeset.DayBookingInstruction1Code;
import com.tools20022.repository.codeset.PreAllocationMethod1Code;
import com.tools20022.repository.entity.SecuritiesPostTradeBooking;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information used to book the executions of a trade.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Booking1#mmDayBooking
 * Booking1.mmDayBooking}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Booking1#mmBookingUnit
 * Booking1.mmBookingUnit}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Booking1#mmPreAllocationMethod
 * Booking1.mmPreAllocationMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Booking1#mmBookingType
 * Booking1.mmBookingType}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking
 * SecuritiesPostTradeBooking}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Booking1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information used to book the executions of a trade."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "Booking1", propOrder = {"dayBooking", "bookingUnit", "preAllocationMethod", "bookingType"})
public class Booking1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected DayBookingInstruction1Code dayBooking;
	/**
	 * Indicates whether or not automatic booking can occur.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DayBookingInstruction1Code
	 * DayBookingInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmDayBooking
	 * SecuritiesPostTradeBooking.mmDayBooking}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Booking1
	 * Booking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DayBookg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DayBooking"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether or not automatic booking can occur."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDayBooking = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPostTradeBooking.mmDayBooking;
			componentContext_lazy = () -> Booking1.mmObject();
			isDerived = false;
			xmlTag = "DayBookg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DayBooking";
			definition = "Indicates whether or not automatic booking can occur.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> DayBookingInstruction1Code.mmObject();
		}
	};
	protected BookingUnit1Choice bookingUnit;
	/**
	 * Indicates what constitutes a bookable unit, ie, a partial execution, or
	 * an aggregated execution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.BookingUnit1Choice
	 * BookingUnit1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmBookingUnit
	 * SecuritiesPostTradeBooking.mmBookingUnit}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Booking1
	 * Booking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingUnit"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates what constitutes a bookable unit, ie, a partial execution, or an aggregated execution."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBookingUnit = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPostTradeBooking.mmBookingUnit;
			componentContext_lazy = () -> Booking1.mmObject();
			isDerived = false;
			xmlTag = "BookgUnit";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingUnit";
			definition = "Indicates what constitutes a bookable unit, ie, a partial execution, or an aggregated execution.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> BookingUnit1Choice.mmObject();
		}
	};
	protected PreAllocationMethod1Code preAllocationMethod;
	/**
	 * Indicates the method of preallocation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.PreAllocationMethod1Code
	 * PreAllocationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmPreAllocationMethod
	 * SecuritiesPostTradeBooking.mmPreAllocationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Booking1
	 * Booking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PreAllcnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreAllocationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the method of preallocation."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmPreAllocationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPostTradeBooking.mmPreAllocationMethod;
			componentContext_lazy = () -> Booking1.mmObject();
			isDerived = false;
			xmlTag = "PreAllcnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreAllocationMethod";
			definition = "Indicates the method of preallocation.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PreAllocationMethod1Code.mmObject();
		}
	};
	protected BookingType1Code bookingType;
	/**
	 * Method for booking out an order.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.BookingType1Code
	 * BookingType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesPostTradeBooking#mmBookingType
	 * SecuritiesPostTradeBooking.mmBookingType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Booking1
	 * Booking1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "BookgTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "BookingType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method for booking out an order."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmBookingType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> SecuritiesPostTradeBooking.mmBookingType;
			componentContext_lazy = () -> Booking1.mmObject();
			isDerived = false;
			xmlTag = "BookgTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "BookingType";
			definition = "Method for booking out an order.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> BookingType1Code.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Booking1.mmDayBooking, Booking1.mmBookingUnit, Booking1.mmPreAllocationMethod, Booking1.mmBookingType);
				trace_lazy = () -> SecuritiesPostTradeBooking.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Booking1";
				definition = "Information used to book the executions of a trade.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "DayBookg")
	public DayBookingInstruction1Code getDayBooking() {
		return dayBooking;
	}

	public void setDayBooking(DayBookingInstruction1Code dayBooking) {
		this.dayBooking = dayBooking;
	}

	@XmlElement(name = "BookgUnit")
	public BookingUnit1Choice getBookingUnit() {
		return bookingUnit;
	}

	public void setBookingUnit(BookingUnit1Choice bookingUnit) {
		this.bookingUnit = bookingUnit;
	}

	@XmlElement(name = "PreAllcnMtd")
	public PreAllocationMethod1Code getPreAllocationMethod() {
		return preAllocationMethod;
	}

	public void setPreAllocationMethod(PreAllocationMethod1Code preAllocationMethod) {
		this.preAllocationMethod = preAllocationMethod;
	}

	@XmlElement(name = "BookgTp")
	public BookingType1Code getBookingType() {
		return bookingType;
	}

	public void setBookingType(BookingType1Code bookingType) {
		this.bookingType = bookingType;
	}
}