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
import com.tools20022.repository.codeset.DeliveryPlace1Code;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.entity.AttendanceCard;
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies details related to the attendance card.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AttendanceCard2#mmAttendanceCardLabelling
 * AttendanceCard2.mmAttendanceCardLabelling}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AttendanceCard2#mmDeliveryMethod
 * AttendanceCard2.mmDeliveryMethod}</li>
 * <li>{@linkplain com.tools20022.repository.msg.AttendanceCard2#mmOtherAddress
 * AttendanceCard2.mmOtherAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.AttendanceCard
 * AttendanceCard}</li>
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
 * "AttendanceCard2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies details related to the attendance card."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "AttendanceCard2", propOrder = {"attendanceCardLabelling", "deliveryMethod", "otherAddress"})
public class AttendanceCard2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max105Text attendanceCardLabelling;
	/**
	 * Information to be indicated on the attendance card.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmAttendanceCardLabelling
	 * AttendanceCard.mmAttendanceCardLabelling}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AttendanceCard2
	 * AttendanceCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AttndncCardLbllg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AttendanceCardLabelling"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information to be indicated on the attendance card."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAttendanceCardLabelling = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AttendanceCard.mmAttendanceCardLabelling;
			componentContext_lazy = () -> AttendanceCard2.mmObject();
			isDerived = false;
			xmlTag = "AttndncCardLbllg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AttendanceCardLabelling";
			definition = "Information to be indicated on the attendance card.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}
	};
	protected DeliveryPlace1Code deliveryMethod;
	/**
	 * Specifies where the attendance card must be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.DeliveryPlace1Code
	 * DeliveryPlace1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.AttendanceCard#mmDeliveryMethod
	 * AttendanceCard.mmDeliveryMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AttendanceCard2
	 * AttendanceCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DlvryMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DeliveryMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies where the attendance card must be delivered."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDeliveryMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> AttendanceCard.mmDeliveryMethod;
			componentContext_lazy = () -> AttendanceCard2.mmObject();
			isDerived = false;
			xmlTag = "DlvryMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DeliveryMethod";
			definition = "Specifies where the attendance card must be delivered.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> DeliveryPlace1Code.mmObject();
		}
	};
	protected NameAndAddress9 otherAddress;
	/**
	 * Name and address of a party.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress9
	 * NameAndAddress9}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AttendanceCard2
	 * AttendanceCard2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OthrAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OtherAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Name and address of a party."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmOtherAddress = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> AttendanceCard2.mmObject();
			isDerived = false;
			xmlTag = "OthrAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OtherAddress";
			definition = "Name and address of a party.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress9.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(AttendanceCard2.mmAttendanceCardLabelling, AttendanceCard2.mmDeliveryMethod, AttendanceCard2.mmOtherAddress);
				trace_lazy = () -> AttendanceCard.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AttendanceCard2";
				definition = "Specifies details related to the attendance card.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AttndncCardLbllg")
	public Max105Text getAttendanceCardLabelling() {
		return attendanceCardLabelling;
	}

	public void setAttendanceCardLabelling(Max105Text attendanceCardLabelling) {
		this.attendanceCardLabelling = attendanceCardLabelling;
	}

	@XmlElement(name = "DlvryMtd", required = true)
	public DeliveryPlace1Code getDeliveryMethod() {
		return deliveryMethod;
	}

	public void setDeliveryMethod(DeliveryPlace1Code deliveryMethod) {
		this.deliveryMethod = deliveryMethod;
	}

	@XmlElement(name = "OthrAdr")
	public NameAndAddress9 getOtherAddress() {
		return otherAddress;
	}

	public void setOtherAddress(com.tools20022.repository.msg.NameAndAddress9 otherAddress) {
		this.otherAddress = otherAddress;
	}
}