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

package com.tools20022.repository.area.seev;

import com.tools20022.metamodel.MMMessageBuildingBlock;
import com.tools20022.metamodel.MMMessageDefinition;
import com.tools20022.metamodel.MMMessageDefinitionIdentifier;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.SecuritiesEventsArchive;
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An account servicer sends the MeetingEntitlementNotification to an issuer,
 * its agent, an intermediary or an account owner to advise the entitlement in
 * relation to a shareholders meeting.<br>
 * <b>Usage</b><br>
 * This message is sent to advise the quantity of securities held by an account
 * owner. The balance is specified for the securities for which the meeting is
 * taking place.<br>
 * This entitlement message is sent by the account servicer or the registrar to
 * an intermediary, the issuer's agent or the issuer. It is also sent between
 * the account servicer and the account owner or the party holding the right to
 * vote.<br>
 * The message is also used to amend a previously sent
 * MeetingEntitlementNotification. To notify an update, the RelatedReference
 * must be included in the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.003.001.02}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02#mmEntitlementNotificationIdentification
 * MeetingEntitlementNotificationV02.mmEntitlementNotificationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02#mmRelatedReference
 * MeetingEntitlementNotificationV02.mmRelatedReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02#mmMeetingReference
 * MeetingEntitlementNotificationV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02#mmNotifyingParty
 * MeetingEntitlementNotificationV02.mmNotifyingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02#mmSecurity
 * MeetingEntitlementNotificationV02.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02#mmEligibility
 * MeetingEntitlementNotificationV02.mmEligibility}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgEntitlmntNtfctn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingEntitlementNotificationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn account servicer sends the MeetingEntitlementNotification to an issuer, its agent, an intermediary or an account owner to advise the entitlement in relation to a shareholders meeting.\r\nUsage\r\nThis message is sent to advise the quantity of securities held by an account owner. The balance is specified for the securities for which the meeting is taking place.\r\nThis entitlement message is sent by the account servicer or the registrar to an intermediary, the issuer's agent or the issuer. It is also sent between the account servicer and the account owner or the party holding the right to vote.\r\nThe message is also used to amend a previously sent MeetingEntitlementNotification. To notify an update, the RelatedReference must be included in the message."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingEntitlementNotificationV03
 * MeetingEntitlementNotificationV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingEntitlementNotificationV02", propOrder = {"entitlementNotificationIdentification", "relatedReference", "meetingReference", "notifyingParty", "security", "eligibility"})
public class MeetingEntitlementNotificationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "EntitlmntNtfctnId", required = true)
	protected MessageIdentification1 entitlementNotificationIdentification;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "EntitlmntNtfctnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "EntitlementNotificationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifies the notification of entitlement instruction."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV02, MessageIdentification1> mmEntitlementNotificationIdentification = new MMMessageBuildingBlock<MeetingEntitlementNotificationV02, MessageIdentification1>() {
		{
			xmlTag = "EntitlmntNtfctnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "EntitlementNotificationIdentification";
			definition = "Identifies the notification of entitlement instruction.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		@Override
		public MessageIdentification1 getValue(MeetingEntitlementNotificationV02 obj) {
			return obj.getEntitlementNotificationIdentification();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV02 obj, MessageIdentification1 value) {
			obj.setEntitlementNotificationIdentification(value);
		}
	};
	@XmlElement(name = "RltdRef")
	protected MessageIdentification relatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification
	 * MessageIdentification}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the meeting entitlement message to be modified."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV02, Optional<MessageIdentification>> mmRelatedReference = new MMMessageBuildingBlock<MeetingEntitlementNotificationV02, Optional<MessageIdentification>>() {
		{
			xmlTag = "RltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RelatedReference";
			definition = "Identifies the meeting entitlement message to be modified.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> MessageIdentification.mmObject();
		}

		@Override
		public Optional<MessageIdentification> getValue(MeetingEntitlementNotificationV02 obj) {
			return obj.getRelatedReference();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV02 obj, Optional<MessageIdentification> value) {
			obj.setRelatedReference(value.orElse(null));
		}
	};
	@XmlElement(name = "MtgRef", required = true)
	protected MeetingReference3 meetingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Series of elements which allow to identify a meeting."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV02, MeetingReference3> mmMeetingReference = new MMMessageBuildingBlock<MeetingEntitlementNotificationV02, MeetingReference3>() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference3.mmObject();
		}

		@Override
		public MeetingReference3 getValue(MeetingEntitlementNotificationV02 obj) {
			return obj.getMeetingReference();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV02 obj, MeetingReference3 value) {
			obj.setMeetingReference(value);
		}
	};
	@XmlElement(name = "NtifngPty", required = true)
	protected PartyIdentification9Choice notifyingParty;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtifngPty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party notifying the entitlement."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV02, PartyIdentification9Choice> mmNotifyingParty = new MMMessageBuildingBlock<MeetingEntitlementNotificationV02, PartyIdentification9Choice>() {
		{
			xmlTag = "NtifngPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingParty";
			definition = "Party notifying the entitlement.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		@Override
		public PartyIdentification9Choice getValue(MeetingEntitlementNotificationV02 obj) {
			return obj.getNotifyingParty();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV02 obj, PartyIdentification9Choice value) {
			obj.setNotifyingParty(value);
		}
	};
	@XmlElement(name = "Scty", required = true)
	protected List<SecurityPosition5> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition5
	 * SecurityPosition5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the security for which the meeting is organised, the account and the positions of the security holder."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV02, List<SecurityPosition5>> mmSecurity = new MMMessageBuildingBlock<MeetingEntitlementNotificationV02, List<SecurityPosition5>>() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identifies the security for which the meeting is organised, the account and the positions of the security holder.";
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition5.mmObject();
		}

		@Override
		public List<SecurityPosition5> getValue(MeetingEntitlementNotificationV02 obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV02 obj, List<SecurityPosition5> value) {
			obj.setSecurity(value);
		}
	};
	@XmlElement(name = "Elgblty", required = true)
	protected EligibilityDates1 eligibility;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.EligibilityDates1
	 * EligibilityDates1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Elgblty"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Eligibility"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the dates determining eligibility."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingEntitlementNotificationV02, EligibilityDates1> mmEligibility = new MMMessageBuildingBlock<MeetingEntitlementNotificationV02, EligibilityDates1>() {
		{
			xmlTag = "Elgblty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Eligibility";
			definition = "Defines the dates determining eligibility.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> EligibilityDates1.mmObject();
		}

		@Override
		public EligibilityDates1 getValue(MeetingEntitlementNotificationV02 obj) {
			return obj.getEligibility();
		}

		@Override
		public void setValue(MeetingEntitlementNotificationV02 obj, EligibilityDates1 value) {
			obj.setEligibility(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingEntitlementNotificationV02";
				definition = "Scope\r\nAn account servicer sends the MeetingEntitlementNotification to an issuer, its agent, an intermediary or an account owner to advise the entitlement in relation to a shareholders meeting.\r\nUsage\r\nThis message is sent to advise the quantity of securities held by an account owner. The balance is specified for the securities for which the meeting is taking place.\r\nThis entitlement message is sent by the account servicer or the registrar to an intermediary, the issuer's agent or the issuer. It is also sent between the account servicer and the account owner or the party holding the right to vote.\r\nThe message is also used to amend a previously sent MeetingEntitlementNotification. To notify an update, the RelatedReference must be included in the message.";
				nextVersions_lazy = () -> Arrays.asList(MeetingEntitlementNotificationV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgEntitlmntNtfctn";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02.mmEntitlementNotificationIdentification,
						com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02.mmRelatedReference, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02.mmMeetingReference,
						com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02.mmNotifyingParty, com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02.mmSecurity,
						com.tools20022.repository.area.seev.MeetingEntitlementNotificationV02.mmEligibility);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "003";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingEntitlementNotificationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getEntitlementNotificationIdentification() {
		return entitlementNotificationIdentification;
	}

	public MeetingEntitlementNotificationV02 setEntitlementNotificationIdentification(MessageIdentification1 entitlementNotificationIdentification) {
		this.entitlementNotificationIdentification = Objects.requireNonNull(entitlementNotificationIdentification);
		return this;
	}

	public Optional<MessageIdentification> getRelatedReference() {
		return relatedReference == null ? Optional.empty() : Optional.of(relatedReference);
	}

	public MeetingEntitlementNotificationV02 setRelatedReference(MessageIdentification relatedReference) {
		this.relatedReference = relatedReference;
		return this;
	}

	public MeetingReference3 getMeetingReference() {
		return meetingReference;
	}

	public MeetingEntitlementNotificationV02 setMeetingReference(MeetingReference3 meetingReference) {
		this.meetingReference = Objects.requireNonNull(meetingReference);
		return this;
	}

	public PartyIdentification9Choice getNotifyingParty() {
		return notifyingParty;
	}

	public MeetingEntitlementNotificationV02 setNotifyingParty(PartyIdentification9Choice notifyingParty) {
		this.notifyingParty = Objects.requireNonNull(notifyingParty);
		return this;
	}

	public List<SecurityPosition5> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingEntitlementNotificationV02 setSecurity(List<SecurityPosition5> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public EligibilityDates1 getEligibility() {
		return eligibility;
	}

	public MeetingEntitlementNotificationV02 setEligibility(EligibilityDates1 eligibility) {
		this.eligibility = Objects.requireNonNull(eligibility);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.003.001.02")
	static public class Document {
		@XmlElement(name = "MtgEntitlmntNtfctn", required = true)
		public MeetingEntitlementNotificationV02 messageBody;
	}
}