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
import com.tools20022.repository.choice.DefinedAttributes1Choice;
import com.tools20022.repository.entity.Interest;
import com.tools20022.repository.entity.SecuritiesTrade;
import com.tools20022.repository.GeneratedRepository;
import com.tools20022.repository.msg.FinancialInstrumentAttributes88;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import java.util.Objects;
import java.util.Optional;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Specifies the obligations of one of the participants to a derivative
 * contract. The obligations may be conceptual or operational only, with
 * settlement of any obligations arising from the derivative contract taking
 * place on a net basis, after the netting of the obligations arising from each
 * leg of the contract.
 * <p>
 * <strong>Constant fields:</strong>
 * <ul>
 * <li>
 * {@linkplain com.tools20022.metamodel.MMMessageElementContainer#getMessageElement
 * messageElement} =
 * <ul>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeUnderlyingLeg1#mmContractAttributes
 * DerivativeUnderlyingLeg1.mmContractAttributes}</li>
 * <li>
 * {@linkplain com.tools20022.repository.msg.DerivativeUnderlyingLeg1#mmDefinedAttributes
 * DerivativeUnderlyingLeg1.mmDefinedAttributes}</li>
 * </ul>
 * </li>
 * <li>{@linkplain com.tools20022.metamodel.MMMessageComponentType#getTrace
 * trace} = {@linkplain com.tools20022.repository.entity.SecuritiesTrade
 * SecuritiesTrade}</li>
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
 * "DerivativeUnderlyingLeg1"</li>
 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
 * definition} =
 * "Specifies the obligations of one of the participants to a derivative contract. The obligations may be conceptual or operational only, with settlement of any obligations arising from the derivative contract taking place on a net basis, after the netting of the obligations arising from each leg of the contract."
 * </li>
 * </ul>
 */
@XmlAccessorType(XmlAccessType.NONE)
@XmlType(name = "DerivativeUnderlyingLeg1", propOrder = {"contractAttributes", "definedAttributes"})
public class DerivativeUnderlyingLeg1 {

