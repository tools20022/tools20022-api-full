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
import com.tools20022.repository.choice.CommunicationMethod1Choice;
import com.tools20022.repository.choice.PartyType1Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.*;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PostalAddress6;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

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
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "NonExtension1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Non-extension information."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintNotificationTypeSPECAddressRule#forNonExtension1
 * ConstraintNotificationTypeSPECAddressRule.forNonExtension1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "NonExtension1", propOrder = {"notificationPeriod", "notificationMethod", "notificationRecipientType", "notificationRecipientName", "notificationRecipientAddress"})
public class NonExtension1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtfctnPrd")
	protected Number notificationPeriod;
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
	 * {@linkplain com.tools20022.repository.entity.UndertakingExtension#mmNonExtensionNoticePeriod
	 * UndertakingExtension.mmNonExtensionNoticePeriod}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.NonExtension1 NonExtension1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnPrd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationPeriod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum number of days prior to the then current expiry date by which notice of non-extension must be sent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonExtension1, Optional<Number>> mmNotificationPeriod = new MMMessageAttribute<NonExtension1, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> UndertakingExtension.mmNonExtensionNoticePeriod;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnPrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationPeriod";
			definition = "Minimum number of days prior to the then current expiry date by which notice of non-extension must be sent.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(NonExtension1 obj) {
			return obj.getNotificationPeriod();
		}

		@Override
		public void setValue(NonExtension1 obj, Optional<Number> value) {
			obj.setNotificationPeriod(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnMtd")
	protected CommunicationMethod1Choice notificationMethod;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationMethod"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Method by which the notice of non-extension is intended to be delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonExtension1, Optional<CommunicationMethod1Choice>> mmNotificationMethod = new MMMessageAttribute<NonExtension1, Optional<CommunicationMethod1Choice>>() {
		{
			businessElementTrace_lazy = () -> Presentation.mmCommunicationMethod;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnMtd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationMethod";
			definition = "Method by which the notice of non-extension is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommunicationMethod1Choice.mmObject();
		}

		@Override
		public Optional<CommunicationMethod1Choice> getValue(NonExtension1 obj) {
			return obj.getNotificationMethod();
		}

		@Override
		public void setValue(NonExtension1 obj, Optional<CommunicationMethod1Choice> value) {
			obj.setNotificationMethod(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnRcptTp")
	protected PartyType1Choice notificationRecipientType;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationRecipientType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Type of party to whom the notice of non-extension is intended to be delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<NonExtension1, Optional<PartyType1Choice>> mmNotificationRecipientType = new MMMessageAssociationEnd<NonExtension1, Optional<PartyType1Choice>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnRcptTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationRecipientType";
			definition = "Type of party to whom the notice of non-extension is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyType1Choice.mmObject();
		}

		@Override
		public Optional<PartyType1Choice> getValue(NonExtension1 obj) {
			return obj.getNotificationRecipientType();
		}

		@Override
		public void setValue(NonExtension1 obj, Optional<PartyType1Choice> value) {
			obj.setNotificationRecipientType(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnRcptNm")
	protected Max140Text notificationRecipientName;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationRecipientName"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Name of party to whom the notice of non-extension is intended to be delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonExtension1, Optional<Max140Text>> mmNotificationRecipientName = new MMMessageAttribute<NonExtension1, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> PartyName.mmName;
			componentContext_lazy = () -> com.tools20022.repository.msg.NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnRcptNm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationRecipientName";
			definition = "Name of party to whom the notice of non-extension is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(NonExtension1 obj) {
			return obj.getNotificationRecipientName();
		}

		@Override
		public void setValue(NonExtension1 obj, Optional<Max140Text> value) {
			obj.setNotificationRecipientName(value.orElse(null));
		}
	};
	@XmlElement(name = "NtfctnRcptAdr")
	protected PostalAddress6 notificationRecipientAddress;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationRecipientAddress"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Address of party to whom the notice of non-extension is intended to be delivered."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<NonExtension1, Optional<PostalAddress6>> mmNotificationRecipientAddress = new MMMessageAttribute<NonExtension1, Optional<PostalAddress6>>() {
		{
			businessComponentTrace_lazy = () -> PostalAddress.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.NonExtension1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnRcptAdr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationRecipientAddress";
			definition = "Address of party to whom the notice of non-extension is intended to be delivered.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> PostalAddress6.mmObject();
		}

		@Override
		public Optional<PostalAddress6> getValue(NonExtension1 obj) {
			return obj.getNotificationRecipientAddress();
		}

		@Override
		public void setValue(NonExtension1 obj, Optional<PostalAddress6> value) {
			obj.setNotificationRecipientAddress(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.NonExtension1.mmNotificationPeriod, com.tools20022.repository.msg.NonExtension1.mmNotificationMethod,
						com.tools20022.repository.msg.NonExtension1.mmNotificationRecipientType, com.tools20022.repository.msg.NonExtension1.mmNotificationRecipientName,
						com.tools20022.repository.msg.NonExtension1.mmNotificationRecipientAddress);
				trace_lazy = () -> UndertakingExtension.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintNotificationTypeSPECAddressRule.forNonExtension1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "NonExtension1";
				definition = "Non-extension information.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Number> getNotificationPeriod() {
		return notificationPeriod == null ? Optional.empty() : Optional.of(notificationPeriod);
	}

	public NonExtension1 setNotificationPeriod(Number notificationPeriod) {
		this.notificationPeriod = notificationPeriod;
		return this;
	}

	public Optional<CommunicationMethod1Choice> getNotificationMethod() {
		return notificationMethod == null ? Optional.empty() : Optional.of(notificationMethod);
	}

	public NonExtension1 setNotificationMethod(CommunicationMethod1Choice notificationMethod) {
		this.notificationMethod = notificationMethod;
		return this;
	}

	public Optional<PartyType1Choice> getNotificationRecipientType() {
		return notificationRecipientType == null ? Optional.empty() : Optional.of(notificationRecipientType);
	}

	public NonExtension1 setNotificationRecipientType(PartyType1Choice notificationRecipientType) {
		this.notificationRecipientType = notificationRecipientType;
		return this;
	}

	public Optional<Max140Text> getNotificationRecipientName() {
		return notificationRecipientName == null ? Optional.empty() : Optional.of(notificationRecipientName);
	}

	public NonExtension1 setNotificationRecipientName(Max140Text notificationRecipientName) {
		this.notificationRecipientName = notificationRecipientName;
		return this;
	}

	public Optional<PostalAddress6> getNotificationRecipientAddress() {
		return notificationRecipientAddress == null ? Optional.empty() : Optional.of(notificationRecipientAddress);
	}

	public NonExtension1 setNotificationRecipientAddress(PostalAddress6 notificationRecipientAddress) {
		this.notificationRecipientAddress = notificationRecipientAddress;
		return this;
	}
}