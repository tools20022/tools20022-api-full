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
import com.tools20022.repository.area.SecuritiesEventsLatestVersion;
import com.tools20022.repository.msg.MeetingCancellationReason2;
import com.tools20022.repository.msg.MeetingReference6;
import com.tools20022.repository.msg.SecurityPosition8;
import com.tools20022.repository.msg.SupplementaryData1;
import com.tools20022.repository.msgset.ProxyVotingISOLatestversion;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.*;

/**
 * <b>Scope</b><br>
 * The MeetingCancellation message is sent by the party that sent the
 * MeetingNotification message to the original receiver. It is sent to cancel
 * the previous MeetingNotification message or to advise the cancellation of a
 * meeting.<br>
 * <b>Usage</b><br>
 * The MeetingCancellation message is used in two different situations.<br>
 * First, it is used to cancel a previously sent MeetingNotification message. In
 * this case, the MessageCancellation, the MeetingReference and the Reason
 * building blocks need to be present.<br>
 * Second, it is used to advise that the meeting is cancelled. In this case,
 * only the MeetingReference and Reason building blocks need to be present.<br>
 * This message definition is intended for use with the Business Application
 * Header (head.001.001.01).
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05#mmMeetingReference
 * MeetingCancellationV05.mmMeetingReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05#mmSecurity
 * MeetingCancellationV05.mmSecurity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05#mmReason
 * MeetingCancellationV05.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05#mmSupplementaryData
 * MeetingCancellationV05.mmSupplementaryData}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageSet
 * messageSet} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msgset.ProxyVotingISOLatestversion
 * ProxyVotingISOLatestversion}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getRootElement
 * rootElement} = "Document"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getXmlTag
 * xmlTag} = "MtgCxl"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageDefinition#getBusinessArea
 * businessArea} =
 * {@linkplain com.tools20022.repository.area.SecuritiesEventsLatestVersion
 * SecuritiesEventsLatestVersion}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageDefinition#getMessageDefinitionIdentifier
 * messageDefinitionIdentifier} = {@code seev.002.001.05}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCancellation1Guideline#for_seev_MeetingCancellationV05
 * ConstraintCancellation1Guideline.for_seev_MeetingCancellationV05}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingCancellationV05"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Scope\r\nThe MeetingCancellation message is sent by the party that sent the MeetingNotification message to the original receiver. It is sent to cancel the previous MeetingNotification message or to advise the cancellation of a meeting.\r\nUsage\r\nThe MeetingCancellation message is used in two different situations.\r\nFirst, it is used to cancel a previously sent MeetingNotification message. In this case, the MessageCancellation, the MeetingReference and the Reason building blocks need to be present.\r\nSecond, it is used to advise that the meeting is cancelled. In this case, only the MeetingReference and Reason building blocks need to be present.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01)."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04
 * MeetingCancellationV04}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MeetingCancellationV05", propOrder = {"meetingReference", "security", "reason", "supplementaryData"})
public class MeetingCancellationV05 {

	final static private AtomicReference<MMMessageDefinition> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "MtgRef", required = true)
	protected MeetingReference6 meetingReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingReference6
	 * MeetingReference6}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmMeetingReference
	 * MeetingCancellationV04.mmMeetingReference}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV05, MeetingReference6> mmMeetingReference = new MMMessageBuildingBlock<MeetingCancellationV05, MeetingReference6>() {
		{
			xmlTag = "MtgRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "MeetingReference";
			definition = "Series of elements which allow to identify a meeting.";
			previousVersion_lazy = () -> MeetingCancellationV04.mmMeetingReference;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingReference6.mmObject();
		}

		@Override
		public MeetingReference6 getValue(MeetingCancellationV05 obj) {
			return obj.getMeetingReference();
		}

		@Override
		public void setValue(MeetingCancellationV05 obj, MeetingReference6 value) {
			obj.setMeetingReference(value);
		}
	};
	@XmlElement(name = "Scty")
	protected List<SecurityPosition8> security;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SecurityPosition8
	 * SecurityPosition8}</li>
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
	 * "Identifies the security for which the meeting was organised."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmSecurity
	 * MeetingCancellationV04.mmSecurity}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV05, List<SecurityPosition8>> mmSecurity = new MMMessageBuildingBlock<MeetingCancellationV05, List<SecurityPosition8>>() {
		{
			xmlTag = "Scty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Security";
			definition = "Identifies the security for which the meeting was organised.";
			previousVersion_lazy = () -> MeetingCancellationV04.mmSecurity;
			maxOccurs = 200;
			minOccurs = 0;
			complexType_lazy = () -> SecurityPosition8.mmObject();
		}

		@Override
		public List<SecurityPosition8> getValue(MeetingCancellationV05 obj) {
			return obj.getSecurity();
		}

		@Override
		public void setValue(MeetingCancellationV05 obj, List<SecurityPosition8> value) {
			obj.setSecurity(value);
		}
	};
	@XmlElement(name = "Rsn", required = true)
	protected MeetingCancellationReason2 reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2
	 * MeetingCancellationReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Defines the justification for the cancellation."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmReason
	 * MeetingCancellationV04.mmReason}</li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV05, MeetingCancellationReason2> mmReason = new MMMessageBuildingBlock<MeetingCancellationV05, MeetingCancellationReason2>() {
		{
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Defines the justification for the cancellation.";
			previousVersion_lazy = () -> MeetingCancellationV04.mmReason;
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> MeetingCancellationReason2.mmObject();
		}

		@Override
		public MeetingCancellationReason2 getValue(MeetingCancellationV05 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(MeetingCancellationV05 obj, MeetingCancellationReason2 value) {
			obj.setReason(value);
		}
	};
	@XmlElement(name = "SplmtryData")
	protected List<SupplementaryData1> supplementaryData;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageBuildingBlock#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.msg.SupplementaryData1
	 * SupplementaryData1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "SplmtryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "SupplementaryData"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information that can not be captured in the structured fields and/or any other specific block."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageBuildingBlock<MeetingCancellationV05, List<SupplementaryData1>> mmSupplementaryData = new MMMessageBuildingBlock<MeetingCancellationV05, List<SupplementaryData1>>() {
		{
			xmlTag = "SplmtryData";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "SupplementaryData";
			definition = "Additional information that can not be captured in the structured fields and/or any other specific block.";
			minOccurs = 0;
			complexType_lazy = () -> SupplementaryData1.mmObject();
		}

		@Override
		public List<SupplementaryData1> getValue(MeetingCancellationV05 obj) {
			return obj.getSupplementaryData();
		}

		@Override
		public void setValue(MeetingCancellationV05 obj, List<SupplementaryData1> value) {
			obj.setSupplementaryData(value);
		}
	};

	final static public MMMessageDefinition mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageDefinition() {
			{
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCancellation1Guideline.for_seev_MeetingCancellationV05);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingCancellationV05";
				definition = "Scope\r\nThe MeetingCancellation message is sent by the party that sent the MeetingNotification message to the original receiver. It is sent to cancel the previous MeetingNotification message or to advise the cancellation of a meeting.\r\nUsage\r\nThe MeetingCancellation message is used in two different situations.\r\nFirst, it is used to cancel a previously sent MeetingNotification message. In this case, the MessageCancellation, the MeetingReference and the Reason building blocks need to be present.\r\nSecond, it is used to advise that the meeting is cancelled. In this case, only the MeetingReference and Reason building blocks need to be present.\r\nThis message definition is intended for use with the Business Application Header (head.001.001.01).";
				previousVersion_lazy = () -> MeetingCancellationV04.mmObject();
				messageSet_lazy = () -> Arrays.asList(ProxyVotingISOLatestversion.mmObject());
				rootElement = "Document";
				xmlTag = "MtgCxl";
				businessArea_lazy = () -> SecuritiesEventsLatestVersion.mmObject();
				messageBuildingBlock_lazy = () -> Arrays.asList(com.tools20022.repository.area.seev.MeetingCancellationV05.mmMeetingReference, com.tools20022.repository.area.seev.MeetingCancellationV05.mmSecurity,
						com.tools20022.repository.area.seev.MeetingCancellationV05.mmReason, com.tools20022.repository.area.seev.MeetingCancellationV05.mmSupplementaryData);
				messageDefinitionIdentifier_lazy = () -> new MMMessageDefinitionIdentifier() {
					{
						businessArea = "seev";
						messageFunctionality = "002";
						version = "05";
						flavour = "001";
					}
				};
			}

			@Override
			public Class<?> getInstanceClass() {
				return MeetingCancellationV05.class;
			}
		});
		return mmObject_lazy.get();
	}

	public MeetingReference6 getMeetingReference() {
		return meetingReference;
	}

	public MeetingCancellationV05 setMeetingReference(MeetingReference6 meetingReference) {
		this.meetingReference = Objects.requireNonNull(meetingReference);
		return this;
	}

	public List<SecurityPosition8> getSecurity() {
		return security == null ? security = new ArrayList<>() : security;
	}

	public MeetingCancellationV05 setSecurity(List<SecurityPosition8> security) {
		this.security = Objects.requireNonNull(security);
		return this;
	}

	public MeetingCancellationReason2 getReason() {
		return reason;
	}

	public MeetingCancellationV05 setReason(MeetingCancellationReason2 reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public List<SupplementaryData1> getSupplementaryData() {
		return supplementaryData == null ? supplementaryData = new ArrayList<>() : supplementaryData;
	}

	public MeetingCancellationV05 setSupplementaryData(List<SupplementaryData1> supplementaryData) {
		this.supplementaryData = Objects.requireNonNull(supplementaryData);
		return this;
	}

	@XmlRootElement(name = "Document", namespace = "urn:iso:std:iso:20022:tech:xsd:seev.002.001.05")
	static public class Document {
		@XmlElement(name = "MtgCxl", required = true)
		public MeetingCancellationV05 messageBody;
	}
}