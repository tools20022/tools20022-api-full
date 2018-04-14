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
import com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03;
import com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04;
import com.tools20022.repository.codeset.Status4Code;
import com.tools20022.repository.entity.CollateralSubstitution;
import com.tools20022.repository.entity.Status;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralSubstitutionResponse1;
import com.tools20022.repository.msg.CollateralSubstitutionResponse2;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides details about the collateral substitution response.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1#mmResponseType
 * SubstitutionResponse1.mmResponseType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1#mmCollateralSubstitutionAcceptanceDetails
 * SubstitutionResponse1.mmCollateralSubstitutionAcceptanceDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1#mmCollateralSubstitutionRejectionDetails
 * SubstitutionResponse1.mmCollateralSubstitutionRejectionDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralSubstitution
 * CollateralSubstitution}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageComponentType#getMessageBuildingBlock
 * messageBuildingBlock} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV03#mmSubstitutionResponse
 * CollateralSubstitutionResponseV03.mmSubstitutionResponse}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionResponseV04#mmSubstitutionResponse
 * CollateralSubstitutionResponseV04.mmSubstitutionResponse}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "SubstitutionResponse1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details about the collateral substitution response."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCollateralSubstitutionAcceptancePresenceRule#forSubstitutionResponse1
 * ConstraintCollateralSubstitutionAcceptancePresenceRule.
 * forSubstitutionResponse1}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintCollateralSubstitutionRejectionPresenceRule#forSubstitutionResponse1
 * ConstraintCollateralSubstitutionRejectionPresenceRule.
 * forSubstitutionResponse1}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SubstitutionResponse1", propOrder = {"responseType", "collateralSubstitutionAcceptanceDetails", "collateralSubstitutionRejectionDetails"})
public class SubstitutionResponse1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
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
	 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1
	 * SubstitutionResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RspnTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ResponseType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates if the substitution request was accepted or rejected."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<SubstitutionResponse1, Status4Code> mmResponseType = new MMMessageAttribute<SubstitutionResponse1, Status4Code>() {
		{
			businessElementTrace_lazy = () -> Status.mmInstructionProcessingStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.SubstitutionResponse1.mmObject();
			isDerived = false;
			xmlTag = "RspnTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ResponseType";
			definition = "Indicates if the substitution request was accepted or rejected.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Status4Code.mmObject();
		}

		@Override
		public Status4Code getValue(SubstitutionResponse1 obj) {
			return obj.getResponseType();
		}

		@Override
		public void setValue(SubstitutionResponse1 obj, Status4Code value) {
			obj.setResponseType(value);
		}
	};
	@XmlElement(name = "CollSbstitnAccptncDtls")
	protected CollateralSubstitutionResponse1 collateralSubstitutionAcceptanceDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse1
	 * CollateralSubstitutionResponse1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1
	 * SubstitutionResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnAccptncDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionAcceptanceDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the accepted collateral substitution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubstitutionResponse1, Optional<CollateralSubstitutionResponse1>> mmCollateralSubstitutionAcceptanceDetails = new MMMessageAssociationEnd<SubstitutionResponse1, Optional<CollateralSubstitutionResponse1>>() {
		{
			businessComponentTrace_lazy = () -> CollateralSubstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubstitutionResponse1.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnAccptncDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionAcceptanceDetails";
			definition = "Provides details about the accepted collateral substitution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralSubstitutionResponse1.mmObject();
		}

		@Override
		public Optional<CollateralSubstitutionResponse1> getValue(SubstitutionResponse1 obj) {
			return obj.getCollateralSubstitutionAcceptanceDetails();
		}

		@Override
		public void setValue(SubstitutionResponse1 obj, Optional<CollateralSubstitutionResponse1> value) {
			obj.setCollateralSubstitutionAcceptanceDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "CollSbstitnRjctnDtls")
	protected CollateralSubstitutionResponse2 collateralSubstitutionRejectionDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.CollateralSubstitutionResponse2
	 * CollateralSubstitutionResponse2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralSubstitution
	 * CollateralSubstitution}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SubstitutionResponse1
	 * SubstitutionResponse1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnRjctnDtls"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionRejectionDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the rejected collateral substitution."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SubstitutionResponse1, Optional<CollateralSubstitutionResponse2>> mmCollateralSubstitutionRejectionDetails = new MMMessageAssociationEnd<SubstitutionResponse1, Optional<CollateralSubstitutionResponse2>>() {
		{
			businessComponentTrace_lazy = () -> CollateralSubstitution.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.SubstitutionResponse1.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnRjctnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionRejectionDetails";
			definition = "Provides details about the rejected collateral substitution.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> CollateralSubstitutionResponse2.mmObject();
		}

		@Override
		public Optional<CollateralSubstitutionResponse2> getValue(SubstitutionResponse1 obj) {
			return obj.getCollateralSubstitutionRejectionDetails();
		}

		@Override
		public void setValue(SubstitutionResponse1 obj, Optional<CollateralSubstitutionResponse2> value) {
			obj.setCollateralSubstitutionRejectionDetails(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SubstitutionResponse1.mmResponseType, com.tools20022.repository.msg.SubstitutionResponse1.mmCollateralSubstitutionAcceptanceDetails,
						com.tools20022.repository.msg.SubstitutionResponse1.mmCollateralSubstitutionRejectionDetails);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralSubstitutionResponseV03.mmSubstitutionResponse, CollateralSubstitutionResponseV04.mmSubstitutionResponse);
				trace_lazy = () -> CollateralSubstitution.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintCollateralSubstitutionAcceptancePresenceRule.forSubstitutionResponse1,
						com.tools20022.repository.constraints.ConstraintCollateralSubstitutionRejectionPresenceRule.forSubstitutionResponse1);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SubstitutionResponse1";
				definition = "Provides details about the collateral substitution response.";
			}
		});
		return mmObject_lazy.get();
	}

	public Status4Code getResponseType() {
		return responseType;
	}

	public SubstitutionResponse1 setResponseType(Status4Code responseType) {
		this.responseType = Objects.requireNonNull(responseType);
		return this;
	}

	public Optional<CollateralSubstitutionResponse1> getCollateralSubstitutionAcceptanceDetails() {
		return collateralSubstitutionAcceptanceDetails == null ? Optional.empty() : Optional.of(collateralSubstitutionAcceptanceDetails);
	}

	public SubstitutionResponse1 setCollateralSubstitutionAcceptanceDetails(CollateralSubstitutionResponse1 collateralSubstitutionAcceptanceDetails) {
		this.collateralSubstitutionAcceptanceDetails = collateralSubstitutionAcceptanceDetails;
		return this;
	}

	public Optional<CollateralSubstitutionResponse2> getCollateralSubstitutionRejectionDetails() {
		return collateralSubstitutionRejectionDetails == null ? Optional.empty() : Optional.of(collateralSubstitutionRejectionDetails);
	}

	public SubstitutionResponse1 setCollateralSubstitutionRejectionDetails(CollateralSubstitutionResponse2 collateralSubstitutionRejectionDetails) {
		this.collateralSubstitutionRejectionDetails = collateralSubstitutionRejectionDetails;
		return this;
	}
}