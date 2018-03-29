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
import com.tools20022.repository.entity.Party;
import com.tools20022.repository.entity.SecuritiesSettlementPartyRole;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.PartyIdentificationAndAccount147;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Parameters applied to the settlement of a security transfer.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceiversCustodianDetails
 * ReceivingPartiesAndAccount16.mmReceiversCustodianDetails}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceiversIntermediary1Details
 * ReceivingPartiesAndAccount16.mmReceiversIntermediary1Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceiversIntermediary2Details
 * ReceivingPartiesAndAccount16.mmReceiversIntermediary2Details}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16#mmReceivingAgentDetails
 * ReceivingPartiesAndAccount16.mmReceivingAgentDetails}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} =
 * {@linkplain com.tools20022.repository.entity.SecuritiesSettlementPartyRole
 * SecuritiesSettlementPartyRole}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getConstraint
 * constraint} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversCustodianRule#forReceivingPartiesAndAccount16
 * ConstraintReceiversCustodianRule.forReceivingPartiesAndAccount16}</li>
 * <li>
 * {@linkplain com.tools20022.repository.constraints.ConstraintReceiversIntermediary1DetailsRule#forReceivingPartiesAndAccount16
 * ConstraintReceiversIntermediary1DetailsRule.forReceivingPartiesAndAccount16}</li>
 * </ul>
 * </li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "ReceivingPartiesAndAccount16"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} = "Parameters applied to the settlement of a security transfer."</li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3
 * ReceivingPartiesAndAccount3}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "ReceivingPartiesAndAccount16", propOrder = {"receiversCustodianDetails", "receiversIntermediary1Details", "receiversIntermediary2Details", "receivingAgentDetails"})
