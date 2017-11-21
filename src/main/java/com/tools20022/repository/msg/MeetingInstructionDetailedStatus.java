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
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
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
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingInstructionDetailedStatus"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Status applying to individual instructions of a MeetingInstruction."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MeetingInstructionDetailedStatus", propOrder = {"accountIdentification", "participationRegistrationConfirmation", "votingInstructionConfirmation", "proxyAssignmentConfirmation", "meetingAttendanceConfirmation",
		"securitiesRegistrationConfirmation"})
public class MeetingInstructionDetailedStatus {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text accountIdentification;
	/**
	 * Unique and unambiguous identification for the account between the account
	 * owner and the account servicer.
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AccountIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Unique and unambiguous identification for the account between the account owner and the account servicer."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmAccountIdentification = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> GenericIdentification.mmIdentification;
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "AcctId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AccountIdentification";
			definition = "Unique and unambiguous identification for the account between the account owner and the account servicer.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedInstructionConfirmation> participationRegistrationConfirmation;
	/**
	 * Status relative to vote participation instruction(s).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ParticipationRegistrationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status relative to vote participation instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmParticipationRegistrationConfirmation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "PrtcptnRegnConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ParticipationRegistrationConfirmation";
			definition = "Status relative to vote participation instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedInstructionConfirmation.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedInstructionConfirmation> votingInstructionConfirmation;
	/**
	 * Status relative to vote instruction(s).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VotingInstructionConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status relative to vote instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmVotingInstructionConfirmation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "VtngInstrConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VotingInstructionConfirmation";
			definition = "Status relative to vote instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedInstructionConfirmation.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedInstructionConfirmation> proxyAssignmentConfirmation;
	/**
	 * Status relative to proxy assignment instruction(s).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ProxyAssignmentConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Status relative to proxy assignment instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmProxyAssignmentConfirmation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "PrxyAssgnmtConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ProxyAssignmentConfirmation";
			definition = "Status relative to proxy assignment instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedInstructionConfirmation.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedInstructionConfirmation> meetingAttendanceConfirmation;
	/**
	 * Status relative to attendance registration instruction(s).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingAttendanceConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status relative to attendance registration instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmMeetingAttendanceConfirmation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "MtgAttndncConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingAttendanceConfirmation";
			definition = "Status relative to attendance registration instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedInstructionConfirmation.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.DetailedInstructionConfirmation> securitiesRegistrationConfirmation;
	/**
	 * Status relative to securities registration instruction(s).
	 * <p>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SecuritiesRegistrationConfirmation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Status relative to securities registration instruction(s)."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmSecuritiesRegistrationConfirmation = new MMMessageAssociationEnd() {
		{
			businessComponentTrace_lazy = () -> MeetingStatus.mmObject();
			componentContext_lazy = () -> MeetingInstructionDetailedStatus.mmObject();
			isDerived = false;
			xmlTag = "SctiesRegnConf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SecuritiesRegistrationConfirmation";
			definition = "Status relative to securities registration instruction(s).";
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.DetailedInstructionConfirmation.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MeetingInstructionDetailedStatus.mmAccountIdentification, MeetingInstructionDetailedStatus.mmParticipationRegistrationConfirmation,
						MeetingInstructionDetailedStatus.mmVotingInstructionConfirmation, MeetingInstructionDetailedStatus.mmProxyAssignmentConfirmation, MeetingInstructionDetailedStatus.mmMeetingAttendanceConfirmation,
						MeetingInstructionDetailedStatus.mmSecuritiesRegistrationConfirmation);
				trace_lazy = () -> MeetingStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "MeetingInstructionDetailedStatus";
				definition = "Status applying to individual instructions of a MeetingInstruction.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "AcctId")
	public Max35Text getAccountIdentification() {
		return accountIdentification;
	}

	public void setAccountIdentification(Max35Text accountIdentification) {
		this.accountIdentification = accountIdentification;
	}

	@XmlElement(name = "PrtcptnRegnConf")
	public List<DetailedInstructionConfirmation> getParticipationRegistrationConfirmation() {
		return participationRegistrationConfirmation;
	}

	public void setParticipationRegistrationConfirmation(List<com.tools20022.repository.msg.DetailedInstructionConfirmation> participationRegistrationConfirmation) {
		this.participationRegistrationConfirmation = participationRegistrationConfirmation;
	}

	@XmlElement(name = "VtngInstrConf")
	public List<DetailedInstructionConfirmation> getVotingInstructionConfirmation() {
		return votingInstructionConfirmation;
	}

	public void setVotingInstructionConfirmation(List<com.tools20022.repository.msg.DetailedInstructionConfirmation> votingInstructionConfirmation) {
		this.votingInstructionConfirmation = votingInstructionConfirmation;
	}

	@XmlElement(name = "PrxyAssgnmtConf")
	public List<DetailedInstructionConfirmation> getProxyAssignmentConfirmation() {
		return proxyAssignmentConfirmation;
	}

	public void setProxyAssignmentConfirmation(List<com.tools20022.repository.msg.DetailedInstructionConfirmation> proxyAssignmentConfirmation) {
		this.proxyAssignmentConfirmation = proxyAssignmentConfirmation;
	}

	@XmlElement(name = "MtgAttndncConf")
	public List<DetailedInstructionConfirmation> getMeetingAttendanceConfirmation() {
		return meetingAttendanceConfirmation;
	}

	public void setMeetingAttendanceConfirmation(List<com.tools20022.repository.msg.DetailedInstructionConfirmation> meetingAttendanceConfirmation) {
		this.meetingAttendanceConfirmation = meetingAttendanceConfirmation;
	}

	@XmlElement(name = "SctiesRegnConf")
	public List<DetailedInstructionConfirmation> getSecuritiesRegistrationConfirmation() {
		return securitiesRegistrationConfirmation;
	}

	public void setSecuritiesRegistrationConfirmation(List<com.tools20022.repository.msg.DetailedInstructionConfirmation> securitiesRegistrationConfirmation) {
		this.securitiesRegistrationConfirmation = securitiesRegistrationConfirmation;
	}
}