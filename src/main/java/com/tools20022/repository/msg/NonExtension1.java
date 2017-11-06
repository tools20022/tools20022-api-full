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
import com.tools20022.repository.choice.CommunicationMethod1Choice;
import com.tools20022.repository.choice.PartyType1Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.PostalAddress;
import com.tools20022.repository.entity.UndertakingExtension;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/**
 * Non-extension information.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationPeriod
 * NonExtension1.mmNotificationPeriod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationMethod
 * NonExtension1.mmNotificationMethod}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationRecipientType
 * NonExtension1.mmNotificationRecipientType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationRecipientName
 * NonExtension1.mmNotificationRecipientName}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.NonExtension1#mmNotificationRecipientAddress
 * NonExtension1.mmNotificationRecipientAddress}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.UndertakingExtension
 * UndertakingExtension}</li>
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
 * "NonExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Non-extension information."</li>
 * </ul>
 */
public class NonExtension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Number notificationPeriod;
	/**
	 * Minimum number of days prior to the then current expiry date by which
	 * notice of non-extension must be sent.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Number
	 * Number}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmNonExtensionNoticePeriod
	 * UndertakingExtension.mmNonExtensionNoticePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonExtension1 NonExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnPrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days prior to the then current expiry date by which notice of non-extension must be sent. "
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotificationPeriod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.UndertakingExtension.mmNonExtensionNoticePeriod;
			componentContext_lazy = () -> NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnPrd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationPeriod";
			definition = "Minimum number of days prior to the then current expiry date by which notice of non-extension must be sent. ";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}
	};
	protected CommunicationMethod1Choice notificationMethod;
	/**
	 * Method by which the notice of non-extension is intended to be delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.CommunicationMethod1Choice
	 * CommunicationMethod1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Presentation#mmCommunicationMethod
	 * Presentation.mmCommunicationMethod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonExtension1 NonExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnMtd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method by which the notice of non-extension is intended to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotificationMethod = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnMtd";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationMethod";
			definition = "Method by which the notice of non-extension is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommunicationMethod1Choice.mmObject();
		}
	};
	protected PartyType1Choice notificationRecipientType;
	/**
	 * Type of party to whom the notice of non-extension is intended to be
	 * delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.choice.PartyType1Choice
	 * PartyType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonExtension1 NonExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnRcptTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationRecipientType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of party to whom the notice of non-extension is intended to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmNotificationRecipientType = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.Party.mmIdentification;
			componentContext_lazy = () -> NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnRcptTp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationRecipientType";
			definition = "Type of party to whom the notice of non-extension is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyType1Choice.mmObject();
		}
	};
	protected Max140Text notificationRecipientName;
	/**
	 * Name of party to whom the notice of non-extension is intended to be
	 * delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyName#mmName
	 * PartyName.mmName}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonExtension1 NonExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnRcptNm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationRecipientName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of party to whom the notice of non-extension is intended to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotificationRecipientName = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.PartyName.mmName;
			componentContext_lazy = () -> NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnRcptNm";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationRecipientName";
			definition = "Name of party to whom the notice of non-extension is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};
	protected PostalAddress6 notificationRecipientAddress;
	/**
	 * Address of party to whom the notice of non-extension is intended to be
	 * delivered.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.PostalAddress6
	 * PostalAddress6}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.PostalAddress PostalAddress}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonExtension1 NonExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnRcptAdr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationRecipientAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address of party to whom the notice of non-extension is intended to be delivered."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmNotificationRecipientAddress = new MMMessageAttribute() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnRcptAdr";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationRecipientAddress";
			definition = "Address of party to whom the notice of non-extension is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> com.tools20022.repository.msg.PostalAddress6.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonExtension1.mmNotificationPeriod, com.tools20022.repository.msg.NonExtension1.mmNotificationMethod,
						com.tools20022.repository.msg.NonExtension1.mmNotificationRecipientType, com.tools20022.repository.msg.NonExtension1.mmNotificationRecipientName,
						com.tools20022.repository.msg.NonExtension1.mmNotificationRecipientAddress);
				trace_lazy = () -> UndertakingExtension.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "NonExtension1";
				definition = "Non-extension information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Number getNotificationPeriod() {
		return notificationPeriod;
	}

	public void setNotificationPeriod(Number notificationPeriod) {
		this.notificationPeriod = notificationPeriod;
	}

	public CommunicationMethod1Choice getNotificationMethod() {
		return notificationMethod;
	}

	public void setNotificationMethod(CommunicationMethod1Choice notificationMethod) {
		this.notificationMethod = notificationMethod;
	}

	public PartyType1Choice getNotificationRecipientType() {
		return notificationRecipientType;
	}

	public void setNotificationRecipientType(PartyType1Choice notificationRecipientType) {
		this.notificationRecipientType = notificationRecipientType;
	}

	public Max140Text getNotificationRecipientName() {
		return notificationRecipientName;
	}

	public void setNotificationRecipientName(Max140Text notificationRecipientName) {
		this.notificationRecipientName = notificationRecipientName;
	}

	public PostalAddress6 getNotificationRecipientAddress() {
		return notificationRecipientAddress;
	}

	public void setNotificationRecipientAddress(com.tools20022.repository.msg.PostalAddress6 notificationRecipientAddress) {
		this.notificationRecipientAddress = notificationRecipientAddress;
	}
}