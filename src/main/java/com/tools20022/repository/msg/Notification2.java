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
import com.tools20022.repository.choice.InformationDistribution1Choice;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Information about the type of notification required.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Notification2#mmNotificationType
 * Notification2.mmNotificationType}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Notification2#mmRequired
 * Notification2.mmRequired}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Notification2#mmDistributionType
 * Notification2.mmDistributionType}</li>
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
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Notification2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Information about the type of notification required."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Notification2", propOrder = {"notificationType", "required", "distributionType"})
public class Notification2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtfctnTp", required = true)
	protected Max35Text notificationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Notification2 Notification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Type of notification."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Notification2, Max35Text> mmNotificationType = new MMMessageAttribute<Notification2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Notification2.mmObject();
			isDerived = false;
			xmlTag = "NtfctnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationType";
			definition = "Type of notification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Notification2 obj) {
			return obj.getNotificationType();
		}

		@Override
		public void setValue(Notification2 obj, Max35Text value) {
			obj.setNotificationType(value);
		}
	};
	@XmlElement(name = "Reqrd", required = true)
	protected YesNoIndicator required;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.YesNoIndicator
	 * YesNoIndicator}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Notification2 Notification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Reqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Required"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the notification is required."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Notification2, YesNoIndicator> mmRequired = new MMMessageAttribute<Notification2, YesNoIndicator>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Notification2.mmObject();
			isDerived = false;
			xmlTag = "Reqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Required";
			definition = "Indicates whether the notification is required.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Notification2 obj) {
			return obj.getRequired();
		}

		@Override
		public void setValue(Notification2 obj, YesNoIndicator value) {
			obj.setRequired(value);
		}
	};
	@XmlElement(name = "DstrbtnTp")
	protected InformationDistribution1Choice distributionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.InformationDistribution1Choice
	 * InformationDistribution1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Notification2 Notification2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DstrbtnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DistributionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies how the notification is sent."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<Notification2, Optional<InformationDistribution1Choice>> mmDistributionType = new MMMessageAssociationEnd<Notification2, Optional<InformationDistribution1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Notification2.mmObject();
			isDerived = false;
			xmlTag = "DstrbtnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DistributionType";
			definition = "Specifies how the notification is sent.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> InformationDistribution1Choice.mmObject();
		}

		@Override
		public Optional<InformationDistribution1Choice> getValue(Notification2 obj) {
			return obj.getDistributionType();
		}

		@Override
		public void setValue(Notification2 obj, Optional<InformationDistribution1Choice> value) {
			obj.setDistributionType(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Notification2.mmNotificationType, com.tools20022.repository.msg.Notification2.mmRequired,
						com.tools20022.repository.msg.Notification2.mmDistributionType);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Notification2";
				definition = "Information about the type of notification required.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getNotificationType() {
		return notificationType;
	}

	public Notification2 setNotificationType(Max35Text notificationType) {
		this.notificationType = Objects.requireNonNull(notificationType);
		return this;
	}

	public YesNoIndicator getRequired() {
		return required;
	}

	public Notification2 setRequired(YesNoIndicator required) {
		this.required = Objects.requireNonNull(required);
		return this;
	}

	public Optional<InformationDistribution1Choice> getDistributionType() {
		return distributionType == null ? Optional.empty() : Optional.of(distributionType);
	}

	public Notification2 setDistributionType(InformationDistribution1Choice distributionType) {
		this.distributionType = distributionType;
		return this;
	}
}