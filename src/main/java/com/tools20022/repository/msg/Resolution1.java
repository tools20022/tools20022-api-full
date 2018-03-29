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

import com.tools20022.metamodel.MMMessageAttribute;
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.codeset.ResolutionStatus1Code;
import com.tools20022.repository.codeset.ResolutionType1Code;
import com.tools20022.repository.codeset.VoteInstruction1Code;
import com.tools20022.repository.codeset.VoteInstruction2Code;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.Resolution;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies an item in the agenda of the meeting. Some resolutions are
 * submitted to the vote of the security holders, some are presented for
 * information only.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#mmIssuerLabel
 * Resolution1.mmIssuerLabel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#mmDescription
 * Resolution1.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#mmTitle
 * Resolution1.mmTitle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#mmType
 * Resolution1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution1#mmForInformationOnly
 * Resolution1.mmForInformationOnly}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution1#mmStatus
 * Resolution1.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution1#mmSubmittedBySecurityHolder
 * Resolution1.mmSubmittedBySecurityHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution1#mmVoteInstructionType
 * Resolution1.mmVoteInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution1#mmManagementRecommendation
 * Resolution1.mmManagementRecommendation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution1#mmNotifyingPartyRecommendation
 * Resolution1.mmNotifyingPartyRecommendation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Resolution1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Resolution1", propOrder = {"issuerLabel", "description", "title", "type", "forInformationOnly", "status", "submittedBySecurityHolder", "voteInstructionType", "managementRecommendation", "notifyingPartyRecommendation"})
