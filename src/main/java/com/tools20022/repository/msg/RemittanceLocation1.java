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
import com.tools20022.repository.codeset.RemittanceLocationMethod1Code;
import com.tools20022.repository.datatype.Max256Text;
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
 * Remittance information that provides all remittance address elements, that
 * enables the matching, i.e. reconciliation, of a payment with the items that
 * the transaction in intended to settle.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1#mmRemittanceIdentification
 * RemittanceLocation1.mmRemittanceIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1#mmRemittanceLocationMethod
 * RemittanceLocation1.mmRemittanceLocationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1#mmRemittanceLocationElectronicAddress
 * RemittanceLocation1.mmRemittanceLocationElectronicAddress}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1#mmRemittanceLocationPostalAddress
 * RemittanceLocation1.mmRemittanceLocationPostalAddress}</li>
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
 * "RemittanceLocation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Remittance information that provides all remittance address elements, that enables the matching, i.e.  reconciliation, of a payment with the items that the transaction in intended to settle."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "RemittanceLocation1", propOrder = {"remittanceIdentification", "remittanceLocationMethod", "remittanceLocationElectronicAddress", "remittanceLocationPostalAddress"})
public class RemittanceLocation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text remittanceIdentification;
	/**
	 * Unique and unambiguous identification of the remittance information, e.g.
	 * a remittance advice, which is sent separately from the payment
	 * instruction.
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
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1
	 * RemittanceLocation1}</li>
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
	 * "Unique and unambiguous identification of the remittance information, e.g. a remittance advice, which is sent separately from the payment instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittanceIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> RemittanceLocation1.mmObject();
			isDerived = false;
			xmlTag = "RmtId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceIdentification";
			definition = "Unique and unambiguous identification of the remittance information, e.g. a remittance advice, which is sent separately from the payment instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected RemittanceLocationMethod1Code remittanceLocationMethod;
	/**
	 * Specifies the method used to deliver the remittance advice information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RemittanceLocationMethod1Code
	 * RemittanceLocationMethod1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PaymentObligation#mmRemittanceDeliveryMethod
	 * PaymentObligation.mmRemittanceDeliveryMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1
	 * RemittanceLocation1}</li>
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
	 * definition} =
	 * "Specifies the method used to deliver the remittance advice information."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittanceLocationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> PaymentObligation.mmRemittanceDeliveryMethod;
			componentContext_lazy = () -> RemittanceLocation1.mmObject();
			isDerived = false;
			xmlTag = "RmtLctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationMethod";
			definition = "Specifies the method used to deliver the remittance advice information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RemittanceLocationMethod1Code.mmObject();
		}
	};
	protected Max256Text remittanceLocationElectronicAddress;
	/**
	 * Electronic address to which an agent is to send the remittance
	 * information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max256Text
	 * Max256Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.ContactPoint ContactPoint}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1
	 * RemittanceLocation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAttribute mmRemittanceLocationElectronicAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> ContactPoint.mmObject();
			componentContext_lazy = () -> RemittanceLocation1.mmObject();
			isDerived = false;
			xmlTag = "RmtLctnElctrncAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationElectronicAddress";
			definition = "Electronic address to which an agent is to send the remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max256Text.mmObject();
		}
	};
	protected NameAndAddress3 remittanceLocationPostalAddress;
	/**
	 * Postal address to which an agent is to send the remittance information.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.NameAndAddress3
	 * NameAndAddress3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RemittanceLocation1
	 * RemittanceLocation1}</li>
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
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmRemittanceLocationPostalAddress = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> RemittanceLocation1.mmObject();
			isDerived = false;
			xmlTag = "RmtLctnPstlAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RemittanceLocationPostalAddress";
			definition = "Postal address to which an agent is to send the remittance information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.NameAndAddress3.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(RemittanceLocation1.mmRemittanceIdentification, RemittanceLocation1.mmRemittanceLocationMethod, RemittanceLocation1.mmRemittanceLocationElectronicAddress,
						RemittanceLocation1.mmRemittanceLocationPostalAddress);
				trace_lazy = () -> ContactPoint.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RemittanceLocation1";
				definition = "Remittance information that provides all remittance address elements, that enables the matching, i.e.  reconciliation, of a payment with the items that the transaction in intended to settle.";
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
	public RemittanceLocationMethod1Code getRemittanceLocationMethod() {
		return remittanceLocationMethod;
	}

	public void setRemittanceLocationMethod(RemittanceLocationMethod1Code remittanceLocationMethod) {
		this.remittanceLocationMethod = remittanceLocationMethod;
	}

	@XmlElement(name = "RmtLctnElctrncAdr")
	public Max256Text getRemittanceLocationElectronicAddress() {
		return remittanceLocationElectronicAddress;
	}

	public void setRemittanceLocationElectronicAddress(Max256Text remittanceLocationElectronicAddress) {
		this.remittanceLocationElectronicAddress = remittanceLocationElectronicAddress;
	}

	@XmlElement(name = "RmtLctnPstlAdr")
	public NameAndAddress3 getRemittanceLocationPostalAddress() {
		return remittanceLocationPostalAddress;
	}

	public void setRemittanceLocationPostalAddress(com.tools20022.repository.msg.NameAndAddress3 remittanceLocationPostalAddress) {
		this.remittanceLocationPostalAddress = remittanceLocationPostalAddress;
	}
}