public class ReceivingPartiesAndAccount16 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RcvrsCtdnDtls")
	protected PartyIdentificationAndAccount147 receiversCustodianDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
	 * PartyIdentificationAndAccount147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
	 * ReceivingPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrsCtdnDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversCustodianDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that acts on behalf of the buyer of securities when the buyer does not have a direct relationship with the receiving agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3#mmReceiversCustodianDetails
	 * ReceivingPartiesAndAccount3.mmReceiversCustodianDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>> mmReceiversCustodianDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmObject();
			isDerived = false;
			xmlTag = "RcvrsCtdnDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversCustodianDetails";
			definition = "Party that acts on behalf of the buyer of securities when the buyer does not have a direct relationship with the receiving agent.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount3.mmReceiversCustodianDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount147.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount147> getValue(ReceivingPartiesAndAccount16 obj) {
			return obj.getReceiversCustodianDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount16 obj, Optional<PartyIdentificationAndAccount147> value) {
			obj.setReceiversCustodianDetails(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvrsIntrmy1Dtls")
	protected PartyIdentificationAndAccount147 receiversIntermediary1Details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
	 * PartyIdentificationAndAccount147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
	 * ReceivingPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrsIntrmy1Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary1Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that the receiver's custodian uses to effect the receipt of a security, when the receiver's custodian does not have a direct relationship with the receiving agent."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3#mmReceiversIntermediaryDetails
	 * ReceivingPartiesAndAccount3.mmReceiversIntermediaryDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>> mmReceiversIntermediary1Details = new MMMessageAssociationEnd<ReceivingPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmObject();
			isDerived = false;
			xmlTag = "RcvrsIntrmy1Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary1Details";
			definition = "Party that the receiver's custodian uses to effect the receipt of a security, when the receiver's custodian does not have a direct relationship with the receiving agent.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount3.mmReceiversIntermediaryDetails;
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount147.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount147> getValue(ReceivingPartiesAndAccount16 obj) {
			return obj.getReceiversIntermediary1Details();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount16 obj, Optional<PartyIdentificationAndAccount147> value) {
			obj.setReceiversIntermediary1Details(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvrsIntrmy2Dtls")
	protected PartyIdentificationAndAccount147 receiversIntermediary2Details;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
	 * PartyIdentificationAndAccount147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
	 * ReceivingPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvrsIntrmy2Dtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceiversIntermediary2Details"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Party that interacts with the receiver’s intermediary 1."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>> mmReceiversIntermediary2Details = new MMMessageAssociationEnd<ReceivingPartiesAndAccount16, Optional<PartyIdentificationAndAccount147>>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmObject();
			isDerived = false;
			xmlTag = "RcvrsIntrmy2Dtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceiversIntermediary2Details";
			definition = "Party that interacts with the receiver’s intermediary 1.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount147.mmObject();
		}

		@Override
		public Optional<PartyIdentificationAndAccount147> getValue(ReceivingPartiesAndAccount16 obj) {
			return obj.getReceiversIntermediary2Details();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount16 obj, Optional<PartyIdentificationAndAccount147> value) {
			obj.setReceiversIntermediary2Details(value.orElse(null));
		}
	};
	@XmlElement(name = "RcvgAgtDtls", required = true)
	protected PartyIdentificationAndAccount147 receivingAgentDetails;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.PartyIdentificationAndAccount147
	 * PartyIdentificationAndAccount147}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.Party#mmIdentification
	 * Party.mmIdentification}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount16
	 * ReceivingPartiesAndAccount16}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RcvgAgtDtls"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ReceivingAgentDetails"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Party that receives securities from the delivering agent at the place of settlement, for example, central securities depository."
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.ReceivingPartiesAndAccount3#mmReceivingAgentDetails
	 * ReceivingPartiesAndAccount3.mmReceivingAgentDetails}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<ReceivingPartiesAndAccount16, PartyIdentificationAndAccount147> mmReceivingAgentDetails = new MMMessageAssociationEnd<ReceivingPartiesAndAccount16, PartyIdentificationAndAccount147>() {
		{
			businessElementTrace_lazy = () -> Party.mmIdentification;
			componentContext_lazy = () -> com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmObject();
			isDerived = false;
			xmlTag = "RcvgAgtDtls";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ReceivingAgentDetails";
			definition = "Party that receives securities from the delivering agent at the place of settlement, for example, central securities depository.";
			previousVersion_lazy = () -> ReceivingPartiesAndAccount3.mmReceivingAgentDetails;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> PartyIdentificationAndAccount147.mmObject();
		}

		@Override
		public PartyIdentificationAndAccount147 getValue(ReceivingPartiesAndAccount16 obj) {
			return obj.getReceivingAgentDetails();
		}

		@Override
		public void setValue(ReceivingPartiesAndAccount16 obj, PartyIdentificationAndAccount147 value) {
			obj.setReceivingAgentDetails(value);
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmReceiversCustodianDetails, com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmReceiversIntermediary1Details,
						com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmReceiversIntermediary2Details, com.tools20022.repository.msg.ReceivingPartiesAndAccount16.mmReceivingAgentDetails);
				trace_lazy = () -> SecuritiesSettlementPartyRole.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				constraint_lazy = () -> Arrays.asList(com.tools20022.repository.constraints.ConstraintReceiversCustodianRule.forReceivingPartiesAndAccount16,
						com.tools20022.repository.constraints.ConstraintReceiversIntermediary1DetailsRule.forReceivingPartiesAndAccount16);
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "ReceivingPartiesAndAccount16";
				definition = "Parameters applied to the settlement of a security transfer.";
				previousVersion_lazy = () -> ReceivingPartiesAndAccount3.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<PartyIdentificationAndAccount147> getReceiversCustodianDetails() {
		return receiversCustodianDetails == null ? Optional.empty() : Optional.of(receiversCustodianDetails);
	}

	public ReceivingPartiesAndAccount16 setReceiversCustodianDetails(PartyIdentificationAndAccount147 receiversCustodianDetails) {
		this.receiversCustodianDetails = receiversCustodianDetails;
		return this;
	}

	public Optional<PartyIdentificationAndAccount147> getReceiversIntermediary1Details() {
		return receiversIntermediary1Details == null ? Optional.empty() : Optional.of(receiversIntermediary1Details);
	}

	public ReceivingPartiesAndAccount16 setReceiversIntermediary1Details(PartyIdentificationAndAccount147 receiversIntermediary1Details) {
		this.receiversIntermediary1Details = receiversIntermediary1Details;
		return this;
	}

	public Optional<PartyIdentificationAndAccount147> getReceiversIntermediary2Details() {
		return receiversIntermediary2Details == null ? Optional.empty() : Optional.of(receiversIntermediary2Details);
	}

	public ReceivingPartiesAndAccount16 setReceiversIntermediary2Details(PartyIdentificationAndAccount147 receiversIntermediary2Details) {
		this.receiversIntermediary2Details = receiversIntermediary2Details;
		return this;
	}

	public PartyIdentificationAndAccount147 getReceivingAgentDetails() {
		return receivingAgentDetails;
	}

	public ReceivingPartiesAndAccount16 setReceivingAgentDetails(PartyIdentificationAndAccount147 receivingAgentDetails) {
		this.receivingAgentDetails = Objects.requireNonNull(receivingAgentDetails);
		return this;
	}
}