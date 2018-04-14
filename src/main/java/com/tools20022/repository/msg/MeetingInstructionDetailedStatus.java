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
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.GenericIdentification;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.DetailedInstructionConfirmation;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Status applying to individual instructions of a MeetingInstruction.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmAccountIdentification
 * MeetingInstructionDetailedStatus.mmAccountIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmParticipationRegistrationConfirmation
 * MeetingInstructionDetailedStatus.mmParticipationRegistrationConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmVotingInstructionConfirmation
 * MeetingInstructionDetailedStatus.mmVotingInstructionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmProxyAssignmentConfirmation
 * MeetingInstructionDetailedStatus.mmProxyAssignmentConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmMeetingAttendanceConfirmation
 * MeetingInstructionDetailedStatus.mmMeetingAttendanceConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus#mmSecuritiesRegistrationConfirmation
 * MeetingInstructionDetailedStatus.mmSecuritiesRegistrationConfirmation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatus
 * MeetingStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionDetailedStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status applying to individual instructions of a MeetingInstruction."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingInstructionDetailedStatus", propOrder = {"accountIdentification", "participationRegistrationConfirmation", "votingInstructionConfirmation", "proxyAssignmentConfirmation", "meetingAttendanceConfirmation",
		"securitiesRegistrationConfirmation"})
