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
import com.tools20022.repository.area.seev.MeetingResultDisseminationV05;
import com.tools20022.repository.codeset.ResolutionStatus2Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.Number;
import com.tools20022.repository.entity.MeetingStatus;
import com.tools20022.repository.entity.Resolution;
import com.tools20022.repository.entity.Vote;
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
 * Indicates the number of voting rights cast to a resolution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmIssuerLabel
 * Vote7.mmIssuerLabel}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmResolutionStatus
 * Vote7.mmResolutionStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmFor Vote7.mmFor}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmAgainst
 * Vote7.mmAgainst}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmAbstain
 * Vote7.mmAbstain}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmWithhold
 * Vote7.mmWithhold}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmOneYear
 * Vote7.mmOneYear}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmTwoYears
 * Vote7.mmTwoYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmThreeYears
 * Vote7.mmThreeYears}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Vote7#mmNoAction
 * Vote7.mmNoAction}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Vote Vote}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingResultDisseminationV05#mmVoteResult
 * MeetingResultDisseminationV05.mmVoteResult}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Vote7"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Indicates the number of voting rights cast to a resolution."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} = {@linkplain com.tools20022.repository.msg.Vote5 Vote5}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Vote7", propOrder = {"issuerLabel", "resolutionStatus", "for_", "against", "abstain", "withhold", "oneYear", "twoYears", "threeYears", "noAction"})
