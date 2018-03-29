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
import com.tools20022.repository.area.seev.MeetingNotificationV05;
import com.tools20022.repository.choice.Entitlement1Choice;
import com.tools20022.repository.codeset.ResolutionStatus1Code;
import com.tools20022.repository.codeset.ResolutionType2Code;
import com.tools20022.repository.codeset.VoteInstruction1Code;
import com.tools20022.repository.codeset.VoteInstruction2Code;
import com.tools20022.repository.datatype.Max1025Text;
import com.tools20022.repository.datatype.Max350Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.MeetingEntitlement;
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
 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmIssuerLabel
 * Resolution3.mmIssuerLabel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmDescription
 * Resolution3.mmDescription}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmTitle
 * Resolution3.mmTitle}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmType
 * Resolution3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution3#mmForInformationOnly
 * Resolution3.mmForInformationOnly}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmStatus
 * Resolution3.mmStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution3#mmSubmittedBySecurityHolder
 * Resolution3.mmSubmittedBySecurityHolder}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution3#mmVoteInstructionType
 * Resolution3.mmVoteInstructionType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution3#mmManagementRecommendation
 * Resolution3.mmManagementRecommendation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Resolution3#mmNotifyingPartyRecommendation
 * Resolution3.mmNotifyingPartyRecommendation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Resolution3#mmEntitlement
 * Resolution3.mmEntitlement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Resolution Resolution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV05#mmResolution
 * MeetingNotificationV05.mmResolution}</li>
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
 * "Resolution3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Resolution2
 * Resolution2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Resolution3", propOrder = {"issuerLabel", "description", "title", "type", "forInformationOnly", "status", "submittedBySecurityHolder", "voteInstructionType", "managementRecommendation", "notifyingPartyRecommendation",
		"entitlement"})
