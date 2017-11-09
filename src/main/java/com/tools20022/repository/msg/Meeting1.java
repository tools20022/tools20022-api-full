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
import com.tools20022.repository.codeset.MeetingDateStatus1Code;
import com.tools20022.repository.datatype.ISODateTime;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.datatype.PercentageRate;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.Meeting;
import com.tools20022.repository.entity.Quorum;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;

/**
 * Specifies the physical parameters of a general meeting. Several dates and
 * places can be defined for a meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Meeting1#mmQuorumQuantityOrPercentage
 * Meeting1.mmQuorumQuantityOrPercentage}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmDateAndTime
 * Meeting1.mmDateAndTime}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmDateStatus
 * Meeting1.mmDateStatus}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmQuorumRequired
 * Meeting1.mmQuorumRequired}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmLocation
 * Meeting1.mmLocation}</li>
 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmQuorumQuantity
 * Meeting1.mmQuorumQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.Meeting1#mmQuorumQuantityPercentage
 * Meeting1.mmQuorumQuantityPercentage}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Meeting Meeting}</li>
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
 * "Meeting1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting."
 * </li>
 * </ul>
 */
public class Meeting1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected ISODateTime dateAndTime;
	/**
	 * Date and time at which the meeting will take place.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.ISODateTime
	 * ISODateTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmDateAndTime
	 * Meeting.mmDateAndTime}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting1
	 * Meeting1}</li>
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
			componentContext_lazy = () -> Meeting1.mmObject();
			isDerived = false;
			xmlTag = "DtAndTm";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateAndTime";
			definition = "Date and time at which the meeting will take place.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> ISODateTime.mmObject();
		}
	};
	protected MeetingDateStatus1Code dateStatus;
	/**
	 * Indicates the status of a meeting date.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting1
	 * Meeting1}</li>
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
			componentContext_lazy = () -> Meeting1.mmObject();
			isDerived = false;
			xmlTag = "DtSts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DateStatus";
			definition = "Indicates the status of a meeting date.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MeetingDateStatus1Code.mmObject();
		}
	};
	protected YesNoIndicator quorumRequired;
	/**
	 * Specifies whether a minimum number of security representation is required
	 * to hold a meeting.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting1
	 * Meeting1}</li>
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
			componentContext_lazy = () -> Meeting1.mmObject();
			isDerived = false;
			xmlTag = "QrmReqrd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumRequired";
			definition = "Specifies whether a minimum number of security representation is required to hold a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}
	};
	protected List<com.tools20022.repository.msg.PostalAddress1> location;
	/**
	 * Place of the company meeting for the scheduled meeting date.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.PostalAddress1
	 * PostalAddress1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Meeting#mmMeetingLocation
	 * Meeting.mmMeetingLocation}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting1
	 * Meeting1}</li>
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
	 * definition} =
	 * "Place of the company meeting for the scheduled meeting date."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmLocation = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> Meeting.mmMeetingLocation;
			componentContext_lazy = () -> Meeting1.mmObject();
			isDerived = false;
			xmlTag = "Lctn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Location";
			definition = "Place of the company meeting for the scheduled meeting date.";
			maxOccurs = 5;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.PostalAddress1.mmObject();
		}
	};
	protected Max35Text quorumQuantity;
	/**
	 * Minimum quantity of securities required to hold a meeting.
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
	 * {@linkplain com.tools20022.repository.entity.Quorum#mmQuantity
	 * Quorum.mmQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting1
	 * Meeting1}</li>
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
			componentContext_lazy = () -> Meeting1.mmObject();
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
	protected PercentageRate quorumQuantityPercentage;
	/**
	 * Percentage of securities required to vote.
	 * <p>
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
	 * componentContext} = {@linkplain com.tools20022.repository.msg.Meeting1
	 * Meeting1}</li>
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
	 * definition} = "Percentage of securities required to vote."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmQuorumQuantityPercentage = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> Quorum.mmPercentage;
			componentContext_lazy = () -> Meeting1.mmObject();
			isDerived = false;
			xmlTag = "QrmQtyPctg";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumQuantityPercentage";
			definition = "Percentage of securities required to vote.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> PercentageRate.mmObject();
		}
	};
	/**
	 * (No doc)
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} = {@linkplain com.tools20022.repository.msg.Meeting1
	 * Meeting1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.Meeting1#mmQuorumQuantity
	 * Meeting1.mmQuorumQuantity}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.Meeting1#mmQuorumQuantityPercentage
	 * Meeting1.mmQuorumQuantityPercentage}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "QuorumQuantityOrPercentage"</li>
	 * </ul>
	 */
	public static final MMXor mmQuorumQuantityOrPercentage = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "QuorumQuantityOrPercentage";
			messageComponent_lazy = () -> Meeting1.mmObject();
			impactedElements_lazy = () -> Arrays.asList(Meeting1.mmQuorumQuantity, Meeting1.mmQuorumQuantityPercentage);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(Meeting1.mmDateAndTime, Meeting1.mmDateStatus, Meeting1.mmQuorumRequired, Meeting1.mmLocation, Meeting1.mmQuorumQuantity, Meeting1.mmQuorumQuantityPercentage);
				trace_lazy = () -> Meeting.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "Meeting1";
				definition = "Specifies the physical parameters of a general meeting. Several dates and places can be defined for a  meeting.";
				xors_lazy = () -> Arrays.asList(Meeting1.mmQuorumQuantityOrPercentage);
			}
		});
		return mmObject_lazy.get();
	}

	public ISODateTime getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(ISODateTime dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public MeetingDateStatus1Code getDateStatus() {
		return dateStatus;
	}

	public void setDateStatus(MeetingDateStatus1Code dateStatus) {
		this.dateStatus = dateStatus;
	}

	public YesNoIndicator getQuorumRequired() {
		return quorumRequired;
	}

	public void setQuorumRequired(YesNoIndicator quorumRequired) {
		this.quorumRequired = quorumRequired;
	}

	public List<PostalAddress1> getLocation() {
		return location;
	}

	public void setLocation(List<com.tools20022.repository.msg.PostalAddress1> location) {
		this.location = location;
	}

	public Max35Text getQuorumQuantity() {
		return quorumQuantity;
	}

	public void setQuorumQuantity(Max35Text quorumQuantity) {
		this.quorumQuantity = quorumQuantity;
	}

	public PercentageRate getQuorumQuantityPercentage() {
		return quorumQuantityPercentage;
	}

	public void setQuorumQuantityPercentage(PercentageRate quorumQuantityPercentage) {
		this.quorumQuantityPercentage = quorumQuantityPercentage;
	}
}