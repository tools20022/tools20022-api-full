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
import com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV03;
import com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV04;
import com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code;
import com.tools20022.repository.datatype.Max140Text;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralStatus;
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
 * Provides the status details about the collateral substitution.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1#mmCollateralSubstitutionRequestIdentification
 * CollateralConfirmation1.mmCollateralSubstitutionRequestIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1#mmCollateralSubstitutionResponseIdentification
 * CollateralConfirmation1.mmCollateralSubstitutionResponseIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1#mmConfirmationType
 * CollateralConfirmation1.mmConfirmationType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1#mmComment
 * CollateralConfirmation1.mmComment}</li>
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
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV03#mmSubstitutionConfirmation
 * CollateralSubstitutionConfirmationV03.mmSubstitutionConfirmation}</li>
 * <li>
 * {@linkplain com.tools20022.repository.area.colr.CollateralSubstitutionConfirmationV04#mmSubstitutionConfirmation
 * CollateralSubstitutionConfirmationV04.mmSubstitutionConfirmation}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralConfirmation1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides the status details about the collateral substitution."</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralConfirmation1", propOrder = {"collateralSubstitutionRequestIdentification", "collateralSubstitutionResponseIdentification", "confirmationType", "comment"})
public class CollateralConfirmation1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CollSbstitnReqId", required = true)
	protected Max35Text collateralSubstitutionRequestIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1
	 * CollateralConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnReqId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionRequestIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the collateral substitution request identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralConfirmation1, Max35Text> mmCollateralSubstitutionRequestIdentification = new MMMessageAttribute<CollateralConfirmation1, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnReqId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionRequestIdentification";
			definition = "Reference to the collateral substitution request identification.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CollateralConfirmation1 obj) {
			return obj.getCollateralSubstitutionRequestIdentification();
		}

		@Override
		public void setValue(CollateralConfirmation1 obj, Max35Text value) {
			obj.setCollateralSubstitutionRequestIdentification(value);
		}
	};
	@XmlElement(name = "CollSbstitnRspnId")
	protected Max35Text collateralSubstitutionResponseIdentification;
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
	 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1
	 * CollateralConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CollSbstitnRspnId"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "CollateralSubstitutionResponseIdentification"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Reference to the collateral substitution response identification."</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralConfirmation1, Optional<Max35Text>> mmCollateralSubstitutionResponseIdentification = new MMMessageAttribute<CollateralConfirmation1, Optional<Max35Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "CollSbstitnRspnId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralSubstitutionResponseIdentification";
			definition = "Reference to the collateral substitution response identification.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Optional<Max35Text> getValue(CollateralConfirmation1 obj) {
			return obj.getCollateralSubstitutionResponseIdentification();
		}

		@Override
		public void setValue(CollateralConfirmation1 obj, Optional<Max35Text> value) {
			obj.setCollateralSubstitutionResponseIdentification(value.orElse(null));
		}
	};
	@XmlElement(name = "ConfTp", required = true)
	protected CollateralSubstitutionConfirmation1Code confirmationType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.codeset.CollateralSubstitutionConfirmation1Code
	 * CollateralSubstitutionConfirmation1Code}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralStatus#mmSubstitutionStatus
	 * CollateralStatus.mmSubstitutionStatus}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1
	 * CollateralConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "ConfTp"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ConfirmationType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides details about the status of the collateral substitution, either released or returned."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralConfirmation1, CollateralSubstitutionConfirmation1Code> mmConfirmationType = new MMMessageAttribute<CollateralConfirmation1, CollateralSubstitutionConfirmation1Code>() {
		{
			businessElementTrace_lazy = () -> CollateralStatus.mmSubstitutionStatus;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "ConfTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ConfirmationType";
			definition = "Provides details about the status of the collateral substitution, either released or returned.";
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralSubstitutionConfirmation1Code.mmObject();
		}

		@Override
		public CollateralSubstitutionConfirmation1Code getValue(CollateralConfirmation1 obj) {
			return obj.getConfirmationType();
		}

		@Override
		public void setValue(CollateralConfirmation1 obj, CollateralSubstitutionConfirmation1Code value) {
			obj.setConfirmationType(value);
		}
	};
	@XmlElement(name = "Cmnt")
	protected Max140Text comment;
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
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralConfirmation1
	 * CollateralConfirmation1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Cmnt"</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Comment"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Allows to provides additional comments on the collateral substitution status."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralConfirmation1, Optional<Max140Text>> mmComment = new MMMessageAttribute<CollateralConfirmation1, Optional<Max140Text>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralConfirmation1.mmObject();
			isDerived = false;
			xmlTag = "Cmnt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Comment";
			definition = "Allows to provides additional comments on the collateral substitution status.";
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> Max140Text.mmObject();
		}

		@Override
		public Optional<Max140Text> getValue(CollateralConfirmation1 obj) {
			return obj.getComment();
		}

		@Override
		public void setValue(CollateralConfirmation1 obj, Optional<Max140Text> value) {
			obj.setComment(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralConfirmation1.mmCollateralSubstitutionRequestIdentification,
						com.tools20022.repository.msg.CollateralConfirmation1.mmCollateralSubstitutionResponseIdentification, com.tools20022.repository.msg.CollateralConfirmation1.mmConfirmationType,
						com.tools20022.repository.msg.CollateralConfirmation1.mmComment);
				messageBuildingBlock_lazy = () -> Arrays.asList(CollateralSubstitutionConfirmationV03.mmSubstitutionConfirmation, CollateralSubstitutionConfirmationV04.mmSubstitutionConfirmation);
				trace_lazy = () -> CollateralStatus.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralConfirmation1";
				definition = "Provides the status details about the collateral substitution.";
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCollateralSubstitutionRequestIdentification() {
		return collateralSubstitutionRequestIdentification;
	}

	public CollateralConfirmation1 setCollateralSubstitutionRequestIdentification(Max35Text collateralSubstitutionRequestIdentification) {
		this.collateralSubstitutionRequestIdentification = Objects.requireNonNull(collateralSubstitutionRequestIdentification);
		return this;
	}

	public Optional<Max35Text> getCollateralSubstitutionResponseIdentification() {
		return collateralSubstitutionResponseIdentification == null ? Optional.empty() : Optional.of(collateralSubstitutionResponseIdentification);
	}

	public CollateralConfirmation1 setCollateralSubstitutionResponseIdentification(Max35Text collateralSubstitutionResponseIdentification) {
		this.collateralSubstitutionResponseIdentification = collateralSubstitutionResponseIdentification;
		return this;
	}

	public CollateralSubstitutionConfirmation1Code getConfirmationType() {
		return confirmationType;
	}

	public CollateralConfirmation1 setConfirmationType(CollateralSubstitutionConfirmation1Code confirmationType) {
		this.confirmationType = Objects.requireNonNull(confirmationType);
		return this;
	}

	public Optional<Max140Text> getComment() {
		return comment == null ? Optional.empty() : Optional.of(comment);
	}

	public CollateralConfirmation1 setComment(Max140Text comment) {
		this.comment = comment;
		return this;
	}
}