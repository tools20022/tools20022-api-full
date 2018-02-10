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
import com.tools20022.repository.area.SecuritiesEventsPreviousVersion;
import com.tools20022.repository.choice.PartyIdentification9Choice;
import com.tools20022.repository.msg.*;
import com.tools20022.repository.msgset.ISOArchive;
import com.tools20022.repository.msgset.ProxyVotingISOPreviousversion;
import java.lang.reflect.Method;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
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
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmIdentification
 * MeetingResultDisseminationV04.mmIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmAmendment
 * MeetingResultDisseminationV04.mmAmendment}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmMeetingReference
 * MeetingResultDisseminationV04.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmReportingParty
 * MeetingResultDisseminationV04.mmReportingParty}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmSecurity
 * MeetingResultDisseminationV04.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmVoteResult
 * MeetingResultDisseminationV04.mmVoteResult}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmParticipation
 * MeetingResultDisseminationV04.mmParticipation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmAdditionalInformation
 * MeetingResultDisseminationV04.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV04#mmExtension
 * MeetingResultDisseminationV04.mmExtension}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msgset.ProxyVotingISOPreviousversion
 * ProxyVotingISOPreviousversion}</li>
 * <li>{@linkplain com.tools20022.repository.msgset.ISOArchive ISOArchive}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgRsltDssmntn"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsPreviousVersion
 * SecuritiesEventsPreviousVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.008.001.04}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingResultDisseminationV04"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nAn issuer, its agent or an intermediary sends the MeetingResultDissemination message to another intermediary, to a party holding the right to vote, to a registered security holder or to a beneficial holder to provide information on the voting results of a shareholders meeting.\r\nUsage\r\nThe MeetingResultDissemination message is used to provide the vote results per resolution. It may also provide information on the level of participation.\r\nThis message is also used to notify an update or amendment to a previously sent MeetingResultDissemination message."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05
 * MeetingResultDisseminationV05}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV03
 * MeetingResultDisseminationV03}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingResultDisseminationV04", propOrder = {"identification", "amendment", "meetingReference", "reportingParty", "security", "voteResult", "participation", "additionalInformation", "extension"})
