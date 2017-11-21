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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#mmCurrentReservation
 * CurrentAndDefaultReservation2.mmCurrentReservation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2#mmDefaultReservation
 * CurrentAndDefaultReservation2.mmDefaultReservation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Reservation
 * Reservation}</li>
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
 * "CurrentAndDefaultReservation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports on reservations."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1
 * CurrentAndDefaultReservation1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "CurrentAndDefaultReservation2", propOrder = {"currentReservation", "defaultReservation"})
public class CurrentAndDefaultReservation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected List<com.tools20022.repository.msg.ReservationReport4> currentReservation;
	/**
	 * Report is given for a current reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReservationReport4
	 * ReservationReport4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2
	 * CurrentAndDefaultReservation2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1#mmCurrentReservation
	 * CurrentAndDefaultReservation1.mmCurrentReservation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCurrentReservation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			componentContext_lazy = () -> CurrentAndDefaultReservation2.mmObject();
			isDerived = false;
			xmlTag = "CurRsvatn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CurrentReservation";
			definition = "Report is given for a current reservation.";
			previousVersion_lazy = () -> CurrentAndDefaultReservation1.mmCurrentReservation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReservationReport4.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.ReservationReport4> defaultReservation;
	/**
	 * Report is given for a default reservation.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.ReservationReport4
	 * ReservationReport4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation2
	 * CurrentAndDefaultReservation2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CurrentAndDefaultReservation1#mmDefaultReservation
	 * CurrentAndDefaultReservation1.mmDefaultReservation}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmDefaultReservation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			componentContext_lazy = () -> CurrentAndDefaultReservation2.mmObject();
			isDerived = false;
			xmlTag = "DfltRsvatn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefaultReservation";
			definition = "Report is given for a default reservation.";
			previousVersion_lazy = () -> CurrentAndDefaultReservation1.mmDefaultReservation;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.ReservationReport4.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(CurrentAndDefaultReservation2.mmCurrentReservation, CurrentAndDefaultReservation2.mmDefaultReservation);
				trace_lazy = () -> Reservation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CurrentAndDefaultReservation2";
				definition = "Reports on reservations.";
				previousVersion_lazy = () -> CurrentAndDefaultReservation1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CurRsvatn")
	public List<ReservationReport4> getCurrentReservation() {
		return currentReservation;
	}

	public void setCurrentReservation(List<com.tools20022.repository.msg.ReservationReport4> currentReservation) {
		this.currentReservation = currentReservation;
	}

	@XmlElement(name = "DfltRsvatn")
	public List<ReservationReport4> getDefaultReservation() {
		return defaultReservation;
	}

	public void setDefaultReservation(List<com.tools20022.repository.msg.ReservationReport4> defaultReservation) {
		this.defaultReservation = defaultReservation;
	}
}