	final static private AtomicReference<MMMessageComponent> mmObject_lazy = new AtomicReference<>();
	@XmlElement(name = "CtrctAttrbts", required = true)
	protected FinancialInstrumentAttributes88 contractAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.msg.FinancialInstrumentAttributes88
	 * FinancialInstrumentAttributes88}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getBusinessComponentTrace
	 * businessComponentTrace} =
	 * {@linkplain com.tools20022.repository.entity.Interest Interest}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeUnderlyingLeg1
	 * DerivativeUnderlyingLeg1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "CtrctAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "ContractAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Attributes that relate to the financial instrument (contract) being traded that are common across derivatives.\r\n\r\n"
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DerivativeUnderlyingLeg1, FinancialInstrumentAttributes88> mmContractAttributes = new MMMessageAssociationEnd<DerivativeUnderlyingLeg1, FinancialInstrumentAttributes88>() {
		{
			businessComponentTrace_lazy = () -> Interest.mmObject();
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeUnderlyingLeg1.mmObject();
			isDerived = false;
			xmlTag = "CtrctAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "ContractAttributes";
			definition = "Attributes that relate to the financial instrument (contract) being traded that are common across derivatives.\r\n\r\n";
			maxOccurs = 1;
			minOccurs = 1;
			isComposite = true;
			type_lazy = () -> FinancialInstrumentAttributes88.mmObject();
		}

		@Override
		public FinancialInstrumentAttributes88 getValue(DerivativeUnderlyingLeg1 obj) {
			return obj.getContractAttributes();
		}

		@Override
		public void setValue(DerivativeUnderlyingLeg1 obj, FinancialInstrumentAttributes88 value) {
			obj.setContractAttributes(value);
		}
	};
	@XmlElement(name = "DfndAttrbts")
	protected DefinedAttributes1Choice definedAttributes;
	/**
	 * 
	 <p>
	 * <strong>Constant fields:</strong>
	 * <ul>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageAssociationEnd#getType
	 * type} =
	 * {@linkplain com.tools20022.repository.choice.DefinedAttributes1Choice
	 * DefinedAttributes1Choice}</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMMessageElement#getComponentContext
	 * componentContext} =
	 * {@linkplain com.tools20022.repository.msg.DerivativeUnderlyingLeg1
	 * DerivativeUnderlyingLeg1}</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMMessageConstruct#getXmlTag
	 * xmlTag} = "DfndAttrbts"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getRegistrationStatus
	 * registrationStatus} =
	 * com.tools20022.metamodel.MMRegistrationStatus.PROVISIONALLY_REGISTERED</li>
	 * <li>{@linkplain com.tools20022.metamodel.MMRepositoryConcept#getName
	 * name} = "DefinedAttributes"</li>
	 * <li>
	 * {@linkplain com.tools20022.metamodel.MMRepositoryConcept#getDefinition
	 * definition} =
	 * "Attributes of a derivative that are specific to whether the derivative is a value defined derivative or quantity defined derivative."
	 * </li>
	 * </ul>
	 */
	public static final MMMessageAssociationEnd<DerivativeUnderlyingLeg1, Optional<DefinedAttributes1Choice>> mmDefinedAttributes = new MMMessageAssociationEnd<DerivativeUnderlyingLeg1, Optional<DefinedAttributes1Choice>>() {
		{
			componentContext_lazy = () -> com.tools20022.repository.msg.DerivativeUnderlyingLeg1.mmObject();
			isDerived = false;
			xmlTag = "DfndAttrbts";
			registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
			name = "DefinedAttributes";
			definition = "Attributes of a derivative that are specific to whether the derivative is a value defined derivative or quantity defined derivative.";
			maxOccurs = 1;
			minOccurs = 0;
			isComposite = true;
			type_lazy = () -> DefinedAttributes1Choice.mmObject();
		}

		@Override
		public Optional<DefinedAttributes1Choice> getValue(DerivativeUnderlyingLeg1 obj) {
			return obj.getDefinedAttributes();
		}

		@Override
		public void setValue(DerivativeUnderlyingLeg1 obj, Optional<DefinedAttributes1Choice> value) {
			obj.setDefinedAttributes(value.orElse(null));
		}
	};

	final static public MMMessageComponent mmObject() {
		mmObject_lazy.compareAndSet(null, new MMMessageComponent() {
			{
				messageElement_lazy = () -> Arrays.asList(com.tools20022.repository.msg.DerivativeUnderlyingLeg1.mmContractAttributes, com.tools20022.repository.msg.DerivativeUnderlyingLeg1.mmDefinedAttributes);
				trace_lazy = () -> SecuritiesTrade.mmObject();
				dataDictionary_lazy = () -> GeneratedRepository.dataDict;
				registrationStatus = MMRegistrationStatus.PROVISIONALLY_REGISTERED;
				name = "DerivativeUnderlyingLeg1";
				definition = "Specifies the obligations of one of the participants to a derivative contract. The obligations may be conceptual or operational only, with settlement of any obligations arising from the derivative contract taking place on a net basis, after the netting of the obligations arising from each leg of the contract.";
			}
		});
		return mmObject_lazy.get();
	}

	public FinancialInstrumentAttributes88 getContractAttributes() {
		return contractAttributes;
	}

	public DerivativeUnderlyingLeg1 setContractAttributes(FinancialInstrumentAttributes88 contractAttributes) {
		this.contractAttributes = Objects.requireNonNull(contractAttributes);
		return this;
	}

	public Optional<DefinedAttributes1Choice> getDefinedAttributes() {
		return definedAttributes == null ? Optional.empty() : Optional.of(definedAttributes);
	}

	public DerivativeUnderlyingLeg1 setDefinedAttributes(DefinedAttributes1Choice definedAttributes) {
		this.definedAttributes = definedAttributes;
		return this;
	}
}