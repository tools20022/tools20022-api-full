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

import com.tools20022.metamodel.*;
import com.tools20022.repository.area.seev.MeetingNotificationV02;
import com.tools20022.repository.choice.DateFormat2Choice;
import com.tools20022.repository.choice.LocationFormat1Choice;
import com.tools20022.repository.codeset.MeetingDateStatus1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.entity.Quorum;
import com.tools20022.repository.GeneratedRepository;
import java.text.DateFormat;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the physical parameters of a shareholders meeting. Several dates
 * and places can be defined for a meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Meeting2#QuorumQuantityOrPercentageRule
 * Meeting2.QuorumQuantityOrPercentageRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmDateAndTime
 * Meeting2.mmDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmDateStatus
 * Meeting2.mmDateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmQuorumRequired
 * Meeting2.mmQuorumRequired}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmLocation
 * Meeting2.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmQuorumQuantity
 * Meeting2.mmQuorumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Meeting2#mmQuorumQuantityPercentage
 * Meeting2.mmQuorumQuantityPercentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingNotificationV02#mmMeetingDetails
 * MeetingNotificationV02.mmMeetingDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintDateAndTimeAndDateStatus1Rule#forMeeting2
 * ConstraintDateAndTimeAndDateStatus1Rule.forMeeting2}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "Meeting2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the physical parameters of a shareholders meeting. Several dates and places can be defined for a meeting."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "Meeting2", propOrder = {"dateAndTime", "dateStatus", "quorumRequired", "location", "quorumQuantity", "quorumQuantityPercentage"})