public class Resolution1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "IssrLabl", required = true)
	protected Max35Text issuerLabel;
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
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmIssuerLabel
	 * Resolution.mmIssuerLabel}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrLabl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbering of the resolution as specified by the issuer or its agent."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, Max35Text> mmIssuerLabel = new MMMessageAttribute<Resolution1, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmIssuerLabel;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "IssrLabl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerLabel";
			definition = "Numbering of the resolution as specified by the issuer or its agent.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Resolution1 obj) {
			return obj.getIssuerLabel();
		}

		@Override
		public void setValue(Resolution1 obj, Max35Text value) {
			obj.setIssuerLabel(value);
		}
	};
	@XmlElement(name = "Desc")
	protected Max1025Text description;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max1025Text
	 * Max1025Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmDescription
	 * Resolution.mmDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Desc"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Description"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Free text description of the resolution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, Optional<Max1025Text>> mmDescription = new MMMessageAttribute<Resolution1, Optional<Max1025Text>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Free text description of the resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}

		@Override
		public Optional<Max1025Text> getValue(Resolution1 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(Resolution1 obj, Optional<Max1025Text> value) {
			obj.setDescription(value.orElse(null));
		}
	};
	@XmlElement(name = "Titl")
	protected Max350Text title;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max350Text
	 * Max350Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmTitle
	 * Resolution.mmTitle}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Titl"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Title"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Abbreviated description of the resolution."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, Optional<Max350Text>> mmTitle = new MMMessageAttribute<Resolution1, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmTitle;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "Titl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Title";
			definition = "Abbreviated description of the resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Resolution1 obj) {
			return obj.getTitle();
		}

		@Override
		public void setValue(Resolution1 obj, Optional<Max350Text> value) {
			obj.setTitle(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected ResolutionType1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionType1Code
	 * ResolutionType1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmType
	 * Resolution.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Tp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Type"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether a resolution is ordinary, extraordinary or special."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, ResolutionType1Code> mmType = new MMMessageAttribute<Resolution1, ResolutionType1Code>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether a resolution is ordinary, extraordinary or special.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionType1Code.mmObject();
		}

		@Override
		public ResolutionType1Code getValue(Resolution1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Resolution1 obj, ResolutionType1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "ForInfOnly")
	protected YesNoIndicator forInformationOnly;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmForInformationOnly
	 * Resolution.mmForInformationOnly}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ForInfOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ForInformationOnly"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resolution is listed for information or for voting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, Optional<YesNoIndicator>> mmForInformationOnly = new MMMessageAttribute<Resolution1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmForInformationOnly;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "ForInfOnly";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForInformationOnly";
			definition = "Indicates whether the resolution is listed for information or for voting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Resolution1 obj) {
			return obj.getForInformationOnly();
		}

		@Override
		public void setValue(Resolution1 obj, Optional<YesNoIndicator> value) {
			obj.setForInformationOnly(value.orElse(null));
		}
	};
	@XmlElement(name = "Sts", required = true)
	protected ResolutionStatus1Code status;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionStatus1Code
	 * ResolutionStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeetingResolutionStatus
	 * MeetingStatus.mmMeetingResolutionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Sts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Status"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates whether the resolution is active or withdrawn."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, ResolutionStatus1Code> mmStatus = new MMMessageAttribute<Resolution1, ResolutionStatus1Code>() {
		{
			businessElementTrace_lazy = () -> MeetingStatus.mmMeetingResolutionStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates whether the resolution is active or withdrawn.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionStatus1Code.mmObject();
		}

		@Override
		public ResolutionStatus1Code getValue(Resolution1 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(Resolution1 obj, ResolutionStatus1Code value) {
			obj.setStatus(value);
		}
	};
	@XmlElement(name = "SubmittdBySctyHldr")
	protected YesNoIndicator submittedBySecurityHolder;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmSubmittedBySecurityHolder
	 * Resolution.mmSubmittedBySecurityHolder}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SubmittdBySctyHldr"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SubmittedBySecurityHolder"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the resolution has been submitted by the security holder."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, Optional<YesNoIndicator>> mmSubmittedBySecurityHolder = new MMMessageAttribute<Resolution1, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmSubmittedBySecurityHolder;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "SubmittdBySctyHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittedBySecurityHolder";
			definition = "Indicates whether the resolution has been submitted by the security holder.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Resolution1 obj) {
			return obj.getSubmittedBySecurityHolder();
		}

		@Override
		public void setValue(Resolution1 obj, Optional<YesNoIndicator> value) {
			obj.setSubmittedBySecurityHolder(value.orElse(null));
		}
	};
	@XmlElement(name = "VoteInstrTp")
	protected List<VoteInstruction2Code> voteInstructionType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction2Code
	 * VoteInstruction2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "VoteInstrTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "VoteInstructionType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, List<VoteInstruction2Code>> mmVoteInstructionType = new MMMessageAttribute<Resolution1, List<VoteInstruction2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "VoteInstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType";
			definition = "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting.";
			maxOccurs = 7;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction2Code.mmObject();
		}

		@Override
		public List<VoteInstruction2Code> getValue(Resolution1 obj) {
			return obj.getVoteInstructionType();
		}

		@Override
		public void setValue(Resolution1 obj, List<VoteInstruction2Code> value) {
			obj.setVoteInstructionType(value);
		}
	};
	@XmlElement(name = "MgmtRcmmndtn")
	protected VoteInstruction1Code managementRecommendation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code
	 * VoteInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmManagementRecommendation
	 * Resolution.mmManagementRecommendation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "MgmtRcmmndtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ManagementRecommendation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the management of the issuing company wishes the security holders to vote."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, Optional<VoteInstruction1Code>> mmManagementRecommendation = new MMMessageAttribute<Resolution1, Optional<VoteInstruction1Code>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmManagementRecommendation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "MgmtRcmmndtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementRecommendation";
			definition = "Indicates how the management of the issuing company wishes the security holders to vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction1Code.mmObject();
		}

		@Override
		public Optional<VoteInstruction1Code> getValue(Resolution1 obj) {
			return obj.getManagementRecommendation();
		}

		@Override
		public void setValue(Resolution1 obj, Optional<VoteInstruction1Code> value) {
			obj.setManagementRecommendation(value.orElse(null));
		}
	};
	@XmlElement(name = "NtifngPtyRcmmndtn")
	protected VoteInstruction1Code notifyingPartyRecommendation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.VoteInstruction1Code
	 * VoteInstruction1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmNotifyingPartyRecommendation
	 * Resolution.mmNotifyingPartyRecommendation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution1 Resolution1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NtifngPtyRcmmndtn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NotifyingPartyRecommendation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates how the notifying party recommends that the security holders vote."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution1, Optional<VoteInstruction1Code>> mmNotifyingPartyRecommendation = new MMMessageAttribute<Resolution1, Optional<VoteInstruction1Code>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmNotifyingPartyRecommendation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution1.mmObject();
			isDerived = false;
			xmlTag = "NtifngPtyRcmmndtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingPartyRecommendation";
			definition = "Indicates how the notifying party recommends that the security holders vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction1Code.mmObject();
		}

		@Override
		public Optional<VoteInstruction1Code> getValue(Resolution1 obj) {
			return obj.getNotifyingPartyRecommendation();
		}

		@Override
		public void setValue(Resolution1 obj, Optional<VoteInstruction1Code> value) {
			obj.setNotifyingPartyRecommendation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution1.mmIssuerLabel, com.tools20022.repository.msg.Resolution1.mmDescription, com.tools20022.repository.msg.Resolution1.mmTitle,
						com.tools20022.repository.msg.Resolution1.mmType, com.tools20022.repository.msg.Resolution1.mmForInformationOnly, com.tools20022.repository.msg.Resolution1.mmStatus,
						com.tools20022.repository.msg.Resolution1.mmSubmittedBySecurityHolder, com.tools20022.repository.msg.Resolution1.mmVoteInstructionType, com.tools20022.repository.msg.Resolution1.mmManagementRecommendation,
						com.tools20022.repository.msg.Resolution1.mmNotifyingPartyRecommendation);
				trace_lazy = () -> Resolution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Resolution1";
				definition = "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIssuerLabel() {
		return issuerLabel;
	}

	public Resolution1 setIssuerLabel(Max35Text issuerLabel) {
		this.issuerLabel = Objects.requireNonNull(issuerLabel);
		return this;
	}

	public Optional<Max1025Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public Resolution1 setDescription(Max1025Text description) {
		this.description = description;
		return this;
	}

	public Optional<Max350Text> getTitle() {
		return title == null ? Optional.empty() : Optional.of(title);
	}

	public Resolution1 setTitle(Max350Text title) {
		this.title = title;
		return this;
	}

	public ResolutionType1Code getType() {
		return type;
	}

	public Resolution1 setType(ResolutionType1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Optional<YesNoIndicator> getForInformationOnly() {
		return forInformationOnly == null ? Optional.empty() : Optional.of(forInformationOnly);
	}

	public Resolution1 setForInformationOnly(YesNoIndicator forInformationOnly) {
		this.forInformationOnly = forInformationOnly;
		return this;
	}

	public ResolutionStatus1Code getStatus() {
		return status;
	}

	public Resolution1 setStatus(ResolutionStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<YesNoIndicator> getSubmittedBySecurityHolder() {
		return submittedBySecurityHolder == null ? Optional.empty() : Optional.of(submittedBySecurityHolder);
	}

	public Resolution1 setSubmittedBySecurityHolder(YesNoIndicator submittedBySecurityHolder) {
		this.submittedBySecurityHolder = submittedBySecurityHolder;
		return this;
	}

	public List<VoteInstruction2Code> getVoteInstructionType() {
		return voteInstructionType == null ? voteInstructionType = new ArrayList<>() : voteInstructionType;
	}

	public Resolution1 setVoteInstructionType(List<VoteInstruction2Code> voteInstructionType) {
		this.voteInstructionType = Objects.requireNonNull(voteInstructionType);
		return this;
	}

	public Optional<VoteInstruction1Code> getManagementRecommendation() {
		return managementRecommendation == null ? Optional.empty() : Optional.of(managementRecommendation);
	}

	public Resolution1 setManagementRecommendation(VoteInstruction1Code managementRecommendation) {
		this.managementRecommendation = managementRecommendation;
		return this;
	}

	public Optional<VoteInstruction1Code> getNotifyingPartyRecommendation() {
		return notifyingPartyRecommendation == null ? Optional.empty() : Optional.of(notifyingPartyRecommendation);
	}

	public Resolution1 setNotifyingPartyRecommendation(VoteInstruction1Code notifyingPartyRecommendation) {
		this.notifyingPartyRecommendation = notifyingPartyRecommendation;
		return this;
	}
}