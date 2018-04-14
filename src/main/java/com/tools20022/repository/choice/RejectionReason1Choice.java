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

package com.tools20022.repository.choice;

import com.tools20022.metamodel.MMChoiceComponent;
import com.tools20022.metamodel.MMMessageAssociationEnd;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03;
import com.tools20022.repository.area.tsmt.AmendmentRejectionV02;
import com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03;
import com.tools20022.repository.area.tsmt.MisMatchRejectionV02;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.Reason2;
import com.tools20022.repository.msg.RejectedElement1;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.List;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Allows the sender of the rejection message to indicate only one rejection
 * reason that applies to the entire rejected message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason1Choice#mmGlobalRejectionReason
 * RejectionReason1Choice.mmGlobalRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.choice.RejectionReason1Choice#mmRejectedElement
 * RejectionReason1Choice.mmRejectedElement}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.StatusReason
 * StatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionV02#mmRejectionReason
 * AmendmentRejectionV02.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.AmendmentRejectionNotificationV03#mmRejectionReason
 * AmendmentRejectionNotificationV03.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionV02#mmRejectionReason
 * MisMatchRejectionV02.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.tsmt.MisMatchRejectionNotificationV03#mmRejectionReason
 * MisMatchRejectionNotificationV03.mmRejectionReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason1Choice"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Allows the sender of the rejection message to indicate only one rejection reason that applies to the entire rejected message."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RejectionReason1Choice", propOrder = {"globalRejectionReason", "rejectedElement"})
public class RejectionReason1Choice {

	final static private AtomicReference<MMChoiceComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "GblRjctnRsn", required = true)
	protected Reason2 globalRejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.Reason2 Reason2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason StatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason1Choice
	 * RejectionReason1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "GblRjctnRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "GlobalRejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Rejection reason that applies to the whole report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RejectionReason1Choice, Reason2> mmGlobalRejectionReason = new MMMessageAssociationEnd<RejectionReason1Choice, Reason2>() {
		{
			businessComponentTrace_lazy = () -> StatusReason.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.choice.RejectionReason1Choice.mmObject();
			isDerived = false;
			xmlTag = "GblRjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "GlobalRejectionReason";
			definition = "Rejection reason that applies to the whole report.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> Reason2.mmObject();
		}

		@Override
		public Reason2 getValue(RejectionReason1Choice obj) {
			return obj.getGlobalRejectionReason();
		}

		@Override
		public void setValue(RejectionReason1Choice obj, Reason2 value) {
			obj.setGlobalRejectionReason(value);
		}
	};
	@XmlElement(name = "RjctdElmt", required = true)
	protected List<RejectedElement1> rejectedElement;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectedElement1
	 * RejectedElement1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.choice.RejectionReason1Choice
	 * RejectionReason1Choice}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctdElmt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectedElement"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies a rejection reason for each individual element of a report."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RejectionReason1Choice, List<RejectedElement1>> mmRejectedElement = new MMMessageAssociationEnd<RejectionReason1Choice, List<RejectedElement1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.choice.RejectionReason1Choice.mmObject();
			isDerived = false;
			xmlTag = "RjctdElmt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectedElement";
			definition = "Specifies a rejection reason for each individual element of a report.";
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RejectedElement1.mmObject();
		}

		@Override
		public List<RejectedElement1> getValue(RejectionReason1Choice obj) {
			return obj.getRejectedElement();
		}

		@Override
		public void setValue(RejectionReason1Choice obj, List<RejectedElement1> value) {
			obj.setRejectedElement(value);
		}
	};

	final static public MMChoiceComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMChoiceComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.choice.RejectionReason1Choice.mmGlobalRejectionReason, com.tools20022.repository.choice.RejectionReason1Choice.mmRejectedElement);
				messageBuildingBlock_lazy = () -> Arrays.asList(AmendmentRejectionV02.mmRejectionReason, AmendmentRejectionNotificationV03.mmRejectionReason, MisMatchRejectionV02.mmRejectionReason,
						MisMatchRejectionNotificationV03.mmRejectionReason);
				trace_lazy = () -> StatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "RejectionReason1Choice";
				definition = "Allows the sender of the rejection message to indicate only one rejection reason that applies to the entire rejected message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Reason2 getGlobalRejectionReason() {
		return globalRejectionReason;
	}

	public RejectionReason1Choice setGlobalRejectionReason(Reason2 globalRejectionReason) {
		this.globalRejectionReason = Objects.requireNonNull(globalRejectionReason);
		return this;
	}

	public List<RejectedElement1> getRejectedElement() {
		return rejectedElement == null ? rejectedElement = new ArrayList<>() : rejectedElement;
	}

	public RejectionReason1Choice setRejectedElement(List<RejectedElement1> rejectedElement) {
		this.rejectedElement = Objects.requireNonNull(rejectedElement);
		return this;
	}
}