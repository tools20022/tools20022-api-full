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
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * An issuer, its agent or an intermediary sends the MeetingResultDissemination
 * message to another intermediary, to a party holding the right to vote, to a
 * registered security holder or to a beneficial holder to provide information
 * on the voting results of a shareholders meeting.<br>
 * <b>Usage</b><br>
 * The MeetingResultDissemination message is used to provide the vote results
 * per resolution. It may also provide information on the level of
 * participation.<br>
 * This message is also used to notify an update or amendment to a previously
 * sent MeetingResultDissemination message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsArchive
 * SecuritiesEventsArchive}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgRsltDssmntn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmMeetingResultDisseminationIdentification
 * MeetingResultDisseminationV02.mmMeetingResultDisseminationIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmAmendment
 * MeetingResultDisseminationV02.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmMeetingReference
 * MeetingResultDisseminationV02.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmReportingParty
 * MeetingResultDisseminationV02.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmSecurity
 * MeetingResultDisseminationV02.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmVoteResult
 * MeetingResultDisseminationV02.mmVoteResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmParticipation
 * MeetingResultDisseminationV02.mmParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV02#mmAdditionalInformation
 * MeetingResultDisseminationV02.mmAdditionalInformation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.008.001.02}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingResultDisseminationV02"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn issuer, its agent or an intermediary sends the MeetingResultDissemination message to another intermediary, to a party holding the right to vote, to a registered security holder or to a beneficial holder to provide information on the voting results of a shareholders meeting.\r\nUsage\r\nThe MeetingResultDissemination message is used to provide the vote results per resolution. It may also provide information on the level of participation.\r\nThis message is also used to notify an update or amendment to a previously sent MeetingResultDissemination message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV03
 * MeetingResultDisseminationV03}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MeetingResultDisseminationV02", propOrder = {"meetingResultDisseminationIdentification", "amendment", "meetingReference", "reportingParty", "security", "voteResult", "participation", "additionalInformation"})
