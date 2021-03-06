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
import com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02;
import com.tools20022.repository.codeset.MessageRejectedReason1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.entity.SecuritiesTradeStatusReason;
import com.tools20022.repository.entity.StatusReason;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.AdditionalReference3;
import java.text.DateFormat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Date;
import java.util.function.Supplier;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Reason to reject the message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponent#getXors xors} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason3#PreviousOrOtherOrRelatedReferenceRule
 * RejectionReason3.PreviousOrOtherOrRelatedReferenceRule}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason3#mmReason
 * RejectionReason3.mmReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason3#mmAdditionalInformation
 * RejectionReason3.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason3#mmLinkedMessagePreviousReference
 * RejectionReason3.mmLinkedMessagePreviousReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason3#mmLinkedMessageOtherReference
 * RejectionReason3.mmLinkedMessageOtherReference}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RejectionReason3#mmLinkedMessageRelatedReference
 * RejectionReason3.mmLinkedMessageRelatedReference}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesTradeStatusReason
 * SecuritiesTradeStatusReason}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.semt.SecuritiesMessageRejectionV02#mmReason
 * SecuritiesMessageRejectionV02.mmReason}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RejectionReason3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Reason to reject the message."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintLinkedMessageReferenceRule#forRejectionReason3
 * ConstraintLinkedMessageReferenceRule.forRejectionReason3}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} = com.tools20022.metamodel.MMRegistrationStatus.OBSOLETE</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRemovalDate
 * removalDate} = September 9, 2016</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason23
 * RejectionReason23}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RejectionReason3", propOrder = {"reason", "additionalInformation", "linkedMessagePreviousReference", "linkedMessageOtherReference", "linkedMessageRelatedReference"})
