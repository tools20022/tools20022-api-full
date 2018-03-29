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
import com.tools20022.repository.choice.RepurchaseAgreementType1Choice;
import com.tools20022.repository.datatype.LEIIdentifier;
import com.tools20022.repository.entity.PartyIdentificationInformation;
import com.tools20022.repository.entity.RepurchaseAgreement;
import com.tools20022.repository.entity.SecuritiesFinancing;
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
 * Agreement between two parties to sell a financial instrument or set of
 * financial instruments and repurchase such instruments at an agreed future
 * date.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement3#mmRepurchaseAgreementType
 * RepurchaseAgreement3.mmRepurchaseAgreementType}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement3#mmTripartyAgent
 * RepurchaseAgreement3.mmTripartyAgent}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.RepurchaseAgreement
 * RepurchaseAgreement}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMTopLevelDictionaryEntry#getDataDictionary
 * dataDictionary} =
 * {@linkplain com.tools20022.repository.GeneratedRepository#dataDict
 * GeneratedRepository.dataDict}</li>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
 * registrationStatus} =
 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName name} =
 * "RepurchaseAgreement3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase such instruments at an agreed future date."
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
 * previousVersion} =
 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2
 * RepurchaseAgreement2}</li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "RepurchaseAgreement3", propOrder = {"repurchaseAgreementType", "tripartyAgent"})
public class RepurchaseAgreement3 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "RpAgrmtTp", required = true)
	protected RepurchaseAgreementType1Choice repurchaseAgreementType;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.RepurchaseAgreementType1Choice
	 * RepurchaseAgreementType1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.SecuritiesFinancing#mmType
	 * SecuritiesFinancing.mmType}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement3
	 * RepurchaseAgreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "RpAgrmtTp"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "RepurchaseAgreementType"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Indicates whether the repo is a general collateral repo or specific repo.\r\n\r\n"
	 * </li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmRepurchaseAgreementType
	 * RepurchaseAgreement2.mmRepurchaseAgreementType}</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<RepurchaseAgreement3, RepurchaseAgreementType1Choice> mmRepurchaseAgreementType = new MMMessageAssociationEnd<RepurchaseAgreement3, RepurchaseAgreementType1Choice>() {
		{
			businessElementTrace_lazy = () -> SecuritiesFinancing.mmType;
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreement3.mmObject();
			isDerived = false;
			xmlTag = "RpAgrmtTp";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "RepurchaseAgreementType";
			definition = "Indicates whether the repo is a general collateral repo or specific repo.\r\n\r\n";
			previousVersion_lazy = () -> RepurchaseAgreement2.mmRepurchaseAgreementType;
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> RepurchaseAgreementType1Choice.mmObject();
		}

		@Override
		public RepurchaseAgreementType1Choice getValue(RepurchaseAgreement3 obj) {
			return obj.getRepurchaseAgreementType();
		}

		@Override
		public void setValue(RepurchaseAgreement3 obj, RepurchaseAgreementType1Choice value) {
			obj.setRepurchaseAgreementType(value);
		}
	};
	@XmlElement(name = "TrptyAgt")
	protected LEIIdentifier tripartyAgent;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageAttribute#getSimpleType
	 * simpleType} =
	 * {@linkplain com.tools20022.repository.datatype.LEIIdentifier
	 * LEIIdentifier}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessElementTrace
	 * businessElementTrace} =
	 * {@linkplain com.tools20022.repository.entity.PartyIdentificationInformation#mmLEI
	 * PartyIdentificationInformation.mmLEI}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement3
	 * RepurchaseAgreement3}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TrptyAgt"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TripartyAgent"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Identifier for triparty agent if applicable.\r\n\r\n"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMModelEntity#getPreviousVersion
	 * previousVersion} =
	 * {@linkplain com.tools20022.repository.msg.RepurchaseAgreement2#mmTripartyAgentIdentification
	 * RepurchaseAgreement2.mmTripartyAgentIdentification}</li>
	 * </ul>
	 */
	public static final MMMessageAttribute<RepurchaseAgreement3, Optional<LEIIdentifier>> mmTripartyAgent = new MMMessageAttribute<RepurchaseAgreement3, Optional<LEIIdentifier>>() {
		{
			businessElementTrace_lazy = () -> PartyIdentificationInformation.mmLEI;
			componentContext_lazy = () -> com.tools20022.repository.msg.RepurchaseAgreement3.mmObject();
			isDerived = false;
			xmlTag = "TrptyAgt";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TripartyAgent";
			definition = "Identifier for triparty agent if applicable.\r\n\r\n";
			previousVersion_lazy = () -> RepurchaseAgreement2.mmTripartyAgentIdentification;
			maxOccurs = 1;
			minOccurs = 0;
			simpleType_lazy = () -> LEIIdentifier.mmObject();
		}

		@Override
		public Optional<LEIIdentifier> getValue(RepurchaseAgreement3 obj) {
			return obj.getTripartyAgent();
		}

		@Override
		public void setValue(RepurchaseAgreement3 obj, Optional<LEIIdentifier> value) {
			obj.setTripartyAgent(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.RepurchaseAgreement3.mmRepurchaseAgreementType, com.tools20022.repository.msg.RepurchaseAgreement3.mmTripartyAgent);
				trace_lazy = () -> RepurchaseAgreement.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "RepurchaseAgreement3";
				definition = "Agreement between two parties to sell a financial instrument or set of financial instruments and repurchase such instruments at an agreed future date.";
				previousVersion_lazy = () -> RepurchaseAgreement2.mmObject();
			}
		});
		return mmObject_lazy.get();
	}

	public RepurchaseAgreementType1Choice getRepurchaseAgreementType() {
		return repurchaseAgreementType;
	}

	public RepurchaseAgreement3 setRepurchaseAgreementType(RepurchaseAgreementType1Choice repurchaseAgreementType) {
		this.repurchaseAgreementType = Objects.requireNonNull(repurchaseAgreementType);
		return this;
	}

	public Optional<LEIIdentifier> getTripartyAgent() {
		return tripartyAgent == null ? Optional.empty() : Optional.of(tripartyAgent);
	}

	public RepurchaseAgreement3 setTripartyAgent(LEIIdentifier tripartyAgent) {
		this.tripartyAgent = tripartyAgent;
		return this;
	}
}