public class Resolution3 {

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
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmIssuerLabel
	 * Resolution2.mmIssuerLabel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, Max35Text> mmIssuerLabel = new MMMessageAttribute<Resolution3, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmIssuerLabel;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "IssrLabl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerLabel";
			definition = "Numbering of the resolution as specified by the issuer or its agent.";
			previousVersion_lazy = () -> Resolution2.mmIssuerLabel;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Resolution3 obj) {
			return obj.getIssuerLabel();
		}

		@Override
		public void setValue(Resolution3 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmDescription
	 * Resolution2.mmDescription}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, Optional<Max1025Text>> mmDescription = new MMMessageAttribute<Resolution3, Optional<Max1025Text>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "Desc";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Description";
			definition = "Free text description of the resolution.";
			previousVersion_lazy = () -> Resolution2.mmDescription;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max1025Text.mmObject();
		}

		@Override
		public Optional<Max1025Text> getValue(Resolution3 obj) {
			return obj.getDescription();
		}

		@Override
		public void setValue(Resolution3 obj, Optional<Max1025Text> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmTitle
	 * Resolution2.mmTitle}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, Optional<Max350Text>> mmTitle = new MMMessageAttribute<Resolution3, Optional<Max350Text>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmTitle;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "Titl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Title";
			definition = "Abbreviated description of the resolution.";
			previousVersion_lazy = () -> Resolution2.mmTitle;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max350Text.mmObject();
		}

		@Override
		public Optional<Max350Text> getValue(Resolution3 obj) {
			return obj.getTitle();
		}

		@Override
		public void setValue(Resolution3 obj, Optional<Max350Text> value) {
			obj.setTitle(value.orElse(null));
		}
	};
	@XmlElement(name = "Tp")
	protected ResolutionType2Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionType2Code
	 * ResolutionType2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Resolution#mmType
	 * Resolution.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * definition} = "Specifies the type of resolution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmType
	 * Resolution2.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, Optional<ResolutionType2Code>> mmType = new MMMessageAttribute<Resolution3, Optional<ResolutionType2Code>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Specifies the type of resolution.";
			previousVersion_lazy = () -> Resolution2.mmType;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> ResolutionType2Code.mmObject();
		}

		@Override
		public Optional<ResolutionType2Code> getValue(Resolution3 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(Resolution3 obj, Optional<ResolutionType2Code> value) {
			obj.setType(value.orElse(null));
		}
	};
	@XmlElement(name = "ForInfOnly", required = true)
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
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmForInformationOnly
	 * Resolution2.mmForInformationOnly}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, YesNoIndicator> mmForInformationOnly = new MMMessageAttribute<Resolution3, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmForInformationOnly;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "ForInfOnly";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ForInformationOnly";
			definition = "Indicates whether the resolution is listed for information or for voting.";
			previousVersion_lazy = () -> Resolution2.mmForInformationOnly;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(Resolution3 obj) {
			return obj.getForInformationOnly();
		}

		@Override
		public void setValue(Resolution3 obj, YesNoIndicator value) {
			obj.setForInformationOnly(value);
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
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmStatus
	 * Resolution2.mmStatus}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, ResolutionStatus1Code> mmStatus = new MMMessageAttribute<Resolution3, ResolutionStatus1Code>() {
		{
			businessElementTrace_lazy = () -> MeetingStatus.mmMeetingResolutionStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "Sts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Status";
			definition = "Indicates whether the resolution is active or withdrawn.";
			previousVersion_lazy = () -> Resolution2.mmStatus;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionStatus1Code.mmObject();
		}

		@Override
		public ResolutionStatus1Code getValue(Resolution3 obj) {
			return obj.getStatus();
		}

		@Override
		public void setValue(Resolution3 obj, ResolutionStatus1Code value) {
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
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmSubmittedBySecurityHolder
	 * Resolution2.mmSubmittedBySecurityHolder}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, Optional<YesNoIndicator>> mmSubmittedBySecurityHolder = new MMMessageAttribute<Resolution3, Optional<YesNoIndicator>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmSubmittedBySecurityHolder;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "SubmittdBySctyHldr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SubmittedBySecurityHolder";
			definition = "Indicates whether the resolution has been submitted by the security holder.";
			previousVersion_lazy = () -> Resolution2.mmSubmittedBySecurityHolder;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public Optional<YesNoIndicator> getValue(Resolution3 obj) {
			return obj.getSubmittedBySecurityHolder();
		}

		@Override
		public void setValue(Resolution3 obj, Optional<YesNoIndicator> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmVoteInstructionType
	 * Resolution2.mmVoteInstructionType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, List<VoteInstruction2Code>> mmVoteInstructionType = new MMMessageAttribute<Resolution3, List<VoteInstruction2Code>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "VoteInstrTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "VoteInstructionType";
			definition = "Vote options allowed at the resolution level. When specified, it supersedes the vote options given for the meeting.";
			previousVersion_lazy = () -> Resolution2.mmVoteInstructionType;
			maxOccurs = 8;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction2Code.mmObject();
		}

		@Override
		public List<VoteInstruction2Code> getValue(Resolution3 obj) {
			return obj.getVoteInstructionType();
		}

		@Override
		public void setValue(Resolution3 obj, List<VoteInstruction2Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * "Specifies how the management of the issuing company wishes the security holders to vote."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmManagementRecommendation
	 * Resolution2.mmManagementRecommendation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, Optional<VoteInstruction1Code>> mmManagementRecommendation = new MMMessageAttribute<Resolution3, Optional<VoteInstruction1Code>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmManagementRecommendation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "MgmtRcmmndtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ManagementRecommendation";
			definition = "Specifies how the management of the issuing company wishes the security holders to vote.";
			previousVersion_lazy = () -> Resolution2.mmManagementRecommendation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction1Code.mmObject();
		}

		@Override
		public Optional<VoteInstruction1Code> getValue(Resolution3 obj) {
			return obj.getManagementRecommendation();
		}

		@Override
		public void setValue(Resolution3 obj, Optional<VoteInstruction1Code> value) {
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
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Resolution2#mmNotifyingPartyRecommendation
	 * Resolution2.mmNotifyingPartyRecommendation}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, Optional<VoteInstruction1Code>> mmNotifyingPartyRecommendation = new MMMessageAttribute<Resolution3, Optional<VoteInstruction1Code>>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmNotifyingPartyRecommendation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "NtifngPtyRcmmndtn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NotifyingPartyRecommendation";
			definition = "Indicates how the notifying party recommends that the security holders vote.";
			previousVersion_lazy = () -> Resolution2.mmNotifyingPartyRecommendation;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> VoteInstruction1Code.mmObject();
		}

		@Override
		public Optional<VoteInstruction1Code> getValue(Resolution3 obj) {
			return obj.getNotifyingPartyRecommendation();
		}

		@Override
		public void setValue(Resolution3 obj, Optional<VoteInstruction1Code> value) {
			obj.setNotifyingPartyRecommendation(value.orElse(null));
		}
	};
	@XmlElement(name = "Entitlmnt")
	protected Entitlement1Choice entitlement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.Entitlement1Choice
	 * Entitlement1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingEntitlement
	 * MeetingEntitlement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.Resolution3 Resolution3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Entitlmnt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Entitlement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes assigned per resolution to one security."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Resolution3, Optional<Entitlement1Choice>> mmEntitlement = new MMMessageAttribute<Resolution3, Optional<Entitlement1Choice>>() {
		{
			businessComponentTrace_lazy = () -> MeetingEntitlement.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.Resolution3.mmObject();
			isDerived = false;
			xmlTag = "Entitlmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Entitlement";
			definition = "Number of votes assigned per resolution to one security.";
			maxOccurs = 1;
			minOccurs = 0;
			complexType_lazy = () -> Entitlement1Choice.mmObject();
		}

		@Override
		public Optional<Entitlement1Choice> getValue(Resolution3 obj) {
			return obj.getEntitlement();
		}

		@Override
		public void setValue(Resolution3 obj, Optional<Entitlement1Choice> value) {
			obj.setEntitlement(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Resolution3.mmIssuerLabel, com.tools20022.repository.msg.Resolution3.mmDescription, com.tools20022.repository.msg.Resolution3.mmTitle,
						com.tools20022.repository.msg.Resolution3.mmType, com.tools20022.repository.msg.Resolution3.mmForInformationOnly, com.tools20022.repository.msg.Resolution3.mmStatus,
						com.tools20022.repository.msg.Resolution3.mmSubmittedBySecurityHolder, com.tools20022.repository.msg.Resolution3.mmVoteInstructionType, com.tools20022.repository.msg.Resolution3.mmManagementRecommendation,
						com.tools20022.repository.msg.Resolution3.mmNotifyingPartyRecommendation, com.tools20022.repository.msg.Resolution3.mmEntitlement);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV05.mmResolution);
				trace_lazy = () -> Resolution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Resolution3";
				definition = "Specifies an item in the agenda of the meeting. Some resolutions are submitted to the vote of the security holders, some are presented for information only.";
				previousVersion_lazy = () -> Resolution2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIssuerLabel() {
		return issuerLabel;
	}

	public Resolution3 setIssuerLabel(Max35Text issuerLabel) {
		this.issuerLabel = Objects.requireNonNull(issuerLabel);
		return this;
	}

	public Optional<Max1025Text> getDescription() {
		return description == null ? Optional.empty() : Optional.of(description);
	}

	public Resolution3 setDescription(Max1025Text description) {
		this.description = description;
		return this;
	}

	public Optional<Max350Text> getTitle() {
		return title == null ? Optional.empty() : Optional.of(title);
	}

	public Resolution3 setTitle(Max350Text title) {
		this.title = title;
		return this;
	}

	public Optional<ResolutionType2Code> getType() {
		return type == null ? Optional.empty() : Optional.of(type);
	}

	public Resolution3 setType(ResolutionType2Code type) {
		this.type = type;
		return this;
	}

	public YesNoIndicator getForInformationOnly() {
		return forInformationOnly;
	}

	public Resolution3 setForInformationOnly(YesNoIndicator forInformationOnly) {
		this.forInformationOnly = Objects.requireNonNull(forInformationOnly);
		return this;
	}

	public ResolutionStatus1Code getStatus() {
		return status;
	}

	public Resolution3 setStatus(ResolutionStatus1Code status) {
		this.status = Objects.requireNonNull(status);
		return this;
	}

	public Optional<YesNoIndicator> getSubmittedBySecurityHolder() {
		return submittedBySecurityHolder == null ? Optional.empty() : Optional.of(submittedBySecurityHolder);
	}

	public Resolution3 setSubmittedBySecurityHolder(YesNoIndicator submittedBySecurityHolder) {
		this.submittedBySecurityHolder = submittedBySecurityHolder;
		return this;
	}

	public List<VoteInstruction2Code> getVoteInstructionType() {
		return voteInstructionType == null ? voteInstructionType = new ArrayList<>() : voteInstructionType;
	}

	public Resolution3 setVoteInstructionType(List<VoteInstruction2Code> voteInstructionType) {
		this.voteInstructionType = Objects.requireNonNull(voteInstructionType);
		return this;
	}

	public Optional<VoteInstruction1Code> getManagementRecommendation() {
		return managementRecommendation == null ? Optional.empty() : Optional.of(managementRecommendation);
	}

	public Resolution3 setManagementRecommendation(VoteInstruction1Code managementRecommendation) {
		this.managementRecommendation = managementRecommendation;
		return this;
	}

	public Optional<VoteInstruction1Code> getNotifyingPartyRecommendation() {
		return notifyingPartyRecommendation == null ? Optional.empty() : Optional.of(notifyingPartyRecommendation);
	}

	public Resolution3 setNotifyingPartyRecommendation(VoteInstruction1Code notifyingPartyRecommendation) {
		this.notifyingPartyRecommendation = notifyingPartyRecommendation;
		return this;
	}

	public Optional<Entitlement1Choice> getEntitlement() {
		return entitlement == null ? Optional.empty() : Optional.of(entitlement);
	}

	public Resolution3 setEntitlement(Entitlement1Choice entitlement) {
		this.entitlement = entitlement;
		return this;
	}
}