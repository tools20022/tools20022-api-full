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
import com.tools20022.repository.codeset.RemittanceLocationMethod2Code;
import com.tools20022.repository.datatype.Max2048Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.ContactPoint;
import com.tools20022.repository.entity.PaymentObligation;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide information on the remittance advice.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#mmRemittanceIdentification
 * RemittanceLocation2.mmRemittanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#mmRemittanceLocationMethod
 * RemittanceLocation2.mmRemittanceLocationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#mmRemittanceLocationElectronicAddress
 * RemittanceLocation2.mmRemittanceLocationElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2#mmRemittanceLocationPostalAddress
 * RemittanceLocation2.mmRemittanceLocationPostalAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.ContactPoint
 * ContactPoint}</li>
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
 * "RemittanceLocation2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide information on the remittance advice."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceLocation3
 * RemittanceLocation3}</li>
 * <li>{@linkplain com.tools20022.repository.msg.RemittanceLocation4
 * RemittanceLocation4}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RemittanceLocation2", propOrder = {"remittanceIdentification", "remittanceLocationMethod", "remittanceLocationElectronicAddress", "remittanceLocationPostalAddress"})
public class RemittanceLocation2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text remittanceIdentification;
	/**
	 * Unique identification, as assigned by the initiating party, to
	 * unambiguously identify the remittance information sent separately from
	 * the payment instruction, such as a remittance advice.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique identification, as assigned by the initiating party, to unambiguously identify the remittance information sent separately from the payment instruction, such as a remittance advice."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation3#mmRemittanceIdentification
	 * RemittanceLocation3.mmRemittanceIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittanceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RemittanceLocation2.mmObject();
			isDerived = false;
			xmlTag = "RmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceIdentification";
			definition = "Unique identification, as assigned by the initiating party, to unambiguously identify the remittance information sent separately from the payment instruction, such as a remittance advice.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceLocation3.mmRemittanceIdentification);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected RemittanceLocationMethod2Code remittanceLocationMethod;
	/**
	 * Method used to deliver the remittance advice information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod2Code
	 * RemittanceLocationMethod2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceDeliveryMethod
	 * PaymentObligation.mmRemittanceDeliveryMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtLctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Method used to deliver the remittance advice information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#mmMethod
	 * RemittanceLocationDetails1.mmMethod}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittanceLocationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmRemittanceDeliveryMethod;
			componentContext_lazy = () -> RemittanceLocation2.mmObject();
			isDerived = false;
			xmlTag = "RmtLctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationMethod";
			definition = "Method used to deliver the remittance advice information.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceLocationDetails1.mmMethod);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RemittanceLocationMethod2Code.mmObject();
		}
	};
	protected Max2048Text remittanceLocationElectronicAddress;
	/**
	 * Electronic address to which an agent is to send the remittance
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max2048Text
	 * Max2048Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtLctnElctrncAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocationElectronicAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Electronic address to which an agent is to send the remittance information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#mmElectronicAddress
	 * RemittanceLocationDetails1.mmElectronicAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittanceLocationElectronicAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ContactPoint.mmObject();
			componentContext_lazy = () -> RemittanceLocation2.mmObject();
			isDerived = false;
			xmlTag = "RmtLctnElctrncAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationElectronicAddress";
			definition = "Electronic address to which an agent is to send the remittance information.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceLocationDetails1.mmElectronicAddress);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max2048Text.mmObject();
		}
	};
	protected NameAndAddress10 remittanceLocationPostalAddress;
	/**
	 * Postal address to which an agent is to send the remittance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress10
	 * NameAndAddress10}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation2
	 * RemittanceLocation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RmtLctnPstlAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RemittanceLocationPostalAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Postal address to which an agent is to send the remittance information."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocationDetails1#mmPostalAddress
	 * RemittanceLocationDetails1.mmPostalAddress}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemittanceLocationPostalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> RemittanceLocation2.mmObject();
			isDerived = false;
			xmlTag = "RmtLctnPstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationPostalAddress";
			definition = "Postal address to which an agent is to send the remittance information.";
			nextVersions_lazy = () -> Arrays.asList(RemittanceLocationDetails1.mmPostalAddress);
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress10.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RemittanceLocation2.mmRemittanceIdentification, RemittanceLocation2.mmRemittanceLocationMethod, RemittanceLocation2.mmRemittanceLocationElectronicAddress,
						RemittanceLocation2.mmRemittanceLocationPostalAddress);
				trace_lazy = () -> ContactPoint.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocation2";
				definition = "Set of elements used to provide information on the remittance advice.";
				nextVersions_lazy = () -> Arrays.asList(RemittanceLocation3.mmObject(), RemittanceLocation4.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "RmtId")
	public Max35Text getRemittanceIdentification() {
		return remittanceIdentification;
	}

	public void setRemittanceIdentification(Max35Text remittanceIdentification) {
		this.remittanceIdentification = remittanceIdentification;
	}

	@XmlElement(name = "RmtLctnMtd")
	public RemittanceLocationMethod2Code getRemittanceLocationMethod() {
		return remittanceLocationMethod;
	}

	public void setRemittanceLocationMethod(RemittanceLocationMethod2Code remittanceLocationMethod) {
		this.remittanceLocationMethod = remittanceLocationMethod;
	}

	@XmlElement(name = "RmtLctnElctrncAdr")
	public Max2048Text getRemittanceLocationElectronicAddress() {
		return remittanceLocationElectronicAddress;
	}

	public void setRemittanceLocationElectronicAddress(Max2048Text remittanceLocationElectronicAddress) {
		this.remittanceLocationElectronicAddress = remittanceLocationElectronicAddress;
	}

	@XmlElement(name = "RmtLctnPstlAdr")
	public NameAndAddress10 getRemittanceLocationPostalAddress() {
		return remittanceLocationPostalAddress;
	}

	public void setRemittanceLocationPostalAddress(com.tools20022.repository.msg.NameAndAddress10 remittanceLocationPostalAddress) {
		this.remittanceLocationPostalAddress = remittanceLocationPostalAddress;
	}
}