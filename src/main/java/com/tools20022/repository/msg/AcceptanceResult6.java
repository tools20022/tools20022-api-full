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
import com.tools20022.repository.choice.MandateReason1Choice;
import com.tools20022.repository.datatype.Max105Text;
import com.tools20022.repository.datatype.YesNoIndicator;
import com.tools20022.repository.entity.MandateStatus;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import java.util.*;
import java.util.concurrent.atomic.AtomicReference;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Set of elements used to provide detailed information on the acceptance
 * result.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.AcceptanceResult6#mmAccepted
 * AcceptanceResult6.mmAccepted}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6#mmRejectReason
 * AcceptanceResult6.mmRejectReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6#mmAdditionalRejectReasonInformation
 * AcceptanceResult6.mmAdditionalRejectReasonInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.MandateStatus
 * MandateStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "AcceptanceResult6"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Set of elements used to provide detailed information on the acceptance result."
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "AcceptanceResult6", propOrder = {"accepted", "rejectReason", "additionalRejectReasonInformation"})
public class AcceptanceResult6 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Accptd", required = true)
	protected YesNoIndicator accepted;
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
	 * {@linkplain com.tools20022.repository.entity.MandateStatus#mmAccepted
	 * MandateStatus.mmAccepted}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6
	 * AcceptanceResult6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Accptd"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Accepted"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the mandate request was accepted or rejected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptanceResult6, YesNoIndicator> mmAccepted = new MMMessageAttribute<AcceptanceResult6, YesNoIndicator>() {
		{
			businessElementTrace_lazy = () -> MandateStatus.mmAccepted;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptanceResult6.mmObject();
			isDerived = false;
			xmlTag = "Accptd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Accepted";
			definition = "Indicates whether the mandate request was accepted or rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> YesNoIndicator.mmObject();
		}

		@Override
		public YesNoIndicator getValue(AcceptanceResult6 obj) {
			return obj.getAccepted();
		}

		@Override
		public void setValue(AcceptanceResult6 obj, YesNoIndicator value) {
			obj.setAccepted(value);
		}
	};
	@XmlElement(name = "RjctRsn")
	protected MandateReason1Choice rejectReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.MandateReason1Choice
	 * MandateReason1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.MandateStatus#mmRejectReason
	 * MandateStatus.mmRejectReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6
	 * AcceptanceResult6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason for the rejection of a mandate request."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<AcceptanceResult6, Optional<MandateReason1Choice>> mmRejectReason = new MMMessageAssociationEnd<AcceptanceResult6, Optional<MandateReason1Choice>>() {
		{
			businessElementTrace_lazy = () -> MandateStatus.mmRejectReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptanceResult6.mmObject();
			isDerived = false;
			xmlTag = "RjctRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectReason";
			definition = "Specifies the reason for the rejection of a mandate request.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> MandateReason1Choice.mmObject();
		}

		@Override
		public Optional<MandateReason1Choice> getValue(AcceptanceResult6 obj) {
			return obj.getRejectReason();
		}

		@Override
		public void setValue(AcceptanceResult6 obj, Optional<MandateReason1Choice> value) {
			obj.setRejectReason(value.orElse(null));
		}
	};
	@XmlElement(name = "AddtlRjctRsnInf")
	protected List<Max105Text> additionalRejectReasonInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max105Text
	 * Max105Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.AcceptanceResult6
	 * AcceptanceResult6}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlRjctRsnInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalRejectReasonInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Further details on the reject reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<AcceptanceResult6, List<Max105Text>> mmAdditionalRejectReasonInformation = new MMMessageAttribute<AcceptanceResult6, List<Max105Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.AcceptanceResult6.mmObject();
			isDerived = false;
			xmlTag = "AddtlRjctRsnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalRejectReasonInformation";
			definition = "Further details on the reject reason.";
			minOccurs = 0;
			simpleType_lazy = () -> Max105Text.mmObject();
		}

		@Override
		public List<Max105Text> getValue(AcceptanceResult6 obj) {
			return obj.getAdditionalRejectReasonInformation();
		}

		@Override
		public void setValue(AcceptanceResult6 obj, List<Max105Text> value) {
			obj.setAdditionalRejectReasonInformation(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.AcceptanceResult6.mmAccepted, com.tools20022.repository.msg.AcceptanceResult6.mmRejectReason,
						com.tools20022.repository.msg.AcceptanceResult6.mmAdditionalRejectReasonInformation);
				trace_lazy = () -> MandateStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "AcceptanceResult6";
				definition = "Set of elements used to provide detailed information on the acceptance result.";
			}
		});
		return mmObject_lazy.get();
	}

	public YesNoIndicator getAccepted() {
		return accepted;
	}

	public AcceptanceResult6 setAccepted(YesNoIndicator accepted) {
		this.accepted = Objects.requireNonNull(accepted);
		return this;
	}

	public Optional<MandateReason1Choice> getRejectReason() {
		return rejectReason == null ? Optional.empty() : Optional.of(rejectReason);
	}

	public AcceptanceResult6 setRejectReason(MandateReason1Choice rejectReason) {
		this.rejectReason = rejectReason;
		return this;
	}

	public List<Max105Text> getAdditionalRejectReasonInformation() {
		return additionalRejectReasonInformation == null ? additionalRejectReasonInformation = new ArrayList<>() : additionalRejectReasonInformation;
	}

	public AcceptanceResult6 setAdditionalRejectReasonInformation(List<Max105Text> additionalRejectReasonInformation) {
		this.additionalRejectReasonInformation = Objects.requireNonNull(additionalRejectReasonInformation);
		return this;
	}
}