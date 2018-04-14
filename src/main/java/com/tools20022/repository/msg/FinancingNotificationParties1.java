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
import com.tools20022.repository.entity.InvoiceFinancingPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.QualifiedPartyIdentification1;
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
 * Identifies a party that notifies a financial document, the party to be
 * notified, and whether notified party must send an acknowledgement and to
 * whom.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingNotificationParties1#mmNotifyingParty
 * FinancingNotificationParties1.mmNotifyingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingNotificationParties1#mmNotificationReceiver
 * FinancingNotificationParties1.mmNotificationReceiver}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.FinancingNotificationParties1#mmAcknowledgementReceiver
 * FinancingNotificationParties1.mmAcknowledgementReceiver}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "FinancingNotificationParties1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies a party that notifies a financial document, the party to be notified, and whether notified party must send an acknowledgement and to whom."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "FinancingNotificationParties1", propOrder = {"notifyingParty", "notificationReceiver", "acknowledgementReceiver"})
public class FinancingNotificationParties1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "NtifngPty", required = true)
	protected QualifiedPartyIdentification1 notifyingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
	 * InvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingNotificationParties1
	 * FinancingNotificationParties1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtifngPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that notifies a third party."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingNotificationParties1, QualifiedPartyIdentification1> mmNotifyingParty = new MMMessageAssociationEnd<FinancingNotificationParties1, QualifiedPartyIdentification1>() {
		{
			businessComponentTrace_lazy = () -> InvoiceFinancingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingNotificationParties1.mmObject();
			isDerived = false;
			xmlTag = "NtifngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingParty";
			definition = "Party that notifies a third party.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(FinancingNotificationParties1 obj) {
			return obj.getNotifyingParty();
		}

		@Override
		public void setValue(FinancingNotificationParties1 obj, QualifiedPartyIdentification1 value) {
			obj.setNotifyingParty(value);
		}
	};
	@XmlElement(name = "NtfctnRcvr", required = true)
	protected QualifiedPartyIdentification1 notificationReceiver;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
	 * InvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingNotificationParties1
	 * FinancingNotificationParties1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtfctnRcvr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotificationReceiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party (to be) notified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingNotificationParties1, QualifiedPartyIdentification1> mmNotificationReceiver = new MMMessageAssociationEnd<FinancingNotificationParties1, QualifiedPartyIdentification1>() {
		{
			businessComponentTrace_lazy = () -> InvoiceFinancingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingNotificationParties1.mmObject();
			isDerived = false;
			xmlTag = "NtfctnRcvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotificationReceiver";
			definition = "Party (to be) notified.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public QualifiedPartyIdentification1 getValue(FinancingNotificationParties1 obj) {
			return obj.getNotificationReceiver();
		}

		@Override
		public void setValue(FinancingNotificationParties1 obj, QualifiedPartyIdentification1 value) {
			obj.setNotificationReceiver(value);
		}
	};
	@XmlElement(name = "AckRcvr")
	protected List<QualifiedPartyIdentification1> acknowledgementReceiver;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.QualifiedPartyIdentification1
	 * QualifiedPartyIdentification1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.InvoiceFinancingPartyRole
	 * InvoiceFinancingPartyRole}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.FinancingNotificationParties1
	 * FinancingNotificationParties1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AckRcvr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AcknowledgementReceiver"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party to whom a notification acknowledgement has to be sent by the notification receiver."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<FinancingNotificationParties1, List<QualifiedPartyIdentification1>> mmAcknowledgementReceiver = new MMMessageAssociationEnd<FinancingNotificationParties1, List<QualifiedPartyIdentification1>>() {
		{
			businessComponentTrace_lazy = () -> InvoiceFinancingPartyRole.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.FinancingNotificationParties1.mmObject();
			isDerived = false;
			xmlTag = "AckRcvr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AcknowledgementReceiver";
			definition = "Party to whom a notification acknowledgement has to be sent by the notification receiver.";
			minOccurs = 0;
			isComposite = false;
			type_lazy = () -> QualifiedPartyIdentification1.mmObject();
		}

		@Override
		public List<QualifiedPartyIdentification1> getValue(FinancingNotificationParties1 obj) {
			return obj.getAcknowledgementReceiver();
		}

		@Override
		public void setValue(FinancingNotificationParties1 obj, List<QualifiedPartyIdentification1> value) {
			obj.setAcknowledgementReceiver(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.FinancingNotificationParties1.mmNotifyingParty, com.tools20022.repository.msg.FinancingNotificationParties1.mmNotificationReceiver,
						com.tools20022.repository.msg.FinancingNotificationParties1.mmAcknowledgementReceiver);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "FinancingNotificationParties1";
				definition = "Identifies a party that notifies a financial document, the party to be notified, and whether notified party must send an acknowledgement and to whom.";
			}
		});
		return mmObject_lazy.get();
	}

	public QualifiedPartyIdentification1 getNotifyingParty() {
		return notifyingParty;
	}

	public FinancingNotificationParties1 setNotifyingParty(QualifiedPartyIdentification1 notifyingParty) {
		this.notifyingParty = Objects.requireNonNull(notifyingParty);
		return this;
	}

	public QualifiedPartyIdentification1 getNotificationReceiver() {
		return notificationReceiver;
	}

	public FinancingNotificationParties1 setNotificationReceiver(QualifiedPartyIdentification1 notificationReceiver) {
		this.notificationReceiver = Objects.requireNonNull(notificationReceiver);
		return this;
	}

	public List<QualifiedPartyIdentification1> getAcknowledgementReceiver() {
		return acknowledgementReceiver == null ? acknowledgementReceiver = new ArrayList<>() : acknowledgementReceiver;
	}

	public FinancingNotificationParties1 setAcknowledgementReceiver(List<QualifiedPartyIdentification1> acknowledgementReceiver) {
		this.acknowledgementReceiver = Objects.requireNonNull(acknowledgementReceiver);
		return this;
	}
}