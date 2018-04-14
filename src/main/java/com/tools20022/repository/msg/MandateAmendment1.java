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
import com.tools20022.metamodel.MMMessageComponent;
import com.tools20022.metamodel.MMRegistrationStatus;
import com.tools20022.repository.area.pain.MandateAmendmentRequestV01;
import com.tools20022.repository.choice.OriginalMandate1Choice;
import com.tools20022.repository.entity.DirectDebitMandate;
import com.tools20022.repository.entity.Mandate;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AmendmentReasonInformation1;
import com.tools20022.repository.msg.MandateInformation3;
import com.tools20022.repository.msg.OriginalMessageInformation1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Identifies the mandate to be amended and gives details of the new mandate.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment1#mmOriginalMessageInformation
 * MandateAmendment1.mmOriginalMessageInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment1#mmAmendmentReason
 * MandateAmendment1.mmAmendmentReason}</li>
 * <li>{@linkplain com.tools20022.repository.msg.MandateAmendment1#mmMandate
 * MandateAmendment1.mmMandate}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.MandateAmendment1#mmOriginalMandate
 * MandateAmendment1.mmOriginalMandate}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.pain.MandateAmendmentRequestV01#mmUnderlyingAmendmentDetails
 * MandateAmendmentRequestV01.mmUnderlyingAmendmentDetails}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "MandateAmendment1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Identifies the mandate to be amended and gives details of the new mandate."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "MandateAmendment1", propOrder = {"originalMessageInformation", "amendmentReason", "mandate", "originalMandate"})
public class MandateAmendment1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OrgnlMsgInf")
	protected OriginalMessageInformation1 originalMessageInformation;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.OriginalMessageInformation1
	 * OriginalMessageInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment1
	 * MandateAmendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMsgInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMessageInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide information on the original messsage."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateAmendment1, Optional<OriginalMessageInformation1>> mmOriginalMessageInformation = new MMMessageAssociationEnd<MandateAmendment1, Optional<OriginalMessageInformation1>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAmendment1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMsgInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMessageInformation";
			definition = "Set of elements used to provide information on the original messsage.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> OriginalMessageInformation1.mmObject();
		}

		@Override
		public Optional<OriginalMessageInformation1> getValue(MandateAmendment1 obj) {
			return obj.getOriginalMessageInformation();
		}

		@Override
		public void setValue(MandateAmendment1 obj, Optional<OriginalMessageInformation1> value) {
			obj.setOriginalMessageInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "AmdmntRsn", required = true)
	protected AmendmentReasonInformation1 amendmentReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.AmendmentReasonInformation1
	 * AmendmentReasonInformation1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusReason
	 * Status.mmStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment1
	 * MandateAmendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AmdmntRsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AmendmentReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide detailed information on the amendment reason."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateAmendment1, AmendmentReasonInformation1> mmAmendmentReason = new MMMessageAssociationEnd<MandateAmendment1, AmendmentReasonInformation1>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAmendment1.mmObject();
			isDerived = false;
			xmlTag = "AmdmntRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AmendmentReason";
			definition = "Set of elements used to provide detailed information on the amendment reason.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> AmendmentReasonInformation1.mmObject();
		}

		@Override
		public AmendmentReasonInformation1 getValue(MandateAmendment1 obj) {
			return obj.getAmendmentReason();
		}

		@Override
		public void setValue(MandateAmendment1 obj, AmendmentReasonInformation1 value) {
			obj.setAmendmentReason(value);
		}
	};
	@XmlElement(name = "Mndt", required = true)
	protected MandateInformation3 mandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.MandateInformation3
	 * MandateInformation3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.DirectDebitMandate
	 * DirectDebitMandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment1
	 * MandateAmendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Mndt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Mandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Set of elements used to provide the amended mandate data."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateAmendment1, MandateInformation3> mmMandate = new MMMessageAssociationEnd<MandateAmendment1, MandateInformation3>() {
		{
			businessComponentTrace_lazy = () -> DirectDebitMandate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAmendment1.mmObject();
			isDerived = false;
			xmlTag = "Mndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Mandate";
			definition = "Set of elements used to provide the amended mandate data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> MandateInformation3.mmObject();
		}

		@Override
		public MandateInformation3 getValue(MandateAmendment1 obj) {
			return obj.getMandate();
		}

		@Override
		public void setValue(MandateAmendment1 obj, MandateInformation3 value) {
			obj.setMandate(value);
		}
	};
	@XmlElement(name = "OrgnlMndt", required = true)
	protected OriginalMandate1Choice originalMandate;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.OriginalMandate1Choice
	 * OriginalMandate1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Mandate Mandate}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.MandateAmendment1
	 * MandateAmendment1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OrgnlMndt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OriginalMandate"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Set of elements used to provide the original mandate data."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<MandateAmendment1, OriginalMandate1Choice> mmOriginalMandate = new MMMessageAssociationEnd<MandateAmendment1, OriginalMandate1Choice>() {
		{
			businessComponentTrace_lazy = () -> Mandate.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.MandateAmendment1.mmObject();
			isDerived = false;
			xmlTag = "OrgnlMndt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OriginalMandate";
			definition = "Set of elements used to provide the original mandate data.";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> OriginalMandate1Choice.mmObject();
		}

		@Override
		public OriginalMandate1Choice getValue(MandateAmendment1 obj) {
			return obj.getOriginalMandate();
		}

		@Override
		public void setValue(MandateAmendment1 obj, OriginalMandate1Choice value) {
			obj.setOriginalMandate(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.MandateAmendment1.mmOriginalMessageInformation, com.tools20022.repository.msg.MandateAmendment1.mmAmendmentReason,
						com.tools20022.repository.msg.MandateAmendment1.mmMandate, com.tools20022.repository.msg.MandateAmendment1.mmOriginalMandate);
				messageBuildingBlock_lazy = () -> Arrays.asList(MandateAmendmentRequestV01.mmUnderlyingAmendmentDetails);
				trace_lazy = () -> Mandate.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "MandateAmendment1";
				definition = "Identifies the mandate to be amended and gives details of the new mandate.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<OriginalMessageInformation1> getOriginalMessageInformation() {
		return originalMessageInformation == null ? Optional.empty() : Optional.of(originalMessageInformation);
	}

	public MandateAmendment1 setOriginalMessageInformation(OriginalMessageInformation1 originalMessageInformation) {
		this.originalMessageInformation = originalMessageInformation;
		return this;
	}

	public AmendmentReasonInformation1 getAmendmentReason() {
		return amendmentReason;
	}

	public MandateAmendment1 setAmendmentReason(AmendmentReasonInformation1 amendmentReason) {
		this.amendmentReason = Objects.requireNonNull(amendmentReason);
		return this;
	}

	public MandateInformation3 getMandate() {
		return mandate;
	}

	public MandateAmendment1 setMandate(MandateInformation3 mandate) {
		this.mandate = Objects.requireNonNull(mandate);
		return this;
	}

	public OriginalMandate1Choice getOriginalMandate() {
		return originalMandate;
	}

	public MandateAmendment1 setOriginalMandate(OriginalMandate1Choice originalMandate) {
		this.originalMandate = Objects.requireNonNull(originalMandate);
		return this;
	}
}