public class Vote7 {

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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IssrLabl"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "IssuerLabel"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Numbering of the resolution as specified by the issuer or its agent."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote5#mmIssuerLabel
	 * Vote5.mmIssuerLabel}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, Max35Text> mmIssuerLabel = new MMMessageAttribute<Vote7, Max35Text>() {
		{
			businessElementTrace_lazy = () -> Resolution.mmIssuerLabel;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "IssrLabl";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "IssuerLabel";
			definition = "Numbering of the resolution as specified by the issuer or its agent.";
			previousVersion_lazy = () -> Vote5.mmIssuerLabel;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(Vote7 obj) {
			return obj.getIssuerLabel();
		}

		@Override
		public void setValue(Vote7 obj, Max35Text value) {
			obj.setIssuerLabel(value);
		}
	};
	@XmlElement(name = "RsltnSts", required = true)
	protected ResolutionStatus2Code resolutionStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.ResolutionStatus2Code
	 * ResolutionStatus2Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatus#mmMeetingResolutionStatus
	 * MeetingStatus.mmMeetingResolutionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RsltnSts"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResolutionStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the acceptance status of a resolution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote5#mmAccepted
	 * Vote5.mmAccepted}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, ResolutionStatus2Code> mmResolutionStatus = new MMMessageAttribute<Vote7, ResolutionStatus2Code>() {
		{
			businessElementTrace_lazy = () -> MeetingStatus.mmMeetingResolutionStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "RsltnSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResolutionStatus";
			definition = "Specifies the acceptance status of a resolution.";
			previousVersion_lazy = () -> Vote5.mmAccepted;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ResolutionStatus2Code.mmObject();
		}

		@Override
		public ResolutionStatus2Code getValue(Vote7 obj) {
			return obj.getResolutionStatus();
		}

		@Override
		public void setValue(Vote7 obj, ResolutionStatus2Code value) {
			obj.setResolutionStatus(value);
		}
	};
	@XmlElement(name = "For")
	protected Number for_;
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
	 * {@linkplain com.tools20022.repository.entity.Vote#mmFor Vote.mmFor}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "For"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "For"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes in favour of one resolution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} = {@linkplain com.tools20022.repository.msg.Vote5#mmFor
	 * Vote5.mmFor}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, Optional<Number>> mmFor = new MMMessageAttribute<Vote7, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmFor;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "For";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "For";
			definition = "Number of votes in favour of one resolution.";
			previousVersion_lazy = () -> Vote5.mmFor;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote7 obj) {
			return obj.getFor();
		}

		@Override
		public void setValue(Vote7 obj, Optional<Number> value) {
			obj.setFor(value.orElse(null));
		}
	};
	@XmlElement(name = "Agnst")
	protected Number against;
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
	 * {@linkplain com.tools20022.repository.entity.Vote#mmAgainst
	 * Vote.mmAgainst}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Agnst"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Against"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes against one resolution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote5#mmAgainst
	 * Vote5.mmAgainst}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, Optional<Number>> mmAgainst = new MMMessageAttribute<Vote7, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmAgainst;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "Agnst";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Against";
			definition = "Number of votes against one resolution.";
			previousVersion_lazy = () -> Vote5.mmAgainst;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote7 obj) {
			return obj.getAgainst();
		}

		@Override
		public void setValue(Vote7 obj, Optional<Number> value) {
			obj.setAgainst(value.orElse(null));
		}
	};
	@XmlElement(name = "Abstn")
	protected Number abstain;
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
	 * {@linkplain com.tools20022.repository.entity.Vote#mmAbstain
	 * Vote.mmAbstain}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Abstn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Abstain"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes expressed as abstain."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote5#mmAbstain
	 * Vote5.mmAbstain}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, Optional<Number>> mmAbstain = new MMMessageAttribute<Vote7, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmAbstain;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "Abstn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Abstain";
			definition = "Number of votes expressed as abstain.";
			previousVersion_lazy = () -> Vote5.mmAbstain;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote7 obj) {
			return obj.getAbstain();
		}

		@Override
		public void setValue(Vote7 obj, Optional<Number> value) {
			obj.setAbstain(value.orElse(null));
		}
	};
	@XmlElement(name = "Wthhld")
	protected Number withhold;
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
	 * {@linkplain com.tools20022.repository.entity.Vote#mmWithhold
	 * Vote.mmWithhold}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Wthhld"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Withhold"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total votes withheld, for example, in the case where a shareholder wishes not to endorse the election of a board member."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote5#mmWithhold
	 * Vote5.mmWithhold}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, Optional<Number>> mmWithhold = new MMMessageAttribute<Vote7, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmWithhold;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "Wthhld";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Withhold";
			definition = "Total votes withheld, for example, in the case where a shareholder wishes not to endorse the election of a board member.";
			previousVersion_lazy = () -> Vote5.mmWithhold;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote7 obj) {
			return obj.getWithhold();
		}

		@Override
		public void setValue(Vote7 obj, Optional<Number> value) {
			obj.setWithhold(value.orElse(null));
		}
	};
	@XmlElement(name = "OneYr")
	protected Number oneYear;
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
	 * {@linkplain com.tools20022.repository.entity.Vote#mmOneYear
	 * Vote.mmOneYear}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OneYr"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OneYear"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour for one year for \"say on pay\" type of resolution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, Optional<Number>> mmOneYear = new MMMessageAttribute<Vote7, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmOneYear;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "OneYr";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OneYear";
			definition = "Number of votes in favour for one year for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote7 obj) {
			return obj.getOneYear();
		}

		@Override
		public void setValue(Vote7 obj, Optional<Number> value) {
			obj.setOneYear(value.orElse(null));
		}
	};
	@XmlElement(name = "TwoYrs")
	protected Number twoYears;
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
	 * {@linkplain com.tools20022.repository.entity.Vote#mmTwoYears
	 * Vote.mmTwoYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TwoYrs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TwoYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of two years for \"say on pay\" type of resolution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, Optional<Number>> mmTwoYears = new MMMessageAttribute<Vote7, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmTwoYears;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "TwoYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TwoYears";
			definition = "Number of votes in favour of two years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote7 obj) {
			return obj.getTwoYears();
		}

		@Override
		public void setValue(Vote7 obj, Optional<Number> value) {
			obj.setTwoYears(value.orElse(null));
		}
	};
	@XmlElement(name = "ThreeYrs")
	protected Number threeYears;
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
	 * {@linkplain com.tools20022.repository.entity.Vote#mmThreeYears
	 * Vote.mmThreeYears}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ThreeYrs"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ThreeYears"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Number of votes in favour of three years for \"say on pay\" type of resolution."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, Optional<Number>> mmThreeYears = new MMMessageAttribute<Vote7, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmThreeYears;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "ThreeYrs";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ThreeYears";
			definition = "Number of votes in favour of three years for \"say on pay\" type of resolution.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote7 obj) {
			return obj.getThreeYears();
		}

		@Override
		public void setValue(Vote7 obj, Optional<Number> value) {
			obj.setThreeYears(value.orElse(null));
		}
	};
	@XmlElement(name = "NoActn")
	protected Number noAction;
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
	 * {@linkplain com.tools20022.repository.entity.Vote#mmNoAction
	 * Vote.mmNoAction}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Vote7
	 * Vote7}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "NoActn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "NoAction"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Number of votes for which no action has been taken."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.Vote5#mmNoAction
	 * Vote5.mmNoAction}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<Vote7, Optional<Number>> mmNoAction = new MMMessageAttribute<Vote7, Optional<Number>>() {
		{
			businessElementTrace_lazy = () -> Vote.mmNoAction;
			componentContext_lazy = () -> com.tools20022.repository.msg.Vote7.mmObject();
			isDerived = false;
			xmlTag = "NoActn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "NoAction";
			definition = "Number of votes for which no action has been taken.";
			previousVersion_lazy = () -> Vote5.mmNoAction;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Number.mmObject();
		}

		@Override
		public Optional<Number> getValue(Vote7 obj) {
			return obj.getNoAction();
		}

		@Override
		public void setValue(Vote7 obj, Optional<Number> value) {
			obj.setNoAction(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Vote7.mmIssuerLabel, com.tools20022.repository.msg.Vote7.mmResolutionStatus, com.tools20022.repository.msg.Vote7.mmFor,
						com.tools20022.repository.msg.Vote7.mmAgainst, com.tools20022.repository.msg.Vote7.mmAbstain, com.tools20022.repository.msg.Vote7.mmWithhold, com.tools20022.repository.msg.Vote7.mmOneYear,
						com.tools20022.repository.msg.Vote7.mmTwoYears, com.tools20022.repository.msg.Vote7.mmThreeYears, com.tools20022.repository.msg.Vote7.mmNoAction);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingResultDisseminationV05.mmVoteResult);
				trace_lazy = () -> Vote.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "Vote7";
				definition = "Indicates the number of voting rights cast to a resolution.";
				previousVersion_lazy = () -> Vote5.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getIssuerLabel() {
		return issuerLabel;
	}

	public Vote7 setIssuerLabel(Max35Text issuerLabel) {
		this.issuerLabel = Objects.requireNonNull(issuerLabel);
		return this;
	}

	public ResolutionStatus2Code getResolutionStatus() {
		return resolutionStatus;
	}

	public Vote7 setResolutionStatus(ResolutionStatus2Code resolutionStatus) {
		this.resolutionStatus = Objects.requireNonNull(resolutionStatus);
		return this;
	}

	public Optional<Number> getFor() {
		return for_ == null ? Optional.empty() : Optional.of(for_);
	}

	public Vote7 setFor(Number for_) {
		this.for_ = for_;
		return this;
	}

	public Optional<Number> getAgainst() {
		return against == null ? Optional.empty() : Optional.of(against);
	}

	public Vote7 setAgainst(Number against) {
		this.against = against;
		return this;
	}

	public Optional<Number> getAbstain() {
		return abstain == null ? Optional.empty() : Optional.of(abstain);
	}

	public Vote7 setAbstain(Number abstain) {
		this.abstain = abstain;
		return this;
	}

	public Optional<Number> getWithhold() {
		return withhold == null ? Optional.empty() : Optional.of(withhold);
	}

	public Vote7 setWithhold(Number withhold) {
		this.withhold = withhold;
		return this;
	}

	public Optional<Number> getOneYear() {
		return oneYear == null ? Optional.empty() : Optional.of(oneYear);
	}

	public Vote7 setOneYear(Number oneYear) {
		this.oneYear = oneYear;
		return this;
	}

	public Optional<Number> getTwoYears() {
		return twoYears == null ? Optional.empty() : Optional.of(twoYears);
	}

	public Vote7 setTwoYears(Number twoYears) {
		this.twoYears = twoYears;
		return this;
	}

	public Optional<Number> getThreeYears() {
		return threeYears == null ? Optional.empty() : Optional.of(threeYears);
	}

	public Vote7 setThreeYears(Number threeYears) {
		this.threeYears = threeYears;
		return this;
	}

	public Optional<Number> getNoAction() {
		return noAction == null ? Optional.empty() : Optional.of(noAction);
	}

	public Vote7 setNoAction(Number noAction) {
		this.noAction = noAction;
		return this;
	}
}