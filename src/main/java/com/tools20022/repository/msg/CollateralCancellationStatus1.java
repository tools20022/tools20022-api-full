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
import com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03;
import com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04;
import com.tools20022.repository.codeset.Status4Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralStatus;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.RejectionStatus2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details on the status (that is accept or reject) of the
 * CollateralManagementCancellationRequest message.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmCollateralStatusCode
 * CollateralCancellationStatus1.mmCollateralStatusCode}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmAdditionalInformation
 * CollateralCancellationStatus1.mmAdditionalInformation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1#mmRejectionDetails
 * CollateralCancellationStatus1.mmRejectionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralStatus
 * CollateralStatus}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV03#mmCancellationStatus
 * CollateralManagementCancellationStatusV03.mmCancellationStatus}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralManagementCancellationStatusV04#mmCancellationStatus
 * CollateralManagementCancellationStatusV04.mmCancellationStatus}</li>
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
 * {@linkplain com.tools20022.repository.constraints.ConstraintStatusRejectionReasonRule#forCollateralCancellationStatus1
 * ConstraintStatusRejectionReasonRule.forCollateralCancellationStatus1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralCancellationStatus1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides details on the status (that is accept or reject) of the CollateralManagementCancellationRequest message."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralCancellationStatus1", propOrder = {"collateralStatusCode", "additionalInformation", "rejectionDetails"})
public class CollateralCancellationStatus1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollStsCd", required = true)
	protected Status4Code collateralStatusCode;
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
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1
	 * CollateralCancellationStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollStsCd"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralStatusCode"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows to provide a cancellation status using a code or a proprietary status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralCancellationStatus1, Status4Code> mmCollateralStatusCode = new MMMessageAttribute<CollateralCancellationStatus1, Status4Code>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralCancellationStatus1.mmObject();
			isDerived = false;
			xmlTag = "CollStsCd";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralStatusCode";
			definition = "Allows to provide a cancellation status using a code or a proprietary status.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status4Code.mmObject();
		}

		@Override
		public Status4Code getValue(CollateralCancellationStatus1 obj) {
			return obj.getCollateralStatusCode();
		}

		@Override
		public void setValue(CollateralCancellationStatus1 obj, Status4Code value) {
			obj.setCollateralStatusCode(value);
		}
	};
	@XmlElement(name = "AddtlInf")
	protected Max35Text additionalInformation;
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
	 * {@linkplain com.tools20022.repository.entity.Status#mmStatusDescription
	 * Status.mmStatusDescription}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1
	 * CollateralCancellationStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "AddtlInf"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "AdditionalInformation"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides additional information on the status of the CollateralManagementCancellationRequest message."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralCancellationStatus1, Optional<Max35Text>> mmAdditionalInformation = new MMMessageAttribute<CollateralCancellationStatus1, Optional<Max35Text>>() {
		{
			businessElementTrace_lazy = () -> Status.mmStatusDescription;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralCancellationStatus1.mmObject();
			isDerived = false;
			xmlTag = "AddtlInf";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "AdditionalInformation";
			definition = "Provides additional information on the status of the CollateralManagementCancellationRequest message.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CollateralCancellationStatus1 obj) {
			return obj.getAdditionalInformation();
		}

		@Override
		public void setValue(CollateralCancellationStatus1 obj, Optional<Max35Text> value) {
			obj.setAdditionalInformation(value.orElse(null));
		}
	};
	@XmlElement(name = "RjctnDtls")
	protected RejectionStatus2 rejectionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.RejectionStatus2
	 * RejectionStatus2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmCollateralManagementCancellationReason
	 * CollateralStatus.mmCollateralManagementCancellationReason}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralCancellationStatus1
	 * CollateralCancellationStatus1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RjctnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RejectionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides rejection reason and optionaly additional information."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralCancellationStatus1, Optional<RejectionStatus2>> mmRejectionDetails = new MMMessageAssociationEnd<CollateralCancellationStatus1, Optional<RejectionStatus2>>() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmCollateralManagementCancellationReason;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralCancellationStatus1.mmObject();
			isDerived = false;
			xmlTag = "RjctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RejectionDetails";
			definition = "Provides rejection reason and optionaly additional information.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> RejectionStatus2.mmObject();
		}

		@Override
		public Optional<RejectionStatus2> getValue(CollateralCancellationStatus1 obj) {
			return obj.getRejectionDetails();
		}

		@Override
		public void setValue(CollateralCancellationStatus1 obj, Optional<RejectionStatus2> value) {
			obj.setRejectionDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralCancellationStatus1.mmCollateralStatusCode, com.tools20022.repository.msg.CollateralCancellationStatus1.mmAdditionalInformation,
						com.tools20022.repository.msg.CollateralCancellationStatus1.mmRejectionDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralManagementCancellationStatusV03.mmCancellationStatus, CollateralManagementCancellationStatusV04.mmCancellationStatus);
				trace_lazy = () -> CollateralStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintStatusRejectionReasonRule.forCollateralCancellationStatus1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralCancellationStatus1";
				definition = "Provides details on the status (that is accept or reject) of the CollateralManagementCancellationRequest message.";
			}
		});
		return mmObject_lazy.get();
	}

	public Status4Code getCollateralStatusCode() {
		return collateralStatusCode;
	}

	public CollateralCancellationStatus1 setCollateralStatusCode(Status4Code collateralStatusCode) {
		this.collateralStatusCode = Objects.requireNonNull(collateralStatusCode);
		return this;
	}

	public Optional<Max35Text> getAdditionalInformation() {
		return additionalInformation == null ? Optional.empty() : Optional.of(additionalInformation);
	}

	public CollateralCancellationStatus1 setAdditionalInformation(Max35Text additionalInformation) {
		this.additionalInformation = additionalInformation;
		return this;
	}

	public Optional<RejectionStatus2> getRejectionDetails() {
		return rejectionDetails == null ? Optional.empty() : Optional.of(rejectionDetails);
	}

	public CollateralCancellationStatus1 setRejectionDetails(RejectionStatus2 rejectionDetails) {
		this.rejectionDetails = rejectionDetails;
		return this;
	}
}