public class MeetingResultDisseminationV02 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	protected MessageIdentification1 meetingResultDisseminationIdentification;
	/**
	 * Identifies the meeting dissemination notification message.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MessageIdentification1
	 * MessageIdentification1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgRsltDssmntnId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingResultDisseminationIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the meeting dissemination notification message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMeetingResultDisseminationIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgRsltDssmntnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingResultDisseminationIdentification";
			definition = "Identifies the meeting dissemination notification message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV02.class.getMethod("getMeetingResultDisseminationIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected AmendInformation2 amendment;
	/**
	 * Information specific to an amemdment.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.AmendInformation2
	 * AmendInformation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Amdmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Amendment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Information specific to an amemdment."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAmendment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Amdmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Information specific to an amemdment.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmendInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV02.class.getMethod("getAmendment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected MeetingReference3 meetingReference;
	/**
	 * Series of elements which allow to identify a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference3
	 * MeetingReference3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MtgRef"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "MeetingReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Series of elements which allow to identify a meeting."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMeetingReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV02.class.getMethod("getMeetingReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected PartyIdentification9Choice reportingParty;
	/**
	 * Party reporting the meeting results.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.PartyIdentification9Choice
	 * PartyIdentification9Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RptgPty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReportingParty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party reporting the meeting results."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmReportingParty = new MMMessageBuildingBlock() {
		{
			xmlTag = "RptgPty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReportingParty";
			definition = "Party reporting the meeting results.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> PartyIdentification9Choice.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV02.class.getMethod("getReportingParty", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<SecurityPosition5> security;
	/**
	 * Identifies the securities for which the meeting is organised.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition5
	 * SecurityPosition5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Scty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Security"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the securities for which the meeting is organised."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurity = new MMMessageBuildingBlock() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identifies the securities for which the meeting is organised.";
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV02.class.getMethod("getSecurity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected List<Vote5> voteResult;
	/**
	 * Results per resolution.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Vote5 Vote5}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteRslt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteResult"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Results per resolution."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmVoteResult = new MMMessageBuildingBlock() {
		{
			xmlTag = "VoteRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteResult";
			definition = "Results per resolution.";
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> Vote5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV02.class.getMethod("getVoteResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected Participation2 participation;
	/**
	 * Information about the participation to the voting process.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Participation2
	 * Participation2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Prtcptn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Participation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information about the participation to the voting process."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmParticipation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Prtcptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Participation";
			definition = "Information about the participation to the voting process.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Participation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV02.class.getMethod("getParticipation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	protected CommunicationAddress4 additionalInformation;
	/**
	 * Information on where additionnal information can be received.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.CommunicationAddress4
	 * CommunicationAddress4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Information on where additionnal information can be received."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Information on where additionnal information can be received.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommunicationAddress4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV02.class.getMethod("getAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingResultDisseminationV02";
				definition = "Scope\r\nAn issuer, its agent or an intermediary sends the MeetingResultDissemination message to another intermediary, to a party holding the right to vote, to a registered security holder or to a beneficial holder to provide information on the voting results of a shareholders meeting.\r\nUsage\r\nThe MeetingResultDissemination message is used to provide the vote results per resolution. It may also provide information on the level of participation.\r\nThis message is also used to notify an update or amendment to a previously sent MeetingResultDissemination message.";
				nextVersions_lazy = () -> Arrays.asList(MeetingResultDisseminationV03.mmObject());
				messageSet_lazy = () -> Arrays.asList(ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgRsltDssmntn";
				businessArea_lazy = () -> SecuritiesEventsArchive.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingResultDisseminationV02.mmMeetingResultDisseminationIdentification,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV02.mmAmendment, com.tools20022.repository.area.seev.MeetingResultDisseminationV02.mmMeetingReference,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV02.mmReportingParty, com.tools20022.repository.area.seev.MeetingResultDisseminationV02.mmSecurity,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV02.mmVoteResult, com.tools20022.repository.area.seev.MeetingResultDisseminationV02.mmParticipation,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV02.mmAdditionalInformation);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "008";
						version = "02";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingResultDisseminationV02.class;
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "MtgRsltDssmntnId", required = true)
	public MessageIdentification1 getMeetingResultDisseminationIdentification() {
		return meetingResultDisseminationIdentification;
	}

	public void setMeetingResultDisseminationIdentification(MessageIdentification1 meetingResultDisseminationIdentification) {
		this.meetingResultDisseminationIdentification = meetingResultDisseminationIdentification;
	}

	@XmlElement(name = "Amdmnt")
	public AmendInformation2 getAmendment() {
		return amendment;
	}

	public void setAmendment(AmendInformation2 amendment) {
		this.amendment = amendment;
	}

	@XmlElement(name = "MtgRef", required = true)
	public MeetingReference3 getMeetingReference() {
		return meetingReference;
	}

	public void setMeetingReference(MeetingReference3 meetingReference) {
		this.meetingReference = meetingReference;
	}

	@XmlElement(name = "RptgPty", required = true)
	public PartyIdentification9Choice getReportingParty() {
		return reportingParty;
	}

	public void setReportingParty(PartyIdentification9Choice reportingParty) {
		this.reportingParty = reportingParty;
	}

	@XmlElement(name = "Scty", required = true)
	public List<SecurityPosition5> getSecurity() {
		return security;
	}

	public void setSecurity(List<SecurityPosition5> security) {
		this.security = security;
	}

	@XmlElement(name = "VoteRslt", required = true)
	public List<Vote5> getVoteResult() {
		return voteResult;
	}

	public void setVoteResult(List<Vote5> voteResult) {
		this.voteResult = voteResult;
	}

	@XmlElement(name = "Prtcptn")
	public Participation2 getParticipation() {
		return participation;
	}

	public void setParticipation(Participation2 participation) {
		this.participation = participation;
	}

	@XmlElement(name = "AddtlInf")
	public CommunicationAddress4 getAdditionalInformation() {
		return additionalInformation;
	}

	public void setAdditionalInformation(CommunicationAddress4 additionalInformation) {
		this.additionalInformation = additionalInformation;
	}

	@XmlRootElement(namespace = "urn:iso:std:iso:20022:tech:xsd:seev.008.02.02")
	static public class Document {
		@XmlElement(name = "MtgRsltDssmntn", required = true)
		public MeetingResultDisseminationV02 messageBody;
	}
}