public class MeetingResultDisseminationV04 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Id", required = true)
	protected MessageIdentification1 identification;
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
	 * xmlTag} = "Id"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Identification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Identifies the meeting dissemination notification message."</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmIdentification = new MMMessageBuildingBlock() {
		{
			xmlTag = "Id";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Identification";
			definition = "Identifies the meeting dissemination notification message.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MessageIdentification1.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV04.class.getMethod("getIdentification", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Amdmnt")
	protected AmendInformation2 amendment;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmAmendment
	 * MeetingResultDisseminationV05.mmAmendment}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAmendment = new MMMessageBuildingBlock() {
		{
			xmlTag = "Amdmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Amendment";
			definition = "Information specific to an amemdment.";
			nextVersions_lazy = () -> Arrays.asList(MeetingResultDisseminationV05.mmAmendment);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> AmendInformation2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV04.class.getMethod("getAmendment", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "MtgRef", required = true)
	protected MeetingReference4 meetingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference4
	 * MeetingReference4}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmMeetingReference
	 * MeetingResultDisseminationV05.mmMeetingReference}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmMeetingReference = new MMMessageBuildingBlock() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			nextVersions_lazy = () -> Arrays.asList(MeetingResultDisseminationV05.mmMeetingReference);
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV04.class.getMethod("getMeetingReference", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "RptgPty", required = true)
	protected PartyIdentification9Choice reportingParty;
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
				return MeetingResultDisseminationV04.class.getMethod("getReportingParty", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Scty", required = true)
	protected List<SecurityPosition6> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition6
	 * SecurityPosition6}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmSecurity
	 * MeetingResultDisseminationV05.mmSecurity}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmSecurity = new MMMessageBuildingBlock() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identifies the securities for which the meeting is organised.";
			nextVersions_lazy = () -> Arrays.asList(MeetingResultDisseminationV05.mmSecurity);
			maxOccurs = 200;
			minOccurs = 1;
			complexType_lazy = () -> SecurityPosition6.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV04.class.getMethod("getSecurity", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "VoteRslt", required = true)
	protected List<Vote5> voteResult;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmVoteResult
	 * MeetingResultDisseminationV05.mmVoteResult}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmVoteResult = new MMMessageBuildingBlock() {
		{
			xmlTag = "VoteRslt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteResult";
			definition = "Results per resolution.";
			nextVersions_lazy = () -> Arrays.asList(MeetingResultDisseminationV05.mmVoteResult);
			maxOccurs = 1000;
			minOccurs = 1;
			complexType_lazy = () -> Vote5.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV04.class.getMethod("getVoteResult", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Prtcptn")
	protected Participation3 participation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Participation3
	 * Participation3}</li>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmParticipation
	 * MeetingResultDisseminationV05.mmParticipation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmParticipation = new MMMessageBuildingBlock() {
		{
			xmlTag = "Prtcptn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Participation";
			definition = "Information about the participation to the voting process.";
			nextVersions_lazy = () -> Arrays.asList(MeetingResultDisseminationV05.mmParticipation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Participation3.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV04.class.getMethod("getParticipation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "AddtlInf")
	protected CommunicationAddress4 additionalInformation;
	/**
	 * 
	 <p>
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
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmAdditionalInformation
	 * MeetingResultDisseminationV05.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmAdditionalInformation = new MMMessageBuildingBlock() {
		{
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Information on where additionnal information can be received.";
			nextVersions_lazy = () -> Arrays.asList(MeetingResultDisseminationV05.mmAdditionalInformation);
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> CommunicationAddress4.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV04.class.getMethod("getAdditionalInformation", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};
	@XmlElement(name = "Xtnsn")
	protected List<Extension2> extension;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} = {@linkplain com.tools20022.repository.msg.Extension2
	 * Extension2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Xtnsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Extension"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock mmExtension = new MMMessageBuildingBlock() {
		{
			xmlTag = "Xtnsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Extension";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> Extension2.mmObject();
		}

		public Method getGetterMethod() {
			try {
				return MeetingResultDisseminationV04.class.getMethod("getExtension", new Class[]{});
			} catch (NoSuchMethodException e) {
				throw new RuntimeException(e);
			}
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingResultDisseminationV04";
				definition = "Scope\r\nAn issuer, its agent or an intermediary sends the MeetingResultDissemination message to another intermediary, to a party holding the right to vote, to a registered security holder or to a beneficial holder to provide information on the voting results of a shareholders meeting.\r\nUsage\r\nThe MeetingResultDissemination message is used to provide the vote results per resolution. It may also provide information on the level of participation.\r\nThis message is also used to notify an update or amendment to a previously sent MeetingResultDissemination message.";
				nextVersions_lazy = () -> Arrays.asList(MeetingResultDisseminationV05.mmObject());
				previousVersion_lazy = () -> MeetingResultDisseminationV03.mmObject();
				messageSet_lazy = () -> Arrays.asList(ProxyVotingISOPreviousversion.mmObject(), ISOArchive.mmObject());
				rootElement = "Document";
				xmlTag = "MtgRsltDssmntn";
				businessArea_lazy = () -> SecuritiesEventsPreviousVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingResultDisseminationV04.mmIdentification, com.tools20022.repository.area.seev.MeetingResultDisseminationV04.mmAmendment,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV04.mmMeetingReference, com.tools20022.repository.area.seev.MeetingResultDisseminationV04.mmReportingParty,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV04.mmSecurity, com.tools20022.repository.area.seev.MeetingResultDisseminationV04.mmVoteResult,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV04.mmParticipation, com.tools20022.repository.area.seev.MeetingResultDisseminationV04.mmAdditionalInformation,
						com.tools20022.repository.area.seev.MeetingResultDisseminationV04.mmExtension);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "008";
						version = "04";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingResultDisseminationV04.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MessageIdentification1 getIdentification() {
		return identification;
	}

	public MeetingResultDisseminationV04 setIdentification(MessageIdentification1 identification) {
		this.identification = Objects.requireNonNull(identification);
		return this;
	}

	public Optional<AmendInformation2> getAmendment() {
		return amendment == null ? Optional.empty() : Optional.of(amendment);
	}

	public MeetingResultDisseminationV04 setAmendment(AmendInformation2 amendment) {
		this.amendment = amendment;
		return this;
	}

	public MeetingReference4 getMeetingReference() {
		return meetingReference;
	}

	public MeetingResultDisseminationV04 setMeetingReference(MeetingReference4 meetingReference) {
		this.meetingReference = Objects.requireNonNull(meetingReference);
		return this;
	}

	public PartyIdentification9Choice getReportingParty() {
		return reportingParty;
	}

	public MeetingResultDisseminationV04 setReportingParty(PartyIdentification9Choice reportingParty) {
		this.reportingParty = Objects.requireNonNull(reportingParty);
		return this;
	}

	public List<SecurityPosition6> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingResultDisseminationV04 setSecurity(List<SecurityPosition6> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public List<Vote5> getVoteResult() {
		return voteResult == null ? voteResult = new ArrayList<>() : voteResult;
	}

	public MeetingResultDisseminationV04 setVoteResult(List<Vote5> voteResult) {
		this.voteResult = Objects.requireNonNull(voteResult);
		return this;
	}

	public Optional<Participation3> getParticipation() {
		return participation == null ? Optional.empty() : Optional.of(participation);
	}

	public MeetingResultDisseminationV04 setParticipation(Participation3 participation) {
		this.participation = participation;
		return this;
	}

	public Optional<CommunicationAddress4> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public MeetingResultDisseminationV04 setAdditionalInformation(CommunicationAddress4 additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public List<Extension2> getExtension() {
		return extension == null ? extension = new ArrayList<>() : extension;
	}

	public MeetingResultDisseminationV04 setExtension(List<Extension2> extension) {
		this.extension = Objects.requireNonNull(extension);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.008.001.04")
	static public class Document {
		@XmlElement(name = "MtgRsltDssmntn", required = true)
		public MeetingResultDisseminationV04 messageBody;
	}
}