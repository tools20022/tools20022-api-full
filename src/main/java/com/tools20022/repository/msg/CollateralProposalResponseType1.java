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
import com.tools20022.repository.codeset.CollateralProposalResponse1Code;
import com.tools20022.repository.codeset.RejectionReasonV021Code;
import com.tools20022.repository.codeset.Status4Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralProposal;
import com.tools20022.repository.entity.CollateralStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.entity.StatusReason;
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
 * Provides details on the response for a collateral proposal.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmCollateralProposalIdentification
 * CollateralProposalResponseType1.mmCollateralProposalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmType
 * CollateralProposalResponseType1.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmResponseType
 * CollateralProposalResponseType1.mmResponseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmRejectionReason
 * CollateralProposalResponseType1.mmRejectionReason}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmRejectionInformation
 * CollateralProposalResponseType1.mmRejectionInformation}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintProposalRejectionRule#forCollateralProposalResponseType1
 * ConstraintProposalRejectionRule.forCollateralProposalResponseType1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralProposalResponseType1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the response for a collateral proposal."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2
 * CollateralProposalResponseType2}</li>
 * </ul>
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralProposalResponseType1", propOrder = {"collateralProposalIdentification", "type", "responseType", "rejectionReason", "rejectionInformation"})
public class CollateralProposalResponseType1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollPrpslId", required = true)
	protected Max35Text collateralProposalIdentification;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1
	 * CollateralProposalResponseType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollPrpslId"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralProposalIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Unique identifier for a collateral proposal."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmCollateralProposalIdentification
	 * CollateralProposalResponseType2.mmCollateralProposalIdentification}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralProposalResponseType1, Max35Text> mmCollateralProposalIdentification = new MMMessageAttribute<CollateralProposalResponseType1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType1.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalIdentification";
			definition = "Unique identifier for a collateral proposal.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponseType2.mmCollateralProposalIdentification);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CollateralProposalResponseType1 obj) {
			return obj.getCollateralProposalIdentification();
		}

		@Override
		public void setValue(CollateralProposalResponseType1 obj, Max35Text value) {
			obj.setCollateralProposalIdentification(value);
		}
	};
	@XmlElement(name = "Tp", required = true)
	protected CollateralProposalResponse1Code type;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralProposalResponse1Code
	 * CollateralProposalResponse1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmResponseType
	 * CollateralProposal.mmResponseType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1
	 * CollateralProposalResponseType1}</li>
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
	 * definition} =
	 * "Indicates whether the collateral proposal is an initial or a counter proposal."
	 * </li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmType
	 * CollateralProposalResponseType2.mmType}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralProposalResponseType1, CollateralProposalResponse1Code> mmType = new MMMessageAttribute<CollateralProposalResponseType1, CollateralProposalResponse1Code>() {
		{
			businessElementTrace_lazy = () -> CollateralProposal.mmResponseType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType1.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether the collateral proposal is an initial or a counter proposal.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponseType2.mmType);
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralProposalResponse1Code.mmObject();
		}

		@Override
		public CollateralProposalResponse1Code getValue(CollateralProposalResponseType1 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CollateralProposalResponseType1 obj, CollateralProposalResponse1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "RspnTp", required = true)
	protected Status4Code responseType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.codeset.Status4Code
	 * Status4Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Status#mmInstructionProcessingStatus
	 * Status.mmInstructionProcessingStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1
	 * CollateralProposalResponseType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Specifies the status of the collateral proposal."</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralProposalResponseType1, Status4Code> mmResponseType = new MMMessageAttribute<CollateralProposalResponseType1, Status4Code>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType1.mmObject();
			isDerived = false;
			xmlTag = "RspnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseType";
			definition = "Specifies the status of the collateral proposal.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status4Code.mmObject();
		}

		@Override
		public Status4Code getValue(CollateralProposalResponseType1 obj) {
			return obj.getResponseType();
		}

		@Override
		public void setValue(CollateralProposalResponseType1 obj, Status4Code value) {
			obj.setResponseType(value);
		}
	};
	@XmlElement(name = "RjctnRsn")
	protected RejectionReasonV021Code rejectionReason;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.RejectionReasonV021Code
	 * RejectionReasonV021Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmRejectionReason
	 * StatusReason.mmRejectionReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1
	 * CollateralProposalResponseType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnRsn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionReason"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Specifies the reason why the instruction/cancellation request has a rejected status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralProposalResponseType1, Optional<RejectionReasonV021Code>> mmRejectionReason = new MMMessageAttribute<CollateralProposalResponseType1, Optional<RejectionReasonV021Code>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmRejectionReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType1.mmObject();
			isDerived = false;
			xmlTag = "RjctnRsn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionReason";
			definition = "Specifies the reason why the instruction/cancellation request has a rejected status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> RejectionReasonV021Code.mmObject();
		}

		@Override
		public Optional<RejectionReasonV021Code> getValue(CollateralProposalResponseType1 obj) {
			return obj.getRejectionReason();
		}

		@Override
		public void setValue(CollateralProposalResponseType1 obj, Optional<RejectionReasonV021Code> value) {
			obj.setRejectionReason(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctnInf")
	protected Max35Text rejectionInformation;
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
	 * {@linkplain com.tools20022.repository.entity.StatusReason#mmReason
	 * StatusReason.mmReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1
	 * CollateralProposalResponseType1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Additional information regarding why the collateral proposal has a rejected status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralProposalResponseType1, Optional<Max35Text>> mmRejectionInformation = new MMMessageAttribute<CollateralProposalResponseType1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> StatusReason.mmReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType1.mmObject();
			isDerived = false;
			xmlTag = "RjctnInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionInformation";
			definition = "Additional information regarding why the collateral proposal has a rejected status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CollateralProposalResponseType1 obj) {
			return obj.getRejectionInformation();
		}

		@Override
		public void setValue(CollateralProposalResponseType1 obj, Optional<Max35Text> value) {
			obj.setRejectionInformation(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralProposalResponseType1.mmCollateralProposalIdentification, com.tools20022.repository.msg.CollateralProposalResponseType1.mmType,
						com.tools20022.repository.msg.CollateralProposalResponseType1.mmResponseType, com.tools20022.repository.msg.CollateralProposalResponseType1.mmRejectionReason,
						com.tools20022.repository.msg.CollateralProposalResponseType1.mmRejectionInformation);
				trace_lazy = () -> CollateralStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintProposalRejectionRule.forCollateralProposalResponseType1);
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "CollateralProposalResponseType1";
				definition = "Provides details on the response for a collateral proposal.";
				nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponseType2.mmObject());
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCollateralProposalIdentification() {
		return collateralProposalIdentification;
	}

	public CollateralProposalResponseType1 setCollateralProposalIdentification(Max35Text collateralProposalIdentification) {
		this.collateralProposalIdentification = Objects.requireNonNull(collateralProposalIdentification);
		return this;
	}

	public CollateralProposalResponse1Code getType() {
		return type;
	}

	public CollateralProposalResponseType1 setType(CollateralProposalResponse1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public Status4Code getResponseType() {
		return responseType;
	}

	public CollateralProposalResponseType1 setResponseType(Status4Code responseType) {
		this.responseType = Objects.requireNonNull(responseType);
		return this;
	}

	public Optional<RejectionReasonV021Code> getRejectionReason() {
		return rejectionReason == null ? Optional.empty() : Optional.of(rejectionReason);
	}

	public CollateralProposalResponseType1 setRejectionReason(RejectionReasonV021Code rejectionReason) {
		this.rejectionReason = rejectionReason;
		return this;
	}

	public Optional<Max35Text> getRejectionInformation() {
		return rejectionInformation == null ? Optional.empty() : Optional.of(rejectionInformation);
	}

	public CollateralProposalResponseType1 setRejectionInformation(Max35Text rejectionInformation) {
		this.rejectionInformation = rejectionInformation;
		return this;
	}
}