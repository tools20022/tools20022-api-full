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
import com.tools20022.repository.area.seev.MeetingCancellationV03;
import com.tools20022.repository.area.seev.MeetingCancellationV04;
import com.tools20022.repository.area.seev.MeetingCancellationV05;
import com.tools20022.repository.choice.MeetingCancellationReason1Choice;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.MeetingStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the reason for cancelling a meeting.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2#mmCancellationReasonCode
 * MeetingCancellationReason2.mmCancellationReasonCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2#mmCancellationReason
 * MeetingCancellationReason2.mmCancellationReason}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MeetingStatusReason
 * MeetingStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV03#mmReason
 * MeetingCancellationV03.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV04#mmReason
 * MeetingCancellationV04.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.seev.MeetingCancellationV05#mmReason
 * MeetingCancellationV05.mmReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#mmdataDict
 * GeneratedRepository.mmdataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MeetingCancellationReason2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Specifies the reason for cancelling a meeting."</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.PROPERTY)
@XmlType(name = "MeetingCancellationReason2", propOrder = {"cancellationReasonCode", "cancellationReason"})
public class MeetingCancellationReason2 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected MeetingCancellationReason1Choice cancellationReasonCode;
	/**
	 * Reason for cancelling a meeting.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MeetingCancellationReason1Choice
	 * MeetingCancellationReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MeetingStatusReason#mmMeetingCancellationReason
	 * MeetingStatusReason.mmMeetingCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2
	 * MeetingCancellationReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsnCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReasonCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason for cancelling a meeting."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmCancellationReasonCode = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> MeetingStatusReason.mmMeetingCancellationReason;
			componentContext_lazy = () -> MeetingCancellationReason2.mmObject();
			isDerived = false;
			xmlTag = "CxlRsnCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReasonCode";
			definition = "Reason for cancelling a meeting.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MeetingCancellationReason1Choice.mmObject();
		}
	};
	protected Max140Text cancellationReason;
	/**
	 * Provides more information on the reason for cancelling a meeting in free
	 * format form.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max140Text
	 * Max140Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MeetingCancellationReason2
	 * MeetingCancellationReason2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CxlRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CancellationReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides more information on the reason for cancelling a meeting in free format form."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCancellationReason = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> MeetingCancellationReason2.mmObject();
			isDerived = false;
			xmlTag = "CxlRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CancellationReason";
			definition = "Provides more information on the reason for cancelling a meeting in free format form.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(MeetingCancellationReason2.mmCancellationReasonCode, MeetingCancellationReason2.mmCancellationReason);
				messageBuildingBlock_lazy = () -> Arrays.asList(MeetingCancellationV03.mmReason, MeetingCancellationV04.mmReason, MeetingCancellationV05.mmReason);
				trace_lazy = () -> MeetingStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.mmdataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MeetingCancellationReason2";
				definition = "Specifies the reason for cancelling a meeting.";
			}
		});
		return mmObject_lazy.get();
	}

	@XmlElement(name = "CxlRsnCd")
	public MeetingCancellationReason1Choice getCancellationReasonCode() {
		return cancellationReasonCode;
	}

	public void setCancellationReasonCode(MeetingCancellationReason1Choice cancellationReasonCode) {
		this.cancellationReasonCode = cancellationReasonCode;
	}

	@XmlElement(name = "CxlRsn")
	public Max140Text getCancellationReason() {
		return cancellationReason;
	}

	public void setCancellationReason(Max140Text cancellationReason) {
		this.cancellationReason = cancellationReason;
	}
}