public class MeetingInstructionDetailedStatus {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "AcctId")
	protected Max35Text accountIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.GenericIdentification#mmIdentification
	 * GenericIdentification.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AcctId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<MeetingInstructionDetailedStatus, Optional<Max35Text>> mmAccountIdentification = new MMMessageAttribute<MeetingInstructionDetailedStatus, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(MeetingInstructionDetailedStatus obj) {
			return obj.getAccountIdentification();
		}

		@Override
		public void setValue(MeetingInstructionDetailedStatus obj, Optional<Max35Text> value) {
			obj.setAccountIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "PrtcptnRegnConf")
	protected List<DetailedInstructionConfirmation> participationRegistrationConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrtcptnRegnConf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipationRegistrationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status relative to vote participation instruction(s)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>> mmParticipationRegistrationConfirmation = new MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>>() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "PrtcptnRegnConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipationRegistrationConfirmation";
			definition = "Status relative to vote participation instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
		}

		@Override
		public List<DetailedInstructionConfirmation> getValue(MeetingInstructionDetailedStatus obj) {
			return obj.getParticipationRegistrationConfirmation();
		}

		@Override
		public void setValue(MeetingInstructionDetailedStatus obj, List<DetailedInstructionConfirmation> value) {
			obj.setParticipationRegistrationConfirmation(value);
		}
	};
	@XmlElement(name = "VtngInstrConf")
	protected List<DetailedInstructionConfirmation> votingInstructionConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VtngInstrConf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingInstructionConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status relative to vote instruction(s)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>> mmVotingInstructionConfirmation = new MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>>() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "VtngInstrConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingInstructionConfirmation";
			definition = "Status relative to vote instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
		}

		@Override
		public List<DetailedInstructionConfirmation> getValue(MeetingInstructionDetailedStatus obj) {
			return obj.getVotingInstructionConfirmation();
		}

		@Override
		public void setValue(MeetingInstructionDetailedStatus obj, List<DetailedInstructionConfirmation> value) {
			obj.setVotingInstructionConfirmation(value);
		}
	};
	@XmlElement(name = "PrxyAssgnmtConf")
	protected List<DetailedInstructionConfirmation> proxyAssignmentConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "PrxyAssgnmtConf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAssignmentConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status relative to proxy assignment instruction(s)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>> mmProxyAssignmentConfirmation = new MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>>() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "PrxyAssgnmtConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAssignmentConfirmation";
			definition = "Status relative to proxy assignment instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
		}

		@Override
		public List<DetailedInstructionConfirmation> getValue(MeetingInstructionDetailedStatus obj) {
			return obj.getProxyAssignmentConfirmation();
		}

		@Override
		public void setValue(MeetingInstructionDetailedStatus obj, List<DetailedInstructionConfirmation> value) {
			obj.setProxyAssignmentConfirmation(value);
		}
	};
	@XmlElement(name = "MtgAttndncConf")
	protected List<DetailedInstructionConfirmation> meetingAttendanceConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgAttndncConf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendanceConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status relative to attendance registration instruction(s)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>> mmMeetingAttendanceConfirmation = new MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>>() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "MtgAttndncConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingAttendanceConfirmation";
			definition = "Status relative to attendance registration instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
		}

		@Override
		public List<DetailedInstructionConfirmation> getValue(MeetingInstructionDetailedStatus obj) {
			return obj.getMeetingAttendanceConfirmation();
		}

		@Override
		public void setValue(MeetingInstructionDetailedStatus obj, List<DetailedInstructionConfirmation> value) {
			obj.setMeetingAttendanceConfirmation(value);
		}
	};
	@XmlElement(name = "SctiesRegnConf")
	protected List<DetailedInstructionConfirmation> securitiesRegistrationConfirmation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.DetailedInstructionConfirmation
	 * DetailedInstructionConfirmation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus MeetingStatus}
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingInstructionDetailedStatus
	 * MeetingInstructionDetailedStatus}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SctiesRegnConf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistrationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status relative to securities registration instruction(s)."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>> mmSecuritiesRegistrationConfirmation = new MMMessageAssociationEnd<MeetingInstructionDetailedStatus, List<DetailedInstructionConfirmation>>() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "SctiesRegnConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRegistrationConfirmation";
			definition = "Status relative to securities registration instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DetailedInstructionConfirmation.mmObject();
		}

		@Override
		public List<DetailedInstructionConfirmation> getValue(MeetingInstructionDetailedStatus obj) {
			return obj.getSecuritiesRegistrationConfirmation();
		}

		@Override
		public void setValue(MeetingInstructionDetailedStatus obj, List<DetailedInstructionConfirmation> value) {
			obj.setSecuritiesRegistrationConfirmation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmAccountIdentification,
						com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmParticipationRegistrationConfirmation, com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmVotingInstructionConfirmation,
						com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmProxyAssignmentConfirmation, com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmMeetingAttendanceConfirmation,
						com.tools20022.repository.msg.MeetingInstructionDetailedStatus.mmSecuritiesRegistrationConfirmation);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MeetingInstructionDetailedStatus";
				definition = "Status applying to individual instructions of a MeetingInstruction.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<Max35Text> getAccountIdentification() {
		return accountIdentification == null ? Optional.empty() : Optional.of(accountIdentification);
	}

	public MeetingInstructionDetailedStatus setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
		return this;
	}

	public List<DetailedInstructionConfirmation> getParticipationRegistrationConfirmation() {
		return participationRegistrationConfirmation == null ? participationRegistrationConfirmation = new ArrayList<>() : participationRegistrationConfirmation;
	}

	public MeetingInstructionDetailedStatus setParticipationRegistrationConfirmation(List<DetailedInstructionConfirmation> participationRegistrationConfirmation) {
		this.participationRegistrationConfirmation = Objects.requireNonNull(participationRegistrationConfirmation);
		return this;
	}

	public List<DetailedInstructionConfirmation> getVotingInstructionConfirmation() {
		return votingInstructionConfirmation == null ? votingInstructionConfirmation = new ArrayList<>() : votingInstructionConfirmation;
	}

	public MeetingInstructionDetailedStatus setVotingInstructionConfirmation(List<DetailedInstructionConfirmation> votingInstructionConfirmation) {
		this.votingInstructionConfirmation = Objects.requireNonNull(votingInstructionConfirmation);
		return this;
	}

	public List<DetailedInstructionConfirmation> getProxyAssignmentConfirmation() {
		return proxyAssignmentConfirmation == null ? proxyAssignmentConfirmation = new ArrayList<>() : proxyAssignmentConfirmation;
	}

	public MeetingInstructionDetailedStatus setProxyAssignmentConfirmation(List<DetailedInstructionConfirmation> proxyAssignmentConfirmation) {
		this.proxyAssignmentConfirmation = Objects.requireNonNull(proxyAssignmentConfirmation);
		return this;
	}

	public List<DetailedInstructionConfirmation> getMeetingAttendanceConfirmation() {
		return meetingAttendanceConfirmation == null ? meetingAttendanceConfirmation = new ArrayList<>() : meetingAttendanceConfirmation;
	}

	public MeetingInstructionDetailedStatus setMeetingAttendanceConfirmation(List<DetailedInstructionConfirmation> meetingAttendanceConfirmation) {
		this.meetingAttendanceConfirmation = Objects.requireNonNull(meetingAttendanceConfirmation);
		return this;
	}

	public List<DetailedInstructionConfirmation> getSecuritiesRegistrationConfirmation() {
		return securitiesRegistrationConfirmation == null ? securitiesRegistrationConfirmation = new ArrayList<>() : securitiesRegistrationConfirmation;
	}

	public MeetingInstructionDetailedStatus setSecuritiesRegistrationConfirmation(List<DetailedInstructionConfirmation> securitiesRegistrationConfirmation) {
		this.securitiesRegistrationConfirmation = Objects.requireNonNull(securitiesRegistrationConfirmation);
		return this;
	}
}