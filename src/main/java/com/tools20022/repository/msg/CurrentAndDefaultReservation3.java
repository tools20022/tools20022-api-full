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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.entity.Reservation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ReservationReport5;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports on reservations.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation3#mmCurrentReservation
 * CurrentAndDefaultReservation3.mmCurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation3#mmDefaultReservation
 * CurrentAndDefaultReservation3.mmDefaultReservation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Reservation
 * Reservation}</li>
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
 * "CurrentAndDefaultReservation3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on reservations."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2
 * CurrentAndDefaultReservation2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CurrentAndDefaultReservation3", propOrder = {"currentReservation", "defaultReservation"})
public class CurrentAndDefaultReservation3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CurRsvatn")
	protected List<ReservationReport5> currentReservation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReservationReport5
	 * ReservationReport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation3
	 * CurrentAndDefaultReservation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CurRsvatn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CurrentReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report is given for a current reservation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#mmCurrentReservation
	 * CurrentAndDefaultReservation2.mmCurrentReservation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrentAndDefaultReservation3, List<ReservationReport5>> mmCurrentReservation = new MMMessageAssociationEnd<CurrentAndDefaultReservation3, List<ReservationReport5>>() {
		{
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrentAndDefaultReservation3.mmObject();
			isDerived = false;
			xmlTag = "CurRsvatn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentReservation";
			definition = "Report is given for a current reservation.";
			previousVersion_lazy = () -> CurrentAndDefaultReservation2.mmCurrentReservation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReservationReport5.mmObject();
		}

		@Override
		public List<ReservationReport5> getValue(CurrentAndDefaultReservation3 obj) {
			return obj.getCurrentReservation();
		}

		@Override
		public void setValue(CurrentAndDefaultReservation3 obj, List<ReservationReport5> value) {
			obj.setCurrentReservation(value);
		}
	};
	@XmlElement(name = "DfltRsvatn")
	protected List<ReservationReport5> defaultReservation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReservationReport5
	 * ReservationReport5}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation3
	 * CurrentAndDefaultReservation3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfltRsvatn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefaultReservation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Report is given for a default reservation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#mmDefaultReservation
	 * CurrentAndDefaultReservation2.mmDefaultReservation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CurrentAndDefaultReservation3, List<ReservationReport5>> mmDefaultReservation = new MMMessageAssociationEnd<CurrentAndDefaultReservation3, List<ReservationReport5>>() {
		{
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.CurrentAndDefaultReservation3.mmObject();
			isDerived = false;
			xmlTag = "DfltRsvatn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultReservation";
			definition = "Report is given for a default reservation.";
			previousVersion_lazy = () -> CurrentAndDefaultReservation2.mmDefaultReservation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> ReservationReport5.mmObject();
		}

		@Override
		public List<ReservationReport5> getValue(CurrentAndDefaultReservation3 obj) {
			return obj.getDefaultReservation();
		}

		@Override
		public void setValue(CurrentAndDefaultReservation3 obj, List<ReservationReport5> value) {
			obj.setDefaultReservation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CurrentAndDefaultReservation3.mmCurrentReservation, com.tools20022.repository.msg.CurrentAndDefaultReservation3.mmDefaultReservation);
				trace_lazy = () -> Reservation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrentAndDefaultReservation3";
				definition = "Reports on reservations.";
				previousVersion_lazy = () -> CurrentAndDefaultReservation2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public List<ReservationReport5> getCurrentReservation() {
		return currentReservation == null ? currentReservation = new ArrayList<>() : currentReservation;
	}

	public CurrentAndDefaultReservation3 setCurrentReservation(List<ReservationReport5> currentReservation) {
		this.currentReservation = Objects.requireNonNull(currentReservation);
		return this;
	}

	public List<ReservationReport5> getDefaultReservation() {
		return defaultReservation == null ? defaultReservation = new ArrayList<>() : defaultReservation;
	}

	public CurrentAndDefaultReservation3 setDefaultReservation(List<ReservationReport5> defaultReservation) {
		this.defaultReservation = Objects.requireNonNull(defaultReservation);
		return this;
	}
}