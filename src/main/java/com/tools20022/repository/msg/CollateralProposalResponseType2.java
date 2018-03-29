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
import com.tools20022.repository.codeset.CollateralProposalResponse1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralProposal;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.CollateralResponse1;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
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
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmCollateralProposalIdentification
 * CollateralProposalResponseType2.mmCollateralProposalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmType
 * CollateralProposalResponseType2.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmResponse
 * CollateralProposalResponseType2.mmResponse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralProposal
 * CollateralProposal}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "CollateralProposalResponseType2"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the response for a collateral proposal."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
 * nextVersions} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3
 * CollateralProposalResponseType3}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1
 * CollateralProposalResponseType1}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "CollateralProposalResponseType2", propOrder = {"collateralProposalIdentification", "type", "response"})
public class CollateralProposalResponseType2 {

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
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2
	 * CollateralProposalResponseType2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmCollateralProposalIdentification
	 * CollateralProposalResponseType3.mmCollateralProposalIdentification}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmCollateralProposalIdentification
	 * CollateralProposalResponseType1.mmCollateralProposalIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralProposalResponseType2, Max35Text> mmCollateralProposalIdentification = new MMMessageAttribute<CollateralProposalResponseType2, Max35Text>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType2.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslId";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalIdentification";
			definition = "Unique identifier for a collateral proposal.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponseType3.mmCollateralProposalIdentification);
			previousVersion_lazy = () -> CollateralProposalResponseType1.mmCollateralProposalIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}

		@Override
		public Max35Text getValue(CollateralProposalResponseType2 obj) {
			return obj.getCollateralProposalIdentification();
		}

		@Override
		public void setValue(CollateralProposalResponseType2 obj, Max35Text value) {
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
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2
	 * CollateralProposalResponseType2}</li>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmType
	 * CollateralProposalResponseType3.mmType}</li>
	 * </ul>
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType1#mmType
	 * CollateralProposalResponseType1.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<CollateralProposalResponseType2, CollateralProposalResponse1Code> mmType = new MMMessageAttribute<CollateralProposalResponseType2, CollateralProposalResponse1Code>() {
		{
			businessElementTrace_lazy = () -> CollateralProposal.mmResponseType;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType2.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether the collateral proposal is an initial or a counter proposal.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponseType3.mmType);
			previousVersion_lazy = () -> CollateralProposalResponseType1.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralProposalResponse1Code.mmObject();
		}

		@Override
		public CollateralProposalResponse1Code getValue(CollateralProposalResponseType2 obj) {
			return obj.getType();
		}

		@Override
		public void setValue(CollateralProposalResponseType2 obj, CollateralProposalResponse1Code value) {
			obj.setType(value);
		}
	};
	@XmlElement(name = "Rspn", required = true)
	protected CollateralResponse1 response;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralResponse1
	 * CollateralResponse1}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
	 * CollateralProposal.mmProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2
	 * CollateralProposalResponseType2}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "Rspn"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "Response"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Provides response details for each of the proposed collateral pieces."</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getNextVersions
	 * nextVersions} =
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmResponse
	 * CollateralProposalResponseType3.mmResponse}</li>
	 * </ul>
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<CollateralProposalResponseType2, CollateralResponse1> mmResponse = new MMMessageAssociationEnd<CollateralProposalResponseType2, CollateralResponse1>() {
		{
			businessElementTrace_lazy = () -> CollateralProposal.mmProposedCollateralMovement;
			componentContext_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType2.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Provides response details for each of the proposed collateral pieces.";
			nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponseType3.mmResponse);
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> CollateralResponse1.mmObject();
		}

		@Override
		public CollateralResponse1 getValue(CollateralProposalResponseType2 obj) {
			return obj.getResponse();
		}

		@Override
		public void setValue(CollateralProposalResponseType2 obj, CollateralResponse1 value) {
			obj.setResponse(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralProposalResponseType2.mmCollateralProposalIdentification, com.tools20022.repository.msg.CollateralProposalResponseType2.mmType,
						com.tools20022.repository.msg.CollateralProposalResponseType2.mmResponse);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "CollateralProposalResponseType2";
				definition = "Provides details on the response for a collateral proposal.";
				nextVersions_lazy = () -> Arrays.asList(CollateralProposalResponseType3.mmObject());
				previousVersion_lazy = () -> CollateralProposalResponseType1.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCollateralProposalIdentification() {
		return collateralProposalIdentification;
	}

	public CollateralProposalResponseType2 setCollateralProposalIdentification(Max35Text collateralProposalIdentification) {
		this.collateralProposalIdentification = Objects.requireNonNull(collateralProposalIdentification);
		return this;
	}

	public CollateralProposalResponse1Code getType() {
		return type;
	}

	public CollateralProposalResponseType2 setType(CollateralProposalResponse1Code type) {
		this.type = Objects.requireNonNull(type);
		return this;
	}

	public CollateralResponse1 getResponse() {
		return response;
	}

	public CollateralProposalResponseType2 setResponse(CollateralResponse1 response) {
		this.response = Objects.requireNonNull(response);
		return this;
	}
}