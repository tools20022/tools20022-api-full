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
 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3#mmOversubscriptionQuantity
 * SecuritiesQuantityDetailsSD3.mmOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3#mmTotalOversubscriptionQuantity
 * SecuritiesQuantityDetailsSD3.mmTotalOversubscriptionQuantity}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3#mmInstructionQuantity
 * SecuritiesQuantityDetailsSD3.mmInstructionQuantity}</li>
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
 * "SecuritiesQuantityDetailsSD3"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Provides information about securities quantity linked to a corporate action option."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "SecuritiesQuantityDetailsSD3", propOrder = {"oversubscriptionQuantity", "totalOversubscriptionQuantity", "instructionQuantity"})
public class SecuritiesQuantityDetailsSD3 {

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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3
	 * SecuritiesQuantityDetailsSD3}</li>
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
	public static final MMMessageAssociationEnd mmOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "OvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "OversubscriptionQuantity";
			definition = "For rights subscription events with an oversubscription feature, the quantity of the oversubscription for the given instruction.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3
	 * SecuritiesQuantityDetailsSD3}</li>
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
	public static final MMMessageAssociationEnd mmTotalOversubscriptionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3.mmObject();
			isDerived = false;
			xmlTag = "TtlOvrsbcptQty";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "TotalOversubscriptionQuantity";
			definition = "Total oversubscription quantity of all transaction sequence instructions.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> com.tools20022.repository.msg.FinancialInstrumentQuantity4.mmObject();
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
	 * {@linkplain com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3
	 * SecuritiesQuantityDetailsSD3}</li>
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
	public static final MMMessageAssociationEnd mmInstructionQuantity = new MMMessageAssociationEnd() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3.mmObject();
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
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3.mmOversubscriptionQuantity, com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3.mmTotalOversubscriptionQuantity,
						com.tools20022.repository.msg.SecuritiesQuantityDetailsSD3.mmInstructionQuantity);
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.REGISTERED;
				name = "SecuritiesQuantityDetailsSD3";
				definition = "Provides information about securities quantity linked to a corporate action option.";
			}
		});
		return mmObject_lazy.get();
	}

	public Optional<FinancialInstrumentQuantity4> getOversubscriptionQuantity() {
		return oversubscriptionQuantity == null ? Optional.empty() : Optional.of(oversubscriptionQuantity);
	}

	public SecuritiesQuantityDetailsSD3 setOversubscriptionQuantity(com.tools20022.repository.msg.FinancialInstrumentQuantity4 oversubscriptionQuantity) {
		this.oversubscriptionQuantity = oversubscriptionQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity4> getTotalOversubscriptionQuantity() {
		return totalOversubscriptionQuantity == null ? Optional.empty() : Optional.of(totalOversubscriptionQuantity);
	}

	public SecuritiesQuantityDetailsSD3 setTotalOversubscriptionQuantity(com.tools20022.repository.msg.FinancialInstrumentQuantity4 totalOversubscriptionQuantity) {
		this.totalOversubscriptionQuantity = totalOversubscriptionQuantity;
		return this;
	}

	public Optional<FinancialInstrumentQuantity31Choice> getInstructionQuantity() {
		return instructionQuantity == null ? Optional.empty() : Optional.of(instructionQuantity);
	}

	public SecuritiesQuantityDetailsSD3 setInstructionQuantity(FinancialInstrumentQuantity31Choice instructionQuantity) {
		this.instructionQuantity = instructionQuantity;
		return this;
	}
}