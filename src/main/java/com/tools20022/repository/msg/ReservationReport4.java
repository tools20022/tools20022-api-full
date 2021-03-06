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
import com.tools20022.repository.choice.ReservationOrError5Choice;
import com.tools20022.repository.entity.Reservation;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.ReservationIdentification1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reports either on the reservation or on a business error.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport4#mmReservationIdentification
 * ReservationReport4.mmReservationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReservationReport4#mmReservationOrError
 * ReservationReport4.mmReservationOrError}</li>
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
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReservationReport4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reports either on the reservation or on a business error."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.ReservationReport5
 * ReservationReport5}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReservationReport3
 * ReservationReport3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReservationReport4", propOrder = {"reservationIdentification", "reservationOrError"})
public class ReservationReport4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RsvatnId", required = true)
	protected ReservationIdentification1 reservationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.ReservationIdentification1
	 * ReservationIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Reservation Reservation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReservationReport4
	 * ReservationReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsvatnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identification of the reservation on which information is requested."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationReport5#mmReservationIdentification
	 * ReservationReport5.mmReservationIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReservationReport3#mmReservationIdentification
	 * ReservationReport3.mmReservationIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReservationReport4, ReservationIdentification1> mmReservationIdentification = new MMMessageAssociationEnd<ReservationReport4, ReservationIdentification1>() {
		{
			businessComponentTrace_lazy = () -> Reservation.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.ReservationReport4.mmObject();
			isDerived = false;
			xmlTag = "RsvatnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReservationIdentification";
			definition = "Identification of the reservation on which information is requested.";
			nextVersions_lazy = () -> Arrays.asList(ReservationReport5.mmReservationIdentification);
			previousVersion_lazy = () -> ReservationReport3.mmReservationIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReservationIdentification1.mmObject();
		}

		@Override
		public ReservationIdentification1 getValue(ReservationReport4 obj) {
			return obj.getReservationIdentification();
		}

		@Override
		public void setValue(ReservationReport4 obj, ReservationIdentification1 value) {
			obj.setReservationIdentification(value);
		}
	};
	@XmlElement(name = "RsvatnOrErr", required = true)
	protected ReservationOrError5Choice reservationOrError;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.ReservationOrError5Choice
	 * ReservationOrError5Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReservationReport4
	 * ReservationReport4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsvatnOrErr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReservationOrError"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Requested information on the limit."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.ReservationReport5#mmReservationOrError
	 * ReservationReport5.mmReservationOrError}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReservationReport3#mmReservationOrError
	 * ReservationReport3.mmReservationOrError}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReservationReport4, ReservationOrError5Choice> mmReservationOrError = new MMMessageAssociationEnd<ReservationReport4, ReservationOrError5Choice>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.ReservationReport4.mmObject();
			isDerived = false;
			xmlTag = "RsvatnOrErr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReservationOrError";
			definition = "Requested information on the limit.";
			nextVersions_lazy = () -> Arrays.asList(ReservationReport5.mmReservationOrError);
			previousVersion_lazy = () -> ReservationReport3.mmReservationOrError;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> ReservationOrError5Choice.mmObject();
		}

		@Override
		public ReservationOrError5Choice getValue(ReservationReport4 obj) {
			return obj.getReservationOrError();
		}

		@Override
		public void setValue(ReservationReport4 obj, ReservationOrError5Choice value) {
			obj.setReservationOrError(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReservationReport4.mmReservationIdentification, com.tools20022.repository.msg.ReservationReport4.mmReservationOrError);
				trace_lazy = () -> Reservation.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReservationReport4";
				definition = "Reports either on the reservation or on a business error.";
				nextVersions_lazy = () -> Arrays.asList(ReservationReport5.mmObject());
				previousVersion_lazy = () -> ReservationReport3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public ReservationIdentification1 getReservationIdentification() {
		return reservationIdentification;
	}

	public ReservationReport4 setReservationIdentification(ReservationIdentification1 reservationIdentification) {
		this.reservationIdentification = Objects.requireNonNull(reservationIdentification);
		return this;
	}

	public ReservationOrError5Choice getReservationOrError() {
		return reservationOrError;
	}

	public ReservationReport4 setReservationOrError(ReservationOrError5Choice reservationOrError) {
		this.reservationOrError = Objects.requireNonNull(reservationOrError);
		return this;
	}
}