public class RejectionReason3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "Rsn", required = true)
	protected MessageRejectedReason1Code reason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.MessageRejectedReason1Code
	 * MessageRejectedReason1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectedStatusReason
	 * StatusReason.mmRejectedStatusReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3
	 * RejectionReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rsn"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Reason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Reason to reject the message."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>{@linkplain com.tools20022.repository.msg.RejectionReason23#mmReason
	 * RejectionReason23.mmReason}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RejectionReason3, MessageRejectedReason1Code> mmReason = new MMMessageAttribute<RejectionReason3, MessageRejectedReason1Code>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectedStatusReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason3.mmObject();
			isDerived = false;
			xmlTag = "Rsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Reason";
			definition = "Reason to reject the message.";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason23.mmReason);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> MessageRejectedReason1Code.mmObject();
		}

		@Override
		public MessageRejectedReason1Code getValue(RejectionReason3 obj) {
			return obj.getReason();
		}

		@Override
		public void setValue(RejectionReason3 obj, MessageRejectedReason1Code value) {
			obj.setReason(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max140Text additionalInformation;
	/**
	 * 
	 <p>
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
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3
	 * RejectionReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Additional information about the rejection reason."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason23#mmAdditionalInformation
	 * RejectionReason23.mmAdditionalInformation}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RejectionReason3, Optional<Max140Text>> mmAdditionalInformation = new MMMessageAttribute<RejectionReason3, Optional<Max140Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason3.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Additional information about the rejection reason.";
			nextVersions_lazy = () -> Arrays.asList(RejectionReason23.mmAdditionalInformation);
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(RejectionReason3 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(RejectionReason3 obj, Optional<Max140Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "LkdMsgPrvsRef")
	protected AdditionalReference3 linkedMessagePreviousReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3
	 * RejectionReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdMsgPrvsRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedMessagePreviousReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Linked previous reference that is invalid or unrecognised, of the message being rejected."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RejectionReason3, Optional<AdditionalReference3>> mmLinkedMessagePreviousReference = new MMMessageAssociationEnd<RejectionReason3, Optional<AdditionalReference3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason3.mmObject();
			isDerived = false;
			xmlTag = "LkdMsgPrvsRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedMessagePreviousReference";
			definition = "Linked previous reference that is invalid or unrecognised, of the message being rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(RejectionReason3 obj) {
			return obj.getLinkedMessagePreviousReference();
		}

		@Override
		public void setValue(RejectionReason3 obj, Optional<AdditionalReference3> value) {
			obj.setLinkedMessagePreviousReference(value.orElse(null));
		}
	};
	@XmlElement(name = "LkdMsgOthrRef")
	protected AdditionalReference3 linkedMessageOtherReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3
	 * RejectionReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdMsgOthrRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedMessageOtherReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Linked other reference that is invalid or unrecognised, of the message being rejected."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RejectionReason3, Optional<AdditionalReference3>> mmLinkedMessageOtherReference = new MMMessageAssociationEnd<RejectionReason3, Optional<AdditionalReference3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason3.mmObject();
			isDerived = false;
			xmlTag = "LkdMsgOthrRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedMessageOtherReference";
			definition = "Linked other reference that is invalid or unrecognised, of the message being rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(RejectionReason3 obj) {
			return obj.getLinkedMessageOtherReference();
		}

		@Override
		public void setValue(RejectionReason3 obj, Optional<AdditionalReference3> value) {
			obj.setLinkedMessageOtherReference(value.orElse(null));
		}
	};
	@XmlElement(name = "LkdMsgRltdRef")
	protected AdditionalReference3 linkedMessageRelatedReference;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.AdditionalReference3
	 * AdditionalReference3}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3
	 * RejectionReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "LkdMsgRltdRef"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "LinkedMessageRelatedReference"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Linked related reference that is invalid or unrecognised, of the message being rejected."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RejectionReason3, Optional<AdditionalReference3>> mmLinkedMessageRelatedReference = new MMMessageAssociationEnd<RejectionReason3, Optional<AdditionalReference3>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.RejectionReason3.mmObject();
			isDerived = false;
			xmlTag = "LkdMsgRltdRef";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "LinkedMessageRelatedReference";
			definition = "Linked related reference that is invalid or unrecognised, of the message being rejected.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> AdditionalReference3.mmObject();
		}

		@Override
		public Optional<AdditionalReference3> getValue(RejectionReason3 obj) {
			return obj.getLinkedMessageRelatedReference();
		}

		@Override
		public void setValue(RejectionReason3 obj, Optional<AdditionalReference3> value) {
			obj.setLinkedMessageRelatedReference(value.orElse(null));
		}
	};
	/**
	 * One and only one message element in the list
	 * (LinkedMessagePreviousReference, LinkedMessageOtherReference,
	 * LinkedMessageRelatedReference) may be present.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getMessageComponent
	 * messageComponent} =
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3
	 * RejectionReason3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMXor#getImpactedElements
	 * impactedElements} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3#mmLinkedMessagePreviousReference
	 * RejectionReason3.mmLinkedMessagePreviousReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3#mmLinkedMessageOtherReference
	 * RejectionReason3.mmLinkedMessageOtherReference}</li>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.RejectionReason3#mmLinkedMessageRelatedReference
	 * RejectionReason3.mmLinkedMessageRelatedReference}</li>
	 * </ul>
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "PreviousOrOtherOrRelatedReferenceRule"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "One and only one message element in the list (LinkedMessagePreviousReference, LinkedMessageOtherReference, LinkedMessageRelatedReference) may be present."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMXor PreviousOrOtherOrRelatedReferenceRule = new MMXor() {
		{
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "PreviousOrOtherOrRelatedReferenceRule";
			definition = "One and only one message element in the list (LinkedMessagePreviousReference, LinkedMessageOtherReference, LinkedMessageRelatedReference) may be present.";
			messageComponent_lazy = () -> com.tools20022.repository.msg.RejectionReason3.mmObject();
			impactedElements_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RejectionReason3.mmLinkedMessagePreviousReference, com.tools20022.repository.msg.RejectionReason3.mmLinkedMessageOtherReference,
					com.tools20022.repository.msg.RejectionReason3.mmLinkedMessageRelatedReference);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RejectionReason3.mmReason, com.tools20022.repository.msg.RejectionReason3.mmAdditionalInformation,
						com.tools20022.repository.msg.RejectionReason3.mmLinkedMessagePreviousReference, com.tools20022.repository.msg.RejectionReason3.mmLinkedMessageOtherReference,
						com.tools20022.repository.msg.RejectionReason3.mmLinkedMessageRelatedReference);
				messageBuildingBlock_lazy = () -> Arrays.asList(SecuritiesMessageRejectionV02.mmReason);
				trace_lazy = () -> SecuritiesTradeStatusReason.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintLinkedMessageReferenceRule.forRejectionReason3);
				registrationStatus = MMRegistrationStatus.OBSOLETE;
				removalDate = ((Supplier<Date>) (() -> {
					try {
						return DateFormat.getDateInstance(java.text.DateFormat.LONG).parse("September 9, 2016");
					} catch (Exception e) {
						throw new RuntimeException(e);
					}
				})).get();
				name = "RejectionReason3";
				definition = "Reason to reject the message.";
				nextVersions_lazy = () -> Arrays.asList(RejectionReason23.mmObject());
				xors_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RejectionReason3.PreviousOrOtherOrRelatedReferenceRule);
			}
		});
		return mmObject_lazy.get();
	}

	public MessageRejectedReason1Code getReason() {
		return reason;
	}

	public RejectionReason3 setReason(MessageRejectedReason1Code reason) {
		this.reason = Objects.requireNonNull(reason);
		return this;
	}

	public Optional<Max140Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public RejectionReason3 setAdditionalInformation(Max140Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<AdditionalReference3> getLinkedMessagePreviousReference() {
		return linkedMessagePreviousReference == null ? Optional.empty() : Optional.of(linkedMessagePreviousReference);
	}

	public RejectionReason3 setLinkedMessagePreviousReference(AdditionalReference3 linkedMessagePreviousReference) {
		this.linkedMessagePreviousReference = linkedMessagePreviousReference;
		return this;
	}

	public Optional<AdditionalReference3> getLinkedMessageOtherReference() {
		return linkedMessageOtherReference == null ? Optional.empty() : Optional.of(linkedMessageOtherReference);
	}

	public RejectionReason3 setLinkedMessageOtherReference(AdditionalReference3 linkedMessageOtherReference) {
		this.linkedMessageOtherReference = linkedMessageOtherReference;
		return this;
	}

	public Optional<AdditionalReference3> getLinkedMessageRelatedReference() {
		return linkedMessageRelatedReference == null ? Optional.empty() : Optional.of(linkedMessageRelatedReference);
	}

	public RejectionReason3 setLinkedMessageRelatedReference(AdditionalReference3 linkedMessageRelatedReference) {
		this.linkedMessageRelatedReference = linkedMessageRelatedReference;
		return this;
	}
}