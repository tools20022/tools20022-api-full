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
import com.tools20022.repository.choice.FinancialInstrumentQuantity31Choice;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentQuantity4;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Provides information about securities quantity linked to a corporate action
 * option.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4#mmOversubscriptionQuantity
 * SecuritiesQuantityDetailsSD4.mmOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4#mmTotalOversubscriptionQuantity
 * SecuritiesQuantityDetailsSD4.mmTotalOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4#mmInstructionQuantity
 * SecuritiesQuantityDetailsSD4.mmInstructionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4#mmOpenUncoveredQuantity
 * SecuritiesQuantityDetailsSD4.mmOpenUncoveredQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4#mmInterimCoveredQuantity
 * SecuritiesQuantityDetailsSD4.mmInterimCoveredQuantity}</li>
 * </ul>
 * </li>
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
 * "SecuritiesQuantityDetailsSD4"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about securities quantity linked to a corporate action option."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesQuantityDetailsSD4", propOrder = {"oversubscriptionQuantity", "totalOversubscriptionQuantity", "instructionQuantity", "openUncoveredQuantity", "interimCoveredQuantity"})
public class SecuritiesQuantityDetailsSD4 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "OvrsbcptQty")
	protected FinancialInstrumentQuantity4 oversubscriptionQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity4
	 * FinancialInstrumentQuantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4
	 * SecuritiesQuantityDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "For rights subscription events with an oversubscription feature, the quantity of the oversubscription for the given instruction."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity4>> mmOversubscriptionQuantity = new MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionQuantity";
			definition = "For rights subscription events with an oversubscription feature, the quantity of the oversubscription for the given instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity4.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity4> getValue(SecuritiesQuantityDetailsSD4 obj) {
			return obj.getOversubscriptionQuantity();
		}

		@Override
		public void setValue(SecuritiesQuantityDetailsSD4 obj, Optional<FinancialInstrumentQuantity4> value) {
			obj.setOversubscriptionQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "TtlOvrsbcptQty")
	protected FinancialInstrumentQuantity4 totalOversubscriptionQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentQuantity4
	 * FinancialInstrumentQuantity4}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4
	 * SecuritiesQuantityDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "TtlOvrsbcptQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "TotalOversubscriptionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Total oversubscription quantity of all transaction sequence instructions."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity4>> mmTotalOversubscriptionQuantity = new MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity4>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "TtlOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalOversubscriptionQuantity";
			definition = "Total oversubscription quantity of all transaction sequence instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity4.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity4> getValue(SecuritiesQuantityDetailsSD4 obj) {
			return obj.getTotalOversubscriptionQuantity();
		}

		@Override
		public void setValue(SecuritiesQuantityDetailsSD4 obj, Optional<FinancialInstrumentQuantity4> value) {
			obj.setTotalOversubscriptionQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "InstrQty")
	protected FinancialInstrumentQuantity31Choice instructionQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity31Choice
	 * FinancialInstrumentQuantity31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4
	 * SecuritiesQuantityDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "InstrQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InstructionQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Instruction quantity for a given transaction sequence number."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity31Choice>> mmInstructionQuantity = new MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity31Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "InstrQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InstructionQuantity";
			definition = "Instruction quantity for a given transaction sequence number.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity31Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity31Choice> getValue(SecuritiesQuantityDetailsSD4 obj) {
			return obj.getInstructionQuantity();
		}

		@Override
		public void setValue(SecuritiesQuantityDetailsSD4 obj, Optional<FinancialInstrumentQuantity31Choice> value) {
			obj.setInstructionQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "OpnUcvrdQty")
	protected FinancialInstrumentQuantity31Choice openUncoveredQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity31Choice
	 * FinancialInstrumentQuantity31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4
	 * SecuritiesQuantityDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "OpnUcvrdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "OpenUncoveredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity not fully covered."</li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity31Choice>> mmOpenUncoveredQuantity = new MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity31Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "OpnUcvrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OpenUncoveredQuantity";
			definition = "Quantity not fully covered.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity31Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity31Choice> getValue(SecuritiesQuantityDetailsSD4 obj) {
			return obj.getOpenUncoveredQuantity();
		}

		@Override
		public void setValue(SecuritiesQuantityDetailsSD4 obj, Optional<FinancialInstrumentQuantity31Choice> value) {
			obj.setOpenUncoveredQuantity(value.orElse(null));
		}
	};
	@XmlElement(name = "IntrmCvrdQty")
	protected FinancialInstrumentQuantity31Choice interimCoveredQuantity;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.FinancialInstrumentQuantity31Choice
	 * FinancialInstrumentQuantity31Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4
	 * SecuritiesQuantityDetailsSD4}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "IntrmCvrdQty"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "InterimCoveredQuantity"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} = "Quantity covered but transactions not in \"MADE\" status."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity31Choice>> mmInterimCoveredQuantity = new MMMessageAssociationEnd<SecuritiesQuantityDetailsSD4, Optional<FinancialInstrumentQuantity31Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmObject();
			isDerived = false;
			xmlTag = "IntrmCvrdQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "InterimCoveredQuantity";
			definition = "Quantity covered but transactions not in \"MADE\" status.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentQuantity31Choice.mmObject();
		}

		@Override
		public Optional<FinancialInstrumentQuantity31Choice> getValue(SecuritiesQuantityDetailsSD4 obj) {
			return obj.getInterimCoveredQuantity();
		}

		@Override
		public void setValue(SecuritiesQuantityDetailsSD4 obj, Optional<FinancialInstrumentQuantity31Choice> value) {
			obj.setInterimCoveredQuantity(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmOversubscriptionQuantity, com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmTotalOversubscriptionQuantity,
						com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmInstructionQuantity, com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmOpenUncoveredQuantity,
						com.tools20022.repository.msg.SecuritiesQuantityDetailsSD4.mmInterimCoveredQuantity);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuantityDetailsSD4";
				definition = "Provides information about securities quantity linked to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantity4> getOversubscriptionQuantity() {
		return oversubscriptionQuantity == null ? Optional.empty() : Optional.of(oversubscriptionQuantity);
	}

	public SecuritiesQuantityDetailsSD4 setOversubscriptionQuantity(FinancialInstrumentQuantity4 oversubscriptionQuantity) {
		this.oversubscriptionQuantity = oversubscriptionQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity4> getTotalOversubscriptionQuantity() {
		return totalOversubscriptionQuantity == null ? Optional.empty() : Optional.of(totalOversubscriptionQuantity);
	}

	public SecuritiesQuantityDetailsSD4 setTotalOversubscriptionQuantity(FinancialInstrumentQuantity4 totalOversubscriptionQuantity) {
		this.totalOversubscriptionQuantity = totalOversubscriptionQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity31Choice> getInstructionQuantity() {
		return instructionQuantity == null ? Optional.empty() : Optional.of(instructionQuantity);
	}

	public SecuritiesQuantityDetailsSD4 setInstructionQuantity(FinancialInstrumentQuantity31Choice instructionQuantity) {
		this.instructionQuantity = instructionQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity31Choice> getOpenUncoveredQuantity() {
		return openUncoveredQuantity == null ? Optional.empty() : Optional.of(openUncoveredQuantity);
	}

	public SecuritiesQuantityDetailsSD4 setOpenUncoveredQuantity(FinancialInstrumentQuantity31Choice openUncoveredQuantity) {
		this.openUncoveredQuantity = openUncoveredQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity31Choice> getInterimCoveredQuantity() {
		return interimCoveredQuantity == null ? Optional.empty() : Optional.of(interimCoveredQuantity);
	}

	public SecuritiesQuantityDetailsSD4 setInterimCoveredQuantity(FinancialInstrumentQuantity31Choice interimCoveredQuantity) {
		this.interimCoveredQuantity = interimCoveredQuantity;
		return this;
	}
}