public class Meeting2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "DtAndTm", required = true)
	protected DateFormat2Choice dateAndTime;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getComplexType
	 * complexType} =
	 * {@linkplain com.tools20022.repository.choice.DateFormat2Choice
	 * DateFormat2Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDateAndTime
	 * Meeting.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting2
	 * Meeting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtAndTm"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateAndTime"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Date and time at which the meeting will take place."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateAndTime = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmDateAndTime;
			componentContext_lazy = () -> com.tools20022.repository.msg.Meeting2.mmObject();
			isDerived = false;
			xmlTag = "DtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the meeting will take place.";
			maxOccurs = 1;
			minOccurs = 1;
			complexType_lazy = () -> DateFormat2Choice.mmObject();
		}
	};
	@XmlElement(name = "DtSts")
	protected MeetingDateStatus1Code dateStatus;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MeetingDateStatus1Code
	 * MeetingDateStatus1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDateStatus
	 * Meeting.mmDateStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting2
	 * Meeting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DtSts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DateStatus"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Indicates the status of a meeting date."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmDateStatus = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Meeting.mmDateStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.Meeting2.mmObject();
			isDerived = false;
			xmlTag = "DtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateStatus";
			definition = "Indicates the status of a meeting date.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> MeetingDateStatus1Code.mmObject();
		}
	};
	@XmlElement(name = "QrmReqrd", required = true)
	protected YesNoIndicator quorumRequired;
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
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmQuorumRequired
	 * Quorum.mmQuorumRequired}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting2
	 * Meeting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QrmReqrd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumRequired"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies whether a minimum number of security representation is required to hold a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuorumRequired = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quorum.mmQuorumRequired;
			componentContext_lazy = () -> com.tools20022.repository.msg.Meeting2.mmObject();
			isDerived = false;
			xmlTag = "QrmReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumRequired";
			definition = "Specifies whether a minimum number of security representation is required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	@XmlElement(name = "Lctn", required = true)
	protected List<LocationFormat1Choice> location;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.LocationFormat1Choice
	 * LocationFormat1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingLocation
	 * Meeting.mmMeetingLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting2
	 * Meeting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Lctn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Location"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies location where meeting will take place."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Meeting.mmMeetingLocation;
			componentContext_lazy = () -> com.tools20022.repository.msg.Meeting2.mmObject();
			isDerived = false;
			xmlTag = "Lctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Location";
			definition = "Specifies location where meeting will take place.";
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> LocationFormat1Choice.mmObject();
		}
	};
	@XmlElement(name = "QrmQty")
	protected Max35Text quorumQuantity;
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
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmQuantity
	 * Quorum.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting2
	 * Meeting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QrmQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities required to hold a meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuorumQuantity = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quorum.mmQuantity;
			componentContext_lazy = () -> com.tools20022.repository.msg.Meeting2.mmObject();
			isDerived = false;
			xmlTag = "QrmQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumQuantity";
			definition = "Minimum quantity of securities required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	@XmlElement(name = "QrmQtyPctg")
	protected PercentageRate quorumQuantityPercentage;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.PercentageRate
	 * PercentageRate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmPercentage
	 * Quorum.mmPercentage}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting2
	 * Meeting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "QrmQtyPctg"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumQuantityPercentage"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Minimum quantity of securities, expressed as a percentage, required to hold a meeting."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuorumQuantityPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quorum.mmPercentage;
			componentContext_lazy = () -> com.tools20022.repository.msg.Meeting2.mmObject();
			isDerived = false;
			xmlTag = "QrmQtyPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumQuantityPercentage";
			definition = "Minimum quantity of securities, expressed as a percentage, required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * Either QuorumQuantity or QuorumQuantityPercentage may be present, but not
	 * both.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Meeting2
	 * Meeting2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting2#mmQuorumQuantity
	 * Meeting2.mmQuorumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Meeting2#mmQuorumQuantityPercentage
	 * Meeting2.mmQuorumQuantityPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumQuantityOrPercentageRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Either QuorumQuantity or QuorumQuantityPercentage may be present, but not both."
	 * </li>
	 * </ul>
	 */
	public static final MMXor QuorumQuantityOrPercentageRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumQuantityOrPercentageRule";
			definition = "Either QuorumQuantity or QuorumQuantityPercentage may be present, but not both.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.Meeting2.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting2.mmQuorumQuantity, com.tools20022.repository.msg.Meeting2.mmQuorumQuantityPercentage);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting2.mmDateAndTime, com.tools20022.repository.msg.Meeting2.mmDateStatus, com.tools20022.repository.msg.Meeting2.mmQuorumRequired,
						com.tools20022.repository.msg.Meeting2.mmLocation, com.tools20022.repository.msg.Meeting2.mmQuorumQuantity, com.tools20022.repository.msg.Meeting2.mmQuorumQuantityPercentage);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingNotificationV02.mmMeetingDetails);
				trace_lazy = () -> Meeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintDateAndTimeAndDateStatus1Rule.forMeeting2);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "Meeting2";
				definition = "Specifies the physical parameters of a shareholders meeting. Several dates and places can be defined for a meeting.";
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.Meeting2.QuorumQuantityOrPercentageRule);
			}
		});
		return mmObject_lazy.get();
	}

	public DateFormat2Choice getDateAndTime() {
		return dateAndTime;
	}

	public Meeting2 setDateAndTime(DateFormat2Choice dateAndTime) {
		this.dateAndTime = Objects.requireNonNull(dateAndTime);
		return this;
	}

	public Optional<MeetingDateStatus1Code> getDateStatus() {
		return dateStatus == null ? Optional.empty() : Optional.of(dateStatus);
	}

	public Meeting2 setDateStatus(MeetingDateStatus1Code dateStatus) {
		this.dateStatus = dateStatus;
		return this;
	}

	public YesNoIndicator getQuorumRequired() {
		return quorumRequired;
	}

	public Meeting2 setQuorumRequired(YesNoIndicator quorumRequired) {
		this.quorumRequired = Objects.requireNonNull(quorumRequired);
		return this;
	}

	public List<LocationFormat1Choice> getLocation() {
		return location == null ? location = new ArrayList<>() : location;
	}

	public Meeting2 setLocation(List<LocationFormat1Choice> location) {
		this.location = Objects.requireNonNull(location);
		return this;
	}

	public Optional<Max35Text> getQuorumQuantity() {
		return quorumQuantity == null ? Optional.empty() : Optional.of(quorumQuantity);
	}

	public Meeting2 setQuorumQuantity(Max35Text quorumQuantity) {
		this.quorumQuantity = quorumQuantity;
		return this;
	}

	public Optional<PercentageRate> getQuorumQuantityPercentage() {
		return quorumQuantityPercentage == null ? Optional.empty() : Optional.of(quorumQuantityPercentage);
	}

	public Meeting2 setQuorumQuantityPercentage(PercentageRate quorumQuantityPercentage) {
		this.quorumQuantityPercentage = quorumQuantityPercentage;
		return this;
	}
}