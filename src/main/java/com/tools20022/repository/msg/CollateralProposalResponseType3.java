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
import com.tools20022.repository.codeset.CollateralProposalResponse1Code;
import com.tools20022.repository.datatype.Max35Text;
import com.tools20022.repository.entity.CollateralProposal;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

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
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmCollateralProposalIdentification
 * CollateralProposalResponseType3.mmCollateralProposalIdentification}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmType
 * CollateralProposalResponseType3.mmType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3#mmResponse
 * CollateralProposalResponseType3.mmResponse}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.CollateralProposal
 * CollateralProposal}</li>
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
 * "CollateralProposalResponseType3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Provides details on the response for a collateral proposal."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2
 * CollateralProposalResponseType2}</li>
 * </ul>
 */
public class CollateralProposalResponseType3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	protected Max35Text collateralProposalIdentification;
	/**
	 * Unique identifier for a collateral proposal.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} = {@linkplain com.tools20022.repository.datatype.Max35Text
	 * Max35Text}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3
	 * CollateralProposalResponseType3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmCollateralProposalIdentification
	 * CollateralProposalResponseType2.mmCollateralProposalIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmCollateralProposalIdentification = new MMMessageAttribute() {
		{
			componentContext_lazy = () -> CollateralProposalResponseType3.mmObject();
			isDerived = false;
			xmlTag = "CollPrpslId";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "CollateralProposalIdentification";
			definition = "Unique identifier for a collateral proposal.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType2.mmCollateralProposalIdentification;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> Max35Text.mmObject();
		}
	};
	protected CollateralProposalResponse1Code type;
	/**
	 * Indicates whether the collateral proposal is an initial or a counter
	 * proposal.
	 * <p>
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
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3
	 * CollateralProposalResponseType3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmType
	 * CollateralProposalResponseType2.mmType}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute mmType = new MMMessageAttribute() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmResponseType;
			componentContext_lazy = () -> CollateralProposalResponseType3.mmObject();
			isDerived = false;
			xmlTag = "Tp";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Type";
			definition = "Indicates whether the collateral proposal is an initial or a counter proposal.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType2.mmType;
			maxOccurs = 1;
			minOccurs = 1;
			simpleType_lazy = () -> CollateralProposalResponse1Code.mmObject();
		}
	};
	protected CollateralResponse2 response;
	/**
	 * Provides response details for each of the proposed collateral pieces.
	 * <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} = {@linkplain com.tools20022.repository.msg.CollateralResponse2
	 * CollateralResponse2}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.CollateralProposal#mmProposedCollateralMovement
	 * CollateralProposal.mmProposedCollateralMovement}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType3
	 * CollateralProposalResponseType3}</li>
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
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.CollateralProposalResponseType2#mmResponse
	 * CollateralProposalResponseType2.mmResponse}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd mmResponse = new MMMessageAssociationEnd() {
		{
			businessElementTrace_lazy = () -> com.tools20022.repository.entity.CollateralProposal.mmProposedCollateralMovement;
			componentContext_lazy = () -> CollateralProposalResponseType3.mmObject();
			isDerived = false;
			xmlTag = "Rspn";
			registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "Response";
			definition = "Provides response details for each of the proposed collateral pieces.";
			previousVersion_lazy = () -> com.tools20022.repository.msg.CollateralProposalResponseType2.mmResponse;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.CollateralResponse2.mmObject();
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.CollateralProposalResponseType3.mmCollateralProposalIdentification, com.tools20022.repository.msg.CollateralProposalResponseType3.mmType,
						com.tools20022.repository.msg.CollateralProposalResponseType3.mmResponse);
				trace_lazy = () -> CollateralProposal.mmObject();
				dataDictionary_lazy = () -> com.tools20022.repository.GeneratedRepository.mmdataDict;
				registrationStatus = com.tools20022.metamodel.MMRegistrationStatus.REGISTERED;
				name = "CollateralProposalResponseType3";
				definition = "Provides details on the response for a collateral proposal.";
				previousVersion_lazy = () -> CollateralProposalResponseType2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Max35Text getCollateralProposalIdentification() {
		return collateralProposalIdentification;
	}

	public void setCollateralProposalIdentification(Max35Text collateralProposalIdentification) {
		this.collateralProposalIdentification = collateralProposalIdentification;
	}

	public CollateralProposalResponse1Code getType() {
		return type;
	}

	public void setType(CollateralProposalResponse1Code type) {
		this.type = type;
	}

	public CollateralResponse2 getResponse() {
		return response;
	}

	public void setResponse(com.tools20022.repository.msg.CollateralResponse2 response) {
		this.response = response;
	}
}